package X5;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(String headerValue, int i8) {
        super("Header value '" + headerValue + "' contains illegal character '" + headerValue.charAt(i8) + "' (code " + (headerValue.charAt(i8) & 255) + ')');
        kotlin.jvm.internal.t.g(headerValue, "headerValue");
        this.f11737a = headerValue;
        this.f11738b = i8;
    }
}
