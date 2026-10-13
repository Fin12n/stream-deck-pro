package com.revenuecat.purchases.common;

import C6.G;
import W6.l;
import W6.n;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class Dispatcher {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final double INTEGRATION_TEST_DELAY_PERCENTAGE = 0.01d;
    private final ExecutorService executorService;
    private final Handler mainHandler;
    private final boolean runningIntegrationTests;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class AsyncCall implements Runnable {
        public abstract HTTPResult call();

        public void onCompletion(HTTPResult result) {
            t.g(result, "result");
        }

        public void onError(PurchasesError error) {
            t.g(error, "error");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onCompletion(call());
            } catch (SignatureVerificationException e8) {
                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e8);
                LogUtilsKt.errorLog(purchasesError);
                onError(purchasesError);
            } catch (IOException e9) {
                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e9);
                LogUtilsKt.errorLog(purchasesError2);
                onError(purchasesError2);
            } catch (SecurityException e10) {
                PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(e10);
                LogUtilsKt.errorLog(purchasesError3);
                onError(purchasesError3);
            } catch (JSONException e11) {
                PurchasesError purchasesError4 = ErrorsKt.toPurchasesError(e11);
                LogUtilsKt.errorLog(purchasesError4);
                onError(purchasesError4);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        private Companion() {
        }
    }

    public Dispatcher(ExecutorService executorService, Handler handler, boolean z8) {
        t.g(executorService, "executorService");
        this.executorService = executorService;
        this.mainHandler = handler;
        this.runningIntegrationTests = z8;
    }

    public static /* synthetic */ void enqueue$default(Dispatcher dispatcher, Runnable runnable, Delay delay, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i8 & 2) != 0) {
            delay = Delay.NONE;
        }
        dispatcher.enqueue(runnable, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$2$lambda$1(Runnable command, Dispatcher this$0) {
        t.g(command, "$command");
        t.g(this$0, "this$0");
        try {
            command.run();
        } catch (Exception e8) {
            LogUtilsKt.errorLog$default("Exception running command: " + e8, null, 2, null);
            Handler handler = this$0.mainHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.revenuecat.purchases.common.a
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        Dispatcher.enqueue$lambda$2$lambda$1$lambda$0(e8);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$2$lambda$1$lambda$0(Exception e8) throws Exception {
        t.g(e8, "$e");
        throw e8;
    }

    public void close() {
        synchronized (this.executorService) {
            this.executorService.shutdownNow();
        }
    }

    public void enqueue(final Runnable command, Delay delay) {
        t.g(command, "command");
        t.g(delay, "delay");
        synchronized (this.executorService) {
            try {
                if (!this.executorService.isShutdown()) {
                    Runnable runnable = new Runnable() { // from class: com.revenuecat.purchases.common.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            Dispatcher.enqueue$lambda$2$lambda$1(command, this);
                        }
                    };
                    if (delay == Delay.NONE || !(this.executorService instanceof ScheduledExecutorService)) {
                        this.executorService.submit(runnable);
                    } else {
                        long jR = n.r(new l(p008a7.a.z(delay.m154getMinDelayUwyO8pc()), p008a7.a.z(delay.m153getMaxDelayUwyO8pc())), U6.c.f10243a);
                        if (this.runningIntegrationTests) {
                            jR = (long) (jR * 0.01d);
                        }
                        ((ScheduledExecutorService) this.executorService).schedule(runnable, jR, TimeUnit.MILLISECONDS);
                    }
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.executorService) {
            zIsShutdown = this.executorService.isShutdown();
        }
        return zIsShutdown;
    }

    public /* synthetic */ Dispatcher(ExecutorService executorService, Handler handler, boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this(executorService, (i8 & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i8 & 4) != 0 ? false : z8);
    }
}
