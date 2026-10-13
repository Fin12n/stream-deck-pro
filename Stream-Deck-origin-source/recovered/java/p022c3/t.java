package p022c3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import p004a3.J;
import p004a3.N;
import p031d3.a;
import p031d3.q;
import p076i3.s;
import p085j3.b;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class t extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f16198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f16199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f16200t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f16201u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f16202v;

    public t(J j8, b bVar, s sVar) {
        super(j8, bVar, sVar.b().b(), sVar.e().b(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f16198r = bVar;
        this.f16199s = sVar.h();
        this.f16200t = sVar.k();
        a aVarA = sVar.c().a();
        this.f16201u = aVarA;
        aVarA.a(this);
        bVar.i(aVarA);
    }

    @Override // p022c3.a, p058g3.f
    public void c(Object obj, c cVar) {
        super.c(obj, cVar);
        if (obj == N.f13148b) {
            this.f16201u.o(cVar);
            return;
        }
        if (obj == N.f13141K) {
            a aVar = this.f16202v;
            if (aVar != null) {
                this.f16198r.H(aVar);
            }
            if (cVar == null) {
                this.f16202v = null;
                return;
            }
            q qVar = new q(cVar);
            this.f16202v = qVar;
            qVar.a(this);
            this.f16198r.i(this.f16201u);
        }
    }

    @Override // p022c3.a, p022c3.e
    public void f(Canvas canvas, Matrix matrix, int i8) {
        if (this.f16200t) {
            return;
        }
        this.f16064i.setColor(((p031d3.b) this.f16201u).q());
        a aVar = this.f16202v;
        if (aVar != null) {
            this.f16064i.setColorFilter((ColorFilter) aVar.h());
        }
        super.f(canvas, matrix, i8);
    }

    @Override // p022c3.c
    public String getName() {
        return this.f16199s;
    }
}
