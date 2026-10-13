package Y3;

import C6.G;
import C6.r;
import D6.M;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p098k7.a f12355a = p098k7.c.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f12356b = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f12359c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12361e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12359c = obj;
            this.f12361e |= Integer.MIN_VALUE;
            return i.this.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f12366e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12368g;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12366e = obj;
            this.f12368g |= Integer.MIN_VALUE;
            return i.this.b(null, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f12371c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12373e;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12371c = obj;
            this.f12373e |= Integer.MIN_VALUE;
            return i.this.c(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(G6.d dVar) {
        a aVar;
        i iVar;
        p098k7.a aVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f12361e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f12361e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f12359c;
        Object objF = H6.c.f();
        int i9 = aVar.f12361e;
        if (i9 == 0) {
            r.b(obj);
            p098k7.a aVar3 = this.f12355a;
            aVar.f12357a = this;
            aVar.f12358b = aVar3;
            aVar.f12361e = 1;
            if (aVar3.b(null, aVar) == objF) {
                return objF;
            }
            iVar = this;
            aVar2 = aVar3;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (p098k7.a) aVar.f12358b;
            iVar = (i) aVar.f12357a;
            r.b(obj);
        }
        try {
            return M.v(iVar.f12356b);
        } finally {
            aVar2.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, int i8, G6.d dVar) {
        b bVar;
        p098k7.a aVar;
        i iVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i9 = bVar.f12368g;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.f12368g = i9 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f12366e;
        Object objF = H6.c.f();
        int i10 = bVar.f12368g;
        if (i10 == 0) {
            r.b(obj);
            aVar = this.f12355a;
            bVar.f12362a = this;
            bVar.f12363b = str;
            bVar.f12364c = aVar;
            bVar.f12365d = i8;
            bVar.f12368g = 1;
            if (aVar.b(null, bVar) == objF) {
                return objF;
            }
            iVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = bVar.f12365d;
            p098k7.a aVar2 = (p098k7.a) bVar.f12364c;
            String str2 = (String) bVar.f12363b;
            iVar = (i) bVar.f12362a;
            r.b(obj);
            aVar = aVar2;
            str = str2;
        }
        try {
            X3.i iVar2 = (X3.i) iVar.f12356b.get(str);
            if (iVar2 instanceof X3.i.f) {
                iVar.f12356b.put(str, X3.i.Companion.d(((X3.i.f) iVar2).c() + i8));
            } else {
                iVar.f12356b.put(str, X3.i.Companion.d(i8));
            }
            return G.f1419a;
        } finally {
            aVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(G6.d dVar) {
        c cVar;
        i iVar;
        p098k7.a aVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f12373e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f12373e = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f12371c;
        Object objF = H6.c.f();
        int i9 = cVar.f12373e;
        if (i9 == 0) {
            r.b(obj);
            p098k7.a aVar2 = this.f12355a;
            cVar.f12369a = this;
            cVar.f12370b = aVar2;
            cVar.f12373e = 1;
            if (aVar2.b(null, cVar) == objF) {
                return objF;
            }
            iVar = this;
            aVar = aVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p098k7.a) cVar.f12370b;
            iVar = (i) cVar.f12369a;
            r.b(obj);
        }
        try {
            iVar.f12356b.clear();
            return G.f1419a;
        } finally {
            aVar.e(null);
        }
    }
}
