package q7;

/* JADX INFO: renamed from: q7.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2835e0 extends D0 implements p116m7.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2835e0 f32097c = new C2835e0();

    public C2835e0() {
        super(p125n7.a.H(kotlin.jvm.internal.v.f28816a));
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(long[] jArr) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        return jArr.length;
    }

    @Override // q7.D0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public long[] r() {
        return new long[0];
    }

    @Override // q7.AbstractC2867v, q7.AbstractC2826a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(p7.c decoder, int i8, C2833d0 builder, boolean z8) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(decoder.D(getDescriptor(), i8));
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2833d0 k(long[] jArr) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        return new C2833d0(jArr);
    }

    @Override // q7.D0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(p7.d encoder, long[] content, int i8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.C(getDescriptor(), i9, content[i9]);
        }
    }
}
