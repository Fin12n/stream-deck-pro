package p205x6;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this((String) null, 1, (AbstractC2633k) (0 == true ? 1 : 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String message) {
        super(message);
        t.g(message, "message");
    }

    public /* synthetic */ r(String str, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? "Not enough free space" : str);
    }

    public r(int i8, int i9) {
        this("Not enough free space to write " + i8 + " bytes, available " + i9 + " bytes.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(String name, int i8, int i9) {
        this("Not enough free space to write " + name + " of " + i8 + " bytes, available " + i9 + " bytes.");
        t.g(name, "name");
    }

    public r(long j8, long j9) {
        this("Not enough free space to write " + j8 + " bytes, available " + j9 + " bytes.");
    }
}
