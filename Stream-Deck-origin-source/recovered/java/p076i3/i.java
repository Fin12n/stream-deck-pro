package p076i3;

import p067h3.d;
import p067h3.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f24641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f24642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24643d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, h hVar, d dVar, boolean z8) {
        this.f24640a = aVar;
        this.f24641b = hVar;
        this.f24642c = dVar;
        this.f24643d = z8;
    }

    public a a() {
        return this.f24640a;
    }

    public h b() {
        return this.f24641b;
    }

    public d c() {
        return this.f24642c;
    }

    public boolean d() {
        return this.f24643d;
    }
}
