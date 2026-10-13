package q7;

import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: q7.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2831c0 implements o7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.f f32090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32091b;

    public /* synthetic */ AbstractC2831c0(o7.f fVar, AbstractC2633k abstractC2633k) {
        this(fVar);
    }

    @Override // o7.f
    public boolean c() {
        return o7.f.a.c(this);
    }

    @Override // o7.f
    public int d(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        Integer numM = Z6.u.m(name);
        if (numM != null) {
            return numM.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // o7.f
    public o7.j e() {
        return o7.k.b.f31005a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2831c0)) {
            return false;
        }
        AbstractC2831c0 abstractC2831c0 = (AbstractC2831c0) obj;
        return kotlin.jvm.internal.t.c(this.f32090a, abstractC2831c0.f32090a) && kotlin.jvm.internal.t.c(a(), abstractC2831c0.a());
    }

    @Override // o7.f
    public int f() {
        return this.f32091b;
    }

    @Override // o7.f
    public String g(int i8) {
        return String.valueOf(i8);
    }

    @Override // o7.f
    public List getAnnotations() {
        return o7.f.a.a(this);
    }

    @Override // o7.f
    public List h(int i8) {
        if (i8 >= 0) {
            return D6.r.n();
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f32090a.hashCode() * 31) + a().hashCode();
    }

    @Override // o7.f
    public o7.f i(int i8) {
        if (i8 >= 0) {
            return this.f32090a;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // o7.f
    public boolean isInline() {
        return o7.f.a.b(this);
    }

    @Override // o7.f
    public boolean j(int i8) {
        if (i8 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return a() + '(' + this.f32090a + ')';
    }

    public AbstractC2831c0(o7.f fVar) {
        this.f32090a = fVar;
        this.f32091b = 1;
    }
}
