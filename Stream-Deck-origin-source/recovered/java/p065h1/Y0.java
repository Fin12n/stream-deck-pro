package p065h1;

import kotlin.jvm.internal.AbstractC2633k;
import p011b1.AbstractC1770s;
import p011b1.M;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Y0 implements X0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24215b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC3164l0 f24216c = l1.e(M.a(AbstractC1770s.a()), null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3164l0 f24217a = l1.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public void a(int i8) {
        f24216c.setValue(M.a(i8));
    }

    public void b(boolean z8) {
        this.f24217a.setValue(Boolean.valueOf(z8));
    }
}
