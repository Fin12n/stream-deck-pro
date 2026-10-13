package p191w0;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p135p0.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f36711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f36712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f36713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f36714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f36715e;

    public y0() {
        this(null, null, null, null, null, 31, null);
    }

    public final a a() {
        return this.f36715e;
    }

    public final a b() {
        return this.f36711a;
    }

    public final a c() {
        return this.f36714d;
    }

    public final a d() {
        return this.f36713c;
    }

    public final a e() {
        return this.f36712b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return t.c(this.f36711a, y0Var.f36711a) && t.c(this.f36712b, y0Var.f36712b) && t.c(this.f36713c, y0Var.f36713c) && t.c(this.f36714d, y0Var.f36714d) && t.c(this.f36715e, y0Var.f36715e);
    }

    public int hashCode() {
        return (((((((this.f36711a.hashCode() * 31) + this.f36712b.hashCode()) * 31) + this.f36713c.hashCode()) * 31) + this.f36714d.hashCode()) * 31) + this.f36715e.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.f36711a + ", small=" + this.f36712b + ", medium=" + this.f36713c + ", large=" + this.f36714d + ", extraLarge=" + this.f36715e + ')';
    }

    public y0(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f36711a = aVar;
        this.f36712b = aVar2;
        this.f36713c = aVar3;
        this.f36714d = aVar4;
        this.f36715e = aVar5;
    }

    public /* synthetic */ y0(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? C3094x0.f36696a.b() : aVar, (i8 & 2) != 0 ? C3094x0.f36696a.e() : aVar2, (i8 & 4) != 0 ? C3094x0.f36696a.d() : aVar3, (i8 & 8) != 0 ? C3094x0.f36696a.c() : aVar4, (i8 & 16) != 0 ? C3094x0.f36696a.a() : aVar5);
    }
}
