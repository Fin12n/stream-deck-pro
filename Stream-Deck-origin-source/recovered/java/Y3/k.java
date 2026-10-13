package Y3;

import C6.InterfaceC0916e;
import C6.o;
import C6.v;
import D6.L;
import D6.M;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p116m7.p;
import p211y4.vJ.RaiWHuj;
import q7.AbstractC2872x0;
import q7.C2837f0;
import q7.C2874y0;
import q7.I0;
import q7.K;
import q7.N0;
import q7.Z;
import r7.w;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@p116m7.i
public final class k {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p116m7.b[] f12415e = {null, new Z(N0.f32043a, X3.j.f11726a), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f12417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12419d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ C2874y0 f12421b;

        static {
            a aVar = new a();
            f12420a = aVar;
            C2874y0 c2874y0 = new C2874y0("com.elgato.telemetry.datamaster.StoredEvent", aVar, 4);
            c2874y0.l("eventName", false);
            c2874y0.l(DiagnosticsEntry.PROPERTIES_KEY, false);
            c2874y0.l("timestampMs", true);
            c2874y0.l("insertId", true);
            f12421b = c2874y0;
        }

        @Override // p116m7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k deserialize(p7.e decoder) {
            int i8;
            String str;
            long j8;
            Map map;
            String strF;
            t.g(decoder, "decoder");
            o7.f descriptor = getDescriptor();
            p7.c cVarB = decoder.b(descriptor);
            p116m7.b[] bVarArr = k.f12415e;
            String strF2 = null;
            if (cVarB.x()) {
                String strF3 = cVarB.f(descriptor, 0);
                Map map2 = (Map) cVarB.u(descriptor, 1, bVarArr[1], null);
                long jD = cVarB.D(descriptor, 2);
                map = map2;
                str = strF3;
                strF = cVarB.f(descriptor, 3);
                j8 = jD;
                i8 = 15;
            } else {
                long jD2 = 0;
                boolean z8 = true;
                int i9 = 0;
                Map map3 = null;
                String strF4 = null;
                while (z8) {
                    int iE = cVarB.E(descriptor);
                    if (iE == -1) {
                        z8 = false;
                    } else if (iE == 0) {
                        strF2 = cVarB.f(descriptor, 0);
                        i9 |= 1;
                    } else if (iE == 1) {
                        map3 = (Map) cVarB.u(descriptor, 1, bVarArr[1], map3);
                        i9 |= 2;
                    } else if (iE == 2) {
                        jD2 = cVarB.D(descriptor, 2);
                        i9 |= 4;
                    } else {
                        if (iE != 3) {
                            throw new p(iE);
                        }
                        strF4 = cVarB.f(descriptor, 3);
                        i9 |= 8;
                    }
                }
                i8 = i9;
                str = strF2;
                j8 = jD2;
                map = map3;
                strF = strF4;
            }
            cVarB.c(descriptor);
            return new k(i8, str, map, j8, strF, (I0) null);
        }

        @Override // p116m7.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(p7.f encoder, k value) {
            t.g(encoder, "encoder");
            t.g(value, "value");
            o7.f descriptor = getDescriptor();
            p7.d dVarB = encoder.b(descriptor);
            k.g(value, dVarB, descriptor);
            dVarB.c(descriptor);
        }

        @Override // q7.K
        public p116m7.b[] childSerializers() {
            p116m7.b bVar = k.f12415e[1];
            N0 n8 = N0.f32043a;
            return new p116m7.b[]{n8, bVar, C2837f0.f32101a, n8};
        }

        @Override // p116m7.b, p116m7.k, p116m7.a
        public o7.f getDescriptor() {
            return f12421b;
        }

        @Override // q7.K
        public p116m7.b[] typeParametersSerializers() {
            return K.a.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final p116m7.b serializer() {
            return a.f12420a;
        }

        public b() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ k(int i8, String str, Map map, long j8, String str2, I0 i9) {
        if (3 != (i8 & 3)) {
            AbstractC2872x0.a(i8, 3, a.f12420a.getDescriptor());
        }
        this.f12416a = str;
        this.f12417b = map;
        if ((i8 & 4) == 0) {
            this.f12418c = System.currentTimeMillis();
        } else {
            this.f12418c = j8;
        }
        if ((i8 & 8) != 0) {
            this.f12419d = str2;
            return;
        }
        String string = UUID.randomUUID().toString();
        t.f(string, "toString(...)");
        this.f12419d = string;
    }

    public static final /* synthetic */ void g(k kVar, p7.d dVar, o7.f fVar) {
        p116m7.b[] bVarArr = f12415e;
        dVar.q(fVar, 0, kVar.f12416a);
        dVar.i(fVar, 1, bVarArr[1], kVar.f12417b);
        if (dVar.G(fVar, 2) || kVar.f12418c != System.currentTimeMillis()) {
            dVar.C(fVar, 2, kVar.f12418c);
        }
        if (!dVar.G(fVar, 3)) {
            String str = kVar.f12419d;
            String string = UUID.randomUUID().toString();
            t.f(string, "toString(...)");
            if (t.c(str, string)) {
                return;
            }
        }
        dVar.q(fVar, 3, kVar.f12419d);
    }

    public final String b() {
        return this.f12416a;
    }

    public final String c() {
        return this.f12419d;
    }

    public final Map d() {
        return this.f12417b;
    }

    public final long e() {
        return this.f12418c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return t.c(this.f12416a, kVar.f12416a) && t.c(this.f12417b, kVar.f12417b) && this.f12418c == kVar.f12418c && t.c(this.f12419d, kVar.f12419d);
    }

    public final r7.j f() {
        o oVarA = v.a("event", r7.k.c(this.f12416a));
        Map map = this.f12417b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((X3.i) entry.getValue()).b());
        }
        return new w(M.j(oVarA, v.a(DiagnosticsEntry.PROPERTIES_KEY, new w(linkedHashMap))));
    }

    public int hashCode() {
        return (((((this.f12416a.hashCode() * 31) + this.f12417b.hashCode()) * 31) + Long.hashCode(this.f12418c)) * 31) + this.f12419d.hashCode();
    }

    public String toString() {
        return "StoredEvent(eventName=" + this.f12416a + ", properties=" + this.f12417b + RaiWHuj.ZzZhFAAw + this.f12418c + ", insertId=" + this.f12419d + ")";
    }

    public k(String eventName, Map<String, ? extends X3.i> properties, long j8, String insertId) {
        t.g(eventName, "eventName");
        t.g(properties, "properties");
        t.g(insertId, "insertId");
        this.f12416a = eventName;
        this.f12417b = properties;
        this.f12418c = j8;
        this.f12419d = insertId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(String str, Map map, long j8, String str2, int i8, AbstractC2633k abstractC2633k) {
        long jCurrentTimeMillis = (i8 & 4) != 0 ? System.currentTimeMillis() : j8;
        if ((i8 & 8) != 0) {
            str2 = UUID.randomUUID().toString();
            t.f(str2, "toString(...)");
        }
        this(str, map, jCurrentTimeMillis, str2);
    }
}
