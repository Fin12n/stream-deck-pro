package p024c5;

import java.util.Map;
import p078i5.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map.Entry f16267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f16268b;

    public s(Map.Entry entry, a aVar) {
        this.f16267a = entry;
        this.f16268b = aVar;
    }

    public static Runnable a(Map.Entry entry, a aVar) {
        return new s(entry, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        t.c(this.f16267a, this.f16268b);
    }
}
