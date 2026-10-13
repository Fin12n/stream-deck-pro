package p031d3;

import android.graphics.Color;
import android.graphics.Paint;
import p103l3.C2658j;
import p130o3.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c implements d3.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3.a.b f19759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p031d3.a f19760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p031d3.a f19761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p031d3.a f19762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p031d3.a f19763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p031d3.a f19764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19765g = true;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends p130o3.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p130o3.c f19766d;

        public a(p130o3.c cVar) {
            this.f19766d = cVar;
        }

        @Override // p130o3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(b bVar) {
            Float f8 = (Float) this.f19766d.a(bVar);
            if (f8 == null) {
                return null;
            }
            return Float.valueOf(f8.floatValue() * 2.55f);
        }
    }

    public c(d3.a.b bVar, p085j3.b bVar2, C2658j c2658j) {
        this.f19759a = bVar;
        p031d3.a aVarA = c2658j.a().a();
        this.f19760b = aVarA;
        aVarA.a(this);
        bVar2.i(aVarA);
        p031d3.a aVarA2 = c2658j.d().a();
        this.f19761c = aVarA2;
        aVarA2.a(this);
        bVar2.i(aVarA2);
        p031d3.a aVarA3 = c2658j.b().a();
        this.f19762d = aVarA3;
        aVarA3.a(this);
        bVar2.i(aVarA3);
        p031d3.a aVarA4 = c2658j.c().a();
        this.f19763e = aVarA4;
        aVarA4.a(this);
        bVar2.i(aVarA4);
        p031d3.a aVarA5 = c2658j.e().a();
        this.f19764f = aVarA5;
        aVarA5.a(this);
        bVar2.i(aVarA5);
    }

    @Override // d3.a.b
    public void a() {
        this.f19765g = true;
        this.f19759a.a();
    }

    public void b(Paint paint) {
        if (this.f19765g) {
            this.f19765g = false;
            double dFloatValue = ((double) ((Float) this.f19762d.h()).floatValue()) * 0.017453292519943295d;
            float fFloatValue = ((Float) this.f19763e.h()).floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.f19760b.h()).intValue();
            paint.setShadowLayer(((Float) this.f19764f.h()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.f19761c.h()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public void c(p130o3.c cVar) {
        this.f19760b.o(cVar);
    }

    public void d(p130o3.c cVar) {
        this.f19762d.o(cVar);
    }

    public void e(p130o3.c cVar) {
        this.f19763e.o(cVar);
    }

    public void f(p130o3.c cVar) {
        if (cVar == null) {
            this.f19761c.o(null);
        } else {
            this.f19761c.o(new a(cVar));
        }
    }

    public void g(p130o3.c cVar) {
        this.f19764f.o(cVar);
    }
}
