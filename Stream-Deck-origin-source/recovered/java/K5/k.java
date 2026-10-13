package K5;

import kotlin.jvm.internal.t;
import p017b7.D;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends IllegalArgumentException implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.websocket.e f4723a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(io.ktor.websocket.e frame) {
        super("Unsupported frame type: " + frame);
        t.g(frame, "frame");
        this.f4723a = frame;
    }

    @Override // p017b7.D
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k a() {
        k kVar = new k(this.f4723a);
        kVar.initCause(this);
        return kVar;
    }
}
