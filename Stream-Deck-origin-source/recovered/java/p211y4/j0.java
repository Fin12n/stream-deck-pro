package p211y4;

import D6.iIQ.BmWxZhjGfw;
import L4.e;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p010b0.C1748a;
import p111m2.ActivityC2686k;
import p111m2.ComponentCallbacksC2681f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends ComponentCallbacksC2681f implements InterfaceC3106g {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final WeakHashMap f38405r0 = new WeakHashMap();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Map f38406o0 = Collections.synchronizedMap(new C1748a());

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f38407p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Bundle f38408q0;

    @Override // p111m2.ComponentCallbacksC2681f
    public final void I0() {
        super.I0();
        this.f38407p0 = 3;
        Iterator it = this.f38406o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public final void J0(Bundle bundle) {
        super.J0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f38406o0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public final void K0() {
        super.K0();
        this.f38407p0 = 2;
        Iterator it = this.f38406o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public final void L0() {
        super.L0();
        this.f38407p0 = 4;
        Iterator it = this.f38406o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // p211y4.InterfaceC3106g
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f38406o0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f38406o0.put(str, lifecycleCallback);
        if (this.f38407p0 > 0) {
            new e(Looper.getMainLooper()).post(new i0(this, lifecycleCallback, str));
        }
    }

    @Override // p211y4.InterfaceC3106g
    public final LifecycleCallback c(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f38406o0.get(str));
    }

    @Override // p211y4.InterfaceC3106g
    public final /* synthetic */ Activity d() {
        return n();
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f38406o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public final void i0(int i8, int i9, Intent intent) {
        super.i0(i8, i9, intent);
        Iterator it = this.f38406o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i8, i9, intent);
        }
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public final void n0(Bundle bundle) {
        super.n0(bundle);
        this.f38407p0 = 1;
        this.f38408q0 = bundle;
        for (Map.Entry entry : this.f38406o0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public final void s0() {
        super.s0();
        this.f38407p0 = 5;
        Iterator it = this.f38406o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    public static j0 E1(ActivityC2686k activityC2686k) {
        j0 j0Var;
        WeakHashMap weakHashMap = f38405r0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activityC2686k);
        if (weakReference != null && (j0Var = (j0) weakReference.get()) != null) {
            return j0Var;
        }
        try {
            j0 j0Var2 = (j0) activityC2686k.f0().f0("SupportLifecycleFragmentImpl");
            if (j0Var2 == null || j0Var2.e0()) {
                j0Var2 = new j0();
                activityC2686k.f0().m().d(j0Var2, "SupportLifecycleFragmentImpl").g();
            }
            weakHashMap.put(activityC2686k, new WeakReference(j0Var2));
            return j0Var2;
        } catch (ClassCastException e8) {
            throw new IllegalStateException(BmWxZhjGfw.jHuHELUOqBtB, e8);
        }
    }
}
