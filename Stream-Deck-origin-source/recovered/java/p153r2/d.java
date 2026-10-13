package p153r2;

import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import kotlin.jvm.internal.t;
import p169t2.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f32336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P.c f32337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f32338c;

    public d(Q store, P.c factory, a extras) {
        t.g(store, "store");
        t.g(factory, "factory");
        t.g(extras, "extras");
        this.f32336a = store;
        this.f32337b = factory;
        this.f32338c = extras;
    }

    public static /* synthetic */ O b(d dVar, X6.d dVar2, String str, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = g.f34129a.c(dVar2);
        }
        return dVar.a(dVar2, str);
    }

    public final O a(X6.d modelClass, String key) {
        t.g(modelClass, "modelClass");
        t.g(key, "key");
        O oB = this.f32336a.b(key);
        if (!modelClass.g(oB)) {
            b bVar = new b(this.f32338c);
            bVar.c(g.a.f34130a, key);
            O oA = e.a(this.f32337b, modelClass, bVar);
            this.f32336a.d(key, oA);
            return oA;
        }
        Object obj = this.f32337b;
        if (obj instanceof P.e) {
            t.d(oB);
            ((P.e) obj).d(oB);
        }
        t.e(oB, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return oB;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(S owner, P.c factory, a extras) {
        this(owner.k(), factory, extras);
        t.g(owner, "owner");
        t.g(factory, "factory");
        t.g(extras, "extras");
    }
}
