package p059g4;

import com.google.android.datatransport.runtime.e;
import java.util.Set;
import p032d4.b;
import p032d4.f;
import p032d4.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f23760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f23761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f23762c;

    public k(Set set, e eVar, n nVar) {
        this.f23760a = set;
        this.f23761b = eVar;
        this.f23762c = nVar;
    }

    @Override // p032d4.g
    public f a(String str, Class cls, b bVar, p032d4.e eVar) {
        if (this.f23760a.contains(bVar)) {
            return new m(this.f23761b, str, bVar, eVar, this.f23762c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f23760a));
    }
}
