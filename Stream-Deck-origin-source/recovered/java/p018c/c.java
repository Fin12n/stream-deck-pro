package p018c;

import Q6.k;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p036e.e;
import p036e.f;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p018c.a f15998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f15999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f16000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p045f.a f16001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q1 f16002e;

        /* JADX INFO: renamed from: c.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0399a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p018c.a f16003a;

            public C0399a(p018c.a aVar) {
                this.f16003a = aVar;
            }

            @Override // p215z0.H
            public void d() {
                this.f16003a.c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p018c.a aVar, e eVar, String str, p045f.a aVar2, q1 q1Var) {
            super(1);
            this.f15998a = aVar;
            this.f15999b = eVar;
            this.f16000c = str;
            this.f16001d = aVar2;
            this.f16002e = q1Var;
        }

        public static final void d(q1 q1Var, Object obj) {
            ((k) q1Var.getValue()).invoke(obj);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            p018c.a aVar = this.f15998a;
            e eVar = this.f15999b;
            String str = this.f16000c;
            p045f.a aVar2 = this.f16001d;
            final q1 q1Var = this.f16002e;
            aVar.b(eVar.m(str, aVar2, new p036e.b() { // from class: c.b
                @Override // p036e.b
                public final void a(Object obj) {
                    c.a.d(q1Var, obj);
                }
            }));
            return new C0399a(this.f15998a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16004a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    public static final h a(p045f.a aVar, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        e eVar;
        interfaceC3163l.f(-1408504823);
        q1 q1VarP = g1.p(aVar, interfaceC3163l, i8 & 14);
        q1 q1VarP2 = g1.p(kVar, interfaceC3163l, (i8 >> 3) & 14);
        String str = (String) I0.b.b(new Object[0], null, null, b.f16004a, interfaceC3163l, 3072, 6);
        f fVarA = f.f16017a.a(interfaceC3163l, 6);
        if (fVarA == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        e eVarI = fVarA.i();
        interfaceC3163l.f(-1672765924);
        Object objG = interfaceC3163l.g();
        InterfaceC3163l.a aVar2 = InterfaceC3163l.f38803a;
        if (objG == aVar2.a()) {
            objG = new p018c.a();
            interfaceC3163l.H(objG);
        }
        p018c.a aVar3 = (p018c.a) objG;
        interfaceC3163l.N();
        interfaceC3163l.f(-1672765850);
        Object objG2 = interfaceC3163l.g();
        if (objG2 == aVar2.a()) {
            objG2 = new h(aVar3, q1VarP);
            interfaceC3163l.H(objG2);
        }
        h hVar = (h) objG2;
        interfaceC3163l.N();
        interfaceC3163l.f(-1672765582);
        boolean zR = interfaceC3163l.R(aVar3) | interfaceC3163l.R(eVarI) | interfaceC3163l.R(str) | interfaceC3163l.R(aVar) | interfaceC3163l.R(q1VarP2);
        Object objG3 = interfaceC3163l.g();
        if (zR || objG3 == aVar2.a()) {
            eVar = eVarI;
            Object aVar4 = new a(aVar3, eVar, str, aVar, q1VarP2);
            interfaceC3163l.H(aVar4);
            objG3 = aVar4;
        } else {
            eVar = eVarI;
        }
        interfaceC3163l.N();
        e eVar2 = eVar;
        K.c(eVar2, str, aVar, (k) objG3, interfaceC3163l, (i8 << 6) & 896);
        interfaceC3163l.N();
        return hVar;
    }
}
