package H;

import A.AbstractC0890p0;
import A.AbstractC0902w;
import A.C0894s;
import A.InterfaceC0898u;
import D6.C0938s;
import androidx.lifecycle.AbstractC1737u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2633k;
import p043e6.dT.GIGvBf;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f2882l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f2883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H f2885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y f2886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public R0 f2887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f2888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile List f2889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f2890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f2891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f2892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f2893k;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f2894a;

        public b(InterfaceC0898u listener, Executor executor) {
            kotlin.jvm.internal.t.g(listener, "listener");
            kotlin.jvm.internal.t.g(executor, "executor");
            this.f2894a = executor;
        }

        public final Executor a() {
            return this.f2894a;
        }

        public final InterfaceC0898u b() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return kotlin.jvm.internal.t.c(null, null) && kotlin.jvm.internal.t.c(this.f2894a, ((b) obj).f2894a);
            }
            return false;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "ListenerWrapper(listener=" + ((Object) null) + ", executor=" + this.f2894a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class c implements R0.a {
        public c() {
        }

        @Override // H.R0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            H h8;
            List listN;
            if (T.this.f2890h.get() && (h8 = T.this.f2885c) != null) {
                if (list != null) {
                    listN = new ArrayList(C0938s.y(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        listN.add(((C0894s) it.next()).c());
                    }
                } else {
                    listN = D6.r.n();
                }
                try {
                    h8.e(listN);
                    Set setC = h8.c();
                    kotlin.jvm.internal.t.f(setC, "getAvailableCameraIds(...)");
                    Set<String> set = setC;
                    ArrayList arrayList = new ArrayList(C0938s.y(set, 10));
                    for (String str : set) {
                        C0894s.a aVar = C0894s.f306c;
                        kotlin.jvm.internal.t.d(str);
                        arrayList.add(C0894s.a.d(aVar, str, null, null, 6, null));
                    }
                    T.this.t(arrayList);
                } catch (Exception e8) {
                    AbstractC0890p0.d("CameraPresencePrvdr", "CameraFactory failed to update. Triggering refresh.", e8);
                    R0 r8 = T.this.f2887e;
                    if (r8 != null) {
                        r8.a();
                    }
                }
            }
        }

        @Override // H.R0.a
        public void onError(Throwable t8) {
            kotlin.jvm.internal.t.g(t8, "t");
            if (T.this.f2890h.get()) {
                AbstractC0890p0.d("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", t8);
                R0 r8 = T.this.f2887e;
                if (r8 != null) {
                    r8.a();
                }
            }
        }
    }

    public T(Executor backgroundExecutor) {
        kotlin.jvm.internal.t.g(backgroundExecutor, "backgroundExecutor");
        this.f2883a = backgroundExecutor;
        this.f2884b = new Object();
        this.f2888f = new c();
        this.f2889g = D6.r.n();
        this.f2890h = new AtomicBoolean(false);
        this.f2891i = new CopyOnWriteArrayList();
        this.f2892j = new CopyOnWriteArrayList();
        this.f2893k = new LinkedHashMap();
    }

    public static final void m(List list, androidx.lifecycle.y yVar, String str) {
        Object next;
        AbstractC1737u abstractC1737uB;
        try {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.t.c(((I) next).e(), str));
            I i8 = (I) next;
            if (i8 == null || (abstractC1737uB = i8.b()) == null) {
                return;
            }
            abstractC1737uB.l(yVar);
        } catch (IllegalArgumentException unused) {
        }
    }

    public static final void p(b bVar, Set set) {
        bVar.b();
        throw null;
    }

    public static final void r(b bVar, Set set) {
        bVar.b();
        throw null;
    }

    public static final void v(J j8, androidx.lifecycle.y yVar) {
        j8.r().b().l(yVar);
    }

    public static final void y(I i8, androidx.lifecycle.y yVar) {
        i8.b().h(yVar);
    }

    public final void A(H cameraFactory, Y cameraRepository) {
        kotlin.jvm.internal.t.g(cameraFactory, "cameraFactory");
        kotlin.jvm.internal.t.g(cameraRepository, "cameraRepository");
        if (this.f2890h.compareAndSet(false, true)) {
            AbstractC0890p0.e("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            Set setC = cameraFactory.c();
            kotlin.jvm.internal.t.f(setC, "getAvailableCameraIds(...)");
            Set<String> set = setC;
            ArrayList arrayList = new ArrayList(C0938s.y(set, 10));
            for (String str : set) {
                C0894s.a aVar = C0894s.f306c;
                kotlin.jvm.internal.t.d(str);
                arrayList.add(C0894s.a.d(aVar, str, null, null, 6, null));
            }
            this.f2889g = arrayList;
            this.f2885c = cameraFactory;
            this.f2886d = cameraRepository;
            R0 r0B = cameraFactory.b();
            this.f2887e = r0B;
            if (r0B != null) {
                r0B.b(this.f2883a, this.f2888f);
            }
        }
    }

    public final void k(C0 listener) {
        kotlin.jvm.internal.t.g(listener, "listener");
        this.f2891i.add(listener);
    }

    public final void l() {
        synchronized (this.f2884b) {
            if (this.f2893k.isEmpty()) {
                return;
            }
            Map mapV = D6.M.v(this.f2893k);
            this.f2893k.clear();
            C6.G g8 = C6.G.f1419a;
            Y y8 = this.f2886d;
            if (y8 != null) {
                LinkedHashSet linkedHashSetM = y8.m();
                kotlin.jvm.internal.t.f(linkedHashSetM, "getCameras(...)");
                final ArrayList arrayList = new ArrayList(C0938s.y(linkedHashSetM, 10));
                Iterator it = linkedHashSetM.iterator();
                while (it.hasNext()) {
                    arrayList.add(((J) it.next()).r());
                }
                AbstractC0890p0.a("CameraPresencePrvdr", "Clearing all " + mapV.size() + " state observers.");
                ArrayList arrayList2 = new ArrayList(mapV.size());
                for (Map.Entry entry : mapV.entrySet()) {
                    final String str = (String) entry.getKey();
                    final androidx.lifecycle.y yVar = (androidx.lifecycle.y) entry.getValue();
                    J.a.d().execute(new Runnable() { // from class: H.S
                        @Override // java.lang.Runnable
                        public final void run() {
                            T.m(arrayList, yVar, str);
                        }
                    });
                    arrayList2.add(C6.G.f1419a);
                }
            }
        }
    }

    public final void n(String str) {
        Y y8 = this.f2886d;
        if (y8 == null) {
            return;
        }
        try {
            J jL = y8.l(str);
            kotlin.jvm.internal.t.f(jL, "getCamera(...)");
            I iR = jL.r();
            kotlin.jvm.internal.t.f(iR, "getCameraInfoInternal(...)");
            w(iR);
        } catch (IllegalArgumentException unused) {
            AbstractC0890p0.l("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void o(final Set set) {
        for (final b bVar : this.f2892j) {
            bVar.a().execute(new Runnable() { // from class: H.O
                @Override // java.lang.Runnable
                public final void run() {
                    T.p(bVar, set);
                }
            });
        }
    }

    public final void q(final Set set) {
        for (final b bVar : this.f2892j) {
            bVar.a().execute(new Runnable() { // from class: H.M
                @Override // java.lang.Runnable
                public final void run() {
                    T.r(bVar, set);
                }
            });
        }
    }

    public final void s(Set set, Set set2) {
        if (!set.isEmpty()) {
            AbstractC0890p0.e("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            o(set);
        }
        if (set2.isEmpty()) {
            return;
        }
        AbstractC0890p0.e("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        q(set2);
    }

    public final void u(String str) {
        synchronized (this.f2884b) {
            final androidx.lifecycle.y yVar = (androidx.lifecycle.y) this.f2893k.remove(str);
            Y y8 = this.f2886d;
            if (yVar != null && y8 != null) {
                try {
                    final J jL = y8.l(str);
                    kotlin.jvm.internal.t.f(jL, "getCamera(...)");
                    J.a.d().execute(new Runnable() { // from class: H.N
                        @Override // java.lang.Runnable
                        public final void run() {
                            T.v(jL, yVar);
                        }
                    });
                    AbstractC0890p0.a("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
            C6.G g8 = C6.G.f1419a;
        }
    }

    public final void w(final I i8) {
        final String strE = i8.e();
        kotlin.jvm.internal.t.f(strE, "getCameraId(...)");
        if (this.f2890h.get()) {
            synchronized (this.f2884b) {
                if (this.f2893k.containsKey(strE)) {
                    return;
                }
                final androidx.lifecycle.y yVar = new androidx.lifecycle.y() { // from class: H.P
                    @Override // androidx.lifecycle.y
                    public final void a(Object obj) {
                        T.x(this.f2875a, strE, (AbstractC0902w) obj);
                    }
                };
                J.a.d().execute(new Runnable() { // from class: H.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        T.y(i8, yVar);
                    }
                });
                this.f2893k.put(strE, yVar);
                AbstractC0890p0.a("CameraPresencePrvdr", "Registered state observer for camera: " + strE);
                C6.G g8 = C6.G.f1419a;
            }
        }
    }

    public final void z() {
        if (!this.f2890h.getAndSet(false)) {
            AbstractC0890p0.a("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        AbstractC0890p0.e("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        R0 r8 = this.f2887e;
        if (r8 != null) {
            r8.c(this.f2888f);
        }
        l();
        this.f2891i.clear();
        this.f2892j.clear();
        this.f2889g = D6.r.n();
        this.f2885c = null;
        this.f2886d = null;
    }

    public static final void x(T t8, String str, AbstractC0902w abstractC0902w) {
        if (!t8.f2890h.get()) {
            AbstractC0890p0.a("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
            return;
        }
        if ((abstractC0902w != null ? abstractC0902w.c() : null) == null) {
            if ((abstractC0902w != null ? abstractC0902w.d() : null) != AbstractC0902w.b.CLOSED) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Camera ");
        sb.append(str);
        sb.append(" state changed to ");
        sb.append(abstractC0902w.d());
        sb.append(" with error: ");
        AbstractC0902w.a aVarC = abstractC0902w.c();
        sb.append(aVarC != null ? Integer.valueOf(aVarC.d()) : null);
        sb.append(QhsKALGiniuQ.cnYUmVl);
        AbstractC0890p0.l("CameraPresencePrvdr", sb.toString());
        R0 r8 = t8.f2887e;
        if (r8 != null) {
            r8.a();
        }
    }

    public final void t(List list) {
        List listR0 = D6.z.R0(this.f2889g);
        if (kotlin.jvm.internal.t.c(list, listR0)) {
            return;
        }
        Set setW0 = D6.z.W0(listR0);
        Set setW1 = D6.z.W0(list);
        Set setH = D6.U.h(setW1, setW0);
        Set setH2 = D6.U.h(setW0, setW1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C0938s.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0894s) it.next()).c());
        }
        try {
            Iterator it2 = setH2.iterator();
            while (it2.hasNext()) {
                u(((C0894s) it2.next()).c());
            }
            Y y8 = this.f2886d;
            if (y8 != null) {
                AbstractC0890p0.a("CameraPresencePrvdr", "Updating CameraRepository...");
                y8.d(arrayList2);
                arrayList.add(y8);
                AbstractC0890p0.a("CameraPresencePrvdr", "CameraRepository updated successfully.");
            }
            if (!this.f2891i.isEmpty()) {
                AbstractC0890p0.a("CameraPresencePrvdr", GIGvBf.CrrNgcAeLo + this.f2891i.size() + " dependent listeners...");
                for (C0 c8 : this.f2891i) {
                    c8.d(arrayList2);
                    kotlin.jvm.internal.t.d(c8);
                    arrayList.add(c8);
                }
            }
            this.f2889g = list;
            Iterator it3 = setH.iterator();
            while (it3.hasNext()) {
                n(((C0894s) it3.next()).c());
            }
            s(setH, setH2);
        } catch (Exception e8) {
            AbstractC0890p0.d("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e8);
            ArrayList arrayList3 = new ArrayList(C0938s.y(listR0, 10));
            Iterator it4 = listR0.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((C0894s) it4.next()).c());
            }
            for (C0 c9 : D6.x.U(arrayList)) {
                try {
                    c9.d(arrayList3);
                } catch (Exception e9) {
                    AbstractC0890p0.d("CameraPresencePrvdr", "Failed to rollback listener: " + c9, e9);
                }
            }
            Iterator it5 = setH2.iterator();
            while (it5.hasNext()) {
                n(((C0894s) it5.next()).c());
            }
            Iterator it6 = setH.iterator();
            while (it6.hasNext()) {
                u(((C0894s) it6.next()).c());
            }
        }
    }
}
