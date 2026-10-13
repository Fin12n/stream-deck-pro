package Y5;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f12510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f12512e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CharSequence version, int i8, CharSequence statusText, e headers, Z5.b builder) {
        super(headers, builder);
        t.g(version, "version");
        t.g(statusText, "statusText");
        t.g(headers, "headers");
        t.g(builder, "builder");
        this.f12510c = version;
        this.f12511d = i8;
        this.f12512e = statusText;
    }

    public final int j() {
        return this.f12511d;
    }

    public final CharSequence o() {
        return this.f12512e;
    }

    public final CharSequence t() {
        return this.f12510c;
    }
}
