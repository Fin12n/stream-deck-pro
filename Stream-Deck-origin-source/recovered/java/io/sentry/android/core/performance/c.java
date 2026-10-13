package io.sentry.android.core.performance;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f26507a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f26508b = new g();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int iCompare = Long.compare(this.f26507a.u(), cVar.f26507a.u());
        return iCompare == 0 ? Long.compare(this.f26508b.u(), cVar.f26508b.u()) : iCompare;
    }

    public final g b() {
        return this.f26507a;
    }

    public final g c() {
        return this.f26508b;
    }
}
