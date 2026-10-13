package p031d3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p130o3.a;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class j extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f19774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f19775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f19776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PathMeasure f19777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f19778m;

    public j(List<? extends a> list) {
        super(list);
        this.f19774i = new PointF();
        this.f19775j = new float[2];
        this.f19776k = new float[2];
        this.f19777l = new PathMeasure();
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(a aVar, float f8) {
        float f9;
        i iVar = (i) aVar;
        Path pathK = iVar.k();
        if (pathK == null) {
            return (PointF) aVar.f30872b;
        }
        c cVar = this.f19749e;
        if (cVar != null) {
            f9 = f8;
            PointF pointF = (PointF) cVar.b(iVar.f30877g, iVar.f30878h.floatValue(), (PointF) iVar.f30872b, (PointF) iVar.f30873c, e(), f9, f());
            if (pointF != null) {
                return pointF;
            }
        } else {
            f9 = f8;
        }
        if (this.f19778m != iVar) {
            this.f19777l.setPath(pathK, false);
            this.f19778m = iVar;
        }
        float length = this.f19777l.getLength();
        float f10 = f9 * length;
        this.f19777l.getPosTan(f10, this.f19775j, this.f19776k);
        PointF pointF2 = this.f19774i;
        float[] fArr = this.f19775j;
        pointF2.set(fArr[0], fArr[1]);
        if (f10 < 0.0f) {
            PointF pointF3 = this.f19774i;
            float[] fArr2 = this.f19776k;
            pointF3.offset(fArr2[0] * f10, fArr2[1] * f10);
        } else if (f10 > length) {
            PointF pointF4 = this.f19774i;
            float[] fArr3 = this.f19776k;
            float f11 = f10 - length;
            pointF4.offset(fArr3[0] * f11, fArr3[1] * f11);
        }
        return this.f19774i;
    }
}
