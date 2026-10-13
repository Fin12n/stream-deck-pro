package p168t1;

import C6.q;
import C6.r;
import H6.c;
import I6.d;
import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: renamed from: t1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2997b implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34031b;

    /* JADX INFO: renamed from: t1.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f34032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f34033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f34034c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34036e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f34034c = obj;
            this.f34036e |= Integer.MIN_VALUE;
            return C2997b.this.a(null, this);
        }
    }

    public C2997b(Context context) {
        this.f34030a = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p168t1.H
    public Object a(InterfaceC3008m interfaceC3008m, G6.d dVar) {
        a aVar;
        C2997b c2997b;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f34036e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f34036e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objD = aVar.f34034c;
        Object objF = c.f();
        int i9 = aVar.f34036e;
        if (i9 == 0) {
            r.b(objD);
            if (interfaceC3008m instanceof AbstractC2996a) {
                ((AbstractC2996a) interfaceC3008m).d();
                aVar.f34036e = 1;
                throw null;
            }
            if (!(interfaceC3008m instanceof M)) {
                throw new IllegalArgumentException("Unknown font type: " + interfaceC3008m);
            }
            Context context = this.f34030a;
            aVar.f34032a = this;
            aVar.f34033b = interfaceC3008m;
            aVar.f34036e = 2;
            objD = AbstractC2998c.d((M) interfaceC3008m, context, aVar);
            if (objD == objF) {
                return objF;
            }
            c2997b = this;
        } else {
            if (i9 == 1) {
                r.b(objD);
                return objD;
            }
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC3008m = (InterfaceC3008m) aVar.f34033b;
            c2997b = (C2997b) aVar.f34032a;
            r.b(objD);
        }
        return L.b((Typeface) objD, ((M) interfaceC3008m).e(), c2997b.f34030a);
    }

    @Override // p168t1.H
    public Object c() {
        return this.f34031b;
    }

    @Override // p168t1.H
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface b(InterfaceC3008m interfaceC3008m) {
        Object objB;
        Typeface typefaceC;
        if (interfaceC3008m instanceof AbstractC2996a) {
            ((AbstractC2996a) interfaceC3008m).d();
            throw null;
        }
        if (!(interfaceC3008m instanceof M)) {
            return null;
        }
        int iA = interfaceC3008m.a();
        w.a aVar = w.f34108a;
        if (w.e(iA, aVar.b())) {
            typefaceC = AbstractC2998c.c((M) interfaceC3008m, this.f34030a);
        } else {
            if (!w.e(iA, aVar.c())) {
                if (w.e(iA, aVar.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) w.g(interfaceC3008m.a())));
            }
            try {
                q.a aVar2 = q.f1441b;
                objB = q.b(AbstractC2998c.c((M) interfaceC3008m, this.f34030a));
            } catch (Throwable th) {
                q.a aVar3 = q.f1441b;
                objB = q.b(r.a(th));
            }
            typefaceC = (Typeface) (q.g(objB) ? null : objB);
        }
        return L.b(typefaceC, ((M) interfaceC3008m).e(), this.f34030a);
    }
}
