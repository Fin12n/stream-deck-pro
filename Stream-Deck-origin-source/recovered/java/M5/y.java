package M5;

import C6.InterfaceC0916e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class y extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient U5.c f5775a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(U5.c response, String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + '\"');
        kotlin.jvm.internal.t.g(response, "response");
        kotlin.jvm.internal.t.g(cachedResponseText, "cachedResponseText");
        this.f5775a = response;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public y(U5.c response) {
        this(response, "<no response text provided>");
        kotlin.jvm.internal.t.g(response, "response");
    }
}
