package A4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static int a(Parcel parcel) {
        return s(parcel, 20293);
    }

    public static void b(Parcel parcel, int i8) {
        t(parcel, i8);
    }

    public static void c(Parcel parcel, int i8, boolean z8) {
        u(parcel, i8, 4);
        parcel.writeInt(z8 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i8, Bundle bundle, boolean z8) {
        if (bundle == null) {
            if (z8) {
                u(parcel, i8, 0);
            }
        } else {
            int iS = s(parcel, i8);
            parcel.writeBundle(bundle);
            t(parcel, iS);
        }
    }

    public static void e(Parcel parcel, int i8, byte[] bArr, boolean z8) {
        if (bArr == null) {
            if (z8) {
                u(parcel, i8, 0);
            }
        } else {
            int iS = s(parcel, i8);
            parcel.writeByteArray(bArr);
            t(parcel, iS);
        }
    }

    public static void f(Parcel parcel, int i8, double d8) {
        u(parcel, i8, 8);
        parcel.writeDouble(d8);
    }

    public static void g(Parcel parcel, int i8, float f8) {
        u(parcel, i8, 4);
        parcel.writeFloat(f8);
    }

    public static void h(Parcel parcel, int i8, float[] fArr, boolean z8) {
        if (fArr == null) {
            if (z8) {
                u(parcel, i8, 0);
            }
        } else {
            int iS = s(parcel, i8);
            parcel.writeFloatArray(fArr);
            t(parcel, iS);
        }
    }

    public static void i(Parcel parcel, int i8, IBinder iBinder, boolean z8) {
        if (iBinder == null) {
            if (z8) {
                u(parcel, i8, 0);
            }
        } else {
            int iS = s(parcel, i8);
            parcel.writeStrongBinder(iBinder);
            t(parcel, iS);
        }
    }

    public static void j(Parcel parcel, int i8, int i9) {
        u(parcel, i8, 4);
        parcel.writeInt(i9);
    }

    public static void k(Parcel parcel, int i8, int[] iArr, boolean z8) {
        if (iArr == null) {
            if (z8) {
                u(parcel, i8, 0);
            }
        } else {
            int iS = s(parcel, i8);
            parcel.writeIntArray(iArr);
            t(parcel, iS);
        }
    }

    public static void l(Parcel parcel, int i8, long j8) {
        u(parcel, i8, 8);
        parcel.writeLong(j8);
    }

    public static void m(Parcel parcel, int i8, Parcelable parcelable, int i9, boolean z8) {
        if (parcelable == null) {
            if (z8) {
                u(parcel, i8, 0);
            }
        } else {
            int iS = s(parcel, i8);
            parcelable.writeToParcel(parcel, i9);
            t(parcel, iS);
        }
    }

    public static void n(Parcel parcel, int i8, String str, boolean z8) {
        if (str == null) {
            if (z8) {
                u(parcel, i8, 0);
            }
        } else {
            int iS = s(parcel, i8);
            parcel.writeString(str);
            t(parcel, iS);
        }
    }

    public static void o(Parcel parcel, int i8, String[] strArr, boolean z8) {
        if (strArr == null) {
            if (z8) {
                u(parcel, i8, 0);
            }
        } else {
            int iS = s(parcel, i8);
            parcel.writeStringArray(strArr);
            t(parcel, iS);
        }
    }

    public static void p(Parcel parcel, int i8, List list, boolean z8) {
        if (list == null) {
            if (z8) {
                u(parcel, i8, 0);
            }
        } else {
            int iS = s(parcel, i8);
            parcel.writeStringList(list);
            t(parcel, iS);
        }
    }

    public static void q(Parcel parcel, int i8, Parcelable[] parcelableArr, int i9, boolean z8) {
        if (parcelableArr == null) {
            if (z8) {
                u(parcel, i8, 0);
                return;
            }
            return;
        }
        int iS = s(parcel, i8);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                v(parcel, parcelable, i9);
            }
        }
        t(parcel, iS);
    }

    public static void r(Parcel parcel, int i8, List list, boolean z8) {
        if (list == null) {
            if (z8) {
                u(parcel, i8, 0);
                return;
            }
            return;
        }
        int iS = s(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            Parcelable parcelable = (Parcelable) list.get(i9);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                v(parcel, parcelable, 0);
            }
        }
        t(parcel, iS);
    }

    public static int s(Parcel parcel, int i8) {
        parcel.writeInt(i8 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void t(Parcel parcel, int i8) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i8 - 4);
        parcel.writeInt(iDataPosition - i8);
        parcel.setDataPosition(iDataPosition);
    }

    public static void u(Parcel parcel, int i8, int i9) {
        parcel.writeInt(i8 | (i9 << 16));
    }

    public static void v(Parcel parcel, Parcelable parcelable, int i8) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i8);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
