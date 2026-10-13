package B3;

import C6.G;
import Q6.o;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p065h1.I0;
import p191w0.AbstractC3068k;
import p191w0.N;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1132a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m37invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m37invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f1133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f1134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f1135c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z8, Function0 function0, Function0 function1) {
            super(2);
            this.f1133a = z8;
            this.f1134b = function0;
            this.f1135c = function1;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1245843861, i8, -1, "com.elgato.streamdeck.settings.SettingsTopBar.<anonymous> (SettingsTopBar.kt:28)");
            }
            if (this.f1133a) {
                interfaceC3163l.f(-415849105);
                N.a(this.f1134b, I0.a(L0.i.f4836a, "settings_back_button"), false, null, null, d.f1002a.b(), interfaceC3163l, 196656, 28);
                interfaceC3163l.N();
            } else {
                interfaceC3163l.f(-415848685);
                N.a(this.f1135c, I0.a(L0.i.f4836a, "settings_back_button"), false, null, null, d.f1002a.c(), interfaceC3163l, 196656, 28);
                interfaceC3163l.N();
            }
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
        public final /* synthetic */ Function0 f1136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f1137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f1138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f1139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0 f1140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f1141f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f1142g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, o oVar, p pVar, boolean z8, Function0 function1, int i8, int i9) {
            super(2);
            this.f1136a = function0;
            this.f1137b = oVar;
            this.f1138c = pVar;
            this.f1139d = z8;
            this.f1140e = function1;
            this.f1141f = i8;
            this.f1142g = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            h.a(this.f1136a, this.f1137b, this.f1138c, this.f1139d, this.f1140e, interfaceC3163l, F0.a(this.f1141f | 1), this.f1142g);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void a(Function0 goBack, o title, p pVar, boolean z8, Function0 function0, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        p pVar2;
        int i11;
        boolean z9;
        int i12;
        int i13;
        Function0 function1;
        int i14;
        p pVarA;
        boolean z10;
        Function0 function2;
        p pVar3;
        boolean z11;
        Function0 function3;
        P0 p0V;
        t.g(goBack, "goBack");
        t.g(title, "title");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(113334126);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.l(goBack) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.l(title) ? 32 : 16;
        }
        int i15 = i9 & 4;
        if (i15 == 0) {
            if ((i8 & 896) == 0) {
                pVar2 = pVar;
                i10 |= interfaceC3163lP.l(pVar2) ? 256 : 128;
            }
            i11 = i9 & 8;
            if (i11 != 0) {
                if ((i8 & 7168) == 0) {
                    z9 = z8;
                    if (interfaceC3163lP.c(z9)) {
                        i12 = 2048;
                    } else {
                        i12 = 1024;
                    }
                    i10 |= i12;
                }
                i13 = i9 & 16;
                if (i13 != 0) {
                    if ((57344 & i8) == 0) {
                        function1 = function0;
                        if (interfaceC3163lP.l(function1)) {
                            i14 = 16384;
                        } else {
                            i14 = 8192;
                        }
                        i10 |= i14;
                    }
                    if ((46811 & i10) == 9362 || !interfaceC3163lP.s()) {
                        if (i15 != 0) {
                            pVarA = d.f1002a.a();
                        } else {
                            pVarA = pVar2;
                        }
                        if (i11 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i13 != 0) {
                            function2 = a.f1132a;
                        } else {
                            function2 = function1;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                        }
                        AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        pVar3 = pVarA;
                        z11 = z10;
                        function3 = function2;
                    } else {
                        interfaceC3163lP.z();
                        pVar3 = pVar2;
                        z11 = z9;
                        function3 = function1;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new c(goBack, title, pVar3, z11, function3, i8, i9));
                    }
                }
                i10 |= 24576;
                function1 = function0;
                if ((46811 & i10) == 9362) {
                    if (i15 != 0) {
                        pVarA = d.f1002a.a();
                    } else {
                        pVarA = pVar2;
                    }
                    if (i11 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i13 != 0) {
                        function2 = a.f1132a;
                    } else {
                        function2 = function1;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                    }
                    AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    pVar3 = pVarA;
                    z11 = z10;
                    function3 = function2;
                } else {
                    if (i15 != 0) {
                        pVarA = d.f1002a.a();
                    } else {
                        pVarA = pVar2;
                    }
                    if (i11 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i13 != 0) {
                        function2 = a.f1132a;
                    } else {
                        function2 = function1;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                    }
                    AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    pVar3 = pVarA;
                    z11 = z10;
                    function3 = function2;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(goBack, title, pVar3, z11, function3, i8, i9));
                }
            }
            i10 |= 3072;
            z9 = z8;
            i13 = i9 & 16;
            if (i13 != 0) {
                if ((57344 & i8) == 0) {
                    function1 = function0;
                    if (interfaceC3163lP.l(function1)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i10 |= i14;
                }
                if ((46811 & i10) == 9362) {
                    if (i15 != 0) {
                        pVarA = d.f1002a.a();
                    } else {
                        pVarA = pVar2;
                    }
                    if (i11 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i13 != 0) {
                        function2 = a.f1132a;
                    } else {
                        function2 = function1;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                    }
                    AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    pVar3 = pVarA;
                    z11 = z10;
                    function3 = function2;
                } else {
                    if (i15 != 0) {
                        pVarA = d.f1002a.a();
                    } else {
                        pVarA = pVar2;
                    }
                    if (i11 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i13 != 0) {
                        function2 = a.f1132a;
                    } else {
                        function2 = function1;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                    }
                    AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    pVar3 = pVarA;
                    z11 = z10;
                    function3 = function2;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(goBack, title, pVar3, z11, function3, i8, i9));
                }
            }
            i10 |= 24576;
            function1 = function0;
            if ((46811 & i10) == 9362) {
                if (i15 != 0) {
                    pVarA = d.f1002a.a();
                } else {
                    pVarA = pVar2;
                }
                if (i11 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i13 != 0) {
                    function2 = a.f1132a;
                } else {
                    function2 = function1;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                }
                AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                pVar3 = pVarA;
                z11 = z10;
                function3 = function2;
            } else {
                if (i15 != 0) {
                    pVarA = d.f1002a.a();
                } else {
                    pVarA = pVar2;
                }
                if (i11 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i13 != 0) {
                    function2 = a.f1132a;
                } else {
                    function2 = function1;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                }
                AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                pVar3 = pVarA;
                z11 = z10;
                function3 = function2;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(goBack, title, pVar3, z11, function3, i8, i9));
            }
        }
        i10 |= 384;
        pVar2 = pVar;
        i11 = i9 & 8;
        if (i11 != 0) {
            if ((i8 & 7168) == 0) {
                z9 = z8;
                if (interfaceC3163lP.c(z9)) {
                    i12 = 2048;
                } else {
                    i12 = 1024;
                }
                i10 |= i12;
            }
            i13 = i9 & 16;
            if (i13 != 0) {
                if ((57344 & i8) == 0) {
                    function1 = function0;
                    if (interfaceC3163lP.l(function1)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i10 |= i14;
                }
                if ((46811 & i10) == 9362) {
                    if (i15 != 0) {
                        pVarA = d.f1002a.a();
                    } else {
                        pVarA = pVar2;
                    }
                    if (i11 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i13 != 0) {
                        function2 = a.f1132a;
                    } else {
                        function2 = function1;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                    }
                    AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    pVar3 = pVarA;
                    z11 = z10;
                    function3 = function2;
                } else {
                    if (i15 != 0) {
                        pVarA = d.f1002a.a();
                    } else {
                        pVarA = pVar2;
                    }
                    if (i11 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i13 != 0) {
                        function2 = a.f1132a;
                    } else {
                        function2 = function1;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                    }
                    AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    pVar3 = pVarA;
                    z11 = z10;
                    function3 = function2;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(goBack, title, pVar3, z11, function3, i8, i9));
                }
            }
            i10 |= 24576;
            function1 = function0;
            if ((46811 & i10) == 9362) {
                if (i15 != 0) {
                    pVarA = d.f1002a.a();
                } else {
                    pVarA = pVar2;
                }
                if (i11 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i13 != 0) {
                    function2 = a.f1132a;
                } else {
                    function2 = function1;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                }
                AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                pVar3 = pVarA;
                z11 = z10;
                function3 = function2;
            } else {
                if (i15 != 0) {
                    pVarA = d.f1002a.a();
                } else {
                    pVarA = pVar2;
                }
                if (i11 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i13 != 0) {
                    function2 = a.f1132a;
                } else {
                    function2 = function1;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                }
                AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                pVar3 = pVarA;
                z11 = z10;
                function3 = function2;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(goBack, title, pVar3, z11, function3, i8, i9));
            }
        }
        i10 |= 3072;
        z9 = z8;
        i13 = i9 & 16;
        if (i13 != 0) {
            if ((57344 & i8) == 0) {
                function1 = function0;
                if (interfaceC3163lP.l(function1)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i10 |= i14;
            }
            if ((46811 & i10) == 9362) {
                if (i15 != 0) {
                    pVarA = d.f1002a.a();
                } else {
                    pVarA = pVar2;
                }
                if (i11 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i13 != 0) {
                    function2 = a.f1132a;
                } else {
                    function2 = function1;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                }
                AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                pVar3 = pVarA;
                z11 = z10;
                function3 = function2;
            } else {
                if (i15 != 0) {
                    pVarA = d.f1002a.a();
                } else {
                    pVarA = pVar2;
                }
                if (i11 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i13 != 0) {
                    function2 = a.f1132a;
                } else {
                    function2 = function1;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
                }
                AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                pVar3 = pVarA;
                z11 = z10;
                function3 = function2;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(goBack, title, pVar3, z11, function3, i8, i9));
            }
        }
        i10 |= 24576;
        function1 = function0;
        if ((46811 & i10) == 9362) {
            if (i15 != 0) {
                pVarA = d.f1002a.a();
            } else {
                pVarA = pVar2;
            }
            if (i11 != 0) {
                z10 = false;
            } else {
                z10 = z9;
            }
            if (i13 != 0) {
                function2 = a.f1132a;
            } else {
                function2 = function1;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
            }
            AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            pVar3 = pVarA;
            z11 = z10;
            function3 = function2;
        } else {
            if (i15 != 0) {
                pVarA = d.f1002a.a();
            } else {
                pVarA = pVar2;
            }
            if (i11 != 0) {
                z10 = false;
            } else {
                z10 = z9;
            }
            if (i13 != 0) {
                function2 = a.f1132a;
            } else {
                function2 = function1;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(113334126, i10, -1, "com.elgato.streamdeck.settings.SettingsTopBar (SettingsTopBar.kt:24)");
            }
            AbstractC3068k.a(title, null, H0.c.b(interfaceC3163lP, 1245843861, true, new b(z10, function2, goBack)), pVarA, null, null, null, interfaceC3163lP, ((i10 >> 3) & 14) | 384 | ((i10 << 3) & 7168), 114);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            pVar3 = pVarA;
            z11 = z10;
            function3 = function2;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(goBack, title, pVar3, z11, function3, i8, i9));
        }
    }
}
