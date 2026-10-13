package p113m4;

import B6.a;
import android.content.Context;
import p077i4.b;
import p077i4.e;
import p122n4.f;
import p122n4.v;
import p131o4.InterfaceC2752d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f30064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f30065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f30066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f30067d;

    public h(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f30064a = aVar;
        this.f30065b = aVar2;
        this.f30066c = aVar3;
        this.f30067d = aVar4;
    }

    public static h a(a aVar, a aVar2, a aVar3, a aVar4) {
        return new h(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Context context, InterfaceC2752d interfaceC2752d, f fVar, p147q4.a aVar) {
        return (v) e.c(g.a(context, interfaceC2752d, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // B6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Context) this.f30064a.get(), (InterfaceC2752d) this.f30065b.get(), (f) this.f30066c.get(), (p147q4.a) this.f30067d.get());
    }
}
