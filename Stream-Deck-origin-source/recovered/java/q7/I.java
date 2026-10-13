package q7;

import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class I extends D0 implements p116m7.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I f32034c = new I();

    public I() {
        super(p125n7.a.F(C2635m.f28814a));
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(float[] fArr) {
        kotlin.jvm.internal.t.g(fArr, "<this>");
        return fArr.length;
    }

    @Override // q7.D0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] r() {
        return new float[0];
    }

    @Override // q7.AbstractC2867v, q7.AbstractC2826a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(p7.c decoder, int i8, H builder, boolean z8) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(decoder.l(getDescriptor(), i8));
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public H k(float[] fArr) {
        kotlin.jvm.internal.t.g(fArr, "<this>");
        return new H(fArr);
    }

    @Override // q7.D0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(p7.d encoder, float[] content, int i8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.z(getDescriptor(), i9, content[i9]);
        }
    }
}
