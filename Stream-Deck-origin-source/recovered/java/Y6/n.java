package Y6;

import D6.C0937q;
import D6.r;
import com.google.mlkit.common.internal.ckI.WqXA;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p090k.zI.jULK;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class n extends m {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterable, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f12539a;

        public a(g gVar) {
            this.f12539a = gVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f12539a.iterator();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12540a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj == null);
        }
    }

    public static Iterable h(g gVar) {
        t.g(gVar, "<this>");
        return new a(gVar);
    }

    public static int i(g gVar) {
        t.g(gVar, "<this>");
        Iterator it = gVar.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            it.next();
            i8++;
            if (i8 < 0) {
                r.w();
            }
        }
        return i8;
    }

    public static g j(g gVar, int i8) {
        t.g(gVar, "<this>");
        if (i8 >= 0) {
            if (i8 == 0) {
                return gVar;
            }
            return gVar instanceof c ? ((c) gVar).a(i8) : new Y6.b(gVar, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static g k(g gVar, Q6.k predicate) {
        t.g(gVar, "<this>");
        t.g(predicate, "predicate");
        return new e(gVar, true, predicate);
    }

    public static final g m(g gVar) {
        t.g(gVar, "<this>");
        g gVarL = l(gVar, b.f12540a);
        t.e(gVarL, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return gVarL;
    }

    public static Object n(g gVar) {
        t.g(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final String p(g gVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Q6.k kVar) {
        t.g(gVar, "<this>");
        t.g(separator, "separator");
        t.g(prefix, "prefix");
        t.g(postfix, "postfix");
        t.g(truncated, "truncated");
        String string = ((StringBuilder) o(gVar, new StringBuilder(), separator, prefix, postfix, i8, truncated, kVar)).toString();
        t.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String q(g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Q6.k kVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i9 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i9 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i9 & 32) != 0) {
            kVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        Q6.k kVar2 = kVar;
        return p(gVar, charSequence, charSequence2, charSequence3, i8, charSequence5, kVar2);
    }

    public static Object r(g gVar) {
        t.g(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static g s(g gVar, Q6.k transform) {
        t.g(gVar, "<this>");
        t.g(transform, "transform");
        return new o(gVar, transform);
    }

    public static g t(g gVar, Q6.k transform) {
        t.g(gVar, "<this>");
        t.g(transform, "transform");
        return m(new o(gVar, transform));
    }

    public static List u(g gVar) {
        t.g(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return r.n();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C0937q.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final g l(g gVar, Q6.k kVar) {
        t.g(gVar, "<this>");
        t.g(kVar, jULK.jBEIXJPlG);
        return new e(gVar, false, kVar);
    }

    public static final Appendable o(g gVar, Appendable appendable, CharSequence separator, CharSequence prefix, CharSequence charSequence, int i8, CharSequence truncated, Q6.k kVar) throws IOException {
        t.g(gVar, "<this>");
        t.g(appendable, bGZGhbtQmA.GfLuwXPzBplqE);
        t.g(separator, "separator");
        t.g(prefix, "prefix");
        t.g(charSequence, WqXA.QtSJqqKHGTEn);
        t.g(truncated, "truncated");
        appendable.append(prefix);
        int i9 = 0;
        for (Object obj : gVar) {
            i9++;
            if (i9 > 1) {
                appendable.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            Z6.n.a(appendable, obj, kVar);
        }
        if (i8 >= 0 && i9 > i8) {
            appendable.append(truncated);
        }
        appendable.append(charSequence);
        return appendable;
    }
}
