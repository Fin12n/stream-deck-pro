package D4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p219z4.AbstractC3206o;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a extends A4.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator f1903e = new Comparator() { // from class: D4.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            p195w4.d dVar = (p195w4.d) obj;
            p195w4.d dVar2 = (p195w4.d) obj2;
            Parcelable.Creator<a> creator = a.CREATOR;
            return !dVar.getName().equals(dVar2.getName()) ? dVar.getName().compareTo(dVar2.getName()) : (dVar.a() > dVar2.a() ? 1 : (dVar.a() == dVar2.a() ? 0 : -1));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1907d;

    public a(List list, boolean z8, String str, String str2) {
        AbstractC3207p.k(list);
        this.f1904a = list;
        this.f1905b = z8;
        this.f1906c = str;
        this.f1907d = str2;
    }

    public static a a(C4.f fVar) {
        return c(fVar.a(), true);
    }

    public static a c(List list, boolean z8) {
        TreeSet treeSet = new TreeSet(f1903e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((p203x4.h) it.next()).b());
        }
        return new a(new ArrayList(treeSet), z8, null, null);
    }

    public List b() {
        return this.f1904a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1905b == aVar.f1905b && AbstractC3206o.a(this.f1904a, aVar.f1904a) && AbstractC3206o.a(this.f1906c, aVar.f1906c) && AbstractC3206o.a(this.f1907d, aVar.f1907d);
    }

    public final int hashCode() {
        return AbstractC3206o.b(Boolean.valueOf(this.f1905b), this.f1904a, this.f1906c, this.f1907d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.r(parcel, 1, b(), false);
        A4.c.c(parcel, 2, this.f1905b);
        A4.c.n(parcel, 3, this.f1906c, false);
        A4.c.n(parcel, 4, this.f1907d, false);
        A4.c.b(parcel, iA);
    }
}
