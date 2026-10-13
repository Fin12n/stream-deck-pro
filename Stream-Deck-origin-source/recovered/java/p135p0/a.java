package p135p0;

import A1.d;
import A1.t;
import Q0.l;
import R0.D0;
import R0.T0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f31030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f31031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f31032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f31033d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f31030a = bVar;
        this.f31031b = bVar2;
        this.f31032c = bVar3;
        this.f31033d = bVar4;
    }

    public static /* synthetic */ a c(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i8 & 1) != 0) {
            bVar = aVar.f31030a;
        }
        if ((i8 & 2) != 0) {
            bVar2 = aVar.f31031b;
        }
        if ((i8 & 4) != 0) {
            bVar3 = aVar.f31032c;
        }
        if ((i8 & 8) != 0) {
            bVar4 = aVar.f31033d;
        }
        return aVar.b(bVar, bVar2, bVar3, bVar4);
    }

    @Override // R0.T0
    public final D0 a(long j8, t tVar, d dVar) {
        float fA = this.f31030a.a(j8, dVar);
        float fA2 = this.f31031b.a(j8, dVar);
        float fA3 = this.f31032c.a(j8, dVar);
        float fA4 = this.f31033d.a(j8, dVar);
        float fH = l.h(j8);
        float f8 = fA + fA4;
        if (f8 > fH) {
            float f9 = fH / f8;
            fA *= f9;
            fA4 *= f9;
        }
        float f10 = fA2 + fA3;
        if (f10 > fH) {
            float f11 = fH / f10;
            fA2 *= f11;
            fA3 *= f11;
        }
        if (fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && fA4 >= 0.0f) {
            return d(j8, fA, fA2, fA3, fA4, tVar);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!").toString());
    }

    public abstract a b(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract D0 d(long j8, float f8, float f9, float f10, float f11, t tVar);

    public final b e() {
        return this.f31032c;
    }

    public final b f() {
        return this.f31033d;
    }

    public final b g() {
        return this.f31031b;
    }

    public final b h() {
        return this.f31030a;
    }
}
