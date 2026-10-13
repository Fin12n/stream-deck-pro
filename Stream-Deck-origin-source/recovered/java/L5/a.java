package L5;

import java.net.ConnectException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends ConnectException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5045a;

    public /* synthetic */ a(String str, Throwable th, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f5045a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message, Throwable th) {
        super(message);
        t.g(message, "message");
        this.f5045a = th;
    }
}
