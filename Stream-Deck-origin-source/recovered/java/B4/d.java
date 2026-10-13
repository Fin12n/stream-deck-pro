package B4;

import S4.k;
import S4.l;
import android.content.Context;
import p211y4.AbstractC3113n;
import p211y4.InterfaceC3111l;
import p219z4.C3209s;
import p219z4.C3212v;
import p219z4.InterfaceC3211u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends p203x4.e implements InterfaceC3211u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x4.a.g f1199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p203x4.a.AbstractC0839a f1200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p203x4.a f1201m;

    static {
        x4.a.g gVar = new x4.a.g();
        f1199k = gVar;
        c cVar = new c();
        f1200l = cVar;
        f1201m = new p203x4.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C3212v c3212v) {
        super(context, f1201m, c3212v, x4.e.a.f37394c);
    }

    @Override // p219z4.InterfaceC3211u
    public final k c(final C3209s c3209s) {
        AbstractC3113n.a aVarA = AbstractC3113n.a();
        aVarA.d(K4.d.f4635a);
        aVarA.c(false);
        aVarA.b(new InterfaceC3111l() { // from class: B4.b
            @Override // p211y4.InterfaceC3111l
            public final void accept(Object obj, Object obj2) {
                x4.a.g gVar = d.f1199k;
                ((a) ((e) obj).C()).S(c3209s);
                ((l) obj2).c(null);
            }
        });
        return f(aVarA.a());
    }
}
