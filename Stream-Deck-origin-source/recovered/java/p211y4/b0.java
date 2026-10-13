package p211y4;

import S4.l;
import java.util.Iterator;
import java.util.Set;
import p010b0.C1748a;
import p195w4.b;
import p203x4.c;
import p203x4.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38347d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1748a f38345b = new C1748a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f38346c = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38348e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1748a f38344a = new C1748a();

    public b0(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f38344a.put(((g) it.next()).d(), null);
        }
        this.f38347d = this.f38344a.keySet().size();
    }

    public final Set a() {
        return this.f38344a.keySet();
    }

    public final void b(C3101b c3101b, b bVar, String str) {
        this.f38344a.put(c3101b, bVar);
        this.f38345b.put(c3101b, str);
        this.f38347d--;
        if (!bVar.e()) {
            this.f38348e = true;
        }
        if (this.f38347d == 0) {
            if (!this.f38348e) {
                this.f38346c.c(this.f38345b);
            } else {
                this.f38346c.b(new c(this.f38344a));
            }
        }
    }
}
