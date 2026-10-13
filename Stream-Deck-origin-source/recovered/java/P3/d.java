package P3;

import C6.G;
import C6.r;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.t;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f8880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f8881b;

        /* JADX INFO: renamed from: P3.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0246a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f8882a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Set f8883b;

            /* JADX INFO: renamed from: P3.d$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0247a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f8884a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f8885b;

                public C0247a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f8884a = obj;
                    this.f8885b |= Integer.MIN_VALUE;
                    return C0246a.this.emit(null, this);
                }
            }

            public C0246a(InterfaceC2261g interfaceC2261g, Set set) {
                this.f8882a = interfaceC2261g;
                this.f8883b = set;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0247a c0247a;
                if (dVar instanceof C0247a) {
                    c0247a = (C0247a) dVar;
                    int i8 = c0247a.f8885b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0247a.f8885b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0247a = new C0247a(dVar);
                    }
                } else {
                    c0247a = new C0247a(dVar);
                }
                Object obj2 = c0247a.f8884a;
                Object objF = H6.c.f();
                int i9 = c0247a.f8885b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f8882a;
                    if (this.f8883b.add(obj)) {
                        c0247a.f8885b = 1;
                        if (interfaceC2261g.emit(obj, c0247a) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public a(InterfaceC2260f interfaceC2260f, Set set) {
            this.f8880a = interfaceC2260f;
            this.f8881b = set;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f8880a.collect(new C0246a(interfaceC2261g, this.f8881b), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    public static final InterfaceC2260f a(InterfaceC2260f interfaceC2260f) {
        t.g(interfaceC2260f, "<this>");
        return new a(interfaceC2260f, new LinkedHashSet());
    }
}
