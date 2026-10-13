package p193w2;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f36828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f36829b;

    public l(r database) {
        t.g(database, "database");
        this.f36828a = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        t.f(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f36829b = setNewSetFromMap;
    }
}
