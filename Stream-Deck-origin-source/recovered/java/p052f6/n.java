package p052f6;

import C6.m;
import C6.r;
import io.ktor.utils.io.g;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import p070h6.i;
import p205x6.j;
import p205x6.k;
import p205x6.o;
import p205x6.q;
import p205x6.u;
import p205x6.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22101a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.NamedCurve.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.ExplicitPrime.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.ExplicitChar.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22101a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f22104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22105d;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22104c = obj;
            this.f22105d |= Integer.MIN_VALUE;
            return n.d(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f22108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f22109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22110e;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22109d = obj;
            this.f22110e |= Integer.MIN_VALUE;
            return n.g(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22113c;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22112b = obj;
            this.f22113c |= Integer.MIN_VALUE;
            return n.j(null, this);
        }
    }

    public static final p070h6.c b(k kVar) throws A {
        t.g(kVar, "<this>");
        int i8 = a.f22101a[q.f22122b.a(kVar.readByte() & 255).ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                throw new IllegalStateException("ExplicitPrime server key exchange type is not yet supported");
            }
            if (i8 != 3) {
                throw new m();
            }
            throw new IllegalStateException("ExplicitChar server key exchange type is not yet supported");
        }
        p070h6.c cVarA = p070h6.c.f24497c.a(q.e(kVar));
        if (cVarA != null) {
            return cVarA;
        }
        throw new A("Unknown EC id", null, 2, null);
    }

    public static final ECPoint c(k kVar, int i8) throws A {
        t.g(kVar, "<this>");
        int i9 = kVar.readByte() & 255;
        if (kVar.readByte() != 4) {
            throw new A("Point should be uncompressed", null, 2, null);
        }
        int i10 = (i9 - 1) / 2;
        if (((i8 + 7) >>> 3) == i10) {
            return new ECPoint(new BigInteger(1, y.b(kVar, i10)), new BigInteger(1, y.b(kVar, i10)));
        }
        throw new A("Invalid point component length", null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(g gVar, G6.d dVar) {
        b bVar;
        int i8;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i9 = bVar.f22105d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.f22105d = i9 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objP = bVar.f22104c;
        Object objF = H6.c.f();
        int i10 = bVar.f22105d;
        if (i10 == 0) {
            r.b(objP);
            bVar.f22102a = gVar;
            bVar.f22105d = 1;
            objP = gVar.p(bVar);
            if (objP != objF) {
            }
            return objF;
        }
        if (i10 == 1) {
            gVar = (g) bVar.f22102a;
            r.b(objP);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = bVar.f22103b;
            r.b(objP);
        }
        return I6.b.d((i8 << 8) + (((Number) objP).byteValue() & 255));
        int iByteValue = ((Number) objP).byteValue() & 255;
        bVar.f22102a = null;
        bVar.f22103b = iByteValue;
        bVar.f22105d = 2;
        Object objP2 = gVar.p(bVar);
        if (objP2 != objF) {
            objP = objP2;
            i8 = iByteValue;
            return I6.b.d((i8 << 8) + (((Number) objP).byteValue() & 255));
        }
        return objF;
    }

    public static final List e(k kVar) throws CertificateException, A {
        t.g(kVar, "<this>");
        int iK = k(kVar);
        ArrayList arrayList = new ArrayList();
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        t.d(certificateFactory);
        int i8 = 0;
        while (i8 < iK) {
            int iK2 = k(kVar);
            if (iK2 > iK - i8) {
                throw new A("Certificate length is too big", null, 2, null);
            }
            if (iK2 > kVar.o1()) {
                throw new A("Certificate length is too big", null, 2, null);
            }
            byte[] bArr = new byte[iK2];
            k kVar2 = kVar;
            o.c(kVar2, bArr, 0, 0, 6, null);
            i8 += iK2 + 3;
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArr)));
            kVar = kVar2;
        }
        return arrayList;
    }

    public static final B f(k kVar) {
        t.g(kVar, "<this>");
        B b8 = new B();
        int iA = q.a(kVar);
        b8.d(C.f21964b.a(iA >>> 24));
        int i8 = iA & 16777215;
        j jVar = new j(null, 1, null);
        try {
            u.d(jVar, y.b(kVar, i8), 0, 0, 6, null);
            b8.c(jVar.M1());
            return b8;
        } catch (Throwable th) {
            jVar.T0();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00d7, please report this as an issue */
    public static final Object g(g gVar, G6.d dVar) throws A {
        c cVar;
        g gVar2;
        E.a aVar;
        E eA;
        H h8;
        Object objD;
        E e8;
        H h9;
        g gVar3;
        int iIntValue;
        E e9;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f22110e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f22110e = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objJ = cVar.f22109d;
        Object objF = H6.c.f();
        int i9 = cVar.f22110e;
        if (i9 == 0) {
            r.b(objJ);
            E.a aVar2 = E.f21981b;
            cVar.f22106a = gVar;
            cVar.f22107b = aVar2;
            cVar.f22110e = 1;
            Object objP = gVar.p(cVar);
            if (objP != objF) {
                gVar2 = gVar;
                aVar = aVar2;
                objJ = objP;
            }
            return objF;
        }
        if (i9 == 1) {
            aVar = (E.a) cVar.f22107b;
            gVar2 = (g) cVar.f22106a;
            r.b(objJ);
        } else {
            if (i9 == 2) {
                eA = (E) cVar.f22107b;
                gVar2 = (g) cVar.f22106a;
                r.b(objJ);
                h8 = (H) objJ;
                cVar.f22106a = gVar2;
                cVar.f22107b = eA;
                cVar.f22108c = h8;
                cVar.f22110e = 3;
                objD = d(gVar2, cVar);
                if (objD != objF) {
                    g gVar4 = gVar2;
                    e8 = eA;
                    h9 = h8;
                    objJ = objD;
                    gVar3 = gVar4;
                    iIntValue = ((Number) objJ).intValue() & 65535;
                    if (iIntValue > 18432) {
                        throw new A("Illegal TLS frame size: " + iIntValue, null, 2, null);
                    }
                    cVar.f22106a = e8;
                    cVar.f22107b = h9;
                    cVar.f22108c = null;
                    cVar.f22110e = 4;
                    objJ = gVar3.q(iIntValue, cVar);
                    if (objJ != objF) {
                        e9 = e8;
                    }
                }
                return objF;
            }
            if (i9 == 3) {
                h9 = (H) cVar.f22108c;
                e8 = (E) cVar.f22107b;
                gVar3 = (g) cVar.f22106a;
                r.b(objJ);
                iIntValue = ((Number) objJ).intValue() & 65535;
                if (iIntValue > 18432) {
                    throw new A("Illegal TLS frame size: " + iIntValue, null, 2, null);
                }
                cVar.f22106a = e8;
                cVar.f22107b = h9;
                cVar.f22108c = null;
                cVar.f22110e = 4;
                objJ = gVar3.q(iIntValue, cVar);
                if (objJ != objF) {
                    e9 = e8;
                }
                return objF;
            }
            if (i9 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9 = (H) cVar.f22107b;
            e9 = (E) cVar.f22106a;
            r.b(objJ);
        }
        return new D(e9, h9, (k) objJ);
        eA = aVar.a(((Number) objJ).byteValue() & 255);
        cVar.f22106a = gVar2;
        cVar.f22107b = eA;
        cVar.f22110e = 2;
        objJ = j(gVar2, cVar);
        if (objJ != objF) {
            h8 = (H) objJ;
            cVar.f22106a = gVar2;
            cVar.f22107b = eA;
            cVar.f22108c = h8;
            cVar.f22110e = 3;
            objD = d(gVar2, cVar);
            if (objD != objF) {
                g gVar5 = gVar2;
                e8 = eA;
                h9 = h8;
                objJ = objD;
                gVar3 = gVar5;
                iIntValue = ((Number) objJ).intValue() & 65535;
                if (iIntValue > 18432) {
                    throw new A("Illegal TLS frame size: " + iIntValue, null, 2, null);
                }
                cVar.f22106a = e8;
                cVar.f22107b = h9;
                cVar.f22108c = null;
                cVar.f22110e = 4;
                objJ = gVar3.q(iIntValue, cVar);
                if (objJ != objF) {
                    e9 = e8;
                    return new D(e9, h9, (k) objJ);
                }
            }
        }
        return objF;
    }

    public static final F h(k kVar) throws A {
        t.g(kVar, "<this>");
        H hI = i(kVar);
        byte[] bArr = new byte[32];
        o.c(kVar, bArr, 0, 0, 6, null);
        int i8 = kVar.readByte() & 255;
        if (i8 > 32) {
            throw new A("sessionId length limit of 32 bytes exceeded: " + i8 + " specified", null, 2, null);
        }
        byte[] bArr2 = new byte[32];
        o.b(kVar, bArr2, 0, i8);
        short sE = q.e(kVar);
        short s8 = (short) (kVar.readByte() & 255);
        if (s8 != 0) {
            throw new A("Unsupported TLS compression method " + ((int) s8) + " (only null 0 compression method is supported)", null, 2, null);
        }
        if (((int) kVar.o1()) == 0) {
            return new F(hI, bArr, bArr2, sE, s8, null, 32, null);
        }
        int iE = q.e(kVar) & 65535;
        if (((int) kVar.o1()) != iE) {
            throw new A("Invalid extensions size: requested " + iE + ", available " + kVar.o1(), null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        while (kVar.o1() > 0) {
            int iE2 = q.e(kVar) & 65535;
            int iE3 = q.e(kVar) & 65535;
            p070h6.j jVarA = p070h6.j.f24543b.a(iE2);
            j jVar = new j(null, 1, null);
            try {
                u.d(jVar, y.b(kVar, iE3), 0, 0, 6, null);
                arrayList.add(new i(jVarA, iE3, jVar.M1()));
            } catch (Throwable th) {
                jVar.T0();
                throw th;
            }
        }
        return new F(hI, bArr, bArr2, sE, s8, arrayList);
    }

    public static final H i(k kVar) {
        return H.f22022b.a(q.e(kVar) & 65535);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(g gVar, G6.d dVar) {
        d dVar2;
        H.a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f22113c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f22113c = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f22112b;
        Object objF = H6.c.f();
        int i9 = dVar2.f22113c;
        if (i9 == 0) {
            r.b(obj);
            H.a aVar2 = H.f22022b;
            dVar2.f22111a = aVar2;
            dVar2.f22113c = 1;
            Object objD = d(gVar, dVar2);
            if (objD == objF) {
                return objF;
            }
            obj = objD;
            aVar = aVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (H.a) dVar2.f22111a;
            r.b(obj);
        }
        return aVar.a(((Number) obj).intValue() & 65535);
    }

    public static final int k(k kVar) {
        t.g(kVar, "<this>");
        return (q.e(kVar) & 65535) | ((kVar.readByte() & 255) << 16);
    }
}
