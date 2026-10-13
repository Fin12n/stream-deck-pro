package p067h3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p130o3.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24430a;

    public n(Object obj) {
        this(Collections.singletonList(new a(obj)));
    }

    @Override // p067h3.m
    public List b() {
        return this.f24430a;
    }

    @Override // p067h3.m
    public boolean c() {
        return this.f24430a.isEmpty() || (this.f24430a.size() == 1 && ((a) this.f24430a.get(0)).i());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f24430a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f24430a.toArray()));
        }
        return sb.toString();
    }

    public n(List list) {
        this.f24430a = list;
    }
}
