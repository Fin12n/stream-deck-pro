package p065h1;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.o;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import p017b7.AbstractC1789i;
import p017b7.C1802o0;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p026c7.f;
import p215z0.H0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f24233a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f24234b = new AtomicReference(a1.f24228a.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24235c = 8;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H0 f24238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f24239c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(H0 h8, View view, d dVar) {
            super(2, dVar);
            this.f24238b = h8;
            this.f24239c = view;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new b(this.f24238b, this.f24239c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f24237a;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    H0 h8 = this.f24238b;
                    this.f24237a = 1;
                    if (h8.k0(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                if (c1.f(this.f24239c) == this.f24238b) {
                    c1.i(this.f24239c, null);
                }
                return G.f1419a;
            } catch (Throwable th) {
                if (c1.f(this.f24239c) == this.f24238b) {
                    c1.i(this.f24239c, null);
                }
                throw th;
            }
        }
    }

    public final H0 a(View view) {
        H0 h0A = ((a1) f24234b.get()).a(view);
        c1.i(view, h0A);
        view.addOnAttachStateChangeListener(new a(AbstractC1789i.d(C1802o0.f15975a, f.b(view.getHandler(), "windowRecomposer cleanup").o1(), null, new b(h0A, view, null), 2, null)));
        return h0A;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1815v0 f24236a;

        public a(InterfaceC1815v0 interfaceC1815v0) {
            this.f24236a = interfaceC1815v0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            InterfaceC1815v0.a.a(this.f24236a, null, 1, null);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
