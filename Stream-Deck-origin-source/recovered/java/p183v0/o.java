package p183v0;

import R0.AbstractC1602n0;
import R0.C1598l0;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35030a = a.f35031a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f35031a = new a();

        public final f a(long j8, boolean z8) {
            if (z8) {
                return ((double) AbstractC1602n0.h(j8)) > 0.5d ? p.f35033b : p.f35034c;
            }
            return p.f35035d;
        }

        public final long b(long j8, boolean z8) {
            return (z8 || ((double) AbstractC1602n0.h(j8)) >= 0.5d) ? j8 : C1598l0.f9405b.f();
        }
    }

    long a(InterfaceC3163l interfaceC3163l, int i8);

    f b(InterfaceC3163l interfaceC3163l, int i8);
}
