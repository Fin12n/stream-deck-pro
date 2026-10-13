package p031d3;

import android.graphics.Path;
import android.graphics.PointF;
import p004a3.C1705k;
import p121n3.j;
import p130o3.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class i extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f19772q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f19773r;

    public i(C1705k c1705k, a aVar) {
        super(c1705k, (PointF) aVar.f30872b, (PointF) aVar.f30873c, aVar.f30874d, aVar.f30875e, aVar.f30876f, aVar.f30877g, aVar.f30878h);
        this.f19773r = aVar;
        j();
    }

    public void j() {
        Object obj;
        Object obj2;
        Object obj3 = this.f30873c;
        boolean z8 = (obj3 == null || (obj2 = this.f30872b) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.f30872b;
        if (obj4 == null || (obj = this.f30873c) == null || z8) {
            return;
        }
        a aVar = this.f19773r;
        this.f19772q = j.d((PointF) obj4, (PointF) obj, aVar.f30885o, aVar.f30886p);
    }

    public Path k() {
        return this.f19772q;
    }
}
