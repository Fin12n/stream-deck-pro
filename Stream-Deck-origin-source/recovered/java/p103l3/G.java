package p103l3;

import p112m3.c;
import p130o3.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class G implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f29152a = new G();

    @Override // p103l3.N
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(c cVar, float f8) {
        boolean z8 = cVar.y() == c.b.BEGIN_ARRAY;
        if (z8) {
            cVar.c();
        }
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.o()) {
            cVar.R();
        }
        if (z8) {
            cVar.j();
        }
        return new d((fNextDouble / 100.0f) * f8, (fNextDouble2 / 100.0f) * f8);
    }
}
