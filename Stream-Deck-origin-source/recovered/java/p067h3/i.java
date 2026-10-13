package p067h3;

import java.util.List;
import p031d3.a;
import p031d3.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f24414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f24415b;

    public i(b bVar, b bVar2) {
        this.f24414a = bVar;
        this.f24415b = bVar2;
    }

    @Override // p067h3.m
    public a a() {
        return new n(this.f24414a.a(), this.f24415b.a());
    }

    @Override // p067h3.m
    public List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p067h3.m
    public boolean c() {
        return this.f24414a.c() && this.f24415b.c();
    }
}
