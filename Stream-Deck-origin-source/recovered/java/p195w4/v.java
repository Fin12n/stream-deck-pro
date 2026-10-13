package p195w4;

import H4.a;
import H4.b;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p219z4.AbstractC3207p;
import p219z4.N;
import p219z4.m0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37114a;

    public v(byte[] bArr) {
        AbstractC3207p.a(bArr.length == 25);
        this.f37114a = Arrays.hashCode(bArr);
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }

    public abstract byte[] P();

    public final boolean equals(Object obj) {
        a aVarK;
        if (obj != null && (obj instanceof N)) {
            try {
                N n8 = (N) obj;
                if (n8.j() == this.f37114a && (aVarK = n8.k()) != null) {
                    return Arrays.equals(P(), (byte[]) b.d(aVarK));
                }
                return false;
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37114a;
    }

    @Override // p219z4.N
    public final int j() {
        return this.f37114a;
    }

    @Override // p219z4.N
    public final a k() {
        return b.P(P());
    }
}
