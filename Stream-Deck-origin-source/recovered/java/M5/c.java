package M5;

import C6.InterfaceC0916e;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import io.sentry.exception.uXy.SZCvugJaXc;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(U5.c response, String cachedResponseText) {
        super(response, cachedResponseText);
        kotlin.jvm.internal.t.g(response, "response");
        kotlin.jvm.internal.t.g(cachedResponseText, "cachedResponseText");
        this.f5602b = "Client request(" + response.g1().f().L0().e() + ' ' + response.g1().f().o() + yOZfxp.ZkNmOdJCq + response.g() + SZCvugJaXc.cJJyTIuRtGaAjyC + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f5602b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public c(U5.c response) {
        this(response, "<no response text provided>");
        kotlin.jvm.internal.t.g(response, "response");
    }
}
