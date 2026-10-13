package p017b7;

import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: b7.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1820y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1793k f15989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f15990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f15992e;

    public C1820y(Object obj, InterfaceC1793k interfaceC1793k, k kVar, Object obj2, Throwable th) {
        this.f15988a = obj;
        this.f15989b = interfaceC1793k;
        this.f15990c = kVar;
        this.f15991d = obj2;
        this.f15992e = th;
    }

    public static /* synthetic */ C1820y b(C1820y c1820y, Object obj, InterfaceC1793k interfaceC1793k, k kVar, Object obj2, Throwable th, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = c1820y.f15988a;
        }
        if ((i8 & 2) != 0) {
            interfaceC1793k = c1820y.f15989b;
        }
        if ((i8 & 4) != 0) {
            kVar = c1820y.f15990c;
        }
        if ((i8 & 8) != 0) {
            obj2 = c1820y.f15991d;
        }
        if ((i8 & 16) != 0) {
            th = c1820y.f15992e;
        }
        Throwable th2 = th;
        k kVar2 = kVar;
        return c1820y.a(obj, interfaceC1793k, kVar2, obj2, th2);
    }

    public final C1820y a(Object obj, InterfaceC1793k interfaceC1793k, k kVar, Object obj2, Throwable th) {
        return new C1820y(obj, interfaceC1793k, kVar, obj2, th);
    }

    public final boolean c() {
        return this.f15992e != null;
    }

    public final void d(C1797m c1797m, Throwable th) {
        InterfaceC1793k interfaceC1793k = this.f15989b;
        if (interfaceC1793k != null) {
            c1797m.j(interfaceC1793k, th);
        }
        k kVar = this.f15990c;
        if (kVar != null) {
            c1797m.k(kVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1820y)) {
            return false;
        }
        C1820y c1820y = (C1820y) obj;
        return t.c(this.f15988a, c1820y.f15988a) && t.c(this.f15989b, c1820y.f15989b) && t.c(this.f15990c, c1820y.f15990c) && t.c(this.f15991d, c1820y.f15991d) && t.c(this.f15992e, c1820y.f15992e);
    }

    public int hashCode() {
        Object obj = this.f15988a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC1793k interfaceC1793k = this.f15989b;
        int iHashCode2 = (iHashCode + (interfaceC1793k == null ? 0 : interfaceC1793k.hashCode())) * 31;
        k kVar = this.f15990c;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Object obj2 = this.f15991d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f15992e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f15988a + ", cancelHandler=" + this.f15989b + ", onCancellation=" + this.f15990c + ", idempotentResume=" + this.f15991d + ", cancelCause=" + this.f15992e + ')';
    }

    public /* synthetic */ C1820y(Object obj, InterfaceC1793k interfaceC1793k, k kVar, Object obj2, Throwable th, int i8, AbstractC2633k abstractC2633k) {
        this(obj, (i8 & 2) != 0 ? null : interfaceC1793k, (i8 & 4) != 0 ? null : kVar, (i8 & 8) != 0 ? null : obj2, (i8 & 16) != 0 ? null : th);
    }
}
