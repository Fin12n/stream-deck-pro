package s7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c0 {
    public static final Object a(r7.c cVar, String discriminator, r7.w element, p116m7.a deserializer) {
        kotlin.jvm.internal.t.g(cVar, "<this>");
        kotlin.jvm.internal.t.g(discriminator, "discriminator");
        kotlin.jvm.internal.t.g(element, "element");
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        return new M(cVar, element, discriminator, deserializer.getDescriptor()).A(deserializer);
    }
}
