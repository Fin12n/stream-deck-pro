package J3;

import C6.G;
import D6.z;
import R0.C1598l0;
import R0.R0;
import Z6.w;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p128o1.B;
import p128o1.C2739d;
import p128o1.I;
import p128o1.L;
import p143q0.AbstractC2806f;
import p168t1.AbstractC3009n;
import p168t1.C;
import p168t1.y;
import p191w0.P0;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2739d f4293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4294b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2739d c2739d, Q6.k kVar) {
            super(1);
            this.f4293a = c2739d;
            this.f4294b = kVar;
        }

        public final void b(int i8) {
            C2739d.b bVar = (C2739d.b) z.k0(this.f4293a.k(i8, i8));
            if (bVar != null) {
                this.f4294b.invoke(((L) bVar.e()).a());
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f4296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ I f4297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ B f4298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f4300f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f4301g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8, Map map, I i9, B b8, Q6.k kVar, int i10, int i11) {
            super(2);
            this.f4295a = i8;
            this.f4296b = map;
            this.f4297c = i9;
            this.f4298d = b8;
            this.f4299e = kVar;
            this.f4300f = i10;
            this.f4301g = i11;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            q.a(this.f4295a, this.f4296b, this.f4297c, this.f4298d, this.f4299e, interfaceC3163l, F0.a(this.f4300f | 1), this.f4301g);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(int i8, Map links, I i9, B b8, Q6.k onClick, InterfaceC3163l interfaceC3163l, int i10, int i11) {
        I iC;
        int i12;
        B b9;
        t.g(links, "links");
        t.g(onClick, "onClick");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(233407953);
        if ((i11 & 4) != 0) {
            i12 = i10 & (-897);
            iC = I.c((I) interfaceC3163lP.e(P0.c()), ((C1598l0) interfaceC3163lP.e(p191w0.B.a())).y(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        } else {
            iC = i9;
            i12 = i10;
        }
        if ((i11 & 8) != 0) {
            i12 &= -7169;
            b9 = new B(Z.f35786a.a(interfaceC3163lP, Z.f35787b).B(), 0L, (C) null, (y) null, (p168t1.z) null, (AbstractC3009n) null, (String) null, 0L, (p216z1.a) null, (p216z1.o) null, (p184v1.e) null, 0L, p216z1.k.f39019b.d(), (R0) null, (p128o1.y) null, (T0.g) null, 61438, (AbstractC2633k) null);
        } else {
            b9 = b8;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(233407953, i12, -1, "com.elgato.streamdeck.ui.components.TextWithLinks (TextWithLinks.kt:38)");
        }
        String[] strArr = (String[]) links.keySet().toArray(new String[0]);
        String strC = p101l1.f.c(i8, Arrays.copyOf(strArr, strArr.length), interfaceC3163lP, (i12 & 14) | 64);
        C2739d.a aVar = new C2739d.a(0, 1, null);
        aVar.g(strC);
        for (Map.Entry entry : links.entrySet()) {
            String str = (String) entry.getKey();
            URL url = (URL) entry.getValue();
            String str2 = strC;
            int iY = w.Y(str2, str, 0, false, 6, null);
            int length = str.length() + iY;
            aVar.b(b9, iY, length);
            String string = url.toString();
            t.f(string, "toString(...)");
            aVar.c(new L(string), iY, length);
            strC = str2;
        }
        C2739d c2739dJ = aVar.j();
        interfaceC3163lP.f(-431733250);
        boolean zR = interfaceC3163lP.R(c2739dJ) | ((((57344 & i10) ^ 24576) > 16384 && interfaceC3163lP.R(onClick)) || (i10 & 24576) == 16384);
        Object objG = interfaceC3163lP.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = new a(c2739dJ, onClick);
            interfaceC3163lP.H(objG);
        }
        interfaceC3163lP.N();
        AbstractC2806f.a(c2739dJ, null, iC, false, 0, 0, null, (Q6.k) objG, interfaceC3163lP, i12 & 896, 122);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        p215z0.P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(i8, links, iC, b9, onClick, i10, i11));
        }
    }
}
