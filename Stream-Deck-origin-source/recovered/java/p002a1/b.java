package p002a1;

import A1.y;
import C6.r;
import I6.d;
import Q0.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p017b7.J;
import p047f1.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f12995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f12996b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public J f12997c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J invoke() {
            return b.this.h();
        }
    }

    /* JADX INFO: renamed from: a1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0327b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f12999a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13001c;

        public C0327b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12999a = obj;
            this.f13001c |= Integer.MIN_VALUE;
            return b.this.a(0L, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f13002a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13004c;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f13002a = obj;
            this.f13004c |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j8, long j9, G6.d dVar) {
        C0327b c0327b;
        long jA;
        if (dVar instanceof C0327b) {
            c0327b = (C0327b) dVar;
            int i8 = c0327b.f13001c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0327b.f13001c = i8 - Integer.MIN_VALUE;
            } else {
                c0327b = new C0327b(dVar);
            }
        } else {
            c0327b = new C0327b(dVar);
        }
        C0327b c0327b2 = c0327b;
        Object objL0 = c0327b2.f12999a;
        Object objF = H6.c.f();
        int i9 = c0327b2.f13001c;
        if (i9 == 0) {
            r.b(objL0);
            p002a1.a aVarG = g();
            if (aVarG != null) {
                c0327b2.f13001c = 1;
                objL0 = aVarG.L0(j8, j9, c0327b2);
                if (objL0 == objF) {
                    return objF;
                }
            } else {
                jA = y.f471b.a();
            }
            return y.b(jA);
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(objL0);
        jA = ((y) objL0).o();
        return y.b(jA);
    }

    public final long b(long j8, long j9, int i8) {
        p002a1.a aVarG = g();
        return aVarG != null ? aVarG.f1(j8, j9, i8) : f.f9082b.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j8, G6.d dVar) {
        c cVar;
        long jA;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f13004c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f13004c = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objZ = cVar.f13002a;
        Object objF = H6.c.f();
        int i9 = cVar.f13004c;
        if (i9 == 0) {
            r.b(objZ);
            p002a1.a aVarG = g();
            if (aVarG != null) {
                cVar.f13004c = 1;
                objZ = aVarG.Z(j8, cVar);
                if (objZ == objF) {
                    return objF;
                }
            } else {
                jA = y.f471b.a();
            }
            return y.b(jA);
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(objZ);
        jA = ((y) objZ).o();
        return y.b(jA);
    }

    public final long d(long j8, int i8) {
        p002a1.a aVarG = g();
        return aVarG != null ? aVarG.w0(j8, i8) : f.f9082b.c();
    }

    public final J e() {
        J j8 = (J) this.f12996b.invoke();
        if (j8 != null) {
            return j8;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final h f() {
        return this.f12995a;
    }

    public final p002a1.a g() {
        h hVar = this.f12995a;
        if (hVar != null) {
            return (p002a1.c) hVar.u(d.a());
        }
        return null;
    }

    public final J h() {
        return this.f12997c;
    }

    public final void i(Function0 function0) {
        this.f12996b = function0;
    }

    public final void j(h hVar) {
        this.f12995a = hVar;
    }

    public final void k(J j8) {
        this.f12997c = j8;
    }
}
