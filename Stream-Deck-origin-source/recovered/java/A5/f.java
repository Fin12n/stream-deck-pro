package A5;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f830a;

    public /* synthetic */ f(m mVar, String str, int i8, AbstractC2633k abstractC2633k) {
        this(mVar, (i8 & 2) != 0 ? null : str);
    }

    public final m a() {
        return this.f830a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(m key, String str) {
        t.g(key, "key");
        if (str == null) {
            str = "Entry with key `" + key + "` not found.";
        }
        super(str, null, 2, null);
        this.f830a = key;
    }
}
