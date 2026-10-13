package p109m0;

import W6.i;
import W6.n;
import kotlin.jvm.internal.AbstractC2633k;
import p215z0.InterfaceC3164l0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class x implements q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29471e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3164l0 f29474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29475d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final i b(int i8, int i9, int i10) {
            int i11 = (i8 / i9) * i9;
            return n.v(Math.max(i11 - i10, 0), i11 + i9 + i10);
        }

        public a() {
        }
    }

    public x(int i8, int i9, int i10) {
        this.f29472a = i9;
        this.f29473b = i10;
        this.f29474c = g1.i(f29471e.b(i8, i9, i10), g1.r());
        this.f29475d = i8;
    }

    @Override // p215z0.q1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getValue() {
        return (i) this.f29474c.getValue();
    }

    public final void e(i iVar) {
        this.f29474c.setValue(iVar);
    }

    public final void o(int i8) {
        if (i8 != this.f29475d) {
            this.f29475d = i8;
            e(f29471e.b(i8, this.f29472a, this.f29473b));
        }
    }
}
