package p215z0;

import C6.j;
import C6.k;
import android.os.Looper;
import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: z0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3143b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f38729a = k.b(a.f38731a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f38730b;

    /* JADX INFO: renamed from: z0.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f38731a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3146c0 invoke() {
            return Looper.getMainLooper() != null ? C.f38504a : Q0.f38645a;
        }
    }

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f38730b = id;
    }

    public static final InterfaceC3158i0 a(float f8) {
        return new C3172p0(f8);
    }

    public static final InterfaceC3160j0 b(int i8) {
        return new C3174q0(i8);
    }

    public static final InterfaceC3162k0 c(long j8) {
        return new C3175r0(j8);
    }

    public static final J0.u d(Object obj, f1 f1Var) {
        return new C3177s0(obj, f1Var);
    }

    public static final long e() {
        return f38730b;
    }

    public static final void f(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }
}
