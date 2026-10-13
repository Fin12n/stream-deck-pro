package p007a6;

import C6.G;
import G6.d;
import H6.c;
import Q6.o;
import X5.C1674c;
import X5.x;
import io.ktor.utils.io.j;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends c.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f13437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1674c f13438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f13439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f13440d;

    public /* synthetic */ a(o oVar, C1674c c1674c, x xVar, Long l8, int i8, AbstractC2633k abstractC2633k) {
        this(oVar, c1674c, (i8 & 4) != 0 ? null : xVar, (i8 & 8) != 0 ? null : l8);
    }

    @Override // p007a6.c
    public Long a() {
        return this.f13440d;
    }

    @Override // p007a6.c
    public C1674c b() {
        return this.f13438b;
    }

    @Override // a6.c.e
    public Object d(j jVar, d dVar) {
        Object objInvoke = this.f13437a.invoke(jVar, dVar);
        return objInvoke == c.f() ? objInvoke : G.f1419a;
    }

    public a(o body, C1674c c1674c, x xVar, Long l8) {
        t.g(body, "body");
        this.f13437a = body;
        this.f13438b = c1674c;
        this.f13439c = xVar;
        this.f13440d = l8;
    }
}
