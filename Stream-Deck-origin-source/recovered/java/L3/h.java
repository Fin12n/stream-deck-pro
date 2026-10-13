package L3;

import C6.G;
import C6.m;
import Q6.o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p065h1.I0;
import p154r3.j;
import p191w0.AbstractC3064i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L3.e.a f5020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f5021b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L3.e.a aVar, int i8) {
            super(2);
            this.f5020a = aVar;
            this.f5021b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            h.a(this.f5020a, interfaceC3163l, F0.a(this.f5021b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L3.e.a f5022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L3.a f5023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f5024c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ L3.a f5025a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L3.e.a f5026b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Context f5027c;

            /* JADX INFO: renamed from: L3.h$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0180a extends u implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Context f5028a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ L3.a f5029b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0180a(Context context, L3.a aVar) {
                    super(0);
                    this.f5028a = context;
                    this.f5029b = aVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m71invoke();
                    return G.f1419a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m71invoke() {
                    Context context = this.f5028a;
                    String strF = this.f5029b.f();
                    if (strF == null) {
                        strF = "";
                    }
                    j.a(context, strF);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(L3.a aVar, L3.e.a aVar2, Context context) {
                super(2);
                this.f5025a = aVar;
                this.f5026b = aVar2;
                this.f5027c = context;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1963905582, i8, -1, "com.elgato.streamdeck.updateInfo.UpdateDialog.<anonymous>.<anonymous> (UpdateDialog.kt:47)");
                }
                J3.i.b(this.f5025a.d(), this.f5025a.c(), null, null, this.f5025a.e(), new C0180a(this.f5027c, this.f5025a), this.f5025a.a(), this.f5026b.c(), this.f5025a.b(), this.f5026b.d(), null, interfaceC3163l, 0, 0, 1036);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3163l) obj, ((Number) obj2).intValue());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L3.e.a aVar, L3.a aVar2, Context context) {
            super(2);
            this.f5022a = aVar;
            this.f5023b = aVar2;
            this.f5024c = context;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-842828520, i8, -1, "com.elgato.streamdeck.updateInfo.UpdateDialog.<anonymous> (UpdateDialog.kt:35)");
            }
            AbstractC3064i.a(this.f5022a.c(), I0.a(androidx.compose.foundation.layout.e.i(L0.i.f4836a, W3.c.f11463a.k()), "update_dialog"), new E1.g(!(this.f5022a.e() instanceof L3.b.d), !(this.f5022a.e() instanceof L3.b.d), null, false, false, 4, null), H0.c.b(interfaceC3163l, -1963905582, true, new a(this.f5023b, this.f5022a, this.f5024c)), interfaceC3163l, 3072, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L3.e.a f5030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f5031b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L3.e.a aVar, int i8) {
            super(2);
            this.f5030a = aVar;
            this.f5031b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            h.a(this.f5030a, interfaceC3163l, F0.a(this.f5031b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L3.e.a f5032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f5033b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L3.e.a aVar, int i8) {
            super(2);
            this.f5032a = aVar;
            this.f5033b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            h.a(this.f5032a, interfaceC3163l, F0.a(this.f5033b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5034a;

        static {
            int[] iArr = new int[com.elgato.streamdeck.a.b.values().length];
            try {
                iArr[com.elgato.streamdeck.a.b.AMAZON_APPSTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.elgato.streamdeck.a.b.GOOGLE_PLAY_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5034a = iArr;
        }
    }

    public static final void a(L3.e.a aVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        t.g(aVar, "<this>");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(452820899);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(aVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(452820899, i9, -1, "com.elgato.streamdeck.updateInfo.UpdateDialog (UpdateDialog.kt:29)");
            }
            if (!aVar.f()) {
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                P0 p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(aVar, i8));
                    return;
                }
                return;
            }
            L3.a aVarB = b(aVar, interfaceC3163lP, i9 & 14);
            if (aVarB == null) {
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                P0 p0V2 = interfaceC3163lP.v();
                if (p0V2 != null) {
                    p0V2.a(new d(aVar, i8));
                    return;
                }
                return;
            }
            p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -842828520, true, new b(aVar, aVarB, (Context) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.g()))), interfaceC3163lP, 196608, 31);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V3 = interfaceC3163lP.v();
        if (p0V3 != null) {
            p0V3.a(new c(aVar, i8));
        }
    }

    public static final L3.a b(L3.e.a aVar, InterfaceC3163l interfaceC3163l, int i8) {
        String strB;
        L3.a aVar2;
        interfaceC3163l.f(-266139088);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-266139088, i8, -1, "com.elgato.streamdeck.updateInfo.getAlertDetails (UpdateDialog.kt:62)");
        }
        L3.a aVar3 = null;
        if (aVar.e() == null) {
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return null;
        }
        int i9 = e.f5034a[aVar.g().ordinal()];
        if (i9 == 1) {
            interfaceC3163l.f(66022518);
            strB = p101l1.f.b(p194w3.b.f36945E1, interfaceC3163l, 0);
            interfaceC3163l.N();
        } else if (i9 != 2) {
            interfaceC3163l.f(66022697);
            strB = p101l1.f.b(p194w3.b.f36948F1, interfaceC3163l, 0);
            interfaceC3163l.N();
        } else {
            interfaceC3163l.f(66022620);
            strB = p101l1.f.b(p194w3.b.f36951G1, interfaceC3163l, 0);
            interfaceC3163l.N();
        }
        String str = strB;
        L3.b bVarE = aVar.e();
        if (bVarE instanceof L3.b.a) {
            interfaceC3163l.f(2046708227);
            interfaceC3163l.N();
        } else {
            if (bVarE instanceof L3.b.C0176b) {
                interfaceC3163l.f(66022906);
                aVar2 = new L3.a(p101l1.f.b(p194w3.b.f36972N1, interfaceC3163l, 0), p101l1.f.c(p194w3.b.f36969M1, new Object[]{Integer.valueOf(((L3.b.C0176b) aVar.e()).a())}, interfaceC3163l, 64), p101l1.f.b(p194w3.b.f36942D1, interfaceC3163l, 0), p101l1.f.b(p194w3.b.f36954H1, interfaceC3163l, 0), null, null);
                interfaceC3163l.N();
            } else if (bVarE instanceof L3.b.c) {
                interfaceC3163l.f(66023469);
                aVar2 = new L3.a(p101l1.f.b(p194w3.b.f36960J1, interfaceC3163l, 0), p101l1.f.b(p194w3.b.f36957I1, interfaceC3163l, 0), null, p101l1.f.b(p194w3.b.f36954H1, interfaceC3163l, 0), str, com.elgato.streamdeck.a.C0419a.f17668a.c(aVar.g()));
                interfaceC3163l.N();
            } else {
                if (!(bVarE instanceof L3.b.d)) {
                    interfaceC3163l.f(66019834);
                    interfaceC3163l.N();
                    throw new m();
                }
                interfaceC3163l.f(66023966);
                aVar2 = new L3.a(p101l1.f.b(p194w3.b.f36966L1, interfaceC3163l, 0), p101l1.f.c(p194w3.b.f36963K1, new Object[]{((L3.b.d) aVar.e()).a()}, interfaceC3163l, 64), null, null, str, com.elgato.streamdeck.a.C0419a.f17668a.c(aVar.g()));
                interfaceC3163l.N();
            }
            aVar3 = aVar2;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return aVar3;
    }
}
