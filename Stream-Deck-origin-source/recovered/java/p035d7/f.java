package p035d7;

import Q6.k;
import Q6.o;
import X6.h;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import kotlin.jvm.internal.C2639q;
import p017b7.InterfaceC1795l;
import p062g7.G;
import p062g7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f19918a = new l(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f19919b = J.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f19920c = J.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", ModuleDescriptor.MODULE_VERSION, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f19921d = new G("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G f19922e = new G("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final G f19923f = new G("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final G f19924g = new G("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final G f19925h = new G("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final G f19926i = new G("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final G f19927j = new G("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final G f19928k = new G("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final G f19929l = new G("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final G f19930m = new G("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final G f19931n = new G("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final G f19932o = new G("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final G f19933p = new G("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final G f19934q = new G("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final G f19935r = new G("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final G f19936s = new G("NO_CLOSE_CAUSE");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19937a = new a();

        public a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final l h(long j8, l lVar) {
            return f.x(j8, lVar);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return h(((Number) obj).longValue(), (l) obj2);
        }
    }

    public static final long A(int i8) {
        if (i8 == 0) {
            return 0L;
        }
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean B(InterfaceC1795l interfaceC1795l, Object obj, k kVar) {
        Object objF = interfaceC1795l.F(obj, null, kVar);
        if (objF == null) {
            return false;
        }
        interfaceC1795l.K(objF);
        return true;
    }

    public static /* synthetic */ boolean C(InterfaceC1795l interfaceC1795l, Object obj, k kVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            kVar = null;
        }
        return B(interfaceC1795l, obj, kVar);
    }

    public static final long v(long j8, boolean z8) {
        return (z8 ? 4611686018427387904L : 0L) + j8;
    }

    public static final long w(long j8, int i8) {
        return (((long) i8) << 60) + j8;
    }

    public static final l x(long j8, l lVar) {
        return new l(j8, lVar, lVar.y(), 0);
    }

    public static final h y() {
        return a.f19937a;
    }

    public static final G z() {
        return f19929l;
    }
}
