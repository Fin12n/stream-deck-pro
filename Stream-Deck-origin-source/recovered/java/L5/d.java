package L5;

import M5.v;
import Q6.k;
import T5.e;
import io.ktor.utils.io.InterfaceC2442c;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p115m6.H;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f5053a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(1);
            this.f5053a = eVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            return (th != null ? H.a(th) : null) instanceof SocketTimeoutException ? v.c(this.f5053a, th) : th;
        }
    }

    public static final InterfaceC2442c a(e request) {
        t.g(request, "request");
        return io.ktor.utils.io.e.d(false, new a(request), 1, null);
    }
}
