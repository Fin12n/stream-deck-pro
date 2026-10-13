package q7;

import C6.C0920i;

/* JADX INFO: renamed from: q7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2830c {
    public static final Void a(X6.d subClass, X6.d baseClass) {
        kotlin.jvm.internal.t.g(subClass, "subClass");
        kotlin.jvm.internal.t.g(baseClass, "baseClass");
        String strD = subClass.d();
        if (strD == null) {
            strD = String.valueOf(subClass);
        }
        b(strD, baseClass);
        throw new C0920i();
    }

    public static final Void b(String str, X6.d baseClass) {
        String str2;
        kotlin.jvm.internal.t.g(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.d() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + com.amazon.a.a.o.c.a.b.f16789a;
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.d() + "' has to be sealed and '@Serializable'.";
        }
        throw new p116m7.j(str2);
    }
}
