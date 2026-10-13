package s7;

import io.jentz.winter.js.HRHLwtyqJWz;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class V implements t7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33224b;

    public V(boolean z8, String discriminator) {
        kotlin.jvm.internal.t.g(discriminator, "discriminator");
        this.f33223a = z8;
        this.f33224b = discriminator;
    }

    @Override // t7.e
    public void a(X6.d kClass, Q6.k provider) {
        kotlin.jvm.internal.t.g(kClass, "kClass");
        kotlin.jvm.internal.t.g(provider, "provider");
    }

    @Override // t7.e
    public void c(X6.d baseClass, Q6.k defaultSerializerProvider) {
        kotlin.jvm.internal.t.g(baseClass, "baseClass");
        kotlin.jvm.internal.t.g(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // t7.e
    public void d(X6.d baseClass, Q6.k defaultDeserializerProvider) {
        kotlin.jvm.internal.t.g(baseClass, "baseClass");
        kotlin.jvm.internal.t.g(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // t7.e
    public void e(X6.d dVar, p116m7.b bVar) {
        t7.e.a.a(this, dVar, bVar);
    }

    public final void f(o7.f fVar, X6.d dVar) {
        int iF = fVar.f();
        for (int i8 = 0; i8 < iF; i8++) {
            String strG = fVar.g(i8);
            if (kotlin.jvm.internal.t.c(strG, this.f33224b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + dVar + " has property '" + strG + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    public final void g(o7.f fVar, X6.d dVar) {
        o7.j jVarE = fVar.e();
        if ((jVarE instanceof o7.d) || kotlin.jvm.internal.t.c(jVarE, o7.j.a.f31002a)) {
            throw new IllegalArgumentException("Serializer for " + dVar.d() + " can't be registered as a subclass for polymorphic serialization because its kind " + jVarE + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f33223a) {
            return;
        }
        if (kotlin.jvm.internal.t.c(jVarE, o7.k.b.f31005a) || kotlin.jvm.internal.t.c(jVarE, o7.k.c.f31006a) || (jVarE instanceof o7.e) || (jVarE instanceof o7.j.b)) {
            throw new IllegalArgumentException("Serializer for " + dVar.d() + " of kind " + jVarE + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // t7.e
    public void b(X6.d baseClass, X6.d dVar, p116m7.b actualSerializer) {
        kotlin.jvm.internal.t.g(baseClass, "baseClass");
        kotlin.jvm.internal.t.g(dVar, HRHLwtyqJWz.foLTC);
        kotlin.jvm.internal.t.g(actualSerializer, "actualSerializer");
        o7.f descriptor = actualSerializer.getDescriptor();
        g(descriptor, dVar);
        if (this.f33223a) {
            return;
        }
        f(descriptor, dVar);
    }
}
