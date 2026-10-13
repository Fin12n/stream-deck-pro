package p024c5;

import p087j5.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f16245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16246b;

    public l(w wVar, b bVar) {
        this.f16245a = wVar;
        this.f16246b = bVar;
    }

    public static Runnable a(w wVar, b bVar) {
        return new l(wVar, bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16245a.a(this.f16246b);
    }
}
