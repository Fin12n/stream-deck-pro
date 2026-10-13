package O4;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportRuntime;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D5 implements InterfaceC1491q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p087j5.b f7632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p087j5.b f7633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1504s5 f7634c;

    public D5(Context context, AbstractC1504s5 abstractC1504s5) {
        this.f7634c = abstractC1504s5;
        p041e4.a aVar = p041e4.a.f20755g;
        TransportRuntime.f(context);
        final p032d4.g gVarG = TransportRuntime.c().g(aVar);
        if (aVar.a().contains(p032d4.b.b("json"))) {
            this.f7632a = new p024c5.v(new p087j5.b() { // from class: O4.A5
                @Override // p087j5.b
                public final Object get() {
                    return gVarG.a("FIREBASE_ML_SDK", byte[].class, p032d4.b.b("json"), new p032d4.e() { // from class: O4.C5
                        @Override // p032d4.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f7633b = new p024c5.v(new p087j5.b() { // from class: O4.B5
            @Override // p087j5.b
            public final Object get() {
                return gVarG.a("FIREBASE_ML_SDK", byte[].class, p032d4.b.b("proto"), new p032d4.e() { // from class: O4.z5
                    @Override // p032d4.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static p032d4.c b(AbstractC1504s5 abstractC1504s5, InterfaceC1484p5 interfaceC1484p5) {
        return p032d4.c.e(interfaceC1484p5.c(abstractC1504s5.a(), false));
    }

    @Override // O4.InterfaceC1491q5
    public final void a(InterfaceC1484p5 interfaceC1484p5) {
        if (this.f7634c.a() != 0) {
            ((p032d4.f) this.f7633b.get()).a(b(this.f7634c, interfaceC1484p5));
            return;
        }
        p087j5.b bVar = this.f7632a;
        if (bVar != null) {
            ((p032d4.f) bVar.get()).a(b(this.f7634c, interfaceC1484p5));
        }
    }
}
