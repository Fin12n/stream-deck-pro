package G3;

import C6.G;
import C6.r;
import Q6.o;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p035d7.v;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f2750c;

        /* JADX INFO: renamed from: G3.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0119a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ConnectivityManager f2751a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f2752b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0119a(ConnectivityManager connectivityManager, b bVar) {
                super(0);
                this.f2751a = connectivityManager;
                this.f2752b = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m59invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m59invoke() {
                this.f2751a.unregisterNetworkCallback(this.f2752b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v f2753a;

            public b(v vVar) {
                this.f2753a = vVar;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                t.g(network, "network");
                this.f2753a.m(Boolean.TRUE);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                t.g(network, "network");
                this.f2753a.m(Boolean.FALSE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, G6.d dVar) {
            super(2, dVar);
            this.f2750c = context;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = new a(this.f2750c, dVar);
            aVar.f2749b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, G6.d dVar) {
            return ((a) create(vVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f2748a;
            if (i8 == 0) {
                r.b(obj);
                v vVar = (v) this.f2749b;
                Object systemService = this.f2750c.getSystemService("connectivity");
                t.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                b bVar = new b(vVar);
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), bVar);
                C0119a c0119a = new C0119a(connectivityManager, bVar);
                this.f2748a = 1;
                if (p035d7.t.a(vVar, c0119a, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    public static final R3.a a(Context context, J scope) {
        t.g(context, "context");
        t.g(scope, "scope");
        return new i(context, scope);
    }

    public static final InterfaceC2260f b(Context context) {
        t.g(context, "<this>");
        return AbstractC2262h.e(new a(context, null));
    }
}
