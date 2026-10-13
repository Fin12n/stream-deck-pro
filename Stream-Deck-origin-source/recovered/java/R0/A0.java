package R0;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A0 extends P0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f9286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f9287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9290i;

    public /* synthetic */ A0(List list, List list2, long j8, long j9, int i8, AbstractC2633k abstractC2633k) {
        this(list, list2, j8, j9, i8);
    }

    @Override // R0.P0
    public Shader b(long j8) {
        return Q0.a(Q0.g.a(Q0.f.o(this.f9288g) == Float.POSITIVE_INFINITY ? Q0.l.i(j8) : Q0.f.o(this.f9288g), Q0.f.p(this.f9288g) == Float.POSITIVE_INFINITY ? Q0.l.g(j8) : Q0.f.p(this.f9288g)), Q0.g.a(Q0.f.o(this.f9289h) == Float.POSITIVE_INFINITY ? Q0.l.i(j8) : Q0.f.o(this.f9289h), Q0.f.p(this.f9289h) == Float.POSITIVE_INFINITY ? Q0.l.g(j8) : Q0.f.p(this.f9289h)), this.f9286e, this.f9287f, this.f9290i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a8 = (A0) obj;
        return kotlin.jvm.internal.t.c(this.f9286e, a8.f9286e) && kotlin.jvm.internal.t.c(this.f9287f, a8.f9287f) && Q0.f.l(this.f9288g, a8.f9288g) && Q0.f.l(this.f9289h, a8.f9289h) && X0.f(this.f9290i, a8.f9290i);
    }

    public int hashCode() {
        int iHashCode = this.f9286e.hashCode() * 31;
        List list = this.f9287f;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Q0.f.q(this.f9288g)) * 31) + Q0.f.q(this.f9289h)) * 31) + X0.g(this.f9290i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (Q0.g.b(this.f9288g)) {
            str = "start=" + ((Object) Q0.f.v(this.f9288g)) + ", ";
        } else {
            str = "";
        }
        if (Q0.g.b(this.f9289h)) {
            str2 = "end=" + ((Object) Q0.f.v(this.f9289h)) + ", ";
        }
        return "LinearGradient(colors=" + this.f9286e + ", stops=" + this.f9287f + ", " + str + str2 + "tileMode=" + ((Object) X0.h(this.f9290i)) + ')';
    }

    public /* synthetic */ A0(List list, List list2, long j8, long j9, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(list, (i9 & 2) != 0 ? null : list2, j8, j9, (i9 & 16) != 0 ? X0.f9380a.a() : i8, null);
    }

    public A0(List list, List list2, long j8, long j9, int i8) {
        this.f9286e = list;
        this.f9287f = list2;
        this.f9288g = j8;
        this.f9289h = j9;
        this.f9290i = i8;
    }
}
