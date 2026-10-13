package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25425a = a.f25426a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f25426a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C6.j f25427b = C6.k.b(C0577a.f25428a);

        /* JADX INFO: renamed from: io.ktor.utils.io.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0577a extends kotlin.jvm.internal.u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0577a f25428a = new C0577a();

            public C0577a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2442c invoke() {
                InterfaceC2442c interfaceC2442cC = e.c(false, 1, null);
                k.a(interfaceC2442cC);
                return interfaceC2442cC;
            }
        }

        public final g a() {
            return (g) f25427b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public static /* synthetic */ Object a(g gVar, long j8, G6.d dVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readRemaining");
            }
            if ((i8 & 1) != 0) {
                j8 = Long.MAX_VALUE;
            }
            return gVar.D(j8, dVar);
        }
    }

    Object B(long j8, G6.d dVar);

    Object D(long j8, G6.d dVar);

    Object G(byte[] bArr, int i8, int i9, G6.d dVar);

    Object H(p213y6.a aVar, G6.d dVar);

    Object I(G6.d dVar);

    boolean J();

    Throwable a();

    Object e(Q6.o oVar, G6.d dVar);

    boolean f(Throwable th);

    int j();

    Object k(G6.d dVar);

    boolean m();

    Object o(G6.d dVar);

    Object p(G6.d dVar);

    Object q(int i8, G6.d dVar);

    Object r(Appendable appendable, int i8, G6.d dVar);

    Object s(ByteBuffer byteBuffer, long j8, long j9, long j10, long j11, G6.d dVar);

    Object t(ByteBuffer byteBuffer, G6.d dVar);

    Object x(byte[] bArr, int i8, int i9, G6.d dVar);

    Object z(int i8, G6.d dVar);
}
