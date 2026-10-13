package p109m0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: m0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2664b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0639b f29370b = new C0639b(null);
    public static final Parcelable.Creator<C2664b> CREATOR = new a();

    /* JADX INFO: renamed from: m0.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2664b createFromParcel(Parcel parcel) {
            return new C2664b(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2664b[] newArray(int i8) {
            return new C2664b[i8];
        }
    }

    /* JADX INFO: renamed from: m0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0639b {
        public /* synthetic */ C0639b(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0639b() {
        }
    }

    public C2664b(int i8) {
        this.f29371a = i8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2664b) && this.f29371a == ((C2664b) obj).f29371a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f29371a);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f29371a + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f29371a);
    }
}
