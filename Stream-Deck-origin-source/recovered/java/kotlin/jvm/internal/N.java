package kotlin.jvm.internal;

import I0.mIk.efuWFSeiT;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28783a;

    public N(int i8) {
        this.f28783a = new ArrayList(i8);
    }

    public void a(Object obj) {
        this.f28783a.add(obj);
    }

    public int c() {
        return this.f28783a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f28783a.toArray(objArr);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f28783a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f28783a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f28783a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f28783a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f28783a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException(efuWFSeiT.UjxfhPx + obj.getClass());
        }
    }
}
