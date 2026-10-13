package p022c3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p004a3.J;
import p004a3.N;
import p058g3.e;
import p076i3.k;
import p076i3.t;
import p085j3.b;
import p121n3.i;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class n implements m, d3.a.b, k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J f16152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k.a f16153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f16154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p031d3.a f16156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p031d3.a f16157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p031d3.a f16158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p031d3.a f16159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p031d3.a f16160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p031d3.a f16161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p031d3.a f16162p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16164r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16147a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f16148b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PathMeasure f16149c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f16150d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f16163q = new b();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16165a;

        static {
            int[] iArr = new int[k.a.values().length];
            f16165a = iArr;
            try {
                iArr[k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16165a[k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(J j8, b bVar, k kVar) {
        this.f16152f = j8;
        this.f16151e = kVar.d();
        k.a aVarJ = kVar.j();
        this.f16153g = aVarJ;
        this.f16154h = kVar.k();
        this.f16155i = kVar.l();
        p031d3.a aVarA = kVar.g().a();
        this.f16156j = aVarA;
        p031d3.a aVarA2 = kVar.h().a();
        this.f16157k = aVarA2;
        p031d3.a aVarA3 = kVar.i().a();
        this.f16158l = aVarA3;
        p031d3.a aVarA4 = kVar.e().a();
        this.f16160n = aVarA4;
        p031d3.a aVarA5 = kVar.f().a();
        this.f16162p = aVarA5;
        k.a aVar = k.a.STAR;
        if (aVarJ == aVar) {
            this.f16159m = kVar.b().a();
            this.f16161o = kVar.c().a();
        } else {
            this.f16159m = null;
            this.f16161o = null;
        }
        bVar.i(aVarA);
        bVar.i(aVarA2);
        bVar.i(aVarA3);
        bVar.i(aVarA4);
        bVar.i(aVarA5);
        if (aVarJ == aVar) {
            bVar.i(this.f16159m);
            bVar.i(this.f16161o);
        }
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
        aVarA4.a(this);
        aVarA5.a(this);
        if (aVarJ == aVar) {
            this.f16159m.a(this);
            this.f16161o.a(this);
        }
    }

    private void j() {
        this.f16164r = false;
        this.f16152f.invalidateSelf();
    }

    @Override // d3.a.b
    public void a() {
        j();
    }

    @Override // p022c3.c
    public void b(List list, List list2) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            c cVar = (c) list.get(i8);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f16163q.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // p058g3.f
    public void c(Object obj, c cVar) {
        p031d3.a aVar;
        p031d3.a aVar2;
        if (obj == N.f13169w) {
            this.f16156j.o(cVar);
            return;
        }
        if (obj == N.f13170x) {
            this.f16158l.o(cVar);
            return;
        }
        if (obj == N.f13160n) {
            this.f16157k.o(cVar);
            return;
        }
        if (obj == N.f13171y && (aVar2 = this.f16159m) != null) {
            aVar2.o(cVar);
            return;
        }
        if (obj == N.f13172z) {
            this.f16160n.o(cVar);
            return;
        }
        if (obj == N.f13131A && (aVar = this.f16161o) != null) {
            aVar.o(cVar);
        } else if (obj == N.f13132B) {
            this.f16162p.o(cVar);
        }
    }

    public final void e() {
        double d8;
        float f8;
        float f9;
        float f10;
        int iFloor = (int) Math.floor(((Float) this.f16156j.h()).floatValue());
        p031d3.a aVar = this.f16158l;
        double radians = Math.toRadians((aVar == null ? 0.0d : ((Float) aVar.h()).floatValue()) - 90.0d);
        double d9 = iFloor;
        float fFloatValue = ((Float) this.f16162p.h()).floatValue() / 100.0f;
        float fFloatValue2 = ((Float) this.f16160n.h()).floatValue();
        double d10 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d10);
        float fSin = (float) (Math.sin(radians) * d10);
        this.f16147a.moveTo(fCos, fSin);
        double d11 = (float) (6.283185307179586d / d9);
        double dCeil = Math.ceil(d9);
        double d12 = radians + d11;
        int i8 = 0;
        while (true) {
            double d13 = i8;
            if (d13 >= dCeil) {
                PointF pointF = (PointF) this.f16157k.h();
                this.f16147a.offset(pointF.x, pointF.y);
                this.f16147a.close();
                return;
            }
            float fCos2 = (float) (d10 * Math.cos(d12));
            float fSin2 = (float) (Math.sin(d12) * d10);
            if (fFloatValue != 0.0f) {
                d8 = dCeil;
                f8 = fFloatValue;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f11 = fFloatValue2 * f8 * 0.25f;
                float f12 = f11 * fCos3;
                float f13 = f11 * fSin3;
                float fCos4 = ((float) Math.cos(dAtan3)) * f11;
                float fSin4 = f11 * ((float) Math.sin(dAtan3));
                if (d13 == d8 - 1.0d) {
                    this.f16148b.reset();
                    this.f16148b.moveTo(fCos, fSin);
                    float f14 = fCos - f12;
                    float f15 = fSin - f13;
                    float f16 = fCos2 + fCos4;
                    float f17 = fSin2 + fSin4;
                    f9 = fCos2;
                    f10 = fSin2;
                    this.f16148b.cubicTo(f14, f15, f16, f17, f9, f10);
                    this.f16149c.setPath(this.f16148b, false);
                    PathMeasure pathMeasure = this.f16149c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f16150d, null);
                    Path path = this.f16147a;
                    float[] fArr = this.f16150d;
                    path.cubicTo(f14, f15, f16, f17, fArr[0], fArr[1]);
                } else {
                    f9 = fCos2;
                    f10 = fSin2;
                    this.f16147a.cubicTo(fCos - f12, fSin - f13, f9 + fCos4, f10 + fSin4, f9, f10);
                }
                fCos = f9;
                fSin = f10;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d8 = dCeil;
                f8 = fFloatValue;
                if (d13 != d8 - 1.0d) {
                    this.f16147a.lineTo(fCos, fSin);
                }
                i8++;
                dCeil = d8;
                fFloatValue = f8;
            }
            d12 += d11;
            i8++;
            dCeil = d8;
            fFloatValue = f8;
        }
    }

    @Override // p058g3.f
    public void g(e eVar, int i8, List list, e eVar2) {
        i.k(eVar, i8, list, eVar2, this);
    }

    @Override // p022c3.c
    public String getName() {
        return this.f16151e;
    }

    public final void i() {
        float f8;
        float f9;
        float fCos;
        float fSin;
        float f10;
        double d8;
        float f11;
        float f12;
        float f13;
        float fFloatValue = ((Float) this.f16156j.h()).floatValue();
        p031d3.a aVar = this.f16158l;
        double radians = Math.toRadians((aVar == null ? 0.0d : ((Float) aVar.h()).floatValue()) - 90.0d);
        double d9 = fFloatValue;
        float f14 = (float) (6.283185307179586d / d9);
        if (this.f16155i) {
            f14 *= -1.0f;
        }
        float f15 = f14 / 2.0f;
        float f16 = fFloatValue - ((int) fFloatValue);
        if (f16 != 0.0f) {
            radians += (double) ((1.0f - f16) * f15);
        }
        float fFloatValue2 = ((Float) this.f16160n.h()).floatValue();
        float fFloatValue3 = ((Float) this.f16159m.h()).floatValue();
        p031d3.a aVar2 = this.f16161o;
        float fFloatValue4 = aVar2 != null ? ((Float) aVar2.h()).floatValue() / 100.0f : 0.0f;
        p031d3.a aVar3 = this.f16162p;
        float fFloatValue5 = aVar3 != null ? ((Float) aVar3.h()).floatValue() / 100.0f : 0.0f;
        if (f16 != 0.0f) {
            f11 = ((fFloatValue2 - fFloatValue3) * f16) + fFloatValue3;
            f9 = 0.0f;
            double d10 = f11;
            f8 = 2.0f;
            float fCos2 = (float) (d10 * Math.cos(radians));
            fSin = (float) (d10 * Math.sin(radians));
            this.f16147a.moveTo(fCos2, fSin);
            d8 = radians + ((double) ((f14 * f16) / 2.0f));
            fCos = fCos2;
            f10 = f15;
        } else {
            f8 = 2.0f;
            f9 = 0.0f;
            double d11 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d11);
            fSin = (float) (d11 * Math.sin(radians));
            this.f16147a.moveTo(fCos, fSin);
            f10 = f15;
            d8 = radians + ((double) f10);
            f11 = 0.0f;
        }
        double dCeil = Math.ceil(d9) * 2.0d;
        int i8 = 0;
        boolean z8 = false;
        double d12 = d8;
        float f17 = fSin;
        float f18 = fCos;
        double d13 = d12;
        while (true) {
            double d14 = i8;
            if (d14 >= dCeil) {
                PointF pointF = (PointF) this.f16157k.h();
                this.f16147a.offset(pointF.x, pointF.y);
                this.f16147a.close();
                return;
            }
            float f19 = z8 ? fFloatValue2 : fFloatValue3;
            float f20 = (f11 == f9 || d14 != dCeil - 2.0d) ? f10 : (f14 * f16) / f8;
            double d15 = (f11 == f9 || d14 != dCeil - 1.0d) ? f19 : f11;
            float fCos3 = (float) (d15 * Math.cos(d13));
            float f21 = f14;
            float fSin2 = (float) (d15 * Math.sin(d13));
            if (fFloatValue4 == f9 && fFloatValue5 == f9) {
                this.f16147a.lineTo(fCos3, fSin2);
                f13 = fCos3;
                f12 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f17, f18) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f22 = f18;
                float f23 = f17;
                f12 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f24 = z8 ? fFloatValue4 : fFloatValue5;
                float f25 = z8 ? fFloatValue5 : fFloatValue4;
                float f26 = (z8 ? fFloatValue3 : fFloatValue2) * f24 * 0.47829f;
                float f27 = fCos4 * f26;
                float f28 = f26 * fSin3;
                float f29 = (z8 ? fFloatValue2 : fFloatValue3) * f25 * 0.47829f;
                float f30 = fCos5 * f29;
                float f31 = f29 * fSin4;
                if (f16 != 0.0f) {
                    if (i8 == 0) {
                        f27 *= f16;
                        f28 *= f16;
                    } else if (d14 == dCeil - 1.0d) {
                        f30 *= f16;
                        f31 *= f16;
                    }
                }
                f13 = fCos3;
                this.f16147a.cubicTo(f22 - f27, f23 - f28, fCos3 + f30, f12 + f31, f13, f12);
            }
            d13 += (double) f20;
            z8 = !z8;
            i8++;
            f10 = f10;
            f18 = f13;
            f17 = f12;
            f14 = f21;
        }
    }

    @Override // p022c3.m
    public Path w() {
        if (this.f16164r) {
            return this.f16147a;
        }
        this.f16147a.reset();
        if (this.f16154h) {
            this.f16164r = true;
            return this.f16147a;
        }
        int i8 = a.f16165a[this.f16153g.ordinal()];
        if (i8 == 1) {
            i();
        } else if (i8 == 2) {
            e();
        }
        this.f16147a.close();
        this.f16163q.b(this.f16147a);
        this.f16164r = true;
        return this.f16147a;
    }
}
