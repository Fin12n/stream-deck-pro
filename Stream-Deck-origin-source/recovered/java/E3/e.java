package E3;

import C6.InterfaceC0916e;
import D6.r;
import D6.z;
import com.google.mlkit.common.internal.ckI.WqXA;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p116m7.i;
import p116m7.p;
import q7.AbstractC2872x0;
import q7.C2836f;
import q7.C2874y0;
import q7.I0;
import q7.K;
import q7.N0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@i
public final class e {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f2219h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p116m7.b[] f2220i = {null, null, null, new C2836f(N0.f32043a), null, null, new C2836f(E3.b.a.f2171a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f2227g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ C2874y0 f2229b;

        @Override // p116m7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e deserialize(p7.e decoder) {
            int i8;
            List list;
            String str;
            String str2;
            String str3;
            String str4;
            List list2;
            String str5;
            t.g(decoder, "decoder");
            o7.f descriptor = getDescriptor();
            p7.c cVarB = decoder.b(descriptor);
            p116m7.b[] bVarArr = e.f2220i;
            int i9 = 5;
            int i10 = 4;
            String strF = null;
            if (cVarB.x()) {
                String strF2 = cVarB.f(descriptor, 0);
                N0 n8 = N0.f32043a;
                String str6 = (String) cVarB.z(descriptor, 1, n8, null);
                String strF3 = cVarB.f(descriptor, 2);
                List list3 = (List) cVarB.u(descriptor, 3, bVarArr[3], null);
                String str7 = (String) cVarB.z(descriptor, 4, n8, null);
                String str8 = (String) cVarB.z(descriptor, 5, n8, null);
                list = (List) cVarB.u(descriptor, 6, bVarArr[6], null);
                str2 = strF2;
                str = str8;
                str5 = str7;
                str4 = strF3;
                i8 = 127;
                list2 = list3;
                str3 = str6;
            } else {
                boolean z8 = true;
                int i11 = 0;
                List list4 = null;
                String str9 = null;
                String str10 = null;
                String strF4 = null;
                List list5 = null;
                String str11 = null;
                while (z8) {
                    int iE = cVarB.E(descriptor);
                    switch (iE) {
                        case HTTPClient.NO_STATUS_CODE /* -1 */:
                            z8 = false;
                            i9 = 5;
                            break;
                        case 0:
                            strF = cVarB.f(descriptor, 0);
                            i11 |= 1;
                            i9 = 5;
                            i10 = 4;
                            break;
                        case 1:
                            str10 = (String) cVarB.z(descriptor, 1, N0.f32043a, str10);
                            i11 |= 2;
                            i9 = 5;
                            i10 = 4;
                            break;
                        case 2:
                            strF4 = cVarB.f(descriptor, 2);
                            i11 |= 4;
                            break;
                        case 3:
                            list5 = (List) cVarB.u(descriptor, 3, bVarArr[3], list5);
                            i11 |= 8;
                            break;
                        case 4:
                            str11 = (String) cVarB.z(descriptor, i10, N0.f32043a, str11);
                            i11 |= 16;
                            break;
                        case 5:
                            str9 = (String) cVarB.z(descriptor, i9, N0.f32043a, str9);
                            i11 |= 32;
                            break;
                        case 6:
                            list4 = (List) cVarB.u(descriptor, 6, bVarArr[6], list4);
                            i11 |= 64;
                            break;
                        default:
                            throw new p(iE);
                    }
                }
                i8 = i11;
                list = list4;
                str = str9;
                str2 = strF;
                str3 = str10;
                str4 = strF4;
                list2 = list5;
                str5 = str11;
            }
            cVarB.c(descriptor);
            return new e(i8, str2, str3, str4, list2, str5, str, list, (I0) null);
        }

        @Override // p116m7.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(p7.f encoder, e value) {
            t.g(encoder, "encoder");
            t.g(value, "value");
            o7.f descriptor = getDescriptor();
            p7.d dVarB = encoder.b(descriptor);
            e.i(value, dVarB, descriptor);
            dVarB.c(descriptor);
        }

        @Override // q7.K
        public p116m7.b[] childSerializers() {
            p116m7.b[] bVarArr = e.f2220i;
            N0 n8 = N0.f32043a;
            return new p116m7.b[]{n8, p125n7.a.u(n8), n8, bVarArr[3], p125n7.a.u(n8), p125n7.a.u(n8), bVarArr[6]};
        }

        @Override // p116m7.b, p116m7.k, p116m7.a
        public o7.f getDescriptor() {
            return f2229b;
        }

        @Override // q7.K
        public p116m7.b[] typeParametersSerializers() {
            return K.a.a(this);
        }

        static {
            a aVar = new a();
            f2228a = aVar;
            C2874y0 c2874y0 = new C2874y0("com.elgato.streamdeck.settings.license.OpenSourceProject", aVar, 7);
            c2874y0.l("project", false);
            c2874y0.l(com.amazon.a.a.o.b.f16728c, true);
            c2874y0.l(DiagnosticsEntry.VERSION_KEY, false);
            c2874y0.l(WqXA.buPKDgR, true);
            c2874y0.l("url", false);
            c2874y0.l("year", false);
            c2874y0.l("licenses", false);
            f2229b = c2874y0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final p116m7.b serializer() {
            return a.f2228a;
        }

        public b() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ e(int i8, String str, String str2, String str3, List list, String str4, String str5, List list2, I0 i9) {
        if (117 != (i8 & 117)) {
            AbstractC2872x0.a(i8, 117, a.f2228a.getDescriptor());
        }
        this.f2221a = str;
        if ((i8 & 2) == 0) {
            this.f2222b = null;
        } else {
            this.f2222b = str2;
        }
        this.f2223c = str3;
        if ((i8 & 8) == 0) {
            this.f2224d = r.n();
        } else {
            this.f2224d = list;
        }
        this.f2225e = str4;
        this.f2226f = str5;
        this.f2227g = list2;
    }

    public static final /* synthetic */ void i(e eVar, p7.d dVar, o7.f fVar) {
        p116m7.b[] bVarArr = f2220i;
        dVar.q(fVar, 0, eVar.f2221a);
        if (dVar.G(fVar, 1) || eVar.f2222b != null) {
            dVar.t(fVar, 1, N0.f32043a, eVar.f2222b);
        }
        dVar.q(fVar, 2, eVar.f2223c);
        if (dVar.G(fVar, 3) || !t.c(eVar.f2224d, r.n())) {
            dVar.i(fVar, 3, bVarArr[3], eVar.f2224d);
        }
        N0 n8 = N0.f32043a;
        dVar.t(fVar, 4, n8, eVar.f2225e);
        dVar.t(fVar, 5, n8, eVar.f2226f);
        dVar.i(fVar, 6, bVarArr[6], eVar.f2227g);
    }

    public final List b() {
        return this.f2224d;
    }

    public final E3.b c() {
        return (E3.b) z.i0(this.f2227g);
    }

    public final List d() {
        return this.f2227g;
    }

    public final String e() {
        return this.f2221a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return t.c(this.f2221a, eVar.f2221a) && t.c(this.f2222b, eVar.f2222b) && t.c(this.f2223c, eVar.f2223c) && t.c(this.f2224d, eVar.f2224d) && t.c(this.f2225e, eVar.f2225e) && t.c(this.f2226f, eVar.f2226f) && t.c(this.f2227g, eVar.f2227g);
    }

    public final String f() {
        return this.f2225e;
    }

    public final String g() {
        return this.f2223c;
    }

    public final String h() {
        return this.f2226f;
    }

    public int hashCode() {
        int iHashCode = this.f2221a.hashCode() * 31;
        String str = this.f2222b;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f2223c.hashCode()) * 31) + this.f2224d.hashCode()) * 31;
        String str2 = this.f2225e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2226f;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f2227g.hashCode();
    }

    public String toString() {
        return "OpenSourceProject(name=" + this.f2221a + ", description=" + this.f2222b + ", version=" + this.f2223c + ", developers=" + this.f2224d + ", url=" + this.f2225e + ", year=" + this.f2226f + ", licenses=" + this.f2227g + ")";
    }

    public e(String name, String str, String version, List<String> developers, String str2, String str3, List<E3.b> licenses) {
        t.g(name, "name");
        t.g(version, "version");
        t.g(developers, "developers");
        t.g(licenses, "licenses");
        this.f2221a = name;
        this.f2222b = str;
        this.f2223c = version;
        this.f2224d = developers;
        this.f2225e = str2;
        this.f2226f = str3;
        this.f2227g = licenses;
    }

    public /* synthetic */ e(String str, String str2, String str3, List list, String str4, String str5, List list2, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? null : str2, str3, (i8 & 8) != 0 ? r.n() : list, str4, str5, list2);
    }
}
