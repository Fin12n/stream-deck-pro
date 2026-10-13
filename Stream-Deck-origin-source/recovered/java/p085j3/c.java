package p085j3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p004a3.AbstractC1699e;
import p004a3.C1705k;
import p004a3.J;
import p004a3.N;
import p010b0.m;
import p031d3.q;
import p058g3.e;
import p067h3.b;
import p121n3.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c extends b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public p031d3.a f28190D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final List f28191E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final RectF f28192F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final RectF f28193G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Paint f28194H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f28195I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f28196J;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28197a;

        static {
            int[] iArr = new int[e.b.values().length];
            f28197a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28197a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(J j8, e eVar, List<e> list, C1705k c1705k) {
        int i8;
        b bVar;
        super(j8, eVar);
        this.f28191E = new ArrayList();
        this.f28192F = new RectF();
        this.f28193G = new RectF();
        this.f28194H = new Paint();
        this.f28196J = true;
        b bVarV = eVar.v();
        if (bVarV != null) {
            p031d3.a aVarA = bVarV.a();
            this.f28190D = aVarA;
            i(aVarA);
            this.f28190D.a(this);
        } else {
            this.f28190D = null;
        }
        m mVar = new m(c1705k.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b bVarU = b.u(this, eVar2, j8, c1705k);
            if (bVarU != null) {
                mVar.i(bVarU.A().e(), bVarU);
                if (bVar2 != null) {
                    bVar2.J(bVarU);
                    bVar2 = null;
                } else {
                    this.f28191E.add(0, bVarU);
                    int i9 = a.f28197a[eVar2.i().ordinal()];
                    if (i9 == 1 || i9 == 2) {
                        bVar2 = bVarU;
                    }
                }
            }
            size--;
        }
        for (i8 = 0; i8 < mVar.l(); i8++) {
            b bVar3 = (b) mVar.e(mVar.h(i8));
            if (bVar3 != null && (bVar = (b) mVar.e(bVar3.A().k())) != null) {
                bVar3.L(bVar);
            }
        }
    }

    @Override // p085j3.b
    public void I(e eVar, int i8, List list, e eVar2) {
        for (int i9 = 0; i9 < this.f28191E.size(); i9++) {
            ((b) this.f28191E.get(i9)).g(eVar, i8, list, eVar2);
        }
    }

    @Override // p085j3.b
    public void K(boolean z8) {
        super.K(z8);
        Iterator it = this.f28191E.iterator();
        while (it.hasNext()) {
            ((b) it.next()).K(z8);
        }
    }

    @Override // p085j3.b
    public void M(float f8) {
        AbstractC1699e.b("CompositionLayer#setProgress");
        this.f28195I = f8;
        super.M(f8);
        if (this.f28190D != null) {
            f8 = ((((Float) this.f28190D.h()).floatValue() * this.f28178q.c().i()) - this.f28178q.c().p()) / (this.f28177p.J().e() + 0.01f);
        }
        if (this.f28190D == null) {
            f8 -= this.f28178q.s();
        }
        if (this.f28178q.w() != 0.0f && !"__container".equals(this.f28178q.j())) {
            f8 /= this.f28178q.w();
        }
        for (int size = this.f28191E.size() - 1; size >= 0; size--) {
            ((b) this.f28191E.get(size)).M(f8);
        }
        AbstractC1699e.c("CompositionLayer#setProgress");
    }

    public float P() {
        return this.f28195I;
    }

    public void Q(boolean z8) {
        this.f28196J = z8;
    }

    @Override // p085j3.b, p058g3.f
    public void c(Object obj, p130o3.c cVar) {
        super.c(obj, cVar);
        if (obj == N.f13135E) {
            if (cVar == null) {
                p031d3.a aVar = this.f28190D;
                if (aVar != null) {
                    aVar.o(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.f28190D = qVar;
            qVar.a(this);
            i(this.f28190D);
        }
    }

    @Override // p085j3.b, p022c3.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        super.d(rectF, matrix, z8);
        for (int size = this.f28191E.size() - 1; size >= 0; size--) {
            this.f28192F.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) this.f28191E.get(size)).d(this.f28192F, this.f28176o, true);
            rectF.union(this.f28192F);
        }
    }

    @Override // p085j3.b
    public void t(Canvas canvas, Matrix matrix, int i8) {
        AbstractC1699e.b("CompositionLayer#draw");
        this.f28193G.set(0.0f, 0.0f, this.f28178q.m(), this.f28178q.l());
        matrix.mapRect(this.f28193G);
        boolean z8 = this.f28177p.f0() && this.f28191E.size() > 1 && i8 != 255;
        if (z8) {
            this.f28194H.setAlpha(i8);
            j.m(canvas, this.f28193G, this.f28194H);
        } else {
            canvas.save();
        }
        if (z8) {
            i8 = 255;
        }
        for (int size = this.f28191E.size() - 1; size >= 0; size--) {
            if (((this.f28196J || !"__container".equals(this.f28178q.j())) && !this.f28193G.isEmpty()) ? canvas.clipRect(this.f28193G) : true) {
                ((b) this.f28191E.get(size)).f(canvas, matrix, i8);
            }
        }
        canvas.restore();
        AbstractC1699e.c("CompositionLayer#draw");
    }
}
