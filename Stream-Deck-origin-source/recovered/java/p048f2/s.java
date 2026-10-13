package p048f2;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class s extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f21787b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Throwable finalException) {
        super(Integer.MAX_VALUE, null);
        t.g(finalException, "finalException");
        this.f21787b = finalException;
    }

    public final Throwable b() {
        return this.f21787b;
    }
}
