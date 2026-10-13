package p076i3;

import java.util.List;
import p004a3.C1705k;
import p004a3.J;
import p022c3.i;
import p067h3.b;
import p067h3.c;
import p067h3.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f24605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f24606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f24607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p067h3.f f24608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p067h3.f f24609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f24610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s.b f24611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s.c f24612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f24613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f24614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f24615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f24616m;

    public f(String str, g gVar, c cVar, d dVar, p067h3.f fVar, p067h3.f fVar2, b bVar, s.b bVar2, s.c cVar2, float f8, List<b> list, b bVar3, boolean z8) {
        this.f24604a = str;
        this.f24605b = gVar;
        this.f24606c = cVar;
        this.f24607d = dVar;
        this.f24608e = fVar;
        this.f24609f = fVar2;
        this.f24610g = bVar;
        this.f24611h = bVar2;
        this.f24612i = cVar2;
        this.f24613j = f8;
        this.f24614k = list;
        this.f24615l = bVar3;
        this.f24616m = z8;
    }

    @Override // p076i3.c
    public p022c3.c a(J j8, C1705k c1705k, p085j3.b bVar) {
        return new i(j8, bVar, this);
    }

    public s.b b() {
        return this.f24611h;
    }

    public b c() {
        return this.f24615l;
    }

    public p067h3.f d() {
        return this.f24609f;
    }

    public c e() {
        return this.f24606c;
    }

    public g f() {
        return this.f24605b;
    }

    public s.c g() {
        return this.f24612i;
    }

    public List h() {
        return this.f24614k;
    }

    public float i() {
        return this.f24613j;
    }

    public String j() {
        return this.f24604a;
    }

    public d k() {
        return this.f24607d;
    }

    public p067h3.f l() {
        return this.f24608e;
    }

    public b m() {
        return this.f24610g;
    }

    public boolean n() {
        return this.f24616m;
    }
}
