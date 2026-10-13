package U6;

import java.util.Random;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends c {
    @Override // U6.c
    public int b(int i8) {
        return d.h(j().nextInt(), i8);
    }

    @Override // U6.c
    public byte[] c(byte[] array) {
        t.g(array, "array");
        j().nextBytes(array);
        return array;
    }

    @Override // U6.c
    public int e() {
        return j().nextInt();
    }

    @Override // U6.c
    public int f(int i8) {
        return j().nextInt(i8);
    }

    @Override // U6.c
    public long h() {
        return j().nextLong();
    }

    public abstract Random j();
}
