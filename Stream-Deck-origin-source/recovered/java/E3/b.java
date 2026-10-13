package E3;

import C6.InterfaceC0916e;
import Z6.v;
import Z6.w;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p116m7.i;
import p116m7.p;
import p180u5.FCkZ.BpgIURjN;
import q7.AbstractC2872x0;
import q7.C2874y0;
import q7.I0;
import q7.K;
import q7.N0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@i
public final class b {
    public static final C0097b Companion = new C0097b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2170c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ C2874y0 f2172b;

        static {
            a aVar = new a();
            f2171a = aVar;
            C2874y0 c2874y0 = new C2874y0("com.elgato.streamdeck.settings.license.License", aVar, 3);
            c2874y0.l("license", false);
            c2874y0.l("license_url", false);
            c2874y0.l("cleanUrl", true);
            f2172b = c2874y0;
        }

        @Override // p116m7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b deserialize(p7.e decoder) {
            String strF;
            String strF2;
            String str;
            int i8;
            t.g(decoder, "decoder");
            o7.f descriptor = getDescriptor();
            p7.c cVarB = decoder.b(descriptor);
            if (cVarB.x()) {
                strF = cVarB.f(descriptor, 0);
                String strF3 = cVarB.f(descriptor, 1);
                strF2 = cVarB.f(descriptor, 2);
                str = strF3;
                i8 = 7;
            } else {
                strF = null;
                String strF4 = null;
                String strF5 = null;
                boolean z8 = true;
                int i9 = 0;
                while (z8) {
                    int iE = cVarB.E(descriptor);
                    if (iE == -1) {
                        z8 = false;
                    } else if (iE == 0) {
                        strF = cVarB.f(descriptor, 0);
                        i9 |= 1;
                    } else if (iE == 1) {
                        strF5 = cVarB.f(descriptor, 1);
                        i9 |= 2;
                    } else {
                        if (iE != 2) {
                            throw new p(iE);
                        }
                        strF4 = cVarB.f(descriptor, 2);
                        i9 |= 4;
                    }
                }
                strF2 = strF4;
                str = strF5;
                i8 = i9;
            }
            String str2 = strF;
            cVarB.c(descriptor);
            return new b(i8, str2, str, strF2, null);
        }

        @Override // q7.K
        public p116m7.b[] childSerializers() {
            N0 n8 = N0.f32043a;
            return new p116m7.b[]{n8, n8, n8};
        }

        @Override // p116m7.b, p116m7.k, p116m7.a
        public o7.f getDescriptor() {
            return f2172b;
        }

        @Override // q7.K
        public p116m7.b[] typeParametersSerializers() {
            return K.a.a(this);
        }

        @Override // p116m7.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(p7.f fVar, b value) {
            t.g(fVar, BpgIURjN.fjtdfGKFWrgkF);
            t.g(value, "value");
            o7.f descriptor = getDescriptor();
            p7.d dVarB = fVar.b(descriptor);
            b.c(value, dVarB, descriptor);
            dVarB.c(descriptor);
        }
    }

    /* JADX INFO: renamed from: E3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0097b {
        public /* synthetic */ C0097b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final p116m7.b serializer() {
            return a.f2171a;
        }

        public C0097b() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ b(int i8, String str, String str2, String str3, I0 i9) {
        if (3 != (i8 & 3)) {
            AbstractC2872x0.a(i8, 3, a.f2171a.getDescriptor());
        }
        this.f2168a = str;
        this.f2169b = str2;
        if ((i8 & 4) == 0) {
            this.f2170c = v.D(w.W0(str2).toString(), "http:", "https:", false, 4, null);
        } else {
            this.f2170c = str3;
        }
    }

    public static final /* synthetic */ void c(b bVar, p7.d dVar, o7.f fVar) {
        dVar.q(fVar, 0, bVar.f2168a);
        dVar.q(fVar, 1, bVar.f2169b);
        if (!dVar.G(fVar, 2) && t.c(bVar.f2170c, v.D(w.W0(bVar.f2169b).toString(), "http:", "https:", false, 4, null))) {
            return;
        }
        dVar.q(fVar, 2, bVar.f2170c);
    }

    public final String a() {
        return this.f2170c;
    }

    public final String b() {
        return this.f2168a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.c(this.f2168a, bVar.f2168a) && t.c(this.f2169b, bVar.f2169b);
    }

    public int hashCode() {
        return (this.f2168a.hashCode() * 31) + this.f2169b.hashCode();
    }

    public String toString() {
        return "License(name=" + this.f2168a + ", licenseUrl=" + this.f2169b + ")";
    }

    public b(String name, String licenseUrl) {
        t.g(name, "name");
        t.g(licenseUrl, "licenseUrl");
        this.f2168a = name;
        this.f2169b = licenseUrl;
        this.f2170c = v.D(w.W0(licenseUrl).toString(), "http:", "https:", false, 4, null);
    }
}
