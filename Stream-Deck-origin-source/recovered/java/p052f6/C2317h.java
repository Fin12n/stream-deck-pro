package p052f6;

import C6.G;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import io.ktor.network.util.a;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import kotlin.jvm.internal.t;
import p205x6.i;
import p205x6.j;
import p205x6.k;
import p205x6.x;

/* JADX INFO: renamed from: f6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2317h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f22071a;

    public /* synthetic */ C2317h(j jVar) {
        this.f22071a = jVar;
    }

    public static final void A(j jVar, k packet) {
        t.g(packet, "packet");
        synchronized (jVar) {
            if (packet.T0()) {
                return;
            }
            jVar.o1(packet.j2());
            G g8 = G.f1419a;
        }
    }

    public static final /* synthetic */ C2317h b(j jVar) {
        return new C2317h(jVar);
    }

    public static void c(j jVar) {
        jVar.T0();
    }

    public static final byte[] o(j jVar, String hashName) {
        byte[] bArrDigest;
        t.g(hashName, "hashName");
        synchronized (jVar) {
            k kVarA = x.a(jVar);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(hashName);
                t.d(messageDigest);
                ByteBuffer byteBuffer = (ByteBuffer) a.a().b0();
                while (!kVarA.T0() && i.b(kVarA, byteBuffer) != -1) {
                    try {
                        byteBuffer.flip();
                        messageDigest.update(byteBuffer);
                        byteBuffer.clear();
                    } catch (Throwable th) {
                        a.a().H1(byteBuffer);
                        throw th;
                    }
                }
                bArrDigest = messageDigest.digest();
                a.a().H1(byteBuffer);
                kVarA.a2();
            } catch (Throwable th2) {
                kVarA.a2();
                throw th2;
            }
        }
        t.f(bArrDigest, "synchronized(state) {\n  …        }\n        }\n    }");
        return bArrDigest;
    }

    public static boolean t(j jVar, Object obj) {
        return (obj instanceof C2317h) && t.c(jVar, ((C2317h) obj).z());
    }

    public static int v(j jVar) {
        return jVar.hashCode();
    }

    public static String y(j jVar) {
        return "Digest(state=" + jVar + ')';
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c(this.f22071a);
    }

    public boolean equals(Object obj) {
        return t(this.f22071a, obj);
    }

    public int hashCode() {
        return v(this.f22071a);
    }

    public String toString() {
        return y(this.f22071a);
    }

    public final /* synthetic */ j z() {
        return this.f22071a;
    }

    public static j j(j jVar) {
        t.g(jVar, ZWZaxQrCHfNe.JltEAtOJddTnF);
        return jVar;
    }
}
