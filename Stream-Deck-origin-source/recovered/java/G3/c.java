package G3;

import C6.G;
import C6.r;
import P2.Lsk.mHPawN;
import Q6.o;
import Z2.p;
import android.app.Activity;
import com.elgato.streamdeck.vsd2.AppMetrics;
import com.elgato.streamdeck.vsd2.AppSettings;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.google.protobuf.Timestamp;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppSettingsStore f2718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f2719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U4.c f2720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f2721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z2.j f2722e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2725c;

        public a() {
            this(0, 0, 0, 7, null);
        }

        public final int a() {
            return this.f2723a;
        }

        public final int b() {
            return this.f2724b;
        }

        public final int c() {
            return this.f2725c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2723a == aVar.f2723a && this.f2724b == aVar.f2724b && this.f2725c == aVar.f2725c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f2723a) * 31) + Integer.hashCode(this.f2724b)) * 31) + Integer.hashCode(this.f2725c);
        }

        public String toString() {
            return "RatingConstraints(daysAfterInstall=" + this.f2723a + ", daysAfterRate=" + this.f2724b + ", secondsConnected=" + this.f2725c + ")";
        }

        public a(int i8, int i9, int i10) {
            this.f2723a = i8;
            this.f2724b = i9;
            this.f2725c = i10;
        }

        public /* synthetic */ a(int i8, int i9, int i10, int i11, AbstractC2633k abstractC2633k) {
            this((i11 & 1) != 0 ? 1 : i8, (i11 & 2) != 0 ? 31 : i9, (i11 & 4) != 0 ? 900 : i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2726a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f2728c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f2729a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AppMetrics.Builder invoke(AppMetrics.Builder builder) {
                t.g(builder, mHPawN.cOSukvEJRneDI);
                AppMetrics.Builder lastReviewRequestVersion = builder.setLastReviewRequest(P3.f.d()).setLastReviewRequestVersion("2.1.2");
                t.f(lastReviewRequestVersion, "setLastReviewRequestVersion(...)");
                return lastReviewRequestVersion;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, G6.d dVar) {
            super(2, dVar);
            this.f2728c = activity;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new b(this.f2728c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:48:0x012c  */
        /* JADX WARN: Code duplicated, block: B:49:0x012d A[Catch: Exception -> 0x001b, a -> 0x001e, TRY_LEAVE, TryCatch #2 {a -> 0x001e, Exception -> 0x001b, blocks: (B:8:0x0016, B:16:0x0029, B:49:0x012d, B:17:0x002e, B:46:0x011a, B:40:0x00d9, B:42:0x0108, B:43:0x010b), top: B:60:0x000c }] */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
        
            if (r13.updateAppMetrics(r1, r12) == r0) goto L51;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            U4.c cVar;
            Activity activity;
            Object objF = H6.c.f();
            int i8 = this.f2726a;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    AppSettingsStore appSettingsStore = c.this.f2718a;
                    this.f2726a = 1;
                    obj = appSettingsStore.get(this);
                    if (obj != objF) {
                    }
                    return objF;
                }
                if (i8 == 1) {
                    r.b(obj);
                } else {
                    if (i8 == 2) {
                        r.b(obj);
                        cVar = c.this.f2720c;
                        activity = this.f2728c;
                        this.f2726a = 3;
                        if (T4.a.a(cVar, activity, (U4.b) obj, this) == objF) {
                            AppSettingsStore appSettingsStore2 = c.this.f2718a;
                            a aVar = a.f2729a;
                            this.f2726a = 4;
                        }
                        return objF;
                    }
                    if (i8 == 3) {
                        r.b(obj);
                        AppSettingsStore appSettingsStore3 = c.this.f2718a;
                        a aVar2 = a.f2729a;
                        this.f2726a = 4;
                    } else {
                        if (i8 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                }
                return G.f1419a;
                AppMetrics appMetrics = ((AppSettings) obj).getAppMetrics();
                Z2.j jVar = c.this.f2722e;
                t.d(appMetrics);
                String str = "Attempting rating with " + d.b(appMetrics);
                String strC = jVar.c();
                p pVar = p.Debug;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, str);
                }
                Timestamp installedAt = appMetrics.getInstalledAt();
                t.f(installedAt, "getInstalledAt(...)");
                if (P3.h.a(installedAt) < c.this.f2721d.a()) {
                    return G.f1419a;
                }
                if (appMetrics.getConnectionDurationSeconds() < c.this.f2721d.c()) {
                    return G.f1419a;
                }
                if (appMetrics.hasLastReviewRequest()) {
                    Timestamp lastReviewRequest = appMetrics.getLastReviewRequest();
                    t.f(lastReviewRequest, "getLastReviewRequest(...)");
                    if (P3.h.a(lastReviewRequest) < c.this.f2721d.b()) {
                        return G.f1419a;
                    }
                }
                Z2.j jVar2 = c.this.f2722e;
                String str2 = "Requesting rating with " + d.b(appMetrics);
                String strC2 = jVar2.c();
                p pVar2 = p.Info;
                if (jVar2.a().a().compareTo(pVar2) <= 0) {
                    jVar2.b(pVar2, strC2, null, str2);
                }
                U4.c cVar2 = c.this.f2720c;
                this.f2726a = 2;
                obj = T4.a.b(cVar2, this);
                if (obj != objF) {
                    cVar = c.this.f2720c;
                    activity = this.f2728c;
                    this.f2726a = 3;
                    if (T4.a.a(cVar, activity, (U4.b) obj, this) == objF) {
                        AppSettingsStore appSettingsStore4 = c.this.f2718a;
                        a aVar3 = a.f2729a;
                        this.f2726a = 4;
                    }
                }
                return objF;
            } catch (U4.a e8) {
                V3.f.b(new V3.g.c(e8));
                Z2.j jVar3 = c.this.f2722e;
                String str3 = "Error while fetching review info: " + e8;
                String strC3 = jVar3.c();
                p pVar3 = p.Error;
                if (jVar3.a().a().compareTo(pVar3) <= 0) {
                    jVar3.b(pVar3, strC3, null, str3);
                }
            } catch (Exception e9) {
                V3.f.b(new V3.g.c(e9));
                Z2.j jVar4 = c.this.f2722e;
                String str4 = "Error while launching review flow: " + e9;
                String strC4 = jVar4.c();
                p pVar4 = p.Error;
                if (jVar4.a().a().compareTo(pVar4) <= 0) {
                    jVar4.b(pVar4, strC4, null, str4);
                }
            }
        }
    }

    public c(AppSettingsStore settingsStore, J coroutineScope, U4.c reviewManager, a constraints) {
        t.g(settingsStore, "settingsStore");
        t.g(coroutineScope, "coroutineScope");
        t.g(reviewManager, "reviewManager");
        t.g(constraints, "constraints");
        this.f2718a = settingsStore;
        this.f2719b = coroutineScope;
        this.f2720c = reviewManager;
        this.f2721d = constraints;
        this.f2722e = Z2.j.f12858c.d("AppRatingManager");
    }

    public final InterfaceC1815v0 e(Activity activity) {
        t.g(activity, "activity");
        return AbstractC1789i.d(this.f2719b, null, null, new b(activity, null), 3, null);
    }

    public /* synthetic */ c(AppSettingsStore appSettingsStore, J j8, U4.c cVar, a aVar, int i8, AbstractC2633k abstractC2633k) {
        if ((i8 & 8) != 0) {
            aVar = new a(0, 0, 0, 7, null);
        }
        this(appSettingsStore, j8, cVar, aVar);
    }
}
