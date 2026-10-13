package p131o4;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: renamed from: o4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2753e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2753e f30922a = a().f(10485760).d(RCHTTPStatusCodes.SUCCESS).b(ModuleDescriptor.MODULE_VERSION).c(604800000).e(81920).a();

    /* JADX INFO: renamed from: o4.e$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public abstract AbstractC2753e a();

        public abstract a b(int i8);

        public abstract a c(long j8);

        public abstract a d(int i8);

        public abstract a e(int i8);

        public abstract a f(long j8);
    }

    public static a a() {
        return new C2749a.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();
}
