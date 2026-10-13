package p176u1;

import D6.z;
import P2.Lsk.mHPawN;
import Q6.k;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p128o1.AbstractC2740e;
import p128o1.C2739d;
import p128o1.G;
import p128o1.H;

/* JADX INFO: renamed from: u1.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3029m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M f34448a = new M(AbstractC2740e.g(), G.f30758b.a(), (G) null, (AbstractC2633k) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3030n f34449b = new C3030n(this.f34448a.e(), this.f34448a.g(), (AbstractC2633k) null);

    /* JADX INFO: renamed from: u1.m$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3027k f34450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3029m f34451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3027k interfaceC3027k, C3029m c3029m) {
            super(1);
            this.f34450a = interfaceC3027k;
            this.f34451b = c3029m;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC3027k interfaceC3027k) {
            return (this.f34450a == interfaceC3027k ? " > " : "   ") + this.f34451b.e(interfaceC3027k);
        }
    }

    public final M b(List list) {
        InterfaceC3027k interfaceC3027k = null;
        try {
            int size = list.size();
            int i8 = 0;
            InterfaceC3027k interfaceC3027k2 = null;
            while (i8 < size) {
                try {
                    InterfaceC3027k interfaceC3027k3 = (InterfaceC3027k) list.get(i8);
                    try {
                        interfaceC3027k3.a(this.f34449b);
                        i8++;
                        interfaceC3027k2 = interfaceC3027k3;
                    } catch (Exception e8) {
                        e = e8;
                        interfaceC3027k = interfaceC3027k3;
                        throw new RuntimeException(c(list, interfaceC3027k), e);
                    }
                } catch (Exception e9) {
                    e = e9;
                    interfaceC3027k = interfaceC3027k2;
                }
            }
            C2739d c2739dS = this.f34449b.s();
            long jI = this.f34449b.i();
            G gB = G.b(jI);
            gB.r();
            G g8 = G.m(this.f34448a.g()) ? null : gB;
            M m8 = new M(c2739dS, g8 != null ? g8.r() : H.b(G.k(jI), G.l(jI)), this.f34449b.d(), (AbstractC2633k) null);
            this.f34448a = m8;
            return m8;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final void d(M m8, V v8) {
        boolean zC = t.c(m8.f(), this.f34449b.d());
        boolean z8 = true;
        boolean z9 = false;
        if (!t.c(this.f34448a.e(), m8.e())) {
            this.f34449b = new C3030n(m8.e(), m8.g(), (AbstractC2633k) null);
        } else if (G.g(this.f34448a.g(), m8.g())) {
            z8 = false;
        } else {
            this.f34449b.p(G.l(m8.g()), G.k(m8.g()));
            z9 = true;
            z8 = false;
        }
        if (m8.f() == null) {
            this.f34449b.a();
        } else if (!G.h(m8.f().r())) {
            this.f34449b.n(G.l(m8.f().r()), G.k(m8.f().r()));
        }
        if (z8 || (!z9 && !zC)) {
            this.f34449b.a();
            m8 = M.d(m8, null, 0L, null, 3, null);
        }
        M m9 = this.f34448a;
        this.f34448a = m8;
        if (v8 != null) {
            v8.d(m9, m8);
        }
    }

    public final String e(InterfaceC3027k interfaceC3027k) {
        if (interfaceC3027k instanceof C3018b) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            C3018b c3018b = (C3018b) interfaceC3027k;
            sb.append(c3018b.c().length());
            sb.append(", newCursorPosition=");
            sb.append(c3018b.b());
            sb.append(')');
            return sb.toString();
        }
        if (interfaceC3027k instanceof K) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            K k8 = (K) interfaceC3027k;
            sb2.append(k8.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(k8.b());
            sb2.append(')');
            return sb2.toString();
        }
        if (interfaceC3027k instanceof J) {
            return interfaceC3027k.toString();
        }
        if (interfaceC3027k instanceof C3025i) {
            return interfaceC3027k.toString();
        }
        if (interfaceC3027k instanceof C3026j) {
            return interfaceC3027k.toString();
        }
        if (interfaceC3027k instanceof L) {
            return interfaceC3027k.toString();
        }
        if (interfaceC3027k instanceof C3032p) {
            return interfaceC3027k.toString();
        }
        if (interfaceC3027k instanceof C3017a) {
            return interfaceC3027k.toString();
        }
        if (interfaceC3027k instanceof B) {
            return interfaceC3027k.toString();
        }
        if (interfaceC3027k instanceof C3024h) {
            return interfaceC3027k.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unknown EditCommand: ");
        String strD = K.b(interfaceC3027k.getClass()).d();
        if (strD == null) {
            strD = "{anonymous EditCommand}";
        }
        sb3.append(strD);
        return sb3.toString();
    }

    public final M f() {
        return this.f34448a;
    }

    public final String c(List list, InterfaceC3027k interfaceC3027k) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.f34449b.h() + mHPawN.ZOMhVJv + this.f34449b.d() + ", selection=" + ((Object) G.q(this.f34449b.i())) + "):");
        t.f(sb, "append(value)");
        sb.append('\n');
        t.f(sb, "append('\\n')");
        z.o0(list, sb, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new a(interfaceC3027k, this));
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
