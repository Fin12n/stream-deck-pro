package p059g4;

import java.util.Arrays;
import p032d4.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f23755b;

    public e(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f23754a = bVar;
        this.f23755b = bArr;
    }

    public byte[] a() {
        return this.f23755b;
    }

    public b b() {
        return this.f23754a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f23754a.equals(eVar.f23754a)) {
            return Arrays.equals(this.f23755b, eVar.f23755b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23754a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23755b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f23754a + ", bytes=[...]}";
    }
}
