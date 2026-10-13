package p181u6;

import P6.a;
import X6.d;
import X6.m;
import X6.r;
import java.lang.reflect.Type;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final Type a(m mVar) {
        t.g(mVar, "<this>");
        return r.e(mVar);
    }

    public static final boolean b(Object obj, d type) {
        t.g(obj, "<this>");
        t.g(type, "type");
        return a.a(type).isInstance(obj);
    }

    public static final a c(Type reifiedType, d kClass, m mVar) {
        t.g(reifiedType, "reifiedType");
        t.g(kClass, "kClass");
        return new a(kClass, reifiedType, mVar);
    }
}
