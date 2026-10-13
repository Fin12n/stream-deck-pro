package q7;

/* JADX INFO: renamed from: q7.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2851m0 extends P0 {
    public String d0(String parentName, String childName) {
        kotlin.jvm.internal.t.g(parentName, "parentName");
        kotlin.jvm.internal.t.g(childName, "childName");
        if (parentName.length() == 0) {
            return childName;
        }
        return parentName + com.amazon.a.a.o.c.a.b.f16789a + childName;
    }

    public String e0(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return descriptor.g(i8);
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final String a0(o7.f fVar, int i8) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        return g0(e0(fVar, i8));
    }

    public final String g0(String nestedName) {
        kotlin.jvm.internal.t.g(nestedName, "nestedName");
        String str = (String) Z();
        if (str == null) {
            str = "";
        }
        return d0(str, nestedName);
    }
}
