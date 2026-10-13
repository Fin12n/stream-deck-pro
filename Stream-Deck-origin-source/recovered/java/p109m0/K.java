package p109m0;

import C6.G;
import D6.C0934n;
import Q6.k;
import W6.i;
import kotlin.jvm.internal.u;
import p010b0.t;
import p010b0.w;
import p010b0.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f29356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f29357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29358d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f29359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f29361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ K f29362d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, int i9, t tVar, K k8) {
            super(1);
            this.f29359a = i8;
            this.f29360b = i9;
            this.f29361c = tVar;
            this.f29362d = k8;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0039  */
        public final void b(InterfaceC2666d.a aVar) {
            Object objA;
            k key = ((n.a) aVar.c()).getKey();
            int iMax = Math.max(this.f29359a, aVar.b());
            int iMin = Math.min(this.f29360b, (aVar.b() + aVar.a()) - 1);
            if (iMax > iMin) {
                return;
            }
            while (true) {
                if (key == null) {
                    objA = I.a(iMax);
                } else {
                    objA = key.invoke(Integer.valueOf(iMax - aVar.b()));
                    if (objA == null) {
                        objA = I.a(iMax);
                    }
                }
                this.f29361c.q(objA, iMax);
                this.f29362d.f29357c[iMax - this.f29362d.f29358d] = objA;
                if (iMax == iMin) {
                    return;
                } else {
                    iMax++;
                }
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC2666d.a) obj);
            return G.f1419a;
        }
    }

    public K(i iVar, n nVar) {
        InterfaceC2666d interfaceC2666dJ = nVar.j();
        int iS = iVar.s();
        if (iS < 0) {
            throw new IllegalStateException("negative nearestRange.first");
        }
        int iMin = Math.min(iVar.t(), interfaceC2666dJ.k() - 1);
        if (iMin < iS) {
            this.f29356b = x.a();
            this.f29357c = new Object[0];
            this.f29358d = 0;
        } else {
            int i8 = (iMin - iS) + 1;
            this.f29357c = new Object[i8];
            this.f29358d = iS;
            t tVar = new t(i8);
            interfaceC2666dJ.a(iS, iMin, new a(iS, iMin, tVar, this));
            this.f29356b = tVar;
        }
    }

    @Override // p109m0.t
    public Object a(int i8) {
        Object[] objArr = this.f29357c;
        int i9 = i8 - this.f29358d;
        if (i9 < 0 || i9 > C0934n.T(objArr)) {
            return null;
        }
        return objArr[i9];
    }

    @Override // p109m0.t
    public int c(Object obj) {
        w wVar = this.f29356b;
        int iA = wVar.a(obj);
        if (iA >= 0) {
            return wVar.f15642c[iA];
        }
        return -1;
    }
}
