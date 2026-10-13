package q7;

import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;

/* JADX INFO: renamed from: q7.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2839g0 extends X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o7.f f32105c;

    /* JADX INFO: renamed from: q7.g0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Map.Entry, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f32106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f32107b;

        public a(Object obj, Object obj2) {
            this.f32106a = obj;
            this.f32107b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.t.c(this.f32106a, aVar.f32106a) && kotlin.jvm.internal.t.c(this.f32107b, aVar.f32107b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f32106a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f32107b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f32106a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f32107b;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f32106a + ", value=" + this.f32107b + ')';
        }
    }

    /* JADX INFO: renamed from: q7.g0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p116m7.b f32108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p116m7.b f32109b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p116m7.b bVar, p116m7.b bVar2) {
            super(1);
            this.f32108a = bVar;
            this.f32109b = bVar2;
        }

        public final void b(o7.a buildSerialDescriptor) {
            kotlin.jvm.internal.t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
            o7.a.b(buildSerialDescriptor, SubscriberAttributeKt.JSON_NAME_KEY, this.f32108a.getDescriptor(), null, false, 12, null);
            o7.a.b(buildSerialDescriptor, "value", this.f32109b.getDescriptor(), null, false, 12, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((o7.a) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2839g0(p116m7.b keySerializer, p116m7.b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.t.g(keySerializer, "keySerializer");
        kotlin.jvm.internal.t.g(valueSerializer, "valueSerializer");
        this.f32105c = o7.i.d("kotlin.collections.Map.Entry", o7.k.c.f31006a, new o7.f[0], new b(keySerializer, valueSerializer));
    }

    @Override // q7.X
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(Map.Entry entry) {
        kotlin.jvm.internal.t.g(entry, "<this>");
        return entry.getValue();
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return this.f32105c;
    }

    @Override // q7.X
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Map.Entry e(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // q7.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object a(Map.Entry entry) {
        kotlin.jvm.internal.t.g(entry, uYOhHhTXuF.TBx);
        return entry.getKey();
    }
}
