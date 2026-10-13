package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2088b implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2106q f19264a = C2106q.b();

    public final T c(T t8) throws B {
        if (t8 == null || t8.isInitialized()) {
            return t8;
        }
        throw d(t8).a().k(t8);
    }

    public final u0 d(T t8) {
        return t8 instanceof AbstractC2086a ? ((AbstractC2086a) t8).newUninitializedMessageException() : new u0(t8);
    }

    @Override // com.google.protobuf.g0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public T a(AbstractC2097h abstractC2097h, C2106q c2106q) {
        return c(f(abstractC2097h, c2106q));
    }

    public T f(AbstractC2097h abstractC2097h, C2106q c2106q) throws B {
        AbstractC2098i abstractC2098iL = abstractC2097h.L();
        T t8 = (T) b(abstractC2098iL, c2106q);
        try {
            abstractC2098iL.a(0);
            return t8;
        } catch (B e8) {
            throw e8.k(t8);
        }
    }
}
