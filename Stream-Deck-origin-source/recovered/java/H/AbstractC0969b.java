package H;

import A.C0894s;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: H.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0969b implements R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f2935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f2936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2937e;

    /* JADX INFO: renamed from: H.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f2938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final R0.a f2939b;

        public a(Executor executor, R0.a aVar) {
            this.f2938a = executor;
            this.f2939b = aVar;
        }
    }

    public AbstractC0969b() {
        this(Collections.EMPTY_LIST);
    }

    public static /* synthetic */ void d(Throwable th, a aVar, List list) {
        if (th != null) {
            aVar.f2939b.onError(th);
        } else {
            aVar.f2939b.a(list);
        }
    }

    @Override // H.R0
    public void b(Executor executor, R0.a aVar) {
        List listUnmodifiableList;
        Throwable th;
        T1.f.g(executor);
        T1.f.g(aVar);
        this.f2934b.add(new a(executor, aVar));
        synchronized (this.f2933a) {
            try {
                if (!this.f2937e && !this.f2934b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.f2937e = true;
                    f();
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f2935c);
                th = this.f2936d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(new a(executor, aVar), listUnmodifiableList, th);
    }

    @Override // H.R0
    public void c(R0.a aVar) {
        a aVar2;
        T1.f.g(aVar);
        Iterator it = this.f2934b.iterator();
        do {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            }
            aVar2 = (a) it.next();
        } while (!aVar2.f2939b.equals(aVar));
        if (aVar2 != null) {
            this.f2934b.remove(aVar2);
        }
        synchronized (this.f2933a) {
            try {
                if (this.f2937e && this.f2934b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.f2937e = false;
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(final a aVar, final List list, final Throwable th) {
        aVar.f2938a.execute(new Runnable() { // from class: H.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0969b.d(th, aVar, list);
            }
        });
    }

    public abstract void f();

    public abstract void g();

    public void h(List list) {
        j(list, null);
    }

    public void i(Throwable th) {
        j(null, th);
    }

    public final void j(List list, Throwable th) {
        boolean z8;
        List listUnmodifiableList;
        Throwable th2;
        synchronized (this.f2933a) {
            try {
                if (th != null) {
                    z8 = this.f2936d == null || !this.f2935c.isEmpty();
                    this.f2936d = th;
                    this.f2935c = Collections.EMPTY_LIST;
                } else {
                    T1.f.g(list);
                    boolean z9 = (this.f2936d == null && this.f2935c.equals(list)) ? false : true;
                    this.f2936d = null;
                    this.f2935c = list;
                    z8 = z9;
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f2935c);
                th2 = this.f2936d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z8) {
            StringBuilder sb = new StringBuilder();
            sb.append("Data changed. Notifying ");
            sb.append(this.f2934b.size());
            sb.append(" observers. Error: ");
            sb.append(th2 != null);
            Log.d("CameraPresenceSrc", sb.toString());
            Iterator it = this.f2934b.iterator();
            while (it.hasNext()) {
                e((a) it.next(), listUnmodifiableList, th2);
            }
        }
    }

    public AbstractC0969b(List<String> list) {
        this.f2933a = new Object();
        this.f2934b = new CopyOnWriteArrayList();
        this.f2936d = null;
        this.f2937e = false;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0894s.a(it.next()));
        }
        this.f2935c = arrayList;
    }
}
