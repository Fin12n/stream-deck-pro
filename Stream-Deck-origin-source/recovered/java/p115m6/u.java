package p115m6;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC2693c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f30095a = new HashMap();

    @Override // p115m6.InterfaceC2692b
    public Object c(C2691a key, Function0 block) {
        t.g(key, "key");
        t.g(block, "block");
        Object obj = h().get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = block.invoke();
        Object objPut = h().put(key, objInvoke);
        if (objPut != null) {
            objInvoke = objPut;
        }
        t.e(objInvoke, "null cannot be cast to non-null type T of io.ktor.util.HashMapAttributes.computeIfAbsent");
        return objInvoke;
    }

    @Override // p115m6.AbstractC2693c
    public Map h() {
        return this.f30095a;
    }
}
