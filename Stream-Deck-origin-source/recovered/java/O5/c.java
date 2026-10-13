package O5;

import C6.G;
import C6.r;
import D6.M;
import X5.T;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements O5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O5.a f8702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p133o6.b f8703c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f8706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f8707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f8708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f8709f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8711h;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8709f = obj;
            this.f8711h |= Integer.MIN_VALUE;
            return c.this.a(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f8714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f8715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f8716e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8718g;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8716e = obj;
            this.f8718g |= Integer.MIN_VALUE;
            return c.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: O5.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0243c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f8721c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8723e;

        public C0243c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8721c = obj;
            this.f8723e |= Integer.MIN_VALUE;
            return c.this.c(null, null, this);
        }
    }

    public c(O5.a delegate) {
        t.g(delegate, "delegate");
        this.f8702b = delegate;
        this.f8703c = new p133o6.b(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:23:0x0081->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:1: B:29:0x009d->B:41:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // O5.a
    public Object a(T t8, Map map, G6.d dVar) {
        a aVar;
        c cVar;
        T t9;
        Map map2;
        Map map3;
        O5.b bVar;
        String str;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f8711h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f8711h = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f8709f;
        Object objF = H6.c.f();
        int i9 = aVar.f8711h;
        if (i9 == 0) {
            r.b(obj);
            if (this.f8703c.containsKey(t8)) {
                cVar = this;
            } else {
                p133o6.b bVar2 = this.f8703c;
                O5.a aVar2 = this.f8702b;
                aVar.f8704a = this;
                aVar.f8705b = t8;
                aVar.f8706c = map;
                aVar.f8707d = bVar2;
                aVar.f8708e = t8;
                aVar.f8711h = 1;
                Object objB = aVar2.b(t8, aVar);
                if (objB == objF) {
                    return objF;
                }
                t9 = t8;
                map2 = map;
                map3 = bVar2;
                obj = objB;
                cVar = this;
            }
            for (Object obj2 : (Set) M.h(cVar.f8703c, t8)) {
                bVar = (O5.b) obj2;
                if (map.isEmpty()) {
                    return obj2;
                }
                for (Map.Entry entry : map.entrySet()) {
                    str = (String) entry.getKey();
                    if (!t.c(bVar.i().get(str), (String) entry.getValue())) {
                    }
                }
                return obj2;
            }
            return null;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t8 = (T) aVar.f8708e;
        map3 = (Map) aVar.f8707d;
        map2 = (Map) aVar.f8706c;
        t9 = (T) aVar.f8705b;
        cVar = (c) aVar.f8704a;
        r.b(obj);
        map3.put(t8, obj);
        map = map2;
        t8 = t9;
        while (r6.hasNext()) {
            bVar = (O5.b) obj2;
            if (map.isEmpty()) {
                return obj2;
            }
            while (r1.hasNext()) {
                str = (String) entry.getKey();
                if (!t.c(bVar.i().get(str), (String) entry.getValue())) {
                }
            }
            return obj2;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // O5.a
    public Object b(T t8, G6.d dVar) {
        b bVar;
        c cVar;
        T t9;
        Map map;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f8718g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f8718g = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f8716e;
        Object objF = H6.c.f();
        int i9 = bVar.f8718g;
        if (i9 == 0) {
            r.b(obj);
            if (this.f8703c.containsKey(t8)) {
                cVar = this;
            } else {
                p133o6.b bVar2 = this.f8703c;
                O5.a aVar = this.f8702b;
                bVar.f8712a = this;
                bVar.f8713b = t8;
                bVar.f8714c = bVar2;
                bVar.f8715d = t8;
                bVar.f8718g = 1;
                Object objB = aVar.b(t8, bVar);
                if (objB == objF) {
                    return objF;
                }
                t9 = t8;
                map = bVar2;
                obj = objB;
                cVar = this;
            }
            return M.h(cVar.f8703c, t8);
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t8 = (T) bVar.f8715d;
        map = (Map) bVar.f8714c;
        t9 = (T) bVar.f8713b;
        cVar = (c) bVar.f8712a;
        r.b(obj);
        map.put(t8, obj);
        t8 = t9;
        return M.h(cVar.f8703c, t8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // O5.a
    public Object c(T t8, O5.b bVar, G6.d dVar) {
        C0243c c0243c;
        c cVar;
        Map map;
        if (dVar instanceof C0243c) {
            c0243c = (C0243c) dVar;
            int i8 = c0243c.f8723e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0243c.f8723e = i8 - Integer.MIN_VALUE;
            } else {
                c0243c = new C0243c(dVar);
            }
        } else {
            c0243c = new C0243c(dVar);
        }
        Object obj = c0243c.f8721c;
        Object objF = H6.c.f();
        int i9 = c0243c.f8723e;
        if (i9 == 0) {
            r.b(obj);
            O5.a aVar = this.f8702b;
            c0243c.f8719a = this;
            c0243c.f8720b = t8;
            c0243c.f8723e = 1;
            if (aVar.c(t8, bVar, c0243c) != objF) {
                cVar = this;
            }
            return objF;
        }
        if (i9 == 1) {
            t8 = (T) c0243c.f8720b;
            cVar = (c) c0243c.f8719a;
            r.b(obj);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8 = (T) c0243c.f8720b;
            map = (Map) c0243c.f8719a;
            r.b(obj);
        }
        map.put(t8, obj);
        return G.f1419a;
        p133o6.b bVar2 = cVar.f8703c;
        O5.a aVar2 = cVar.f8702b;
        c0243c.f8719a = bVar2;
        c0243c.f8720b = t8;
        c0243c.f8723e = 2;
        Object objB = aVar2.b(t8, c0243c);
        if (objB != objF) {
            obj = objB;
            map = bVar2;
            map.put(t8, obj);
            return G.f1419a;
        }
        return objF;
    }
}
