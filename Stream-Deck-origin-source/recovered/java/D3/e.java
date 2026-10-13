package D3;

import C6.G;
import C6.r;
import D6.C0937q;
import D6.z;
import Q6.k;
import com.elgato.streamdeck.vsd2.KnownHost;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.H;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T3.a f1886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f1887b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f1888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D3.b f1889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f1891d;

        public a(List<? extends D3.b> layouts, D3.b selected, int i8, int i9) {
            t.g(layouts, "layouts");
            t.g(selected, "selected");
            this.f1888a = layouts;
            this.f1889b = selected;
            this.f1890c = i8;
            this.f1891d = i9;
        }

        public final int a() {
            return this.f1890c;
        }

        public final int b() {
            return this.f1891d;
        }

        public final List c() {
            return this.f1888a;
        }

        public final D3.b d() {
            return this.f1889b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.c(this.f1888a, aVar.f1888a) && t.c(this.f1889b, aVar.f1889b) && this.f1890c == aVar.f1890c && this.f1891d == aVar.f1891d;
        }

        public int hashCode() {
            return (((((this.f1888a.hashCode() * 31) + this.f1889b.hashCode()) * 31) + Integer.hashCode(this.f1890c)) * 31) + Integer.hashCode(this.f1891d);
        }

        public String toString() {
            return "ViewState(layouts=" + this.f1888a + ", selected=" + this.f1889b + ", customColumns=" + this.f1890c + ", customRows=" + this.f1891d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D3.b f1892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D3.b bVar) {
            super(1);
            this.f1892a = bVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KnownHost.Device.Builder invoke(KnownHost.Device.Builder builder) {
            t.g(builder, "builder");
            builder.setKeypadColumns(this.f1892a.b()).setKeypadRows(this.f1892a.d()).setIsCustomLayout(this.f1892a instanceof D3.b.c);
            D3.b bVar = this.f1892a;
            if (bVar instanceof D3.b.c) {
                builder.setLastCustomKeypadColumns(bVar.b()).setLastCustomKeypadRows(this.f1892a.d());
            }
            return builder;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f1893a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f1894a;

            /* JADX INFO: renamed from: D3.e$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0081a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f1895a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f1896b;

                public C0081a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f1895a = obj;
                    this.f1896b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f1894a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0081a c0081a;
                if (dVar instanceof C0081a) {
                    c0081a = (C0081a) dVar;
                    int i8 = c0081a.f1896b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0081a.f1896b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0081a = new C0081a(dVar);
                    }
                } else {
                    c0081a = new C0081a(dVar);
                }
                Object obj2 = c0081a.f1895a;
                Object objF = H6.c.f();
                int i9 = c0081a.f1896b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f1894a;
                    KnownHost.Device deviceA = ((T3.a.C0274a) obj).a();
                    c0081a.f1896b = 1;
                    if (interfaceC2261g.emit(deviceA, c0081a) == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException(QhsKALGiniuQ.DYhMhtx);
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public c(InterfaceC2260f interfaceC2260f) {
            this.f1893a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f1893a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f1898a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f1899a;

            /* JADX INFO: renamed from: D3.e$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0082a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f1900a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f1901b;

                public C0082a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f1900a = obj;
                    this.f1901b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f1899a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0082a c0082a;
                if (dVar instanceof C0082a) {
                    c0082a = (C0082a) dVar;
                    int i8 = c0082a.f1901b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0082a.f1901b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0082a = new C0082a(dVar);
                    }
                } else {
                    c0082a = new C0082a(dVar);
                }
                Object obj2 = c0082a.f1900a;
                Object objF = H6.c.f();
                int i9 = c0082a.f1901b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f1899a;
                    KnownHost.Device device = (KnownHost.Device) obj;
                    D3.b.C0071b c0071b = D3.b.f1837d;
                    a aVar = new a(z.B0(c0071b.b(), C0937q.e(new D3.b.c(device.getLastCustomKeypadColumns(), device.getLastCustomKeypadRows()))), c0071b.a(device.getKeypadColumns(), device.getKeypadRows(), !device.getIsCustomLayout()), device.getLastCustomKeypadColumns(), device.getLastCustomKeypadRows());
                    c0082a.f1901b = 1;
                    if (interfaceC2261g.emit(aVar, c0082a) == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public d(InterfaceC2260f interfaceC2260f) {
            this.f1898a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f1898a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    public e(T3.a deviceSettingsEditor, J coroutineScope) {
        t.g(deviceSettingsEditor, "deviceSettingsEditor");
        t.g(coroutineScope, "coroutineScope");
        this.f1886a = deviceSettingsEditor;
        this.f1887b = AbstractC2262h.T(new d(new c(deviceSettingsEditor.e())), coroutineScope, H.a.b(H.f20929a, 0L, 0L, 3, null), new a(D6.r.n(), new D3.b.a(), 0, 0));
    }

    public final T3.a a() {
        return this.f1886a;
    }

    public final M b() {
        return this.f1887b;
    }

    public final void c(D3.b layout) {
        t.g(layout, "layout");
        this.f1886a.k(new b(layout));
    }
}
