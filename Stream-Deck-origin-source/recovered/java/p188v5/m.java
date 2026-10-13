package p188v5;

import N4.pa;
import N4.sa;
import android.graphics.Point;
import android.graphics.Rect;
import p180u5.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa f35158a;

    public m(sa saVar) {
        this.f35158a = saVar;
    }

    @Override // p180u5.a
    public final Rect a() {
        Point[] pointArrD = this.f35158a.d();
        if (pointArrD == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrD) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // p180u5.a
    public final int b() {
        return this.f35158a.b();
    }

    @Override // p180u5.a
    public final Point[] c() {
        return this.f35158a.d();
    }

    @Override // p180u5.a
    public final int getFormat() {
        return this.f35158a.a();
    }

    @Override // p180u5.a
    public final p172t5.a.C0774a o() {
        pa paVarC = this.f35158a.c();
        if (paVarC != null) {
            return new p172t5.a.C0774a(paVarC.a(), paVarC.b());
        }
        return null;
    }
}
