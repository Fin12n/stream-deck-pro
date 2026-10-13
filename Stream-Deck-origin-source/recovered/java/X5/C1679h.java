package X5;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X5.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1679h implements C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1679h f11845c = new C1679h();

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
    public String d(String str) {
        return C.b.b(this, str);
    }

    @Override // p115m6.B
    public void e(Q6.o oVar) {
        C.b.a(this, oVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C) && ((C) obj).isEmpty();
    }

    @Override // p115m6.B
    public boolean isEmpty() {
        return true;
    }

    @Override // p115m6.B
    public Set names() {
        return D6.T.d();
    }

    public String toString() {
        return "Parameters " + a();
    }
}
