package p199x0;

import A1.k;
import A1.s;
import C6.G;
import C6.r;
import H6.c;
import I6.d;
import K2.f;
import K2.j;
import K2.l;
import android.content.Context;
import android.graphics.Rect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p065h1.X;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f37175a;

        /* JADX INFO: renamed from: x0.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0822a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f37176a;

            /* JADX INFO: renamed from: x0.b$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0823a extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f37177a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f37178b;

                public C0823a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f37177a = obj;
                    this.f37178b |= Integer.MIN_VALUE;
                    return C0822a.this.emit(null, this);
                }
            }

            public C0822a(InterfaceC2261g interfaceC2261g) {
                this.f37176a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0823a c0823a;
                if (dVar instanceof C0823a) {
                    c0823a = (C0823a) dVar;
                    int i8 = c0823a.f37178b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0823a.f37178b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0823a = new C0823a(dVar);
                    }
                } else {
                    c0823a = new C0823a(dVar);
                }
                Object obj2 = c0823a.f37177a;
                Object objF = c.f();
                int i9 = c0823a.f37178b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f37176a;
                    List listA = ((j) obj).a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listA) {
                        if (obj3 instanceof K2.c) {
                            arrayList.add(obj3);
                        }
                    }
                    c0823a.f37178b = 1;
                    if (interfaceC2261g.emit(arrayList, c0823a) == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public a(InterfaceC2260f interfaceC2260f) {
            this.f37175a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f37175a.collect(new C0822a(interfaceC2261g), dVar);
            return objCollect == c.f() ? objCollect : G.f1419a;
        }
    }

    public static final q1 a(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-883534959);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-883534959, i8, -1, "androidx.compose.material3.adaptive.collectFoldingFeaturesAsState (AndroidWindowAdaptiveInfo.android.kt:68)");
        }
        Context context = (Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g());
        interfaceC3163l.f(793549594);
        boolean zR = interfaceC3163l.R(context);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = new a(f.f4581a.d(context).a(context));
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        q1 q1VarA = g1.a((InterfaceC2260f) objG, D6.r.n(), null, interfaceC3163l, 48, 2);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarA;
    }

    public static final e b(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-2003129230);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-2003129230, i8, -1, "androidx.compose.material3.adaptive.currentWindowAdaptiveInfo (AndroidWindowAdaptiveInfo.android.kt:35)");
        }
        interfaceC3163l.f(-1765630114);
        long jI = ((A1.d) interfaceC3163l.e(X.d())).I(s.c(c(interfaceC3163l, 0)));
        interfaceC3163l.N();
        e eVar = new e(J2.b.f4066c.a(k.h(jI), k.g(jI)), p199x0.a.a((List) a(interfaceC3163l, 0).getValue()));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return eVar;
    }

    public static final long c(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1153163183);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1153163183, i8, -1, "androidx.compose.material3.adaptive.currentWindowSize (AndroidWindowAdaptiveInfo.android.kt:49)");
        }
        interfaceC3163l.e(AndroidCompositionLocals_androidKt.f());
        Rect rectA = l.f4600a.a().a((Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g())).a();
        long jA = s.a(rectA.width(), rectA.height());
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return jA;
    }
}
