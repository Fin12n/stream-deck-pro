package Z6;

import D6.AbstractC0921a;
import D6.AbstractC0922b;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f12960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f12961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f12962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f12963d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends AbstractC0922b {
        public a() {
        }

        public /* bridge */ int A(String str) {
            return super.lastIndexOf(str);
        }

        @Override // D6.AbstractC0921a
        public int c() {
            return i.this.e().groupCount() + 1;
        }

        @Override // D6.AbstractC0921a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return o((String) obj);
            }
            return false;
        }

        @Override // D6.AbstractC0922b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return y((String) obj);
            }
            return -1;
        }

        @Override // D6.AbstractC0922b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return A((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean o(String str) {
            return super.contains(str);
        }

        @Override // D6.AbstractC0922b, java.util.List
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public String get(int i8) {
            String strGroup = i.this.e().group(i8);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int y(String str) {
            return super.indexOf(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends AbstractC0921a implements g {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends kotlin.jvm.internal.u implements Q6.k {
            public a() {
                super(1);
            }

            public final f b(int i8) {
                return b.this.t(i8);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }

        public b() {
        }

        @Override // D6.AbstractC0921a
        public int c() {
            return i.this.e().groupCount() + 1;
        }

        @Override // D6.AbstractC0921a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return o((f) obj);
            }
            return false;
        }

        @Override // D6.AbstractC0921a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Y6.n.s(D6.z.Z(D6.r.o(this)), new a()).iterator();
        }

        public /* bridge */ boolean o(f fVar) {
            return super.contains(fVar);
        }

        public f t(int i8) {
            W6.i iVarI = k.i(i.this.e(), i8);
            if (iVarI.c().intValue() < 0) {
                return null;
            }
            String strGroup = i.this.e().group(i8);
            kotlin.jvm.internal.t.f(strGroup, "group(...)");
            return new f(strGroup, iVarI);
        }
    }

    public i(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.t.g(matcher, "matcher");
        kotlin.jvm.internal.t.g(input, "input");
        this.f12960a = matcher;
        this.f12961b = input;
        this.f12962c = new b();
    }

    @Override // Z6.h
    public h.b a() {
        return h.a.a(this);
    }

    @Override // Z6.h
    public List b() {
        if (this.f12963d == null) {
            this.f12963d = new a();
        }
        List list = this.f12963d;
        kotlin.jvm.internal.t.d(list);
        return list;
    }

    @Override // Z6.h
    public W6.i c() {
        return k.h(e());
    }

    public final MatchResult e() {
        return this.f12960a;
    }

    @Override // Z6.h
    public String getValue() {
        String strGroup = e().group();
        kotlin.jvm.internal.t.f(strGroup, "group(...)");
        return strGroup;
    }

    @Override // Z6.h
    public h next() {
        int iEnd = e().end() + (e().end() == e().start() ? 1 : 0);
        if (iEnd > this.f12961b.length()) {
            return null;
        }
        Matcher matcher = this.f12960a.pattern().matcher(this.f12961b);
        kotlin.jvm.internal.t.f(matcher, "matcher(...)");
        return k.f(matcher, iEnd, this.f12961b);
    }
}
