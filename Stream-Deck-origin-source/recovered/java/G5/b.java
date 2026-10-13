package G5;

import C6.G;
import J5.g;
import M5.l;
import Q6.k;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p115m6.AbstractC2694d;
import p115m6.InterfaceC2692b;
import p115m6.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2797g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f2791a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2792b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f2793c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f2794d = C0121b.f2801a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2795e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2796f = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2798h = z.f30119a.b();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f2799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f2800b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, k kVar2) {
            super(1);
            this.f2799a = kVar;
            this.f2800b = kVar2;
        }

        public final void b(g gVar) {
            t.g(gVar, "$this$null");
            this.f2799a.invoke(gVar);
            this.f2800b.invoke(gVar);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((g) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: G5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0121b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0121b f2801a = new C0121b();

        public C0121b() {
            super(1);
        }

        public final void b(g gVar) {
            t.g(gVar, "$this$null");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((g) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f2802a = new c();

        public c() {
            super(1);
        }

        public final void b(Object obj) {
            t.g(obj, "$this$null");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f2803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f2804b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k kVar, k kVar2) {
            super(1);
            this.f2803a = kVar;
            this.f2804b = kVar2;
        }

        public final void b(Object obj) {
            t.g(obj, "$this$null");
            k kVar = this.f2803a;
            if (kVar != null) {
                kVar.invoke(obj);
            }
            this.f2804b.invoke(obj);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ M5.k f2805a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f2806a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2692b invoke() {
                return AbstractC2694d.a(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(M5.k kVar) {
            super(1);
            this.f2805a = kVar;
        }

        public final void b(G5.a scope) {
            t.g(scope, "scope");
            InterfaceC2692b interfaceC2692b = (InterfaceC2692b) scope.getAttributes().c(l.a(), a.f2806a);
            Object obj = scope.t().f2792b.get(this.f2805a.getKey());
            t.d(obj);
            Object objB = this.f2805a.b((k) obj);
            this.f2805a.a(objB, scope);
            interfaceC2692b.d(this.f2805a.getKey(), objB);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((G5.a) obj);
            return G.f1419a;
        }
    }

    public static /* synthetic */ void k(b bVar, M5.k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            kVar2 = c.f2802a;
        }
        bVar.i(kVar, kVar2);
    }

    public final void b(k block) {
        t.g(block, "block");
        this.f2794d = new a(this.f2794d, block);
    }

    public final boolean c() {
        return this.f2798h;
    }

    public final k d() {
        return this.f2794d;
    }

    public final boolean e() {
        return this.f2797g;
    }

    public final boolean f() {
        return this.f2795e;
    }

    public final boolean g() {
        return this.f2796f;
    }

    public final void h(G5.a client) {
        t.g(client, "client");
        Iterator it = this.f2791a.values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).invoke(client);
        }
        Iterator it2 = this.f2793c.values().iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).invoke(client);
        }
    }

    public final void i(M5.k plugin, k configure) {
        t.g(plugin, "plugin");
        t.g(configure, "configure");
        this.f2792b.put(plugin.getKey(), new d((k) this.f2792b.get(plugin.getKey()), configure));
        if (this.f2791a.containsKey(plugin.getKey())) {
            return;
        }
        this.f2791a.put(plugin.getKey(), new e(plugin));
    }

    public final void j(String key, k block) {
        t.g(key, "key");
        t.g(block, "block");
        this.f2793c.put(key, block);
    }

    public final void l(b other) {
        t.g(other, "other");
        this.f2795e = other.f2795e;
        this.f2796f = other.f2796f;
        this.f2797g = other.f2797g;
        this.f2791a.putAll(other.f2791a);
        this.f2792b.putAll(other.f2792b);
        this.f2793c.putAll(other.f2793c);
    }
}
