package p011b1;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: b1.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1766n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1760h f15766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15769e;

    public C1766n(List<z> list, C1760h c1760h) {
        this.f15765a = list;
        this.f15766b = c1760h;
        MotionEvent motionEventE = e();
        this.f15767c = AbstractC1765m.a(motionEventE != null ? motionEventE.getButtonState() : 0);
        MotionEvent motionEventE2 = e();
        this.f15768d = M.b(motionEventE2 != null ? motionEventE2.getMetaState() : 0);
        this.f15769e = a();
    }

    public final int a() {
        MotionEvent motionEventE = e();
        if (motionEventE == null) {
            List list = this.f15765a;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                z zVar = (z) list.get(i8);
                if (AbstractC1767o.d(zVar)) {
                    return r.f15774a.e();
                }
                if (AbstractC1767o.b(zVar)) {
                    return r.f15774a.d();
                }
            }
            return r.f15774a.c();
        }
        int actionMasked = motionEventE.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return r.f15774a.f();
                        case 9:
                            return r.f15774a.a();
                        case 10:
                            return r.f15774a.b();
                        default:
                            return r.f15774a.g();
                    }
                }
                return r.f15774a.c();
            }
            return r.f15774a.e();
        }
        return r.f15774a.d();
    }

    public final int b() {
        return this.f15767c;
    }

    public final List c() {
        return this.f15765a;
    }

    public final C1760h d() {
        return this.f15766b;
    }

    public final MotionEvent e() {
        C1760h c1760h = this.f15766b;
        if (c1760h != null) {
            return c1760h.b();
        }
        return null;
    }

    public final int f() {
        return this.f15769e;
    }

    public final void g(int i8) {
        this.f15769e = i8;
    }

    public C1766n(List<z> list) {
        this(list, null);
    }
}
