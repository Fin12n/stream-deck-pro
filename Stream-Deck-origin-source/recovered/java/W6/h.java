package W6;

import D6.I;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11512d;

    public h(int i8, int i9, int i10) {
        this.f11509a = i10;
        this.f11510b = i9;
        boolean z8 = false;
        if (i10 <= 0 ? i8 >= i9 : i8 <= i9) {
            z8 = true;
        }
        this.f11511c = z8;
        this.f11512d = z8 ? i8 : i9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11511c;
    }

    @Override // D6.I
    public int nextInt() {
        int i8 = this.f11512d;
        if (i8 != this.f11510b) {
            this.f11512d = this.f11509a + i8;
            return i8;
        }
        if (!this.f11511c) {
            throw new NoSuchElementException();
        }
        this.f11511c = false;
        return i8;
    }
}
