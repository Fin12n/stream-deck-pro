package p024c5;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p087j5.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class w implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f16276b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f16275a = Collections.newSetFromMap(new ConcurrentHashMap());

    public w(Collection collection) {
        this.f16275a.addAll(collection);
    }

    public static w b(Collection collection) {
        return new w((Set) collection);
    }

    public synchronized void a(b bVar) {
        try {
            if (this.f16276b == null) {
                this.f16275a.add(bVar);
            } else {
                this.f16276b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p087j5.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f16276b == null) {
            synchronized (this) {
                try {
                    if (this.f16276b == null) {
                        this.f16276b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableSet(this.f16276b);
    }

    public final synchronized void d() {
        try {
            Iterator it = this.f16275a.iterator();
            while (it.hasNext()) {
                this.f16276b.add(((b) it.next()).get());
            }
            this.f16275a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
