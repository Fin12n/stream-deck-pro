package U;

import H.EnumC1002s;
import H.EnumC1004t;
import H.EnumC1006u;
import H.EnumC1008v;
import H.EnumC1010w;
import H.EnumC1012x;
import H.InterfaceC1014y;
import H.m1;
import H.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class l implements InterfaceC1014y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1014y f9992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f9993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9994c;

    public l(m1 m1Var, InterfaceC1014y interfaceC1014y) {
        this(interfaceC1014y, m1Var, -1L);
    }

    @Override // H.InterfaceC1014y
    public long a() {
        InterfaceC1014y interfaceC1014y = this.f9992a;
        if (interfaceC1014y != null) {
            return interfaceC1014y.a();
        }
        long j8 = this.f9994c;
        if (j8 != -1) {
            return j8;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // H.InterfaceC1014y
    public m1 b() {
        return this.f9993b;
    }

    @Override // H.InterfaceC1014y
    public EnumC1012x c() {
        InterfaceC1014y interfaceC1014y = this.f9992a;
        return interfaceC1014y != null ? interfaceC1014y.c() : EnumC1012x.UNKNOWN;
    }

    @Override // H.InterfaceC1014y
    public EnumC1010w e() {
        InterfaceC1014y interfaceC1014y = this.f9992a;
        return interfaceC1014y != null ? interfaceC1014y.e() : EnumC1010w.UNKNOWN;
    }

    @Override // H.InterfaceC1014y
    public EnumC1008v f() {
        InterfaceC1014y interfaceC1014y = this.f9992a;
        return interfaceC1014y != null ? interfaceC1014y.f() : EnumC1008v.UNKNOWN;
    }

    @Override // H.InterfaceC1014y
    public EnumC1004t g() {
        InterfaceC1014y interfaceC1014y = this.f9992a;
        return interfaceC1014y != null ? interfaceC1014y.g() : EnumC1004t.UNKNOWN;
    }

    @Override // H.InterfaceC1014y
    public EnumC1002s h() {
        InterfaceC1014y interfaceC1014y = this.f9992a;
        return interfaceC1014y != null ? interfaceC1014y.h() : EnumC1002s.UNKNOWN;
    }

    @Override // H.InterfaceC1014y
    public r j() {
        InterfaceC1014y interfaceC1014y = this.f9992a;
        return interfaceC1014y != null ? interfaceC1014y.j() : r.UNKNOWN;
    }

    @Override // H.InterfaceC1014y
    public EnumC1006u k() {
        InterfaceC1014y interfaceC1014y = this.f9992a;
        return interfaceC1014y != null ? interfaceC1014y.k() : EnumC1006u.UNKNOWN;
    }

    public l(m1 m1Var, long j8) {
        this(null, m1Var, j8);
    }

    public l(InterfaceC1014y interfaceC1014y, m1 m1Var, long j8) {
        this.f9992a = interfaceC1014y;
        this.f9993b = m1Var;
        this.f9994c = j8;
    }
}
