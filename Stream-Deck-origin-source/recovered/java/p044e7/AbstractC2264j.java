package p044e7;

import C6.G;
import C6.r;
import H6.c;
import I6.d;
import p017b7.J;
import p035d7.i;
import p035d7.m;
import p035d7.x;
import p053f7.f;

/* JADX INFO: renamed from: e7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2264j {

    /* JADX INFO: renamed from: e7.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f21001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f21002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f21003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f21004f;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21003e = obj;
            this.f21004f |= Integer.MIN_VALUE;
            return AbstractC2264j.c(null, null, false, this);
        }
    }

    public static final Object b(InterfaceC2261g interfaceC2261g, x xVar, G6.d dVar) {
        Object objC = c(interfaceC2261g, xVar, true, dVar);
        return objC == c.f() ? objC : G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(InterfaceC2261g interfaceC2261g, x xVar, boolean z8, G6.d dVar) {
        a aVar;
        i it;
        i iVar;
        InterfaceC2261g interfaceC2261g2;
        Object objA;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f21004f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f21004f = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f21003e;
        Object objF = c.f();
        int i9 = aVar.f21004f;
        try {
            if (i9 == 0) {
                r.b(obj);
                AbstractC2262h.v(interfaceC2261g);
                it = xVar.iterator();
                aVar.f20999a = interfaceC2261g;
                aVar.f21000b = xVar;
                aVar.f21001c = it;
                aVar.f21002d = z8;
                aVar.f21004f = 1;
                objA = it.a(aVar);
                if (objA == objF) {
                    interfaceC2261g2 = interfaceC2261g;
                    iVar = it;
                    obj = objA;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z8) {
                            m.a(xVar, null);
                        }
                        return G.f1419a;
                    }
                    Object next = iVar.next();
                    aVar.f20999a = interfaceC2261g2;
                    aVar.f21000b = xVar;
                    aVar.f21001c = iVar;
                    aVar.f21002d = z8;
                    aVar.f21004f = 2;
                }
                return objF;
            }
            if (i9 == 1) {
                z8 = aVar.f21002d;
                iVar = (i) aVar.f21001c;
                xVar = (x) aVar.f21000b;
                interfaceC2261g2 = (InterfaceC2261g) aVar.f20999a;
                r.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (z8) {
                        m.a(xVar, null);
                    }
                    return G.f1419a;
                }
                Object next2 = iVar.next();
                aVar.f20999a = interfaceC2261g2;
                aVar.f21000b = xVar;
                aVar.f21001c = iVar;
                aVar.f21002d = z8;
                aVar.f21004f = 2;
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z8 = aVar.f21002d;
                iVar = (i) aVar.f21001c;
                xVar = (x) aVar.f21000b;
                interfaceC2261g2 = (InterfaceC2261g) aVar.f20999a;
                r.b(obj);
            }
            it = iVar;
            interfaceC2261g = interfaceC2261g2;
            aVar.f20999a = interfaceC2261g;
            aVar.f21000b = xVar;
            aVar.f21001c = it;
            aVar.f21002d = z8;
            aVar.f21004f = 1;
            objA = it.a(aVar);
            if (objA == objF) {
                interfaceC2261g2 = interfaceC2261g;
                iVar = it;
                obj = objA;
                if (!((Boolean) obj).booleanValue()) {
                    if (z8) {
                        m.a(xVar, null);
                    }
                    return G.f1419a;
                }
                Object next3 = iVar.next();
                aVar.f20999a = interfaceC2261g2;
                aVar.f21000b = xVar;
                aVar.f21001c = iVar;
                aVar.f21002d = z8;
                aVar.f21004f = 2;
            }
            return objF;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z8) {
                    m.a(xVar, th);
                }
                throw th2;
            }
        }
    }

    public static final x d(InterfaceC2260f interfaceC2260f, J j8) {
        return f.b(interfaceC2260f).m(j8);
    }

    public static final InterfaceC2260f e(x xVar) {
        return new C2257c(xVar, false, null, 0, null, 28, null);
    }
}
