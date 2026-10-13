package p067h3;

import java.util.List;
import p031d3.j;
import p031d3.k;
import p130o3.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24413a;

    public e(List<a> list) {
        this.f24413a = list;
    }

    @Override // p067h3.m
    public p031d3.a a() {
        return ((a) this.f24413a.get(0)).i() ? new k(this.f24413a) : new j(this.f24413a);
    }

    @Override // p067h3.m
    public List b() {
        return this.f24413a;
    }

    @Override // p067h3.m
    public boolean c() {
        return this.f24413a.size() == 1 && ((a) this.f24413a.get(0)).i();
    }
}
