package p170t3;

import A.S;
import C6.G;
import D6.z;
import Q6.k;
import S4.InterfaceC1635f;
import S4.InterfaceC1636g;
import T.c;
import T.d;
import Z2.j;
import Z2.p;
import android.media.Image;
import android.util.Size;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p035d7.g;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i implements S.a, N3.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34252f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f34253g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f34254h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p156r5.b f34255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p156r5.a f34256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f34257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f34258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2260f f34259e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final S a(i qrCodeAnalyzer) {
            t.g(qrCodeAnalyzer, "qrCodeAnalyzer");
            S sC = new S.c().i(new c.a().f(new d(new Size(1280, 720), 3)).a()).c();
            sC.q0(Executors.newSingleThreadExecutor(), qrCodeAnalyzer);
            t.f(sC, "apply(...)");
            return sC;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.core.d f34260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f34261b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.camera.core.d dVar, i iVar) {
            super(1);
            this.f34260a = dVar;
            this.f34261b = iVar;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return G.f1419a;
        }

        public final void invoke(List list) {
            t.d(list);
            p172t5.a aVar = (p172t5.a) z.k0(list);
            if (aVar != null) {
                i iVar = this.f34261b;
                p172t5.a.C0774a c0774aC = aVar.c();
                String strA = c0774aC != null ? c0774aC.a() : null;
                if (aVar.d() == 8 && strA != null) {
                    iVar.f34258d.m(strA);
                }
            }
            this.f34260a.close();
        }
    }

    static {
        j.a aVar = j.f12858c;
        String simpleName = i.class.getSimpleName();
        t.f(simpleName, "getSimpleName(...)");
        f34254h = aVar.d(simpleName);
    }

    public i() {
        p156r5.b bVarA = new r5.b.a().b(256, new int[0]).a();
        t.f(bVarA, "build(...)");
        this.f34255a = bVarA;
        p156r5.a aVarA = p156r5.c.a(bVarA);
        t.f(aVarA, "getClient(...)");
        this.f34256b = aVarA;
        this.f34257c = O.a(Boolean.TRUE);
        g gVarB = p035d7.j.b(0, p035d7.d.DROP_OLDEST, null, 4, null);
        this.f34258d = gVarB;
        this.f34259e = AbstractC2262h.P(gVarB);
    }

    public static final void g(k tmp0, Object obj) {
        t.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void h(androidx.camera.core.d imageProxy, Exception it) {
        t.g(imageProxy, "$imageProxy");
        t.g(it, "it");
        j jVar = f34254h;
        String strC = jVar.c();
        p pVar = p.Error;
        if (jVar.a().a().compareTo(pVar) <= 0) {
            jVar.b(pVar, strC, it, "Can't detect QrCode");
        }
        imageProxy.close();
    }

    @Override // N3.a
    public InterfaceC2260f b() {
        return this.f34259e;
    }

    @Override // A.S.a
    public void c(final androidx.camera.core.d imageProxy) {
        t.g(imageProxy, "imageProxy");
        if (!((Boolean) this.f34257c.getValue()).booleanValue()) {
            imageProxy.close();
            return;
        }
        Image imageX1 = imageProxy.x1();
        if (imageX1 != null) {
            p196w5.a aVarA = p196w5.a.a(imageX1, imageProxy.e1().e());
            t.f(aVarA, "fromMediaImage(...)");
            S4.k kVarU0 = this.f34256b.u0(aVarA);
            final b bVar = new b(imageProxy, this);
            kVarU0.f(new InterfaceC1636g() { // from class: t3.g
                @Override // S4.InterfaceC1636g
                public final void a(Object obj) {
                    i.g(bVar, obj);
                }
            }).d(new InterfaceC1635f() { // from class: t3.h
                @Override // S4.InterfaceC1635f
                public final void d(Exception exc) {
                    i.h(imageProxy, exc);
                }
            });
        }
    }

    @Override // N3.a
    public void start() {
        this.f34257c.setValue(Boolean.TRUE);
    }

    @Override // N3.a
    public void stop() {
        this.f34257c.setValue(Boolean.FALSE);
    }
}
