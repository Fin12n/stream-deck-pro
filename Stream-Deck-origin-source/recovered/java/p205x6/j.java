package p205x6;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p213y6.a;
import p221z6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends s {
    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p205x6.s
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j j(char c8) {
        s sVarJ = super.j(c8);
        t.e(sVarJ, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) sVarJ;
    }

    @Override // p205x6.s
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j o(CharSequence charSequence) {
        s sVarO = super.o(charSequence);
        t.e(sVarO, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) sVarO;
    }

    @Override // p205x6.s
    /* JADX INFO: renamed from: K1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j t(CharSequence charSequence, int i8, int i9) {
        s sVarT = super.t(charSequence, i8, i9);
        t.e(sVarT, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) sVarT;
    }

    public final k M1() {
        int iP1 = P1();
        a aVarA1 = a1();
        return aVarA1 == null ? k.f37426i.a() : new k(aVarA1, iP1, A0());
    }

    public final int P1() {
        return O0();
    }

    public final g R1() {
        return A0();
    }

    public final boolean U1() {
        return O0() == 0;
    }

    @Override // p205x6.s
    public final void j0(ByteBuffer source, int i8, int i9) {
        t.g(source, "source");
    }

    public String toString() {
        return "BytePacketBuilder[0x" + hashCode() + ']';
    }

    public /* synthetic */ j(g gVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? a.f38436j.c() : gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g pool) {
        super(pool);
        t.g(pool, "pool");
    }

    @Override // p205x6.s
    public final void i0() {
    }
}
