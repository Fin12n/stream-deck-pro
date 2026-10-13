package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class L0 extends D0 implements p116m7.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L0 f32039c = new L0();

    public L0() {
        super(p125n7.a.I(kotlin.jvm.internal.M.f28782a));
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(short[] sArr) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        return sArr.length;
    }

    @Override // q7.D0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] r() {
        return new short[0];
    }

    @Override // q7.AbstractC2867v, q7.AbstractC2826a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(p7.c decoder, int i8, K0 builder, boolean z8) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(decoder.j(getDescriptor(), i8));
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public K0 k(short[] sArr) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        return new K0(sArr);
    }

    @Override // q7.D0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(p7.d encoder, short[] content, int i8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.v(getDescriptor(), i9, content[i9]);
        }
    }
}
