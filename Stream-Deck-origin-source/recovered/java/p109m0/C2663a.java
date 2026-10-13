package p109m0;

import C6.G;
import C6.q;
import C6.r;
import G6.d;
import G6.i;
import H6.b;
import H6.c;
import I6.h;
import p038e1.InterfaceC2247s;
import p038e1.Q;

/* JADX INFO: renamed from: m0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2663a implements Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f29364c;

    /* JADX INFO: renamed from: m0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0638a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f29365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f29366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f29367c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f29369e;

        public C0638a(d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f29367c = obj;
            this.f29369e |= Integer.MIN_VALUE;
            return C2663a.this.k(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(d dVar) throws Throwable {
        C0638a c0638a;
        d dVar2;
        if (dVar instanceof C0638a) {
            c0638a = (C0638a) dVar;
            int i8 = c0638a.f29369e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0638a.f29369e = i8 - Integer.MIN_VALUE;
            } else {
                c0638a = new C0638a(dVar);
            }
        } else {
            c0638a = new C0638a(dVar);
        }
        Object obj = c0638a.f29367c;
        Object objF = c.f();
        int i9 = c0638a.f29369e;
        if (i9 == 0) {
            r.b(obj);
            if (!this.f29363b) {
                d dVar3 = this.f29364c;
                c0638a.f29365a = this;
                c0638a.f29366b = dVar3;
                c0638a.f29369e = 1;
                i iVar = new i(b.c(c0638a));
                this.f29364c = iVar;
                Object objA = iVar.a();
                if (objA == c.f()) {
                    h.c(c0638a);
                }
                if (objA == objF) {
                    return objF;
                }
                dVar2 = dVar3;
            }
            return G.f1419a;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar2 = (d) c0638a.f29366b;
        r.b(obj);
        if (dVar2 != null) {
            q.a aVar = q.f1441b;
            dVar2.resumeWith(q.b(G.f1419a));
        }
        return G.f1419a;
    }

    @Override // p038e1.Q
    public void m(InterfaceC2247s interfaceC2247s) {
        if (this.f29363b) {
            return;
        }
        this.f29363b = true;
        d dVar = this.f29364c;
        if (dVar != null) {
            q.a aVar = q.f1441b;
            dVar.resumeWith(q.b(G.f1419a));
        }
        this.f29364c = null;
    }
}
