package H;

import T0.Vl.PCRzgdeK;
import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: H.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0979g extends AbstractC0977f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f3005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f3007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A.J f3008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f3009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0984i0 f3010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Range f3012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3013i;

    public C0979g(j1 j1Var, int i8, Size size, A.J j8, List list, InterfaceC0984i0 interfaceC0984i0, int i9, Range range, boolean z8) {
        if (j1Var == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f3005a = j1Var;
        this.f3006b = i8;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f3007c = size;
        if (j8 == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f3008d = j8;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f3009e = list;
        this.f3010f = interfaceC0984i0;
        this.f3011g = i9;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.f3012h = range;
        this.f3013i = z8;
    }

    @Override // H.AbstractC0977f
    public List b() {
        return this.f3009e;
    }

    @Override // H.AbstractC0977f
    public A.J c() {
        return this.f3008d;
    }

    @Override // H.AbstractC0977f
    public int d() {
        return this.f3006b;
    }

    @Override // H.AbstractC0977f
    public InterfaceC0984i0 e() {
        return this.f3010f;
    }

    public boolean equals(Object obj) {
        InterfaceC0984i0 interfaceC0984i0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0977f) {
            AbstractC0977f abstractC0977f = (AbstractC0977f) obj;
            if (this.f3005a.equals(abstractC0977f.h()) && this.f3006b == abstractC0977f.d() && this.f3007c.equals(abstractC0977f.g()) && this.f3008d.equals(abstractC0977f.c()) && this.f3009e.equals(abstractC0977f.b()) && ((interfaceC0984i0 = this.f3010f) != null ? interfaceC0984i0.equals(abstractC0977f.e()) : abstractC0977f.e() == null) && this.f3011g == abstractC0977f.f() && this.f3012h.equals(abstractC0977f.i()) && this.f3013i == abstractC0977f.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // H.AbstractC0977f
    public int f() {
        return this.f3011g;
    }

    @Override // H.AbstractC0977f
    public Size g() {
        return this.f3007c;
    }

    @Override // H.AbstractC0977f
    public j1 h() {
        return this.f3005a;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f3005a.hashCode() ^ 1000003) * 1000003) ^ this.f3006b) * 1000003) ^ this.f3007c.hashCode()) * 1000003) ^ this.f3008d.hashCode()) * 1000003) ^ this.f3009e.hashCode()) * 1000003;
        InterfaceC0984i0 interfaceC0984i0 = this.f3010f;
        return ((((((iHashCode ^ (interfaceC0984i0 == null ? 0 : interfaceC0984i0.hashCode())) * 1000003) ^ this.f3011g) * 1000003) ^ this.f3012h.hashCode()) * 1000003) ^ (this.f3013i ? 1231 : 1237);
    }

    @Override // H.AbstractC0977f
    public Range i() {
        return this.f3012h;
    }

    @Override // H.AbstractC0977f
    public boolean j() {
        return this.f3013i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f3005a + ", imageFormat=" + this.f3006b + ", size=" + this.f3007c + ", dynamicRange=" + this.f3008d + ", captureTypes=" + this.f3009e + ", implementationOptions=" + this.f3010f + PCRzgdeK.HeCIQzCdHEvt + this.f3011g + ", targetFrameRate=" + this.f3012h + ", strictFrameRateRequired=" + this.f3013i + "}";
    }
}
