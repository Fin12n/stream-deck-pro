package s7;

/* JADX INFO: renamed from: s7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2910q extends C2907n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.c f33302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2910q(InterfaceC2914v writer, r7.c json) {
        super(writer);
        kotlin.jvm.internal.t.g(writer, "writer");
        kotlin.jvm.internal.t.g(json, "json");
        this.f33302c = json;
    }

    @Override // s7.C2907n
    public void b() {
        o(true);
        this.f33303d++;
    }

    @Override // s7.C2907n
    public void c() {
        o(false);
        k("\n");
        int i8 = this.f33303d;
        for (int i9 = 0; i9 < i8; i9++) {
            k(this.f33302c.e().m());
        }
    }

    @Override // s7.C2907n
    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // s7.C2907n
    public void p() {
        f(' ');
    }

    @Override // s7.C2907n
    public void q() {
        this.f33303d--;
    }
}
