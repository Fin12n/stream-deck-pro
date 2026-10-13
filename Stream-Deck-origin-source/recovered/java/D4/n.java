package D4;

import android.app.Activity;
import android.content.Context;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.util.Arrays;
import p211y4.AbstractC3113n;
import p211y4.InterfaceC3111l;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends p203x4.e implements C4.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x4.a.g f1915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p203x4.a.AbstractC0839a f1916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p203x4.a f1917m;

    static {
        x4.a.g gVar = new x4.a.g();
        f1915k = gVar;
        k kVar = new k();
        f1916l = kVar;
        f1917m = new p203x4.a("ModuleInstall.API", kVar, gVar);
    }

    public n(Activity activity) {
        super(activity, f1917m, (x4.a.d) x4.a.d.f37381a, x4.e.a.f37394c);
    }

    @Override // C4.d
    public final S4.k a(C4.f fVar) {
        final a aVarA = a.a(fVar);
        fVar.b();
        fVar.c();
        if (aVarA.b().isEmpty()) {
            return S4.n.d(new C4.g(0));
        }
        AbstractC3113n.a aVarA2 = AbstractC3113n.a();
        aVarA2.d(K4.i.f4639a);
        aVarA2.c(true);
        aVarA2.e(27304);
        aVarA2.b(new InterfaceC3111l() { // from class: D4.j
            @Override // p211y4.InterfaceC3111l
            public final void accept(Object obj, Object obj2) {
                ((g) ((o) obj).C()).T(new m(this.f1911a, (S4.l) obj2), aVarA, null);
            }
        });
        return g(aVarA2.a());
    }

    @Override // C4.d
    public final S4.k b(p203x4.h... hVarArr) {
        final a aVarN = n(false, hVarArr);
        if (aVarN.b().isEmpty()) {
            return S4.n.d(new C4.b(true, 0));
        }
        AbstractC3113n.a aVarA = AbstractC3113n.a();
        aVarA.d(K4.i.f4639a);
        aVarA.e(27301);
        aVarA.c(false);
        aVarA.b(new InterfaceC3111l() { // from class: D4.i
            @Override // p211y4.InterfaceC3111l
            public final void accept(Object obj, Object obj2) {
                ((g) ((o) obj).C()).S(new l(this.f1909a, (S4.l) obj2), aVarN);
            }
        });
        return g(aVarA.a());
    }

    public n(Context context) {
        super(context, f1917m, x4.a.d.f37381a, x4.e.a.f37394c);
    }

    public static final a n(boolean z8, p203x4.h... hVarArr) {
        AbstractC3207p.l(hVarArr, "Requested APIs must not be null.");
        AbstractC3207p.b(hVarArr.length > 0, LYdqVGvOGMNr.KduovuPFM);
        for (p203x4.h hVar : hVarArr) {
            AbstractC3207p.l(hVar, "Requested API must not be null.");
        }
        return a.c(Arrays.asList(hVarArr), z8);
    }
}
