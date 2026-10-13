package p111m2;

import H1.n;
import H1.o;
import I1.c;
import I1.d;
import U1.InterfaceC1654p;
import U1.InterfaceC1656s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p009b.ActivityC1747j;
import p009b.C;
import p009b.F;
import p027d.b;
import p036e.e;
import p036e.f;

/* JADX INFO: renamed from: m2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC2686k extends ActivityC1747j implements H1.a.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f29924A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C2690o f29925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r f29926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f29927y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f29928z;

    /* JADX INFO: renamed from: m2.k$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends q implements c, d, n, o, S, F, f, p217z2.f, C, InterfaceC1654p {
        public a() {
            super(ActivityC2686k.this);
        }

        @Override // p111m2.q
        public void A() {
            B();
        }

        public void B() {
            ActivityC2686k.this.invalidateOptionsMenu();
        }

        @Override // p111m2.q
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public ActivityC2686k x() {
            return ActivityC2686k.this;
        }

        @Override // p111m2.C
        public void a(y yVar, ComponentCallbacksC2681f componentCallbacksC2681f) {
            ActivityC2686k.this.j0(componentCallbacksC2681f);
        }

        @Override // p009b.F
        public C b() {
            return ActivityC2686k.this.b();
        }

        @Override // I1.d
        public void c(T1.a aVar) {
            ActivityC2686k.this.c(aVar);
        }

        @Override // U1.InterfaceC1654p
        public void d(InterfaceC1656s interfaceC1656s) {
            ActivityC2686k.this.d(interfaceC1656s);
        }

        @Override // p111m2.q, p111m2.AbstractC2688m
        public View f(int i8) {
            return ActivityC2686k.this.findViewById(i8);
        }

        @Override // p111m2.q, p111m2.AbstractC2688m
        public boolean g() {
            Window window = ActivityC2686k.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // I1.c
        public void h(T1.a aVar) {
            ActivityC2686k.this.h(aVar);
        }

        @Override // p036e.f
        public e i() {
            return ActivityC2686k.this.i();
        }

        @Override // androidx.lifecycle.S
        public Q k() {
            return ActivityC2686k.this.k();
        }

        @Override // p217z2.f
        public p217z2.d l() {
            return ActivityC2686k.this.l();
        }

        @Override // I1.d
        public void m(T1.a aVar) {
            ActivityC2686k.this.m(aVar);
        }

        @Override // H1.n
        public void n(T1.a aVar) {
            ActivityC2686k.this.n(aVar);
        }

        @Override // H1.o
        public void p(T1.a aVar) {
            ActivityC2686k.this.p(aVar);
        }

        @Override // H1.n
        public void q(T1.a aVar) {
            ActivityC2686k.this.q(aVar);
        }

        @Override // U1.InterfaceC1654p
        public void s(InterfaceC1656s interfaceC1656s) {
            ActivityC2686k.this.s(interfaceC1656s);
        }

        @Override // I1.c
        public void t(T1.a aVar) {
            ActivityC2686k.this.t(aVar);
        }

        @Override // H1.o
        public void u(T1.a aVar) {
            ActivityC2686k.this.u(aVar);
        }

        @Override // p111m2.q
        public void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC2686k.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.lifecycle.InterfaceC1733p
        public AbstractC1726i w() {
            return ActivityC2686k.this.f29926x;
        }

        @Override // p111m2.q
        public LayoutInflater y() {
            return ActivityC2686k.this.getLayoutInflater().cloneInContext(ActivityC2686k.this);
        }
    }

    public ActivityC2686k() {
        this.f29925w = C2690o.b(new a());
        this.f29926x = new r(this);
        this.f29924A = true;
        g0();
    }

    public static /* synthetic */ Bundle c0(ActivityC2686k activityC2686k) {
        activityC2686k.h0();
        activityC2686k.f29926x.i(AbstractC1726i.a.ON_STOP);
        return new Bundle();
    }

    public static boolean i0(y yVar, AbstractC1726i.b bVar) {
        boolean zI0 = false;
        for (ComponentCallbacksC2681f componentCallbacksC2681f : yVar.q0()) {
            if (componentCallbacksC2681f != null) {
                if (componentCallbacksC2681f.C() != null) {
                    zI0 |= i0(componentCallbacksC2681f.s(), bVar);
                }
                K k8 = componentCallbacksC2681f.f29863f0;
                if (k8 != null && k8.w().b().b(AbstractC1726i.b.STARTED)) {
                    componentCallbacksC2681f.f29863f0.i(bVar);
                    zI0 = true;
                }
                if (componentCallbacksC2681f.f29861e0.b().b(AbstractC1726i.b.STARTED)) {
                    componentCallbacksC2681f.f29861e0.n(bVar);
                    zI0 = true;
                }
            }
        }
        return zI0;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (x(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f29927y);
            printWriter.print(" mResumed=");
            printWriter.print(this.f29928z);
            printWriter.print(" mStopped=");
            printWriter.print(this.f29924A);
            if (getApplication() != null) {
                p177u2.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f29925w.l().U(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final View e0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f29925w.n(view, str, context, attributeSet);
    }

    public y f0() {
        return this.f29925w.l();
    }

    public final void g0() {
        l().h("android:support:lifecycle", new z2.d.c() { // from class: m2.g
            @Override // z2.d.c
            public final Bundle a() {
                return ActivityC2686k.c0(this.f29920a);
            }
        });
        h(new T1.a() { // from class: m2.h
            @Override // T1.a
            public final void accept(Object obj) {
                this.f29921a.f29925w.m();
            }
        });
        Q(new T1.a() { // from class: m2.i
            @Override // T1.a
            public final void accept(Object obj) {
                this.f29922a.f29925w.m();
            }
        });
        P(new b() { // from class: m2.j
            @Override // p027d.b
            public final void a(Context context) {
                this.f29923a.f29925w.a(null);
            }
        });
    }

    public void h0() {
        while (i0(f0(), AbstractC1726i.b.CREATED)) {
        }
    }

    public void k0() {
        this.f29926x.i(AbstractC1726i.a.ON_RESUME);
        this.f29925w.h();
    }

    @Override // p009b.ActivityC1747j, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        this.f29925w.m();
        super.onActivityResult(i8, i9, intent);
    }

    @Override // p009b.ActivityC1747j, H1.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29926x.i(AbstractC1726i.a.ON_CREATE);
        this.f29925w.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewE0 = e0(view, str, context, attributeSet);
        return viewE0 == null ? super.onCreateView(view, str, context, attributeSet) : viewE0;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f29925w.f();
        this.f29926x.i(AbstractC1726i.a.ON_DESTROY);
    }

    @Override // p009b.ActivityC1747j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        if (i8 == 6) {
            return this.f29925w.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f29928z = false;
        this.f29925w.g();
        this.f29926x.i(AbstractC1726i.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        k0();
    }

    @Override // p009b.ActivityC1747j, android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        this.f29925w.m();
        super.onRequestPermissionsResult(i8, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f29925w.m();
        super.onResume();
        this.f29928z = true;
        this.f29925w.k();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f29925w.m();
        super.onStart();
        this.f29924A = false;
        if (!this.f29927y) {
            this.f29927y = true;
            this.f29925w.c();
        }
        this.f29925w.k();
        this.f29926x.i(AbstractC1726i.a.ON_START);
        this.f29925w.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f29925w.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f29924A = true;
        h0();
        this.f29925w.j();
        this.f29926x.i(AbstractC1726i.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewE0 = e0(null, str, context, attributeSet);
        return viewE0 == null ? super.onCreateView(str, context, attributeSet) : viewE0;
    }

    public ActivityC2686k(int i8) {
        super(i8);
        this.f29925w = C2690o.b(new a());
        this.f29926x = new r(this);
        this.f29924A = true;
        g0();
    }

    @Override // H1.a.b
    public final void a(int i8) {
    }

    public void j0(ComponentCallbacksC2681f componentCallbacksC2681f) {
    }
}
