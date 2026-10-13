package p106l6;

import C6.G;
import Q6.k;
import X5.C1674c;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p097k6.d;
import r7.f;
import r7.p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c f29220a = p.b(null, a.f29221a, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29221a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((f) obj);
            return G.f1419a;
        }

        public final void invoke(f Json) {
            t.g(Json, "$this$Json");
            Json.e(true);
            Json.g(true);
            Json.c(true);
            Json.d(true);
            Json.h(false);
            Json.i(false);
        }
    }

    public static final void a(p088j6.a aVar, r7.c json, C1674c contentType) {
        t.g(aVar, "<this>");
        t.g(json, "json");
        t.g(contentType, "contentType");
        d.a(aVar, contentType, json);
    }

    public static /* synthetic */ void b(p088j6.a aVar, r7.c cVar, C1674c c1674c, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cVar = f29220a;
        }
        if ((i8 & 2) != 0) {
            c1674c = C1674c.a.f11811a.a();
        }
        a(aVar, cVar, c1674c);
    }
}
