package io.sentry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f25871b = new G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25872a = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
    }

    public static G a() {
        return f25871b;
    }

    public void b(a aVar) {
        this.f25872a.add(aVar);
    }
}
