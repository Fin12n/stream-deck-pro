package s7;

import C6.C0920i;
import P2.Lsk.mHPawN;
import Z.JTT.ryTuoS;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;

/* JADX INFO: renamed from: s7.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2916x extends p7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2894a f33306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7.c f33307b;

    public C2916x(AbstractC2894a lexer, r7.c json) {
        kotlin.jvm.internal.t.g(lexer, "lexer");
        kotlin.jvm.internal.t.g(json, "json");
        this.f33306a = lexer;
        this.f33307b = json.a();
    }

    @Override // p7.a, p7.e
    public short F() {
        AbstractC2894a abstractC2894a = this.f33306a;
        String strQ = abstractC2894a.q();
        try {
            return Z6.z.j(strQ);
        } catch (IllegalArgumentException unused) {
            AbstractC2894a.x(abstractC2894a, "Failed to parse type 'UShort' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C0920i();
        }
    }

    @Override // p7.c
    public t7.c a() {
        return this.f33307b;
    }

    @Override // p7.a, p7.e
    public long t() {
        AbstractC2894a abstractC2894a = this.f33306a;
        String strQ = abstractC2894a.q();
        try {
            return Z6.z.g(strQ);
        } catch (IllegalArgumentException unused) {
            AbstractC2894a.x(abstractC2894a, "Failed to parse type 'ULong' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C0920i();
        }
    }

    @Override // p7.a, p7.e
    public byte C() {
        AbstractC2894a abstractC2894a = this.f33306a;
        String strQ = abstractC2894a.q();
        try {
            return Z6.z.a(strQ);
        } catch (IllegalArgumentException unused) {
            AbstractC2894a.x(abstractC2894a, mHPawN.KUKCas + WaYxBuDSBD.gJTXTULD + "' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C0920i();
        }
    }

    @Override // p7.c
    public int E(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        throw new IllegalStateException(LYdqVGvOGMNr.BEZnLDnKLS);
    }

    @Override // p7.a, p7.e
    public int o() {
        AbstractC2894a abstractC2894a = this.f33306a;
        String strQ = abstractC2894a.q();
        try {
            return Z6.z.d(strQ);
        } catch (IllegalArgumentException unused) {
            AbstractC2894a.x(abstractC2894a, "Failed to parse type '" + ryTuoS.DqDamKZJRe + "' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C0920i();
        }
    }
}
