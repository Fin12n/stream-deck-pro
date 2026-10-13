package p166t;

import H.h1;
import H.i1;
import H.j1;
import H.k1;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: t.z1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2995z1 {
    public static List a(j1.b bVar, j1.b bVar2) {
        ArrayList arrayList = new ArrayList();
        j1.d dVar = j1.d.PRIV;
        arrayList.add(new i1(j1.c(dVar, bVar), j1.c(j1.d.JPEG, bVar2)));
        arrayList.add(new i1(j1.c(dVar, bVar), j1.c(j1.d.JPEG_R, bVar2)));
        return arrayList;
    }

    public static List b(Size size, k1 k1Var) {
        ArrayList arrayList = new ArrayList();
        j1 j1VarK = j1.k(34, size, k1Var);
        i1 i1Var = new i1();
        i1Var.a(j1VarK);
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        i1Var2.a(j1VarK);
        i1Var2.a(j1VarK);
        arrayList.add(i1Var2);
        return arrayList;
    }

    public static List c() {
        ArrayList arrayList = new ArrayList();
        j1.d dVar = j1.d.PRIV;
        j1.b bVar = j1.b.f3075h;
        arrayList.add(new i1(j1.c(dVar, bVar)));
        j1.b bVar2 = j1.b.f3072e;
        arrayList.add(new i1(j1.c(dVar, bVar2)));
        j1.b bVar3 = j1.b.f3082o;
        arrayList.addAll(a(bVar, bVar3));
        j1.b bVar4 = j1.b.f3078k;
        arrayList.addAll(a(bVar, bVar4));
        arrayList.addAll(a(bVar, j1.b.f3077j));
        arrayList.addAll(a(bVar, bVar));
        arrayList.addAll(a(bVar2, bVar3));
        arrayList.addAll(a(bVar2, bVar4));
        arrayList.addAll(a(bVar2, bVar));
        j1.b bVar5 = j1.b.f3071d;
        j1.b bVar6 = j1.b.f3081n;
        arrayList.addAll(a(bVar5, bVar6));
        arrayList.addAll(a(j1.b.f3074g, bVar6));
        return arrayList;
    }

    public static List d(int i8, boolean z8, boolean z9) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(i());
        if (i8 == 0 || i8 == 4 || i8 == 1 || i8 == 3) {
            arrayList.addAll(k());
        }
        if (i8 == 1 || i8 == 3) {
            arrayList.addAll(h());
        }
        if (z8) {
            arrayList.addAll(m());
        }
        if (z9 && i8 == 0) {
            arrayList.addAll(f());
        }
        if (i8 == 3) {
            arrayList.addAll(j());
        }
        return arrayList;
    }

    public static List e() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.PRIV;
        j1.b bVar = j1.b.f3080m;
        i1Var.a(j1.c(dVar, bVar));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        j1.d dVar2 = j1.d.YUV;
        i1Var2.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var2);
        i1 i1Var3 = new i1();
        j1.b bVar2 = j1.b.f3073f;
        i1Var3.a(j1.c(dVar, bVar2));
        j1.d dVar3 = j1.d.JPEG;
        i1Var3.a(j1.c(dVar3, bVar));
        arrayList.add(i1Var3);
        i1 i1Var4 = new i1();
        i1Var4.a(j1.c(dVar, bVar2));
        i1Var4.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var4);
        i1 i1Var5 = new i1();
        i1Var5.a(j1.c(dVar2, bVar2));
        i1Var5.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var5);
        i1 i1Var6 = new i1();
        i1Var6.a(j1.c(dVar, bVar2));
        j1.b bVar3 = j1.b.f3079l;
        i1Var6.a(j1.c(dVar, bVar3));
        arrayList.add(i1Var6);
        i1 i1Var7 = new i1();
        i1Var7.a(j1.c(dVar, bVar2));
        i1Var7.a(j1.c(dVar, bVar3));
        i1Var7.a(j1.c(dVar2, bVar3));
        arrayList.add(i1Var7);
        i1 i1Var8 = new i1();
        i1Var8.a(j1.c(dVar, bVar2));
        i1Var8.a(j1.c(dVar, bVar3));
        i1Var8.a(j1.c(dVar3, bVar3));
        arrayList.add(i1Var8);
        return arrayList;
    }

    public static List f() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.PRIV;
        j1.b bVar = j1.b.f3073f;
        i1Var.a(j1.c(dVar, bVar));
        j1.b bVar2 = j1.b.f3080m;
        i1Var.a(j1.c(dVar, bVar2));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        i1Var2.a(j1.c(dVar, bVar));
        j1.d dVar2 = j1.d.YUV;
        i1Var2.a(j1.c(dVar2, bVar2));
        arrayList.add(i1Var2);
        i1 i1Var3 = new i1();
        i1Var3.a(j1.c(dVar2, bVar));
        i1Var3.a(j1.c(dVar2, bVar2));
        arrayList.add(i1Var3);
        return arrayList;
    }

    public static List g() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.YUV;
        j1.b bVar = j1.b.f3076i;
        i1Var.a(j1.c(dVar, bVar));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        j1.d dVar2 = j1.d.PRIV;
        i1Var2.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var2);
        i1 i1Var3 = new i1();
        j1.d dVar3 = j1.d.JPEG;
        i1Var3.a(j1.c(dVar3, bVar));
        arrayList.add(i1Var3);
        i1 i1Var4 = new i1();
        j1.b bVar2 = j1.b.f3072e;
        i1Var4.a(j1.c(dVar, bVar2));
        i1Var4.a(j1.c(dVar3, bVar));
        arrayList.add(i1Var4);
        i1 i1Var5 = new i1();
        i1Var5.a(j1.c(dVar2, bVar2));
        i1Var5.a(j1.c(dVar3, bVar));
        arrayList.add(i1Var5);
        i1 i1Var6 = new i1();
        i1Var6.a(j1.c(dVar, bVar2));
        i1Var6.a(j1.c(dVar, bVar));
        arrayList.add(i1Var6);
        i1 i1Var7 = new i1();
        i1Var7.a(j1.c(dVar, bVar2));
        i1Var7.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var7);
        i1 i1Var8 = new i1();
        i1Var8.a(j1.c(dVar2, bVar2));
        i1Var8.a(j1.c(dVar, bVar));
        arrayList.add(i1Var8);
        i1 i1Var9 = new i1();
        i1Var9.a(j1.c(dVar2, bVar2));
        i1Var9.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var9);
        return arrayList;
    }

    public static List h() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.PRIV;
        j1.b bVar = j1.b.f3073f;
        i1Var.a(j1.c(dVar, bVar));
        j1.b bVar2 = j1.b.f3080m;
        i1Var.a(j1.c(dVar, bVar2));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        i1Var2.a(j1.c(dVar, bVar));
        j1.d dVar2 = j1.d.YUV;
        i1Var2.a(j1.c(dVar2, bVar2));
        arrayList.add(i1Var2);
        i1 i1Var3 = new i1();
        i1Var3.a(j1.c(dVar2, bVar));
        i1Var3.a(j1.c(dVar2, bVar2));
        arrayList.add(i1Var3);
        i1 i1Var4 = new i1();
        i1Var4.a(j1.c(dVar, bVar));
        i1Var4.a(j1.c(dVar, bVar));
        i1Var4.a(j1.c(j1.d.JPEG, bVar2));
        arrayList.add(i1Var4);
        i1 i1Var5 = new i1();
        j1.b bVar3 = j1.b.f3070c;
        i1Var5.a(j1.c(dVar2, bVar3));
        i1Var5.a(j1.c(dVar, bVar));
        i1Var5.a(j1.c(dVar2, bVar2));
        arrayList.add(i1Var5);
        i1 i1Var6 = new i1();
        i1Var6.a(j1.c(dVar2, bVar3));
        i1Var6.a(j1.c(dVar2, bVar));
        i1Var6.a(j1.c(dVar2, bVar2));
        arrayList.add(i1Var6);
        return arrayList;
    }

    public static List i() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.PRIV;
        j1.b bVar = j1.b.f3080m;
        i1Var.a(j1.c(dVar, bVar));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        j1.d dVar2 = j1.d.JPEG;
        i1Var2.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var2);
        i1 i1Var3 = new i1();
        j1.d dVar3 = j1.d.YUV;
        i1Var3.a(j1.c(dVar3, bVar));
        arrayList.add(i1Var3);
        i1 i1Var4 = new i1();
        j1.b bVar2 = j1.b.f3073f;
        i1Var4.a(j1.c(dVar, bVar2));
        i1Var4.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var4);
        i1 i1Var5 = new i1();
        i1Var5.a(j1.c(dVar3, bVar2));
        i1Var5.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var5);
        i1 i1Var6 = new i1();
        i1Var6.a(j1.c(dVar, bVar2));
        i1Var6.a(j1.c(dVar, bVar2));
        arrayList.add(i1Var6);
        i1 i1Var7 = new i1();
        i1Var7.a(j1.c(dVar, bVar2));
        i1Var7.a(j1.c(dVar3, bVar2));
        arrayList.add(i1Var7);
        i1 i1Var8 = new i1();
        i1Var8.a(j1.c(dVar, bVar2));
        i1Var8.a(j1.c(dVar3, bVar2));
        i1Var8.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var8);
        return arrayList;
    }

    public static List j() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.PRIV;
        j1.b bVar = j1.b.f3073f;
        i1Var.a(j1.c(dVar, bVar));
        j1.b bVar2 = j1.b.f3070c;
        i1Var.a(j1.c(dVar, bVar2));
        j1.d dVar2 = j1.d.YUV;
        j1.b bVar3 = j1.b.f3080m;
        i1Var.a(j1.c(dVar2, bVar3));
        j1.d dVar3 = j1.d.RAW;
        i1Var.a(j1.c(dVar3, bVar3));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        i1Var2.a(j1.c(dVar, bVar));
        i1Var2.a(j1.c(dVar, bVar2));
        i1Var2.a(j1.c(j1.d.JPEG, bVar3));
        i1Var2.a(j1.c(dVar3, bVar3));
        arrayList.add(i1Var2);
        return arrayList;
    }

    public static List k() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.PRIV;
        j1.b bVar = j1.b.f3073f;
        i1Var.a(j1.c(dVar, bVar));
        j1.b bVar2 = j1.b.f3079l;
        i1Var.a(j1.c(dVar, bVar2));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        i1Var2.a(j1.c(dVar, bVar));
        j1.d dVar2 = j1.d.YUV;
        i1Var2.a(j1.c(dVar2, bVar2));
        arrayList.add(i1Var2);
        i1 i1Var3 = new i1();
        i1Var3.a(j1.c(dVar2, bVar));
        i1Var3.a(j1.c(dVar2, bVar2));
        arrayList.add(i1Var3);
        i1 i1Var4 = new i1();
        i1Var4.a(j1.c(dVar, bVar));
        i1Var4.a(j1.c(dVar, bVar2));
        j1.d dVar3 = j1.d.JPEG;
        i1Var4.a(j1.c(dVar3, bVar2));
        arrayList.add(i1Var4);
        i1 i1Var5 = new i1();
        i1Var5.a(j1.c(dVar, bVar));
        i1Var5.a(j1.c(dVar2, bVar2));
        i1Var5.a(j1.c(dVar3, bVar2));
        arrayList.add(i1Var5);
        i1 i1Var6 = new i1();
        i1Var6.a(j1.c(dVar2, bVar));
        i1Var6.a(j1.c(dVar2, bVar));
        i1Var6.a(j1.c(dVar3, j1.b.f3080m));
        arrayList.add(i1Var6);
        return arrayList;
    }

    public static List l() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.PRIV;
        j1.b bVar = j1.b.f3076i;
        i1Var.a(j1.c(dVar, bVar));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        j1.d dVar2 = j1.d.YUV;
        i1Var2.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var2);
        i1 i1Var3 = new i1();
        i1Var3.a(j1.c(dVar, bVar));
        j1.d dVar3 = j1.d.JPEG;
        j1.b bVar2 = j1.b.f3080m;
        i1Var3.a(j1.c(dVar3, bVar2));
        arrayList.add(i1Var3);
        i1 i1Var4 = new i1();
        i1Var4.a(j1.c(dVar2, bVar));
        i1Var4.a(j1.c(dVar3, bVar2));
        arrayList.add(i1Var4);
        i1 i1Var5 = new i1();
        i1Var5.a(j1.c(dVar, bVar));
        i1Var5.a(j1.c(dVar2, bVar2));
        arrayList.add(i1Var5);
        i1 i1Var6 = new i1();
        i1Var6.a(j1.c(dVar2, bVar));
        i1Var6.a(j1.c(dVar2, bVar2));
        arrayList.add(i1Var6);
        i1 i1Var7 = new i1();
        j1.b bVar3 = j1.b.f3073f;
        i1Var7.a(j1.c(dVar, bVar3));
        i1Var7.a(j1.c(dVar, bVar));
        arrayList.add(i1Var7);
        i1 i1Var8 = new i1();
        i1Var8.a(j1.c(dVar2, bVar3));
        i1Var8.a(j1.c(dVar, bVar));
        arrayList.add(i1Var8);
        i1 i1Var9 = new i1();
        i1Var9.a(j1.c(dVar, bVar3));
        i1Var9.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var9);
        i1 i1Var10 = new i1();
        i1Var10.a(j1.c(dVar2, bVar3));
        i1Var10.a(j1.c(dVar2, bVar));
        arrayList.add(i1Var10);
        return arrayList;
    }

    public static List m() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.RAW;
        j1.b bVar = j1.b.f3080m;
        i1Var.a(j1.c(dVar, bVar));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        j1.d dVar2 = j1.d.PRIV;
        j1.b bVar2 = j1.b.f3073f;
        i1Var2.a(j1.c(dVar2, bVar2));
        i1Var2.a(j1.c(dVar, bVar));
        arrayList.add(i1Var2);
        i1 i1Var3 = new i1();
        j1.d dVar3 = j1.d.YUV;
        i1Var3.a(j1.c(dVar3, bVar2));
        i1Var3.a(j1.c(dVar, bVar));
        arrayList.add(i1Var3);
        i1 i1Var4 = new i1();
        i1Var4.a(j1.c(dVar2, bVar2));
        i1Var4.a(j1.c(dVar2, bVar2));
        i1Var4.a(j1.c(dVar, bVar));
        arrayList.add(i1Var4);
        i1 i1Var5 = new i1();
        i1Var5.a(j1.c(dVar2, bVar2));
        i1Var5.a(j1.c(dVar3, bVar2));
        i1Var5.a(j1.c(dVar, bVar));
        arrayList.add(i1Var5);
        i1 i1Var6 = new i1();
        i1Var6.a(j1.c(dVar3, bVar2));
        i1Var6.a(j1.c(dVar3, bVar2));
        i1Var6.a(j1.c(dVar, bVar));
        arrayList.add(i1Var6);
        i1 i1Var7 = new i1();
        i1Var7.a(j1.c(dVar2, bVar2));
        j1.d dVar4 = j1.d.JPEG;
        i1Var7.a(j1.c(dVar4, bVar));
        i1Var7.a(j1.c(dVar, bVar));
        arrayList.add(i1Var7);
        i1 i1Var8 = new i1();
        i1Var8.a(j1.c(dVar3, bVar2));
        i1Var8.a(j1.c(dVar4, bVar));
        i1Var8.a(j1.c(dVar, bVar));
        arrayList.add(i1Var8);
        return arrayList;
    }

    public static List n() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.PRIV;
        j1.b bVar = j1.b.f3076i;
        h1 h1Var = h1.PREVIEW_VIDEO_STILL;
        i1Var.a(j1.d(dVar, bVar, h1Var));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        j1.d dVar2 = j1.d.YUV;
        i1Var2.a(j1.d(dVar2, bVar, h1Var));
        arrayList.add(i1Var2);
        i1 i1Var3 = new i1();
        j1.b bVar2 = j1.b.f3079l;
        h1 h1Var2 = h1.VIDEO_RECORD;
        i1Var3.a(j1.d(dVar, bVar2, h1Var2));
        arrayList.add(i1Var3);
        i1 i1Var4 = new i1();
        i1Var4.a(j1.d(dVar2, bVar2, h1Var2));
        arrayList.add(i1Var4);
        i1 i1Var5 = new i1();
        j1.d dVar3 = j1.d.JPEG;
        j1.b bVar3 = j1.b.f3080m;
        h1 h1Var3 = h1.STILL_CAPTURE;
        i1Var5.a(j1.d(dVar3, bVar3, h1Var3));
        arrayList.add(i1Var5);
        i1 i1Var6 = new i1();
        i1Var6.a(j1.d(dVar2, bVar3, h1Var3));
        arrayList.add(i1Var6);
        i1 i1Var7 = new i1();
        j1.b bVar4 = j1.b.f3073f;
        h1 h1Var4 = h1.PREVIEW;
        i1Var7.a(j1.d(dVar, bVar4, h1Var4));
        i1Var7.a(j1.d(dVar3, bVar3, h1Var3));
        arrayList.add(i1Var7);
        i1 i1Var8 = new i1();
        i1Var8.a(j1.d(dVar, bVar4, h1Var4));
        i1Var8.a(j1.d(dVar2, bVar3, h1Var3));
        arrayList.add(i1Var8);
        i1 i1Var9 = new i1();
        i1Var9.a(j1.d(dVar, bVar4, h1Var4));
        i1Var9.a(j1.d(dVar, bVar2, h1Var2));
        arrayList.add(i1Var9);
        i1 i1Var10 = new i1();
        i1Var10.a(j1.d(dVar, bVar4, h1Var4));
        i1Var10.a(j1.d(dVar2, bVar2, h1Var2));
        arrayList.add(i1Var10);
        i1 i1Var11 = new i1();
        i1Var11.a(j1.d(dVar, bVar4, h1Var4));
        i1Var11.a(j1.d(dVar2, bVar4, h1Var4));
        arrayList.add(i1Var11);
        i1 i1Var12 = new i1();
        i1Var12.a(j1.d(dVar, bVar4, h1Var4));
        i1Var12.a(j1.d(dVar, bVar2, h1Var2));
        i1Var12.a(j1.d(dVar3, bVar2, h1Var3));
        arrayList.add(i1Var12);
        i1 i1Var13 = new i1();
        i1Var13.a(j1.d(dVar, bVar4, h1Var4));
        i1Var13.a(j1.d(dVar2, bVar2, h1Var2));
        i1Var13.a(j1.d(dVar3, bVar2, h1Var3));
        arrayList.add(i1Var13);
        i1 i1Var14 = new i1();
        i1Var14.a(j1.d(dVar, bVar4, h1Var4));
        i1Var14.a(j1.d(dVar2, bVar4, h1Var4));
        i1Var14.a(j1.d(dVar3, bVar3, h1Var3));
        arrayList.add(i1Var14);
        return arrayList;
    }

    public static List o() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.JPEG_R;
        j1.b bVar = j1.b.f3080m;
        i1Var.a(j1.c(dVar, bVar));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        i1Var2.a(j1.c(j1.d.PRIV, j1.b.f3073f));
        i1Var2.a(j1.c(dVar, bVar));
        arrayList.add(i1Var2);
        return arrayList;
    }

    public static List p() {
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1();
        j1.d dVar = j1.d.YUV;
        j1.b bVar = j1.b.f3083p;
        i1Var.a(j1.c(dVar, bVar));
        j1.d dVar2 = j1.d.PRIV;
        j1.b bVar2 = j1.b.f3073f;
        i1Var.a(j1.c(dVar2, bVar2));
        j1.b bVar3 = j1.b.f3079l;
        i1Var.a(j1.c(dVar2, bVar3));
        arrayList.add(i1Var);
        i1 i1Var2 = new i1();
        j1.d dVar3 = j1.d.JPEG;
        i1Var2.a(j1.c(dVar3, bVar));
        i1Var2.a(j1.c(dVar2, bVar2));
        i1Var2.a(j1.c(dVar2, bVar3));
        arrayList.add(i1Var2);
        i1 i1Var3 = new i1();
        j1.d dVar4 = j1.d.RAW;
        i1Var3.a(j1.c(dVar4, bVar));
        i1Var3.a(j1.c(dVar2, bVar2));
        i1Var3.a(j1.c(dVar2, bVar3));
        arrayList.add(i1Var3);
        i1 i1Var4 = new i1();
        i1Var4.a(j1.c(dVar, bVar));
        i1Var4.a(j1.c(dVar2, bVar2));
        j1.b bVar4 = j1.b.f3080m;
        i1Var4.a(j1.c(dVar3, bVar4));
        arrayList.add(i1Var4);
        i1 i1Var5 = new i1();
        i1Var5.a(j1.c(dVar3, bVar));
        i1Var5.a(j1.c(dVar2, bVar2));
        i1Var5.a(j1.c(dVar3, bVar4));
        arrayList.add(i1Var5);
        i1 i1Var6 = new i1();
        i1Var6.a(j1.c(dVar4, bVar));
        i1Var6.a(j1.c(dVar2, bVar2));
        i1Var6.a(j1.c(dVar3, bVar4));
        arrayList.add(i1Var6);
        i1 i1Var7 = new i1();
        i1Var7.a(j1.c(dVar, bVar));
        i1Var7.a(j1.c(dVar2, bVar2));
        i1Var7.a(j1.c(dVar, bVar4));
        arrayList.add(i1Var7);
        i1 i1Var8 = new i1();
        i1Var8.a(j1.c(dVar3, bVar));
        i1Var8.a(j1.c(dVar2, bVar2));
        i1Var8.a(j1.c(dVar, bVar4));
        arrayList.add(i1Var8);
        i1 i1Var9 = new i1();
        i1Var9.a(j1.c(dVar4, bVar));
        i1Var9.a(j1.c(dVar2, bVar2));
        i1Var9.a(j1.c(dVar, bVar4));
        arrayList.add(i1Var9);
        i1 i1Var10 = new i1();
        i1Var10.a(j1.c(dVar, bVar));
        i1Var10.a(j1.c(dVar2, bVar2));
        i1Var10.a(j1.c(dVar4, bVar4));
        arrayList.add(i1Var10);
        i1 i1Var11 = new i1();
        i1Var11.a(j1.c(dVar3, bVar));
        i1Var11.a(j1.c(dVar2, bVar2));
        i1Var11.a(j1.c(dVar4, bVar4));
        arrayList.add(i1Var11);
        i1 i1Var12 = new i1();
        i1Var12.a(j1.c(dVar4, bVar));
        i1Var12.a(j1.c(dVar2, bVar2));
        i1Var12.a(j1.c(dVar4, bVar4));
        arrayList.add(i1Var12);
        return arrayList;
    }
}
