package M5;

import X5.C1692v;
import X5.InterfaceC1684m;
import X5.T;
import p115m6.C2691a;
import p115m6.InterfaceC2692b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L7.a f5671a = p157r6.a.a("io.ktor.client.plugins.HttpCallValidator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2691a f5672b = new C2691a("ExpectSuccessAttributeKey");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements T5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1692v f5673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f5674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC2692b f5675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC1684m f5676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ T5.d f5677e;

        public a(T5.d dVar) {
            this.f5677e = dVar;
            this.f5673a = dVar.h();
            this.f5674b = dVar.i().b();
            this.f5675c = dVar.c();
            this.f5676d = dVar.a().o();
        }

        @Override // T5.c
        public C1692v L0() {
            return this.f5673a;
        }

        @Override // T5.c
        public p007a6.c T0() {
            Object objD = this.f5677e.d();
            p007a6.c cVar = objD instanceof p007a6.c ? (p007a6.c) objD : null;
            if (cVar != null) {
                return cVar;
            }
            throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + this.f5677e.d()).toString());
        }

        @Override // X5.InterfaceC1689s
        public InterfaceC1684m a() {
            return this.f5676d;
        }

        @Override // T5.c
        public H5.b g1() {
            throw new IllegalStateException("Call is not initialized");
        }

        @Override // T5.c
        public InterfaceC2692b getAttributes() {
            return this.f5675c;
        }

        @Override // T5.c, p017b7.J
        public G6.g getCoroutineContext() {
            return T5.c.a.a(this);
        }

        @Override // T5.c
        public T o() {
            return this.f5674b;
        }
    }

    public static final a a(T5.d dVar) {
        return new a(dVar);
    }

    public static final void b(G5.b bVar, Q6.k block) {
        kotlin.jvm.internal.t.g(bVar, "<this>");
        kotlin.jvm.internal.t.g(block, "block");
        bVar.i(i.f5639d, block);
    }

    public static final C2691a e() {
        return f5672b;
    }
}
