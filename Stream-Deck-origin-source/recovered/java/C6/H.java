package C6;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f1420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1421b;

    public H(Function0 initializer) {
        kotlin.jvm.internal.t.g(initializer, "initializer");
        this.f1420a = initializer;
        this.f1421b = C.f1413a;
    }

    @Override // C6.j
    public Object getValue() {
        if (this.f1421b == C.f1413a) {
            Function0 function0 = this.f1420a;
            kotlin.jvm.internal.t.d(function0);
            this.f1421b = function0.invoke();
            this.f1420a = null;
        }
        return this.f1421b;
    }

    @Override // C6.j
    public boolean isInitialized() {
        return this.f1421b != C.f1413a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
