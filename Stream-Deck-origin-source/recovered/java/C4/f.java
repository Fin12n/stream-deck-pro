package C4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f1395b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f1396a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Executor f1397b;

        public a a(p203x4.h hVar) {
            this.f1396a.add(hVar);
            return this;
        }

        public f b() {
            return new f(this.f1396a, null, this.f1397b, true, null);
        }
    }

    public /* synthetic */ f(List list, C4.a aVar, Executor executor, boolean z8, j jVar) {
        AbstractC3207p.l(list, "APIs must not be null.");
        AbstractC3207p.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            AbstractC3207p.l(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f1394a = list;
        this.f1395b = executor;
    }

    public static a d() {
        return new a();
    }

    public List a() {
        return this.f1394a;
    }

    public C4.a b() {
        return null;
    }

    public Executor c() {
        return this.f1395b;
    }
}
