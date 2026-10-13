package androidx.lifecycle;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class H implements InterfaceC1730m, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f15225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15226c;

    public H(String key, F handle) {
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(handle, "handle");
        this.f15224a = key;
        this.f15225b = handle;
    }

    public final void b(p217z2.d registry, AbstractC1726i lifecycle) {
        kotlin.jvm.internal.t.g(registry, "registry");
        kotlin.jvm.internal.t.g(lifecycle, "lifecycle");
        if (this.f15226c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f15226c = true;
        lifecycle.a(this);
        registry.h(this.f15224a, this.f15225b.c());
    }

    public final F c() {
        return this.f15225b;
    }

    @Override // androidx.lifecycle.InterfaceC1730m
    public void j(InterfaceC1733p source, AbstractC1726i.a event) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(event, "event");
        if (event == AbstractC1726i.a.ON_DESTROY) {
            this.f15226c = false;
            source.w().d(this);
        }
    }

    public final boolean o() {
        return this.f15226c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
