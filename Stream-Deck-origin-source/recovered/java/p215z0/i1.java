package p215z0;

import C6.G;
import C6.r;
import G6.d;
import I6.l;
import Q6.o;
import java.util.Arrays;
import p017b7.J;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i1 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f38771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f38772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f38773d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, InterfaceC3164l0 interfaceC3164l0, d dVar) {
            super(2, dVar);
            this.f38772c = oVar;
            this.f38773d = interfaceC3164l0;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            a aVar = new a(this.f38772c, this.f38773d, dVar);
            aVar.f38771b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f38770a;
            if (i8 == 0) {
                r.b(obj);
                J j8 = (J) this.f38771b;
                o oVar = this.f38772c;
                A0 a8 = new A0(this.f38773d, j8.getCoroutineContext());
                this.f38770a = 1;
                if (oVar.invoke(a8, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f38779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f38780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f38781d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o oVar, InterfaceC3164l0 interfaceC3164l0, d dVar) {
            super(2, dVar);
            this.f38780c = oVar;
            this.f38781d = interfaceC3164l0;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            c cVar = new c(this.f38780c, this.f38781d, dVar);
            cVar.f38779b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f38778a;
            if (i8 == 0) {
                r.b(obj);
                J j8 = (J) this.f38779b;
                o oVar = this.f38780c;
                A0 a8 = new A0(this.f38781d, j8.getCoroutineContext());
                this.f38778a = 1;
                if (oVar.invoke(a8, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    public static final q1 a(Object obj, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(10454275);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(10454275, i8, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = l1.e(obj, null, 2, null);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        K.d(G.f1419a, new a(oVar, interfaceC3164l0, null), interfaceC3163l, 70);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return interfaceC3164l0;
    }

    public static final q1 b(Object obj, Object obj2, Object obj3, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1703169085);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1703169085, i8, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = l1.e(obj, null, 2, null);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        K.e(obj2, obj3, new b(oVar, interfaceC3164l0, null), interfaceC3163l, 584);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return interfaceC3164l0;
    }

    public static final q1 c(Object obj, Object[] objArr, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(490154582);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(490154582, i8, -1, "androidx.compose.runtime.produceState (ProduceState.kt:214)");
        }
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = l1.e(obj, null, 2, null);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        K.f(Arrays.copyOf(objArr, objArr.length), new c(oVar, interfaceC3164l0, null), interfaceC3163l, 72);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return interfaceC3164l0;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f38775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f38776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f38777d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, InterfaceC3164l0 interfaceC3164l0, d dVar) {
            super(2, dVar);
            this.f38776c = oVar;
            this.f38777d = interfaceC3164l0;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            b bVar = new b(this.f38776c, this.f38777d, dVar);
            bVar.f38775b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f38774a;
            if (i8 != 0) {
                if (i8 == 1) {
                    r.b(obj);
                } else {
                    throw new IllegalStateException(QhsKALGiniuQ.wyBtDodZK);
                }
            } else {
                r.b(obj);
                J j8 = (J) this.f38775b;
                o oVar = this.f38776c;
                A0 a8 = new A0(this.f38777d, j8.getCoroutineContext());
                this.f38774a = 1;
                if (oVar.invoke(a8, this) == objF) {
                    return objF;
                }
            }
            return G.f1419a;
        }
    }
}
