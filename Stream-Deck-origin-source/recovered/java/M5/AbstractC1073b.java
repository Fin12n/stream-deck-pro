package M5;

import X5.AbstractC1691u;
import p115m6.C2691a;

/* JADX INFO: renamed from: M5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1073b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2691a f5600a = new C2691a("UploadProgressListenerAttributeKey");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2691a f5601b = new C2691a("DownloadProgressListenerAttributeKey");

    public static final U5.c c(U5.c cVar, Q6.p listener) {
        kotlin.jvm.internal.t.g(cVar, "<this>");
        kotlin.jvm.internal.t.g(listener, "listener");
        return Q5.b.a(cVar.g1(), V5.a.a(cVar.b(), cVar.getCoroutineContext(), AbstractC1691u.c(cVar), listener)).g();
    }
}
