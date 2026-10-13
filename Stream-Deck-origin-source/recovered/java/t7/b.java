package t7;

import Q6.k;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f34305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f34306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f34307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f34308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f34309e;

    @Override // t7.c
    public void a(e collector) {
        t.g(collector, "collector");
        for (Map.Entry entry : this.f34305a.entrySet()) {
            X6.d dVar = (X6.d) entry.getKey();
            a aVar = (a) entry.getValue();
            if (aVar instanceof a.C0776a) {
                t.e(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                p116m7.b bVarB = ((a.C0776a) aVar).b();
                t.e(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.e(dVar, bVarB);
            } else if (aVar instanceof a.b) {
                collector.a(dVar, ((a.b) aVar).b());
            }
        }
        for (Map.Entry entry2 : this.f34306b.entrySet()) {
            X6.d dVar2 = (X6.d) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                X6.d dVar3 = (X6.d) entry3.getKey();
                p116m7.b bVar = (p116m7.b) entry3.getValue();
                t.e(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                t.e(dVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                t.e(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.b(dVar2, dVar3, bVar);
            }
        }
        for (Map.Entry entry4 : this.f34307c.entrySet()) {
            X6.d dVar4 = (X6.d) entry4.getKey();
            k kVar = (k) entry4.getValue();
            t.e(dVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            t.e(kVar, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.c(dVar4, (k) P.e(kVar, 1));
        }
        for (Map.Entry entry5 : this.f34309e.entrySet()) {
            X6.d dVar5 = (X6.d) entry5.getKey();
            k kVar2 = (k) entry5.getValue();
            t.e(dVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            t.e(kVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.d(dVar5, (k) P.e(kVar2, 1));
        }
    }

    @Override // t7.c
    public p116m7.b b(X6.d kClass, List typeArgumentsSerializers) {
        t.g(kClass, "kClass");
        t.g(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = (a) this.f34305a.get(kClass);
        p116m7.b bVarA = aVar != null ? aVar.a(typeArgumentsSerializers) : null;
        if (bVarA != null) {
            return bVarA;
        }
        return null;
    }

    @Override // t7.c
    public p116m7.a d(X6.d baseClass, String str) {
        t.g(baseClass, "baseClass");
        Map map = (Map) this.f34308d.get(baseClass);
        p116m7.b bVar = map != null ? (p116m7.b) map.get(str) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f34309e.get(baseClass);
        k kVar = P.k(obj, 1) ? (k) obj : null;
        if (kVar != null) {
            return (p116m7.a) kVar.invoke(str);
        }
        return null;
    }

    @Override // t7.c
    public p116m7.k e(X6.d baseClass, Object value) {
        t.g(baseClass, "baseClass");
        t.g(value, "value");
        if (!baseClass.g(value)) {
            return null;
        }
        Map map = (Map) this.f34306b.get(baseClass);
        p116m7.b bVar = map != null ? (p116m7.b) map.get(K.b(value.getClass())) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f34307c.get(baseClass);
        k kVar = P.k(obj, 1) ? (k) obj : null;
        if (kVar != null) {
            return (p116m7.k) kVar.invoke(value);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Map<X6.d, ? extends a> map, Map<X6.d, ? extends Map<X6.d, ? extends p116m7.b>> polyBase2Serializers, Map<X6.d, ? extends k> polyBase2DefaultSerializerProvider, Map<X6.d, ? extends Map<String, ? extends p116m7.b>> polyBase2NamedSerializers, Map<X6.d, ? extends k> polyBase2DefaultDeserializerProvider) {
        super(null);
        t.g(map, BpgIURjN.HlLmZMIEdv);
        t.g(polyBase2Serializers, "polyBase2Serializers");
        t.g(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        t.g(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        t.g(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f34305a = map;
        this.f34306b = polyBase2Serializers;
        this.f34307c = polyBase2DefaultSerializerProvider;
        this.f34308d = polyBase2NamedSerializers;
        this.f34309e = polyBase2DefaultDeserializerProvider;
    }
}
