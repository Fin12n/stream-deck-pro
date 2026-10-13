package u7;

import D6.C0934n;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34802a = a.f34804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f34803b = new a.C0787a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f34804a = new a();

        /* JADX INFO: renamed from: u7.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0787a implements q {
            @Override // u7.q
            public List a(String hostname) throws UnknownHostException {
                kotlin.jvm.internal.t.g(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    kotlin.jvm.internal.t.f(allByName, "getAllByName(hostname)");
                    return C0934n.r0(allByName);
                } catch (NullPointerException e8) {
                    UnknownHostException unknownHostException = new UnknownHostException(yOZfxp.caDDNxSP + hostname);
                    unknownHostException.initCause(e8);
                    throw unknownHostException;
                }
            }
        }
    }

    List a(String str);
}
