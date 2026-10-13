package Q3;

import C6.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9197d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9200c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        CLOCKWISE,
        COUNTERCLOCKWISE;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ J6.a f9204d = J6.b.a(a());
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9205a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CLOCKWISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.COUNTERCLOCKWISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9205a = iArr;
        }
    }

    public d(int i8, int i9, List<Object> grid) {
        t.g(grid, "grid");
        this.f9198a = i8;
        this.f9199b = i9;
        this.f9200c = grid;
        if (i8 < 0) {
            throw new IllegalArgumentException("rows must be 0 or greater");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("columns must be 0 or greater");
        }
        if (grid.size() != i8 * i9) {
            throw new IllegalArgumentException("grid size must be rows * columns");
        }
    }

    public static /* synthetic */ d b(d dVar, int i8, int i9, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = dVar.f9198a;
        }
        if ((i10 & 2) != 0) {
            i9 = dVar.f9199b;
        }
        if ((i10 & 4) != 0) {
            list = dVar.f9200c;
        }
        return dVar.a(i8, i9, list);
    }

    public final d a(int i8, int i9, List grid) {
        t.g(grid, "grid");
        return new d(i8, i9, grid);
    }

    public final Object c(int i8, int i9) {
        return this.f9200c.get((this.f9199b * i8) + i9);
    }

    public final int d() {
        return this.f9199b;
    }

    public final List e() {
        return this.f9200c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9198a == dVar.f9198a && this.f9199b == dVar.f9199b && t.c(this.f9200c, dVar.f9200c);
    }

    public final int f() {
        return this.f9198a;
    }

    public final boolean g(int i8) {
        return i8 >= 0 && i8 < this.f9200c.size();
    }

    public final boolean h(int i8, int i9) {
        return i8 >= 0 && i8 < this.f9198a && i9 >= 0 && i9 < this.f9199b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f9198a) * 31) + Integer.hashCode(this.f9199b)) * 31) + this.f9200c.hashCode();
    }

    public final boolean i() {
        int i8 = this.f9198a;
        return i8 > 0 && ((float) this.f9199b) / ((float) i8) < 1.0f;
    }

    public final d j(b rotation) {
        Object objC;
        t.g(rotation, "rotation");
        ArrayList arrayList = new ArrayList(this.f9200c);
        int i8 = this.f9198a;
        int i9 = this.f9199b;
        for (int i10 = 0; i10 < i8; i10++) {
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = (i8 * i11) + i10;
                int i13 = c.f9205a[rotation.ordinal()];
                if (i13 == 1) {
                    objC = c((i8 - i10) - 1, i11);
                } else {
                    if (i13 != 2) {
                        throw new m();
                    }
                    objC = c(i10, (i9 - i11) - 1);
                }
                arrayList.set(i12, objC);
            }
        }
        return new d(i9, i8, arrayList);
    }

    public String toString() {
        return "Matrix(rows=" + this.f9198a + ", columns=" + this.f9199b + ", grid=" + this.f9200c + ")";
    }
}
