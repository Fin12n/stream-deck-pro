package p138p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: p3.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2774i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31194a;

    /* JADX INFO: renamed from: p3.i$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f31195a = new HashSet();

        public a a(int i8) {
            this.f31195a.add(Integer.valueOf(i8));
            return this;
        }

        public C2774i b() {
            return new C2774i(this.f31195a, null);
        }
    }

    public /* synthetic */ C2774i(Set set, g0 g0Var) {
        this.f31194a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    public static a a() {
        return new a();
    }

    public final ArrayList b() {
        return this.f31194a;
    }
}
