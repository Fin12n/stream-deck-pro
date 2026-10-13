package q7;

import kotlin.jvm.internal.C2626d;

/* JADX INFO: renamed from: q7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2840h extends D0 implements p116m7.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2840h f32110c = new C2840h();

    public C2840h() {
        super(p125n7.a.B(C2626d.f28801a));
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(boolean[] zArr) {
        kotlin.jvm.internal.t.g(zArr, "<this>");
        return zArr.length;
    }

    @Override // q7.D0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public boolean[] r() {
        return new boolean[0];
    }

    @Override // q7.AbstractC2867v, q7.AbstractC2826a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(p7.c decoder, int i8, C2838g builder, boolean z8) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(decoder.e(getDescriptor(), i8));
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2838g k(boolean[] zArr) {
        kotlin.jvm.internal.t.g(zArr, "<this>");
        return new C2838g(zArr);
    }

    @Override // q7.D0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(p7.d encoder, boolean[] content, int i8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.w(getDescriptor(), i9, content[i9]);
        }
    }
}
