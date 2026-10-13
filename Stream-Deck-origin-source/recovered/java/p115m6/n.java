package p115m6;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends AbstractC2693c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f30084a = new ConcurrentHashMap();

    @Override // p115m6.InterfaceC2692b
    public Object c(C2691a key, Function0 block) {
        t.g(key, "key");
        t.g(block, "block");
        Object obj = h().get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = block.invoke();
        Object objPutIfAbsent = h().putIfAbsent(key, objInvoke);
        if (objPutIfAbsent != null) {
            objInvoke = objPutIfAbsent;
        }
        t.e(objInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return objInvoke;
    }

    @Override // p115m6.AbstractC2693c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ConcurrentHashMap h() {
        return this.f30084a;
    }
}
