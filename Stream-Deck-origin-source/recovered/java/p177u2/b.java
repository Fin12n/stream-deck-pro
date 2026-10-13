package p177u2;

import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p010b0.D;
import p063h.s;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b extends p177u2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1733p f34490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f34491b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends O {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final P.c f34492d = new C0779a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public D f34493b = new D();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f34494c = false;

        /* JADX INFO: renamed from: u2.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class C0779a implements P.c {
            @Override // androidx.lifecycle.P.c
            public O a(Class cls) {
                return new a();
            }
        }

        public static a f(Q q8) {
            return (a) new P(q8, f34492d).b(a.class);
        }

        @Override // androidx.lifecycle.O
        public void d() {
            super.d();
            if (this.f34493b.k() <= 0) {
                this.f34493b.b();
            } else {
                s.a(this.f34493b.l(0));
                throw null;
            }
        }

        public void g() {
            if (this.f34493b.k() <= 0) {
                return;
            }
            s.a(this.f34493b.l(0));
            throw null;
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f34493b.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(QhsKALGiniuQ.YIZnwyWg);
                if (this.f34493b.k() <= 0) {
                    return;
                }
                s.a(this.f34493b.l(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f34493b.h(0));
                printWriter.print(": ");
                throw null;
            }
        }
    }

    public b(InterfaceC1733p interfaceC1733p, Q q8) {
        this.f34490a = interfaceC1733p;
        this.f34491b = a.f(q8);
    }

    @Override // p177u2.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f34491b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p177u2.a
    public void c() {
        this.f34491b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        T1.b.a(this.f34490a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
