package p211y4;

import L4.e;
import android.app.Activity;
import android.app.Fragment;
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

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends Fragment implements InterfaceC3106g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f38387d = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f38388a = Collections.synchronizedMap(new C1748a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38389b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f38390c;

    public static h0 f(Activity activity) {
        h0 h0Var;
        WeakHashMap weakHashMap = f38387d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (h0Var = (h0) weakReference.get()) != null) {
            return h0Var;
        }
        try {
            h0 h0Var2 = (h0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (h0Var2 == null || h0Var2.isRemoving()) {
                h0Var2 = new h0();
                activity.getFragmentManager().beginTransaction().add(h0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(h0Var2));
            return h0Var2;
        } catch (ClassCastException e8) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e8);
        }
    }

    @Override // p211y4.InterfaceC3106g
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f38388a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f38388a.put(str, lifecycleCallback);
        if (this.f38389b > 0) {
            new e(Looper.getMainLooper()).post(new g0(this, lifecycleCallback, str));
        }
    }

    @Override // p211y4.InterfaceC3106g
    public final LifecycleCallback c(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f38388a.get(str));
    }

    @Override // p211y4.InterfaceC3106g
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f38388a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        Iterator it = this.f38388a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i8, i9, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38389b = 1;
        this.f38390c = bundle;
        for (Map.Entry entry : this.f38388a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f38389b = 5;
        Iterator it = this.f38388a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f38389b = 3;
        Iterator it = this.f38388a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f38388a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f38389b = 2;
        Iterator it = this.f38388a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f38389b = 4;
        Iterator it = this.f38388a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
