package androidx.lifecycle;

import C6.InterfaceC0916e;
import P2.Lsk.mHPawN;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p169t2.f f15243a;

    public O() {
        this.f15243a = new p169t2.f();
    }

    public final void b() {
        p169t2.f fVar = this.f15243a;
        if (fVar != null) {
            fVar.e();
        }
        d();
    }

    public final AutoCloseable c(String key) {
        kotlin.jvm.internal.t.g(key, "key");
        p169t2.f fVar = this.f15243a;
        if (fVar != null) {
            return fVar.g(key);
        }
        return null;
    }

    public void d() {
    }

    public final void a(String key, AutoCloseable autoCloseable) {
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(autoCloseable, mHPawN.qGpj);
        p169t2.f fVar = this.f15243a;
        if (fVar != null) {
            fVar.d(key, autoCloseable);
        }
    }

    public O(p017b7.J viewModelScope) {
        kotlin.jvm.internal.t.g(viewModelScope, "viewModelScope");
        this.f15243a = new p169t2.f(viewModelScope);
    }

    public O(AutoCloseable... closeables) {
        kotlin.jvm.internal.t.g(closeables, "closeables");
        this.f15243a = new p169t2.f((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public O(p017b7.J viewModelScope, AutoCloseable... closeables) {
        kotlin.jvm.internal.t.g(viewModelScope, "viewModelScope");
        kotlin.jvm.internal.t.g(closeables, "closeables");
        this.f15243a = new p169t2.f(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    @InterfaceC0916e
    public /* synthetic */ O(Closeable... closeables) {
        kotlin.jvm.internal.t.g(closeables, "closeables");
        this.f15243a = new p169t2.f((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }
}
