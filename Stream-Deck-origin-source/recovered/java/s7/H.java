package s7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f33183a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f33184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33185c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33186a = new a();
    }

    public H() {
        int[] iArr = new int[8];
        for (int i8 = 0; i8 < 8; i8++) {
            iArr[i8] = -1;
        }
        this.f33184b = iArr;
        this.f33185c = -1;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i8 = this.f33185c + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            Object obj = this.f33183a[i9];
            if (obj instanceof o7.f) {
                o7.f fVar = (o7.f) obj;
                if (!kotlin.jvm.internal.t.c(fVar.e(), o7.k.b.f31005a)) {
                    int i10 = this.f33184b[i9];
                    if (i10 >= 0) {
                        sb.append(".");
                        sb.append(fVar.g(i10));
                    }
                } else if (this.f33184b[i9] != -1) {
                    sb.append("[");
                    sb.append(this.f33184b[i9]);
                    sb.append("]");
                }
            } else if (obj != a.f33186a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }

    public final void b() {
        int i8 = this.f33185c;
        int[] iArr = this.f33184b;
        if (iArr[i8] == -2) {
            iArr[i8] = -1;
            this.f33185c = i8 - 1;
        }
        int i9 = this.f33185c;
        if (i9 != -1) {
            this.f33185c = i9 - 1;
        }
    }

    public final void c(o7.f sd) {
        kotlin.jvm.internal.t.g(sd, "sd");
        int i8 = this.f33185c + 1;
        this.f33185c = i8;
        if (i8 == this.f33183a.length) {
            e();
        }
        this.f33183a[i8] = sd;
    }

    public final void d() {
        int[] iArr = this.f33184b;
        int i8 = this.f33185c;
        if (iArr[i8] == -2) {
            this.f33183a[i8] = a.f33186a;
        }
    }

    public final void e() {
        int i8 = this.f33185c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f33183a, i8);
        kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(...)");
        this.f33183a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f33184b, i8);
        kotlin.jvm.internal.t.f(iArrCopyOf, "copyOf(...)");
        this.f33184b = iArrCopyOf;
    }

    public final void f(Object obj) {
        int[] iArr = this.f33184b;
        int i8 = this.f33185c;
        if (iArr[i8] != -2) {
            int i9 = i8 + 1;
            this.f33185c = i9;
            if (i9 == this.f33183a.length) {
                e();
            }
        }
        Object[] objArr = this.f33183a;
        int i10 = this.f33185c;
        objArr[i10] = obj;
        this.f33184b[i10] = -2;
    }

    public final void g(int i8) {
        this.f33184b[this.f33185c] = i8;
    }

    public String toString() {
        return a();
    }
}
