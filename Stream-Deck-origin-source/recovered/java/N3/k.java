package N3;

import C6.InterfaceC0916e;
import E4.JFpq.XRlnZWSrAFn;
import M6.eLZq.eGwOBWCdOTaKus;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import q7.AbstractC2872x0;
import q7.C2836f;
import q7.C2874y0;
import q7.I0;
import q7.K;
import q7.N0;
import q7.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@p116m7.i
public final class k {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p116m7.b[] f6068d = {null, null, new C2836f(N0.f32043a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6071c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ C2874y0 f6073b;

        @Override // p116m7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k deserialize(p7.e decoder) {
            int i8;
            int i9;
            String str;
            List list;
            t.g(decoder, "decoder");
            o7.f descriptor = getDescriptor();
            p7.c cVarB = decoder.b(descriptor);
            p116m7.b[] bVarArr = k.f6068d;
            if (cVarB.x()) {
                String strF = cVarB.f(descriptor, 0);
                int iN = cVarB.n(descriptor, 1);
                list = (List) cVarB.u(descriptor, 2, bVarArr[2], null);
                str = strF;
                i8 = 7;
                i9 = iN;
            } else {
                boolean z8 = true;
                int i10 = 0;
                String strF2 = null;
                List list2 = null;
                int iN2 = 0;
                while (z8) {
                    int iE = cVarB.E(descriptor);
                    if (iE == -1) {
                        z8 = false;
                    } else if (iE == 0) {
                        strF2 = cVarB.f(descriptor, 0);
                        i10 |= 1;
                    } else if (iE == 1) {
                        iN2 = cVarB.n(descriptor, 1);
                        i10 |= 2;
                    } else {
                        if (iE != 2) {
                            throw new p116m7.p(iE);
                        }
                        list2 = (List) cVarB.u(descriptor, 2, bVarArr[2], list2);
                        i10 |= 4;
                    }
                }
                i8 = i10;
                i9 = iN2;
                str = strF2;
                list = list2;
            }
            cVarB.c(descriptor);
            return new k(i8, str, i9, list, null);
        }

        @Override // p116m7.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(p7.f encoder, k value) {
            t.g(encoder, "encoder");
            t.g(value, "value");
            o7.f descriptor = getDescriptor();
            p7.d dVarB = encoder.b(descriptor);
            k.e(value, dVarB, descriptor);
            dVarB.c(descriptor);
        }

        @Override // q7.K
        public p116m7.b[] childSerializers() {
            return new p116m7.b[]{N0.f32043a, U.f32069a, k.f6068d[2]};
        }

        @Override // p116m7.b, p116m7.k, p116m7.a
        public o7.f getDescriptor() {
            return f6073b;
        }

        @Override // q7.K
        public p116m7.b[] typeParametersSerializers() {
            return K.a.a(this);
        }

        static {
            a aVar = new a();
            f6072a = aVar;
            C2874y0 c2874y0 = new C2874y0("com.elgato.streamdeck.vsd2.discovery.ElgatoDiscoveryHost", aVar, 3);
            c2874y0.l(XRlnZWSrAFn.MSpwd, false);
            c2874y0.l("port", false);
            c2874y0.l("ip_addresses", false);
            f6073b = c2874y0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final p116m7.b serializer() {
            return a.f6072a;
        }

        public b() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ k(int i8, String str, int i9, List list, I0 i10) {
        if (7 != (i8 & 7)) {
            AbstractC2872x0.a(i8, 7, a.f6072a.getDescriptor());
        }
        this.f6069a = str;
        this.f6070b = i9;
        this.f6071c = list;
    }

    public static final /* synthetic */ void e(k kVar, p7.d dVar, o7.f fVar) {
        p116m7.b[] bVarArr = f6068d;
        dVar.q(fVar, 0, kVar.f6069a);
        dVar.u(fVar, 1, kVar.f6070b);
        dVar.i(fVar, 2, bVarArr[2], kVar.f6071c);
    }

    public final String b() {
        return this.f6069a;
    }

    public final List c() {
        return this.f6071c;
    }

    public final int d() {
        return this.f6070b;
    }

    public k(String identifier, int i8, List<String> list) {
        t.g(identifier, "identifier");
        t.g(list, eGwOBWCdOTaKus.LVTEuT);
        this.f6069a = identifier;
        this.f6070b = i8;
        this.f6071c = list;
    }
}
