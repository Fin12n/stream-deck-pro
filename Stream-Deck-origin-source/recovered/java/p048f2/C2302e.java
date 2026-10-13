package p048f2;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: f2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2302e extends IOException {
    public /* synthetic */ C2302e(String str, Throwable th, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2302e(String message, Throwable th) {
        super(message, th);
        t.g(message, "message");
    }
}
