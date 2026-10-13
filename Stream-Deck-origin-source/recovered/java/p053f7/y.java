package p053f7;

import G6.d;
import G6.g;
import I6.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements d, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f22353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f22354b;

    public y(d<Object> dVar, g gVar) {
        this.f22353a = dVar;
        this.f22354b = gVar;
    }

    @Override // I6.e
    public e getCallerFrame() {
        d dVar = this.f22353a;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // G6.d
    public g getContext() {
        return this.f22354b;
    }

    @Override // G6.d
    public void resumeWith(Object obj) {
        this.f22353a.resumeWith(obj);
    }
}
