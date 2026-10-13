package F7;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f2452j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f2453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f2454i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ k b(a aVar, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final k a(String packageName) {
            t.g(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                t.e(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                t.e(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                t.f(paramsClass, "paramsClass");
                return new l(cls, cls2, paramsClass);
            } catch (Exception e8) {
                E7.h.f2311a.g().k("unable to load android socket classes", 5, e8);
                return null;
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        t.g(sslSocketClass, "sslSocketClass");
        t.g(sslSocketFactoryClass, "sslSocketFactoryClass");
        t.g(paramClass, "paramClass");
        this.f2453h = sslSocketFactoryClass;
        this.f2454i = paramClass;
    }
}
