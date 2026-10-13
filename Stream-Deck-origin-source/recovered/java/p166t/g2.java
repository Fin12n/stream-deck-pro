package p166t;

import A.C0883m;
import F1.c;
import I.w;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.lifecycle.AbstractC1737u;
import androidx.lifecycle.x;
import java.util.Objects;
import java.util.concurrent.Executor;
import p174u.n;
import p179u4.eubL.OjEsfyJYzbPn;
import p198x.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2984w f33713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f33714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f33715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f33717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f33721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.a f33722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.a f33723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f33724l;

    public g2(C2984w c2984w, n nVar, Executor executor) {
        this.f33713a = c2984w;
        this.f33717e = executor;
        Objects.requireNonNull(nVar);
        boolean zA = g.a(new C2923b0(nVar));
        this.f33716d = zA;
        boolean zH = nVar.h();
        this.f33719g = zH;
        int iC = (zA && zH) ? nVar.c() : 0;
        this.f33720h = iC;
        this.f33721i = iC;
        this.f33714b = new x(0);
        this.f33715c = new x(Integer.valueOf(this.f33720h));
        c2984w.t(new C2984w.c() { // from class: t.f2
            @Override // p166t.C2984w.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return g2.a(this.f33710a, totalCaptureResult);
            }
        });
    }

    public static /* synthetic */ boolean a(g2 g2Var, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (g2Var.f33723k != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num2 != null && num2.intValue() == 2) == g2Var.f33724l) {
                g2Var.f33723k.c(null);
                g2Var.f33723k = null;
            }
        }
        if (g2Var.f33719g && Build.VERSION.SDK_INT >= 35 && g2Var.f33722j != null && (num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STRENGTH_LEVEL)) != null && num.intValue() == g2Var.f33721i) {
            g2Var.f33722j.c(null);
            g2Var.f33722j = null;
        }
        return false;
    }

    public void c() {
        if (this.f33724l) {
            this.f33724l = false;
            h(0);
        }
    }

    public AbstractC1737u d() {
        return this.f33714b;
    }

    public AbstractC1737u e() {
        return this.f33715c;
    }

    public void f(boolean z8) {
        if (this.f33718f == z8) {
            return;
        }
        this.f33718f = z8;
        if (z8) {
            return;
        }
        if (this.f33724l) {
            this.f33724l = false;
            this.f33721i = this.f33720h;
            this.f33713a.x(0);
            h(0);
            g(this.f33715c, Integer.valueOf(this.f33720h));
        }
        c.a aVar = this.f33723k;
        if (aVar != null) {
            aVar.f(new C0883m("Camera is not active."));
            this.f33723k = null;
        }
        c.a aVar2 = this.f33722j;
        if (aVar2 != null) {
            aVar2.f(new C0883m("Camera is not active."));
            this.f33722j = null;
        }
    }

    public final void g(x xVar, Object obj) {
        if (w.d()) {
            xVar.m(obj);
        } else {
            xVar.k(obj);
        }
    }

    public final void h(int i8) {
        g(this.f33714b, Integer.valueOf(i8 != 1 ? 0 : 1));
    }

    public void b(c.a aVar, int i8) {
        if (!this.f33716d) {
            if (aVar != null) {
                aVar.f(new IllegalStateException(OjEsfyJYzbPn.pNUVMfz));
                return;
            }
            return;
        }
        if (!this.f33718f) {
            h(0);
            if (aVar != null) {
                aVar.f(new C0883m("Camera is not active."));
                return;
            }
            return;
        }
        if (this.f33713a.P()) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("Torch can not be enabled when low-light boost is on!"));
                return;
            }
            return;
        }
        this.f33724l = i8 != 0;
        this.f33713a.x(i8);
        h(i8);
        c.a aVar2 = this.f33723k;
        if (aVar2 != null) {
            aVar2.f(new C0883m("There is a new enableTorch being set"));
        }
        this.f33723k = aVar;
    }
}
