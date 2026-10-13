package p028d0;

import D6.M;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f19605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f19606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f19607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f19608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f19610f;

    public F() {
        this(null, null, null, null, false, null, 63, null);
    }

    public final i a() {
        return this.f19607c;
    }

    public final Map b() {
        return this.f19610f;
    }

    public final q c() {
        return this.f19605a;
    }

    public final boolean d() {
        return this.f19609e;
    }

    public final x e() {
        return this.f19608d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f8 = (F) obj;
        return t.c(this.f19605a, f8.f19605a) && t.c(this.f19606b, f8.f19606b) && t.c(this.f19607c, f8.f19607c) && t.c(this.f19608d, f8.f19608d) && this.f19609e == f8.f19609e && t.c(this.f19610f, f8.f19610f);
    }

    public final B f() {
        return this.f19606b;
    }

    public int hashCode() {
        q qVar = this.f19605a;
        int iHashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        B b8 = this.f19606b;
        int iHashCode2 = (iHashCode + (b8 == null ? 0 : b8.hashCode())) * 31;
        i iVar = this.f19607c;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        x xVar = this.f19608d;
        return ((((iHashCode3 + (xVar != null ? xVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f19609e)) * 31) + this.f19610f.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.f19605a + ", slide=" + this.f19606b + ", changeSize=" + this.f19607c + ", scale=" + this.f19608d + ", hold=" + this.f19609e + ", effectsMap=" + this.f19610f + ')';
    }

    public F(q qVar, B b8, i iVar, x xVar, boolean z8, Map<Object, ? extends U> map) {
        this.f19605a = qVar;
        this.f19606b = b8;
        this.f19607c = iVar;
        this.f19608d = xVar;
        this.f19609e = z8;
        this.f19610f = map;
    }

    public /* synthetic */ F(q qVar, B b8, i iVar, x xVar, boolean z8, Map map, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : qVar, (i8 & 2) != 0 ? null : b8, (i8 & 4) != 0 ? null : iVar, (i8 & 8) != 0 ? null : xVar, (i8 & 16) != 0 ? false : z8, (i8 & 32) != 0 ? M.g() : map);
    }
}
