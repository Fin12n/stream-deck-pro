package p022c3;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p004a3.J;
import p004a3.N;
import p031d3.a;
import p058g3.e;
import p076i3.b;
import p076i3.t;
import p121n3.i;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f implements m, a.b, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f16089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f16090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f16091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f16092f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16094h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16087a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f16093g = new b();

    public f(J j8, p085j3.b bVar, b bVar2) {
        this.f16088b = bVar2.b();
        this.f16089c = j8;
        a aVarA = bVar2.d().a();
        this.f16090d = aVarA;
        a aVarA2 = bVar2.c().a();
        this.f16091e = aVarA2;
        this.f16092f = bVar2;
        bVar.i(aVarA);
        bVar.i(aVarA2);
        aVarA.a(this);
        aVarA2.a(this);
    }

    @Override // d3.a.b
    public void a() {
        e();
    }

    @Override // p022c3.c
    public void b(List list, List list2) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            c cVar = (c) list.get(i8);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f16093g.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // p058g3.f
    public void c(Object obj, c cVar) {
        if (obj == N.f13157k) {
            this.f16090d.o(cVar);
        } else if (obj == N.f13160n) {
            this.f16091e.o(cVar);
        }
    }

    public final void e() {
        this.f16094h = false;
        this.f16089c.invalidateSelf();
    }

    @Override // p058g3.f
    public void g(e eVar, int i8, List list, e eVar2) {
        i.k(eVar, i8, list, eVar2, this);
    }

    @Override // p022c3.c
    public String getName() {
        return this.f16088b;
    }

    @Override // p022c3.m
    public Path w() {
        if (this.f16094h) {
            return this.f16087a;
        }
        this.f16087a.reset();
        if (this.f16092f.e()) {
            this.f16094h = true;
            return this.f16087a;
        }
        PointF pointF = (PointF) this.f16090d.h();
        float f8 = pointF.x / 2.0f;
        float f9 = pointF.y / 2.0f;
        float f10 = f8 * 0.55228f;
        float f11 = 0.55228f * f9;
        this.f16087a.reset();
        if (this.f16092f.f()) {
            float f12 = -f9;
            this.f16087a.moveTo(0.0f, f12);
            float f13 = 0.0f - f10;
            float f14 = -f8;
            float f15 = 0.0f - f11;
            this.f16087a.cubicTo(f13, f12, f14, f15, f14, 0.0f);
            float f16 = f11 + 0.0f;
            this.f16087a.cubicTo(f14, f16, f13, f9, 0.0f, f9);
            float f17 = f10 + 0.0f;
            this.f16087a.cubicTo(f17, f9, f8, f16, f8, 0.0f);
            this.f16087a.cubicTo(f8, f15, f17, f12, 0.0f, f12);
        } else {
            float f18 = -f9;
            this.f16087a.moveTo(0.0f, f18);
            float f19 = f10 + 0.0f;
            float f20 = 0.0f - f11;
            this.f16087a.cubicTo(f19, f18, f8, f20, f8, 0.0f);
            float f21 = f11 + 0.0f;
            this.f16087a.cubicTo(f8, f21, f19, f9, 0.0f, f9);
            float f22 = 0.0f - f10;
            float f23 = -f8;
            this.f16087a.cubicTo(f22, f9, f23, f21, f23, 0.0f);
            this.f16087a.cubicTo(f23, f20, f22, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f16091e.h();
        this.f16087a.offset(pointF2.x, pointF2.y);
        this.f16087a.close();
        this.f16093g.b(this.f16087a);
        this.f16094h = true;
        return this.f16087a;
    }
}
