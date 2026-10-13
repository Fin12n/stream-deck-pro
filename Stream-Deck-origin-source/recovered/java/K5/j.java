package K5;

import C6.C0918g;
import J7.C;
import J7.InterfaceC1035f;
import J7.p;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import u7.A;
import u7.w;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f4721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f4722c;

    public j(Long l8, Function0 block) {
        t.g(block, "block");
        this.f4721b = l8;
        this.f4722c = block;
    }

    @Override // u7.A
    public long a() {
        Long l8 = this.f4721b;
        if (l8 != null) {
            return l8.longValue();
        }
        return -1L;
    }

    @Override // u7.A
    public w b() {
        return null;
    }

    @Override // u7.A
    public boolean d() {
        return true;
    }

    @Override // u7.A
    public void e(InterfaceC1035f sink) throws IOException {
        Long lValueOf;
        t.g(sink, "sink");
        try {
            Throwable th = null;
            C cK = p.k(io.ktor.utils.io.jvm.javaio.b.d((io.ktor.utils.io.g) this.f4722c.invoke(), null, 1, null));
            try {
                lValueOf = Long.valueOf(sink.M(cK));
                if (cK != null) {
                    try {
                        cK.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                if (cK != null) {
                    try {
                        cK.close();
                    } catch (Throwable th4) {
                        C0918g.a(th3, th4);
                    }
                }
                th = th3;
                lValueOf = null;
            }
            if (th != null) {
                throw th;
            }
            t.d(lValueOf);
        } catch (IOException e8) {
            throw e8;
        } catch (Throwable th5) {
            throw new i(th5);
        }
    }
}
