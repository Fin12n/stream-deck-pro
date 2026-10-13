package p112m3;

import J7.C1034e;
import J7.InterfaceC1035f;
import J7.g;
import J7.h;
import J7.s;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f30020g = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f30022b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f30023c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f30024d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30026f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f30027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f30028b;

        public a(String[] strArr, s sVar) {
            this.f30027a = strArr;
            this.f30028b = sVar;
        }

        public static a a(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                C1034e c1034e = new C1034e();
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    c.i0(c1034e, strArr[i8]);
                    c1034e.readByte();
                    hVarArr[i8] = c1034e.a1();
                }
                return new a((String[]) strArr.clone(), s.F(hVarArr));
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i8 = 0; i8 <= 31; i8++) {
            f30020g[i8] = String.format("\\u%04x", Integer.valueOf(i8));
        }
        String[] strArr = f30020g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static c v(g gVar) {
        return new e(gVar);
    }

    public abstract int A(a aVar);

    public abstract String F0();

    public abstract String G();

    public abstract void R();

    public abstract void Y();

    public abstract void c();

    public abstract void j();

    public final p112m3.b j0(String str) throws p112m3.b {
        throw new p112m3.b(str + " at path " + w());
    }

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract boolean o();

    public abstract boolean t();

    public abstract void u();

    public final String w() {
        return d.a(this.f30021a, this.f30022b, this.f30023c, this.f30024d);
    }

    public abstract void x();

    public abstract b y();

    public final void z(int i8) {
        int i9 = this.f30021a;
        int[] iArr = this.f30022b;
        if (i9 == iArr.length) {
            if (i9 == 256) {
                throw new p112m3.a("Nesting too deep at " + w());
            }
            this.f30022b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f30023c;
            this.f30023c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f30024d;
            this.f30024d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f30022b;
        int i10 = this.f30021a;
        this.f30021a = i10 + 1;
        iArr3[i10] = i8;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    public static void i0(InterfaceC1035f interfaceC1035f, String str) {
        String str2;
        String[] strArr = f30020g;
        interfaceC1035f.writeByte(34);
        int length = str.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i8 < i9) {
                        interfaceC1035f.b1(str, i8, i9);
                    }
                    interfaceC1035f.I0(str2);
                    i8 = i9 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = bGZGhbtQmA.CVD;
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i8 < i9) {
                    interfaceC1035f.b1(str, i8, i9);
                }
                interfaceC1035f.I0(str2);
                i8 = i9 + 1;
            }
        }
        if (i8 < length) {
            interfaceC1035f.b1(str, i8, length);
        }
        interfaceC1035f.writeByte(34);
    }
}
