package J7;

import D6.C0933m;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f4429h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f4435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f4436g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public x() {
        this.f4430a = new byte[8192];
        this.f4434e = true;
        this.f4433d = false;
    }

    public final void a() {
        int i8;
        x xVar = this.f4436g;
        if (xVar == this) {
            throw new IllegalStateException("cannot compact");
        }
        kotlin.jvm.internal.t.d(xVar);
        if (xVar.f4434e) {
            int i9 = this.f4432c - this.f4431b;
            x xVar2 = this.f4436g;
            kotlin.jvm.internal.t.d(xVar2);
            int i10 = 8192 - xVar2.f4432c;
            x xVar3 = this.f4436g;
            kotlin.jvm.internal.t.d(xVar3);
            if (xVar3.f4433d) {
                i8 = 0;
            } else {
                x xVar4 = this.f4436g;
                kotlin.jvm.internal.t.d(xVar4);
                i8 = xVar4.f4431b;
            }
            if (i9 > i10 + i8) {
                return;
            }
            x xVar5 = this.f4436g;
            kotlin.jvm.internal.t.d(xVar5);
            g(xVar5, i9);
            b();
            y.b(this);
        }
    }

    public final x b() {
        x xVar = this.f4435f;
        if (xVar == this) {
            xVar = null;
        }
        x xVar2 = this.f4436g;
        kotlin.jvm.internal.t.d(xVar2);
        xVar2.f4435f = this.f4435f;
        x xVar3 = this.f4435f;
        kotlin.jvm.internal.t.d(xVar3);
        xVar3.f4436g = this.f4436g;
        this.f4435f = null;
        this.f4436g = null;
        return xVar;
    }

    public final x c(x segment) {
        kotlin.jvm.internal.t.g(segment, "segment");
        segment.f4436g = this;
        segment.f4435f = this.f4435f;
        x xVar = this.f4435f;
        kotlin.jvm.internal.t.d(xVar);
        xVar.f4436g = segment;
        this.f4435f = segment;
        return segment;
    }

    public final x d() {
        this.f4433d = true;
        return new x(this.f4430a, this.f4431b, this.f4432c, true, false);
    }

    public final x e(int i8) {
        x xVarC;
        if (i8 <= 0 || i8 > this.f4432c - this.f4431b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i8 >= 1024) {
            xVarC = d();
        } else {
            xVarC = y.c();
            byte[] bArr = this.f4430a;
            byte[] bArr2 = xVarC.f4430a;
            int i9 = this.f4431b;
            C0933m.j(bArr, bArr2, 0, i9, i9 + i8, 2, null);
        }
        xVarC.f4432c = xVarC.f4431b + i8;
        this.f4431b += i8;
        x xVar = this.f4436g;
        kotlin.jvm.internal.t.d(xVar);
        xVar.c(xVarC);
        return xVarC;
    }

    public final x f() {
        byte[] bArr = this.f4430a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.t.f(bArrCopyOf, "copyOf(...)");
        return new x(bArrCopyOf, this.f4431b, this.f4432c, false, true);
    }

    public final void g(x sink, int i8) {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (!sink.f4434e) {
            throw new IllegalStateException("only owner can write");
        }
        int i9 = sink.f4432c;
        if (i9 + i8 > 8192) {
            if (sink.f4433d) {
                throw new IllegalArgumentException();
            }
            int i10 = sink.f4431b;
            if ((i9 + i8) - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f4430a;
            C0933m.j(bArr, bArr, 0, i10, i9, 2, null);
            sink.f4432c -= sink.f4431b;
            sink.f4431b = 0;
        }
        byte[] bArr2 = this.f4430a;
        byte[] bArr3 = sink.f4430a;
        int i11 = sink.f4432c;
        int i12 = this.f4431b;
        C0933m.d(bArr2, bArr3, i11, i12, i12 + i8);
        sink.f4432c += i8;
        this.f4431b += i8;
    }

    public x(byte[] data, int i8, int i9, boolean z8, boolean z9) {
        kotlin.jvm.internal.t.g(data, "data");
        this.f4430a = data;
        this.f4431b = i8;
        this.f4432c = i9;
        this.f4433d = z8;
        this.f4434e = z9;
    }
}
