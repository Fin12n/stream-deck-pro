package p073i0;

import C6.G;
import G6.d;
import H6.c;
import I6.b;
import I6.l;
import Q6.o;
import java.util.ArrayList;
import java.util.List;
import p017b7.J;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f24574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f24575c;

        /* JADX INFO: renamed from: i0.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0566a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f24576a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f24577b;

            public C0566a(List list, InterfaceC3164l0 interfaceC3164l0) {
                this.f24576a = list;
                this.f24577b = interfaceC3164l0;
            }

            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(j jVar, d dVar) {
                if (jVar instanceof p) {
                    this.f24576a.add(jVar);
                } else if (jVar instanceof q) {
                    this.f24576a.remove(((q) jVar).a());
                } else if (jVar instanceof o) {
                    this.f24576a.remove(((o) jVar).a());
                }
                this.f24577b.setValue(b.a(!this.f24576a.isEmpty()));
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, InterfaceC3164l0 interfaceC3164l0, d dVar) {
            super(2, dVar);
            this.f24574b = kVar;
            this.f24575c = interfaceC3164l0;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f24574b, this.f24575c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f24573a;
            if (i8 == 0) {
                C6.r.b(obj);
                ArrayList arrayList = new ArrayList();
                InterfaceC2260f interfaceC2260fC = this.f24574b.c();
                C0566a c0566a = new C0566a(arrayList, this.f24575c);
                this.f24573a = 1;
                if (interfaceC2260fC.collect(c0566a, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    public static final q1 a(k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1692965168);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1692965168, i8, -1, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:83)");
        }
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
        if (objG == aVar.a()) {
            objG = l1.e(Boolean.FALSE, null, 2, null);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        interfaceC3163l.f(727844388);
        boolean zR = interfaceC3163l.R(kVar) | interfaceC3163l.R(interfaceC3164l0);
        Object objG2 = interfaceC3163l.g();
        if (zR || objG2 == aVar.a()) {
            objG2 = new a(kVar, interfaceC3164l0, null);
            interfaceC3163l.H(objG2);
        }
        interfaceC3163l.N();
        K.d(kVar, (o) objG2, interfaceC3163l, (i8 & 14) | 64);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return interfaceC3164l0;
    }
}
