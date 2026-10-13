package p103l3;

import android.graphics.PointF;
import p058g3.b;
import p112m3.c;

/* JADX INFO: renamed from: l3.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2657i implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2657i f29171a = new C2657i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.a f29172b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // p103l3.N
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b a(c cVar, float f8) {
        b.a aVar = b.a.CENTER;
        cVar.x();
        b.a aVar2 = aVar;
        String strG = null;
        String strG2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zT = true;
        while (cVar.o()) {
            switch (cVar.A(f29172b)) {
                case 0:
                    strG = cVar.G();
                    break;
                case 1:
                    strG2 = cVar.G();
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = cVar.nextInt();
                    aVar2 = b.a.CENTER;
                    if (iNextInt2 <= aVar2.ordinal() && iNextInt2 >= 0) {
                        aVar2 = b.a.values()[iNextInt2];
                    }
                    break;
                case 4:
                    iNextInt = cVar.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) cVar.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) cVar.nextDouble();
                    break;
                case 7:
                    iD = s.d(cVar);
                    break;
                case 8:
                    iD2 = s.d(cVar);
                    break;
                case 9:
                    fNextDouble4 = (float) cVar.nextDouble();
                    break;
                case 10:
                    zT = cVar.t();
                    break;
                case 11:
                    cVar.c();
                    PointF pointF3 = new PointF(((float) cVar.nextDouble()) * f8, ((float) cVar.nextDouble()) * f8);
                    cVar.j();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.c();
                    PointF pointF4 = new PointF(((float) cVar.nextDouble()) * f8, ((float) cVar.nextDouble()) * f8);
                    cVar.j();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.Y();
                    cVar.R();
                    break;
            }
        }
        cVar.u();
        return new b(strG, strG2, fNextDouble, aVar2, iNextInt, fNextDouble2, fNextDouble3, iD, iD2, fNextDouble4, zT, pointF, pointF2);
    }
}
