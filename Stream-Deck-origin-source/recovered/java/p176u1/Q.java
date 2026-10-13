package p176u1;

import C6.G;
import C6.j;
import C6.l;
import Q6.k;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p011b1.O;
import p128o1.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Q implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f34385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3038w f34386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f34387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f34389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f34390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public M f34391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3036u f34392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f34393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f34394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f34395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3023g f34396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final B0.d f34397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Runnable f34398n;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34404a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f34404a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(Q.this.p(), false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements InterfaceC3037v {
        public d() {
        }

        @Override // p176u1.InterfaceC3037v
        public void a(KeyEvent keyEvent) {
            Q.this.o().sendKeyEvent(keyEvent);
        }

        @Override // p176u1.InterfaceC3037v
        public void b(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
            Q.this.f34396l.b(z8, z9, z10, z11, z12, z13);
        }

        @Override // p176u1.InterfaceC3037v
        public void c(int i8) {
            Q.this.f34390f.invoke(C3035t.i(i8));
        }

        @Override // p176u1.InterfaceC3037v
        public void d(List list) {
            Q.this.f34389e.invoke(list);
        }

        @Override // p176u1.InterfaceC3037v
        public void e(I i8) {
            int size = Q.this.f34393i.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (t.c(((WeakReference) Q.this.f34393i.get(i9)).get(), i8)) {
                    Q.this.f34393i.remove(i9);
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f34407a = new e();

        public e() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return G.f1419a;
        }

        public final void invoke(List list) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f34409a = new g();

        public g() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return G.f1419a;
        }

        public final void invoke(List list) {
        }
    }

    public Q(View view, O o8, InterfaceC3038w interfaceC3038w, Executor executor) {
        this.f34385a = view;
        this.f34386b = interfaceC3038w;
        this.f34387c = executor;
        this.f34389e = e.f34407a;
        this.f34390f = f.f34408a;
        this.f34391g = new M("", p128o1.G.f30758b.a(), (p128o1.G) null, 4, (AbstractC2633k) null);
        this.f34392h = C3036u.f34473g.a();
        this.f34393i = new ArrayList();
        this.f34394j = C6.k.a(l.NONE, new c());
        this.f34396l = new C3023g(o8, interfaceC3038w);
        this.f34397m = new B0.d(new a[16], 0);
    }

    public static final void s(a aVar, J j8, J j9) {
        int i8 = b.f34404a[aVar.ordinal()];
        if (i8 == 1) {
            Boolean bool = Boolean.TRUE;
            j8.f28779a = bool;
            j9.f28779a = bool;
        } else if (i8 == 2) {
            Boolean bool2 = Boolean.FALSE;
            j8.f28779a = bool2;
            j9.f28779a = bool2;
        } else if ((i8 == 3 || i8 == 4) && !t.c(j8.f28779a, Boolean.FALSE)) {
            j9.f28779a = Boolean.valueOf(aVar == a.ShowKeyboard);
        }
    }

    public static final void v(Q q8) {
        q8.f34398n = null;
        q8.r();
    }

    @Override // p176u1.H
    public void a(M m8, C3036u c3036u, k kVar, k kVar2) {
        this.f34388d = true;
        this.f34391g = m8;
        this.f34392h = c3036u;
        this.f34389e = kVar;
        this.f34390f = kVar2;
        u(a.StartInput);
    }

    @Override // p176u1.H
    public void b(Q0.h hVar) {
        Rect rect;
        this.f34395k = new Rect(S6.c.d(hVar.i()), S6.c.d(hVar.l()), S6.c.d(hVar.j()), S6.c.d(hVar.e()));
        if (!this.f34393i.isEmpty() || (rect = this.f34395k) == null) {
            return;
        }
        this.f34385a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // p176u1.H
    public void c() {
        u(a.ShowKeyboard);
    }

    @Override // p176u1.H
    public void d() {
        this.f34388d = false;
        this.f34389e = g.f34409a;
        this.f34390f = h.f34410a;
        this.f34395k = null;
        u(a.StopInput);
    }

    @Override // p176u1.H
    public void e(M m8, M m9) {
        boolean z8 = (p128o1.G.g(this.f34391g.g(), m9.g()) && t.c(this.f34391g.f(), m9.f())) ? false : true;
        this.f34391g = m9;
        int size = this.f34393i.size();
        for (int i8 = 0; i8 < size; i8++) {
            I i9 = (I) ((WeakReference) this.f34393i.get(i8)).get();
            if (i9 != null) {
                i9.f(m9);
            }
        }
        this.f34396l.a();
        if (t.c(m8, m9)) {
            if (z8) {
                InterfaceC3038w interfaceC3038w = this.f34386b;
                int iL = p128o1.G.l(m9.g());
                int iK = p128o1.G.k(m9.g());
                p128o1.G gF = this.f34391g.f();
                int iL2 = gF != null ? p128o1.G.l(gF.r()) : -1;
                p128o1.G gF2 = this.f34391g.f();
                interfaceC3038w.a(iL, iK, iL2, gF2 != null ? p128o1.G.k(gF2.r()) : -1);
                return;
            }
            return;
        }
        if (m8 != null && (!t.c(m8.h(), m9.h()) || (p128o1.G.g(m8.g(), m9.g()) && !t.c(m8.f(), m9.f())))) {
            t();
            return;
        }
        int size2 = this.f34393i.size();
        for (int i10 = 0; i10 < size2; i10++) {
            I i11 = (I) ((WeakReference) this.f34393i.get(i10)).get();
            if (i11 != null) {
                i11.g(this.f34391g, this.f34386b);
            }
        }
    }

    @Override // p176u1.H
    public void f(M m8, D d8, E e8, k kVar, Q0.h hVar, Q0.h hVar2) {
        this.f34396l.d(m8, d8, e8, kVar, hVar, hVar2);
    }

    @Override // p176u1.H
    public void g() {
        u(a.HideKeyboard);
    }

    public final InputConnection n(EditorInfo editorInfo) {
        if (!this.f34388d) {
            return null;
        }
        U.h(editorInfo, this.f34392h, this.f34391g);
        U.i(editorInfo);
        I i8 = new I(this.f34391g, new d(), this.f34392h.b());
        this.f34393i.add(new WeakReference(i8));
        return i8;
    }

    public final BaseInputConnection o() {
        return (BaseInputConnection) this.f34394j.getValue();
    }

    public final View p() {
        return this.f34385a;
    }

    public final boolean q() {
        return this.f34388d;
    }

    public final void r() {
        J j8 = new J();
        J j9 = new J();
        B0.d dVar = this.f34397m;
        int iS = dVar.s();
        if (iS > 0) {
            Object[] objArrR = dVar.r();
            int i8 = 0;
            do {
                s((a) objArrR[i8], j8, j9);
                i8++;
            } while (i8 < iS);
        }
        this.f34397m.m();
        if (t.c(j8.f28779a, Boolean.TRUE)) {
            t();
        }
        Boolean bool = (Boolean) j9.f28779a;
        if (bool != null) {
            w(bool.booleanValue());
        }
        if (t.c(j8.f28779a, Boolean.FALSE)) {
            t();
        }
    }

    public final void t() {
        this.f34386b.c();
    }

    public final void u(a aVar) {
        this.f34397m.d(aVar);
        if (this.f34398n == null) {
            Runnable runnable = new Runnable() { // from class: u1.P
                @Override // java.lang.Runnable
                public final void run() {
                    Q.v(this.f34384a);
                }
            };
            this.f34387c.execute(runnable);
            this.f34398n = runnable;
        }
    }

    public final void w(boolean z8) {
        if (z8) {
            this.f34386b.e();
        } else {
            this.f34386b.d();
        }
    }

    public /* synthetic */ Q(View view, O o8, InterfaceC3038w interfaceC3038w, Executor executor, int i8, AbstractC2633k abstractC2633k) {
        this(view, o8, interfaceC3038w, (i8 & 8) != 0 ? U.d(Choreographer.getInstance()) : executor);
    }

    public Q(View view, O o8) {
        this(view, o8, new C3039x(view), null, 8, null);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f34408a = new f();

        public f() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((C3035t) obj).o());
            return G.f1419a;
        }

        public final void b(int i8) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f34410a = new h();

        public h() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((C3035t) obj).o());
            return G.f1419a;
        }

        public final void b(int i8) {
        }
    }
}
