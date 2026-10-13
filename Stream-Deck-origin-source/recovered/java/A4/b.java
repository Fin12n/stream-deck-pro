package A4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static Bundle a(Parcel parcel, int i8) {
        int iT = t(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iT);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i8) {
        int iT = t(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iT);
        return bArrCreateByteArray;
    }

    public static float[] c(Parcel parcel, int i8) {
        int iT = t(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iT);
        return fArrCreateFloatArray;
    }

    public static int[] d(Parcel parcel, int i8) {
        int iT = t(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iT);
        return iArrCreateIntArray;
    }

    public static Parcelable e(Parcel parcel, int i8, Parcelable.Creator creator) {
        int iT = t(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iT);
        return parcelable;
    }

    public static String f(Parcel parcel, int i8) {
        int iT = t(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iT);
        return string;
    }

    public static String[] g(Parcel parcel, int i8) {
        int iT = t(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iT);
        return strArrCreateStringArray;
    }

    public static ArrayList h(Parcel parcel, int i8) {
        int iT = t(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iT);
        return arrayListCreateStringArrayList;
    }

    public static Object[] i(Parcel parcel, int i8, Parcelable.Creator creator) {
        int iT = t(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iT);
        return objArrCreateTypedArray;
    }

    public static ArrayList j(Parcel parcel, int i8, Parcelable.Creator creator) {
        int iT = t(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iT);
        return arrayListCreateTypedArrayList;
    }

    public static void k(Parcel parcel, int i8) {
        if (parcel.dataPosition() == i8) {
            return;
        }
        throw new a("Overread allowed size end=" + i8, parcel);
    }

    public static int l(int i8) {
        return (char) i8;
    }

    public static boolean m(Parcel parcel, int i8) {
        w(parcel, i8, 4);
        return parcel.readInt() != 0;
    }

    public static double n(Parcel parcel, int i8) {
        w(parcel, i8, 8);
        return parcel.readDouble();
    }

    public static float o(Parcel parcel, int i8) {
        w(parcel, i8, 4);
        return parcel.readFloat();
    }

    public static int p(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder q(Parcel parcel, int i8) {
        int iT = t(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iT);
        return strongBinder;
    }

    public static int r(Parcel parcel, int i8) {
        w(parcel, i8, 4);
        return parcel.readInt();
    }

    public static long s(Parcel parcel, int i8) {
        w(parcel, i8, 8);
        return parcel.readLong();
    }

    public static int t(Parcel parcel, int i8) {
        return (i8 & (-65536)) != -65536 ? (char) (i8 >> 16) : parcel.readInt();
    }

    public static void u(Parcel parcel, int i8) {
        parcel.setDataPosition(parcel.dataPosition() + t(parcel, i8));
    }

    public static int v(Parcel parcel) {
        int iP = p(parcel);
        int iT = t(parcel, iP);
        int iL = l(iP);
        int iDataPosition = parcel.dataPosition();
        if (iL != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iP))), parcel);
        }
        int i8 = iT + iDataPosition;
        if (i8 >= iDataPosition && i8 <= parcel.dataSize()) {
            return i8;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i8, parcel);
    }

    public static void w(Parcel parcel, int i8, int i9) {
        int iT = t(parcel, i8);
        if (iT == i9) {
            return;
        }
        throw new a("Expected size " + i9 + " got " + iT + " (0x" + Integer.toHexString(iT) + ")", parcel);
    }
}
