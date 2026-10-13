package N2;

import D6.r;
import I2.h;
import I2.j;
import Q6.k;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0215a f5819b = new C0215a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5820c = a.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5821a;

    /* JADX INFO: renamed from: N2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0215a {
        public /* synthetic */ C0215a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a(SidecarDeviceState sidecarDeviceState) {
            t.g(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                    t.e(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) objInvoke).intValue();
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            t.g(sidecarDeviceState, "sidecarDeviceState");
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        public final List c(SidecarWindowLayoutInfo info) {
            t.g(info, "info");
            try {
                try {
                    List list = info.displayFeatures;
                    return list == null ? r.n() : list;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                    t.e(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    return (List) objInvoke;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return r.n();
            }
            return r.n();
        }

        public final void d(SidecarDeviceState sidecarDeviceState, int i8) {
            t.g(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i8;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i8));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public C0215a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5822a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            t.g(require, "$this$require");
            boolean z8 = true;
            if (require.getType() != 1 && require.getType() != 2) {
                z8 = false;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f5823a = new c();

        public c() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            t.g(require, "$this$require");
            return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f5824a = new d();

        public d() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            t.g(require, "$this$require");
            boolean z8 = true;
            if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                z8 = false;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f5825a = new e();

        public e() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            t.g(require, "$this$require");
            return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (t.c(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C0215a c0215a = f5819b;
        return c0215a.b(sidecarDeviceState) == c0215a.b(sidecarDeviceState2);
    }

    public final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (t.c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return t.c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!b((SidecarDisplayFeature) list.get(i8), (SidecarDisplayFeature) list2.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (t.c(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C0215a c0215a = f5819b;
        return c(c0215a.c(sidecarWindowLayoutInfo), c0215a.c(sidecarWindowLayoutInfo2));
    }

    public final K2.j e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        t.g(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new K2.j(r.n());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        C0215a c0215a = f5819b;
        c0215a.d(sidecarDeviceState, c0215a.b(state));
        return new K2.j(f(c0215a.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final List f(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        t.g(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        t.g(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            K2.a aVarG = g((SidecarDisplayFeature) it.next(), deviceState);
            if (aVarG != null) {
                arrayList.add(aVarG);
            }
        }
        return arrayList;
    }

    public final K2.a g(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        K2.d.b bVarA;
        K2.c.C0164c c0164c;
        t.g(feature, "feature");
        t.g(deviceState, "deviceState");
        h.a aVar = h.f3751a;
        String TAG = f5820c;
        t.f(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) h.a.b(aVar, feature, TAG, this.f5821a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f5822a).c("Feature bounds must not be 0", c.f5823a).c("TYPE_FOLD must have 0 area", d.f5824a).c("Feature be pinned to either left or top", e.f5825a).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVarA = K2.d.b.f4570b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = K2.d.b.f4570b.b();
        }
        int iB = f5819b.b(deviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            c0164c = K2.c.C0164c.f4564d;
        } else {
            if (iB != 3 && iB == 4) {
                return null;
            }
            c0164c = K2.c.C0164c.f4563c;
        }
        Rect rect = feature.getRect();
        t.f(rect, "feature.rect");
        return new K2.d(new I2.b(rect), bVarA, c0164c);
    }

    public a(j verificationMode) {
        t.g(verificationMode, "verificationMode");
        this.f5821a = verificationMode;
    }

    public /* synthetic */ a(j jVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? j.QUIET : jVar);
    }
}
