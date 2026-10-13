package p154r3;

import C6.G;
import Q6.k;
import Z.JTT.ryTuoS;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f32423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f32424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f32425c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32426a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m240invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m240invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32427a = new b();

        public b() {
            super(1);
        }

        public final void invoke(String it) {
            t.g(it, "it");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32428a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m241invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m241invoke() {
        }
    }

    public f() {
        this(null, null, null, 7, null);
    }

    public final Function0 a() {
        return this.f32425c;
    }

    public final k b() {
        return this.f32424b;
    }

    public final Function0 c() {
        return this.f32423a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return t.c(this.f32423a, fVar.f32423a) && t.c(this.f32424b, fVar.f32424b) && t.c(this.f32425c, fVar.f32425c);
    }

    public int hashCode() {
        return (((this.f32423a.hashCode() * 31) + this.f32424b.hashCode()) * 31) + this.f32425c.hashCode();
    }

    public f(Function0 onShare, k onOpenUrl, Function0 onClose) {
        t.g(onShare, "onShare");
        t.g(onOpenUrl, "onOpenUrl");
        t.g(onClose, "onClose");
        this.f32423a = onShare;
        this.f32424b = onOpenUrl;
        this.f32425c = onClose;
    }

    public String toString() {
        return "OnboardingScreenContext(onShare=" + this.f32423a + ", onOpenUrl=" + this.f32424b + ryTuoS.SGOVaAwvqJmbWDO + this.f32425c + ")";
    }

    public /* synthetic */ f(Function0 function0, k kVar, Function0 function1, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? a.f32426a : function0, (i8 & 2) != 0 ? b.f32427a : kVar, (i8 & 4) != 0 ? c.f32428a : function1);
    }
}
