package K2;

import C6.G;
import C6.r;
import Q6.o;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p017b7.Z;
import p035d7.t;
import p035d7.v;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f4589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L2.a f4590c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f4592b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f4594d;

        /* JADX INFO: renamed from: K2.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0166a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f4595a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T1.a f4596b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0166a(i iVar, T1.a aVar) {
                super(0);
                this.f4595a = iVar;
                this.f4596b = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m68invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m68invoke() {
                this.f4595a.f4590c.a(this.f4596b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, G6.d dVar) {
            super(2, dVar);
            this.f4594d = context;
        }

        public static final void k(v vVar, j jVar) {
            vVar.m(jVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = i.this.new a(this.f4594d, dVar);
            aVar.f4592b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, G6.d dVar) {
            return ((a) create(vVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f4591a;
            if (i8 == 0) {
                r.b(obj);
                final v vVar = (v) this.f4592b;
                T1.a aVar = new T1.a() { // from class: K2.h
                    @Override // T1.a
                    public final void accept(Object obj2) {
                        i.a.k(vVar, (j) obj2);
                    }
                };
                i.this.f4590c.b(this.f4594d, new p185v2.e(), aVar);
                C0166a c0166a = new C0166a(i.this, aVar);
                this.f4591a = 1;
                if (t.a(vVar, c0166a, this) == objF) {
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

    public i(l windowMetricsCalculator, L2.a windowBackend) {
        kotlin.jvm.internal.t.g(windowMetricsCalculator, "windowMetricsCalculator");
        kotlin.jvm.internal.t.g(windowBackend, "windowBackend");
        this.f4589b = windowMetricsCalculator;
        this.f4590c = windowBackend;
    }

    @Override // K2.f
    public InterfaceC2260f a(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        return AbstractC2262h.G(AbstractC2262h.e(new a(context, null)), Z.c());
    }
}
