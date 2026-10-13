package s7;

/* JADX INFO: renamed from: s7.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2905l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2905l f33289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f33290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f33291c;

    static {
        C2905l c2905l = new C2905l();
        f33289a = c2905l;
        f33290b = new char[117];
        f33291c = new byte[126];
        c2905l.f();
        c2905l.e();
    }

    public final void a(char c8, char c9) {
        b(c8, c9);
    }

    public final void b(int i8, char c8) {
        if (c8 != 'u') {
            f33290b[c8] = (char) i8;
        }
    }

    public final void c(char c8, byte b8) {
        d(c8, b8);
    }

    public final void d(int i8, byte b8) {
        f33291c[i8] = b8;
    }

    public final void e() {
        for (int i8 = 0; i8 < 33; i8++) {
            d(i8, (byte) 127);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    public final void f() {
        for (int i8 = 0; i8 < 32; i8++) {
            b(i8, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
