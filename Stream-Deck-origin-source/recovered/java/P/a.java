package P;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f8821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f8823d;

    public a(int i8) {
        this(i8, null);
    }

    public Object a() {
        Object objRemoveLast;
        synchronized (this.f8822c) {
            objRemoveLast = this.f8821b.removeLast();
        }
        return objRemoveLast;
    }

    public void b(Object obj) {
        Object objA;
        synchronized (this.f8822c) {
            try {
                objA = this.f8821b.size() >= this.f8820a ? a() : null;
                this.f8821b.addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = this.f8823d;
        if (cVar == null || objA == null) {
            return;
        }
        cVar.a(objA);
    }

    public boolean c() {
        boolean zIsEmpty;
        synchronized (this.f8822c) {
            zIsEmpty = this.f8821b.isEmpty();
        }
        return zIsEmpty;
    }

    public a(int i8, c cVar) {
        this.f8822c = new Object();
        this.f8820a = i8;
        this.f8821b = new ArrayDeque(i8);
        this.f8823d = cVar;
    }
}
