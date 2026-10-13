package p017b7;

import p062g7.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f15887a = new G("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f15888b = new G("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G f15889c = new G("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f15890d = new G("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G f15891e = new G("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1782e0 f15892f = new C1782e0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1782e0 f15893g = new C1782e0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC1806q0 ? new C1807r0((InterfaceC1806q0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC1806q0 interfaceC1806q0;
        C1807r0 c1807r0 = obj instanceof C1807r0 ? (C1807r0) obj : null;
        return (c1807r0 == null || (interfaceC1806q0 = c1807r0.f15979a) == null) ? obj : interfaceC1806q0;
    }
}
