package J3;

import C6.G;
import android.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p065h1.I0;
import p191w0.AbstractC3064i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f4173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f4174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f4175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f4176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f4177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f4178f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f4179g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f4180h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f4181i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f4182j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0, Function0 function1, Function0 function2, int i8, int i9, int i10, int i11, boolean z8, int i12, int i13) {
            super(2);
            this.f4173a = function0;
            this.f4174b = function1;
            this.f4175c = function2;
            this.f4176d = i8;
            this.f4177e = i9;
            this.f4178f = i10;
            this.f4179g = i11;
            this.f4180h = z8;
            this.f4181i = i12;
            this.f4182j = i13;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            h.a(this.f4173a, this.f4174b, this.f4175c, this.f4176d, this.f4177e, this.f4178f, this.f4179g, this.f4180h, interfaceC3163l, F0.a(this.f4181i | 1), this.f4182j);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f4183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f4184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f4185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f4186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0 f4187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f4188f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Function0 f4189g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f4190h;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f4191a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f4192b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f4193c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function0 f4194d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Function0 f4195e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f4196f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Function0 f4197g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ boolean f4198h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, String str3, Function0 function0, Function0 function1, String str4, Function0 function2, boolean z8) {
                super(2);
                this.f4191a = str;
                this.f4192b = str2;
                this.f4193c = str3;
                this.f4194d = function0;
                this.f4195e = function1;
                this.f4196f = str4;
                this.f4197g = function2;
                this.f4198h = z8;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(37454673, i8, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert.<anonymous>.<anonymous> (ConfirmationAlert.kt:62)");
                }
                String str = this.f4191a;
                String str2 = this.f4192b;
                String str3 = this.f4193c;
                Function0 function0 = this.f4194d;
                if (function0 == null) {
                    function0 = this.f4195e;
                }
                Function0 function1 = function0;
                String str4 = this.f4196f;
                if (!this.f4198h) {
                    str4 = null;
                }
                String str5 = str4;
                Function0 function2 = this.f4197g;
                if (function2 == null) {
                    function2 = this.f4195e;
                }
                i.b(str, str2, null, null, str3, function1, str5, function2, null, null, null, interfaceC3163l, 0, 0, 1804);
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
        public b(Function0 function0, String str, String str2, String str3, Function0 function1, String str4, Function0 function2, boolean z8) {
            super(2);
            this.f4183a = function0;
            this.f4184b = str;
            this.f4185c = str2;
            this.f4186d = str3;
            this.f4187e = function1;
            this.f4188f = str4;
            this.f4189g = function2;
            this.f4190h = z8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1759017065, i8, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert.<anonymous> (ConfirmationAlert.kt:52)");
            }
            E1.g gVar = new E1.g(false, false, null, false, false, 7, null);
            L0.i iVarA = I0.a(androidx.compose.foundation.layout.e.i(L0.i.f4836a, W3.c.f11463a.k()), "update_dialog");
            Function0 function0 = this.f4183a;
            AbstractC3064i.a(function0, iVarA, gVar, H0.c.b(interfaceC3163l, 37454673, true, new a(this.f4184b, this.f4185c, this.f4186d, this.f4187e, function0, this.f4188f, this.f4189g, this.f4190h)), interfaceC3163l, 3456, 0);
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
    public static final class c extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f4199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f4200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f4201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f4202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f4203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f4204f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f4205g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f4206h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f4207i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f4208j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, Function0 function1, Function0 function2, String str, String str2, String str3, String str4, boolean z8, int i8, int i9) {
            super(2);
            this.f4199a = function0;
            this.f4200b = function1;
            this.f4201c = function2;
            this.f4202d = str;
            this.f4203e = str2;
            this.f4204f = str3;
            this.f4205g = str4;
            this.f4206h = z8;
            this.f4207i = i8;
            this.f4208j = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            h.b(this.f4199a, this.f4200b, this.f4201c, this.f4202d, this.f4203e, this.f4204f, this.f4205g, this.f4206h, interfaceC3163l, F0.a(this.f4207i | 1), this.f4208j);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x0126  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:110:0x0131  */
    /* JADX WARN: Code duplicated, block: B:113:0x0172  */
    /* JADX WARN: Code duplicated, block: B:117:0x0182  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    public static final void a(Function0 onDismiss, Function0 function0, Function0 function1, int i8, int i9, int i10, int i11, boolean z8, InterfaceC3163l interfaceC3163l, int i12, int i13) {
        int i14;
        Function0 function2;
        int i15;
        Function0 function3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Function0 function4;
        int i27;
        boolean z9;
        Function0 function5;
        int i28;
        Function0 function6;
        boolean z10;
        int i29;
        P0 p0V;
        t.g(onDismiss, "onDismiss");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1143389398);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (interfaceC3163lP.l(onDismiss) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i30 = i13 & 2;
        if (i30 == 0) {
            if ((i12 & 112) == 0) {
                function2 = function0;
                i14 |= interfaceC3163lP.l(function2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & 896) == 0) {
                    function3 = function1;
                    if (interfaceC3163lP.l(function3)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                if ((i13 & 8) != 0) {
                    i14 |= 3072;
                } else if ((i12 & 7168) == 0) {
                    if (interfaceC3163lP.i(i8)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i14 |= i17;
                }
                if ((i13 & 16) != 0) {
                    i14 |= 24576;
                } else if ((57344 & i12) == 0) {
                    if (interfaceC3163lP.i(i9)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    if ((458752 & i12) == 0) {
                        i20 = i10;
                        if (interfaceC3163lP.i(i20)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 64;
                    if (i22 != 0) {
                        if ((3670016 & i12) == 0) {
                            i23 = i11;
                            if (interfaceC3163lP.i(i23)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i14 |= i24;
                        }
                        i25 = i13 & 128;
                        if (i25 != 0) {
                            i14 |= 12582912;
                        } else if ((i12 & 29360128) == 0) {
                            if (interfaceC3163lP.c(z8)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                            i14 |= i26;
                        }
                        if ((i14 & 23967451) == 4793490 || !interfaceC3163lP.s()) {
                            if (i30 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i19 != 0) {
                                i27 = R.string.ok;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                i23 = 17039360;
                            }
                            if (i25 != 0) {
                                z9 = false;
                            } else {
                                z9 = z8;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                            }
                            String strB = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                            String strB2 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                            String strB3 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                            String strB4 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                            int i31 = i14 & 29361150;
                            Function0 function7 = function3;
                            int i32 = i27;
                            b(onDismiss, function4, function7, strB, strB2, strB3, strB4, z9, interfaceC3163lP, i31, 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            function5 = function7;
                            i28 = i32;
                            function6 = function4;
                            z10 = z9;
                        } else {
                            interfaceC3163lP.z();
                            function6 = function2;
                            function5 = function3;
                            i28 = i20;
                            z10 = z8;
                        }
                        i29 = i23;
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
                        }
                    }
                    i14 |= 1572864;
                    i23 = i11;
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 23967451) == 4793490) {
                        if (i30 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i19 != 0) {
                            i27 = R.string.ok;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            i23 = 17039360;
                        }
                        if (i25 != 0) {
                            z9 = false;
                        } else {
                            z9 = z8;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                        }
                        String strB5 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                        String strB6 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                        String strB7 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                        String strB8 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                        int i33 = i14 & 29361150;
                        Function0 function8 = function3;
                        int i34 = i27;
                        b(onDismiss, function4, function8, strB5, strB6, strB7, strB8, z9, interfaceC3163lP, i33, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        function5 = function8;
                        i28 = i34;
                        function6 = function4;
                        z10 = z9;
                    } else {
                        if (i30 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i19 != 0) {
                            i27 = R.string.ok;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            i23 = 17039360;
                        }
                        if (i25 != 0) {
                            z9 = false;
                        } else {
                            z9 = z8;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                        }
                        String strB9 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                        String strB10 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                        String strB11 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                        String strB12 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                        int i35 = i14 & 29361150;
                        Function0 function9 = function3;
                        int i36 = i27;
                        b(onDismiss, function4, function9, strB9, strB10, strB11, strB12, z9, interfaceC3163lP, i35, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        function5 = function9;
                        i28 = i36;
                        function6 = function4;
                        z10 = z9;
                    }
                    i29 = i23;
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
                    }
                }
                i14 |= 196608;
                i20 = i10;
                i22 = i13 & 64;
                if (i22 != 0) {
                    if ((3670016 & i12) == 0) {
                        i23 = i11;
                        if (interfaceC3163lP.i(i23)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 23967451) == 4793490) {
                        if (i30 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i19 != 0) {
                            i27 = R.string.ok;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            i23 = 17039360;
                        }
                        if (i25 != 0) {
                            z9 = false;
                        } else {
                            z9 = z8;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                        }
                        String strB13 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                        String strB14 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                        String strB15 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                        String strB16 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                        int i37 = i14 & 29361150;
                        Function0 function10 = function3;
                        int i38 = i27;
                        b(onDismiss, function4, function10, strB13, strB14, strB15, strB16, z9, interfaceC3163lP, i37, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        function5 = function10;
                        i28 = i38;
                        function6 = function4;
                        z10 = z9;
                    } else {
                        if (i30 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i19 != 0) {
                            i27 = R.string.ok;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            i23 = 17039360;
                        }
                        if (i25 != 0) {
                            z9 = false;
                        } else {
                            z9 = z8;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                        }
                        String strB17 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                        String strB18 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                        String strB19 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                        String strB110 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                        int i39 = i14 & 29361150;
                        Function0 function11 = function3;
                        int i310 = i27;
                        b(onDismiss, function4, function11, strB17, strB18, strB19, strB110, z9, interfaceC3163lP, i39, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        function5 = function11;
                        i28 = i310;
                        function6 = function4;
                        z10 = z9;
                    }
                    i29 = i23;
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
                    }
                }
                i14 |= 1572864;
                i23 = i11;
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 23967451) == 4793490) {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB111 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB112 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB113 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB114 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i311 = i14 & 29361150;
                    Function0 function12 = function3;
                    int i312 = i27;
                    b(onDismiss, function4, function12, strB111, strB112, strB113, strB114, z9, interfaceC3163lP, i311, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function12;
                    i28 = i312;
                    function6 = function4;
                    z10 = z9;
                } else {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB115 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB116 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB117 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB118 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i313 = i14 & 29361150;
                    Function0 function13 = function3;
                    int i314 = i27;
                    b(onDismiss, function4, function13, strB115, strB116, strB117, strB118, z9, interfaceC3163lP, i313, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function13;
                    i28 = i314;
                    function6 = function4;
                    z10 = z9;
                }
                i29 = i23;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
                }
            }
            i14 |= 384;
            function3 = function1;
            if ((i13 & 8) != 0) {
                i14 |= 3072;
            } else if ((i12 & 7168) == 0) {
                if (interfaceC3163lP.i(i8)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i14 |= i17;
            }
            if ((i13 & 16) != 0) {
                i14 |= 24576;
            } else if ((57344 & i12) == 0) {
                if (interfaceC3163lP.i(i9)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                if ((458752 & i12) == 0) {
                    i20 = i10;
                    if (interfaceC3163lP.i(i20)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 64;
                if (i22 != 0) {
                    if ((3670016 & i12) == 0) {
                        i23 = i11;
                        if (interfaceC3163lP.i(i23)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 23967451) == 4793490) {
                        if (i30 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i19 != 0) {
                            i27 = R.string.ok;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            i23 = 17039360;
                        }
                        if (i25 != 0) {
                            z9 = false;
                        } else {
                            z9 = z8;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                        }
                        String strB119 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                        String strB1110 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                        String strB1111 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                        String strB1112 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                        int i315 = i14 & 29361150;
                        Function0 function14 = function3;
                        int i316 = i27;
                        b(onDismiss, function4, function14, strB119, strB1110, strB1111, strB1112, z9, interfaceC3163lP, i315, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        function5 = function14;
                        i28 = i316;
                        function6 = function4;
                        z10 = z9;
                    } else {
                        if (i30 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i19 != 0) {
                            i27 = R.string.ok;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            i23 = 17039360;
                        }
                        if (i25 != 0) {
                            z9 = false;
                        } else {
                            z9 = z8;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                        }
                        String strB1113 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                        String strB1114 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                        String strB1115 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                        String strB1116 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                        int i317 = i14 & 29361150;
                        Function0 function15 = function3;
                        int i318 = i27;
                        b(onDismiss, function4, function15, strB1113, strB1114, strB1115, strB1116, z9, interfaceC3163lP, i317, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        function5 = function15;
                        i28 = i318;
                        function6 = function4;
                        z10 = z9;
                    }
                    i29 = i23;
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
                    }
                }
                i14 |= 1572864;
                i23 = i11;
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 23967451) == 4793490) {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB1117 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB1118 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB1119 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB11110 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i319 = i14 & 29361150;
                    Function0 function16 = function3;
                    int i3110 = i27;
                    b(onDismiss, function4, function16, strB1117, strB1118, strB1119, strB11110, z9, interfaceC3163lP, i319, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function16;
                    i28 = i3110;
                    function6 = function4;
                    z10 = z9;
                } else {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB11111 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB11112 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB11113 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB11114 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i3111 = i14 & 29361150;
                    Function0 function17 = function3;
                    int i3112 = i27;
                    b(onDismiss, function4, function17, strB11111, strB11112, strB11113, strB11114, z9, interfaceC3163lP, i3111, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function17;
                    i28 = i3112;
                    function6 = function4;
                    z10 = z9;
                }
                i29 = i23;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
                }
            }
            i14 |= 196608;
            i20 = i10;
            i22 = i13 & 64;
            if (i22 != 0) {
                if ((3670016 & i12) == 0) {
                    i23 = i11;
                    if (interfaceC3163lP.i(i23)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 23967451) == 4793490) {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB11115 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB11116 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB11117 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB11118 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i3113 = i14 & 29361150;
                    Function0 function18 = function3;
                    int i3114 = i27;
                    b(onDismiss, function4, function18, strB11115, strB11116, strB11117, strB11118, z9, interfaceC3163lP, i3113, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function18;
                    i28 = i3114;
                    function6 = function4;
                    z10 = z9;
                } else {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB11119 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB111110 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB111111 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB111112 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i3115 = i14 & 29361150;
                    Function0 function19 = function3;
                    int i3116 = i27;
                    b(onDismiss, function4, function19, strB11119, strB111110, strB111111, strB111112, z9, interfaceC3163lP, i3115, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function19;
                    i28 = i3116;
                    function6 = function4;
                    z10 = z9;
                }
                i29 = i23;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
                }
            }
            i14 |= 1572864;
            i23 = i11;
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 23967451) == 4793490) {
                if (i30 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i19 != 0) {
                    i27 = R.string.ok;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    i23 = 17039360;
                }
                if (i25 != 0) {
                    z9 = false;
                } else {
                    z9 = z8;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                }
                String strB111113 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                String strB111114 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                String strB111115 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                String strB111116 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                int i3117 = i14 & 29361150;
                Function0 function110 = function3;
                int i3118 = i27;
                b(onDismiss, function4, function110, strB111113, strB111114, strB111115, strB111116, z9, interfaceC3163lP, i3117, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function5 = function110;
                i28 = i3118;
                function6 = function4;
                z10 = z9;
            } else {
                if (i30 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i19 != 0) {
                    i27 = R.string.ok;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    i23 = 17039360;
                }
                if (i25 != 0) {
                    z9 = false;
                } else {
                    z9 = z8;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                }
                String strB111117 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                String strB111118 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                String strB111119 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                String strB1111110 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                int i3119 = i14 & 29361150;
                Function0 function111 = function3;
                int i31110 = i27;
                b(onDismiss, function4, function111, strB111117, strB111118, strB111119, strB1111110, z9, interfaceC3163lP, i3119, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function5 = function111;
                i28 = i31110;
                function6 = function4;
                z10 = z9;
            }
            i29 = i23;
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
            }
        }
        i14 |= 48;
        function2 = function0;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & 896) == 0) {
                function3 = function1;
                if (interfaceC3163lP.l(function3)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            if ((i13 & 8) != 0) {
                i14 |= 3072;
            } else if ((i12 & 7168) == 0) {
                if (interfaceC3163lP.i(i8)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i14 |= i17;
            }
            if ((i13 & 16) != 0) {
                i14 |= 24576;
            } else if ((57344 & i12) == 0) {
                if (interfaceC3163lP.i(i9)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                if ((458752 & i12) == 0) {
                    i20 = i10;
                    if (interfaceC3163lP.i(i20)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 64;
                if (i22 != 0) {
                    if ((3670016 & i12) == 0) {
                        i23 = i11;
                        if (interfaceC3163lP.i(i23)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 23967451) == 4793490) {
                        if (i30 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i19 != 0) {
                            i27 = R.string.ok;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            i23 = 17039360;
                        }
                        if (i25 != 0) {
                            z9 = false;
                        } else {
                            z9 = z8;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                        }
                        String strB1111111 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                        String strB1111112 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                        String strB1111113 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                        String strB1111114 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                        int i31111 = i14 & 29361150;
                        Function0 function112 = function3;
                        int i31112 = i27;
                        b(onDismiss, function4, function112, strB1111111, strB1111112, strB1111113, strB1111114, z9, interfaceC3163lP, i31111, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        function5 = function112;
                        i28 = i31112;
                        function6 = function4;
                        z10 = z9;
                    } else {
                        if (i30 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i19 != 0) {
                            i27 = R.string.ok;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            i23 = 17039360;
                        }
                        if (i25 != 0) {
                            z9 = false;
                        } else {
                            z9 = z8;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                        }
                        String strB1111115 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                        String strB1111116 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                        String strB1111117 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                        String strB1111118 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                        int i31113 = i14 & 29361150;
                        Function0 function113 = function3;
                        int i31114 = i27;
                        b(onDismiss, function4, function113, strB1111115, strB1111116, strB1111117, strB1111118, z9, interfaceC3163lP, i31113, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        function5 = function113;
                        i28 = i31114;
                        function6 = function4;
                        z10 = z9;
                    }
                    i29 = i23;
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
                    }
                }
                i14 |= 1572864;
                i23 = i11;
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 23967451) == 4793490) {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB1111119 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB11111110 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB11111111 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB11111112 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i31115 = i14 & 29361150;
                    Function0 function114 = function3;
                    int i31116 = i27;
                    b(onDismiss, function4, function114, strB1111119, strB11111110, strB11111111, strB11111112, z9, interfaceC3163lP, i31115, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function114;
                    i28 = i31116;
                    function6 = function4;
                    z10 = z9;
                } else {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB11111113 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB11111114 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB11111115 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB11111116 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i31117 = i14 & 29361150;
                    Function0 function115 = function3;
                    int i31118 = i27;
                    b(onDismiss, function4, function115, strB11111113, strB11111114, strB11111115, strB11111116, z9, interfaceC3163lP, i31117, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function115;
                    i28 = i31118;
                    function6 = function4;
                    z10 = z9;
                }
                i29 = i23;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
                }
            }
            i14 |= 196608;
            i20 = i10;
            i22 = i13 & 64;
            if (i22 != 0) {
                if ((3670016 & i12) == 0) {
                    i23 = i11;
                    if (interfaceC3163lP.i(i23)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 23967451) == 4793490) {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB11111117 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB11111118 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB11111119 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB111111110 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i31119 = i14 & 29361150;
                    Function0 function116 = function3;
                    int i311110 = i27;
                    b(onDismiss, function4, function116, strB11111117, strB11111118, strB11111119, strB111111110, z9, interfaceC3163lP, i31119, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function116;
                    i28 = i311110;
                    function6 = function4;
                    z10 = z9;
                } else {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB111111111 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB111111112 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB111111113 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB111111114 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i311111 = i14 & 29361150;
                    Function0 function117 = function3;
                    int i311112 = i27;
                    b(onDismiss, function4, function117, strB111111111, strB111111112, strB111111113, strB111111114, z9, interfaceC3163lP, i311111, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function117;
                    i28 = i311112;
                    function6 = function4;
                    z10 = z9;
                }
                i29 = i23;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
                }
            }
            i14 |= 1572864;
            i23 = i11;
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 23967451) == 4793490) {
                if (i30 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i19 != 0) {
                    i27 = R.string.ok;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    i23 = 17039360;
                }
                if (i25 != 0) {
                    z9 = false;
                } else {
                    z9 = z8;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                }
                String strB111111115 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                String strB111111116 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                String strB111111117 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                String strB111111118 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                int i311113 = i14 & 29361150;
                Function0 function118 = function3;
                int i311114 = i27;
                b(onDismiss, function4, function118, strB111111115, strB111111116, strB111111117, strB111111118, z9, interfaceC3163lP, i311113, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function5 = function118;
                i28 = i311114;
                function6 = function4;
                z10 = z9;
            } else {
                if (i30 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i19 != 0) {
                    i27 = R.string.ok;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    i23 = 17039360;
                }
                if (i25 != 0) {
                    z9 = false;
                } else {
                    z9 = z8;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                }
                String strB111111119 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                String strB1111111110 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                String strB1111111111 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                String strB1111111112 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                int i311115 = i14 & 29361150;
                Function0 function119 = function3;
                int i311116 = i27;
                b(onDismiss, function4, function119, strB111111119, strB1111111110, strB1111111111, strB1111111112, z9, interfaceC3163lP, i311115, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function5 = function119;
                i28 = i311116;
                function6 = function4;
                z10 = z9;
            }
            i29 = i23;
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
            }
        }
        i14 |= 384;
        function3 = function1;
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i12 & 7168) == 0) {
            if (interfaceC3163lP.i(i8)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i14 |= i17;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((57344 & i12) == 0) {
            if (interfaceC3163lP.i(i9)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i14 |= i18;
        }
        i19 = i13 & 32;
        if (i19 != 0) {
            if ((458752 & i12) == 0) {
                i20 = i10;
                if (interfaceC3163lP.i(i20)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i14 |= i21;
            }
            i22 = i13 & 64;
            if (i22 != 0) {
                if ((3670016 & i12) == 0) {
                    i23 = i11;
                    if (interfaceC3163lP.i(i23)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 23967451) == 4793490) {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB1111111113 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB1111111114 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB1111111115 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB1111111116 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i311117 = i14 & 29361150;
                    Function0 function1110 = function3;
                    int i311118 = i27;
                    b(onDismiss, function4, function1110, strB1111111113, strB1111111114, strB1111111115, strB1111111116, z9, interfaceC3163lP, i311117, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function1110;
                    i28 = i311118;
                    function6 = function4;
                    z10 = z9;
                } else {
                    if (i30 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i19 != 0) {
                        i27 = R.string.ok;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        i23 = 17039360;
                    }
                    if (i25 != 0) {
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                    }
                    String strB1111111117 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                    String strB1111111118 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                    String strB1111111119 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                    String strB11111111110 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                    int i311119 = i14 & 29361150;
                    Function0 function1111 = function3;
                    int i3111110 = i27;
                    b(onDismiss, function4, function1111, strB1111111117, strB1111111118, strB1111111119, strB11111111110, z9, interfaceC3163lP, i311119, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function5 = function1111;
                    i28 = i3111110;
                    function6 = function4;
                    z10 = z9;
                }
                i29 = i23;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
                }
            }
            i14 |= 1572864;
            i23 = i11;
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 23967451) == 4793490) {
                if (i30 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i19 != 0) {
                    i27 = R.string.ok;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    i23 = 17039360;
                }
                if (i25 != 0) {
                    z9 = false;
                } else {
                    z9 = z8;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                }
                String strB11111111111 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                String strB11111111112 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                String strB11111111113 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                String strB11111111114 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                int i3111111 = i14 & 29361150;
                Function0 function1112 = function3;
                int i3111112 = i27;
                b(onDismiss, function4, function1112, strB11111111111, strB11111111112, strB11111111113, strB11111111114, z9, interfaceC3163lP, i3111111, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function5 = function1112;
                i28 = i3111112;
                function6 = function4;
                z10 = z9;
            } else {
                if (i30 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i19 != 0) {
                    i27 = R.string.ok;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    i23 = 17039360;
                }
                if (i25 != 0) {
                    z9 = false;
                } else {
                    z9 = z8;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                }
                String strB11111111115 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                String strB11111111116 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                String strB11111111117 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                String strB11111111118 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                int i3111113 = i14 & 29361150;
                Function0 function1113 = function3;
                int i3111114 = i27;
                b(onDismiss, function4, function1113, strB11111111115, strB11111111116, strB11111111117, strB11111111118, z9, interfaceC3163lP, i3111113, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function5 = function1113;
                i28 = i3111114;
                function6 = function4;
                z10 = z9;
            }
            i29 = i23;
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
            }
        }
        i14 |= 196608;
        i20 = i10;
        i22 = i13 & 64;
        if (i22 != 0) {
            if ((3670016 & i12) == 0) {
                i23 = i11;
                if (interfaceC3163lP.i(i23)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 23967451) == 4793490) {
                if (i30 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i19 != 0) {
                    i27 = R.string.ok;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    i23 = 17039360;
                }
                if (i25 != 0) {
                    z9 = false;
                } else {
                    z9 = z8;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                }
                String strB11111111119 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                String strB111111111110 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                String strB111111111111 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                String strB111111111112 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                int i3111115 = i14 & 29361150;
                Function0 function1114 = function3;
                int i3111116 = i27;
                b(onDismiss, function4, function1114, strB11111111119, strB111111111110, strB111111111111, strB111111111112, z9, interfaceC3163lP, i3111115, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function5 = function1114;
                i28 = i3111116;
                function6 = function4;
                z10 = z9;
            } else {
                if (i30 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i19 != 0) {
                    i27 = R.string.ok;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    i23 = 17039360;
                }
                if (i25 != 0) {
                    z9 = false;
                } else {
                    z9 = z8;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
                }
                String strB111111111113 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
                String strB111111111114 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
                String strB111111111115 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
                String strB111111111116 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
                int i3111117 = i14 & 29361150;
                Function0 function1115 = function3;
                int i3111118 = i27;
                b(onDismiss, function4, function1115, strB111111111113, strB111111111114, strB111111111115, strB111111111116, z9, interfaceC3163lP, i3111117, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function5 = function1115;
                i28 = i3111118;
                function6 = function4;
                z10 = z9;
            }
            i29 = i23;
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
            }
        }
        i14 |= 1572864;
        i23 = i11;
        i25 = i13 & 128;
        if (i25 != 0) {
            i14 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (interfaceC3163lP.c(z8)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i14 |= i26;
        }
        if ((i14 & 23967451) == 4793490) {
            if (i30 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i15 != 0) {
                function3 = null;
            }
            if (i19 != 0) {
                i27 = R.string.ok;
            } else {
                i27 = i20;
            }
            if (i22 != 0) {
                i23 = 17039360;
            }
            if (i25 != 0) {
                z9 = false;
            } else {
                z9 = z8;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
            }
            String strB111111111117 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
            String strB111111111118 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
            String strB111111111119 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
            String strB1111111111110 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
            int i3111119 = i14 & 29361150;
            Function0 function1116 = function3;
            int i31111110 = i27;
            b(onDismiss, function4, function1116, strB111111111117, strB111111111118, strB111111111119, strB1111111111110, z9, interfaceC3163lP, i3111119, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            function5 = function1116;
            i28 = i31111110;
            function6 = function4;
            z10 = z9;
        } else {
            if (i30 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i15 != 0) {
                function3 = null;
            }
            if (i19 != 0) {
                i27 = R.string.ok;
            } else {
                i27 = i20;
            }
            if (i22 != 0) {
                i23 = 17039360;
            }
            if (i25 != 0) {
                z9 = false;
            } else {
                z9 = z8;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1143389398, i14, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:26)");
            }
            String strB1111111111111 = p101l1.f.b(i8, interfaceC3163lP, (i14 >> 9) & 14);
            String strB1111111111112 = p101l1.f.b(i9, interfaceC3163lP, (i14 >> 12) & 14);
            String strB1111111111113 = p101l1.f.b(i27, interfaceC3163lP, (i14 >> 15) & 14);
            String strB1111111111114 = p101l1.f.b(i23, interfaceC3163lP, (i14 >> 18) & 14);
            int i31111111 = i14 & 29361150;
            Function0 function1117 = function3;
            int i31111112 = i27;
            b(onDismiss, function4, function1117, strB1111111111111, strB1111111111112, strB1111111111113, strB1111111111114, z9, interfaceC3163lP, i31111111, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            function5 = function1117;
            i28 = i31111112;
            function6 = function4;
            z10 = z9;
        }
        i29 = i23;
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(onDismiss, function6, function5, i8, i9, i28, i29, z10, i12, i13));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012f A[PHI: r3 r6 r8 r12 r14
      0x012f: PHI (r3v28 int) = (r3v23 int), (r3v22 int), (r3v29 int) binds: [B:112:0x014e, B:99:0x012c, B:100:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r6v8 kotlin.jvm.functions.Function0) = (r6v3 kotlin.jvm.functions.Function0), (r6v2 kotlin.jvm.functions.Function0), (r6v2 kotlin.jvm.functions.Function0) binds: [B:112:0x014e, B:99:0x012c, B:100:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r8v7 kotlin.jvm.functions.Function0) = (r8v3 kotlin.jvm.functions.Function0), (r8v2 kotlin.jvm.functions.Function0), (r8v2 kotlin.jvm.functions.Function0) binds: [B:112:0x014e, B:99:0x012c, B:100:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r12v25 java.lang.String) = (r12v21 java.lang.String), (r12v20 java.lang.String), (r12v20 java.lang.String) binds: [B:112:0x014e, B:99:0x012c, B:100:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r14v7 java.lang.String) = (r14v4 java.lang.String), (r14v3 java.lang.String), (r14v3 java.lang.String) binds: [B:112:0x014e, B:99:0x012c, B:100:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:104:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x013c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0141  */
    /* JADX WARN: Code duplicated, block: B:111:0x014d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x015f  */
    /* JADX WARN: Code duplicated, block: B:119:0x018f  */
    /* JADX WARN: Code duplicated, block: B:123:0x019c  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    public static final void b(Function0 onDismiss, Function0 function0, Function0 function1, String title, String body, String str, String str2, boolean z8, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        Function0 function2;
        int i11;
        Function0 function3;
        int i12;
        int i13;
        int i14;
        String strB;
        int i15;
        String str3;
        int i16;
        int i17;
        int i18;
        Function0 function4;
        Function0 function5;
        String str4;
        String str5;
        boolean z9;
        InterfaceC3163l interfaceC3163l2;
        Function0 function6;
        Function0 function7;
        String str6;
        String str7;
        P0 p0V;
        t.g(onDismiss, "onDismiss");
        t.g(title, "title");
        t.g(body, "body");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(507870370);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.l(onDismiss) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i19 = i9 & 2;
        if (i19 == 0) {
            if ((i8 & 112) == 0) {
                function2 = function0;
                i10 |= interfaceC3163lP.l(function2) ? 32 : 16;
            }
            i11 = i9 & 4;
            if (i11 != 0) {
                if ((i8 & 896) == 0) {
                    function3 = function1;
                    if (interfaceC3163lP.l(function3)) {
                        i12 = 256;
                    } else {
                        i12 = 128;
                    }
                    i10 |= i12;
                }
                if ((i9 & 8) != 0) {
                    i10 |= 3072;
                } else if ((i8 & 7168) == 0) {
                    if (interfaceC3163lP.R(title)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i10 |= i13;
                }
                if ((i9 & 16) != 0) {
                    i10 |= 24576;
                } else if ((57344 & i8) == 0) {
                    if (interfaceC3163lP.R(body)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i10 |= i14;
                }
                if ((458752 & i8) == 0) {
                    if ((i9 & 32) == 0) {
                        strB = str;
                        int i20 = interfaceC3163lP.R(strB) ? 131072 : 65536;
                        i10 |= i20;
                    } else {
                        strB = str;
                    }
                    i10 |= i20;
                } else {
                    strB = str;
                }
                i15 = i9 & 64;
                if (i15 != 0) {
                    if ((3670016 & i8) == 0) {
                        str3 = str2;
                        if (interfaceC3163lP.R(str3)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i10 |= i16;
                    }
                    i17 = i9 & 128;
                    if (i17 != 0) {
                        i10 |= 12582912;
                    } else if ((i8 & 29360128) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i10 |= i18;
                    }
                    if ((i10 & 23967451) == 4793490 || !interfaceC3163lP.s()) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                            if (i19 != 0) {
                                function2 = null;
                            }
                            if (i11 != 0) {
                                function3 = null;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                            }
                            if (i15 != 0) {
                                str3 = null;
                            }
                            if (i17 != 0) {
                                function4 = function2;
                                function5 = function3;
                                str4 = strB;
                                str5 = str3;
                                z9 = false;
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                            }
                            interfaceC3163l2 = interfaceC3163lP;
                            p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            function6 = function5;
                            function7 = function4;
                            str6 = str5;
                            str7 = str4;
                        } else {
                            interfaceC3163lP.z();
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                            }
                        }
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                        }
                        interfaceC3163l2 = interfaceC3163lP;
                        p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        function6 = function5;
                        function7 = function4;
                        str6 = str5;
                        str7 = str4;
                    } else {
                        interfaceC3163lP.z();
                        function7 = function2;
                        function6 = function3;
                        interfaceC3163l2 = interfaceC3163lP;
                        str7 = strB;
                        str6 = str3;
                        z9 = z8;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new c(onDismiss, function7, function6, title, body, str7, str6, z9, i8, i9));
                    }
                }
                i10 |= 1572864;
                str3 = str2;
                i17 = i9 & 128;
                if (i17 != 0) {
                    i10 |= 12582912;
                } else if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i10 |= i18;
                }
                if ((i10 & 23967451) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    } else {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                    }
                    interfaceC3163l2 = interfaceC3163lP;
                    p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function6 = function5;
                    function7 = function4;
                    str6 = str5;
                    str7 = str4;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    } else {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                    }
                    interfaceC3163l2 = interfaceC3163lP;
                    p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function6 = function5;
                    function7 = function4;
                    str6 = str5;
                    str7 = str4;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new c(onDismiss, function7, function6, title, body, str7, str6, z9, i8, i9));
                }
            }
            i10 |= 384;
            function3 = function1;
            if ((i9 & 8) != 0) {
                i10 |= 3072;
            } else if ((i8 & 7168) == 0) {
                if (interfaceC3163lP.R(title)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i10 |= i13;
            }
            if ((i9 & 16) != 0) {
                i10 |= 24576;
            } else if ((57344 & i8) == 0) {
                if (interfaceC3163lP.R(body)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i10 |= i14;
            }
            if ((458752 & i8) == 0) {
                if ((i9 & 32) == 0) {
                    strB = str;
                    if (interfaceC3163lP.R(strB)) {
                    }
                    i10 |= i20;
                } else {
                    strB = str;
                }
                i10 |= i20;
            } else {
                strB = str;
            }
            i15 = i9 & 64;
            if (i15 != 0) {
                if ((3670016 & i8) == 0) {
                    str3 = str2;
                    if (interfaceC3163lP.R(str3)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i10 |= i16;
                }
                i17 = i9 & 128;
                if (i17 != 0) {
                    i10 |= 12582912;
                } else if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i10 |= i18;
                }
                if ((i10 & 23967451) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    } else {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                    }
                    interfaceC3163l2 = interfaceC3163lP;
                    p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function6 = function5;
                    function7 = function4;
                    str6 = str5;
                    str7 = str4;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    } else {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                    }
                    interfaceC3163l2 = interfaceC3163lP;
                    p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function6 = function5;
                    function7 = function4;
                    str6 = str5;
                    str7 = str4;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new c(onDismiss, function7, function6, title, body, str7, str6, z9, i8, i9));
                }
            }
            i10 |= 1572864;
            str3 = str2;
            i17 = i9 & 128;
            if (i17 != 0) {
                i10 |= 12582912;
            } else if ((i8 & 29360128) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i10 |= i18;
            }
            if ((i10 & 23967451) == 4793490) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                } else {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                }
                interfaceC3163l2 = interfaceC3163lP;
                p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function6 = function5;
                function7 = function4;
                str6 = str5;
                str7 = str4;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                } else {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                }
                interfaceC3163l2 = interfaceC3163lP;
                p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function6 = function5;
                function7 = function4;
                str6 = str5;
                str7 = str4;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new c(onDismiss, function7, function6, title, body, str7, str6, z9, i8, i9));
            }
        }
        i10 |= 48;
        function2 = function0;
        i11 = i9 & 4;
        if (i11 != 0) {
            if ((i8 & 896) == 0) {
                function3 = function1;
                if (interfaceC3163lP.l(function3)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i10 |= i12;
            }
            if ((i9 & 8) != 0) {
                i10 |= 3072;
            } else if ((i8 & 7168) == 0) {
                if (interfaceC3163lP.R(title)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i10 |= i13;
            }
            if ((i9 & 16) != 0) {
                i10 |= 24576;
            } else if ((57344 & i8) == 0) {
                if (interfaceC3163lP.R(body)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i10 |= i14;
            }
            if ((458752 & i8) == 0) {
                if ((i9 & 32) == 0) {
                    strB = str;
                    if (interfaceC3163lP.R(strB)) {
                    }
                    i10 |= i20;
                } else {
                    strB = str;
                }
                i10 |= i20;
            } else {
                strB = str;
            }
            i15 = i9 & 64;
            if (i15 != 0) {
                if ((3670016 & i8) == 0) {
                    str3 = str2;
                    if (interfaceC3163lP.R(str3)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i10 |= i16;
                }
                i17 = i9 & 128;
                if (i17 != 0) {
                    i10 |= 12582912;
                } else if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i10 |= i18;
                }
                if ((i10 & 23967451) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    } else {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                    }
                    interfaceC3163l2 = interfaceC3163lP;
                    p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function6 = function5;
                    function7 = function4;
                    str6 = str5;
                    str7 = str4;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    } else {
                        if (i19 != 0) {
                            function2 = null;
                        }
                        if (i11 != 0) {
                            function3 = null;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = false;
                        } else {
                            function4 = function2;
                            function5 = function3;
                            str4 = strB;
                            str5 = str3;
                            z9 = z8;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                    }
                    interfaceC3163l2 = interfaceC3163lP;
                    p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function6 = function5;
                    function7 = function4;
                    str6 = str5;
                    str7 = str4;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new c(onDismiss, function7, function6, title, body, str7, str6, z9, i8, i9));
                }
            }
            i10 |= 1572864;
            str3 = str2;
            i17 = i9 & 128;
            if (i17 != 0) {
                i10 |= 12582912;
            } else if ((i8 & 29360128) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i10 |= i18;
            }
            if ((i10 & 23967451) == 4793490) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                } else {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                }
                interfaceC3163l2 = interfaceC3163lP;
                p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function6 = function5;
                function7 = function4;
                str6 = str5;
                str7 = str4;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                } else {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                }
                interfaceC3163l2 = interfaceC3163lP;
                p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function6 = function5;
                function7 = function4;
                str6 = str5;
                str7 = str4;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new c(onDismiss, function7, function6, title, body, str7, str6, z9, i8, i9));
            }
        }
        i10 |= 384;
        function3 = function1;
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (interfaceC3163lP.R(title)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        if ((i9 & 16) != 0) {
            i10 |= 24576;
        } else if ((57344 & i8) == 0) {
            if (interfaceC3163lP.R(body)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i10 |= i14;
        }
        if ((458752 & i8) == 0) {
            if ((i9 & 32) == 0) {
                strB = str;
                if (interfaceC3163lP.R(strB)) {
                }
                i10 |= i20;
            } else {
                strB = str;
            }
            i10 |= i20;
        } else {
            strB = str;
        }
        i15 = i9 & 64;
        if (i15 != 0) {
            if ((3670016 & i8) == 0) {
                str3 = str2;
                if (interfaceC3163lP.R(str3)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i10 |= i16;
            }
            i17 = i9 & 128;
            if (i17 != 0) {
                i10 |= 12582912;
            } else if ((i8 & 29360128) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i10 |= i18;
            }
            if ((i10 & 23967451) == 4793490) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                } else {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                }
                interfaceC3163l2 = interfaceC3163lP;
                p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function6 = function5;
                function7 = function4;
                str6 = str5;
                str7 = str4;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                } else {
                    if (i19 != 0) {
                        function2 = null;
                    }
                    if (i11 != 0) {
                        function3 = null;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = false;
                    } else {
                        function4 = function2;
                        function5 = function3;
                        str4 = strB;
                        str5 = str3;
                        z9 = z8;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
                }
                interfaceC3163l2 = interfaceC3163lP;
                p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function6 = function5;
                function7 = function4;
                str6 = str5;
                str7 = str4;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new c(onDismiss, function7, function6, title, body, str7, str6, z9, i8, i9));
            }
        }
        i10 |= 1572864;
        str3 = str2;
        i17 = i9 & 128;
        if (i17 != 0) {
            i10 |= 12582912;
        } else if ((i8 & 29360128) == 0) {
            if (interfaceC3163lP.c(z8)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i10 |= i18;
        }
        if ((i10 & 23967451) == 4793490) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i19 != 0) {
                    function2 = null;
                }
                if (i11 != 0) {
                    function3 = null;
                }
                if ((i9 & 32) != 0) {
                    i10 &= -458753;
                    strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                }
                if (i15 != 0) {
                    str3 = null;
                }
                if (i17 != 0) {
                    function4 = function2;
                    function5 = function3;
                    str4 = strB;
                    str5 = str3;
                    z9 = false;
                } else {
                    function4 = function2;
                    function5 = function3;
                    str4 = strB;
                    str5 = str3;
                    z9 = z8;
                }
            } else {
                if (i19 != 0) {
                    function2 = null;
                }
                if (i11 != 0) {
                    function3 = null;
                }
                if ((i9 & 32) != 0) {
                    i10 &= -458753;
                    strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                }
                if (i15 != 0) {
                    str3 = null;
                }
                if (i17 != 0) {
                    function4 = function2;
                    function5 = function3;
                    str4 = strB;
                    str5 = str3;
                    z9 = false;
                } else {
                    function4 = function2;
                    function5 = function3;
                    str4 = strB;
                    str5 = str3;
                    z9 = z8;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
            }
            interfaceC3163l2 = interfaceC3163lP;
            p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            function6 = function5;
            function7 = function4;
            str6 = str5;
            str7 = str4;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i19 != 0) {
                    function2 = null;
                }
                if (i11 != 0) {
                    function3 = null;
                }
                if ((i9 & 32) != 0) {
                    i10 &= -458753;
                    strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                }
                if (i15 != 0) {
                    str3 = null;
                }
                if (i17 != 0) {
                    function4 = function2;
                    function5 = function3;
                    str4 = strB;
                    str5 = str3;
                    z9 = false;
                } else {
                    function4 = function2;
                    function5 = function3;
                    str4 = strB;
                    str5 = str3;
                    z9 = z8;
                }
            } else {
                if (i19 != 0) {
                    function2 = null;
                }
                if (i11 != 0) {
                    function3 = null;
                }
                if ((i9 & 32) != 0) {
                    i10 &= -458753;
                    strB = p101l1.f.b(R.string.ok, interfaceC3163lP, 6);
                }
                if (i15 != 0) {
                    str3 = null;
                }
                if (i17 != 0) {
                    function4 = function2;
                    function5 = function3;
                    str4 = strB;
                    str5 = str3;
                    z9 = false;
                } else {
                    function4 = function2;
                    function5 = function3;
                    str4 = strB;
                    str5 = str3;
                    z9 = z8;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(507870370, i10, -1, "com.elgato.streamdeck.ui.components.ConfirmationAlert (ConfirmationAlert.kt:50)");
            }
            interfaceC3163l2 = interfaceC3163lP;
            p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, -1759017065, true, new b(onDismiss, title, body, str4, function5, str5, function4, z9)), interfaceC3163l2, 196608, 31);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            function6 = function5;
            function7 = function4;
            str6 = str5;
            str7 = str4;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new c(onDismiss, function7, function6, title, body, str7, str6, z9, i8, i9));
        }
    }
}
