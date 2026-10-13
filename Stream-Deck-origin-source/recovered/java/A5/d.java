package A5;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f828a;

    public /* synthetic */ d(m mVar, String str, Throwable th, int i8, AbstractC2633k abstractC2633k) {
        this(mVar, str, (i8 & 4) != 0 ? null : th);
    }

    public final m a() {
        return this.f828a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m key, String message, Throwable th) {
        super(message, th);
        t.g(key, "key");
        t.g(message, "message");
        this.f828a = key;
    }
}
