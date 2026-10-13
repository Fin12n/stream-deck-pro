package com.revenuecat.purchases.google.usecase;

import C6.G;
import Q6.k;
import Q6.o;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResponse;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BillingClientUseCase<T> {
    private final boolean backoffForNetworkErrors;
    private final o executeRequestOnUIThread;
    private final int maxRetries;
    private final k onError;
    private int retryAttempt;
    private long retryBackoff;
    private final UseCaseParams useCaseParams;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$processResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class AnonymousClass1 extends C2639q implements k {
        public AnonymousClass1(Object obj) {
            super(1, obj, BillingClientUseCase.class, "onOk", "onOk(Ljava/lang/Object;)V", 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m172invoke(obj);
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m172invoke(T t8) {
            ((BillingClientUseCase) this.receiver).onOk(t8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$processResult$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class AnonymousClass2 extends C2639q implements k {
        public AnonymousClass2(Object obj) {
            super(1, obj, BillingClientUseCase.class, "forwardError", "forwardError(Lcom/android/billingclient/api/BillingResult;)V", 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.android.billingclient.api.d) obj);
            return G.f1419a;
        }

        public final void invoke(com.android.billingclient.api.d p8) {
            t.g(p8, "p0");
            ((BillingClientUseCase) this.receiver).forwardError(p8);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$run$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21891 extends u implements k {
        final /* synthetic */ BillingClientUseCase<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21891(BillingClientUseCase<T> billingClientUseCase) {
            super(1);
            this.this$0 = billingClientUseCase;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G.f1419a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                this.this$0.executeAsync();
            } else {
                ((BillingClientUseCase) this.this$0).onError.invoke(purchasesError);
            }
        }
    }

    public BillingClientUseCase(UseCaseParams useCaseParams, k onError, o executeRequestOnUIThread) {
        t.g(useCaseParams, "useCaseParams");
        t.g(onError, "onError");
        t.g(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onError = onError;
        this.executeRequestOnUIThread = executeRequestOnUIThread;
        this.maxRetries = 3;
        this.retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
    }

    private final void backoffOrErrorIfServiceUnavailable(k kVar, com.android.billingclient.api.d dVar) {
        LogIntent logIntent = LogIntent.GOOGLE_WARNING;
        String str = String.format(BillingStrings.BILLING_SERVICE_UNAVAILABLE, Arrays.copyOf(new Object[]{Boolean.valueOf(this.useCaseParams.getAppInBackground())}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        if (p008a7.a.m(this.retryBackoff, this.useCaseParams.getAppInBackground() ? BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME() : BillingClientUseCaseKt.getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND()) < 0) {
            retryWithBackoff();
        } else {
            kVar.invoke(dVar);
        }
    }

    private final void backoffOrRetryNetworkError(k kVar, com.android.billingclient.api.d dVar) {
        int i8;
        if (getBackoffForNetworkErrors() && p008a7.a.m(this.retryBackoff, BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME()) < 0) {
            retryWithBackoff();
        } else if (getBackoffForNetworkErrors() || (i8 = this.retryAttempt) >= this.maxRetries) {
            kVar.invoke(dVar);
        } else {
            this.retryAttempt = i8 + 1;
            executeAsync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardError(com.android.billingclient.api.d dVar) {
        String str = getErrorMessage() + " - " + BillingResultExtensionsKt.toHumanReadableDescription(dVar);
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, str);
        k kVar = this.onError;
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(dVar.b(), str);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        kVar.invoke(purchasesErrorBillingResponseToPurchasesError);
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        t.f(string, "stringWriter.toString()");
        return string;
    }

    public static /* synthetic */ void processResult$default(BillingClientUseCase billingClientUseCase, com.android.billingclient.api.d dVar, Object obj, k kVar, k kVar2, int i8, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processResult");
        }
        if ((i8 & 4) != 0) {
            kVar = new AnonymousClass1(billingClientUseCase);
        }
        if ((i8 & 8) != 0) {
            kVar2 = new AnonymousClass2(billingClientUseCase);
        }
        billingClientUseCase.processResult(dVar, obj, kVar, kVar2);
    }

    private final void retryWithBackoff() {
        long j8 = this.retryBackoff;
        this.retryBackoff = DurationExtensionsKt.m157minQTBD994(p008a7.a.P(j8, 2), BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME());
        run(p008a7.a.z(j8));
    }

    public static /* synthetic */ void run$default(BillingClientUseCase billingClientUseCase, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        if ((i8 & 1) != 0) {
            j8 = 0;
        }
        billingClientUseCase.run(j8);
    }

    public abstract void executeAsync();

    public boolean getBackoffForNetworkErrors() {
        return this.backoffForNetworkErrors;
    }

    public abstract String getErrorMessage();

    public final o getExecuteRequestOnUIThread() {
        return this.executeRequestOnUIThread;
    }

    public abstract void onOk(T t8);

    public final void processResult(com.android.billingclient.api.d billingResult, T t8, k onSuccess, k onError) {
        t.g(billingResult, "billingResult");
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        BillingResponse billingResponseFromCode = BillingResponse.Companion.fromCode(billingResult.b());
        if (t.c(billingResponseFromCode, BillingResponse.OK.INSTANCE)) {
            this.retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
            onSuccess.invoke(t8);
            return;
        }
        if (t.c(billingResponseFromCode, BillingResponse.ServiceDisconnected.INSTANCE)) {
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, BillingStrings.BILLING_SERVICE_DISCONNECTED);
            run$default(this, 0L, 1, null);
        } else {
            if (t.c(billingResponseFromCode, BillingResponse.ServiceUnavailable.INSTANCE)) {
                backoffOrErrorIfServiceUnavailable(onError, billingResult);
                return;
            }
            if (t.c(billingResponseFromCode, BillingResponse.NetworkError.INSTANCE) ? true : t.c(billingResponseFromCode, BillingResponse.Error.INSTANCE)) {
                backoffOrRetryNetworkError(onError, billingResult);
            } else {
                onError.invoke(billingResult);
            }
        }
    }

    public final void run(long j8) {
        this.executeRequestOnUIThread.invoke(Long.valueOf(j8), new C21891(this));
    }

    public final void withConnectedClient(com.android.billingclient.api.a aVar, k receivingFunction) {
        t.g(receivingFunction, "receivingFunction");
        G g8 = null;
        if (aVar != null) {
            if (!aVar.f()) {
                aVar = null;
            }
            if (aVar != null) {
                receivingFunction.invoke(aVar);
                g8 = G.f1419a;
            }
        }
        if (g8 == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            String str = String.format(BillingStrings.BILLING_CLIENT_DISCONNECTED, Arrays.copyOf(new Object[]{getStackTrace()}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }
}
