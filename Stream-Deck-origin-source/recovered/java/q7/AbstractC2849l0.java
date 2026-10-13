package q7;

import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: renamed from: q7.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2849l0 extends O0 {
    public String b0(String parentName, String childName) {
        kotlin.jvm.internal.t.g(parentName, "parentName");
        kotlin.jvm.internal.t.g(childName, "childName");
        if (parentName.length() == 0) {
            return childName;
        }
        return parentName + com.amazon.a.a.o.c.a.b.f16789a + childName;
    }

    public String c0(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return descriptor.g(i8);
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final String X(o7.f fVar, int i8) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        return e0(c0(fVar, i8));
    }

    public final String e0(String str) {
        kotlin.jvm.internal.t.g(str, GOKsbdzhLhXAMt.vMZxFkhOzuPKTr);
        String str2 = (String) W();
        if (str2 == null) {
            str2 = "";
        }
        return b0(str2, str);
    }
}
