package p024c5;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16266a;

    public q(List<C1826c> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f16266a = list;
    }
}
