package Y5;

import C6.l;
import D6.C0937q;
import D6.C0938s;
import D6.I;
import D6.z;
import Q6.o;
import W6.n;
import X5.InterfaceC1684m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements InterfaceC1684m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f12436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6.j f12437d;

    /* JADX INFO: renamed from: Y5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class C0315a implements Map.Entry, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12438a;

        public C0315a(int i8) {
            this.f12438a = i8;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            return a.this.f12436c.f(this.f12438a).toString();
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List getValue() {
            return C0937q.e(a.this.f12436c.i(this.f12438a).toString());
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12440a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(CharSequence it) {
            t.g(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LinkedHashSet invoke() {
            LinkedHashSet linkedHashSet = new LinkedHashSet(a.this.f12436c.e());
            a aVar = a.this;
            int iE = aVar.f12436c.e();
            for (int i8 = 0; i8 < iE; i8++) {
                linkedHashSet.add(aVar.f12436c.f(i8).toString());
            }
            return linkedHashSet;
        }
    }

    public a(e headers) {
        t.g(headers, "headers");
        this.f12436c = headers;
        this.f12437d = C6.k.a(l.NONE, new c());
    }

    @Override // p115m6.B
    public Set a() {
        W6.i iVarV = n.v(0, this.f12436c.e());
        ArrayList arrayList = new ArrayList(C0938s.y(iVarV, 10));
        Iterator it = iVarV.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0315a(((I) it).nextInt()));
        }
        return z.W0(arrayList);
    }

    @Override // p115m6.B
    public boolean b() {
        return true;
    }

    @Override // p115m6.B
    public List c(String name) {
        t.g(name, "name");
        List listU = Y6.n.u(Y6.n.s(this.f12436c.d(name), b.f12440a));
        if (listU.isEmpty()) {
            return null;
        }
        return listU;
    }

    @Override // p115m6.B
    public boolean contains(String str) {
        return InterfaceC1684m.b.a(this, str);
    }

    @Override // p115m6.B
    public String d(String name) {
        t.g(name, "name");
        CharSequence charSequenceC = this.f12436c.c(name);
        if (charSequenceC != null) {
            return charSequenceC.toString();
        }
        return null;
    }

    @Override // p115m6.B
    public void e(o oVar) {
        InterfaceC1684m.b.b(this, oVar);
    }

    public final Set g() {
        return (Set) this.f12437d.getValue();
    }

    @Override // p115m6.B
    public Set names() {
        return g();
    }
}
