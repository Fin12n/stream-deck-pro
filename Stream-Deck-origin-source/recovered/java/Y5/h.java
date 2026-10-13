package Y5;

import C6.C0920i;
import D6.T;
import D6.r;
import D6.z;
import Q6.o;
import Z6.w;
import com.revenuecat.purchases.common.Constants;
import java.util.Set;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f12494a = T.g('/', '?', '#', '@');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z5.a f12495b = Z5.a.f12907b.a(r.q("HTTP/1.0", "HTTP/1.1"));

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f12499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f12500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12501f;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12500e = obj;
            this.f12501f |= Integer.MIN_VALUE;
            return h.g(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f12506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12507f;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12506e = obj;
            this.f12507f |= Integer.MIN_VALUE;
            return h.h(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f12508a = new c();

        public c() {
            super(2);
        }

        public final Boolean b(char c8, int i8) {
            return Boolean.valueOf(c8 == ' ');
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Character) obj).charValue(), ((Number) obj2).intValue());
        }
    }

    public static final Void a(CharSequence charSequence, char c8) {
        throw new i("Character with code " + (c8 & 255) + " is not allowed in header names, \n" + ((Object) charSequence));
    }

    public static final boolean b(char c8) {
        return t.h(c8, 32) <= 0 || w.L("\"(),/:;<=>?@[\\]{}", c8, false, 2, null);
    }

    public static final Void c(CharSequence charSequence, Z5.f fVar) {
        throw new i("No colon in HTTP header in " + charSequence.subSequence(fVar.b(), fVar.a()).toString() + " in builder: \n" + ((Object) charSequence));
    }

    public static final int d(Z5.b text, Z5.f range) {
        t.g(text, "text");
        t.g(range, "range");
        int iA = range.a();
        for (int iB = range.b(); iB < iA; iB++) {
            char cCharAt = text.charAt(iB);
            if (cCharAt == ':' && iB != range.b()) {
                range.d(iB + 1);
                return iB;
            }
            if (b(cCharAt)) {
                e(text, iB, range.b(), cCharAt);
                throw new C0920i();
            }
        }
        c(text, range);
        throw new C0920i();
    }

    public static final Void e(Z5.b bVar, int i8, int i9, char c8) {
        if (c8 == ':') {
            throw new i("Empty header names are not allowed as per RFC7230.");
        }
        if (i8 == i9) {
            throw new i("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
        }
        a(bVar, c8);
        throw new C0920i();
    }

    public static final void f(Z5.b text, Z5.f range) {
        t.g(text, "text");
        t.g(range, "range");
        int iB = range.b();
        int iA = range.a();
        int iD = Z5.g.d(text, iB, iA);
        if (iD >= iA) {
            range.d(iA);
            return;
        }
        int i8 = iD;
        int i9 = i8;
        while (i8 < iA) {
            char cCharAt = text.charAt(i8);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '\r' || cCharAt == '\n') {
                    a(text, cCharAt);
                    throw new C0920i();
                }
                i9 = i8;
            }
            i8++;
        }
        range.d(iD);
        range.c(i9 + 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:23:0x0067, B:25:0x006f, B:29:0x0078, B:32:0x008c, B:33:0x00b3, B:34:0x00ba, B:35:0x00bb, B:37:0x00c7), top: B:45:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:23:0x0067, B:25:0x006f, B:29:0x0078, B:32:0x008c, B:33:0x00b3, B:34:0x00ba, B:35:0x00bb, B:37:0x00c7), top: B:45:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:23:0x0067, B:25:0x006f, B:29:0x0078, B:32:0x008c, B:33:0x00b3, B:34:0x00ba, B:35:0x00bb, B:37:0x00c7), top: B:45:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0065 -> B:45:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(io.ktor.utils.io.g r12, Z5.b r13, Z5.f r14, G6.d r15) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.h.g(io.ktor.utils.io.g, Z5.b, Z5.f, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x008f A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:20:0x0059, B:29:0x0086, B:32:0x008f), top: B:52:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce A[Catch: all -> 0x00d5, TryCatch #1 {all -> 0x00d5, blocks: (B:36:0x00ca, B:38:0x00ce, B:42:0x00d9), top: B:50:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(io.ktor.utils.io.g gVar, G6.d dVar) throws Throwable {
        b bVar;
        Throwable th;
        Z5.b bVar2;
        io.ktor.utils.io.g gVar2;
        Z5.f fVar;
        Z5.b bVar3;
        CharSequence charSequenceJ;
        int i8;
        CharSequence charSequenceSubSequence;
        Object objG;
        CharSequence charSequence;
        Z5.b bVar4;
        int i9;
        CharSequence charSequence2;
        e eVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f12507f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f12507f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f12506e;
        Object objF = H6.c.f();
        int i11 = bVar.f12507f;
        if (i11 == 0) {
            C6.r.b(obj);
            Z5.b bVar5 = new Z5.b(null, 1, null);
            Z5.f fVar2 = new Z5.f(0, 0);
            try {
                bVar.f12502a = gVar;
                bVar.f12503b = bVar5;
                bVar.f12504c = fVar2;
                bVar.f12507f = 1;
                Object objR = gVar.r(bVar5, 8192, bVar);
                if (objR != objF) {
                    gVar2 = gVar;
                    fVar = fVar2;
                    bVar3 = bVar5;
                    obj = objR;
                    if (!((Boolean) obj).booleanValue()) {
                        return null;
                    }
                    fVar.c(bVar3.length());
                    charSequenceJ = j(bVar3, fVar);
                    i8 = i(bVar3, fVar);
                    Z5.g.c(bVar3, fVar);
                    charSequenceSubSequence = bVar3.subSequence(fVar.b(), fVar.a());
                    fVar.d(fVar.a());
                    bVar.f12502a = bVar3;
                    bVar.f12503b = charSequenceJ;
                    bVar.f12504c = charSequenceSubSequence;
                    bVar.f12505d = i8;
                    bVar.f12507f = 2;
                    objG = g(gVar2, bVar3, fVar, bVar);
                    if (objG != objF) {
                        charSequence = charSequenceJ;
                        bVar4 = bVar3;
                        i9 = i8;
                        charSequence2 = charSequenceSubSequence;
                        obj = objG;
                        eVar = (e) obj;
                        if (eVar == null) {
                            eVar = new e(bVar4);
                        }
                        return new k(charSequence, i9, charSequence2, eVar, bVar4);
                    }
                }
                return objF;
            } catch (Throwable th2) {
                th = th2;
                bVar2 = bVar5;
            }
        } else if (i11 == 1) {
            fVar = (Z5.f) bVar.f12504c;
            bVar3 = (Z5.b) bVar.f12503b;
            gVar2 = (io.ktor.utils.io.g) bVar.f12502a;
            try {
                C6.r.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                fVar.c(bVar3.length());
                charSequenceJ = j(bVar3, fVar);
                i8 = i(bVar3, fVar);
                Z5.g.c(bVar3, fVar);
                charSequenceSubSequence = bVar3.subSequence(fVar.b(), fVar.a());
                fVar.d(fVar.a());
                bVar.f12502a = bVar3;
                bVar.f12503b = charSequenceJ;
                bVar.f12504c = charSequenceSubSequence;
                bVar.f12505d = i8;
                bVar.f12507f = 2;
                objG = g(gVar2, bVar3, fVar, bVar);
                if (objG != objF) {
                    charSequence = charSequenceJ;
                    bVar4 = bVar3;
                    i9 = i8;
                    charSequence2 = charSequenceSubSequence;
                    obj = objG;
                    eVar = (e) obj;
                    if (eVar == null) {
                        eVar = new e(bVar4);
                    }
                    return new k(charSequence, i9, charSequence2, eVar, bVar4);
                }
                return objF;
            } catch (Throwable th3) {
                th = th3;
                bVar2 = bVar3;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = bVar.f12505d;
            CharSequence charSequence3 = (CharSequence) bVar.f12504c;
            CharSequence charSequence4 = (CharSequence) bVar.f12503b;
            bVar2 = (Z5.b) bVar.f12502a;
            try {
                C6.r.b(obj);
                i9 = i12;
                charSequence2 = charSequence3;
                charSequence = charSequence4;
                bVar4 = bVar2;
                try {
                    eVar = (e) obj;
                    if (eVar == null) {
                        eVar = new e(bVar4);
                    }
                    return new k(charSequence, i9, charSequence2, eVar, bVar4);
                } catch (Throwable th4) {
                    th = th4;
                    bVar2 = bVar4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        bVar2.o();
        throw th;
    }

    public static final CharSequence j(CharSequence charSequence, Z5.f fVar) {
        Z5.g.c(charSequence, fVar);
        if (fVar.b() >= fVar.a()) {
            throw new IllegalStateException(("Failed to parse version: " + ((Object) charSequence)).toString());
        }
        String str = (String) z.G0(Z5.a.b(f12495b, charSequence, fVar.b(), fVar.a(), false, c.f12508a, 8, null));
        if (str != null) {
            fVar.d(fVar.b() + str.length());
            return str;
        }
        l(Z5.g.b(charSequence, fVar));
        throw new C0920i();
    }

    public static final boolean k(int i8) {
        return i8 < 100 || i8 > 999;
    }

    public static final Void l(CharSequence charSequence) {
        throw new i("Unsupported HTTP version: " + ((Object) charSequence));
    }

    public static final void m(CharSequence charSequence) {
        if (w.Q(charSequence, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
            throw new i("Host header with ':' should contains port: " + ((Object) charSequence));
        }
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            Set set = f12494a;
            if (set.contains(Character.valueOf(cCharAt))) {
                throw new i("Host cannot contain any of the following symbols: " + set);
            }
        }
    }

    public static final int i(CharSequence charSequence, Z5.f fVar) {
        Z5.g.c(charSequence, fVar);
        int iA = fVar.a();
        int iA2 = fVar.a();
        int i8 = 0;
        for (int iB = fVar.b(); iB < iA2; iB++) {
            char cCharAt = charSequence.charAt(iB);
            if (cCharAt == ' ') {
                if (!k(i8)) {
                    iA = iB;
                    break;
                }
                throw new i("Status-code must be 3-digit. Status received: " + i8 + com.amazon.a.a.o.c.a.b.f16789a);
            }
            if ('0' <= cCharAt && cCharAt < ':') {
                i8 = (i8 * 10) + (cCharAt - '0');
            } else {
                throw new NumberFormatException("Illegal digit " + cCharAt + BpgIURjN.HFNLZQ + charSequence.subSequence(fVar.b(), Z5.g.a(charSequence, fVar)).toString());
            }
        }
        fVar.d(iA);
        return i8;
    }
}
