package q7;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class D0 extends AbstractC2867v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.f f32013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(p116m7.b primitiveSerializer) {
        super(primitiveSerializer, null);
        kotlin.jvm.internal.t.g(primitiveSerializer, "primitiveSerializer");
        this.f32013b = new C0(primitiveSerializer.getDescriptor());
    }

    @Override // q7.AbstractC2826a
    public final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // q7.AbstractC2826a, p116m7.a
    public final Object deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // q7.AbstractC2867v, p116m7.b, p116m7.k, p116m7.a
    public final o7.f getDescriptor() {
        return this.f32013b;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final B0 a() {
        return (B0) k(r());
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(B0 b8) {
        kotlin.jvm.internal.t.g(b8, "<this>");
        return b8.d();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(B0 b8, int i8) {
        kotlin.jvm.internal.t.g(b8, "<this>");
        b8.b(i8);
    }

    public abstract Object r();

    @Override // q7.AbstractC2867v
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(B0 b8, int i8, Object obj) {
        kotlin.jvm.internal.t.g(b8, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // q7.AbstractC2867v, p116m7.k
    public final void serialize(p7.f encoder, Object obj) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        int iE = e(obj);
        o7.f fVar = this.f32013b;
        p7.d dVarE = encoder.E(fVar, iE);
        u(dVarE, obj, iE);
        dVarE.c(fVar);
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object l(B0 b8) {
        kotlin.jvm.internal.t.g(b8, "<this>");
        return b8.a();
    }

    public abstract void u(p7.d dVar, Object obj, int i8);
}
