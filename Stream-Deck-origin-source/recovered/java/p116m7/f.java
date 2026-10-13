package p116m7;

import C6.C0920i;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import p7.c;
import q7.AbstractC2828b;
import q7.AbstractC2830c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final a a(AbstractC2828b abstractC2828b, c decoder, String str) {
        t.g(abstractC2828b, "<this>");
        t.g(decoder, "decoder");
        a aVarC = abstractC2828b.c(decoder, str);
        if (aVarC != null) {
            return aVarC;
        }
        AbstractC2830c.b(str, abstractC2828b.e());
        throw new C0920i();
    }

    public static final k b(AbstractC2828b abstractC2828b, p7.f encoder, Object value) {
        t.g(abstractC2828b, "<this>");
        t.g(encoder, "encoder");
        t.g(value, "value");
        k kVarD = abstractC2828b.d(encoder, value);
        if (kVarD != null) {
            return kVarD;
        }
        AbstractC2830c.a(K.b(value.getClass()), abstractC2828b.e());
        throw new C0920i();
    }
}
