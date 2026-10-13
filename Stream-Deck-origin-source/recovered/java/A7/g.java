package A7;

import java.util.List;
import kotlin.jvm.internal.t;
import u7.B;
import u7.InterfaceC3045e;
import u7.v;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7.e f868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z7.c f871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f876i;

    public g(z7.e call, List<? extends v> interceptors, int i8, z7.c cVar, z request, int i9, int i10, int i11) {
        t.g(call, "call");
        t.g(interceptors, "interceptors");
        t.g(request, "request");
        this.f868a = call;
        this.f869b = interceptors;
        this.f870c = i8;
        this.f871d = cVar;
        this.f872e = request;
        this.f873f = i9;
        this.f874g = i10;
        this.f875h = i11;
    }

    public static /* synthetic */ g d(g gVar, int i8, z7.c cVar, z zVar, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = gVar.f870c;
        }
        if ((i12 & 2) != 0) {
            cVar = gVar.f871d;
        }
        if ((i12 & 4) != 0) {
            zVar = gVar.f872e;
        }
        if ((i12 & 8) != 0) {
            i9 = gVar.f873f;
        }
        if ((i12 & 16) != 0) {
            i10 = gVar.f874g;
        }
        if ((i12 & 32) != 0) {
            i11 = gVar.f875h;
        }
        int i13 = i10;
        int i14 = i11;
        return gVar.c(i8, cVar, zVar, i9, i13, i14);
    }

    @Override // u7.v.a
    public B a(z request) {
        t.g(request, "request");
        if (this.f870c >= this.f869b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f876i++;
        z7.c cVar = this.f871d;
        if (cVar != null) {
            if (!cVar.j().g(request.j())) {
                throw new IllegalStateException(("network interceptor " + this.f869b.get(this.f870c - 1) + " must retain the same host and port").toString());
            }
            if (this.f876i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f869b.get(this.f870c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarD = d(this, this.f870c + 1, null, request, 0, 0, 0, 58, null);
        v vVar = (v) this.f869b.get(this.f870c);
        B bA = vVar.a(gVarD);
        if (bA == null) {
            throw new NullPointerException("interceptor " + vVar + " returned null");
        }
        if (this.f871d != null && this.f870c + 1 < this.f869b.size() && gVarD.f876i != 1) {
            throw new IllegalStateException(("network interceptor " + vVar + " must call proceed() exactly once").toString());
        }
        if (bA.b() != null) {
            return bA;
        }
        throw new IllegalStateException(("interceptor " + vVar + " returned a response with no body").toString());
    }

    @Override // u7.v.a
    public z b() {
        return this.f872e;
    }

    public final g c(int i8, z7.c cVar, z request, int i9, int i10, int i11) {
        t.g(request, "request");
        return new g(this.f868a, this.f869b, i8, cVar, request, i9, i10, i11);
    }

    @Override // u7.v.a
    public InterfaceC3045e call() {
        return this.f868a;
    }

    public final z7.e e() {
        return this.f868a;
    }

    public final int f() {
        return this.f873f;
    }

    public final z7.c g() {
        return this.f871d;
    }

    public final int h() {
        return this.f874g;
    }

    public final z i() {
        return this.f872e;
    }

    public final int j() {
        return this.f875h;
    }

    public int k() {
        return this.f874g;
    }
}
