package p141p6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String data, int i8, String pattern) {
        super("Failed to parse date string: \"" + data + "\" at index " + i8 + ". Pattern: \"" + pattern + '\"');
        t.g(data, "data");
        t.g(pattern, "pattern");
    }
}
