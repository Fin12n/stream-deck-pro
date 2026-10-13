package p085j3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import p004a3.J;
import p004a3.N;
import p031d3.a;
import p031d3.q;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h extends b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final RectF f28246D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Paint f28247E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final float[] f28248F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Path f28249G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final e f28250H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public a f28251I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public a f28252J;

    public h(J j8, e eVar) {
        super(j8, eVar);
        this.f28246D = new RectF();
        p013b3.a aVar = new p013b3.a();
        this.f28247E = aVar;
        this.f28248F = new float[8];
        this.f28249G = new Path();
        this.f28250H = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    @Override // p085j3.b, p058g3.f
    public void c(Object obj, c cVar) {
        super.c(obj, cVar);
        if (obj == N.f13141K) {
            if (cVar == null) {
                this.f28251I = null;
                return;
            } else {
                this.f28251I = new q(cVar);
                return;
            }
        }
        if (obj == N.f13147a) {
            if (cVar != null) {
                this.f28252J = new q(cVar);
            } else {
                this.f28252J = null;
                this.f28247E.setColor(this.f28250H.p());
            }
        }
    }

    @Override // p085j3.b, p022c3.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        super.d(rectF, matrix, z8);
        this.f28246D.set(0.0f, 0.0f, this.f28250H.r(), this.f28250H.q());
        this.f28176o.mapRect(this.f28246D);
        rectF.set(this.f28246D);
    }

    @Override // p085j3.b
    public void t(Canvas canvas, Matrix matrix, int i8) {
        int iAlpha = Color.alpha(this.f28250H.p());
        if (iAlpha == 0) {
            return;
        }
        a aVar = this.f28252J;
        Integer num = aVar == null ? null : (Integer) aVar.h();
        if (num != null) {
            this.f28247E.setColor(num.intValue());
        } else {
            this.f28247E.setColor(this.f28250H.p());
        }
        int iIntValue = (int) ((i8 / 255.0f) * (((iAlpha / 255.0f) * (this.f28185x.h() == null ? 100 : ((Integer) this.f28185x.h().h()).intValue())) / 100.0f) * 255.0f);
        this.f28247E.setAlpha(iIntValue);
        a aVar2 = this.f28251I;
        if (aVar2 != null) {
            this.f28247E.setColorFilter((ColorFilter) aVar2.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f28248F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f28250H.r();
            float[] fArr2 = this.f28248F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f28250H.r();
            this.f28248F[5] = this.f28250H.q();
            float[] fArr3 = this.f28248F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f28250H.q();
            matrix.mapPoints(this.f28248F);
            this.f28249G.reset();
            Path path = this.f28249G;
            float[] fArr4 = this.f28248F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f28249G;
            float[] fArr5 = this.f28248F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f28249G;
            float[] fArr6 = this.f28248F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f28249G;
            float[] fArr7 = this.f28248F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f28249G;
            float[] fArr8 = this.f28248F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f28249G.close();
            canvas.drawPath(this.f28249G, this.f28247E);
        }
    }
}
