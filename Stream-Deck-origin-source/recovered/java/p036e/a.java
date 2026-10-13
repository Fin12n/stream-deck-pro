package p036e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f19964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f19962c = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new C0463a();

    /* JADX INFO: renamed from: e.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0463a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i8) {
            return new a[i8];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final String a(int i8) {
            if (i8 != -1) {
                return i8 != 0 ? String.valueOf(i8) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }

        public b() {
        }
    }

    public a(int i8, Intent intent) {
        this.f19963a = i8;
        this.f19964b = intent;
    }

    public final Intent a() {
        return this.f19964b;
    }

    public final int b() {
        return this.f19963a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f19962c.a(this.f19963a) + ", data=" + this.f19964b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i8) {
        t.g(dest, "dest");
        dest.writeInt(this.f19963a);
        dest.writeInt(this.f19964b == null ? 0 : 1);
        Intent intent = this.f19964b;
        if (intent != null) {
            intent.writeToParcel(dest, i8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        t.g(parcel, "parcel");
    }
}
