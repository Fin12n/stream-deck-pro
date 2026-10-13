package s7;

import Z.JTT.ryTuoS;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class S extends N {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f33207h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(r7.c json, Q6.k nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(nodeConsumer, "nodeConsumer");
        this.f33207h = true;
    }

    @Override // s7.N, s7.AbstractC2897d
    public r7.j v0() {
        return new r7.w(A0());
    }

    @Override // s7.N, s7.AbstractC2897d
    public void z0(String key, r7.j jVar) {
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(jVar, ryTuoS.gre);
        if (!this.f33207h) {
            Map mapA0 = A0();
            String str = this.f33206g;
            if (str == null) {
                kotlin.jvm.internal.t.t("tag");
                str = null;
            }
            mapA0.put(str, jVar);
            this.f33207h = true;
            return;
        }
        if (jVar instanceof r7.y) {
            this.f33206g = ((r7.y) jVar).c();
            this.f33207h = false;
        } else {
            if (jVar instanceof r7.w) {
                throw C.d(r7.x.f32597a.getDescriptor());
            }
            if (!(jVar instanceof r7.d)) {
                throw new C6.m();
            }
            throw C.d(r7.e.f32539a.getDescriptor());
        }
    }
}
