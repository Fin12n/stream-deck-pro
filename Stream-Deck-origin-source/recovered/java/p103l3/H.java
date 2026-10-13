package p103l3;

import android.graphics.PointF;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p058g3.a;
import p076i3.o;
import p112m3.c;
import p121n3.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class H implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f29153a = new H();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.a f29154b = c.a.a("c", "v", WaYxBuDSBD.pKsaZfNGvTTe, "o");

    @Override // p103l3.N
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o a(c cVar, float f8) {
        if (cVar.y() == c.b.BEGIN_ARRAY) {
            cVar.c();
        }
        cVar.x();
        List listF = null;
        List listF2 = null;
        List listF3 = null;
        boolean zT = false;
        while (cVar.o()) {
            int iA = cVar.A(f29154b);
            if (iA == 0) {
                zT = cVar.t();
            } else if (iA == 1) {
                listF = s.f(cVar, f8);
            } else if (iA == 2) {
                listF2 = s.f(cVar, f8);
            } else if (iA != 3) {
                cVar.Y();
                cVar.R();
            } else {
                listF3 = s.f(cVar, f8);
            }
        }
        cVar.u();
        if (cVar.y() == c.b.END_ARRAY) {
            cVar.j();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listF.size();
        PointF pointF = (PointF) listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 1; i8 < size; i8++) {
            PointF pointF2 = (PointF) listF.get(i8);
            int i9 = i8 - 1;
            arrayList.add(new a(i.a((PointF) listF.get(i9), (PointF) listF3.get(i9)), i.a(pointF2, (PointF) listF2.get(i8)), pointF2));
        }
        if (zT) {
            PointF pointF3 = (PointF) listF.get(0);
            int i10 = size - 1;
            arrayList.add(new a(i.a((PointF) listF.get(i10), (PointF) listF3.get(i10)), i.a(pointF3, (PointF) listF2.get(0)), pointF3));
        }
        return new o(pointF, zT, arrayList);
    }
}
