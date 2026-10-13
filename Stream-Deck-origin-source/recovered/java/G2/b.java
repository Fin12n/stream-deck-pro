package G2;

import T0.Vl.PCRzgdeK;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import p010b0.C1748a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f2708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f2709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2715k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), PCRzgdeK.wvVhGXUNrBwjq, new C1748a(), new C1748a(), new C1748a());
    }

    @Override // G2.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f2709e.writeInt(-1);
        } else {
            this.f2709e.writeInt(bArr.length);
            this.f2709e.writeByteArray(bArr);
        }
    }

    @Override // G2.a
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2709e, 0);
    }

    @Override // G2.a
    public void E(int i8) {
        this.f2709e.writeInt(i8);
    }

    @Override // G2.a
    public void G(Parcelable parcelable) {
        this.f2709e.writeParcelable(parcelable, 0);
    }

    @Override // G2.a
    public void I(String str) {
        this.f2709e.writeString(str);
    }

    @Override // G2.a
    public void a() {
        int i8 = this.f2713i;
        if (i8 >= 0) {
            int i9 = this.f2708d.get(i8);
            int iDataPosition = this.f2709e.dataPosition();
            this.f2709e.setDataPosition(i9);
            this.f2709e.writeInt(iDataPosition - i9);
            this.f2709e.setDataPosition(iDataPosition);
        }
    }

    @Override // G2.a
    public a b() {
        Parcel parcel = this.f2709e;
        int iDataPosition = parcel.dataPosition();
        int i8 = this.f2714j;
        if (i8 == this.f2710f) {
            i8 = this.f2711g;
        }
        return new b(parcel, iDataPosition, i8, this.f2712h + "  ", this.f2705a, this.f2706b, this.f2707c);
    }

    @Override // G2.a
    public boolean g() {
        return this.f2709e.readInt() != 0;
    }

    @Override // G2.a
    public byte[] i() {
        int i8 = this.f2709e.readInt();
        if (i8 < 0) {
            return null;
        }
        byte[] bArr = new byte[i8];
        this.f2709e.readByteArray(bArr);
        return bArr;
    }

    @Override // G2.a
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2709e);
    }

    @Override // G2.a
    public boolean m(int i8) {
        while (this.f2714j < this.f2711g) {
            int i9 = this.f2715k;
            if (i9 == i8) {
                return true;
            }
            if (String.valueOf(i9).compareTo(String.valueOf(i8)) > 0) {
                return false;
            }
            this.f2709e.setDataPosition(this.f2714j);
            int i10 = this.f2709e.readInt();
            this.f2715k = this.f2709e.readInt();
            this.f2714j += i10;
        }
        return this.f2715k == i8;
    }

    @Override // G2.a
    public int o() {
        return this.f2709e.readInt();
    }

    @Override // G2.a
    public Parcelable q() {
        return this.f2709e.readParcelable(getClass().getClassLoader());
    }

    @Override // G2.a
    public String s() {
        return this.f2709e.readString();
    }

    @Override // G2.a
    public void w(int i8) {
        a();
        this.f2713i = i8;
        this.f2708d.put(i8, this.f2709e.dataPosition());
        E(0);
        E(i8);
    }

    @Override // G2.a
    public void y(boolean z8) {
        this.f2709e.writeInt(z8 ? 1 : 0);
    }

    public b(Parcel parcel, int i8, int i9, String str, C1748a c1748a, C1748a c1748a2, C1748a c1748a3) {
        super(c1748a, c1748a2, c1748a3);
        this.f2708d = new SparseIntArray();
        this.f2713i = -1;
        this.f2715k = -1;
        this.f2709e = parcel;
        this.f2710f = i8;
        this.f2711g = i9;
        this.f2714j = i8;
        this.f2712h = str;
    }
}
