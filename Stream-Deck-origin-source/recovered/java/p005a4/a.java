package p005a4;

import C6.r;
import H6.c;
import I6.d;
import W6.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0331a f13322d = new C0331a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f13324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p098k7.a f13325c;

    /* JADX INFO: renamed from: a4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0331a {
        public /* synthetic */ C0331a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0331a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f13326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f13329d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13331f;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f13329d = obj;
            this.f13331f |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    public a() {
        this(0, 1, null);
    }

    public final int a(Throwable th) {
        String strB = K.b(th.getClass()).b();
        int iHashCode = (strB != null ? strB.hashCode() : 0) * 31;
        String message = th.getMessage();
        return ((iHashCode + (message != null ? message.hashCode() : 0)) * 31) + th.getClass().getName().hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Throwable th, G6.d dVar) {
        b bVar;
        p098k7.a aVar;
        a aVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f13331f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f13331f = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f13329d;
        Object objF = c.f();
        int i9 = bVar.f13331f;
        boolean z8 = true;
        if (i9 == 0) {
            r.b(obj);
            aVar = this.f13325c;
            bVar.f13326a = this;
            bVar.f13327b = th;
            bVar.f13328c = aVar;
            bVar.f13331f = 1;
            if (aVar.b(null, bVar) == objF) {
                return objF;
            }
            aVar2 = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p098k7.a aVar3 = (p098k7.a) bVar.f13328c;
            Throwable th2 = (Throwable) bVar.f13327b;
            aVar2 = (a) bVar.f13326a;
            r.b(obj);
            aVar = aVar3;
            th = th2;
        }
        try {
            int iA = aVar2.a(th);
            if (aVar2.f13324b.contains(I6.b.d(iA))) {
                z8 = false;
            } else {
                int size = aVar2.f13324b.size();
                int i10 = aVar2.f13323a;
                if (size >= i10) {
                    int iD = n.d((int) (((double) i10) * 0.2d), 1);
                    Iterator it = aVar2.f13324b.iterator();
                    t.f(it, "iterator(...)");
                    for (int i11 = 0; i11 < iD; i11++) {
                        if (it.hasNext()) {
                            it.next();
                            it.remove();
                        }
                    }
                }
                aVar2.f13324b.add(I6.b.d(iA));
            }
            return I6.b.a(z8);
        } finally {
            aVar.e(null);
        }
    }

    public a(int i8) {
        this.f13323a = i8;
        this.f13324b = new LinkedHashSet();
        this.f13325c = p098k7.c.b(false, 1, null);
    }

    public /* synthetic */ a(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 100 : i8);
    }
}
