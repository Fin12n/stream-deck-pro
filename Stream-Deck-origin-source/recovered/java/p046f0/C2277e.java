package p046f0;

import R0.H0;
import R0.InterfaceC1586f0;
import R0.InterfaceC1621x0;
import R0.T;
import T0.a;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: f0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2277e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1621x0 f21444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1586f0 f21445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f21446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H0 f21447d;

    public C2277e() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2277e)) {
            return false;
        }
        C2277e c2277e = (C2277e) obj;
        return t.c(this.f21444a, c2277e.f21444a) && t.c(this.f21445b, c2277e.f21445b) && t.c(this.f21446c, c2277e.f21446c) && t.c(this.f21447d, c2277e.f21447d);
    }

    public final H0 g() {
        H0 h8 = this.f21447d;
        if (h8 != null) {
            return h8;
        }
        H0 h0A = T.a();
        this.f21447d = h0A;
        return h0A;
    }

    public int hashCode() {
        InterfaceC1621x0 interfaceC1621x0 = this.f21444a;
        int iHashCode = (interfaceC1621x0 == null ? 0 : interfaceC1621x0.hashCode()) * 31;
        InterfaceC1586f0 interfaceC1586f0 = this.f21445b;
        int iHashCode2 = (iHashCode + (interfaceC1586f0 == null ? 0 : interfaceC1586f0.hashCode())) * 31;
        a aVar = this.f21446c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        H0 h8 = this.f21447d;
        return iHashCode3 + (h8 != null ? h8.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f21444a + ", canvas=" + this.f21445b + ", canvasDrawScope=" + this.f21446c + ", borderPath=" + this.f21447d + ')';
    }

    public C2277e(InterfaceC1621x0 interfaceC1621x0, InterfaceC1586f0 interfaceC1586f0, a aVar, H0 h8) {
        this.f21444a = interfaceC1621x0;
        this.f21445b = interfaceC1586f0;
        this.f21446c = aVar;
        this.f21447d = h8;
    }

    public /* synthetic */ C2277e(InterfaceC1621x0 interfaceC1621x0, InterfaceC1586f0 interfaceC1586f0, a aVar, H0 h8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : interfaceC1621x0, (i8 & 2) != 0 ? null : interfaceC1586f0, (i8 & 4) != 0 ? null : aVar, (i8 & 8) != 0 ? null : h8);
    }
}
