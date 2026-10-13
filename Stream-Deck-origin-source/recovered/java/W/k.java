package W;

import A.C0900v;
import A.InterfaceC0881l;
import A.T0;
import K.n;
import android.content.Context;
import androidx.lifecycle.InterfaceC1733p;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10783b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f10784c = new k(new g());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f10785a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static final k d(Void r8) {
            return k.f10784c;
        }

        public static final k e(Q6.k kVar, Object obj) {
            return (k) kVar.invoke(obj);
        }

        public final Y4.a c(Context context) {
            t.g(context, "context");
            T1.f.g(context);
            Y4.a aVarD = k.f10784c.d(context);
            final Q6.k kVar = new Q6.k() { // from class: W.i
                @Override // Q6.k
                public final Object invoke(Object obj) {
                    return k.a.d((Void) obj);
                }
            };
            Y4.a aVarX = n.x(aVarD, new p142q.a() { // from class: W.j
                @Override // p142q.a
                public final Object apply(Object obj) {
                    return k.a.e(kVar, obj);
                }
            }, J.a.a());
            t.f(aVarX, "transform(...)");
            return aVarX;
        }

        public a() {
        }
    }

    public k(g gVar) {
        this.f10785a = gVar;
    }

    public final InterfaceC0881l c(InterfaceC1733p lifecycleOwner, C0900v cameraSelector, T0... useCases) {
        t.g(lifecycleOwner, "lifecycleOwner");
        t.g(cameraSelector, "cameraSelector");
        t.g(useCases, "useCases");
        return this.f10785a.m(lifecycleOwner, cameraSelector, (T0[]) Arrays.copyOf(useCases, useCases.length));
    }

    public final Y4.a d(Context context) {
        return this.f10785a.u(context, null);
    }

    public final void e() {
        this.f10785a.D();
    }
}
