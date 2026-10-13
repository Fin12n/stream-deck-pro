package J7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F {
    public static final byte[] a(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        byte[] bytes = str.getBytes(Z6.c.f12941b);
        kotlin.jvm.internal.t.f(bytes, "getBytes(...)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        return new String(bArr, Z6.c.f12941b);
    }
}
