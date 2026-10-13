package p111m2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: m2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2678c implements Parcelable {
    public static final Parcelable.Creator<C2678c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f29768b;

    /* JADX INFO: renamed from: m2.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2678c createFromParcel(Parcel parcel) {
            return new C2678c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2678c[] newArray(int i8) {
            return new C2678c[i8];
        }
    }

    public C2678c(Parcel parcel) {
        this.f29767a = parcel.createStringArrayList();
        this.f29768b = parcel.createTypedArrayList(C2677b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeStringList(this.f29767a);
        parcel.writeTypedList(this.f29768b);
    }
}
