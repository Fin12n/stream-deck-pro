package p216z1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39019b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f39020c = new k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f39021d = new k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f39022e = new k(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39023a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final k a(List list) {
            Integer numValueOf = 0;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | ((k) list.get(i8)).e());
            }
            return new k(numValueOf.intValue());
        }

        public final k b() {
            return k.f39022e;
        }

        public final k c() {
            return k.f39020c;
        }

        public final k d() {
            return k.f39021d;
        }

        public a() {
        }
    }

    public k(int i8) {
        this.f39023a = i8;
    }

    public final boolean d(k kVar) {
        int i8 = this.f39023a;
        return (kVar.f39023a | i8) == i8;
    }

    public final int e() {
        return this.f39023a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f39023a == ((k) obj).f39023a;
    }

    public int hashCode() {
        return this.f39023a;
    }

    public String toString() {
        if (this.f39023a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f39023a & f39021d.f39023a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f39023a & f39022e.f39023a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + C1.a.d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
