package p052f6;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(String message, Throwable th) {
        super(message, th);
        t.g(message, "message");
    }

    public /* synthetic */ A(String str, Throwable th, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? null : th);
    }
}
