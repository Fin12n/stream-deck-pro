package M5;

import C6.G;
import p017b7.AbstractC1823z0;
import p017b7.InterfaceC1776b0;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L7.a f5729a = p157r6.a.a("io.ktor.client.plugins.HttpRequestLifecycle");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1776b0 f5730a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1776b0 interfaceC1776b0) {
            super(1);
            this.f5730a = interfaceC1776b0;
        }

        public final void b(Throwable th) {
            this.f5730a.d();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1818x f5731a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1818x interfaceC1818x) {
            super(1);
            this.f5731a = interfaceC1818x;
        }

        public final void b(Throwable th) {
            if (th == null) {
                r.f5729a.b("Cancelling request because engine Job completed");
                this.f5731a.i1();
                return;
            }
            r.f5729a.b("Cancelling request because engine Job failed with error: " + th);
            AbstractC1823z0.d(this.f5731a, "Engine failed", th);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    public static final void c(InterfaceC1818x interfaceC1818x, InterfaceC1815v0 interfaceC1815v0) {
        interfaceC1818x.H0(new a(interfaceC1815v0.H0(new b(interfaceC1818x))));
    }
}
