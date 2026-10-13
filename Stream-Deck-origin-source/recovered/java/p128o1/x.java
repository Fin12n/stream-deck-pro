package p128o1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30860c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f30861d = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30863b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final x a() {
            return x.f30861d;
        }

        public a() {
        }
    }

    public /* synthetic */ x(int i8, AbstractC2633k abstractC2633k) {
        this(i8);
    }

    public final int b() {
        return this.f30863b;
    }

    public final boolean c() {
        return this.f30862a;
    }

    public final x d(x xVar) {
        return xVar == null ? this : xVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f30862a == xVar.f30862a && C2742g.f(this.f30863b, xVar.f30863b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f30862a) * 31) + C2742g.g(this.f30863b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f30862a + ", emojiSupportMatch=" + ((Object) C2742g.h(this.f30863b)) + ')';
    }

    public /* synthetic */ x(int i8, boolean z8, AbstractC2633k abstractC2633k) {
        this(i8, z8);
    }

    public x(boolean z8) {
        this.f30862a = z8;
        this.f30863b = C2742g.f30803b.a();
    }

    public /* synthetic */ x(boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8);
    }

    public /* synthetic */ x(int i8, boolean z8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? C2742g.f30803b.a() : i8, (i9 & 2) != 0 ? false : z8, (AbstractC2633k) null);
    }

    public x(int i8, boolean z8) {
        this.f30862a = z8;
        this.f30863b = i8;
    }

    public x(int i8) {
        this.f30862a = false;
        this.f30863b = i8;
    }

    public /* synthetic */ x(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? C2742g.f30803b.a() : i8, (AbstractC2633k) null);
    }

    public x() {
        this(C2742g.f30803b.a(), false, (AbstractC2633k) null);
    }
}
