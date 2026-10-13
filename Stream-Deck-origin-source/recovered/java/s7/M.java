package s7;

import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class M extends AbstractC2896c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r7.w f33192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f33193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o7.f f33194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f33195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33196j;

    public /* synthetic */ M(r7.c cVar, r7.w wVar, String str, o7.f fVar, int i8, AbstractC2633k abstractC2633k) {
        this(cVar, wVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : fVar);
    }

    @Override // p7.c
    public int E(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        while (this.f33195i < descriptor.f()) {
            int i8 = this.f33195i;
            this.f33195i = i8 + 1;
            String strX = X(descriptor, i8);
            int i9 = this.f33195i - 1;
            this.f33196j = false;
            if (v0().containsKey(strX) || x0(descriptor, i9)) {
                if (!this.f33258e.f() || !y0(descriptor, i9, strX)) {
                    return i9;
                }
            }
        }
        return -1;
    }

    @Override // s7.AbstractC2896c, q7.O0, p7.e
    public p7.c b(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        if (descriptor != this.f33194h) {
            return super.b(descriptor);
        }
        r7.c cVarD = d();
        r7.j jVarH0 = h0();
        o7.f fVar = this.f33194h;
        if (jVarH0 instanceof r7.w) {
            return new M(cVarD, (r7.w) jVarH0, this.f33193g, fVar);
        }
        throw C.e(-1, "Expected " + kotlin.jvm.internal.K.b(r7.w.class) + " as the serialized body of " + fVar.a() + ", but had " + kotlin.jvm.internal.K.b(jVarH0.getClass()));
    }

    @Override // s7.AbstractC2896c, q7.O0, p7.c
    public void c(o7.f descriptor) {
        Set setI;
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        if (this.f33258e.j() || (descriptor.e() instanceof o7.d)) {
            return;
        }
        G.l(descriptor, d());
        if (this.f33258e.n()) {
            Set setA = q7.V.a(descriptor);
            Map map = (Map) r7.A.a(d()).a(descriptor, G.f());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = D6.T.d();
            }
            setI = D6.U.i(setA, setKeySet);
        } else {
            setI = q7.V.a(descriptor);
        }
        for (String str : v0().keySet()) {
            if (!setI.contains(str) && !kotlin.jvm.internal.t.c(str, this.f33193g)) {
                throw C.g(str, v0().toString());
            }
        }
    }

    @Override // q7.AbstractC2849l0
    public String c0(o7.f descriptor, int i8) {
        Object next;
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        G.l(descriptor, d());
        String strG = descriptor.g(i8);
        if (!this.f33258e.n() || v0().keySet().contains(strG)) {
            return strG;
        }
        Map mapE = G.e(d(), descriptor);
        Iterator<T> it = v0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) mapE.get((String) next);
            if (num != null && num.intValue() == i8) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strG;
    }

    @Override // s7.AbstractC2896c
    public r7.j g0(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        return (r7.j) D6.M.h(v0(), tag);
    }

    @Override // s7.AbstractC2896c, q7.O0, p7.e
    public boolean v() {
        return !this.f33196j && super.v();
    }

    public final boolean x0(o7.f fVar, int i8) {
        boolean z8 = (d().e().i() || fVar.j(i8) || !fVar.i(i8).c()) ? false : true;
        this.f33196j = z8;
        return z8;
    }

    public final boolean y0(o7.f fVar, int i8, String str) {
        r7.c cVarD = d();
        if (!fVar.j(i8)) {
            return false;
        }
        o7.f fVarI = fVar.i(i8);
        if (!fVarI.c() && (g0(str) instanceof r7.u)) {
            return true;
        }
        if (!kotlin.jvm.internal.t.c(fVarI.e(), o7.j.b.f31003a) || (fVarI.c() && (g0(str) instanceof r7.u))) {
            return false;
        }
        r7.j jVarG0 = g0(str);
        r7.y yVar = jVarG0 instanceof r7.y ? (r7.y) jVarG0 : null;
        String strG = yVar != null ? r7.k.g(yVar) : null;
        return strG != null && G.h(fVarI, cVarD, strG) == -3;
    }

    @Override // s7.AbstractC2896c
    /* JADX INFO: renamed from: z0 */
    public r7.w v0() {
        return this.f33192f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(r7.c cVar, r7.w value, String str, o7.f fVar) {
        super(cVar, value, null);
        kotlin.jvm.internal.t.g(cVar, WaYxBuDSBD.ZHZGPJkn);
        kotlin.jvm.internal.t.g(value, "value");
        this.f33192f = value;
        this.f33193g = str;
        this.f33194h = fVar;
    }
}
