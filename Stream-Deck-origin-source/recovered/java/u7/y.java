package u7;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34909b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34917a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final y a(String protocol) throws IOException {
            kotlin.jvm.internal.t.g(protocol, "protocol");
            y yVar = y.HTTP_1_0;
            if (kotlin.jvm.internal.t.c(protocol, yVar.f34917a)) {
                return yVar;
            }
            y yVar2 = y.HTTP_1_1;
            if (kotlin.jvm.internal.t.c(protocol, yVar2.f34917a)) {
                return yVar2;
            }
            y yVar3 = y.H2_PRIOR_KNOWLEDGE;
            if (kotlin.jvm.internal.t.c(protocol, yVar3.f34917a)) {
                return yVar3;
            }
            y yVar4 = y.HTTP_2;
            if (kotlin.jvm.internal.t.c(protocol, yVar4.f34917a)) {
                return yVar4;
            }
            y yVar5 = y.SPDY_3;
            if (kotlin.jvm.internal.t.c(protocol, yVar5.f34917a)) {
                return yVar5;
            }
            y yVar6 = y.QUIC;
            if (kotlin.jvm.internal.t.c(protocol, yVar6.f34917a)) {
                return yVar6;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        public a() {
        }
    }

    y(String str) {
        this.f34917a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f34917a;
    }
}
