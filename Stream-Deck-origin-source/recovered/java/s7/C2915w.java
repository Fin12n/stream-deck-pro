package s7;

import java.io.InputStream;

/* JADX INFO: renamed from: s7.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2915w implements InterfaceC2913u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2906m f33305a;

    public C2915w(InputStream stream) {
        kotlin.jvm.internal.t.g(stream, "stream");
        this.f33305a = new C2906m(stream, Z6.c.f12941b);
    }

    @Override // s7.InterfaceC2913u
    public int a(char[] buffer, int i8, int i9) {
        kotlin.jvm.internal.t.g(buffer, "buffer");
        return this.f33305a.d(buffer, i8, i9);
    }
}
