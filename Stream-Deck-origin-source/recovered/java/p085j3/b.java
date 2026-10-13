package p085j3;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p004a3.AbstractC1699e;
import p004a3.C1705k;
import p004a3.J;
import p022c3.e;
import p031d3.d;
import p031d3.h;
import p031d3.p;
import p058g3.f;
import p076i3.i;
import p103l3.C2658j;
import p121n3.j;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e, d3.a.b, f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Paint f28159A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f28160B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public BlurMaskFilter f28161C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f28162a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f28163b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f28164c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f28165d = new p013b3.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f28166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f28167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f28168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f28169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f28170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f28171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f28172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f28173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f28174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f28175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Matrix f28176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J f28177p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f28178q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f28179r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f28180s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f28181t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f28182u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f28183v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f28184w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f28185x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f28186y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f28187z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28189b;

        static {
            int[] iArr = new int[i.a.values().length];
            f28189b = iArr;
            try {
                iArr[i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28189b[i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28189b[i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28189b[i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f28188a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28188a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28188a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28188a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28188a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28188a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28188a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(J j8, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f28166e = new p013b3.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f28167f = new p013b3.a(1, mode2);
        p013b3.a aVar = new p013b3.a(1);
        this.f28168g = aVar;
        this.f28169h = new p013b3.a(PorterDuff.Mode.CLEAR);
        this.f28170i = new RectF();
        this.f28171j = new RectF();
        this.f28172k = new RectF();
        this.f28173l = new RectF();
        this.f28174m = new RectF();
        this.f28176o = new Matrix();
        this.f28184w = new ArrayList();
        this.f28186y = true;
        this.f28160B = 0.0f;
        this.f28177p = j8;
        this.f28178q = eVar;
        this.f28175n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p pVarB = eVar.x().b();
        this.f28185x = pVarB;
        pVarB.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            h hVar = new h(eVar.h());
            this.f28179r = hVar;
            Iterator it = hVar.a().iterator();
            while (it.hasNext()) {
                ((p031d3.a) it.next()).a(this);
            }
            for (p031d3.a aVar2 : this.f28179r.c()) {
                i(aVar2);
                aVar2.a(this);
            }
        }
        O();
    }

    public static b u(c cVar, e eVar, J j8, C1705k c1705k) {
        switch (a.f28188a[eVar.g().ordinal()]) {
            case 1:
                return new g(j8, eVar, cVar, c1705k);
            case 2:
                return new c(j8, eVar, c1705k.o(eVar.n()), c1705k);
            case 3:
                return new h(j8, eVar);
            case 4:
                return new d(j8, eVar);
            case 5:
                return new f(j8, eVar);
            case 6:
                return new i(j8, eVar);
            default:
                p121n3.d.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    public e A() {
        return this.f28178q;
    }

    public boolean B() {
        h hVar = this.f28179r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    public boolean C() {
        return this.f28181t != null;
    }

    public final void D(RectF rectF, Matrix matrix) {
        this.f28172k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f28179r.b().size();
            for (int i8 = 0; i8 < size; i8++) {
                i iVar = (i) this.f28179r.b().get(i8);
                Path path = (Path) ((p031d3.a) this.f28179r.a().get(i8)).h();
                if (path != null) {
                    this.f28162a.set(path);
                    this.f28162a.transform(matrix);
                    int i9 = a.f28189b[iVar.a().ordinal()];
                    if (i9 == 1 || i9 == 2) {
                        return;
                    }
                    if ((i9 == 3 || i9 == 4) && iVar.d()) {
                        return;
                    }
                    this.f28162a.computeBounds(this.f28174m, false);
                    if (i8 == 0) {
                        this.f28172k.set(this.f28174m);
                    } else {
                        RectF rectF2 = this.f28172k;
                        rectF2.set(Math.min(rectF2.left, this.f28174m.left), Math.min(this.f28172k.top, this.f28174m.top), Math.max(this.f28172k.right, this.f28174m.right), Math.max(this.f28172k.bottom, this.f28174m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f28172k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void E(RectF rectF, Matrix matrix) {
        if (C() && this.f28178q.i() != e.b.INVERT) {
            this.f28173l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f28181t.d(this.f28173l, matrix, true);
            if (rectF.intersect(this.f28173l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void F() {
        this.f28177p.invalidateSelf();
    }

    public final void G(float f8) {
        this.f28177p.J().n().a(this.f28178q.j(), f8);
    }

    public void H(p031d3.a aVar) {
        this.f28184w.remove(aVar);
    }

    public void J(b bVar) {
        this.f28181t = bVar;
    }

    public void K(boolean z8) {
        if (z8 && this.f28159A == null) {
            this.f28159A = new p013b3.a();
        }
        this.f28187z = z8;
    }

    public void L(b bVar) {
        this.f28182u = bVar;
    }

    public void M(float f8) {
        AbstractC1699e.b("BaseLayer#setProgress");
        AbstractC1699e.b("BaseLayer#setProgress.transform");
        this.f28185x.j(f8);
        AbstractC1699e.c("BaseLayer#setProgress.transform");
        if (this.f28179r != null) {
            AbstractC1699e.b("BaseLayer#setProgress.mask");
            for (int i8 = 0; i8 < this.f28179r.a().size(); i8++) {
                ((p031d3.a) this.f28179r.a().get(i8)).n(f8);
            }
            AbstractC1699e.c("BaseLayer#setProgress.mask");
        }
        if (this.f28180s != null) {
            AbstractC1699e.b("BaseLayer#setProgress.inout");
            this.f28180s.n(f8);
            AbstractC1699e.c("BaseLayer#setProgress.inout");
        }
        if (this.f28181t != null) {
            AbstractC1699e.b("BaseLayer#setProgress.matte");
            this.f28181t.M(f8);
            AbstractC1699e.c("BaseLayer#setProgress.matte");
        }
        AbstractC1699e.b("BaseLayer#setProgress.animations." + this.f28184w.size());
        for (int i9 = 0; i9 < this.f28184w.size(); i9++) {
            ((p031d3.a) this.f28184w.get(i9)).n(f8);
        }
        AbstractC1699e.c("BaseLayer#setProgress.animations." + this.f28184w.size());
        AbstractC1699e.c("BaseLayer#setProgress");
    }

    public final void N(boolean z8) {
        if (z8 != this.f28186y) {
            this.f28186y = z8;
            F();
        }
    }

    public final void O() {
        if (this.f28178q.f().isEmpty()) {
            N(true);
            return;
        }
        d dVar = new d(this.f28178q.f());
        this.f28180s = dVar;
        dVar.m();
        this.f28180s.a(new d3.a.b() { // from class: j3.a
            @Override // d3.a.b
            public final void a() {
                b bVar = this.f28158a;
                bVar.N(bVar.f28180s.q() == 1.0f);
            }
        });
        N(((Float) this.f28180s.h()).floatValue() == 1.0f);
        i(this.f28180s);
    }

    @Override // d3.a.b
    public void a() {
        F();
    }

    @Override // p058g3.f
    public void c(Object obj, c cVar) {
        this.f28185x.c(obj, cVar);
    }

    @Override // p022c3.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        this.f28170i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.f28176o.set(matrix);
        if (z8) {
            List list = this.f28183v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f28176o.preConcat(((b) this.f28183v.get(size)).f28185x.f());
                }
            } else {
                b bVar = this.f28182u;
                if (bVar != null) {
                    this.f28176o.preConcat(bVar.f28185x.f());
                }
            }
        }
        this.f28176o.preConcat(this.f28185x.f());
    }

    @Override // p022c3.e
    public void f(Canvas canvas, Matrix matrix, int i8) {
        Paint paint;
        Integer num;
        AbstractC1699e.b(this.f28175n);
        if (!this.f28186y || this.f28178q.y()) {
            AbstractC1699e.c(this.f28175n);
            return;
        }
        r();
        AbstractC1699e.b("Layer#parentMatrix");
        this.f28163b.reset();
        this.f28163b.set(matrix);
        for (int size = this.f28183v.size() - 1; size >= 0; size--) {
            this.f28163b.preConcat(((b) this.f28183v.get(size)).f28185x.f());
        }
        AbstractC1699e.c("Layer#parentMatrix");
        p031d3.a aVarH = this.f28185x.h();
        int iIntValue = (int) ((((i8 / 255.0f) * ((aVarH == null || (num = (Integer) aVarH.h()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
        if (!C() && !B()) {
            this.f28163b.preConcat(this.f28185x.f());
            AbstractC1699e.b("Layer#drawLayer");
            t(canvas, this.f28163b, iIntValue);
            AbstractC1699e.c("Layer#drawLayer");
            G(AbstractC1699e.c(this.f28175n));
            return;
        }
        AbstractC1699e.b("Layer#computeBounds");
        d(this.f28170i, this.f28163b, false);
        E(this.f28170i, matrix);
        this.f28163b.preConcat(this.f28185x.f());
        D(this.f28170i, this.f28163b);
        this.f28171j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f28164c);
        if (!this.f28164c.isIdentity()) {
            Matrix matrix2 = this.f28164c;
            matrix2.invert(matrix2);
            this.f28164c.mapRect(this.f28171j);
        }
        if (!this.f28170i.intersect(this.f28171j)) {
            this.f28170i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        AbstractC1699e.c("Layer#computeBounds");
        if (this.f28170i.width() >= 1.0f && this.f28170i.height() >= 1.0f) {
            AbstractC1699e.b("Layer#saveLayer");
            this.f28165d.setAlpha(255);
            j.m(canvas, this.f28170i, this.f28165d);
            AbstractC1699e.c("Layer#saveLayer");
            s(canvas);
            AbstractC1699e.b("Layer#drawLayer");
            t(canvas, this.f28163b, iIntValue);
            AbstractC1699e.c("Layer#drawLayer");
            if (B()) {
                o(canvas, this.f28163b);
            }
            if (C()) {
                AbstractC1699e.b("Layer#drawMatte");
                AbstractC1699e.b("Layer#saveLayer");
                j.n(canvas, this.f28170i, this.f28168g, 19);
                AbstractC1699e.c("Layer#saveLayer");
                s(canvas);
                this.f28181t.f(canvas, matrix, iIntValue);
                AbstractC1699e.b("Layer#restoreLayer");
                canvas.restore();
                AbstractC1699e.c("Layer#restoreLayer");
                AbstractC1699e.c("Layer#drawMatte");
            }
            AbstractC1699e.b("Layer#restoreLayer");
            canvas.restore();
            AbstractC1699e.c("Layer#restoreLayer");
        }
        if (this.f28187z && (paint = this.f28159A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f28159A.setColor(-251901);
            this.f28159A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f28170i, this.f28159A);
            this.f28159A.setStyle(Paint.Style.FILL);
            this.f28159A.setColor(1357638635);
            canvas.drawRect(this.f28170i, this.f28159A);
        }
        G(AbstractC1699e.c(this.f28175n));
    }

    @Override // p058g3.f
    public void g(p058g3.e eVar, int i8, List list, p058g3.e eVar2) {
        b bVar = this.f28181t;
        if (bVar != null) {
            p058g3.e eVarA = eVar2.a(bVar.getName());
            if (eVar.c(this.f28181t.getName(), i8)) {
                list.add(eVarA.i(this.f28181t));
            }
            if (eVar.h(getName(), i8)) {
                this.f28181t.I(eVar, eVar.e(this.f28181t.getName(), i8) + i8, list, eVarA);
            }
        }
        if (eVar.g(getName(), i8)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i8)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i8)) {
                I(eVar, i8 + eVar.e(getName(), i8), list, eVar2);
            }
        }
    }

    @Override // p022c3.c
    public String getName() {
        return this.f28178q.j();
    }

    public void i(p031d3.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f28184w.add(aVar);
    }

    public final void j(Canvas canvas, Matrix matrix, p031d3.a aVar, p031d3.a aVar2) {
        this.f28162a.set((Path) aVar.h());
        this.f28162a.transform(matrix);
        this.f28165d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f28162a, this.f28165d);
    }

    public final void k(Canvas canvas, Matrix matrix, p031d3.a aVar, p031d3.a aVar2) {
        j.m(canvas, this.f28170i, this.f28166e);
        this.f28162a.set((Path) aVar.h());
        this.f28162a.transform(matrix);
        this.f28165d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f28162a, this.f28165d);
        canvas.restore();
    }

    public final void l(Canvas canvas, Matrix matrix, p031d3.a aVar, p031d3.a aVar2) {
        j.m(canvas, this.f28170i, this.f28165d);
        canvas.drawRect(this.f28170i, this.f28165d);
        this.f28162a.set((Path) aVar.h());
        this.f28162a.transform(matrix);
        this.f28165d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f28162a, this.f28167f);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, p031d3.a aVar, p031d3.a aVar2) {
        j.m(canvas, this.f28170i, this.f28166e);
        canvas.drawRect(this.f28170i, this.f28165d);
        this.f28167f.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        this.f28162a.set((Path) aVar.h());
        this.f28162a.transform(matrix);
        canvas.drawPath(this.f28162a, this.f28167f);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, p031d3.a aVar, p031d3.a aVar2) {
        j.m(canvas, this.f28170i, this.f28167f);
        canvas.drawRect(this.f28170i, this.f28165d);
        this.f28167f.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        this.f28162a.set((Path) aVar.h());
        this.f28162a.transform(matrix);
        canvas.drawPath(this.f28162a, this.f28167f);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix) {
        AbstractC1699e.b("Layer#saveLayer");
        j.n(canvas, this.f28170i, this.f28166e, 19);
        AbstractC1699e.c("Layer#saveLayer");
        for (int i8 = 0; i8 < this.f28179r.b().size(); i8++) {
            i iVar = (i) this.f28179r.b().get(i8);
            p031d3.a aVar = (p031d3.a) this.f28179r.a().get(i8);
            p031d3.a aVar2 = (p031d3.a) this.f28179r.c().get(i8);
            int i9 = a.f28189b[iVar.a().ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    if (i8 == 0) {
                        this.f28165d.setColor(-16777216);
                        this.f28165d.setAlpha(255);
                        canvas.drawRect(this.f28170i, this.f28165d);
                    }
                    if (iVar.d()) {
                        n(canvas, matrix, aVar, aVar2);
                    } else {
                        p(canvas, matrix, aVar);
                    }
                } else if (i9 != 3) {
                    if (i9 == 4) {
                        if (iVar.d()) {
                            l(canvas, matrix, aVar, aVar2);
                        } else {
                            j(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    m(canvas, matrix, aVar, aVar2);
                } else {
                    k(canvas, matrix, aVar, aVar2);
                }
            } else if (q()) {
                this.f28165d.setAlpha(255);
                canvas.drawRect(this.f28170i, this.f28165d);
            }
        }
        AbstractC1699e.b("Layer#restoreLayer");
        canvas.restore();
        AbstractC1699e.c("Layer#restoreLayer");
    }

    public final void p(Canvas canvas, Matrix matrix, p031d3.a aVar) {
        this.f28162a.set((Path) aVar.h());
        this.f28162a.transform(matrix);
        canvas.drawPath(this.f28162a, this.f28167f);
    }

    public final boolean q() {
        if (this.f28179r.a().isEmpty()) {
            return false;
        }
        for (int i8 = 0; i8 < this.f28179r.b().size(); i8++) {
            if (((i) this.f28179r.b().get(i8)).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void r() {
        if (this.f28183v != null) {
            return;
        }
        if (this.f28182u == null) {
            this.f28183v = Collections.EMPTY_LIST;
            return;
        }
        this.f28183v = new ArrayList();
        for (b bVar = this.f28182u; bVar != null; bVar = bVar.f28182u) {
            this.f28183v.add(bVar);
        }
    }

    public final void s(Canvas canvas) {
        AbstractC1699e.b("Layer#clearLayer");
        RectF rectF = this.f28170i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f28169h);
        AbstractC1699e.c("Layer#clearLayer");
    }

    public abstract void t(Canvas canvas, Matrix matrix, int i8);

    public p076i3.h v() {
        return this.f28178q.a();
    }

    public p076i3.a x() {
        return this.f28178q.b();
    }

    public BlurMaskFilter y(float f8) {
        if (this.f28160B == f8) {
            return this.f28161C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f8 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f28161C = blurMaskFilter;
        this.f28160B = f8;
        return blurMaskFilter;
    }

    public C2658j z() {
        return this.f28178q.d();
    }

    @Override // p022c3.c
    public void b(List list, List list2) {
    }

    public void I(p058g3.e eVar, int i8, List list, p058g3.e eVar2) {
    }
}
