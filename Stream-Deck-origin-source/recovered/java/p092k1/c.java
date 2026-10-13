package p092k1;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f28589b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j8) {
            return contentCaptureSession.newAutofillId(autofillId, j8);
        }

        public static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        public static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j8) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j8);
        }

        public static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* JADX INFO: renamed from: k1.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0622c {
        public static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    public c(ContentCaptureSession contentCaptureSession, View view) {
        this.f28588a = contentCaptureSession;
        this.f28589b = view;
    }

    public static c f(ContentCaptureSession contentCaptureSession, View view) {
        return new c(contentCaptureSession, view);
    }

    public AutofillId a(long j8) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionA = p092k1.b.a(this.f28588a);
        p092k1.a aVarA = d.a(this.f28589b);
        Objects.requireNonNull(aVarA);
        return b.a(contentCaptureSessionA, aVarA.a(), j8);
    }

    public e b(AutofillId autofillId, long j8) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e.g(b.c(p092k1.b.a(this.f28588a), autofillId, j8));
        }
        return null;
    }

    public void c(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(p092k1.b.a(this.f28588a), autofillId, charSequence);
        }
    }

    public void e(long[] jArr) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            ContentCaptureSession contentCaptureSessionA = p092k1.b.a(this.f28588a);
            p092k1.a aVarA = d.a(this.f28589b);
            Objects.requireNonNull(aVarA);
            b.f(contentCaptureSessionA, aVarA.a(), jArr);
            return;
        }
        if (i8 >= 29) {
            ViewStructure viewStructureB = b.b(p092k1.b.a(this.f28588a), this.f28589b);
            a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(p092k1.b.a(this.f28588a), viewStructureB);
            ContentCaptureSession contentCaptureSessionA2 = p092k1.b.a(this.f28588a);
            p092k1.a aVarA2 = d.a(this.f28589b);
            Objects.requireNonNull(aVarA2);
            b.f(contentCaptureSessionA2, aVarA2.a(), jArr);
            ViewStructure viewStructureB2 = b.b(p092k1.b.a(this.f28588a), this.f28589b);
            a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(p092k1.b.a(this.f28588a), viewStructureB2);
        }
    }

    public void d(List list) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            C0622c.a(p092k1.b.a(this.f28588a), list);
            return;
        }
        if (i8 >= 29) {
            ViewStructure viewStructureB = b.b(p092k1.b.a(this.f28588a), this.f28589b);
            a.a(viewStructureB).putBoolean(cFAYKUlMj.gMqIbbmvCfRGJ, true);
            b.d(p092k1.b.a(this.f28588a), viewStructureB);
            for (int i9 = 0; i9 < list.size(); i9++) {
                b.d(p092k1.b.a(this.f28588a), (ViewStructure) list.get(i9));
            }
            ViewStructure viewStructureB2 = b.b(p092k1.b.a(this.f28588a), this.f28589b);
            a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(p092k1.b.a(this.f28588a), viewStructureB2);
        }
    }
}
