package q7;

import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p043e6.dT.GIGvBf;

/* JADX INFO: renamed from: q7.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2841h0 implements o7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.f f32112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o7.f f32113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32114d;

    public /* synthetic */ AbstractC2841h0(String str, o7.f fVar, o7.f fVar2, AbstractC2633k abstractC2633k) {
        this(str, fVar, fVar2);
    }

    @Override // o7.f
    public String a() {
        return this.f32111a;
    }

    @Override // o7.f
    public boolean c() {
        return o7.f.a.c(this);
    }

    @Override // o7.f
    public o7.j e() {
        return o7.k.c.f31006a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2841h0)) {
            return false;
        }
        AbstractC2841h0 abstractC2841h0 = (AbstractC2841h0) obj;
        return kotlin.jvm.internal.t.c(a(), abstractC2841h0.a()) && kotlin.jvm.internal.t.c(this.f32112b, abstractC2841h0.f32112b) && kotlin.jvm.internal.t.c(this.f32113c, abstractC2841h0.f32113c);
    }

    @Override // o7.f
    public int f() {
        return this.f32114d;
    }

    @Override // o7.f
    public String g(int i8) {
        return String.valueOf(i8);
    }

    @Override // o7.f
    public List getAnnotations() {
        return o7.f.a.a(this);
    }

    public int hashCode() {
        return (((a().hashCode() * 31) + this.f32112b.hashCode()) * 31) + this.f32113c.hashCode();
    }

    @Override // o7.f
    public o7.f i(int i8) {
        if (i8 >= 0) {
            int i9 = i8 % 2;
            if (i9 == 0) {
                return this.f32112b;
            }
            if (i9 == 1) {
                return this.f32113c;
            }
            throw new IllegalStateException("Unreached");
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
        return a() + '(' + this.f32112b + ", " + this.f32113c + ')';
    }

    public AbstractC2841h0(String str, o7.f fVar, o7.f fVar2) {
        this.f32111a = str;
        this.f32112b = fVar;
        this.f32113c = fVar2;
        this.f32114d = 2;
    }

    @Override // o7.f
    public int d(String str) {
        kotlin.jvm.internal.t.g(str, GIGvBf.eCKj);
        Integer numM = Z6.u.m(str);
        if (numM != null) {
            return numM.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // o7.f
    public List h(int i8) {
        if (i8 >= 0) {
            return D6.r.n();
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + GIGvBf.XYuTE).toString());
    }
}
