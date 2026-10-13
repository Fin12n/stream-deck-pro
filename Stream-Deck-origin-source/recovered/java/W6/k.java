package W6;

import D6.J;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11522d;

    public k(long j8, long j9, long j10) {
        this.f11519a = j10;
        this.f11520b = j9;
        boolean z8 = false;
        if (j10 <= 0 ? j8 >= j9 : j8 <= j9) {
            z8 = true;
        }
        this.f11521c = z8;
        this.f11522d = z8 ? j8 : j9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11521c;
    }

    @Override // D6.J
    public long nextLong() {
        long j8 = this.f11522d;
        if (j8 != this.f11520b) {
            this.f11522d = this.f11519a + j8;
            return j8;
        }
        if (!this.f11521c) {
            throw new NoSuchElementException();
        }
        this.f11521c = false;
        return j8;
    }
}
