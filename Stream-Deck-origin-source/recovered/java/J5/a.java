package J5;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f4313a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f4313a;
    }

    public /* synthetic */ a(Throwable th, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : th);
    }

    public a(Throwable th) {
        super("Client already closed");
        this.f4313a = th;
    }
}
