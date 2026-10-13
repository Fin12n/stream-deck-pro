package com.google.protobuf;

import R0.pkXL.Oitvkwcwn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f19201b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f19202a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements S {
        @Override // com.google.protobuf.S
        public boolean b(Class cls) {
            return false;
        }

        @Override // com.google.protobuf.S
        public Q a(Class cls) {
            throw new IllegalStateException(Oitvkwcwn.uRbbpyrG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19203a;

        static {
            int[] iArr = new int[i0.values().length];
            f19203a = iArr;
            try {
                iArr[i0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c implements S {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public S[] f19204a;

        public c(S... sArr) {
            this.f19204a = sArr;
        }

        @Override // com.google.protobuf.S
        public Q a(Class cls) {
            for (S s8 : this.f19204a) {
                if (s8.b(cls)) {
                    return s8.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.S
        public boolean b(Class cls) {
            for (S s8 : this.f19204a) {
                if (s8.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public K() {
        this(c());
    }

    public static boolean b(Q q8) {
        return b.f19203a[q8.c().ordinal()] != 1;
    }

    public static S c() {
        return new c(C2113y.c(), d());
    }

    public static S d() {
        try {
            return (S) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f19201b;
        }
    }

    public static n0 e(Class cls, Q q8) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return b(q8) ? W.T(cls, q8, AbstractC2091c0.b(), I.b(), p0.L(), AbstractC2108t.b(), P.b()) : W.T(cls, q8, AbstractC2091c0.b(), I.b(), p0.L(), null, P.b());
        }
        return b(q8) ? W.T(cls, q8, AbstractC2091c0.a(), I.a(), p0.K(), AbstractC2108t.a(), P.a()) : W.T(cls, q8, AbstractC2091c0.a(), I.a(), p0.K(), null, P.a());
    }

    @Override // com.google.protobuf.o0
    public n0 a(Class cls) {
        p0.H(cls);
        Q qA = this.f19202a.a(cls);
        if (qA.a()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? X.m(p0.L(), AbstractC2108t.b(), qA.b()) : X.m(p0.K(), AbstractC2108t.a(), qA.b());
        }
        return e(cls, qA);
    }

    public K(S s8) {
        this.f19202a = (S) A.b(s8, "messageInfoFactory");
    }
}
