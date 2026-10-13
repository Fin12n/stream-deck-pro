package p056g1;

import androidx.compose.ui.graphics.c;
import androidx.compose.ui.graphics.f;

/* JADX INFO: renamed from: g1.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2360y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f23674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f23677g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f23671a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f23672b = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23678h = 8.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23679i = f.f14706b.a();

    public final void a(c cVar) {
        this.f23671a = cVar.A();
        this.f23672b = cVar.m1();
        this.f23673c = cVar.P0();
        this.f23674d = cVar.C0();
        this.f23675e = cVar.U0();
        this.f23676f = cVar.b0();
        this.f23677g = cVar.j0();
        this.f23678h = cVar.N0();
        this.f23679i = cVar.S0();
    }

    public final void b(C2360y c2360y) {
        this.f23671a = c2360y.f23671a;
        this.f23672b = c2360y.f23672b;
        this.f23673c = c2360y.f23673c;
        this.f23674d = c2360y.f23674d;
        this.f23675e = c2360y.f23675e;
        this.f23676f = c2360y.f23676f;
        this.f23677g = c2360y.f23677g;
        this.f23678h = c2360y.f23678h;
        this.f23679i = c2360y.f23679i;
    }

    public final boolean c(C2360y c2360y) {
        return this.f23671a == c2360y.f23671a && this.f23672b == c2360y.f23672b && this.f23673c == c2360y.f23673c && this.f23674d == c2360y.f23674d && this.f23675e == c2360y.f23675e && this.f23676f == c2360y.f23676f && this.f23677g == c2360y.f23677g && this.f23678h == c2360y.f23678h && f.e(this.f23679i, c2360y.f23679i);
    }
}
