package com.google.protobuf;

import E4.JFpq.XRlnZWSrAFn;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f19339c = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f19341b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f19340a = new K();

    public static j0 a() {
        return f19339c;
    }

    public n0 c(Class cls) {
        n0 n0VarB;
        A.b(cls, "messageType");
        n0 n0VarA = (n0) this.f19341b.get(cls);
        return (n0VarA != null || (n0VarB = b(cls, (n0VarA = this.f19340a.a(cls)))) == null) ? n0VarA : n0VarB;
    }

    public n0 d(Object obj) {
        return c(obj.getClass());
    }

    public n0 b(Class cls, n0 n0Var) {
        A.b(cls, XRlnZWSrAFn.ilGg);
        A.b(n0Var, com.amazon.device.simplesignin.a.a.a.f17233E);
        return (n0) this.f19341b.putIfAbsent(cls, n0Var);
    }
}
