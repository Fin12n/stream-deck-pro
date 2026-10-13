package p067h3;

import java.util.Arrays;
import java.util.List;
import p031d3.e;
import p076i3.d;
import p130o3.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c extends n {
    public c(List<a> list) {
        super(e(list));
    }

    public static a d(a aVar) {
        d dVar = (d) aVar.f30872b;
        d dVar2 = (d) aVar.f30873c;
        if (dVar == null || dVar2 == null || dVar.e().length == dVar2.e().length) {
            return aVar;
        }
        float[] fArrF = f(dVar.e(), dVar2.e());
        return aVar.b(dVar.b(fArrF), dVar2.b(fArrF));
    }

    public static List e(List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            list.set(i8, d((a) list.get(i8)));
        }
        return list;
    }

    public static float[] f(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f8 = Float.NaN;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            float f9 = fArr3[i9];
            if (f9 != f8) {
                fArr3[i8] = f9;
                i8++;
                f8 = fArr3[i9];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i8);
    }

    @Override // p067h3.m
    public p031d3.a a() {
        return new e(this.f24430a);
    }

    @Override // p067h3.n, p067h3.m
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // p067h3.n, p067h3.m
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // p067h3.n
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
