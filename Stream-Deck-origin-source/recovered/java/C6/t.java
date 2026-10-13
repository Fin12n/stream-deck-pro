package C6;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f1449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f1450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1451c;

    public t(Function0 initializer, Object obj) {
        kotlin.jvm.internal.t.g(initializer, "initializer");
        this.f1449a = initializer;
        this.f1450b = C.f1413a;
        this.f1451c = obj == null ? this : obj;
    }

    @Override // C6.j
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f1450b;
        C c8 = C.f1413a;
        if (obj != c8) {
            return obj;
        }
        synchronized (this.f1451c) {
            objInvoke = this.f1450b;
            if (objInvoke == c8) {
                Function0 function0 = this.f1449a;
                kotlin.jvm.internal.t.d(function0);
                objInvoke = function0.invoke();
                this.f1450b = objInvoke;
                this.f1449a = null;
            }
        }
        return objInvoke;
    }

    @Override // C6.j
    public boolean isInitialized() {
        return this.f1450b != C.f1413a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ t(Function0 function0, Object obj, int i8, AbstractC2633k abstractC2633k) {
        this(function0, (i8 & 2) != 0 ? null : obj);
    }
}
