package p103l3;

import p004a3.C1705k;
import p067h3.a;
import p067h3.b;
import p112m3.c;

/* JADX INFO: renamed from: l3.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2659k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c.a f29178f = c.a.a("ef");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c.a f29179g = c.a.a("nm", "v");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f29180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f29181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f29182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f29183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f29184e;

    public final void a(c cVar, C1705k c1705k) {
        cVar.x();
        String strG = "";
        while (cVar.o()) {
            int iA = cVar.A(f29179g);
            if (iA != 0) {
                if (iA == 1) {
                    strG.getClass();
                    switch (strG) {
                        case "Distance":
                            this.f29183d = AbstractC2652d.e(cVar, c1705k);
                            break;
                        case "Opacity":
                            this.f29181b = AbstractC2652d.f(cVar, c1705k, false);
                            break;
                        case "Direction":
                            this.f29182c = AbstractC2652d.f(cVar, c1705k, false);
                            break;
                        case "Shadow Color":
                            this.f29180a = AbstractC2652d.c(cVar, c1705k);
                            break;
                        case "Softness":
                            this.f29184e = AbstractC2652d.e(cVar, c1705k);
                            break;
                        default:
                            cVar.R();
                            break;
                    }
                } else {
                    cVar.Y();
                    cVar.R();
                }
            } else {
                strG = cVar.G();
            }
        }
        cVar.u();
    }

    public C2658j b(c cVar, C1705k c1705k) {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        while (cVar.o()) {
            if (cVar.A(f29178f) != 0) {
                cVar.Y();
                cVar.R();
            } else {
                cVar.c();
                while (cVar.o()) {
                    a(cVar, c1705k);
                }
                cVar.j();
            }
        }
        a aVar = this.f29180a;
        if (aVar == null || (bVar = this.f29181b) == null || (bVar2 = this.f29182c) == null || (bVar3 = this.f29183d) == null || (bVar4 = this.f29184e) == null) {
            return null;
        }
        return new C2658j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
