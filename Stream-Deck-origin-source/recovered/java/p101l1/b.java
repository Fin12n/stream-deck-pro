package p101l1;

import V0.d;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f29125a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f29126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29127b;

        public a(d dVar, int i8) {
            this.f29126a = dVar;
            this.f29127b = i8;
        }

        public final int a() {
            return this.f29127b;
        }

        public final d b() {
            return this.f29126a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.c(this.f29126a, aVar.f29126a) && this.f29127b == aVar.f29127b;
        }

        public int hashCode() {
            return (this.f29126a.hashCode() * 31) + Integer.hashCode(this.f29127b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f29126a + ", configFlags=" + this.f29127b + ')';
        }
    }

    /* JADX INFO: renamed from: l1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0634b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources.Theme f29128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29129b;

        public C0634b(Resources.Theme theme, int i8) {
            this.f29128a = theme;
            this.f29129b = i8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0634b)) {
                return false;
            }
            C0634b c0634b = (C0634b) obj;
            return t.c(this.f29128a, c0634b.f29128a) && this.f29129b == c0634b.f29129b;
        }

        public int hashCode() {
            return (this.f29128a.hashCode() * 31) + Integer.hashCode(this.f29129b);
        }

        public String toString() {
            return "Key(theme=" + this.f29128a + ", id=" + this.f29129b + ')';
        }
    }

    public final void a() {
        this.f29125a.clear();
    }

    public final a b(C0634b c0634b) {
        WeakReference weakReference = (WeakReference) this.f29125a.get(c0634b);
        if (weakReference != null) {
            return (a) weakReference.get();
        }
        return null;
    }

    public final void c(int i8) {
        Iterator it = this.f29125a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(i8, aVar.a())) {
                it.remove();
            }
        }
    }

    public final void d(C0634b c0634b, a aVar) {
        this.f29125a.put(c0634b, new WeakReference(aVar));
    }
}
