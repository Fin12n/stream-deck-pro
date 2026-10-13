package r7;

import androidx.startup.TrZh.ZWZaxQrCHfNe;
import kotlin.jvm.internal.AbstractC2633k;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f32565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f32566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f32567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f32568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f32569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f32570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f32571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f32572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f32573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EnumC2877a f32574o;

    public h() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, null, 65535, null);
    }

    public final boolean a() {
        return this.f32570k;
    }

    public final boolean b() {
        return this.f32563d;
    }

    public final boolean c() {
        return this.f32573n;
    }

    public final String d() {
        return this.f32569j;
    }

    public final EnumC2877a e() {
        return this.f32574o;
    }

    public final boolean f() {
        return this.f32567h;
    }

    public final boolean g() {
        return this.f32572m;
    }

    public final boolean h() {
        return this.f32560a;
    }

    public final boolean i() {
        return this.f32565f;
    }

    public final boolean j() {
        return this.f32561b;
    }

    public final t k() {
        return null;
    }

    public final boolean l() {
        return this.f32564e;
    }

    public final String m() {
        return this.f32566g;
    }

    public final boolean n() {
        return this.f32571l;
    }

    public final boolean o() {
        return this.f32568i;
    }

    public final boolean p() {
        return this.f32562c;
    }

    public h(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str, boolean z14, boolean z15, String classDiscriminator, boolean z16, boolean z17, t tVar, boolean z18, boolean z19, EnumC2877a classDiscriminatorMode) {
        kotlin.jvm.internal.t.g(str, QhsKALGiniuQ.QAmBykTJiQjyq);
        kotlin.jvm.internal.t.g(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.t.g(classDiscriminatorMode, "classDiscriminatorMode");
        this.f32560a = z8;
        this.f32561b = z9;
        this.f32562c = z10;
        this.f32563d = z11;
        this.f32564e = z12;
        this.f32565f = z13;
        this.f32566g = str;
        this.f32567h = z14;
        this.f32568i = z15;
        this.f32569j = classDiscriminator;
        this.f32570k = z16;
        this.f32571l = z17;
        this.f32572m = z18;
        this.f32573n = z19;
        this.f32574o = classDiscriminatorMode;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f32560a + ", ignoreUnknownKeys=" + this.f32561b + ", isLenient=" + this.f32562c + ", allowStructuredMapKeys=" + this.f32563d + ", prettyPrint=" + this.f32564e + ", explicitNulls=" + this.f32565f + ", prettyPrintIndent='" + this.f32566g + "', coerceInputValues=" + this.f32567h + ", useArrayPolymorphism=" + this.f32568i + ", classDiscriminator='" + this.f32569j + "', allowSpecialFloatingPointValues=" + this.f32570k + ", useAlternativeNames=" + this.f32571l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f32572m + ZWZaxQrCHfNe.kcvstvFBAm + this.f32573n + ", classDiscriminatorMode=" + this.f32574o + ')';
    }

    public /* synthetic */ h(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str, boolean z14, boolean z15, String str2, boolean z16, boolean z17, t tVar, boolean z18, boolean z19, EnumC2877a enumC2877a, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? false : z9, (i8 & 4) != 0 ? false : z10, (i8 & 8) != 0 ? false : z11, (i8 & 16) != 0 ? false : z12, (i8 & 32) != 0 ? true : z13, (i8 & 64) != 0 ? "    " : str, (i8 & 128) != 0 ? false : z14, (i8 & 256) != 0 ? false : z15, (i8 & 512) != 0 ? "type" : str2, (i8 & 1024) != 0 ? false : z16, (i8 & 2048) == 0 ? z17 : true, (i8 & 4096) != 0 ? null : tVar, (i8 & 8192) != 0 ? false : z18, (i8 & 16384) != 0 ? false : z19, (i8 & 32768) != 0 ? EnumC2877a.POLYMORPHIC : enumC2877a);
    }
}
