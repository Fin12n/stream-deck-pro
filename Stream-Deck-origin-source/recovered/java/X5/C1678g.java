package X5;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X5.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1678g implements InterfaceC1684m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1678g f11844c = new C1678g();

    @Override // p115m6.B
    public Set a() {
        return D6.T.d();
    }

    @Override // p115m6.B
    public boolean b() {
        return true;
    }

    @Override // p115m6.B
    public List c(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        return null;
    }

    @Override // p115m6.B
    public boolean contains(String str) {
        return InterfaceC1684m.b.a(this, str);
    }

    @Override // p115m6.B
    public String d(String str) {
        return InterfaceC1684m.b.c(this, str);
    }

    @Override // p115m6.B
    public void e(Q6.o oVar) {
        InterfaceC1684m.b.b(this, oVar);
    }

    @Override // p115m6.B
    public Set names() {
        return D6.T.d();
    }

    public String toString() {
        return "Headers " + a();
    }
}
