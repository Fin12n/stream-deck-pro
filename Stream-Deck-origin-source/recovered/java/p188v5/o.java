package p188v5;

import N4.C1348x7;
import N4.C1371z8;
import android.graphics.Point;
import android.graphics.Rect;
import p180u5.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1371z8 f35167a;

    public o(C1371z8 c1371z8) {
        this.f35167a = c1371z8;
    }

    @Override // p180u5.a
    public final Rect a() {
        C1371z8 c1371z8 = this.f35167a;
        if (c1371z8.f7419e == null) {
            return null;
        }
        int i8 = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = c1371z8.f7419e;
            if (i8 >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i8];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i8++;
        }
    }

    @Override // p180u5.a
    public final int b() {
        return this.f35167a.f7418d;
    }

    @Override // p180u5.a
    public final Point[] c() {
        return this.f35167a.f7419e;
    }

    @Override // p180u5.a
    public final int getFormat() {
        return this.f35167a.f7415a;
    }

    @Override // p180u5.a
    public final p172t5.a.C0774a o() {
        C1348x7 c1348x7 = this.f35167a.f7424j;
        if (c1348x7 != null) {
            return new p172t5.a.C0774a(c1348x7.f7380a, c1348x7.f7381b);
        }
        return null;
    }
}
