package p065h1;

import C6.G;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f24151a = a.f24152a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f24152a = new a();

        public final P0 a() {
            return b.f24153b;
        }
    }

    Function0 a(AbstractC2378a abstractC2378a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements P0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f24153b = new b();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC2378a f24154a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewOnAttachStateChangeListenerC0557b f24155b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p021c2.b f24156c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC2378a abstractC2378a, ViewOnAttachStateChangeListenerC0557b viewOnAttachStateChangeListenerC0557b, p021c2.b bVar) {
                super(0);
                this.f24154a = abstractC2378a;
                this.f24155b = viewOnAttachStateChangeListenerC0557b;
                this.f24156c = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m216invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m216invoke() {
                this.f24154a.removeOnAttachStateChangeListener(this.f24155b);
                p021c2.a.e(this.f24154a, this.f24156c);
            }
        }

        @Override // p065h1.P0
        public Function0 a(final AbstractC2378a abstractC2378a) {
            ViewOnAttachStateChangeListenerC0557b viewOnAttachStateChangeListenerC0557b = new ViewOnAttachStateChangeListenerC0557b(abstractC2378a);
            abstractC2378a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0557b);
            p021c2.b bVar = new p021c2.b() { // from class: h1.Q0
            };
            p021c2.a.a(abstractC2378a, bVar);
            return new a(abstractC2378a, viewOnAttachStateChangeListenerC0557b, bVar);
        }

        /* JADX INFO: renamed from: h1.P0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class ViewOnAttachStateChangeListenerC0557b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC2378a f24157a;

            public ViewOnAttachStateChangeListenerC0557b(AbstractC2378a abstractC2378a) {
                this.f24157a = abstractC2378a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (p021c2.a.d(this.f24157a)) {
                    return;
                }
                this.f24157a.e();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }
        }
    }
}
