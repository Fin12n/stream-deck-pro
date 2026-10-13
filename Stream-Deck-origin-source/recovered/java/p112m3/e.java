package p112m3;

import J7.C1034e;
import J7.g;
import J7.h;
import com.amazon.a.a.o.b;
import com.elgato.streamdeck.vsd2.KnownHost;
import java.io.EOFException;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f30040n = h.d("'\\");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h f30041o = h.d("\"\\");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f30042p = h.d("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f30043q = h.d("\n\r");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f30044r = h.d("*/");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f30045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1034e f30046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30047j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f30048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f30050m;

    public e(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f30045h = gVar;
        this.f30046i = gVar.H();
        z(6);
    }

    @Override // p112m3.c
    public int A(c.a aVar) throws b, EOFException {
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 < 12 || iW0 > 15) {
            return -1;
        }
        if (iW0 == 15) {
            return A0(this.f30050m, aVar);
        }
        int iY0 = this.f30045h.y0(aVar.f30028b);
        if (iY0 != -1) {
            this.f30047j = 0;
            this.f30023c[this.f30021a - 1] = aVar.f30027a[iY0];
            return iY0;
        }
        String str = this.f30023c[this.f30021a - 1];
        String strF0 = F0();
        int iA0 = A0(strF0, aVar);
        if (iA0 == -1) {
            this.f30047j = 15;
            this.f30050m = strF0;
            this.f30023c[this.f30021a - 1] = str;
        }
        return iA0;
    }

    public final int A0(String str, c.a aVar) {
        int length = aVar.f30027a.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(aVar.f30027a[i8])) {
                this.f30047j = 0;
                this.f30023c[this.f30021a - 1] = str;
                return i8;
            }
        }
        return -1;
    }

    @Override // p112m3.c
    public String F0() throws b, EOFException {
        String strL0;
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 14) {
            strL0 = O0();
        } else if (iW0 == 13) {
            strL0 = L0(f30041o);
        } else if (iW0 == 12) {
            strL0 = L0(f30040n);
        } else {
            if (iW0 != 15) {
                throw new a("Expected a name but was " + y() + " at path " + w());
            }
            strL0 = this.f30050m;
        }
        this.f30047j = 0;
        this.f30023c[this.f30021a - 1] = strL0;
        return strL0;
    }

    @Override // p112m3.c
    public String G() throws b, EOFException {
        String strP1;
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 10) {
            strP1 = O0();
        } else if (iW0 == 9) {
            strP1 = L0(f30041o);
        } else if (iW0 == 8) {
            strP1 = L0(f30040n);
        } else if (iW0 == 11) {
            strP1 = this.f30050m;
            this.f30050m = null;
        } else if (iW0 == 16) {
            strP1 = Long.toString(this.f30048k);
        } else {
            if (iW0 != 17) {
                throw new a("Expected a string but was " + y() + " at path " + w());
            }
            strP1 = this.f30046i.p1(this.f30049l);
        }
        this.f30047j = 0;
        int[] iArr = this.f30024d;
        int i8 = this.f30021a - 1;
        iArr[i8] = iArr[i8] + 1;
        return strP1;
    }

    public final boolean H0(int i8) throws b {
        if (i8 == 9 || i8 == 10 || i8 == 12 || i8 == 13 || i8 == 32) {
            return false;
        }
        if (i8 != 35) {
            if (i8 == 44) {
                return false;
            }
            if (i8 != 47 && i8 != 61) {
                if (i8 == 123 || i8 == 125 || i8 == 58) {
                    return false;
                }
                if (i8 != 59) {
                    switch (i8) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        r0();
        return false;
    }

    public final int J0(boolean z8) throws b, EOFException {
        byte bW0;
        while (true) {
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (!this.f30045h.request(i9)) {
                    if (z8) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bW0 = this.f30046i.w0(i8);
                if (bW0 == 10 || bW0 == 32 || bW0 == 13 || bW0 == 9) {
                    i8 = i9;
                }
            }
            this.f30046i.skip(i8);
            if (bW0 == 47) {
                if (this.f30045h.request(2L)) {
                    r0();
                    byte bW1 = this.f30046i.w0(1L);
                    if (bW1 == 42) {
                        this.f30046i.readByte();
                        this.f30046i.readByte();
                        if (!g1()) {
                            throw j0("Unterminated comment");
                        }
                    } else if (bW1 == 47) {
                        this.f30046i.readByte();
                        this.f30046i.readByte();
                        i1();
                    }
                }
                return bW0;
            }
            if (bW0 != 35) {
                return bW0;
            }
            r0();
            i1();
        }
    }

    public final String L0(h hVar) throws b, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jG1 = this.f30045h.G1(hVar);
            if (jG1 == -1) {
                throw j0("Unterminated string");
            }
            if (this.f30046i.w0(jG1) != 92) {
                if (sb == null) {
                    String strP1 = this.f30046i.p1(jG1);
                    this.f30046i.readByte();
                    return strP1;
                }
                sb.append(this.f30046i.p1(jG1));
                this.f30046i.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f30046i.p1(jG1));
            this.f30046i.readByte();
            sb.append(V0());
        }
    }

    public final String O0() {
        long jG1 = this.f30045h.G1(f30042p);
        return jG1 != -1 ? this.f30046i.p1(jG1) : this.f30046i.o1();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int Q0() throws EOFException {
        String str;
        String str2;
        int i8;
        byte bW0 = this.f30046i.w0(0L);
        if (bW0 == 116 || bW0 == 84) {
            str = b.af;
            str2 = "TRUE";
            i8 = 5;
        } else if (bW0 == 102 || bW0 == 70) {
            str = b.ag;
            str2 = "FALSE";
            i8 = 6;
        } else {
            if (bW0 != 110 && bW0 != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i8 = 7;
        }
        int length = str.length();
        int i9 = 1;
        while (i9 < length) {
            int i10 = i9 + 1;
            if (!this.f30045h.request(i10)) {
                return 0;
            }
            byte bW1 = this.f30046i.w0(i9);
            if (bW1 != str.charAt(i9) && bW1 != str2.charAt(i9)) {
                return 0;
            }
            i9 = i10;
        }
        if (this.f30045h.request(length + 1) && H0(this.f30046i.w0(length))) {
            return 0;
        }
        this.f30046i.skip(length);
        this.f30047j = i8;
        return i8;
    }

    @Override // p112m3.c
    public void R() throws b, EOFException {
        if (this.f30026f) {
            throw new a("Cannot skip unexpected " + y() + " at " + w());
        }
        int i8 = 0;
        do {
            int iW0 = this.f30047j;
            if (iW0 == 0) {
                iW0 = w0();
            }
            if (iW0 == 3) {
                z(1);
            } else {
                if (iW0 == 1) {
                    z(3);
                } else if (iW0 == 4) {
                    i8--;
                    if (i8 < 0) {
                        throw new a("Expected a value but was " + y() + " at path " + w());
                    }
                    this.f30021a--;
                } else if (iW0 == 2) {
                    i8--;
                    if (i8 < 0) {
                        throw new a("Expected a value but was " + y() + " at path " + w());
                    }
                    this.f30021a--;
                } else if (iW0 == 14 || iW0 == 10) {
                    k1();
                } else if (iW0 == 9 || iW0 == 13) {
                    a1(f30041o);
                } else if (iW0 == 8 || iW0 == 12) {
                    a1(f30040n);
                } else if (iW0 == 17) {
                    this.f30046i.skip(this.f30049l);
                } else if (iW0 == 18) {
                    throw new a("Expected a value but was " + y() + " at path " + w());
                }
                this.f30047j = 0;
            }
            i8++;
            this.f30047j = 0;
        } while (i8 != 0);
        int[] iArr = this.f30024d;
        int i9 = this.f30021a;
        int i10 = i9 - 1;
        iArr[i10] = iArr[i10] + 1;
        this.f30023c[i9 - 1] = "null";
    }

    public final int T0() throws EOFException {
        long j8;
        int i8;
        boolean z8 = true;
        int i9 = 0;
        char c8 = 0;
        long j9 = 0;
        boolean z9 = false;
        while (true) {
            int i10 = i9 + 1;
            if (!this.f30045h.request(i10)) {
                j8 = 0;
                i8 = 0;
                break;
            }
            j8 = 0;
            byte bW0 = this.f30046i.w0(i9);
            i8 = 0;
            if (bW0 != 43) {
                if (bW0 == 69 || bW0 == 101) {
                    if (c8 != 2 && c8 != 4) {
                        return 0;
                    }
                    c8 = 5;
                } else if (bW0 != 45) {
                    if (bW0 != 46) {
                        if (bW0 < 48 || bW0 > 57) {
                            if (!H0(bW0)) {
                                break;
                            }
                            return 0;
                        }
                        if (c8 == 1 || c8 == 0) {
                            j9 = -(bW0 - 48);
                            c8 = 2;
                        } else if (c8 == 2) {
                            if (j9 == 0) {
                                return 0;
                            }
                            long j10 = (10 * j9) - ((long) (bW0 - 48));
                            z8 &= j9 > -922337203685477580L || (j9 == -922337203685477580L && j10 < j9);
                            j9 = j10;
                        } else if (c8 == 3) {
                            c8 = 4;
                        } else if (c8 == 5 || c8 == 6) {
                            c8 = 7;
                        }
                    } else {
                        if (c8 != 2) {
                            return 0;
                        }
                        c8 = 3;
                    }
                } else if (c8 == 0) {
                    c8 = 1;
                    z9 = true;
                } else if (c8 != 5) {
                    return 0;
                }
                i9 = i10;
            } else if (c8 != 5) {
                return 0;
            }
            c8 = 6;
            i9 = i10;
        }
        if (c8 == 2 && z8 && ((j9 != Long.MIN_VALUE || z9) && (j9 != j8 || !z9))) {
            if (!z9) {
                j9 = -j9;
            }
            this.f30048k = j9;
            this.f30046i.skip(i9);
            this.f30047j = 16;
            return 16;
        }
        if (c8 != 2 && c8 != 4 && c8 != 7) {
            return i8;
        }
        this.f30049l = i9;
        this.f30047j = 17;
        return 17;
    }

    public final char V0() throws b, EOFException {
        int i8;
        if (!this.f30045h.request(1L)) {
            throw j0("Unterminated escape sequence");
        }
        byte b8 = this.f30046i.readByte();
        if (b8 == 10 || b8 == 34 || b8 == 39 || b8 == 47 || b8 == 92) {
            return (char) b8;
        }
        if (b8 == 98) {
            return '\b';
        }
        if (b8 == 102) {
            return '\f';
        }
        if (b8 == 110) {
            return '\n';
        }
        if (b8 == 114) {
            return '\r';
        }
        if (b8 == 116) {
            return '\t';
        }
        if (b8 != 117) {
            if (this.f30025e) {
                return (char) b8;
            }
            throw j0("Invalid escape sequence: \\" + ((char) b8));
        }
        if (!this.f30045h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + w());
        }
        char c8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            byte bW0 = this.f30046i.w0(i9);
            char c9 = (char) (c8 << 4);
            if (bW0 >= 48 && bW0 <= 57) {
                i8 = bW0 - 48;
            } else if (bW0 >= 97 && bW0 <= 102) {
                i8 = bW0 - 87;
            } else {
                if (bW0 < 65 || bW0 > 70) {
                    throw j0("\\u" + this.f30046i.p1(4L));
                }
                i8 = bW0 - 55;
            }
            c8 = (char) (c9 + i8);
        }
        this.f30046i.skip(4L);
        return c8;
    }

    @Override // p112m3.c
    public void Y() throws b, EOFException {
        if (this.f30026f) {
            throw new a("Cannot skip unexpected " + y() + " at " + w());
        }
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 14) {
            k1();
        } else if (iW0 == 13) {
            a1(f30041o);
        } else if (iW0 == 12) {
            a1(f30040n);
        } else if (iW0 != 15) {
            throw new a("Expected a name but was " + y() + " at path " + w());
        }
        this.f30047j = 0;
        this.f30023c[this.f30021a - 1] = "null";
    }

    public final void a1(h hVar) throws b, EOFException {
        while (true) {
            long jG1 = this.f30045h.G1(hVar);
            if (jG1 == -1) {
                throw j0("Unterminated string");
            }
            if (this.f30046i.w0(jG1) != 92) {
                this.f30046i.skip(jG1 + 1);
                return;
            } else {
                this.f30046i.skip(jG1 + 1);
                V0();
            }
        }
    }

    @Override // p112m3.c
    public void c() throws b, EOFException {
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 3) {
            z(1);
            this.f30024d[this.f30021a - 1] = 0;
            this.f30047j = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + y() + " at path " + w());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f30047j = 0;
        this.f30022b[0] = 8;
        this.f30021a = 1;
        this.f30046i.b();
        this.f30045h.close();
    }

    public final boolean g1() throws EOFException {
        g gVar = this.f30045h;
        h hVar = f30044r;
        long jC0 = gVar.C0(hVar);
        boolean z8 = jC0 != -1;
        C1034e c1034e = this.f30046i;
        c1034e.skip(z8 ? jC0 + ((long) hVar.H()) : c1034e.size());
        return z8;
    }

    public final void i1() throws EOFException {
        long jG1 = this.f30045h.G1(f30043q);
        C1034e c1034e = this.f30046i;
        c1034e.skip(jG1 != -1 ? jG1 + 1 : c1034e.size());
    }

    public final void k1() throws EOFException {
        long jG1 = this.f30045h.G1(f30042p);
        C1034e c1034e = this.f30046i;
        if (jG1 == -1) {
            jG1 = c1034e.size();
        }
        c1034e.skip(jG1);
    }

    @Override // p112m3.c
    public double nextDouble() throws b, EOFException {
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 16) {
            this.f30047j = 0;
            int[] iArr = this.f30024d;
            int i8 = this.f30021a - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f30048k;
        }
        if (iW0 == 17) {
            this.f30050m = this.f30046i.p1(this.f30049l);
        } else if (iW0 == 9) {
            this.f30050m = L0(f30041o);
        } else if (iW0 == 8) {
            this.f30050m = L0(f30040n);
        } else if (iW0 == 10) {
            this.f30050m = O0();
        } else if (iW0 != 11) {
            throw new a("Expected a double but was " + y() + " at path " + w());
        }
        this.f30047j = 11;
        try {
            double d8 = Double.parseDouble(this.f30050m);
            if (this.f30025e || !(Double.isNaN(d8) || Double.isInfinite(d8))) {
                this.f30050m = null;
                this.f30047j = 0;
                int[] iArr2 = this.f30024d;
                int i9 = this.f30021a - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return d8;
            }
            throw new b("JSON forbids NaN and infinities: " + d8 + " at path " + w());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f30050m + " at path " + w());
        }
    }

    @Override // p112m3.c
    public int nextInt() throws b, EOFException {
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 16) {
            long j8 = this.f30048k;
            int i8 = (int) j8;
            if (j8 == i8) {
                this.f30047j = 0;
                int[] iArr = this.f30024d;
                int i9 = this.f30021a - 1;
                iArr[i9] = iArr[i9] + 1;
                return i8;
            }
            throw new a("Expected an int but was " + this.f30048k + " at path " + w());
        }
        if (iW0 == 17) {
            this.f30050m = this.f30046i.p1(this.f30049l);
        } else if (iW0 == 9 || iW0 == 8) {
            String strL0 = iW0 == 9 ? L0(f30041o) : L0(f30040n);
            this.f30050m = strL0;
            try {
                int i10 = Integer.parseInt(strL0);
                this.f30047j = 0;
                int[] iArr2 = this.f30024d;
                int i11 = this.f30021a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return i10;
            } catch (NumberFormatException unused) {
            }
        } else if (iW0 != 11) {
            throw new a("Expected an int but was " + y() + " at path " + w());
        }
        this.f30047j = 11;
        try {
            double d8 = Double.parseDouble(this.f30050m);
            int i12 = (int) d8;
            if (i12 == d8) {
                this.f30050m = null;
                this.f30047j = 0;
                int[] iArr3 = this.f30024d;
                int i13 = this.f30021a - 1;
                iArr3[i13] = iArr3[i13] + 1;
                return i12;
            }
            throw new a("Expected an int but was " + this.f30050m + " at path " + w());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f30050m + " at path " + w());
        }
    }

    @Override // p112m3.c
    public boolean o() throws b, EOFException {
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        return (iW0 == 2 || iW0 == 4 || iW0 == 18) ? false : true;
    }

    public final void r0() throws b {
        if (!this.f30025e) {
            throw j0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    @Override // p112m3.c
    public boolean t() throws b, EOFException {
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 5) {
            this.f30047j = 0;
            int[] iArr = this.f30024d;
            int i8 = this.f30021a - 1;
            iArr[i8] = iArr[i8] + 1;
            return true;
        }
        if (iW0 == 6) {
            this.f30047j = 0;
            int[] iArr2 = this.f30024d;
            int i9 = this.f30021a - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + y() + " at path " + w());
    }

    public String toString() {
        return "JsonReader(" + this.f30045h + ")";
    }

    @Override // p112m3.c
    public void u() throws b, EOFException {
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 != 2) {
            throw new a("Expected END_OBJECT but was " + y() + " at path " + w());
        }
        int i8 = this.f30021a;
        int i9 = i8 - 1;
        this.f30021a = i9;
        this.f30023c[i9] = null;
        int[] iArr = this.f30024d;
        int i10 = i8 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f30047j = 0;
    }

    public final int w0() throws b, EOFException {
        int[] iArr = this.f30022b;
        int i8 = this.f30021a;
        int i9 = iArr[i8 - 1];
        if (i9 == 1) {
            iArr[i8 - 1] = 2;
        } else if (i9 == 2) {
            int iJ0 = J0(true);
            this.f30046i.readByte();
            if (iJ0 != 44) {
                if (iJ0 != 59) {
                    if (iJ0 != 93) {
                        throw j0("Unterminated array");
                    }
                    this.f30047j = 4;
                    return 4;
                }
                r0();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8 - 1] = 4;
                if (i9 == 5) {
                    int iJ1 = J0(true);
                    this.f30046i.readByte();
                    if (iJ1 != 44) {
                        if (iJ1 != 59) {
                            if (iJ1 != 125) {
                                throw j0("Unterminated object");
                            }
                            this.f30047j = 2;
                            return 2;
                        }
                        r0();
                    }
                }
                int iJ2 = J0(true);
                if (iJ2 == 34) {
                    this.f30046i.readByte();
                    this.f30047j = 13;
                    return 13;
                }
                if (iJ2 == 39) {
                    this.f30046i.readByte();
                    r0();
                    this.f30047j = 12;
                    return 12;
                }
                if (iJ2 != 125) {
                    r0();
                    if (!H0((char) iJ2)) {
                        throw j0("Expected name");
                    }
                    this.f30047j = 14;
                    return 14;
                }
                if (i9 == 5) {
                    throw j0("Expected name");
                }
                this.f30046i.readByte();
                this.f30047j = 2;
                return 2;
            }
            if (i9 == 4) {
                iArr[i8 - 1] = 5;
                int iJ3 = J0(true);
                this.f30046i.readByte();
                if (iJ3 != 58) {
                    if (iJ3 != 61) {
                        throw j0("Expected ':'");
                    }
                    r0();
                    if (this.f30045h.request(1L) && this.f30046i.w0(0L) == 62) {
                        this.f30046i.readByte();
                    }
                }
            } else if (i9 == 6) {
                iArr[i8 - 1] = 7;
            } else if (i9 == 7) {
                if (J0(false) == -1) {
                    this.f30047j = 18;
                    return 18;
                }
                r0();
            } else if (i9 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iJ4 = J0(true);
        if (iJ4 == 34) {
            this.f30046i.readByte();
            this.f30047j = 9;
            return 9;
        }
        if (iJ4 == 39) {
            r0();
            this.f30046i.readByte();
            this.f30047j = 8;
            return 8;
        }
        if (iJ4 != 44 && iJ4 != 59) {
            if (iJ4 == 91) {
                this.f30046i.readByte();
                this.f30047j = 3;
                return 3;
            }
            if (iJ4 != 93) {
                if (iJ4 == 123) {
                    this.f30046i.readByte();
                    this.f30047j = 1;
                    return 1;
                }
                int iQ0 = Q0();
                if (iQ0 != 0) {
                    return iQ0;
                }
                int iT0 = T0();
                if (iT0 != 0) {
                    return iT0;
                }
                if (!H0(this.f30046i.w0(0L))) {
                    throw j0("Expected value");
                }
                r0();
                this.f30047j = 10;
                return 10;
            }
            if (i9 == 1) {
                this.f30046i.readByte();
                this.f30047j = 4;
                return 4;
            }
        }
        if (i9 != 1 && i9 != 2) {
            throw j0("Unexpected value");
        }
        r0();
        this.f30047j = 7;
        return 7;
    }

    @Override // p112m3.c
    public void x() throws b, EOFException {
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 1) {
            z(3);
            this.f30047j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + y() + " at path " + w());
    }

    @Override // p112m3.c
    public c.b y() throws b, EOFException {
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        switch (iW0) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                return c.b.NAME;
            case 16:
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p112m3.c
    public void j() throws b, EOFException {
        int iW0 = this.f30047j;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 != 4) {
            throw new a(jULK.bZIP + y() + " at path " + w());
        }
        int i8 = this.f30021a;
        this.f30021a = i8 - 1;
        int[] iArr = this.f30024d;
        int i9 = i8 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f30047j = 0;
    }
}
