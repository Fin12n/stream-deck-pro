package p205x6;

import C6.C0920i;
import Z6.C1694a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0842a f37418g = new C0842a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f37419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37424f;

    /* JADX INFO: renamed from: x6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0842a {
        public /* synthetic */ C0842a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final a a() {
            return p213y6.a.f38436j.a();
        }

        public C0842a() {
        }
    }

    public /* synthetic */ a(ByteBuffer byteBuffer, AbstractC2633k abstractC2633k) {
        this(byteBuffer);
    }

    public final void a(int i8) {
        int i9 = this.f37421c + i8;
        if (i8 < 0 || i9 > this.f37423e) {
            d.a(i8, g() - k());
            throw new C0920i();
        }
        this.f37421c = i9;
    }

    public final boolean b(int i8) {
        int i9 = this.f37423e;
        int i10 = this.f37421c;
        if (i8 < i10) {
            d.a(i8 - i10, g() - k());
            throw new C0920i();
        }
        if (i8 < i9) {
            this.f37421c = i8;
            return true;
        }
        if (i8 == i9) {
            this.f37421c = i8;
            return false;
        }
        d.a(i8 - i10, g() - k());
        throw new C0920i();
    }

    public final void c(int i8) {
        if (i8 == 0) {
            return;
        }
        int i9 = this.f37420b + i8;
        if (i8 < 0 || i9 > this.f37421c) {
            d.b(i8, k() - i());
            throw new C0920i();
        }
        this.f37420b = i9;
    }

    public final void d(int i8) {
        if (i8 < 0 || i8 > this.f37421c) {
            d.b(i8 - this.f37420b, k() - i());
            throw new C0920i();
        }
        if (this.f37420b != i8) {
            this.f37420b = i8;
        }
    }

    public void e(a copy) {
        t.g(copy, "copy");
        copy.f37423e = this.f37423e;
        copy.f37422d = this.f37422d;
        copy.f37420b = this.f37420b;
        copy.f37421c = this.f37421c;
    }

    public final int f() {
        return this.f37424f;
    }

    public final int g() {
        return this.f37423e;
    }

    public final ByteBuffer h() {
        return this.f37419a;
    }

    public final int i() {
        return this.f37420b;
    }

    public final int j() {
        return this.f37422d;
    }

    public final int k() {
        return this.f37421c;
    }

    public final byte l() throws EOFException {
        int i8 = this.f37420b;
        if (i8 == this.f37421c) {
            throw new EOFException("No readable bytes available.");
        }
        this.f37420b = i8 + 1;
        return this.f37419a.get(i8);
    }

    public final void m() {
        this.f37423e = this.f37424f;
    }

    public final void n() {
        o(0);
        m();
    }

    public final void o(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("newReadPosition shouldn't be negative: " + i8).toString());
        }
        if (i8 <= this.f37420b) {
            this.f37420b = i8;
            if (this.f37422d > i8) {
                this.f37422d = i8;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("newReadPosition shouldn't be ahead of the read position: " + i8 + " > " + this.f37420b).toString());
    }

    public final void p(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("endGap shouldn't be negative: " + i8).toString());
        }
        int i9 = this.f37424f - i8;
        if (i9 >= this.f37421c) {
            this.f37423e = i9;
            return;
        }
        if (i9 < 0) {
            d.c(this, i8);
        }
        if (i9 < this.f37422d) {
            d.e(this, i8);
        }
        if (this.f37420b != this.f37421c) {
            d.d(this, i8);
            return;
        }
        this.f37423e = i9;
        this.f37420b = i9;
        this.f37421c = i9;
    }

    public final void q(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("startGap shouldn't be negative: " + i8).toString());
        }
        int i9 = this.f37420b;
        if (i9 >= i8) {
            this.f37422d = i8;
            return;
        }
        if (i9 != this.f37421c) {
            d.g(this, i8);
            throw new C0920i();
        }
        if (i8 > this.f37423e) {
            d.h(this, i8);
            throw new C0920i();
        }
        this.f37421c = i8;
        this.f37420b = i8;
        this.f37422d = i8;
    }

    public void r() {
        n();
        t();
    }

    public final void s() {
        this.f37422d = 0;
        this.f37420b = 0;
        this.f37421c = this.f37424f;
    }

    public final void t() {
        u(this.f37424f - this.f37422d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Buffer[0x");
        String string = Integer.toString(hashCode(), C1694a.a(16));
        t.f(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        sb.append("](");
        sb.append(k() - i());
        sb.append(" used, ");
        sb.append(g() - k());
        sb.append(" free, ");
        sb.append(this.f37422d + (f() - g()));
        sb.append(" reserved of ");
        sb.append(this.f37424f);
        sb.append(')');
        return sb.toString();
    }

    public final void u(int i8) {
        int i9 = this.f37422d;
        this.f37420b = i9;
        this.f37421c = i9;
        this.f37423e = i8;
    }

    public final void v(byte b8) throws r {
        int i8 = this.f37421c;
        if (i8 == this.f37423e) {
            throw new r("No free space in the buffer to write a byte");
        }
        this.f37419a.put(i8, b8);
        this.f37421c = i8 + 1;
    }

    public a(ByteBuffer memory) {
        t.g(memory, "memory");
        this.f37419a = memory;
        this.f37423e = memory.limit();
        this.f37424f = memory.limit();
    }
}
