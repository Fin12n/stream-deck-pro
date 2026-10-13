package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC2633k;
import p056g1.U;
import p082j0.EnumC2612p;
import p082j0.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class FillElement extends U {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14440e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC2612p f14441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14443d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final FillElement a(float f8) {
            return new FillElement(EnumC2612p.Vertical, f8, "fillMaxHeight");
        }

        public final FillElement b(float f8) {
            return new FillElement(EnumC2612p.Both, f8, "fillMaxSize");
        }

        public final FillElement c(float f8) {
            return new FillElement(EnumC2612p.Horizontal, f8, "fillMaxWidth");
        }

        public a() {
        }
    }

    public FillElement(EnumC2612p enumC2612p, float f8, String str) {
        this.f14441b = enumC2612p;
        this.f14442c = f8;
        this.f14443d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f14441b == fillElement.f14441b && this.f14442c == fillElement.f14442c;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (this.f14441b.hashCode() * 31) + Float.hashCode(this.f14442c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public r k() {
        return new r(this.f14441b, this.f14442c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(r rVar) {
        rVar.d2(this.f14441b);
        rVar.e2(this.f14442c);
    }
}
