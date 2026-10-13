package I0;

import C6.G;
import Z6.C1694a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.g1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f3675a = 36;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f3676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f3677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f3678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f3679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f3680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Object[] f3681f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, j jVar, g gVar, String str, Object obj, Object[] objArr) {
            super(0);
            this.f3676a = cVar;
            this.f3677b = jVar;
            this.f3678c = gVar;
            this.f3679d = str;
            this.f3680e = obj;
            this.f3681f = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m60invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m60invoke() {
            this.f3676a.i(this.f3677b, this.f3678c, this.f3679d, this.f3680e, this.f3681f);
        }
    }

    public static final Object b(Object[] objArr, j jVar, String str, Function0 function0, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        Object[] objArr2;
        Object objC;
        interfaceC3163l.f(441892779);
        if ((i9 & 2) != 0) {
            jVar = k.b();
        }
        j jVar2 = jVar;
        int i10 = i9 & 4;
        Object objInvoke = null;
        if (i10 != 0) {
            str = null;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(441892779, i8, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int iA = AbstractC3157i.a(interfaceC3163l, 0);
        if (str == null || str.length() == 0) {
            str = Integer.toString(iA, C1694a.a(f3675a));
            t.f(str, "toString(this, checkRadix(radix))");
        }
        String str2 = str;
        t.e(jVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        g gVar = (g) interfaceC3163l.e(i.b());
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            if (gVar != null && (objC = gVar.c(str2)) != null) {
                objInvoke = jVar2.a(objC);
            }
            if (objInvoke == null) {
                objInvoke = function0.invoke();
            }
            objArr2 = objArr;
            c cVar = new c(jVar2, gVar, str2, objInvoke, objArr2);
            interfaceC3163l.H(cVar);
            objG = cVar;
        } else {
            objArr2 = objArr;
        }
        interfaceC3163l.N();
        c cVar2 = (c) objG;
        Object objG2 = cVar2.g(objArr2);
        if (objG2 == null) {
            objG2 = function0.invoke();
        }
        Object[] objArr3 = objArr2;
        Object obj = objG2;
        K.g(new a(cVar2, jVar2, gVar, str2, obj, objArr3), interfaceC3163l, 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return obj;
    }

    public static final void c(g gVar, Object obj) {
        String str;
        if (obj == null || gVar.a(obj)) {
            return;
        }
        if (obj instanceof J0.u) {
            J0.u uVar = (J0.u) obj;
            if (uVar.d() == g1.k() || uVar.d() == g1.r() || uVar.d() == g1.o()) {
                str = "MutableState containing " + uVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
