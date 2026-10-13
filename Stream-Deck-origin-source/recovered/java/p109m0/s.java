package p109m0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import p038e1.k0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class s implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f29450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f29451b = new LinkedHashMap();

    public s(o oVar) {
        this.f29450a = oVar;
    }

    @Override // p038e1.k0
    public void a(k0.a aVar) {
        this.f29451b.clear();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            Object objC = this.f29450a.c(it.next());
            Integer num = (Integer) this.f29451b.get(objC);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                this.f29451b.put(objC, Integer.valueOf(iIntValue + 1));
            }
        }
    }

    @Override // p038e1.k0
    public boolean b(Object obj, Object obj2) {
        return t.c(this.f29450a.c(obj), this.f29450a.c(obj2));
    }
}
