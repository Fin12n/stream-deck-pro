package u7;

import J7.C1034e;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34539a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: u7.C$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0782a extends C {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f34540b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f34541c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ J7.g f34542d;

            public C0782a(w wVar, long j8, J7.g gVar) {
                this.f34540b = wVar;
                this.f34541c = j8;
                this.f34542d = gVar;
            }

            @Override // u7.C
            public long b() {
                return this.f34541c;
            }

            @Override // u7.C
            public J7.g c() {
                return this.f34542d;
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ C c(a aVar, byte[] bArr, w wVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                wVar = null;
            }
            return aVar.b(bArr, wVar);
        }

        public final C a(J7.g gVar, w wVar, long j8) {
            kotlin.jvm.internal.t.g(gVar, "<this>");
            return new C0782a(wVar, j8, gVar);
        }

        public final C b(byte[] bArr, w wVar) {
            kotlin.jvm.internal.t.g(bArr, "<this>");
            return a(new C1034e().write(bArr), wVar, bArr.length);
        }

        public a() {
        }
    }

    public abstract long b();

    public abstract J7.g c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        v7.d.m(c());
    }
}
