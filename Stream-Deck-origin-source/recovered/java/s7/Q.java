package s7;

import java.util.List;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Q extends M {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r7.w f33202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f33203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f33204m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f33205n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(r7.c json, r7.w value) {
        super(json, value, null, null, 12, null);
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(value, "value");
        this.f33202k = value;
        List listR0 = D6.z.R0(v0().keySet());
        this.f33203l = listR0;
        this.f33204m = listR0.size() * 2;
        this.f33205n = -1;
    }

    @Override // s7.M, s7.AbstractC2896c, q7.O0, p7.c
    public void c(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
    }

    @Override // s7.M, q7.AbstractC2849l0
    public String c0(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return (String) this.f33203l.get(i8 / 2);
    }

    @Override // s7.M, s7.AbstractC2896c
    public r7.j g0(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        return this.f33205n % 2 == 0 ? r7.k.c(tag) : (r7.j) D6.M.h(v0(), tag);
    }

    @Override // s7.M, s7.AbstractC2896c
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public r7.w v0() {
        return this.f33202k;
    }

    @Override // s7.M, p7.c
    public int E(o7.f fVar) {
        kotlin.jvm.internal.t.g(fVar, QhsKALGiniuQ.BgIRAHwEQFXr);
        int i8 = this.f33205n;
        if (i8 >= this.f33204m - 1) {
            return -1;
        }
        int i9 = i8 + 1;
        this.f33205n = i9;
        return i9;
    }
}
