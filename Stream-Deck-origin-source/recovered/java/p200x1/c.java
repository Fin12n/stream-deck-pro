package p200x1;

import A1.d;
import A1.v;
import A1.x;
import android.text.Spannable;
import java.util.List;
import p066h2.e;
import p128o1.C2739d;
import p128o1.w;
import p152r1.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final int a(long j8) {
        long jG = v.g(j8);
        x.a aVar = x.f466b;
        if (x.g(jG, aVar.b())) {
            return 0;
        }
        return x.g(jG, aVar.a()) ? 1 : 2;
    }

    public static final int b(int i8) {
        w.a aVar = w.f30852a;
        if (w.i(i8, aVar.a())) {
            return 0;
        }
        if (w.i(i8, aVar.g())) {
            return 1;
        }
        if (w.i(i8, aVar.b())) {
            return 2;
        }
        if (w.i(i8, aVar.c())) {
            return 3;
        }
        if (w.i(i8, aVar.f())) {
            return 4;
        }
        if (w.i(i8, aVar.d())) {
            return 5;
        }
        if (w.i(i8, aVar.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    public static final void c(Spannable spannable, p128o1.v vVar, int i8, int i9, d dVar) {
        for (Object obj : spannable.getSpans(i8, i9, e.class)) {
            spannable.removeSpan((e) obj);
        }
        d.u(spannable, new j(v.h(vVar.c()), a(vVar.c()), v.h(vVar.a()), a(vVar.a()), dVar.x0() * dVar.getDensity(), b(vVar.b())), i8, i9);
    }

    public static final void d(Spannable spannable, List list, d dVar) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            C2739d.b bVar = (C2739d.b) list.get(i8);
            c(spannable, (p128o1.v) bVar.a(), bVar.b(), bVar.c(), dVar);
        }
    }
}
