package p103l3;

import android.graphics.Color;
import android.graphics.Rect;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p004a3.C1705k;
import p067h3.b;
import p067h3.j;
import p067h3.k;
import p067h3.l;
import p076i3.h;
import p085j3.e;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29203a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.a f29204b = c.a.a("d", "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c.a f29205c = c.a.a("ty", "nm");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29206a;

        static {
            int[] iArr = new int[e.b.values().length];
            f29206a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29206a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static e a(C1705k c1705k) {
        Rect rectB = c1705k.b();
        List list = Collections.EMPTY_LIST;
        return new e(list, c1705k, "__container", -1L, e.a.PRE_COMP, -1L, null, list, new l(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, list, e.b.NONE, null, false, null, null, h.NORMAL);
    }

    public static e b(c cVar, C1705k c1705k) {
        float f8;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        e.b bVar = e.b.NONE;
        h hVar = h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cVar.x();
        boolean z8 = false;
        e.b bVar2 = bVar;
        h hVar2 = hVar;
        float fNextDouble = 0.0f;
        float f9 = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        String strG = null;
        j jVarD = null;
        k kVarA = null;
        b bVarF = null;
        p076i3.a aVarB = null;
        C2658j c2658jB = null;
        long jNextInt = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zT = false;
        long jNextInt2 = -1;
        float fNextDouble5 = 1.0f;
        String strG2 = "UNSET";
        String strG3 = null;
        l lVar = null;
        e.a aVar = null;
        boolean z9 = false;
        while (cVar.o()) {
            switch (cVar.A(f29203a)) {
                case 0:
                    strG2 = cVar.G();
                    z8 = false;
                    break;
                case 1:
                    jNextInt = cVar.nextInt();
                    z8 = false;
                    break;
                case 2:
                    strG = cVar.G();
                    z8 = false;
                    break;
                case 3:
                    f8 = fNextDouble5;
                    int iNextInt3 = cVar.nextInt();
                    aVar = e.a.UNKNOWN;
                    if (iNextInt3 < aVar.ordinal()) {
                        aVar = e.a.values()[iNextInt3];
                    }
                    fNextDouble5 = f8;
                    z8 = false;
                    break;
                case 4:
                    jNextInt2 = cVar.nextInt();
                    z8 = false;
                    break;
                case 5:
                    iNextInt = (int) (cVar.nextInt() * p121n3.j.e());
                    z8 = false;
                    break;
                case 6:
                    iNextInt2 = (int) (cVar.nextInt() * p121n3.j.e());
                    z8 = false;
                    break;
                case 7:
                    color = Color.parseColor(cVar.G());
                    z8 = false;
                    break;
                case 8:
                    lVar = AbstractC2651c.g(cVar, c1705k);
                    z8 = false;
                    break;
                case 9:
                    f8 = fNextDouble5;
                    int iNextInt4 = cVar.nextInt();
                    if (iNextInt4 >= e.b.values().length) {
                        c1705k.a("Unsupported matte type: " + iNextInt4);
                    } else {
                        bVar2 = e.b.values()[iNextInt4];
                        int i8 = a.f29206a[bVar2.ordinal()];
                        if (i8 == 1) {
                            c1705k.a("Unsupported matte type: Luma");
                        } else if (i8 == 2) {
                            c1705k.a("Unsupported matte type: Luma Inverted");
                        }
                        c1705k.s(1);
                    }
                    fNextDouble5 = f8;
                    z8 = false;
                    break;
                case 10:
                    f8 = fNextDouble5;
                    cVar.c();
                    while (cVar.o()) {
                        arrayList.add(x.a(cVar, c1705k));
                    }
                    c1705k.s(arrayList.size());
                    cVar.j();
                    fNextDouble5 = f8;
                    z8 = false;
                    break;
                case 11:
                    f8 = fNextDouble5;
                    cVar.c();
                    while (cVar.o()) {
                        p076i3.c cVarA = AbstractC2656h.a(cVar, c1705k);
                        if (cVarA != null) {
                            arrayList2.add(cVarA);
                        }
                    }
                    cVar.j();
                    fNextDouble5 = f8;
                    z8 = false;
                    break;
                case 12:
                    f8 = fNextDouble5;
                    cVar.x();
                    while (cVar.o()) {
                        int iA = cVar.A(f29204b);
                        if (iA == 0) {
                            jVarD = AbstractC2652d.d(cVar, c1705k);
                        } else if (iA != 1) {
                            cVar.Y();
                            cVar.R();
                        } else {
                            cVar.c();
                            if (cVar.o()) {
                                kVarA = AbstractC2650b.a(cVar, c1705k);
                            }
                            while (cVar.o()) {
                                cVar.R();
                            }
                            cVar.j();
                        }
                    }
                    cVar.u();
                    fNextDouble5 = f8;
                    z8 = false;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    f8 = fNextDouble5;
                    cVar.c();
                    ArrayList arrayList3 = new ArrayList();
                    while (cVar.o()) {
                        cVar.x();
                        while (cVar.o()) {
                            int iA2 = cVar.A(f29205c);
                            if (iA2 == 0) {
                                int iNextInt5 = cVar.nextInt();
                                if (iNextInt5 == 29) {
                                    aVarB = AbstractC2653e.b(cVar, c1705k);
                                } else if (iNextInt5 == 25) {
                                    c2658jB = new C2659k().b(cVar, c1705k);
                                }
                            } else if (iA2 != 1) {
                                cVar.Y();
                                cVar.R();
                            } else {
                                arrayList3.add(cVar.G());
                            }
                        }
                        cVar.u();
                    }
                    cVar.j();
                    c1705k.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fNextDouble5 = f8;
                    z8 = false;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    fNextDouble5 = (float) cVar.nextDouble();
                    z8 = false;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    fNextDouble4 = (float) cVar.nextDouble();
                    z8 = false;
                    break;
                case 16:
                    f8 = fNextDouble5;
                    fNextDouble2 = (float) (cVar.nextDouble() * ((double) p121n3.j.e()));
                    fNextDouble5 = f8;
                    z8 = false;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    f8 = fNextDouble5;
                    fNextDouble3 = (float) (cVar.nextDouble() * ((double) p121n3.j.e()));
                    fNextDouble5 = f8;
                    z8 = false;
                    break;
                case 18:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 19:
                    f9 = (float) cVar.nextDouble();
                    break;
                case 20:
                    bVarF = AbstractC2652d.f(cVar, c1705k, z8);
                    break;
                case 21:
                    strG3 = cVar.G();
                    break;
                case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                    zT = cVar.t();
                    break;
                case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                    z9 = cVar.nextInt() != 1 ? z8 : true;
                    break;
                case 24:
                    int iNextInt6 = cVar.nextInt();
                    if (iNextInt6 < h.values().length) {
                        hVar2 = h.values()[iNextInt6];
                    } else {
                        c1705k.a("Unsupported Blend Mode: " + iNextInt6);
                        hVar2 = h.NORMAL;
                    }
                    break;
                default:
                    cVar.Y();
                    cVar.R();
                    f8 = fNextDouble5;
                    fNextDouble5 = f8;
                    z8 = false;
                    break;
            }
        }
        float f10 = fNextDouble5;
        cVar.u();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            arrayList4.add(new p130o3.a(c1705k, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble)));
        }
        if (f9 <= 0.0f) {
            f9 = c1705k.f();
        }
        arrayList4.add(new p130o3.a(c1705k, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(f9)));
        arrayList4.add(new p130o3.a(c1705k, fValueOf, fValueOf, null, f9, Float.valueOf(Float.MAX_VALUE)));
        if (strG2.endsWith(".ai") || "ai".equals(strG3)) {
            c1705k.a("Convert your Illustrator layers to shape layers.");
        }
        if (z9 != 0) {
            if (lVar == null) {
                lVar = new l();
            }
            lVar.m(z9);
        }
        return new e(arrayList2, c1705k, strG2, jNextInt, aVar, jNextInt2, strG, arrayList, lVar, iNextInt, iNextInt2, color, f10, fNextDouble4, fNextDouble2, fNextDouble3, jVarD, kVarA, arrayList4, bVar2, bVarF, zT, aVarB, c2658jB, hVar2);
    }
}
