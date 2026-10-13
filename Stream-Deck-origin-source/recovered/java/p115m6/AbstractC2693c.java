package p115m6;

import D6.z;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: m6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2693c implements InterfaceC2692b {
    @Override // p115m6.InterfaceC2692b
    public final void a(C2691a key) {
        t.g(key, "key");
        h().remove(key);
    }

    @Override // p115m6.InterfaceC2692b
    public Object b(C2691a c2691a) {
        return InterfaceC2692b.a.a(this, c2691a);
    }

    @Override // p115m6.InterfaceC2692b
    public final void d(C2691a key, Object value) {
        t.g(key, "key");
        t.g(value, "value");
        h().put(key, value);
    }

    @Override // p115m6.InterfaceC2692b
    public final Object e(C2691a key) {
        t.g(key, "key");
        return h().get(key);
    }

    @Override // p115m6.InterfaceC2692b
    public final List f() {
        return z.R0(h().keySet());
    }

    @Override // p115m6.InterfaceC2692b
    public final boolean g(C2691a key) {
        t.g(key, "key");
        return h().containsKey(key);
    }

    public abstract Map h();
}
