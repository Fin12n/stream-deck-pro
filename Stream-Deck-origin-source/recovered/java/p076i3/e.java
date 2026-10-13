package p076i3;

import android.graphics.Path;
import p004a3.C1705k;
import p004a3.J;
import p022c3.h;
import p067h3.b;
import p067h3.c;
import p067h3.d;
import p067h3.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f24594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f24595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f24596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f24597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f24598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f24599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f24601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f24602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f24603j;

    public e(String str, g gVar, Path.FillType fillType, c cVar, d dVar, f fVar, f fVar2, b bVar, b bVar2, boolean z8) {
        this.f24594a = gVar;
        this.f24595b = fillType;
        this.f24596c = cVar;
        this.f24597d = dVar;
        this.f24598e = fVar;
        this.f24599f = fVar2;
        this.f24600g = str;
        this.f24601h = bVar;
        this.f24602i = bVar2;
        this.f24603j = z8;
    }

    @Override // p076i3.c
    public p022c3.c a(J j8, C1705k c1705k, p085j3.b bVar) {
        return new h(j8, c1705k, bVar, this);
    }

    public f b() {
        return this.f24599f;
    }

    public Path.FillType c() {
        return this.f24595b;
    }

    public c d() {
        return this.f24596c;
    }

    public g e() {
        return this.f24594a;
    }

    public String f() {
        return this.f24600g;
    }

    public d g() {
        return this.f24597d;
    }

    public f h() {
        return this.f24598e;
    }

    public boolean i() {
        return this.f24603j;
    }
}
