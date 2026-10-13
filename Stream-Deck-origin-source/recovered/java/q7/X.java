package q7;

import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class X implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p116m7.b f32077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p116m7.b f32078b;

    public /* synthetic */ X(p116m7.b bVar, p116m7.b bVar2, AbstractC2633k abstractC2633k) {
        this(bVar, bVar2);
    }

    public abstract Object a(Object obj);

    public final p116m7.b b() {
        return this.f32077a;
    }

    public abstract Object c(Object obj);

    public final p116m7.b d() {
        return this.f32078b;
    }

    @Override // p116m7.a
    public Object deserialize(p7.e decoder) {
        Object objE;
        kotlin.jvm.internal.t.g(decoder, "decoder");
        o7.f descriptor = getDescriptor();
        p7.c cVarB = decoder.b(descriptor);
        if (cVarB.x()) {
            objE = e(p7.c.a.c(cVarB, getDescriptor(), 0, b(), null, 8, null), p7.c.a.c(cVarB, getDescriptor(), 1, d(), null, 8, null));
        } else {
            Object objC = R0.f32062a;
            Object objC2 = R0.f32062a;
            while (true) {
                int iE = cVarB.E(getDescriptor());
                if (iE == -1) {
                    if (objC == R0.f32062a) {
                        throw new p116m7.j("Element 'key' is missing");
                    }
                    if (objC2 == R0.f32062a) {
                        throw new p116m7.j("Element 'value' is missing");
                    }
                    objE = e(objC, objC2);
                    break;
                }
                if (iE == 0) {
                    objC = p7.c.a.c(cVarB, getDescriptor(), 0, b(), null, 8, null);
                } else {
                    if (iE != 1) {
                        throw new p116m7.j("Invalid index: " + iE);
                    }
                    objC2 = p7.c.a.c(cVarB, getDescriptor(), 1, d(), null, 8, null);
                }
            }
        }
        cVarB.c(descriptor);
        return objE;
    }

    public abstract Object e(Object obj, Object obj2);

    public X(p116m7.b bVar, p116m7.b bVar2) {
        this.f32077a = bVar;
        this.f32078b = bVar2;
    }

    @Override // p116m7.k
    public void serialize(p7.f fVar, Object obj) {
        kotlin.jvm.internal.t.g(fVar, yOZfxp.LhfXMNCD);
        p7.d dVarB = fVar.b(getDescriptor());
        dVarB.i(getDescriptor(), 0, this.f32077a, a(obj));
        dVarB.i(getDescriptor(), 1, this.f32078b, c(obj));
        dVarB.c(getDescriptor());
    }
}
