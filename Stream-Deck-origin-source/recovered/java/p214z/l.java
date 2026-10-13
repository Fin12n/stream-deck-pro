package p214z;

import A.K;
import H.InterfaceC0984i0;
import H.N0;
import H.O0;
import H.T0;
import H.a1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class l implements a1 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final InterfaceC0984i0 f38500P;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final O0 f38501a = O0.i0();

        public static /* synthetic */ boolean c(a aVar, InterfaceC0984i0 interfaceC0984i0, InterfaceC0984i0.a aVar2) {
            aVar.a().K(aVar2, interfaceC0984i0.d(aVar2), interfaceC0984i0.h(aVar2));
            return true;
        }

        public static a e(final InterfaceC0984i0 interfaceC0984i0) {
            final a aVar = new a();
            interfaceC0984i0.a("camera2.captureRequest.option.", new InterfaceC0984i0.b() { // from class: z.k
                @Override // H.InterfaceC0984i0.b
                public final boolean a(InterfaceC0984i0.a aVar2) {
                    return l.a.c(this.f38498a, interfaceC0984i0, aVar2);
                }
            });
            return aVar;
        }

        @Override // A.K
        public N0 a() {
            return this.f38501a;
        }

        public l d() {
            return new l(T0.h0(this.f38501a));
        }
    }

    public l(InterfaceC0984i0 interfaceC0984i0) {
        this.f38500P = interfaceC0984i0;
    }

    @Override // H.a1
    public InterfaceC0984i0 q() {
        return this.f38500P;
    }
}
