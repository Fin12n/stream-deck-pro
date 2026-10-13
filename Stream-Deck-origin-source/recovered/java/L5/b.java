package L5;

import D6.iIQ.BmWxZhjGfw;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends SocketTimeoutException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5046a;

    public /* synthetic */ b(String str, Throwable th, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f5046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Throwable th) {
        super(str);
        t.g(str, BmWxZhjGfw.fAZAgPFrRzFV);
        this.f5046a = th;
    }
}
