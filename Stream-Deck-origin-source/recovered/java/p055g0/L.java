package p055g0;

import A1.y;
import C6.r;
import H6.c;
import I6.d;
import Q0.f;
import p002a1.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L implements p002a1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f22837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22838b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f22840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f22841c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22843e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22841c = obj;
            this.f22843e |= Integer.MIN_VALUE;
            return L.this.L0(0L, 0L, this);
        }
    }

    public L(O o8, boolean z8) {
        this.f22837a = o8;
        this.f22838b = z8;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p002a1.a
    public Object L0(long j8, long j9, G6.d dVar) {
        a aVar;
        long jA;
        L l8;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f22843e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f22843e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objD = aVar.f22841c;
        Object objF = c.f();
        int i9 = aVar.f22843e;
        if (i9 == 0) {
            r.b(objD);
            if (this.f22838b) {
                O o8 = this.f22837a;
                aVar.f22839a = this;
                aVar.f22840b = j9;
                aVar.f22843e = 1;
                objD = o8.d(j9, aVar);
                if (objD == objF) {
                    return objF;
                }
                l8 = this;
            } else {
                jA = y.f471b.a();
                l8 = this;
            }
            y yVarB = y.b(jA);
            yVarB.o();
            l8.f22837a.i(false);
            return yVarB;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j9 = aVar.f22840b;
        l8 = (L) aVar.f22839a;
        r.b(objD);
        jA = y.k(j9, ((y) objD).o());
        y yVarB2 = y.b(jA);
        yVarB2.o();
        l8.f22837a.i(false);
        return yVarB2;
    }

    public final void a(boolean z8) {
        this.f22838b = z8;
    }

    @Override // p002a1.a
    public long f1(long j8, long j9, int i8) {
        return this.f22838b ? this.f22837a.h(j9) : f.f9082b.c();
    }

    @Override // p002a1.a
    public long w0(long j8, int i8) {
        if (e.e(i8, e.f13022a.b())) {
            this.f22837a.i(true);
        }
        return f.f9082b.c();
    }
}
