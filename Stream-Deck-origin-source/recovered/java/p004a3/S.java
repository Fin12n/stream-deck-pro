package p004a3;

import T1.e;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p010b0.C1749b;
import p063h.s;
import p121n3.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13182a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f13183b = new C1749b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f13184c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparator f13185d = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            float fFloatValue = ((Float) eVar.f9824b).floatValue();
            float fFloatValue2 = ((Float) eVar2.f9824b).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public void a(String str, float f8) {
        if (this.f13182a) {
            h hVar = (h) this.f13184c.get(str);
            if (hVar == null) {
                hVar = new h();
                this.f13184c.put(str, hVar);
            }
            hVar.a(f8);
            if (str.equals("__container")) {
                Iterator it = this.f13183b.iterator();
                if (it.hasNext()) {
                    s.a(it.next());
                    throw null;
                }
            }
        }
    }

    public void b(boolean z8) {
        this.f13182a = z8;
    }
}
