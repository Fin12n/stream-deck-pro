package p055g0;

import C6.r;
import H6.c;
import I6.d;
import I6.l;
import Q6.o;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.u;
import p037e0.AbstractC2214j;
import p037e0.InterfaceC2213i;
import p037e0.d0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22812c;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22811b = obj;
            this.f22812c |= Integer.MIN_VALUE;
            return H.a(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f22815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2213i f22816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ G f22817e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ G f22818a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f22819b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(G g8, I i8) {
                super(2);
                this.f22818a = g8;
                this.f22819b = i8;
            }

            public final void b(float f8, float f9) {
                G g8 = this.f22818a;
                float f10 = g8.f28776a;
                g8.f28776a = f10 + this.f22819b.a(f8 - f10);
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C6.G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f8, InterfaceC2213i interfaceC2213i, G g8, G6.d dVar) {
            super(2, dVar);
            this.f22815c = f8;
            this.f22816d = interfaceC2213i;
            this.f22817e = g8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = new b(this.f22815c, this.f22816d, this.f22817e, dVar);
            bVar.f22814b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i8, G6.d dVar) {
            return ((b) create(i8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f22813a;
            if (i8 == 0) {
                r.b(obj);
                I i9 = (I) this.f22814b;
                float f8 = this.f22815c;
                InterfaceC2213i interfaceC2213i = this.f22816d;
                a aVar = new a(this.f22817e, i9);
                this.f22813a = 1;
                if (d0.e(0.0f, f8, 0.0f, interfaceC2213i, aVar, this, 4, null) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(M m8, float f8, InterfaceC2213i interfaceC2213i, G6.d dVar) {
        a aVar;
        G g8;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f22812c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f22812c = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f22811b;
        Object objF = c.f();
        int i9 = aVar2.f22812c;
        if (i9 == 0) {
            r.b(obj);
            G g9 = new G();
            b bVar = new b(f8, interfaceC2213i, g9, null);
            aVar2.f22810a = g9;
            aVar2.f22812c = 1;
            if (M.c(m8, null, bVar, aVar2, 1, null) == objF) {
                return objF;
            }
            g8 = g9;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8 = (G) aVar2.f22810a;
            r.b(obj);
        }
        return I6.b.c(g8.f28776a);
    }

    public static /* synthetic */ Object b(M m8, float f8, InterfaceC2213i interfaceC2213i, G6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC2213i = AbstractC2214j.g(0.0f, 0.0f, null, 7, null);
        }
        return a(m8, f8, interfaceC2213i, dVar);
    }
}
