package p034d6;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    public static final Void c() throws IOException {
        throw new IOException("Selectable is already closed");
    }

    public static final Void d(int i8, int i9) {
        throw new IllegalStateException(("Selectable is invalid state: " + i8 + ", " + i9).toString());
    }
}
