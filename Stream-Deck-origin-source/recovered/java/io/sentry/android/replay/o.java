package io.sentry.android.replay;

import C6.G;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.sentry.InterfaceC2480b0;
import io.sentry.util.C2569a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26837e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26838f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f26839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2569a f26840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f26841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f26842d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: io.sentry.android.replay.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0599a extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f26843a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0599a(o oVar) {
                super(1);
                this.f26843a = oVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ArrayList invoke(ArrayList mViews) throws Exception {
                kotlin.jvm.internal.t.g(mViews, "mViews");
                InterfaceC2480b0 interfaceC2480b0A = this.f26843a.f26840b.a();
                try {
                    ArrayList arrayList = this.f26843a.f26842d;
                    arrayList.addAll(mViews);
                    O6.a.a(interfaceC2480b0A, null);
                    return arrayList;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        O6.a.a(interfaceC2480b0A, th);
                        throw th2;
                    }
                }
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static final void c(o this_apply) {
            kotlin.jvm.internal.t.g(this_apply, "$this_apply");
            if (this_apply.f26839a.get()) {
                return;
            }
            w.f26945a.e(new C0599a(this_apply));
        }

        public final o b() {
            final o oVar = new o(null);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: io.sentry.android.replay.n
                @Override // java.lang.Runnable
                public final void run() {
                    o.a.c(oVar);
                }
            });
            return oVar;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends ArrayList {
        public b() {
        }

        public /* bridge */ boolean D(View view) {
            return super.contains(view);
        }

        public /* bridge */ int E() {
            return super.size();
        }

        public /* bridge */ int F(View view) {
            return super.indexOf(view);
        }

        public /* bridge */ int G(View view) {
            return super.lastIndexOf(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final /* bridge */ View remove(int i8) {
            return J(i8);
        }

        public /* bridge */ boolean I(View view) {
            return super.remove(view);
        }

        public View J(int i8) {
            Object objRemove = super.remove(i8);
            kotlin.jvm.internal.t.f(objRemove, "super.removeAt(index)");
            View view = (View) objRemove;
            Iterator it = o.this.o().iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(view, false);
            }
            return view;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            kotlin.jvm.internal.t.g(elements, "elements");
            for (d dVar : o.this.o()) {
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    dVar.b((View) it.next(), true);
                }
            }
            return super.addAll(elements);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return D((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return F((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return G((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return E();
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public boolean add(View element) {
            kotlin.jvm.internal.t.g(element, "element");
            Iterator it = o.this.o().iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(element, true);
            }
            return super.add(element);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return I((View) obj);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends CopyOnWriteArrayList {
        public c() {
        }

        public /* bridge */ boolean D(d dVar) {
            return super.contains(dVar);
        }

        public /* bridge */ int E() {
            return super.size();
        }

        public /* bridge */ int F(d dVar) {
            return super.indexOf(dVar);
        }

        public /* bridge */ int G(d dVar) {
            return super.lastIndexOf(dVar);
        }

        public /* bridge */ boolean H(d dVar) {
            return super.remove(dVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof d) {
                return D((d) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof d) {
                return F((d) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof d) {
                return G((d) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof d) {
                return H((d) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return E();
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public boolean add(d dVar) throws Exception {
            InterfaceC2480b0 interfaceC2480b0A = o.this.f26840b.a();
            try {
                for (View view : o.this.f26842d) {
                    if (dVar != null) {
                        dVar.b(view, true);
                    }
                }
                G g8 = G.f1419a;
                O6.a.a(interfaceC2480b0A, null);
                return super.add(dVar);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    O6.a.a(interfaceC2480b0A, th);
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ o(AbstractC2633k abstractC2633k) {
        this();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26839a.set(true);
        this.f26841c.clear();
    }

    public final CopyOnWriteArrayList o() {
        return this.f26841c;
    }

    public o() {
        this.f26839a = new AtomicBoolean(false);
        this.f26840b = new C2569a();
        this.f26841c = new c();
        this.f26842d = new b();
    }
}
