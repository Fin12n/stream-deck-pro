package Q3;

import D6.C0938s;
import com.elgato.vsd2.Messages;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f9195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f9196c;

    public b(String str, e pageInfo, d keys) {
        t.g(pageInfo, "pageInfo");
        t.g(keys, "keys");
        this.f9194a = str;
        this.f9195b = pageInfo;
        this.f9196c = keys;
    }

    public static /* synthetic */ b b(b bVar, String str, e eVar, d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = bVar.f9194a;
        }
        if ((i8 & 2) != 0) {
            eVar = bVar.f9195b;
        }
        if ((i8 & 4) != 0) {
            dVar = bVar.f9196c;
        }
        return bVar.a(str, eVar, dVar);
    }

    public static /* synthetic */ b k(b bVar, d.b bVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bVar2 = d.b.CLOCKWISE;
        }
        return bVar.j(bVar2);
    }

    public final b a(String str, e pageInfo, d keys) {
        t.g(pageInfo, "pageInfo");
        t.g(keys, "keys");
        return new b(str, pageInfo, keys);
    }

    public final d c() {
        return this.f9196c;
    }

    public final e d() {
        return this.f9195b;
    }

    public final boolean e() {
        return this.f9196c.i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.c(this.f9194a, bVar.f9194a) && t.c(this.f9195b, bVar.f9195b) && t.c(this.f9196c, bVar.f9196c);
    }

    public final b f(boolean z8) {
        return b(this, null, null, c.b(this.f9196c, z8, 0, 0, 6, null), 3, null);
    }

    public final d g(List actions) {
        t.g(actions, "actions");
        d dVar = this.f9196c;
        List<a> listE = dVar.e();
        ArrayList arrayList = new ArrayList(C0938s.y(listE, 10));
        for (a aVarA : listE) {
            if (actions.contains(Integer.valueOf(aVarA.f()))) {
                aVarA = aVarA.a();
            }
            arrayList.add(aVarA);
        }
        return d.b(dVar, 0, 0, arrayList, 3, null);
    }

    public final d h(List actions) {
        t.g(actions, "actions");
        return l(actions);
    }

    public int hashCode() {
        String str = this.f9194a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f9195b.hashCode()) * 31) + this.f9196c.hashCode();
    }

    public final b i(int i8, int i9) {
        if (this.f9196c.f() == i8 && this.f9196c.d() == i9) {
            return this;
        }
        d.a aVar = d.f9197d;
        int i10 = i8 * i9;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 / i9;
            int i13 = i11 % i9;
            arrayList.add(i11, this.f9196c.h(i12, i13) ? a.c((a) this.f9196c.c(i12, i13), i11, null, null, null, null, false, 62, null) : new a(i11, null, null, null, null, false, 62, null));
        }
        return b(this, null, null, new d(i8, i9, arrayList), 3, null);
    }

    public final b j(d.b rotation) {
        t.g(rotation, "rotation");
        return b(this, null, null, this.f9196c.j(rotation), 3, null);
    }

    public final d l(List actions) {
        Object next;
        a aVarJ;
        t.g(actions, "actions");
        d dVar = this.f9196c;
        List<a> listE = dVar.e();
        ArrayList arrayList = new ArrayList(C0938s.y(listE, 10));
        for (a aVar : listE) {
            Iterator it = actions.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Messages.Action) next).getIndex() != aVar.f());
            Messages.Action action = (Messages.Action) next;
            if (action != null && (aVarJ = aVar.j(action)) != null) {
                aVar = aVarJ;
            }
            arrayList.add(aVar);
        }
        return d.b(dVar, 0, 0, arrayList, 3, null);
    }

    public String toString() {
        return "Keypad(" + this.f9196c.d() + "x" + this.f9196c.f() + ")";
    }

    public /* synthetic */ b(String str, e eVar, d dVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : str, eVar, dVar);
    }

    public /* synthetic */ b(String str, e eVar, int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? new e(0, 0) : eVar, (i10 & 4) != 0 ? 0 : i8, (i10 & 8) != 0 ? 0 : i9);
    }

    public b(String str, e pageInfo, int i8, int i9) {
        t.g(pageInfo, "pageInfo");
        d.a aVar = d.f9197d;
        int i10 = i8 * i9;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(i11, new a(i11, null, null, null, null, false, 62, null));
        }
        this(str, pageInfo, new d(i8, i9, arrayList));
    }
}
