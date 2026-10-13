package p103l3;

import android.graphics.PointF;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class B implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f29147a = new B();

    @Override // p103l3.N
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(c cVar, float f8) {
        c.b bVarY = cVar.y();
        if (bVarY == c.b.BEGIN_ARRAY) {
            return s.e(cVar, f8);
        }
        if (bVarY == c.b.BEGIN_OBJECT) {
            return s.e(cVar, f8);
        }
        if (bVarY == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.nextDouble()) * f8, ((float) cVar.nextDouble()) * f8);
            while (cVar.o()) {
                cVar.R();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarY);
    }
}
