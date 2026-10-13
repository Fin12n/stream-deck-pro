package p195w4;

import A4.a;
import A4.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import p219z4.AbstractC3206o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37092c;

    public d(String str, int i8, long j8) {
        this.f37090a = str;
        this.f37091b = i8;
        this.f37092c = j8;
    }

    public long a() {
        long j8 = this.f37092c;
        return j8 == -1 ? this.f37091b : j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((getName() != null && getName().equals(dVar.getName())) || (getName() == null && dVar.getName() == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f37090a;
    }

    public final int hashCode() {
        return AbstractC3206o.b(getName(), Long.valueOf(a()));
    }

    public final String toString() {
        AbstractC3206o.a aVarC = AbstractC3206o.c(this);
        aVarC.a("name", getName());
        aVarC.a(DiagnosticsEntry.VERSION_KEY, Long.valueOf(a()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.n(parcel, 1, getName(), false);
        c.j(parcel, 2, this.f37091b);
        c.l(parcel, 3, a());
        c.b(parcel, iA);
    }

    public d(String str, long j8) {
        this.f37090a = str;
        this.f37092c = j8;
        this.f37091b = -1;
    }
}
