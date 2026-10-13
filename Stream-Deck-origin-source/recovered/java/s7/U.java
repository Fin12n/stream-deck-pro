package s7;

import java.lang.annotation.Annotation;
import q7.AbstractC2828b;
import r7.EnumC2877a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class U {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33222a;

        static {
            int[] iArr = new int[EnumC2877a.values().length];
            try {
                iArr[EnumC2877a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2877a.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2877a.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33222a = iArr;
        }
    }

    public static final void b(o7.j kind) {
        kotlin.jvm.internal.t.g(kind, "kind");
        if (kind instanceof o7.j.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof o7.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof o7.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(o7.f fVar, r7.c json) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        kotlin.jvm.internal.t.g(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof r7.g) {
                return ((r7.g) annotation).discriminator();
            }
        }
        return json.e().d();
    }

    public static final Object d(r7.i iVar, p116m7.a deserializer) {
        r7.y yVarP;
        kotlin.jvm.internal.t.g(iVar, "<this>");
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC2828b) || iVar.d().e().o()) {
            return deserializer.deserialize(iVar);
        }
        String strC = c(deserializer.getDescriptor(), iVar.d());
        r7.j jVarM = iVar.m();
        o7.f descriptor = deserializer.getDescriptor();
        if (!(jVarM instanceof r7.w)) {
            throw C.e(-1, "Expected " + kotlin.jvm.internal.K.b(r7.w.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.K.b(jVarM.getClass()));
        }
        r7.w wVar = (r7.w) jVarM;
        r7.j jVar = (r7.j) wVar.get(strC);
        try {
            p116m7.a aVarA = p116m7.f.a((AbstractC2828b) deserializer, iVar, (jVar == null || (yVarP = r7.k.p(jVar)) == null) ? null : r7.k.g(yVarP));
            kotlin.jvm.internal.t.e(aVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
            return c0.a(iVar.d(), strC, wVar, aVarA);
        } catch (p116m7.j e8) {
            String message = e8.getMessage();
            kotlin.jvm.internal.t.d(message);
            throw C.f(-1, message, wVar.toString());
        }
    }

    public static final void e(p116m7.k kVar, p116m7.k kVar2, String str) {
        if ((kVar instanceof p116m7.g) && q7.V.a(kVar2.getDescriptor()).contains(str)) {
            String strA = kVar.getDescriptor().a();
            throw new IllegalStateException(("Sealed class '" + kVar2.getDescriptor().a() + "' cannot be serialized as base class '" + strA + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
