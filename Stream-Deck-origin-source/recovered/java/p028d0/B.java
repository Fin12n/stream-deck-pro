package p028d0;

import Q6.k;
import kotlin.jvm.internal.t;
import p037e0.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f19601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f19602b;

    public B(k kVar, E e8) {
        this.f19601a = kVar;
        this.f19602b = e8;
    }

    public final E a() {
        return this.f19602b;
    }

    public final k b() {
        return this.f19601a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b8 = (B) obj;
        return t.c(this.f19601a, b8.f19601a) && t.c(this.f19602b, b8.f19602b);
    }

    public int hashCode() {
        return (this.f19601a.hashCode() * 31) + this.f19602b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f19601a + ", animationSpec=" + this.f19602b + ')';
    }
}
