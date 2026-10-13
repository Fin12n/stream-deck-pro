package p115m6;

import C6.G;
import D6.r;
import D6.z;
import G6.d;
import I6.l;
import L7.b;
import Q6.o;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import p017b7.AbstractC1785g;
import p017b7.C1802o0;
import p017b7.I;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.J0;
import p017b7.L;
import p017b7.Z;
import p035d7.g;
import p035d7.j;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f30099a = r.q("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f30100b = j.b(1024, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I f30101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC1815v0 f30102d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f30103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f30104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f30106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f30107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f30108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f30109g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f30110h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f30111i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f30112j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f30113k;

        public a(d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00d2 A[Catch: all -> 0x0040, TryCatch #1 {all -> 0x0040, blocks: (B:6:0x002f, B:25:0x00f3, B:22:0x00d2, B:26:0x00f5, B:28:0x0104, B:13:0x0073, B:15:0x007e, B:16:0x0087, B:18:0x0093, B:20:0x00a4, B:19:0x00a1), top: B:40:0x002f }] */
        /* JADX WARN: Code duplicated, block: B:24:0x00f2 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f0 -> B:25:0x00f3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 293
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: m6.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        I i8 = new I("nonce-generator");
        f30101c = i8;
        f30102d = AbstractC1785g.c(C1802o0.f15975a, Z.b().P1(J0.f15902b).P1(i8), L.LAZY, new a(null));
    }

    public static final void b() {
        f30102d.start();
    }

    public static final SecureRandom c(String str) {
        try {
            return str != null ? SecureRandom.getInstance(str) : new SecureRandom();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static /* synthetic */ SecureRandom d(String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = null;
        }
        return c(str);
    }

    public static final g e() {
        return f30100b;
    }

    public static final SecureRandom f() {
        SecureRandom secureRandomC;
        String property = System.getProperty(OjEsfyJYzbPn.HflVf);
        if (property != null && (secureRandomC = c(property)) != null) {
            return secureRandomC;
        }
        Iterator it = f30099a.iterator();
        while (it.hasNext()) {
            SecureRandom secureRandomC2 = c((String) it.next());
            if (secureRandomC2 != null) {
                return secureRandomC2;
            }
        }
        b.j("io.ktor.util.random").a("None of the " + z.r0(f30099a, ", ", null, null, 0, null, null, 62, null) + " found, fallback to default");
        SecureRandom secureRandomD = d(null, 1, null);
        if (secureRandomD != null) {
            return secureRandomD;
        }
        throw new IllegalStateException("No SecureRandom implementation found");
    }
}
