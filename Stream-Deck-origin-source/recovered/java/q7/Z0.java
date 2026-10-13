package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Z0 extends D0 implements p116m7.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z0 f32084c = new Z0();

    public Z0() {
        super(p125n7.a.x(C6.A.f1408b));
    }

    @Override // q7.AbstractC2826a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((C6.B) obj).K());
    }

    @Override // q7.AbstractC2826a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((C6.B) obj).K());
    }

    @Override // q7.D0
    public /* bridge */ /* synthetic */ Object r() {
        return C6.B.c(w());
    }

    @Override // q7.D0
    public /* bridge */ /* synthetic */ void u(p7.d dVar, Object obj, int i8) {
        z(dVar, ((C6.B) obj).K(), i8);
    }

    public int v(long[] collectionSize) {
        kotlin.jvm.internal.t.g(collectionSize, "$this$collectionSize");
        return C6.B.E(collectionSize);
    }

    public long[] w() {
        return C6.B.m(0);
    }

    @Override // q7.AbstractC2867v, q7.AbstractC2826a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(p7.c decoder, int i8, Y0 builder, boolean z8) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(C6.A.b(decoder.p(getDescriptor(), i8).t()));
    }

    public Y0 y(long[] toBuilder) {
        kotlin.jvm.internal.t.g(toBuilder, "$this$toBuilder");
        return new Y0(toBuilder, null);
    }

    public void z(p7.d encoder, long[] content, int i8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.x(getDescriptor(), i9).D(C6.B.A(content, i9));
        }
    }
}
