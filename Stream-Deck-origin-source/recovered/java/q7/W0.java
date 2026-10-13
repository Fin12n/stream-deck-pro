package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W0 extends D0 implements p116m7.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W0 f32076c = new W0();

    public W0() {
        super(p125n7.a.w(C6.y.f1460b));
    }

    @Override // q7.AbstractC2826a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((C6.z) obj).K());
    }

    @Override // q7.AbstractC2826a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((C6.z) obj).K());
    }

    @Override // q7.D0
    public /* bridge */ /* synthetic */ Object r() {
        return C6.z.c(w());
    }

    @Override // q7.D0
    public /* bridge */ /* synthetic */ void u(p7.d dVar, Object obj, int i8) {
        z(dVar, ((C6.z) obj).K(), i8);
    }

    public int v(int[] collectionSize) {
        kotlin.jvm.internal.t.g(collectionSize, "$this$collectionSize");
        return C6.z.E(collectionSize);
    }

    public int[] w() {
        return C6.z.m(0);
    }

    @Override // q7.AbstractC2867v, q7.AbstractC2826a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(p7.c decoder, int i8, V0 builder, boolean z8) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(C6.y.b(decoder.p(getDescriptor(), i8).o()));
    }

    public V0 y(int[] toBuilder) {
        kotlin.jvm.internal.t.g(toBuilder, "$this$toBuilder");
        return new V0(toBuilder, null);
    }

    public void z(p7.d encoder, int[] content, int i8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.x(getDescriptor(), i9).A(C6.z.A(content, i9));
        }
    }
}
