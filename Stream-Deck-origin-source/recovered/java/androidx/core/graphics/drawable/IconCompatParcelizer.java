package androidx.core.graphics.drawable;

import G2.a;
import android.content.res.ColorStateList;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f15053a = aVar.p(iconCompat.f15053a, 1);
        iconCompat.f15055c = aVar.j(iconCompat.f15055c, 2);
        iconCompat.f15056d = aVar.r(iconCompat.f15056d, 3);
        iconCompat.f15057e = aVar.p(iconCompat.f15057e, 4);
        iconCompat.f15058f = aVar.p(iconCompat.f15058f, 5);
        iconCompat.f15059g = (ColorStateList) aVar.r(iconCompat.f15059g, 6);
        iconCompat.f15061i = aVar.t(iconCompat.f15061i, 7);
        iconCompat.f15062j = aVar.t(iconCompat.f15062j, 8);
        iconCompat.r();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.s(aVar.f());
        int i8 = iconCompat.f15053a;
        if (-1 != i8) {
            aVar.F(i8, 1);
        }
        byte[] bArr = iconCompat.f15055c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f15056d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i9 = iconCompat.f15057e;
        if (i9 != 0) {
            aVar.F(i9, 4);
        }
        int i10 = iconCompat.f15058f;
        if (i10 != 0) {
            aVar.F(i10, 5);
        }
        ColorStateList colorStateList = iconCompat.f15059g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f15061i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f15062j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
