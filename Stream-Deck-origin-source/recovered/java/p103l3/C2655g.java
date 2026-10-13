package p103l3;

import android.graphics.Color;
import p112m3.c;

/* JADX INFO: renamed from: l3.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2655g implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2655g f29169a = new C2655g();

    @Override // p103l3.N
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(c cVar, float f8) {
        boolean z8 = cVar.y() == c.b.BEGIN_ARRAY;
        if (z8) {
            cVar.c();
        }
        double dNextDouble = cVar.nextDouble();
        double dNextDouble2 = cVar.nextDouble();
        double dNextDouble3 = cVar.nextDouble();
        double dNextDouble4 = cVar.y() == c.b.NUMBER ? cVar.nextDouble() : 1.0d;
        if (z8) {
            cVar.j();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}
