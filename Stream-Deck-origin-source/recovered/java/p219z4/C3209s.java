package p219z4;

import A4.a;
import A4.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: z4.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C3209s extends a {
    public static final Parcelable.Creator<C3209s> CREATOR = new C3213w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f39253b;

    public C3209s(int i8, @Nullable List list) {
        this.f39252a = i8;
        this.f39253b = list;
    }

    public final int a() {
        return this.f39252a;
    }

    public final List b() {
        return this.f39253b;
    }

    public final void c(C3205n c3205n) {
        if (this.f39253b == null) {
            this.f39253b = new ArrayList();
        }
        this.f39253b.add(c3205n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.j(parcel, 1, this.f39252a);
        c.r(parcel, 2, this.f39253b, false);
        c.b(parcel, iA);
    }
}
