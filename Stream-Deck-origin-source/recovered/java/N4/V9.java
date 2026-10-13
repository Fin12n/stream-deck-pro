package N4;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportRuntime;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class V9 implements D9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p087j5.b f6602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p087j5.b f6603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F9 f6604c;

    public V9(Context context, F9 f9) {
        this.f6604c = f9;
        p041e4.a aVar = p041e4.a.f20755g;
        TransportRuntime.f(context);
        final p032d4.g gVarG = TransportRuntime.c().g(aVar);
        if (aVar.a().contains(p032d4.b.b("json"))) {
            this.f6602a = new p024c5.v(new p087j5.b() { // from class: N4.S9
                @Override // p087j5.b
                public final Object get() {
                    return gVarG.a("FIREBASE_ML_SDK", byte[].class, p032d4.b.b("json"), new p032d4.e() { // from class: N4.U9
                        @Override // p032d4.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f6603b = new p024c5.v(new p087j5.b() { // from class: N4.T9
            @Override // p087j5.b
            public final Object get() {
                return gVarG.a("FIREBASE_ML_SDK", byte[].class, p032d4.b.b("proto"), new p032d4.e() { // from class: N4.R9
                    @Override // p032d4.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static p032d4.c b(F9 f9, C9 c9) {
        int iA = f9.a();
        return c9.zza() != 0 ? p032d4.c.d(c9.m(iA, false)) : p032d4.c.e(c9.m(iA, false));
    }

    @Override // N4.D9
    public final void a(C9 c9) {
        if (this.f6604c.a() != 0) {
            ((p032d4.f) this.f6603b.get()).a(b(this.f6604c, c9));
            return;
        }
        p087j5.b bVar = this.f6602a;
        if (bVar != null) {
            ((p032d4.f) bVar.get()).a(b(this.f6604c, c9));
        }
    }
}
