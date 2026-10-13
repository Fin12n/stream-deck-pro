package s7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O extends AbstractC2896c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r7.d f33198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f33199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33200h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(r7.c json, r7.d value) {
        super(json, value, null);
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(value, "value");
        this.f33198f = value;
        this.f33199g = v0().size();
        this.f33200h = -1;
    }

    @Override // p7.c
    public int E(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        int i8 = this.f33200h;
        if (i8 >= this.f33199g - 1) {
            return -1;
        }
        int i9 = i8 + 1;
        this.f33200h = i9;
        return i9;
    }

    @Override // q7.AbstractC2849l0
    public String c0(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return String.valueOf(i8);
    }

    @Override // s7.AbstractC2896c
    public r7.j g0(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        return v0().get(Integer.parseInt(tag));
    }

    @Override // s7.AbstractC2896c
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public r7.d v0() {
        return this.f33198f;
    }
}
