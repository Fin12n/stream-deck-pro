package M3;

import kotlin.jvm.internal.AbstractC2633k;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Exception {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M3.a f5136a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(M3.a reason) {
            super("Connection is already closed", null, 2, 0 == true ? 1 : 0);
            kotlin.jvm.internal.t.g(reason, "reason");
            this.f5136a = reason;
        }

        public final M3.a a() {
            return this.f5136a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends d {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Throwable cause) {
            kotlin.jvm.internal.t.g(cause, "cause");
            String message = cause.getMessage();
            super("InternalConnectionError: " + (message == null ? "<null>" : message), cause, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends d {
        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            super("Invalid data received", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: M3.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0184d extends d {
        /* JADX WARN: Multi-variable type inference failed */
        public C0184d() {
            super(bGZGhbtQmA.HVwxXEEuxMFzsPi, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends d {
        /* JADX WARN: Multi-variable type inference failed */
        public e(String str) {
            super("ProtocolViolation: " + str, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends d {
        /* JADX WARN: Multi-variable type inference failed */
        public f() {
            super("Receive timeout", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends d {
        public g(String str, Throwable th) {
            super(str, th, null);
        }

        public /* synthetic */ g(String str, Throwable th, int i8, AbstractC2633k abstractC2633k) {
            this(str, (i8 & 2) != 0 ? null : th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends d {
        /* JADX WARN: Multi-variable type inference failed */
        public h() {
            super("Unexpected Workstation ID received from server", null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ d(String str, Throwable th, AbstractC2633k abstractC2633k) {
        this(str, th);
    }

    public /* synthetic */ d(String str, Throwable th, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : th, null);
    }

    public d(String str, Throwable th) {
        super(str, th);
    }
}
