package M5;

import C6.G;
import X5.C1674c;
import X5.C1688q;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.K;
import p017b7.InterfaceC1815v0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends a6.c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f5630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1674c f5631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f5632c;

        public a(T5.d dVar, C1674c c1674c, Object obj) {
            this.f5632c = obj;
            String strI = dVar.a().i(C1688q.f11910a.i());
            this.f5630a = strI != null ? Long.valueOf(Long.parseLong(strI)) : null;
            this.f5631b = c1674c == null ? C1674c.a.f11811a.b() : c1674c;
        }

        @Override // p007a6.c
        public Long a() {
            return this.f5630a;
        }

        @Override // p007a6.c
        public C1674c b() {
            return this.f5631b;
        }

        @Override // a6.c.d
        public io.ktor.utils.io.g d() {
            return io.ktor.utils.io.jvm.javaio.h.b((InputStream) this.f5632c, null, null, 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.l implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f5635c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends InputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InputStream f5636a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p173t6.e f5637b;

            public a(InputStream inputStream, p173t6.e eVar) {
                this.f5636a = inputStream;
                this.f5637b = eVar;
            }

            @Override // java.io.InputStream
            public int available() {
                return this.f5636a.available();
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                this.f5636a.close();
                U5.e.c(((H5.b) this.f5637b.d()).g());
            }

            @Override // java.io.InputStream
            public int read() {
                return this.f5636a.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] b8, int i8, int i9) {
                kotlin.jvm.internal.t.g(b8, "b");
                return this.f5636a.read(b8, i8, i9);
            }
        }

        public b(G6.d dVar) {
            super(3, dVar);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p173t6.e eVar, U5.d dVar, G6.d dVar2) {
            b bVar = new b(dVar2);
            bVar.f5634b = eVar;
            bVar.f5635c = dVar;
            return bVar.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5633a;
            if (i8 == 0) {
                C6.r.b(obj);
                p173t6.e eVar = (p173t6.e) this.f5634b;
                U5.d dVar = (U5.d) this.f5635c;
                p181u6.a aVarA = dVar.a();
                Object objB = dVar.b();
                if (!(objB instanceof io.ktor.utils.io.g)) {
                    return G.f1419a;
                }
                if (kotlin.jvm.internal.t.c(aVarA.b(), K.b(InputStream.class))) {
                    U5.d dVar2 = new U5.d(aVarA, new a(io.ktor.utils.io.jvm.javaio.b.c((io.ktor.utils.io.g) objB, (InterfaceC1815v0) ((H5.b) eVar.d()).getCoroutineContext().A(InterfaceC1815v0.f15985O)), eVar));
                    this.f5634b = null;
                    this.f5633a = 1;
                    if (eVar.h(dVar2, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    public static final void b(G5.a aVar) {
        kotlin.jvm.internal.t.g(aVar, "<this>");
        aVar.Y().l(U5.f.f10219h.a(), new b(null));
    }

    public static final p007a6.c a(C1674c c1674c, T5.d context, Object obj) {
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(obj, uYOhHhTXuF.nDEtExruKetiyF);
        if (obj instanceof InputStream) {
            return new a(context, c1674c, obj);
        }
        return null;
    }
}
