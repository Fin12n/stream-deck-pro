package p046f0;

import C6.G;
import L0.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.u;
import p038e1.Y;
import p038e1.Z;
import p056g1.AbstractC2345i;
import p056g1.InterfaceC2344h;
import p056g1.c0;
import p056g1.d0;

/* JADX INFO: renamed from: f0.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2294w extends i.c implements InterfaceC2344h, c0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Y.a f21512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21513o;

    /* JADX INFO: renamed from: f0.w$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f21514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2294w f21515b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j8, C2294w c2294w) {
            super(0);
            this.f21514a = j8;
            this.f21515b = c2294w;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m195invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m195invoke() {
            this.f21514a.f28779a = AbstractC2345i.a(this.f21515b, Z.a());
        }
    }

    @Override // p056g1.c0
    public void O0() {
        Y yD2 = d2();
        if (this.f21513o) {
            Y.a aVar = this.f21512n;
            if (aVar != null) {
                aVar.a();
            }
            this.f21512n = yD2 != null ? yD2.b() : null;
        }
    }

    @Override // L0.i.c
    public void P1() {
        Y.a aVar = this.f21512n;
        if (aVar != null) {
            aVar.a();
        }
        this.f21512n = null;
    }

    public final Y d2() {
        J j8 = new J();
        d0.a(this, new a(j8, this));
        return (Y) j8.f28779a;
    }

    public final void e2(boolean z8) {
        if (z8) {
            Y yD2 = d2();
            this.f21512n = yD2 != null ? yD2.b() : null;
        } else {
            Y.a aVar = this.f21512n;
            if (aVar != null) {
                aVar.a();
            }
            this.f21512n = null;
        }
        this.f21513o = z8;
    }
}
