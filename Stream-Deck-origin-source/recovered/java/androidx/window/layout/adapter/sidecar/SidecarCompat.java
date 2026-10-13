package androidx.window.layout.adapter.sidecar;

import C6.G;
import D6.r;
import I2.k;
import K2.j;
import P2.Lsk.mHPawN;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15429f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SidecarInterface f15430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N2.a f15431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f15432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f15433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f15434e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface sidecarInterfaceH;
            t.g(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = SidecarCompat.this.f15432c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                IBinder iBinderA = SidecarCompat.f15429f.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecarInterfaceH = sidecarCompat.h()) != null) {
                    windowLayoutInfo = sidecarInterfaceH.getWindowLayoutInfo(iBinderA);
                }
                b bVar = sidecarCompat.f15434e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.f15431b.e(windowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState sidecarDeviceState;
            t.g(windowToken, "windowToken");
            t.g(newLayout, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f15432c.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            N2.a aVar = SidecarCompat.this.f15431b;
            SidecarInterface sidecarInterfaceH = SidecarCompat.this.h();
            if (sidecarInterfaceH == null || (sidecarDeviceState = sidecarInterfaceH.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            j jVarE = aVar.e(newLayout, sidecarDeviceState);
            b bVar = SidecarCompat.this.f15434e;
            if (bVar != null) {
                bVar.a(activity, jVarE);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            t.g(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final k c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return k.f3760f.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements androidx.window.layout.adapter.sidecar.a.InterfaceC0387a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.window.layout.adapter.sidecar.a.InterfaceC0387a f15436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReentrantLock f15437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WeakHashMap f15438c;

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0387a
        public void a(Activity activity, j newLayout) {
            t.g(activity, "activity");
            t.g(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f15437b;
            reentrantLock.lock();
            try {
                if (t.c(newLayout, (j) this.f15438c.get(activity))) {
                    reentrantLock.unlock();
                    return;
                }
                reentrantLock.unlock();
                this.f15436a.a(activity, newLayout);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final void b(Activity activity) {
            t.g(activity, "activity");
            ReentrantLock reentrantLock = this.f15437b;
            reentrantLock.lock();
            try {
                this.f15438c.put(activity, null);
                G g8 = G.f1419a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public b(androidx.window.layout.adapter.sidecar.a.InterfaceC0387a interfaceC0387a) {
            t.g(interfaceC0387a, mHPawN.KFYGkcBcBujyY);
            this.f15436a = interfaceC0387a;
            this.f15437b = new ReentrantLock();
            this.f15438c = new WeakHashMap();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SidecarCompat f15439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference f15440b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            t.g(sidecarCompat, "sidecarCompat");
            t.g(activity, "activity");
            this.f15439a = sidecarCompat;
            this.f15440b = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            t.g(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f15440b.get();
            IBinder iBinderA = SidecarCompat.f15429f.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.f15439a.j(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            t.g(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, N2.a sidecarAdapter) {
        t.g(sidecarAdapter, "sidecarAdapter");
        this.f15430a = sidecarInterface;
        this.f15431b = sidecarAdapter;
        this.f15432c = new LinkedHashMap();
        this.f15433d = new LinkedHashMap();
    }

    public static final void l(SidecarCompat this$0, Activity activity, Configuration configuration) {
        t.g(this$0, "this$0");
        t.g(activity, "$activity");
        b bVar = this$0.f15434e;
        if (bVar != null) {
            bVar.a(activity, this$0.i(activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void a(androidx.window.layout.adapter.sidecar.a.InterfaceC0387a extensionCallback) {
        t.g(extensionCallback, "extensionCallback");
        this.f15434e = new b(extensionCallback);
        SidecarInterface sidecarInterface = this.f15430a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f15431b, new TranslatingCallback()));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void b(Activity activity) {
        t.g(activity, "activity");
        IBinder iBinderA = f15429f.a(activity);
        if (iBinderA != null) {
            j(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        t.g(activity, "activity");
        IBinder iBinderA = f15429f.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f15430a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        m(activity);
        b bVar = this.f15434e;
        if (bVar != null) {
            bVar.b(activity);
        }
        boolean z8 = this.f15432c.size() == 1;
        this.f15432c.remove(iBinderA);
        if (!z8 || (sidecarInterface = this.f15430a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final SidecarInterface h() {
        return this.f15430a;
    }

    public final j i(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        t.g(activity, "activity");
        IBinder iBinderA = f15429f.a(activity);
        if (iBinderA == null) {
            return new j(r.n());
        }
        SidecarInterface sidecarInterface = this.f15430a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        N2.a aVar = this.f15431b;
        SidecarInterface sidecarInterface2 = this.f15430a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return aVar.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void j(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        t.g(windowToken, "windowToken");
        t.g(activity, "activity");
        this.f15432c.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.f15430a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.f15432c.size() == 1 && (sidecarInterface = this.f15430a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f15434e;
        if (bVar != null) {
            bVar.a(activity, i(activity));
        }
        k(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(final Activity activity) {
        if (this.f15433d.get(activity) == null && (activity instanceof I1.c)) {
            T1.a aVar = new T1.a() { // from class: N2.b
                @Override // T1.a
                public final void accept(Object obj) {
                    SidecarCompat.l(this.f5826a, activity, (Configuration) obj);
                }
            };
            this.f15433d.put(activity, aVar);
            ((I1.c) activity).h(aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(Activity activity) {
        T1.a aVar = (T1.a) this.f15433d.get(activity);
        if (aVar == null) {
            return;
        }
        if (activity instanceof I1.c) {
            ((I1.c) activity).t(aVar);
        }
        this.f15433d.remove(activity);
    }

    public boolean n() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f15430a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!t.c(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f15430a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f15430a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f15430a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!t.c(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f15430a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!t.c(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f15430a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!t.c(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                t.e(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            t.f(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                t.e(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (t.c(arrayList, (List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f15429f.b(context), new N2.a(null, 1, null));
        t.g(context, "context");
    }
}
