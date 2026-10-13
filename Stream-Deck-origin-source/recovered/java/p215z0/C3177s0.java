package p215z0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: z0.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3177s0 extends e1 implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f38926d = new b(null);
    public static final Parcelable.Creator<C3177s0> CREATOR = new a();

    /* JADX INFO: renamed from: z0.s0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3177s0 createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3177s0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            f1 f1VarK;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i8 = parcel.readInt();
            if (i8 == 0) {
                f1VarK = g1.k();
            } else if (i8 == 1) {
                f1VarK = g1.r();
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i8 + " was restored");
                }
                f1VarK = g1.o();
            }
            return new C3177s0(value, f1VarK);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C3177s0[] newArray(int i8) {
            return new C3177s0[i8];
        }
    }

    /* JADX INFO: renamed from: z0.s0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    public C3177s0(Object obj, f1 f1Var) {
        super(obj, f1Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9;
        parcel.writeValue(getValue());
        f1 f1VarD = d();
        if (t.c(f1VarD, g1.k())) {
            i9 = 0;
        } else if (t.c(f1VarD, g1.r())) {
            i9 = 1;
        } else {
            if (!t.c(f1VarD, g1.o())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i9 = 2;
        }
        parcel.writeInt(i9);
    }
}
