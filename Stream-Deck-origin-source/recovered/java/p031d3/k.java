package p031d3;

import android.graphics.PointF;
import java.util.List;
import p130o3.a;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class k extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f19779i;

    public k(List<a> list) {
        super(list);
        this.f19779i = new PointF();
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(a aVar, float f8) {
        return j(aVar, f8, f8, f8);
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF j(a aVar, float f8, float f9, float f10) {
        Object obj;
        PointF pointF;
        Object obj2 = aVar.f30872b;
        if (obj2 == null || (obj = aVar.f30873c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        c cVar = this.f19749e;
        if (cVar != null && (pointF = (PointF) cVar.b(aVar.f30877g, aVar.f30878h.floatValue(), pointF2, pointF3, f8, e(), f())) != null) {
            return pointF;
        }
        PointF pointF4 = this.f19779i;
        float f11 = pointF2.x;
        float f12 = f11 + (f9 * (pointF3.x - f11));
        float f13 = pointF2.y;
        pointF4.set(f12, f13 + (f10 * (pointF3.y - f13)));
        return this.f19779i;
    }
}
