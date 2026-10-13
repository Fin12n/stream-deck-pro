package p111m2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f29620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f29621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2677b[] f29622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f29625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f29626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f29627h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public A createFromParcel(Parcel parcel) {
            return new A(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public A[] newArray(int i8) {
            return new A[i8];
        }
    }

    public A() {
        this.f29624e = null;
        this.f29625f = new ArrayList();
        this.f29626g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeStringList(this.f29620a);
        parcel.writeStringList(this.f29621b);
        parcel.writeTypedArray(this.f29622c, i8);
        parcel.writeInt(this.f29623d);
        parcel.writeString(this.f29624e);
        parcel.writeStringList(this.f29625f);
        parcel.writeTypedList(this.f29626g);
        parcel.writeTypedList(this.f29627h);
    }

    public A(Parcel parcel) {
        this.f29624e = null;
        this.f29625f = new ArrayList();
        this.f29626g = new ArrayList();
        this.f29620a = parcel.createStringArrayList();
        this.f29621b = parcel.createStringArrayList();
        this.f29622c = (C2677b[]) parcel.createTypedArray(C2677b.CREATOR);
        this.f29623d = parcel.readInt();
        this.f29624e = parcel.readString();
        this.f29625f = parcel.createStringArrayList();
        this.f29626g = parcel.createTypedArrayList(C2678c.CREATOR);
        this.f29627h = parcel.createTypedArrayList(y.k.CREATOR);
    }
}
