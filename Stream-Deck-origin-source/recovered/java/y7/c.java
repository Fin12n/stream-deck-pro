package y7;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f38460e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, boolean z8, Function0 function0) {
        super(str, z8);
        this.f38460e = function0;
    }

    @Override // y7.a
    public long f() {
        this.f38460e.invoke();
        return -1L;
    }
}
