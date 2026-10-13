package p031d3;

import java.util.Collections;
import p130o3.a;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class q extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19811i;

    public q(c cVar) {
        this(cVar, null);
    }

    @Override // p031d3.a
    public float c() {
        return 1.0f;
    }

    @Override // p031d3.a
    public Object h() {
        c cVar = this.f19749e;
        Object obj = this.f19811i;
        return cVar.b(0.0f, 0.0f, obj, obj, f(), f(), f());
    }

    @Override // p031d3.a
    public Object i(a aVar, float f8) {
        return h();
    }

    @Override // p031d3.a
    public void l() {
        if (this.f19749e != null) {
            super.l();
        }
    }

    @Override // p031d3.a
    public void n(float f8) {
        this.f19748d = f8;
    }

    public q(c cVar, Object obj) {
        super(Collections.EMPTY_LIST);
        o(cVar);
        this.f19811i = obj;
    }
}
