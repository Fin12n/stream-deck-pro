package W6;

import D6.AbstractC0936p;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC0936p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11500d;

    public b(char c8, char c9, int i8) {
        this.f11497a = i8;
        this.f11498b = c9;
        boolean z8 = false;
        if (i8 <= 0 ? t.h(c8, c9) >= 0 : t.h(c8, c9) <= 0) {
            z8 = true;
        }
        this.f11499c = z8;
        this.f11500d = z8 ? c8 : c9;
    }

    @Override // D6.AbstractC0936p
    public char b() {
        int i8 = this.f11500d;
        if (i8 != this.f11498b) {
            this.f11500d = this.f11497a + i8;
        } else {
            if (!this.f11499c) {
                throw new NoSuchElementException();
            }
            this.f11499c = false;
        }
        return (char) i8;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11499c;
    }
}
