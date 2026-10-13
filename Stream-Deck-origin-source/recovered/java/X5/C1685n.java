package X5;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: X5.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1685n extends p115m6.D {
    public C1685n() {
        this(0, 1, null);
    }

    @Override // p115m6.D
    public void m(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        super.m(name);
        C1688q.f11910a.a(name);
    }

    @Override // p115m6.D
    public void n(String value) {
        kotlin.jvm.internal.t.g(value, "value");
        super.n(value);
        C1688q.f11910a.b(value);
    }

    public InterfaceC1684m o() {
        return new C1686o(j());
    }

    public C1685n(int i8) {
        super(true, i8);
    }

    public /* synthetic */ C1685n(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 8 : i8);
    }
}
