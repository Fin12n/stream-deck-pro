package I7;

import Z6.u;
import Z6.v;
import Z6.w;
import kotlin.jvm.internal.AbstractC2633k;
import u7.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f3844g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f3846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f3848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3850f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final e a(t responseHeaders) {
            kotlin.jvm.internal.t.g(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z8 = false;
            Integer numM = null;
            boolean z9 = false;
            Integer numM2 = null;
            boolean z10 = false;
            boolean z11 = false;
            for (int i8 = 0; i8 < size; i8++) {
                if (v.v(responseHeaders.m(i8), "Sec-WebSocket-Extensions", true)) {
                    String strU = responseHeaders.u(i8);
                    int i9 = 0;
                    while (i9 < strU.length()) {
                        int i10 = i9;
                        int iR = v7.d.r(strU, ',', i10, 0, 4, null);
                        int iP = v7.d.p(strU, ';', i10, iR);
                        String strY = v7.d.Y(strU, i10, iP);
                        int i11 = iP + 1;
                        if (!v.v(strY, "permessage-deflate", true)) {
                            i9 = i11;
                            z11 = true;
                        } else if (z8) {
                            z11 = true;
                        } else {
                            z11 = true;
                            while (i11 < iR) {
                                int iP2 = v7.d.p(strU, ';', i11, iR);
                                int iP3 = v7.d.p(strU, '=', i11, iP2);
                                String strY2 = v7.d.Y(strU, i11, iP3);
                                String strS0 = iP3 < iP2 ? w.s0(v7.d.Y(strU, iP3 + 1, iP2), "\"") : null;
                                i11 = iP2 + 1;
                                if (v.v(strY2, "client_max_window_bits", true)) {
                                    if (numM != null) {
                                        z11 = true;
                                    }
                                    numM = strS0 != null ? u.m(strS0) : null;
                                    if (numM == null) {
                                        z11 = true;
                                    }
                                } else if (v.v(strY2, "client_no_context_takeover", true)) {
                                    if (z9) {
                                        z11 = true;
                                    }
                                    if (strS0 != null) {
                                        z11 = true;
                                    }
                                    z9 = true;
                                } else {
                                    if (v.v(strY2, "server_max_window_bits", true)) {
                                        if (numM2 != null) {
                                            z11 = true;
                                        }
                                        numM2 = strS0 != null ? u.m(strS0) : null;
                                        if (numM2 == null) {
                                        }
                                    } else if (v.v(strY2, "server_no_context_takeover", true)) {
                                        if (z10) {
                                            z11 = true;
                                        }
                                        if (strS0 != null) {
                                            z11 = true;
                                        }
                                        z10 = true;
                                    }
                                    z11 = true;
                                }
                            }
                            i9 = i11;
                            z8 = true;
                        }
                    }
                }
            }
            return new e(z8, numM, z9, numM2, z10, z11);
        }

        public a() {
        }
    }

    public e() {
        this(false, null, false, null, false, false, 63, null);
    }

    public final boolean a(boolean z8) {
        return z8 ? this.f3847c : this.f3849e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3845a == eVar.f3845a && kotlin.jvm.internal.t.c(this.f3846b, eVar.f3846b) && this.f3847c == eVar.f3847c && kotlin.jvm.internal.t.c(this.f3848d, eVar.f3848d) && this.f3849e == eVar.f3849e && this.f3850f == eVar.f3850f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z8 = this.f3845a;
        ?? r8 = z8;
        if (z8) {
            r8 = 1;
        }
        int i8 = r8 * 31;
        Integer num = this.f3846b;
        int iHashCode = (i8 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z9 = this.f3847c;
        ?? r9 = z9;
        if (z9) {
            r9 = 1;
        }
        int i9 = (iHashCode + r9) * 31;
        Integer num2 = this.f3848d;
        int iHashCode2 = (i9 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z10 = this.f3849e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode2 + r10) * 31;
        boolean z11 = this.f3850f;
        return i10 + (z11 ? 1 : z11);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f3845a + ", clientMaxWindowBits=" + this.f3846b + ", clientNoContextTakeover=" + this.f3847c + ", serverMaxWindowBits=" + this.f3848d + ", serverNoContextTakeover=" + this.f3849e + ", unknownValues=" + this.f3850f + ')';
    }

    public e(boolean z8, Integer num, boolean z9, Integer num2, boolean z10, boolean z11) {
        this.f3845a = z8;
        this.f3846b = num;
        this.f3847c = z9;
        this.f3848d = num2;
        this.f3849e = z10;
        this.f3850f = z11;
    }

    public /* synthetic */ e(boolean z8, Integer num, boolean z9, Integer num2, boolean z10, boolean z11, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? null : num, (i8 & 4) != 0 ? false : z9, (i8 & 8) != 0 ? null : num2, (i8 & 16) != 0 ? false : z10, (i8 & 32) != 0 ? false : z11);
    }
}
