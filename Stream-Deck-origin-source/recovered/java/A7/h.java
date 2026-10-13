package A7;

import kotlin.jvm.internal.t;
import u7.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J7.g f879d;

    public h(String str, long j8, J7.g source) {
        t.g(source, "source");
        this.f877b = str;
        this.f878c = j8;
        this.f879d = source;
    }

    @Override // u7.C
    public long b() {
        return this.f878c;
    }

    @Override // u7.C
    public J7.g c() {
        return this.f879d;
    }
}
