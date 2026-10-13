package p135p0;

import A1.t;
import Q0.b;
import Q0.h;
import Q0.k;
import Q0.m;
import R0.D0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    public f(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    @Override // p135p0.a
    public D0 d(long j8, float f8, float f9, float f10, float f11, t tVar) {
        if (f8 + f9 + f10 + f11 == 0.0f) {
            return new D0.b(m.c(j8));
        }
        h hVarC = m.c(j8);
        t tVar2 = t.Ltr;
        return new D0.c(k.b(hVarC, b.b(tVar == tVar2 ? f8 : f9, 0.0f, 2, null), b.b(tVar == tVar2 ? f9 : f8, 0.0f, 2, null), b.b(tVar == tVar2 ? f10 : f11, 0.0f, 2, null), b.b(tVar == tVar2 ? f11 : f10, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.t.c(h(), fVar.h()) && kotlin.jvm.internal.t.c(g(), fVar.g()) && kotlin.jvm.internal.t.c(e(), fVar.e()) && kotlin.jvm.internal.t.c(f(), fVar.f());
    }

    public int hashCode() {
        return (((((h().hashCode() * 31) + g().hashCode()) * 31) + e().hashCode()) * 31) + f().hashCode();
    }

    @Override // p135p0.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f b(b bVar, b bVar2, b bVar3, b bVar4) {
        return new f(bVar, bVar2, bVar3, bVar4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + h() + ", topEnd = " + g() + ", bottomEnd = " + e() + ", bottomStart = " + f() + ')';
    }
}
