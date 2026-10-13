package p044e7;

import C6.G;
import C6.r;
import D6.C0937q;
import D6.z;
import G6.d;
import H6.c;
import I6.l;
import Q6.o;
import Q6.p;
import java.util.List;
import p017b7.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class L implements H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20942c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ int f20945c;

        public a(d dVar) {
            super(3, dVar);
        }

        public final Object g(InterfaceC2261g interfaceC2261g, int i8, d dVar) {
            a aVar = L.this.new a(dVar);
            aVar.f20944b = interfaceC2261g;
            aVar.f20945c = i8;
            return aVar.invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((InterfaceC2261g) obj, ((Number) obj2).intValue(), (d) obj3);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0070  */
        /* JADX WARN: Code duplicated, block: B:29:0x007d A[PHI: r1
          0x007d: PHI (r1v4 e7.g) = (r1v3 e7.g), (r1v9 e7.g) binds: [B:27:0x007a, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x008e A[PHI: r1
          0x008e: PHI (r1v5 e7.g) = (r1v3 e7.g), (r1v4 e7.g), (r1v11 e7.g) binds: [B:25:0x006e, B:30:0x008b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L34;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2261g interfaceC2261g;
            F f8;
            long j8;
            Object objF = c.f();
            int i8 = this.f20943a;
            if (i8 == 0) {
                r.b(obj);
                interfaceC2261g = (InterfaceC2261g) this.f20944b;
                if (this.f20945c > 0) {
                    F f9 = F.START;
                    this.f20943a = 1;
                } else {
                    long j9 = L.this.f20941b;
                    this.f20944b = interfaceC2261g;
                    this.f20943a = 2;
                    if (U.a(j9, this) != objF) {
                        if (L.this.f20942c > 0) {
                            f8 = F.STOP;
                            this.f20944b = interfaceC2261g;
                            this.f20943a = 3;
                            if (interfaceC2261g.emit(f8, this) != objF) {
                                j8 = L.this.f20942c;
                                this.f20944b = interfaceC2261g;
                                this.f20943a = 4;
                                if (U.a(j8, this) != objF) {
                                    F f10 = F.STOP_AND_RESET_REPLAY_CACHE;
                                    this.f20944b = null;
                                    this.f20943a = 5;
                                }
                            }
                        } else {
                            F f11 = F.STOP_AND_RESET_REPLAY_CACHE;
                            this.f20944b = null;
                            this.f20943a = 5;
                        }
                    }
                }
                return objF;
            }
            if (i8 != 1) {
                if (i8 == 2) {
                    interfaceC2261g = (InterfaceC2261g) this.f20944b;
                    r.b(obj);
                    if (L.this.f20942c > 0) {
                        f8 = F.STOP;
                        this.f20944b = interfaceC2261g;
                        this.f20943a = 3;
                        if (interfaceC2261g.emit(f8, this) != objF) {
                            j8 = L.this.f20942c;
                            this.f20944b = interfaceC2261g;
                            this.f20943a = 4;
                            if (U.a(j8, this) != objF) {
                            }
                        }
                    }
                    return objF;
                }
                if (i8 == 3) {
                    interfaceC2261g = (InterfaceC2261g) this.f20944b;
                    r.b(obj);
                    j8 = L.this.f20942c;
                    this.f20944b = interfaceC2261g;
                    this.f20943a = 4;
                    if (U.a(j8, this) != objF) {
                    }
                    return objF;
                }
                if (i8 == 4) {
                    interfaceC2261g = (InterfaceC2261g) this.f20944b;
                    r.b(obj);
                } else if (i8 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                F f12 = F.STOP_AND_RESET_REPLAY_CACHE;
                this.f20944b = null;
                this.f20943a = 5;
            }
            r.b(obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20948b;

        public b(d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            b bVar = new b(dVar);
            bVar.f20948b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F f8, d dVar) {
            return ((b) create(f8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.f20947a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return I6.b.a(((F) this.f20948b) != F.START);
        }
    }

    public L(long j8, long j9) {
        this.f20941b = j8;
        this.f20942c = j9;
        if (j8 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j8 + " ms) cannot be negative").toString());
        }
        if (j9 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j9 + " ms) cannot be negative").toString());
    }

    @Override // p044e7.H
    public InterfaceC2260f a(M m8) {
        return AbstractC2262h.p(AbstractC2262h.s(AbstractC2262h.W(m8, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l8 = (L) obj;
        return this.f20941b == l8.f20941b && this.f20942c == l8.f20942c;
    }

    public int hashCode() {
        return (Long.hashCode(this.f20941b) * 31) + Long.hashCode(this.f20942c);
    }

    public String toString() {
        List listD = C0937q.d(2);
        if (this.f20941b > 0) {
            listD.add("stopTimeout=" + this.f20941b + "ms");
        }
        if (this.f20942c < Long.MAX_VALUE) {
            listD.add("replayExpiration=" + this.f20942c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + z.r0(C0937q.a(listD), null, null, null, 0, null, null, 63, null) + ')';
    }
}
