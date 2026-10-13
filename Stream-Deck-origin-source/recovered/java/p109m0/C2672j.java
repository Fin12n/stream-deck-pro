package p109m0;

import A1.t;
import C6.C0920i;
import C6.m;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import p038e1.AbstractC2233d;
import p038e1.InterfaceC2232c;
import p047f1.j;
import p047f1.l;
import p055g0.B;

/* JADX INFO: renamed from: m0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2672j implements j, InterfaceC2232c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f29418g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f29419h = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2674l f29420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2671i f29421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B f29424f;

    /* JADX INFO: renamed from: m0.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2232c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f29425a;

        @Override // p038e1.InterfaceC2232c.a
        public boolean a() {
            return this.f29425a;
        }
    }

    /* JADX INFO: renamed from: m0.j$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: m0.j$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29426a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29426a = iArr;
        }
    }

    /* JADX INFO: renamed from: m0.j$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements InterfaceC2232c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f29428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f29429c;

        public d(J j8, int i8) {
            this.f29428b = j8;
            this.f29429c = i8;
        }

        @Override // p038e1.InterfaceC2232c.a
        public boolean a() {
            return C2672j.this.u((C2671i.a) this.f29428b.f28779a, this.f29429c);
        }
    }

    public C2672j(InterfaceC2674l interfaceC2674l, C2671i c2671i, boolean z8, t tVar, B b8) {
        this.f29420b = interfaceC2674l;
        this.f29421c = c2671i;
        this.f29422d = z8;
        this.f29423e = tVar;
        this.f29424f = b8;
    }

    @Override // p047f1.j
    public l getKey() {
        return AbstractC2233d.a();
    }

    @Override // p038e1.InterfaceC2232c
    public Object k(int i8, k kVar) {
        if (this.f29420b.d() <= 0 || !this.f29420b.g()) {
            return kVar.invoke(f29419h);
        }
        int iE = v(i8) ? this.f29420b.e() : this.f29420b.h();
        J j8 = new J();
        j8.f28779a = this.f29421c.a(iE, iE);
        Object objInvoke = null;
        while (objInvoke == null && u((C2671i.a) j8.f28779a, i8)) {
            C2671i.a aVarR = r((C2671i.a) j8.f28779a, i8);
            this.f29421c.e((C2671i.a) j8.f28779a);
            j8.f28779a = aVarR;
            this.f29420b.f();
            objInvoke = kVar.invoke(new d(j8, i8));
        }
        this.f29421c.e((C2671i.a) j8.f28779a);
        this.f29420b.f();
        return objInvoke;
    }

    public final C2671i.a r(C2671i.a aVar, int i8) {
        int iB = aVar.b();
        int iA = aVar.a();
        if (v(i8)) {
            iA++;
        } else {
            iB--;
        }
        return this.f29421c.a(iB, iA);
    }

    public final boolean u(C2671i.a aVar, int i8) {
        if (w(i8)) {
            return false;
        }
        if (v(i8)) {
            return aVar.a() < this.f29420b.d() - 1;
        }
        return aVar.b() > 0;
    }

    public final boolean v(int i8) {
        InterfaceC2232c.b.a aVar = InterfaceC2232c.b.f20452a;
        if (InterfaceC2232c.b.h(i8, aVar.c())) {
            return false;
        }
        if (InterfaceC2232c.b.h(i8, aVar.b())) {
            return true;
        }
        if (InterfaceC2232c.b.h(i8, aVar.a())) {
            return this.f29422d;
        }
        if (InterfaceC2232c.b.h(i8, aVar.d())) {
            return !this.f29422d;
        }
        if (InterfaceC2232c.b.h(i8, aVar.e())) {
            int i9 = c.f29426a[this.f29423e.ordinal()];
            if (i9 == 1) {
                return this.f29422d;
            }
            if (i9 == 2) {
                return !this.f29422d;
            }
            throw new m();
        }
        if (!InterfaceC2232c.b.h(i8, aVar.f())) {
            AbstractC2673k.c();
            throw new C0920i();
        }
        int i10 = c.f29426a[this.f29423e.ordinal()];
        if (i10 == 1) {
            return !this.f29422d;
        }
        if (i10 == 2) {
            return this.f29422d;
        }
        throw new m();
    }

    public final boolean w(int i8) {
        InterfaceC2232c.b.a aVar = InterfaceC2232c.b.f20452a;
        if (InterfaceC2232c.b.h(i8, aVar.a()) ? true : InterfaceC2232c.b.h(i8, aVar.d())) {
            return this.f29424f == B.Horizontal;
        }
        if (InterfaceC2232c.b.h(i8, aVar.e()) ? true : InterfaceC2232c.b.h(i8, aVar.f())) {
            return this.f29424f == B.Vertical;
        }
        if (InterfaceC2232c.b.h(i8, aVar.c()) ? true : InterfaceC2232c.b.h(i8, aVar.b())) {
            return false;
        }
        AbstractC2673k.c();
        throw new C0920i();
    }

    @Override // p047f1.j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public InterfaceC2232c getValue() {
        return this;
    }
}
