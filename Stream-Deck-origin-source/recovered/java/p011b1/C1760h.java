package p011b1;

import android.view.MotionEvent;
import java.util.List;
import p010b0.m;

/* JADX INFO: renamed from: b1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1760h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f15744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f15745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15746c;

    public C1760h(m mVar, B b8) {
        this.f15744a = mVar;
        this.f15745b = b8;
    }

    public final m a() {
        return this.f15744a;
    }

    public final MotionEvent b() {
        return this.f15745b.a();
    }

    public final boolean c() {
        return this.f15746c;
    }

    public final boolean d(long j8) {
        Object obj;
        List listB = this.f15745b.b();
        int size = listB.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = listB.get(i8);
            if (y.d(((C) obj).c(), j8)) {
                break;
            }
            i8++;
        }
        C c8 = (C) obj;
        if (c8 != null) {
            return c8.d();
        }
        return false;
    }

    public final void e(boolean z8) {
        this.f15746c = z8;
    }
}
