package p176u1;

import kotlin.jvm.internal.K;
import p128o1.AbstractC2743h;

/* JADX INFO: renamed from: u1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3017a implements InterfaceC3027k {
    @Override // p176u1.InterfaceC3027k
    public void a(C3030n c3030n) {
        if (c3030n.l()) {
            c3030n.b(c3030n.f(), c3030n.e());
            return;
        }
        if (c3030n.g() != -1) {
            if (c3030n.g() == 0) {
                return;
            }
            c3030n.b(AbstractC2743h.b(c3030n.toString(), c3030n.g()), c3030n.g());
        } else {
            int iK = c3030n.k();
            int iJ = c3030n.j();
            c3030n.o(c3030n.k());
            c3030n.b(iK, iJ);
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof C3017a;
    }

    public int hashCode() {
        return K.b(C3017a.class).hashCode();
    }

    public String toString() {
        return "BackspaceCommand()";
    }
}
