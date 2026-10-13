package io.ktor.utils.io.internal;

import io.ktor.utils.io.v;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f25503b = new l();

    @Override // io.ktor.utils.io.u
    public ByteBuffer h(int i8, int i9) {
        return null;
    }

    @Override // io.ktor.utils.io.v
    public Object n(int i8, G6.d dVar) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("atLeast parameter shouldn't be negative: " + i8).toString());
        }
        if (i8 <= 4088) {
            return I6.b.a(false);
        }
        throw new IllegalArgumentException(("atLeast parameter shouldn't be larger than max buffer size of 4088: " + i8).toString());
    }

    @Override // io.ktor.utils.io.u
    public void w(int i8) {
        if (i8 <= 0) {
            return;
        }
        throw new IllegalStateException("Unable to mark " + i8 + " bytes consumed for already terminated channel");
    }
}
