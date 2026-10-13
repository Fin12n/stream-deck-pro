package p024c5;

import p087j5.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1826c f16241b;

    public i(n nVar, C1826c c1826c) {
        this.f16240a = nVar;
        this.f16241b = c1826c;
    }

    public static b a(n nVar, C1826c c1826c) {
        return new i(nVar, c1826c);
    }

    @Override // p087j5.b
    public Object get() {
        n nVar = this.f16240a;
        C1826c c1826c = this.f16241b;
        return c1826c.d().a(new C(c1826c, nVar));
    }
}
