package p017b7;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class V0 extends CancellationException implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC1815v0 f15922a;

    public V0(String str, InterfaceC1815v0 interfaceC1815v0) {
        super(str);
        this.f15922a = interfaceC1815v0;
    }

    @Override // p017b7.D
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public V0 a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        V0 v8 = new V0(message, this.f15922a);
        v8.initCause(this);
        return v8;
    }

    public V0(String str) {
        this(str, null);
    }
}
