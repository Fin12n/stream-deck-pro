package q7;

import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import kotlin.jvm.internal.C2629g;

/* JADX INFO: renamed from: q7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2858q extends D0 implements p116m7.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2858q f32136c = new C2858q();

    public C2858q() {
        super(p125n7.a.D(C2629g.f28804a));
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(char[] cArr) {
        kotlin.jvm.internal.t.g(cArr, "<this>");
        return cArr.length;
    }

    @Override // q7.D0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] r() {
        return new char[0];
    }

    @Override // q7.D0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(p7.d encoder, char[] content, int i8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.B(getDescriptor(), i9, content[i9]);
        }
    }

    @Override // q7.AbstractC2867v, q7.AbstractC2826a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(p7.c cVar, int i8, C2856p builder, boolean z8) {
        kotlin.jvm.internal.t.g(cVar, ajyWhveMDgQ.vcgmsxpvX);
        kotlin.jvm.internal.t.g(builder, "builder");
        builder.e(cVar.h(getDescriptor(), i8));
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2856p k(char[] cArr) {
        kotlin.jvm.internal.t.g(cArr, LYdqVGvOGMNr.bdVrNyTNFmD);
        return new C2856p(cArr);
    }
}
