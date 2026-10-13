package U1;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: U1.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1661x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10163b;

    public C1661x(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f10162a | this.f10163b;
    }

    public void b(View view, View view2, int i8) {
        c(view, view2, i8, 0);
    }

    public void c(View view, View view2, int i8, int i9) {
        if (i9 == 1) {
            this.f10163b = i8;
        } else {
            this.f10162a = i8;
        }
    }

    public void d(View view, int i8) {
        if (i8 == 1) {
            this.f10163b = 0;
        } else {
            this.f10162a = 0;
        }
    }
}
