package p043e6;

import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20868e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f20870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20872d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final r a() {
            return new b(new HashMap());
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends r {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<Object, Object> customOptions) {
            super(customOptions, null);
            t.g(customOptions, "customOptions");
        }

        @Override // p043e6.r
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b a() {
            b bVar = new b(new HashMap(c()));
            bVar.b(this);
            return bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends r {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20874g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map<Object, Object> customOptions) {
            super(customOptions, null);
            t.g(customOptions, "customOptions");
            this.f20873f = -1;
            this.f20874g = -1;
        }

        @Override // p043e6.r
        public void b(r from) {
            t.g(from, "from");
            super.b(from);
            if (from instanceof c) {
                c cVar = (c) from;
                this.f20873f = cVar.f20873f;
                this.f20874g = cVar.f20874g;
            }
        }

        @Override // p043e6.r
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public c a() {
            c cVar = new c(new HashMap(c()));
            cVar.b(this);
            return cVar;
        }

        public final int i() {
            return this.f20874g;
        }

        public final int j() {
            return this.f20873f;
        }

        public final d k() {
            d dVar = new d(new HashMap(c()));
            b(this);
            return dVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f20875h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20876i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Boolean f20877j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f20878k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Map<Object, Object> customOptions) {
            super(customOptions);
            t.g(customOptions, "customOptions");
            this.f20875h = true;
            this.f20876i = -1;
            this.f20878k = Long.MAX_VALUE;
        }

        @Override // e6.r.c, p043e6.r
        public void b(r from) {
            t.g(from, "from");
            super.b(from);
            if (from instanceof d) {
                d dVar = (d) from;
                this.f20875h = dVar.f20875h;
                this.f20876i = dVar.f20876i;
                this.f20877j = dVar.f20877j;
            }
        }

        @Override // e6.r.c
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public d a() {
            d dVar = new d(new HashMap(c()));
            dVar.b(this);
            return dVar;
        }

        public final Boolean m() {
            return this.f20877j;
        }

        public final int n() {
            return this.f20876i;
        }

        public final boolean o() {
            return this.f20875h;
        }

        public final long p() {
            return this.f20878k;
        }

        public final void q(boolean z8) {
            this.f20875h = z8;
        }

        public final void r(long j8) {
            this.f20878k = j8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f20879h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Map<Object, Object> customOptions) {
            super(customOptions);
            t.g(customOptions, "customOptions");
        }

        @Override // e6.r.c, p043e6.r
        public void b(r from) {
            t.g(from, "from");
            super.b(from);
            if (from instanceof e) {
                this.f20879h = ((e) from).f20879h;
            }
        }

        @Override // e6.r.c
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public e a() {
            e eVar = new e(new HashMap(c()));
            eVar.b(this);
            return eVar;
        }

        public final boolean m() {
            return this.f20879h;
        }
    }

    public /* synthetic */ r(Map map, AbstractC2633k abstractC2633k) {
        this(map);
    }

    public abstract r a();

    public final Map c() {
        return this.f20869a;
    }

    public final boolean d() {
        return this.f20871c;
    }

    public final boolean e() {
        return this.f20872d;
    }

    public final byte f() {
        return this.f20870b;
    }

    public final c g() {
        c cVar = new c(new HashMap(this.f20869a));
        b(this);
        return cVar;
    }

    public r(Map map) {
        this.f20869a = map;
        this.f20870b = v.f20887a.a();
    }

    public void b(r rVar) {
        t.g(rVar, ajyWhveMDgQ.DybAlGZAYXBQseG);
        this.f20870b = rVar.f20870b;
        this.f20871c = rVar.f20871c;
        this.f20872d = rVar.f20872d;
    }
}
