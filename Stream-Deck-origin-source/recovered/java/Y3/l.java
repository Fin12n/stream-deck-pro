package Y3;

import C6.G;
import C6.r;
import D6.M;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f12422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p098k7.a f12423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f12424c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f12427c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12429e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12427c = obj;
            this.f12429e |= Integer.MIN_VALUE;
            return l.this.b(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f12433d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12435f;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12433d = obj;
            this.f12435f |= Integer.MIN_VALUE;
            return l.this.c(null, this);
        }
    }

    public l(Context context) {
        t.g(context, "context");
        this.f12422a = new h(context, null, 2, null);
        this.f12423b = p098k7.c.b(false, 1, null);
        this.f12424c = new LinkedHashMap();
    }

    public final Map a() {
        return M.v(this.f12424c);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0031, B:28:0x0071, B:30:0x0075, B:31:0x007b), top: B:40:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(G6.d dVar) throws Throwable {
        a aVar;
        p098k7.a aVar2;
        l lVar;
        p098k7.a aVar3;
        Throwable th;
        l lVar2;
        Map map;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f12429e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f12429e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f12427c;
        Object objF = H6.c.f();
        int i9 = aVar.f12429e;
        try {
            if (i9 == 0) {
                r.b(obj);
                aVar2 = this.f12423b;
                aVar.f12425a = this;
                aVar.f12426b = aVar2;
                aVar.f12429e = 1;
                if (aVar2.b(null, aVar) != objF) {
                    lVar = this;
                }
                return objF;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (p098k7.a) aVar.f12426b;
                lVar2 = (l) aVar.f12425a;
                try {
                    r.b(obj);
                    map = (Map) obj;
                    if (map != null) {
                        lVar2.f12424c = M.y(map);
                    }
                    G g8 = G.f1419a;
                    aVar3.e(null);
                    return G.f1419a;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.e(null);
                    throw th;
                }
            }
            p098k7.a aVar4 = (p098k7.a) aVar.f12426b;
            lVar = (l) aVar.f12425a;
            r.b(obj);
            aVar2 = aVar4;
            h hVar = lVar.f12422a;
            aVar.f12425a = lVar;
            aVar.f12426b = aVar2;
            aVar.f12429e = 2;
            Object objE = hVar.e(aVar);
            if (objE != objF) {
                aVar3 = aVar2;
                obj = objE;
                lVar2 = lVar;
                map = (Map) obj;
                if (map != null) {
                    lVar2.f12424c = M.y(map);
                }
                G g9 = G.f1419a;
                aVar3.e(null);
                return G.f1419a;
            }
            return objF;
        } catch (Throwable th3) {
            aVar3 = aVar2;
            th = th3;
            aVar3.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Map map, G6.d dVar) {
        b bVar;
        p098k7.a aVar;
        l lVar;
        Throwable th;
        p098k7.a aVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f12435f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f12435f = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f12433d;
        Object objF = H6.c.f();
        int i9 = bVar.f12435f;
        try {
            if (i9 == 0) {
                r.b(obj);
                aVar = this.f12423b;
                bVar.f12430a = this;
                bVar.f12431b = map;
                bVar.f12432c = aVar;
                bVar.f12435f = 1;
                if (aVar.b(null, bVar) != objF) {
                    lVar = this;
                }
                return objF;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (p098k7.a) bVar.f12430a;
                try {
                    r.b(obj);
                    G g8 = G.f1419a;
                    aVar2.e(null);
                    return G.f1419a;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.e(null);
                    throw th;
                }
            }
            p098k7.a aVar3 = (p098k7.a) bVar.f12432c;
            Map map2 = (Map) bVar.f12431b;
            lVar = (l) bVar.f12430a;
            r.b(obj);
            aVar = aVar3;
            map = map2;
            lVar.f12424c.putAll(map);
            h hVar = lVar.f12422a;
            Map map3 = lVar.f12424c;
            bVar.f12430a = aVar;
            bVar.f12431b = null;
            bVar.f12432c = null;
            bVar.f12435f = 2;
            if (hVar.f(map3, bVar) != objF) {
                aVar2 = aVar;
                G g9 = G.f1419a;
                aVar2.e(null);
                return G.f1419a;
            }
            return objF;
        } catch (Throwable th3) {
            p098k7.a aVar4 = aVar;
            th = th3;
            aVar2 = aVar4;
            aVar2.e(null);
            throw th;
        }
    }
}
