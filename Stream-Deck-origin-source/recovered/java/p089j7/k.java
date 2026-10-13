package p089j7;

import Q6.p;
import kotlin.jvm.internal.u;
import p017b7.InterfaceC1795l;
import p062g7.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f28371a = a.f28377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f28372b = new G("STATE_REG");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G f28373c = new G("STATE_COMPLETED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f28374d = new G("STATE_CANCELLED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G f28375e = new G("NO_RESULT");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final G f28376f = new G("PARAM_CLAUSE_0");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28377a = new a();

        public a() {
            super(3);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    public static final l a(int i8) {
        if (i8 == 0) {
            return l.SUCCESSFUL;
        }
        if (i8 == 1) {
            return l.REREGISTER;
        }
        if (i8 == 2) {
            return l.CANCELLED;
        }
        if (i8 == 3) {
            return l.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i8).toString());
    }

    public static final G i() {
        return f28376f;
    }

    public static final boolean j(InterfaceC1795l interfaceC1795l, Q6.k kVar) {
        Object objF = interfaceC1795l.F(C6.G.f1419a, null, kVar);
        if (objF == null) {
            return false;
        }
        interfaceC1795l.K(objF);
        return true;
    }
}
