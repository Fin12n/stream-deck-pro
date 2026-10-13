package Z5;

import C6.C0920i;
import C6.G;
import C6.r;
import D6.C0938s;
import D6.I;
import D6.z;
import Q6.k;
import Q6.o;
import T0.Vl.PCRzgdeK;
import W6.i;
import X5.C1692v;
import io.ktor.utils.io.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z5.a f12927a = Z5.a.f12907b.b(C1692v.f11962b.a(), a.f12930a, b.f12931a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f12928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f12929c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12930a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C1692v it) {
            t.g(it, "it");
            return Integer.valueOf(it.e().length());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12931a = new b();

        public b() {
            super(2);
        }

        public final Character b(C1692v m8, int i8) {
            t.g(m8, "m");
            return Character.valueOf(m8.e().charAt(i8));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((C1692v) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f12936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12937f;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12936e = obj;
            this.f12937f |= Integer.MIN_VALUE;
            return e.g(null, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0050 A[PHI: r6
      0x0050: PHI (r6v2 long) = (r6v1 long), (r6v0 long) binds: [B:18:0x005e, B:13:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        long j8;
        i iVar = new i(0, 255);
        ArrayList arrayList = new ArrayList(C0938s.y(iVar, 10));
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            int iNextInt = ((I) it).nextInt();
            if (48 > iNextInt || iNextInt >= 58) {
                long j9 = iNextInt;
                long j10 = 97;
                if (j9 < 97 || j9 > 102) {
                    j10 = 65;
                    if (j9 < 65 || j9 > 70) {
                        j8 = -1;
                    } else {
                        j8 = (j9 - j10) + ((long) 10);
                    }
                } else {
                    j8 = (j9 - j10) + ((long) 10);
                }
            } else {
                j8 = ((long) iNextInt) - 48;
            }
            arrayList.add(Long.valueOf(j8));
        }
        f12928b = z.S0(arrayList);
        i iVar2 = new i(0, 15);
        ArrayList arrayList2 = new ArrayList(C0938s.y(iVar2, 10));
        Iterator it2 = iVar2.iterator();
        while (it2.hasNext()) {
            int iNextInt2 = ((I) it2).nextInt();
            arrayList2.add(Byte.valueOf((byte) (iNextInt2 < 10 ? iNextInt2 + 48 : (char) (((char) (iNextInt2 + 97)) - '\n'))));
        }
        f12929c = z.M0(arrayList2);
    }

    public static final boolean a(CharSequence charSequence, int i8, int i9, CharSequence other) {
        t.g(charSequence, "<this>");
        t.g(other, "other");
        if (i9 - i8 != other.length()) {
            return false;
        }
        for (int i10 = i8; i10 < i9; i10++) {
            int iCharAt = charSequence.charAt(i10);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            int iCharAt2 = other.charAt(i10 - i8);
            if (65 <= iCharAt2 && iCharAt2 < 91) {
                iCharAt2 += 32;
            }
            if (iCharAt != iCharAt2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean b(CharSequence charSequence, int i8, int i9, CharSequence charSequence2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = charSequence.length();
        }
        return a(charSequence, i8, i9, charSequence2);
    }

    public static final int c(CharSequence charSequence, int i8, int i9) {
        t.g(charSequence, "<this>");
        int i10 = 0;
        while (i8 < i9) {
            int iCharAt = charSequence.charAt(i8);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            i10 = (i10 * 31) + iCharAt;
            i8++;
        }
        return i10;
    }

    public static /* synthetic */ int d(CharSequence charSequence, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = charSequence.length();
        }
        return c(charSequence, i8, i9);
    }

    public static final Void e(CharSequence charSequence, int i8) {
        throw new NumberFormatException("Invalid HEX number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(j jVar, int i8, G6.d dVar) {
        c cVar;
        byte[] bArr;
        int i9;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f12937f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f12937f = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f12936e;
        Object objF = H6.c.f();
        int i11 = cVar.f12937f;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = cVar.f12935d;
            i8 = cVar.f12934c;
            bArr = (byte[]) cVar.f12933b;
            j jVar2 = (j) cVar.f12932a;
            r.b(obj);
            i9 = i12;
            jVar = jVar2;
            break;
        }
        r.b(obj);
        if (i8 <= 0) {
            throw new IllegalArgumentException("Does only work for positive numbers");
        }
        bArr = f12929c;
        int i13 = 0;
        while (true) {
            i9 = i13 + 1;
            if (i13 < 8) {
                int i14 = i8 >>> 28;
                i8 <<= 4;
                if (i14 != 0) {
                    byte b8 = bArr[i14];
                    cVar.f12932a = jVar;
                    cVar.f12933b = bArr;
                    cVar.f12934c = i8;
                    cVar.f12935d = i9;
                    cVar.f12937f = 1;
                    if (jVar.E(b8, cVar) != objF) {
                        break;
                    }
                } else {
                    i13 = i9;
                }
            }
            return objF;
        }
        while (true) {
            int i15 = i9 + 1;
            if (i9 >= 8) {
                return G.f1419a;
            }
            int i16 = i8 >>> 28;
            i8 <<= 4;
            byte b9 = bArr[i16];
            cVar.f12932a = jVar;
            cVar.f12933b = bArr;
            cVar.f12934c = i8;
            cVar.f12935d = i15;
            cVar.f12937f = 2;
            if (jVar.E(b9, cVar) == objF) {
                return objF;
            }
            i9 = i15;
        }
    }

    public static final long f(CharSequence charSequence) {
        t.g(charSequence, PCRzgdeK.QCZi);
        long[] jArr = f12928b;
        int length = charSequence.length();
        long j8 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int iCharAt = charSequence.charAt(i8) & 65535;
            long j9 = iCharAt < 255 ? jArr[iCharAt] : -1L;
            if (j9 == -1) {
                e(charSequence, i8);
                throw new C0920i();
            }
            j8 = (j8 << 4) | j9;
        }
        return j8;
    }
}
