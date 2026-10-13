package p085j3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import p004a3.C1705k;
import p004a3.J;
import p022c3.d;
import p058g3.e;
import p076i3.a;
import p076i3.q;
import p103l3.C2658j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g extends b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final d f28244D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final c f28245E;

    public g(J j8, e eVar, c cVar, C1705k c1705k) {
        super(j8, eVar);
        this.f28245E = cVar;
        d dVar = new d(j8, this, new q("__container", eVar.o(), false), c1705k);
        this.f28244D = dVar;
        List list = Collections.EMPTY_LIST;
        dVar.b(list, list);
    }

    @Override // p085j3.b
    public void I(e eVar, int i8, List list, e eVar2) {
        this.f28244D.g(eVar, i8, list, eVar2);
    }

    @Override // p085j3.b, p022c3.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        super.d(rectF, matrix, z8);
        this.f28244D.d(rectF, this.f28176o, z8);
    }

    @Override // p085j3.b
    public void t(Canvas canvas, Matrix matrix, int i8) {
        this.f28244D.f(canvas, matrix, i8);
    }

    @Override // p085j3.b
    public a x() {
        a aVarX = super.x();
        return aVarX != null ? aVarX : this.f28245E.x();
    }

    @Override // p085j3.b
    public C2658j z() {
        C2658j c2658jZ = super.z();
        return c2658jZ != null ? c2658jZ : this.f28245E.z();
    }
}
