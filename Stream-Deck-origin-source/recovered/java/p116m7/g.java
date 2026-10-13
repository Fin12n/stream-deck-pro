package p116m7;

import C6.G;
import C6.j;
import C6.l;
import D6.C0933m;
import D6.C0934n;
import D6.E;
import D6.L;
import D6.M;
import D6.r;
import Q6.k;
import X6.d;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o7.f;
import o7.i;
import p180u5.FCkZ.BpgIURjN;
import p7.c;
import q7.AbstractC2828b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbstractC2828b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f30132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f30133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f30134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f30135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f30136e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f30138b;

        /* JADX INFO: renamed from: m7.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0650a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f30139a;

            /* JADX INFO: renamed from: m7.g$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0651a extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g f30140a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0651a(g gVar) {
                    super(1);
                    this.f30140a = gVar;
                }

                public final void b(o7.a buildSerialDescriptor) {
                    t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                    for (Map.Entry entry : this.f30140a.f30136e.entrySet()) {
                        o7.a.b(buildSerialDescriptor, (String) entry.getKey(), ((p116m7.b) entry.getValue()).getDescriptor(), null, false, 12, null);
                    }
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((o7.a) obj);
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0650a(g gVar) {
                super(1);
                this.f30139a = gVar;
            }

            public final void b(o7.a buildSerialDescriptor) {
                t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                o7.a.b(buildSerialDescriptor, "type", p125n7.a.J(O.f28784a).getDescriptor(), null, false, 12, null);
                o7.a.b(buildSerialDescriptor, "value", i.d("kotlinx.serialization.Sealed<" + this.f30139a.e().d() + '>', o7.j.a.f31002a, new f[0], new C0651a(this.f30139a)), null, false, 12, null);
                buildSerialDescriptor.h(this.f30139a.f30133b);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((o7.a) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, g gVar) {
            super(0);
            this.f30137a = str;
            this.f30138b = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            return i.d(this.f30137a, o7.d.b.f30970a, new f[0], new C0650a(this.f30138b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f30141a;

        public b(Iterable iterable) {
            this.f30141a = iterable;
        }

        @Override // D6.E
        public Object a(Object obj) {
            return ((p116m7.b) ((Map.Entry) obj).getValue()).getDescriptor().a();
        }

        @Override // D6.E
        public Iterator b() {
            return this.f30141a.iterator();
        }
    }

    public g(String serialName, d baseClass, d[] subclasses, p116m7.b[] bVarArr) {
        t.g(serialName, "serialName");
        t.g(baseClass, "baseClass");
        t.g(subclasses, "subclasses");
        t.g(bVarArr, BpgIURjN.wQbkGhG);
        this.f30132a = baseClass;
        this.f30133b = r.n();
        this.f30134c = C6.k.a(l.PUBLICATION, new a(serialName, this));
        if (subclasses.length != bVarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + e().d() + " should be marked @Serializable");
        }
        Map mapT = M.t(C0934n.w0(subclasses, bVarArr));
        this.f30135d = mapT;
        b bVar = new b(mapT.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itB = bVar.b();
        while (itB.hasNext()) {
            Object next = itB.next();
            Object objA = bVar.a(next);
            Object obj = linkedHashMap.get(objA);
            if (obj == null) {
                linkedHashMap.containsKey(objA);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) objA;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + e() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(L.d(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (p116m7.b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f30136e = linkedHashMap2;
    }

    @Override // q7.AbstractC2828b
    public p116m7.a c(c decoder, String str) {
        t.g(decoder, "decoder");
        p116m7.b bVar = (p116m7.b) this.f30136e.get(str);
        return bVar != null ? bVar : super.c(decoder, str);
    }

    @Override // q7.AbstractC2828b
    public k d(p7.f encoder, Object value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        k kVarD = (p116m7.b) this.f30135d.get(K.b(value.getClass()));
        if (kVarD == null) {
            kVarD = super.d(encoder, value);
        }
        if (kVarD != null) {
            return kVarD;
        }
        return null;
    }

    @Override // q7.AbstractC2828b
    public d e() {
        return this.f30132a;
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return (f) this.f30134c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String serialName, d baseClass, d[] subclasses, p116m7.b[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        t.g(serialName, "serialName");
        t.g(baseClass, "baseClass");
        t.g(subclasses, "subclasses");
        t.g(subclassSerializers, "subclassSerializers");
        t.g(classAnnotations, "classAnnotations");
        this.f30133b = C0933m.c(classAnnotations);
    }
}
