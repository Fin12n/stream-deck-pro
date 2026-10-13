package p073i0;

import C6.G;
import H6.c;
import p035d7.d;
import p044e7.D;
import p044e7.w;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f24569a = D.b(0, 16, d.DROP_OLDEST, 1, null);

    @Override // p073i0.m
    public boolean a(j jVar) {
        return c().d(jVar);
    }

    @Override // p073i0.m
    public Object b(j jVar, G6.d dVar) {
        Object objEmit = c().emit(jVar, dVar);
        return objEmit == c.f() ? objEmit : G.f1419a;
    }

    @Override // p073i0.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public w c() {
        return this.f24569a;
    }
}
