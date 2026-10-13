package p065h1;

import D6.C0934n;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import p128o1.B;
import p128o1.C2739d;

/* JADX INFO: renamed from: h1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2390g {
    public static final C2739d a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new C2739d(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i8 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iT = C0934n.T(annotationArr);
        if (iT >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i8];
                if (t.c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new C2739d.b(new Y(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i8 == iT) {
                    break;
                }
                i8++;
            }
        }
        return new C2739d(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(C2739d c2739d) {
        if (c2739d.f().isEmpty()) {
            return c2739d.i();
        }
        SpannableString spannableString = new SpannableString(c2739d.i());
        C2389f0 c2389f0 = new C2389f0();
        List listF = c2739d.f();
        int size = listF.size();
        for (int i8 = 0; i8 < size; i8++) {
            C2739d.b bVar = (C2739d.b) listF.get(i8);
            B b8 = (B) bVar.a();
            int iB = bVar.b();
            int iC = bVar.c();
            c2389f0.q();
            c2389f0.f(b8);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", c2389f0.p()), iB, iC, 33);
        }
        return spannableString;
    }
}
