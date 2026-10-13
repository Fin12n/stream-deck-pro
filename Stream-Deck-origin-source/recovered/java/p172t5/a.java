package p172t5;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import p204x5.b;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p180u5.a f34262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f34263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Point[] f34264c;

    /* JADX INFO: renamed from: t5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0774a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f34266b;

        public C0774a(String str, String str2) {
            this.f34265a = str;
            this.f34266b = str2;
        }

        public String a() {
            return this.f34266b;
        }
    }

    public a(p180u5.a aVar) {
        this(aVar, null);
    }

    public Point[] a() {
        return this.f34264c;
    }

    public int b() {
        int format = this.f34262a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public C0774a c() {
        return this.f34262a.o();
    }

    public int d() {
        return this.f34262a.b();
    }

    public a(p180u5.a aVar, Matrix matrix) {
        this.f34262a = (p180u5.a) AbstractC3207p.k(aVar);
        Rect rectA = aVar.a();
        if (rectA != null && matrix != null) {
            b.c(rectA, matrix);
        }
        this.f34263b = rectA;
        Point[] pointArrC = aVar.c();
        if (pointArrC != null && matrix != null) {
            b.b(pointArrC, matrix);
        }
        this.f34264c = pointArrC;
    }
}
