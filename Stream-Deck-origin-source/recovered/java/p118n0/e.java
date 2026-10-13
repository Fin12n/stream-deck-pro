package p118n0;

import B0.d;
import C6.G;
import C6.r;
import H6.c;
import Q0.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f30480a = new d(new f[16], 0);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f30481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f30482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f30484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f30485e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f30487g;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f30485e = obj;
            this.f30487g |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r8 >= r2) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please report as a decompilation issue!!! */
    @Override // p118n0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(h hVar, G6.d dVar) {
        a aVar;
        int iS;
        h hVar2;
        int i8;
        Object[] objArr;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i9 = aVar.f30487g;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                aVar.f30487g = i9 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f30485e;
        Object objF = c.f();
        int i10 = aVar.f30487g;
        if (i10 == 0) {
            r.b(obj);
            d dVar2 = this.f30480a;
            iS = dVar2.s();
            if (iS > 0) {
                Object[] objArrR = dVar2.r();
                hVar2 = hVar;
                i8 = 0;
                objArr = objArrR;
                f fVar = (f) objArr[i8];
                aVar.f30481a = hVar2;
                aVar.f30482b = objArr;
                aVar.f30483c = iS;
                aVar.f30484d = i8;
                aVar.f30487g = 1;
                if (fVar.g2(hVar2, aVar) == objF) {
                    return objF;
                }
                i8++;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = aVar.f30484d;
            iS = aVar.f30483c;
            objArr = (Object[]) aVar.f30482b;
            h hVar3 = (h) aVar.f30481a;
            r.b(obj);
            hVar2 = hVar3;
            i8++;
        }
        return G.f1419a;
    }

    public final d c() {
        return this.f30480a;
    }
}
