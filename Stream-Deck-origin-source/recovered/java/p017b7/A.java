package p017b7;

import Q6.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f15863b;

    public A(Object obj, k kVar) {
        this.f15862a = obj;
        this.f15863b = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a8 = (A) obj;
        return t.c(this.f15862a, a8.f15862a) && t.c(this.f15863b, a8.f15863b);
    }

    public int hashCode() {
        Object obj = this.f15862a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f15863b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f15862a + ", onCancellation=" + this.f15863b + ')';
    }
}
