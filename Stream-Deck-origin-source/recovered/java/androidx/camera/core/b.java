package androidx.camera.core;

import A.InterfaceC0870f0;
import android.graphics.Rect;
import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f14136b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14135a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f14137c = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void b(d dVar);
    }

    public b(d dVar) {
        this.f14136b = dVar;
    }

    @Override // androidx.camera.core.d
    public d.a[] D() {
        return this.f14136b.D();
    }

    public void b(a aVar) {
        synchronized (this.f14135a) {
            this.f14137c.add(aVar);
        }
    }

    public void c() {
        HashSet hashSet;
        synchronized (this.f14135a) {
            hashSet = new HashSet(this.f14137c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(this);
        }
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        this.f14136b.close();
        c();
    }

    @Override // androidx.camera.core.d
    public void d1(Rect rect) {
        this.f14136b.d1(rect);
    }

    @Override // androidx.camera.core.d
    public InterfaceC0870f0 e1() {
        return this.f14136b.e1();
    }

    @Override // androidx.camera.core.d
    public int f() {
        return this.f14136b.f();
    }

    @Override // androidx.camera.core.d
    public int g() {
        return this.f14136b.g();
    }

    @Override // androidx.camera.core.d
    public int getFormat() {
        return this.f14136b.getFormat();
    }

    @Override // androidx.camera.core.d
    public Image x1() {
        return this.f14136b.x1();
    }
}
