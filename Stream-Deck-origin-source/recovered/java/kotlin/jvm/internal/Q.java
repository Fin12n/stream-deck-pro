package kotlin.jvm.internal;

import java.util.List;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Q implements X6.m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f28785e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X6.f f28786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f28787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X6.m f28788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28789d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28790a;

        static {
            int[] iArr = new int[X6.o.values().length];
            try {
                iArr[X6.o.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[X6.o.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[X6.o.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28790a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.k {
        public c() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(X6.n it) {
            t.g(it, "it");
            return Q.this.i(it);
        }
    }

    public Q(X6.f classifier, List<X6.n> arguments, X6.m mVar, int i8) {
        t.g(classifier, "classifier");
        t.g(arguments, "arguments");
        this.f28786a = classifier;
        this.f28787b = arguments;
        this.f28788c = mVar;
        this.f28789d = i8;
    }

    @Override // X6.m
    public boolean c() {
        return (this.f28789d & 1) != 0;
    }

    @Override // X6.m
    public List e() {
        return this.f28787b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q8 = (Q) obj;
        return t.c(f(), q8.f()) && t.c(e(), q8.e()) && t.c(this.f28788c, q8.f28788c) && this.f28789d == q8.f28789d;
    }

    @Override // X6.m
    public X6.f f() {
        return this.f28786a;
    }

    public int hashCode() {
        return (((f().hashCode() * 31) + e().hashCode()) * 31) + Integer.hashCode(this.f28789d);
    }

    public final String j(boolean z8) {
        String name;
        X6.f fVarF = f();
        X6.d dVar = fVarF instanceof X6.d ? (X6.d) fVarF : null;
        Class clsA = dVar != null ? P6.a.a(dVar) : null;
        if (clsA == null) {
            name = f().toString();
        } else if ((this.f28789d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsA.isArray()) {
            name = k(clsA);
        } else if (z8 && clsA.isPrimitive()) {
            X6.f fVarF2 = f();
            t.e(fVarF2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = P6.a.b((X6.d) fVarF2).getName();
        } else {
            name = clsA.getName();
        }
        String str = name + (e().isEmpty() ? "" : D6.z.r0(e(), ", ", "<", ">", 0, null, new c(), 24, null)) + (c() ? "?" : "");
        X6.m mVar = this.f28788c;
        if (!(mVar instanceof Q)) {
            return str;
        }
        String strJ = ((Q) mVar).j(true);
        if (t.c(strJ, str)) {
            return str;
        }
        if (t.c(strJ, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strJ + ')';
    }

    public final String k(Class cls) {
        if (t.c(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (t.c(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (t.c(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (t.c(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (t.c(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (t.c(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (t.c(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return t.c(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public String toString() {
        return j(false) + " (Kotlin reflection is not available)";
    }

    public final String i(X6.n nVar) {
        Q q8;
        String strValueOf;
        if (nVar.d() == null) {
            return hJroAgFztiMK.VsfpArNSdHPcekS;
        }
        X6.m mVarC = nVar.c();
        if (mVarC instanceof Q) {
            q8 = (Q) mVarC;
        } else {
            q8 = null;
        }
        if (q8 == null || (strValueOf = q8.j(true)) == null) {
            strValueOf = String.valueOf(nVar.c());
        }
        int i8 = b.f28790a[nVar.d().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return "out " + strValueOf;
                }
                throw new C6.m();
            }
            return "in " + strValueOf;
        }
        return strValueOf;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Q(X6.f classifier, List<X6.n> arguments, boolean z8) {
        this(classifier, arguments, null, z8 ? 1 : 0);
        t.g(classifier, "classifier");
        t.g(arguments, "arguments");
    }
}
