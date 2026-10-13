package io.ktor.utils.io.internal;

import C6.C0920i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25487b = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availableForRead$internal");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25488c = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availableForWrite$internal");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25489d = AtomicIntegerFieldUpdater.newUpdater(j.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25490a;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public j(int i8) {
        this.f25490a = i8;
        this._availableForWrite$internal = i8;
    }

    public final void a(int i8) {
        int i9;
        int i10;
        do {
            i9 = this._availableForWrite$internal;
            i10 = i9 + i8;
            if (i10 > this.f25490a) {
                b(i9, i10, i8);
                throw new C0920i();
            }
        } while (!f25488c.compareAndSet(this, i9, i10));
    }

    public final Void b(int i8, int i9, int i10) {
        throw new IllegalArgumentException("Completed read overflow: " + i8 + " + " + i10 + " = " + i9 + " > " + this.f25490a);
    }

    public final void c(int i8) {
        int i9;
        int i10;
        do {
            i9 = this._pendingToFlush;
            i10 = i9 + i8;
            if (i10 > this.f25490a) {
                d(i9, i8);
                throw new C0920i();
            }
        } while (!f25489d.compareAndSet(this, i9, i10));
    }

    public final Void d(int i8, int i9) {
        throw new IllegalArgumentException("Complete write overflow: " + i8 + " + " + i9 + " > " + this.f25490a);
    }

    public final boolean e() {
        int andSet = f25489d.getAndSet(this, 0);
        if (andSet == 0) {
            return this._availableForRead$internal > 0;
        }
        return f25487b.addAndGet(this, andSet) > 0;
    }

    public final void f() {
        f25488c.getAndSet(this, 0);
    }

    public final boolean g() {
        return this._availableForWrite$internal == this.f25490a;
    }

    public final boolean h() {
        return this._availableForWrite$internal == 0;
    }

    public final void i() {
        this._availableForRead$internal = this.f25490a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void j() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f25490a;
    }

    public final boolean k() {
        int i8;
        do {
            i8 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i8 != this.f25490a) {
                return false;
            }
        } while (!f25488c.compareAndSet(this, i8, 0));
        return true;
    }

    public final int l(int i8) {
        int i9;
        int iMin;
        do {
            i9 = this._availableForRead$internal;
            iMin = Math.min(i8, i9);
            if (iMin == 0) {
                return 0;
            }
        } while (!f25487b.compareAndSet(this, i9, i9 - iMin));
        return Math.min(i8, i9);
    }

    public final boolean m(int i8) {
        int i9;
        do {
            i9 = this._availableForRead$internal;
            if (i9 < i8) {
                return false;
            }
        } while (!f25487b.compareAndSet(this, i9, i9 - i8));
        return true;
    }

    public final int n(int i8) {
        int i9;
        do {
            i9 = this._availableForWrite$internal;
            if (i9 < i8) {
                return 0;
            }
        } while (!f25488c.compareAndSet(this, i9, 0));
        return i9;
    }

    public final int o(int i8) {
        int i9;
        int iMin;
        do {
            i9 = this._availableForWrite$internal;
            iMin = Math.min(i8, i9);
            if (iMin == 0) {
                return 0;
            }
        } while (!f25488c.compareAndSet(this, i9, i9 - iMin));
        return Math.min(i8, i9);
    }

    public final boolean p(int i8) {
        int i9;
        do {
            i9 = this._availableForWrite$internal;
            if (i9 < i8) {
                return false;
            }
        } while (!f25488c.compareAndSet(this, i9, i9 - i8));
        return true;
    }

    public String toString() {
        return "RingBufferCapacity[read: " + this._availableForRead$internal + ", write: " + this._availableForWrite$internal + ", flush: " + this._pendingToFlush + ", capacity: " + this.f25490a + ']';
    }
}
