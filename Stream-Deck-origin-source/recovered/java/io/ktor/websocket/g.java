package io.ktor.websocket;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f25660a = new AtomicReference(a.HEADER0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f25669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f25670k;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        HEADER0,
        LENGTH,
        MASK_KEY,
        BODY
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25676a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HEADER0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.MASK_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.BODY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f25676a = iArr;
        }
    }

    public final void a() {
        if (!X.i.a(this.f25660a, a.BODY, a.HEADER0)) {
            throw new IllegalStateException("It should be state BODY but it is " + this.f25660a.get());
        }
        this.f25666g = 0;
        this.f25669j = 0L;
        this.f25668i = 0;
        this.f25670k = null;
    }

    public final void b(ByteBuffer bb) {
        kotlin.jvm.internal.t.g(bb, "bb");
        if (kotlin.jvm.internal.t.c(bb.order(), ByteOrder.BIG_ENDIAN)) {
            while (k(bb)) {
            }
            return;
        }
        throw new IllegalArgumentException(("Buffer order should be BIG_ENDIAN but it is " + bb.order()).toString());
    }

    public final boolean c() {
        return this.f25660a.get() == a.BODY;
    }

    public final boolean d() {
        return this.f25661b;
    }

    public final i e() {
        i iVarA = i.f25678c.a(this.f25666g);
        if (iVarA != null) {
            return iVarA;
        }
        throw new IllegalStateException("Unsupported opcode " + Integer.toHexString(this.f25666g));
    }

    public final long f() {
        return this.f25669j;
    }

    public final Integer g() {
        return this.f25670k;
    }

    public final boolean h() {
        return this.f25662c;
    }

    public final boolean i() {
        return this.f25663d;
    }

    public final boolean j() {
        return this.f25664e;
    }

    public final boolean k(ByteBuffer byteBuffer) {
        Object obj = this.f25660a.get();
        kotlin.jvm.internal.t.d(obj);
        int i8 = b.f25676a[((a) obj).ordinal()];
        if (i8 == 1) {
            return l(byteBuffer);
        }
        if (i8 == 2) {
            return m(byteBuffer);
        }
        if (i8 == 3) {
            return n(byteBuffer);
        }
        if (i8 == 4) {
            return false;
        }
        throw new C6.m();
    }

    public final boolean l(ByteBuffer byteBuffer) throws l {
        int i8 = 0;
        if (byteBuffer.remaining() < 2) {
            return false;
        }
        byte b8 = byteBuffer.get();
        byte b9 = byteBuffer.get();
        this.f25661b = (b8 & 128) != 0;
        this.f25662c = (b8 & 64) != 0;
        this.f25663d = (b8 & 32) != 0;
        this.f25664e = (b8 & 16) != 0;
        int i9 = b8 & 15;
        this.f25666g = i9;
        if (i9 == 0 && this.f25667h == 0) {
            throw new l("Can't continue finished frames");
        }
        if (i9 == 0) {
            this.f25666g = this.f25667h;
        } else if (this.f25667h != 0 && !e().d()) {
            throw new l("Can't start new data frame before finishing previous one");
        }
        if (!e().d()) {
            this.f25667h = this.f25661b ? 0 : this.f25666g;
        } else if (!this.f25661b) {
            throw new l("control frames can't be fragmented");
        }
        this.f25665f = (b9 & 128) != 0;
        int i10 = b9 & 127;
        if (e().d() && i10 > 125) {
            throw new l("control frames can't be larger than 125 bytes");
        }
        if (i10 == 126) {
            i8 = 2;
        } else if (i10 == 127) {
            i8 = 8;
        }
        this.f25668i = i8;
        this.f25669j = i8 == 0 ? i10 : 0L;
        if (i8 > 0) {
            this.f25660a.set(a.LENGTH);
        } else if (this.f25665f) {
            this.f25660a.set(a.MASK_KEY);
        } else {
            this.f25660a.set(a.BODY);
        }
        return true;
    }

    public final boolean m(ByteBuffer byteBuffer) {
        long j8;
        int iRemaining = byteBuffer.remaining();
        int i8 = this.f25668i;
        if (iRemaining < i8) {
            return false;
        }
        if (i8 == 2) {
            j8 = ((long) byteBuffer.getShort()) & 65535;
        } else {
            if (i8 != 8) {
                throw new IllegalStateException();
            }
            j8 = byteBuffer.getLong();
        }
        this.f25669j = j8;
        this.f25660a.set(this.f25665f ? a.MASK_KEY : a.BODY);
        return true;
    }

    public final boolean n(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            return false;
        }
        this.f25670k = Integer.valueOf(byteBuffer.getInt());
        this.f25660a.set(a.BODY);
        return true;
    }
}
