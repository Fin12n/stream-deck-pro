package q7;

import D6.C0933m;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: renamed from: q7.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2860r0 implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f32142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C6.j f32143c;

    /* JADX INFO: renamed from: q7.r0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2860r0 f32145b;

        /* JADX INFO: renamed from: q7.r0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0701a extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2860r0 f32146a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0701a(C2860r0 c2860r0) {
                super(1);
                this.f32146a = c2860r0;
            }

            public final void b(o7.a buildSerialDescriptor) {
                kotlin.jvm.internal.t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.h(this.f32146a.f32142b);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((o7.a) obj);
                return C6.G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C2860r0 c2860r0) {
            super(0);
            this.f32144a = str;
            this.f32145b = c2860r0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o7.f invoke() {
            return o7.i.d(this.f32144a, o7.k.d.f31007a, new o7.f[0], new C0701a(this.f32145b));
        }
    }

    public C2860r0(String serialName, Object objectInstance) {
        kotlin.jvm.internal.t.g(serialName, "serialName");
        kotlin.jvm.internal.t.g(objectInstance, "objectInstance");
        this.f32141a = objectInstance;
        this.f32142b = D6.r.n();
        this.f32143c = C6.k.a(C6.l.PUBLICATION, new a(serialName, this));
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return (o7.f) this.f32143c.getValue();
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, Object value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }

    @Override // p116m7.a
    public Object deserialize(p7.e decoder) {
        int iE;
        kotlin.jvm.internal.t.g(decoder, "decoder");
        o7.f descriptor = getDescriptor();
        p7.c cVarB = decoder.b(descriptor);
        if (cVarB.x() || (iE = cVarB.E(getDescriptor())) == -1) {
            C6.G g8 = C6.G.f1419a;
            cVarB.c(descriptor);
            return this.f32141a;
        }
        throw new p116m7.j(RaiWHuj.CTquuRbQGSE + iE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2860r0(String serialName, Object objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        kotlin.jvm.internal.t.g(serialName, "serialName");
        kotlin.jvm.internal.t.g(objectInstance, "objectInstance");
        kotlin.jvm.internal.t.g(classAnnotations, "classAnnotations");
        this.f32142b = C0933m.c(classAnnotations);
    }
}
