package p215z0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: z0.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3174q0 extends c1 implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f38896c = new b(null);
    public static final Parcelable.Creator<C3174q0> CREATOR = new a();

    /* JADX INFO: renamed from: z0.q0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3174q0 createFromParcel(Parcel parcel) {
            return new C3174q0(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3174q0[] newArray(int i8) {
            return new C3174q0[i8];
        }
    }

    /* JADX INFO: renamed from: z0.q0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    public C3174q0(int i8) {
        super(i8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(f());
    }
}
