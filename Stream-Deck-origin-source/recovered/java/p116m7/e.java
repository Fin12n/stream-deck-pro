package p116m7;

import C6.G;
import C6.j;
import C6.l;
import D6.C0933m;
import D6.r;
import Q6.k;
import X6.d;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o7.b;
import o7.f;
import o7.i;
import q7.AbstractC2828b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends AbstractC2828b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f30127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f30128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f30129c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: m7.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0649a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f30131a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0649a(e eVar) {
                super(1);
                this.f30131a = eVar;
            }

            public final void b(o7.a buildSerialDescriptor) {
                t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                o7.a.b(buildSerialDescriptor, "type", p125n7.a.J(O.f28784a).getDescriptor(), null, false, 12, null);
                o7.a.b(buildSerialDescriptor, "value", i.e("kotlinx.serialization.Polymorphic<" + this.f30131a.e().d() + '>', o7.j.a.f31002a, new f[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.h(this.f30131a.f30128b);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((o7.a) obj);
                return G.f1419a;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            return b.c(i.d("kotlinx.serialization.Polymorphic", o7.d.a.f30969a, new f[0], new C0649a(e.this)), e.this.e());
        }
    }

    public e(d baseClass) {
        t.g(baseClass, "baseClass");
        this.f30127a = baseClass;
        this.f30128b = r.n();
        this.f30129c = C6.k.a(l.PUBLICATION, new a());
    }

    @Override // q7.AbstractC2828b
    public d e() {
        return this.f30127a;
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return (f) this.f30129c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(d baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        t.g(baseClass, "baseClass");
        t.g(classAnnotations, "classAnnotations");
        this.f30128b = C0933m.c(classAnnotations);
    }
}
