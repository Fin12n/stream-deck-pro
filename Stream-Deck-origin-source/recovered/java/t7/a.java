package t7;

import Q6.k;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: t7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0776a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p116m7.b f34303a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0776a(p116m7.b serializer) {
            super(null);
            t.g(serializer, "serializer");
            this.f34303a = serializer;
        }

        @Override // t7.a
        public p116m7.b a(List typeArgumentsSerializers) {
            t.g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f34303a;
        }

        public final p116m7.b b() {
            return this.f34303a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0776a) && t.c(((C0776a) obj).f34303a, this.f34303a);
        }

        public int hashCode() {
            return this.f34303a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f34304a;

        @Override // t7.a
        public p116m7.b a(List typeArgumentsSerializers) {
            t.g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return (p116m7.b) this.f34304a.invoke(typeArgumentsSerializers);
        }

        public final k b() {
            return this.f34304a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(null);
            t.g(kVar, ajyWhveMDgQ.hUsgeUiKpod);
            this.f34304a = kVar;
        }
    }

    public /* synthetic */ a(AbstractC2633k abstractC2633k) {
        this();
    }

    public abstract p116m7.b a(List list);

    public a() {
    }
}
