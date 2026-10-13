package p085j3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p004a3.J;
import p004a3.K;
import p004a3.N;
import p031d3.a;
import p031d3.q;
import p121n3.j;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d extends b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Paint f28198D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f28199E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Rect f28200F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final K f28201G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public a f28202H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public a f28203I;

    public d(J j8, e eVar) {
        super(j8, eVar);
        this.f28198D = new p013b3.a(3);
        this.f28199E = new Rect();
        this.f28200F = new Rect();
        this.f28201G = j8.P(eVar.n());
    }

    public final Bitmap P() {
        Bitmap bitmap;
        a aVar = this.f28203I;
        if (aVar != null && (bitmap = (Bitmap) aVar.h()) != null) {
            return bitmap;
        }
        Bitmap bitmapG = this.f28177p.G(this.f28178q.n());
        if (bitmapG != null) {
            return bitmapG;
        }
        K k8 = this.f28201G;
        if (k8 != null) {
            return k8.b();
        }
        return null;
    }

    @Override // p085j3.b, p058g3.f
    public void c(Object obj, c cVar) {
        super.c(obj, cVar);
        if (obj == N.f13141K) {
            if (cVar == null) {
                this.f28202H = null;
                return;
            } else {
                this.f28202H = new q(cVar);
                return;
            }
        }
        if (obj == N.f13144N) {
            if (cVar == null) {
                this.f28203I = null;
            } else {
                this.f28203I = new q(cVar);
            }
        }
    }

    @Override // p085j3.b, p022c3.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        super.d(rectF, matrix, z8);
        if (this.f28201G != null) {
            float fE = j.e();
            rectF.set(0.0f, 0.0f, this.f28201G.f() * fE, this.f28201G.d() * fE);
            this.f28176o.mapRect(rectF);
        }
    }

    @Override // p085j3.b
    public void t(Canvas canvas, Matrix matrix, int i8) {
        Bitmap bitmapP = P();
        if (bitmapP == null || bitmapP.isRecycled() || this.f28201G == null) {
            return;
        }
        float fE = j.e();
        this.f28198D.setAlpha(i8);
        a aVar = this.f28202H;
        if (aVar != null) {
            this.f28198D.setColorFilter((ColorFilter) aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f28199E.set(0, 0, bitmapP.getWidth(), bitmapP.getHeight());
        if (this.f28177p.Q()) {
            this.f28200F.set(0, 0, (int) (this.f28201G.f() * fE), (int) (this.f28201G.d() * fE));
        } else {
            this.f28200F.set(0, 0, (int) (bitmapP.getWidth() * fE), (int) (bitmapP.getHeight() * fE));
        }
        canvas.drawBitmap(bitmapP, this.f28199E, this.f28200F, this.f28198D);
        canvas.restore();
    }
}
