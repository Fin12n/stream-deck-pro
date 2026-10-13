package p053f7;

import C6.G;
import C6.r;
import D6.F;
import H6.c;
import I6.d;
import Q6.o;
import Q6.p;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import p017b7.J;
import p035d7.g;
import p035d7.y;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f22315f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f[] f22316g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function0 f22317h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p f22318i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f22319j;

        /* JADX INFO: renamed from: f7.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0519a extends I6.l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f22320a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f[] f22321b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f22322c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f22323d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f22324e;

            /* JADX INFO: renamed from: f7.l$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0520a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g f22325a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f22326b;

                /* JADX INFO: renamed from: f7.l$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0521a extends d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f22327a;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public int f22329c;

                    public C0521a(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f22327a = obj;
                        this.f22329c |= Integer.MIN_VALUE;
                        return C0520a.this.emit(null, this);
                    }
                }

                public C0520a(g gVar, int i8) {
                    this.f22325a = gVar;
                    this.f22326b = i8;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (p017b7.d1.a(r0) == r1) goto L21;
                 */
                @Override // p044e7.InterfaceC2261g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, G6.d dVar) {
                    C0521a c0521a;
                    if (dVar instanceof C0521a) {
                        c0521a = (C0521a) dVar;
                        int i8 = c0521a.f22329c;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0521a.f22329c = i8 - Integer.MIN_VALUE;
                        } else {
                            c0521a = new C0521a(dVar);
                        }
                    } else {
                        c0521a = new C0521a(dVar);
                    }
                    Object obj2 = c0521a.f22327a;
                    Object objF = c.f();
                    int i9 = c0521a.f22329c;
                    if (i9 != 0) {
                        if (i9 == 1) {
                            r.b(obj2);
                        } else {
                            if (i9 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            r.b(obj2);
                        }
                        return G.f1419a;
                    }
                    r.b(obj2);
                    g gVar = this.f22325a;
                    F f8 = new F(this.f22326b, obj);
                    c0521a.f22329c = 1;
                    if (gVar.i(f8, c0521a) != objF) {
                    }
                    return objF;
                    c0521a.f22329c = 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0519a(InterfaceC2260f[] interfaceC2260fArr, int i8, AtomicInteger atomicInteger, g gVar, G6.d dVar) {
                super(2, dVar);
                this.f22321b = interfaceC2260fArr;
                this.f22322c = i8;
                this.f22323d = atomicInteger;
                this.f22324e = gVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0519a(this.f22321b, this.f22322c, this.f22323d, this.f22324e, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0519a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = c.f();
                int i8 = this.f22320a;
                try {
                    if (i8 == 0) {
                        r.b(obj);
                        InterfaceC2260f[] interfaceC2260fArr = this.f22321b;
                        int i9 = this.f22322c;
                        InterfaceC2260f interfaceC2260f = interfaceC2260fArr[i9];
                        C0520a c0520a = new C0520a(this.f22324e, i9);
                        this.f22320a = 1;
                        if (interfaceC2260f.collect(c0520a, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    if (this.f22323d.decrementAndGet() == 0) {
                        y.a.a(this.f22324e, null, 1, null);
                    }
                    return G.f1419a;
                } catch (Throwable th) {
                    if (this.f22323d.decrementAndGet() == 0) {
                        y.a.a(this.f22324e, null, 1, null);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2260f[] interfaceC2260fArr, Function0 function0, p pVar, InterfaceC2261g interfaceC2261g, G6.d dVar) {
            super(2, dVar);
            this.f22316g = interfaceC2260fArr;
            this.f22317h = function0;
            this.f22318i = pVar;
            this.f22319j = interfaceC2261g;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = new a(this.f22316g, this.f22317h, this.f22318i, this.f22319j, dVar);
            aVar.f22315f = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e7 A[EDGE_INSN: B:35:0x00e7->B:44:0x012a BREAK  A[LOOP:0: B:28:0x00c2->B:47:?]] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:41:0x010a  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:28:0x00c2->B:47:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0107 -> B:44:0x012a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0127 -> B:44:0x012a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x010a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 305
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f7.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(InterfaceC2261g interfaceC2261g, InterfaceC2260f[] interfaceC2260fArr, Function0 function0, p pVar, G6.d dVar) {
        Object objA = o.a(new a(interfaceC2260fArr, function0, pVar, interfaceC2261g, null), dVar);
        return objA == c.f() ? objA : G.f1419a;
    }
}
