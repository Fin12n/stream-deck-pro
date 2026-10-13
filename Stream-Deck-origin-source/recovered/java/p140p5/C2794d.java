package p140p5;

import java.util.concurrent.Executor;
import p087j5.b;

/* JADX INFO: renamed from: p5.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2794d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f31252a;

    public C2794d(b bVar) {
        this.f31252a = bVar;
    }

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f31252a.get();
    }
}
