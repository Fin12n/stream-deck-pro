package Y5;

import C6.o;
import C6.v;
import D6.r;
import D6.z;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0317c f12469e = new C0317c(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f12470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f12471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f12472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z5.a f12473i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12477d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12478a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(o it) {
            t.g(it, "it");
            return Integer.valueOf(((String) it.c()).length());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12479a = new b();

        public b() {
            super(2);
        }

        public final Character b(o t8, int i8) {
            t.g(t8, "t");
            return Character.valueOf(((String) t8.c()).charAt(i8));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((o) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: Y5.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0317c {

        /* JADX INFO: renamed from: Y5.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f12480a = new a();

            public a() {
                super(2);
            }

            public final Boolean b(char c8, int i8) {
                return Boolean.FALSE;
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Character) obj).charValue(), ((Number) obj2).intValue());
            }
        }

        /* JADX INFO: renamed from: Y5.c$c$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f12481a = new b();

            public b() {
                super(2);
            }

            public final Boolean b(char c8, int i8) {
                return Boolean.FALSE;
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Character) obj).charValue(), ((Number) obj2).intValue());
            }
        }

        public /* synthetic */ C0317c(AbstractC2633k abstractC2633k) {
            this();
        }

        public final c a() {
            return c.f12470f;
        }

        public final c b() {
            return c.f12471g;
        }

        public final c c(CharSequence charSequence) {
            if (charSequence == null) {
                return null;
            }
            List listB = Z5.a.b(c.f12473i, charSequence, 0, 0, true, a.f12480a, 6, null);
            return listB.size() == 1 ? (c) ((o) listB.get(0)).d() : d(charSequence);
        }

        public final c d(CharSequence charSequence) {
            int length = charSequence.length();
            c cVarB = null;
            ArrayList arrayList = null;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                while (true) {
                    char cCharAt = charSequence.charAt(i8);
                    if (cCharAt != ' ' && cCharAt != ',') {
                        i9 = i8;
                        i8 = i9;
                        break;
                    }
                    i8++;
                    if (i8 >= length) {
                        i8 = i8;
                        break;
                    }
                }
                while (i8 < length) {
                    char cCharAt2 = charSequence.charAt(i8);
                    if (cCharAt2 == ' ' || cCharAt2 == ',') {
                        break;
                    }
                    i8++;
                }
                o oVar = (o) z.G0(c.f12473i.a(charSequence, i9, i8, true, b.f12481a));
                if (oVar == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(i9, i8).toString());
                } else if (cVarB == null) {
                    cVarB = (c) oVar.d();
                } else {
                    boolean z8 = true;
                    boolean z9 = cVarB.e() || ((c) oVar.d()).e();
                    boolean z10 = cVarB.f() || ((c) oVar.d()).f();
                    if (!cVarB.g() && !((c) oVar.d()).g()) {
                        z8 = false;
                    }
                    cVarB = new c(z9, z10, z8, r.n());
                }
            }
            if (cVarB == null) {
                cVarB = b();
            }
            return arrayList == null ? cVarB : new c(cVarB.e(), cVarB.f(), cVarB.g(), arrayList);
        }

        public C0317c() {
        }
    }

    static {
        boolean z8 = false;
        c cVar = new c(true, z8, false, null, 14, null);
        f12470f = cVar;
        boolean z9 = false;
        c cVar2 = new c(z8, true, z9, null, 13, null);
        f12471g = cVar2;
        c cVar3 = new c(false, z9, true, null, 11, null);
        f12472h = cVar3;
        f12473i = Z5.a.f12907b.b(r.q(v.a("close", cVar), v.a("keep-alive", cVar2), v.a("upgrade", cVar3)), a.f12478a, b.f12479a);
    }

    public c() {
        this(false, false, false, null, 15, null);
    }

    public final String d() throws IOException {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(this.f12477d.size() + 3);
        if (this.f12474a) {
            arrayList.add("close");
        }
        if (this.f12475b) {
            arrayList.add("keep-alive");
        }
        if (this.f12476c) {
            arrayList.add("Upgrade");
        }
        if (!this.f12477d.isEmpty()) {
            arrayList.addAll(this.f12477d);
        }
        z.o0(arrayList, sb, (124 & 2) != 0 ? ", " : null, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean e() {
        return this.f12474a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12474a == cVar.f12474a && this.f12475b == cVar.f12475b && this.f12476c == cVar.f12476c && t.c(this.f12477d, cVar.f12477d);
    }

    public final boolean f() {
        return this.f12475b;
    }

    public final boolean g() {
        return this.f12476c;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f12474a) * 31) + Boolean.hashCode(this.f12475b)) * 31) + Boolean.hashCode(this.f12476c)) * 31) + this.f12477d.hashCode();
    }

    public c(boolean z8, boolean z9, boolean z10, List<String> extraOptions) {
        t.g(extraOptions, "extraOptions");
        this.f12474a = z8;
        this.f12475b = z9;
        this.f12476c = z10;
        this.f12477d = extraOptions;
    }

    public String toString() {
        if (!this.f12477d.isEmpty()) {
            return d();
        }
        boolean z8 = this.f12474a;
        if (z8 && !this.f12475b && !this.f12476c) {
            return "close";
        }
        if (z8 || !this.f12475b || this.f12476c) {
            return (!z8 && this.f12475b && this.f12476c) ? ZWZaxQrCHfNe.uvfBkZXWt : d();
        }
        return "keep-alive";
    }

    public /* synthetic */ c(boolean z8, boolean z9, boolean z10, List list, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? false : z9, (i8 & 4) != 0 ? false : z10, (i8 & 8) != 0 ? r.n() : list);
    }
}
