package M4;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportRuntime;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class N implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p087j5.b f5546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p087j5.b f5547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f5548c;

    public N(Context context, E e8) {
        this.f5548c = e8;
        p041e4.a aVar = p041e4.a.f20755g;
        TransportRuntime.f(context);
        final p032d4.g gVarG = TransportRuntime.c().g(aVar);
        if (aVar.a().contains(p032d4.b.b("json"))) {
            this.f5546a = new p024c5.v(new p087j5.b() { // from class: M4.K
                @Override // p087j5.b
                public final Object get() {
                    return gVarG.a("FIREBASE_ML_SDK", byte[].class, p032d4.b.b("json"), new p032d4.e() { // from class: M4.M
                        @Override // p032d4.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f5547b = new p024c5.v(new p087j5.b() { // from class: M4.L
            @Override // p087j5.b
            public final Object get() {
                return gVarG.a("FIREBASE_ML_SDK", byte[].class, p032d4.b.b("proto"), new p032d4.e() { // from class: M4.J
                    @Override // p032d4.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
