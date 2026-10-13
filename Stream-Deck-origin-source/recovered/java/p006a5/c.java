package p006a5;

import Z4.b;
import java.security.GeneralSecurityException;
import p015b5.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.EnumC0322b f13420b = b.EnumC0322b.f12904a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f13421a;

    public c(byte[] bArr) {
        if (!f13420b.a()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.f13421a = a.a(bArr);
    }

    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!a.s(bArr2, bArr, this.f13421a.c())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
