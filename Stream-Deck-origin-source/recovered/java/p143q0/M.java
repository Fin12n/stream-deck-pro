package p143q0;

import C6.G;
import D6.C0937q;
import D6.z;
import Q6.k;
import Z0.c;
import Z0.d;
import android.view.KeyEvent;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p159s0.H;
import p159s0.I;
import p159s0.L;
import p176u1.C3018b;
import p176u1.C3025i;
import p176u1.C3029m;
import p176u1.C3032p;
import p176u1.C3035t;
import p176u1.D;
import p176u1.InterfaceC3027k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f31427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f31428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p176u1.M f31429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L f31432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D f31433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f31434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2810j f31435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC2819t f31436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f31437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f31438l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f31440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ M f31441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ F f31442c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31443a = new a();

            public a() {
                super(1);
            }

            public final void b(H h8) {
                h8.A();
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((H) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: q0.M$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0674b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0674b f31444a = new C0674b();

            public C0674b() {
                super(1);
            }

            public final void b(H h8) {
                h8.I();
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((H) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f31445a = new c();

            public c() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3027k invoke(H h8) {
                return new C3025i(p128o1.G.i(h8.u()) - h8.q(), 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f31446a = new d();

            public d() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3027k invoke(H h8) {
                int iL = h8.l();
                if (iL != -1) {
                    return new C3025i(0, iL - p128o1.G.i(h8.u()));
                }
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class e extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f31447a = new e();

            public e() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3027k invoke(H h8) {
                Integer numT = h8.t();
                if (numT == null) {
                    return null;
                }
                return new C3025i(p128o1.G.i(h8.u()) - numT.intValue(), 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class f extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f31448a = new f();

            public f() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3027k invoke(H h8) {
                Integer numM = h8.m();
                if (numM != null) {
                    return new C3025i(0, numM.intValue() - p128o1.G.i(h8.u()));
                }
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class g extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f31449a = new g();

            public g() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3027k invoke(H h8) {
                Integer numI = h8.i();
                if (numI == null) {
                    return null;
                }
                return new C3025i(p128o1.G.i(h8.u()) - numI.intValue(), 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class h extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f31450a = new h();

            public h() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3027k invoke(H h8) {
                Integer numF = h8.f();
                if (numF != null) {
                    return new C3025i(0, numF.intValue() - p128o1.G.i(h8.u()));
                }
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f31451a;

            static {
                int[] iArr = new int[r.values().length];
                try {
                    iArr[r.COPY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r.PASTE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[r.CUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[r.LEFT_CHAR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[r.RIGHT_CHAR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[r.LEFT_WORD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[r.RIGHT_WORD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[r.PREV_PARAGRAPH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[r.NEXT_PARAGRAPH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[r.UP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[r.DOWN.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[r.PAGE_UP.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[r.PAGE_DOWN.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[r.LINE_START.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[r.f31920i.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[r.LINE_LEFT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[r.LINE_RIGHT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[r.HOME.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[r.END.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[r.DELETE_PREV_CHAR.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[r.DELETE_NEXT_CHAR.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[r.DELETE_PREV_WORD.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[r.DELETE_NEXT_WORD.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[r.DELETE_FROM_LINE_START.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[r.DELETE_TO_LINE_END.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[r.NEW_LINE.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[r.TAB.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[r.SELECT_ALL.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[r.f31892B.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[r.SELECT_RIGHT_CHAR.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[r.SELECT_LEFT_WORD.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[r.SELECT_RIGHT_WORD.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[r.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[r.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[r.SELECT_LINE_START.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[r.SELECT_LINE_END.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[r.SELECT_LINE_LEFT.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[r.SELECT_LINE_RIGHT.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[r.SELECT_UP.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[r.SELECT_DOWN.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[r.SELECT_PAGE_UP.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[r.f31897G.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[r.SELECT_HOME.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[r.SELECT_END.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[r.DESELECT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[r.UNDO.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[r.REDO.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[r.CHARACTER_PALETTE.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                f31451a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar, M m8, F f8) {
            super(1);
            this.f31440a = rVar;
            this.f31441b = m8;
            this.f31442c = f8;
        }

        public final void b(H h8) {
            p176u1.M mG;
            p176u1.M mC;
            switch (i.f31451a[this.f31440a.ordinal()]) {
                case 1:
                    this.f31441b.h().n(false);
                    break;
                case 2:
                    this.f31441b.h().P();
                    break;
                case 3:
                    this.f31441b.h().r();
                    break;
                case 4:
                    h8.b(a.f31443a);
                    break;
                case 5:
                    h8.c(C0674b.f31444a);
                    break;
                case 6:
                    h8.B();
                    break;
                case 7:
                    h8.J();
                    break;
                case 8:
                    h8.G();
                    break;
                case 9:
                    h8.D();
                    break;
                case 10:
                    h8.Q();
                    break;
                case 11:
                    h8.z();
                    break;
                case 12:
                    h8.c0();
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    h8.b0();
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    h8.P();
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    h8.M();
                    break;
                case 16:
                    h8.N();
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    h8.O();
                    break;
                case 18:
                    h8.L();
                    break;
                case 19:
                    h8.K();
                    break;
                case 20:
                    List listY = h8.Y(c.f31445a);
                    if (listY != null) {
                        this.f31441b.e(listY);
                    }
                    break;
                case 21:
                    List listY2 = h8.Y(d.f31446a);
                    if (listY2 != null) {
                        this.f31441b.e(listY2);
                    }
                    break;
                case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                    List listY3 = h8.Y(e.f31447a);
                    if (listY3 != null) {
                        this.f31441b.e(listY3);
                    }
                    break;
                case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                    List listY4 = h8.Y(f.f31448a);
                    if (listY4 != null) {
                        this.f31441b.e(listY4);
                    }
                    break;
                case 24:
                    List listY5 = h8.Y(g.f31449a);
                    if (listY5 != null) {
                        this.f31441b.e(listY5);
                    }
                    break;
                case 25:
                    List listY6 = h8.Y(h.f31450a);
                    if (listY6 != null) {
                        this.f31441b.e(listY6);
                    }
                    break;
                case 26:
                    if (!this.f31441b.i()) {
                        this.f31441b.f(new C3018b("\n", 1));
                    } else {
                        this.f31441b.j().j().invoke(C3035t.i(this.f31441b.f31438l));
                    }
                    break;
                case 27:
                    if (!this.f31441b.i()) {
                        this.f31441b.f(new C3018b("\t", 1));
                    } else {
                        this.f31442c.f28775a = false;
                    }
                    break;
                case 28:
                    h8.R();
                    break;
                case 29:
                    ((H) h8.A()).S();
                    break;
                case 30:
                    ((H) h8.I()).S();
                    break;
                case 31:
                    ((H) h8.B()).S();
                    break;
                case 32:
                    ((H) h8.J()).S();
                    break;
                case 33:
                    ((H) h8.G()).S();
                    break;
                case 34:
                    ((H) h8.D()).S();
                    break;
                case 35:
                    ((H) h8.P()).S();
                    break;
                case 36:
                    ((H) h8.M()).S();
                    break;
                case 37:
                    ((H) h8.N()).S();
                    break;
                case 38:
                    ((H) h8.O()).S();
                    break;
                case 39:
                    ((H) h8.Q()).S();
                    break;
                case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
                    ((H) h8.z()).S();
                    break;
                case 41:
                    h8.c0().S();
                    break;
                case 42:
                    h8.b0().S();
                    break;
                case 43:
                    ((H) h8.L()).S();
                    break;
                case 44:
                    ((H) h8.K()).S();
                    break;
                case 45:
                    h8.d();
                    break;
                case 46:
                    b0 b0VarK = this.f31441b.k();
                    if (b0VarK != null) {
                        b0VarK.b(h8.Z());
                    }
                    b0 b0VarK2 = this.f31441b.k();
                    if (b0VarK2 != null && (mG = b0VarK2.g()) != null) {
                        this.f31441b.f31437k.invoke(mG);
                        break;
                    }
                    break;
                case 47:
                    b0 b0VarK3 = this.f31441b.k();
                    if (b0VarK3 != null && (mC = b0VarK3.c()) != null) {
                        this.f31441b.f31437k.invoke(mC);
                        break;
                    }
                    break;
                case 48:
                    AbstractC2818s.b();
                    break;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((H) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ M(V v8, I i8, p176u1.M m8, boolean z8, boolean z9, L l8, D d8, b0 b0Var, C2810j c2810j, InterfaceC2819t interfaceC2819t, k kVar, int i9, AbstractC2633k abstractC2633k) {
        this(v8, i8, m8, z8, z9, l8, d8, b0Var, c2810j, interfaceC2819t, kVar, i9);
    }

    public final void e(List list) {
        C3029m c3029mL = this.f31427a.l();
        List listU0 = z.U0(list);
        listU0.add(0, new C3032p());
        this.f31437k.invoke(c3029mL.b(listU0));
    }

    public final void f(InterfaceC3027k interfaceC3027k) {
        e(C0937q.e(interfaceC3027k));
    }

    public final void g(k kVar) {
        H h8 = new H(this.f31429c, this.f31433g, this.f31427a.h(), this.f31432f);
        kVar.invoke(h8);
        if (p128o1.G.g(h8.u(), this.f31429c.g()) && t.c(h8.e(), this.f31429c.e())) {
            return;
        }
        this.f31437k.invoke(h8.Z());
    }

    public final I h() {
        return this.f31428b;
    }

    public final boolean i() {
        return this.f31431e;
    }

    public final V j() {
        return this.f31427a;
    }

    public final b0 k() {
        return this.f31434h;
    }

    public final boolean l(KeyEvent keyEvent) {
        r rVarA;
        C3018b c3018bM = m(keyEvent);
        if (c3018bM != null) {
            if (!this.f31430d) {
                return false;
            }
            f(c3018bM);
            this.f31432f.b();
            return true;
        }
        if (!c.e(d.b(keyEvent), c.f12836a.a()) || (rVarA = this.f31436j.a(keyEvent)) == null || (rVarA.b() && !this.f31430d)) {
            return false;
        }
        F f8 = new F();
        f8.f28775a = true;
        g(new b(rVarA, this, f8));
        b0 b0Var = this.f31434h;
        if (b0Var != null) {
            b0Var.a();
        }
        return f8.f28775a;
    }

    public final C3018b m(KeyEvent keyEvent) {
        Integer numA;
        if (O.a(keyEvent) && (numA = this.f31435i.a(keyEvent)) != null) {
            return new C3018b(D.a(new StringBuilder(), numA.intValue()).toString(), 1);
        }
        return null;
    }

    public M(V v8, I i8, p176u1.M m8, boolean z8, boolean z9, L l8, D d8, b0 b0Var, C2810j c2810j, InterfaceC2819t interfaceC2819t, k kVar, int i9) {
        this.f31427a = v8;
        this.f31428b = i8;
        this.f31429c = m8;
        this.f31430d = z8;
        this.f31431e = z9;
        this.f31432f = l8;
        this.f31433g = d8;
        this.f31434h = b0Var;
        this.f31435i = c2810j;
        this.f31436j = interfaceC2819t;
        this.f31437k = kVar;
        this.f31438l = i9;
    }

    public /* synthetic */ M(V v8, I i8, p176u1.M m8, boolean z8, boolean z9, L l8, D d8, b0 b0Var, C2810j c2810j, InterfaceC2819t interfaceC2819t, k kVar, int i9, int i10, AbstractC2633k abstractC2633k) {
        this(v8, i8, (i10 & 4) != 0 ? new p176u1.M((String) null, 0L, (p128o1.G) null, 7, (AbstractC2633k) null) : m8, (i10 & 8) != 0 ? true : z8, (i10 & 16) != 0 ? false : z9, l8, (i10 & 64) != 0 ? D.f34350a.a() : d8, (i10 & 128) != 0 ? null : b0Var, c2810j, (i10 & 512) != 0 ? AbstractC2821v.a() : interfaceC2819t, (i10 & 1024) != 0 ? a.f31439a : kVar, i9, null);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31439a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((p176u1.M) obj);
            return G.f1419a;
        }

        public final void b(p176u1.M m8) {
        }
    }
}
