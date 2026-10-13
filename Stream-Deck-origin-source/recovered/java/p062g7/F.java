package p062g7;

import C6.q;
import C6.r;
import p000a.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement f23816a = new a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f23817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f23818c;

    static {
        Object objB;
        Object objB2;
        try {
            q.a aVar = q.f1441b;
            objB = q.b(I6.a.class.getCanonicalName());
        } catch (Throwable th) {
            q.a aVar2 = q.f1441b;
            objB = q.b(r.a(th));
        }
        if (q.e(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f23817b = (String) objB;
        try {
            objB2 = q.b(F.class.getCanonicalName());
        } catch (Throwable th2) {
            q.a aVar3 = q.f1441b;
            objB2 = q.b(r.a(th2));
        }
        if (q.e(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f23818c = (String) objB2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
