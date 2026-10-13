package p092k1;

import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28590a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        public static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        public static void c(ViewStructure viewStructure, int i8, int i9, int i10, int i11, int i12, int i13) {
            viewStructure.setDimens(i8, i9, i10, i11, i12, i13);
        }

        public static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        public static void e(ViewStructure viewStructure, float f8, int i8, int i9, int i10) {
            viewStructure.setTextStyle(f8, i8, i9, i10);
        }
    }

    public e(ViewStructure viewStructure) {
        this.f28590a = viewStructure;
    }

    public static e g(ViewStructure viewStructure) {
        return new e(viewStructure);
    }

    public void a(String str) {
        a.a((ViewStructure) this.f28590a, str);
    }

    public void b(CharSequence charSequence) {
        a.b((ViewStructure) this.f28590a, charSequence);
    }

    public void c(int i8, int i9, int i10, int i11, int i12, int i13) {
        a.c((ViewStructure) this.f28590a, i8, i9, i10, i11, i12, i13);
    }

    public void d(CharSequence charSequence) {
        a.d((ViewStructure) this.f28590a, charSequence);
    }

    public void e(float f8, int i8, int i9, int i10) {
        a.e((ViewStructure) this.f28590a, f8, i8, i9, i10);
    }

    public ViewStructure f() {
        return (ViewStructure) this.f28590a;
    }
}
