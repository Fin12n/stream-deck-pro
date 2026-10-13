package W2;

import I0.j;
import V2.g;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.B0;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f10853a = AbstractC3182v.e(a.f10854a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10854a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I0.d invoke() {
            throw new IllegalStateException("LocalNavigatorStateHolder not initialized");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f10855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ I0.d f10857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ V2.c f10858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ V2.b f10859e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, String str, I0.d dVar, V2.c cVar, V2.b bVar) {
            super(0);
            this.f10855a = list;
            this.f10856b = str;
            this.f10857c = dVar;
            this.f10858d = cVar;
            this.f10859e = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final V2.b invoke() {
            return new V2.b(this.f10855a, this.f10856b, this.f10857c, this.f10858d, this.f10859e);
        }
    }

    public static final B0 a() {
        return f10853a;
    }

    public static final V2.b b(List screens, String key, V2.c disposeBehavior, V2.b bVar, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(screens, "screens");
        t.g(key, "key");
        t.g(disposeBehavior, "disposeBehavior");
        interfaceC3163l.f(-2143933045);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-2143933045, i8, -1, "cafe.adriel.voyager.navigator.internal.rememberNavigator (NavigatorSaverInternal.kt:22)");
        }
        I0.d dVar = (I0.d) interfaceC3163l.e(f10853a);
        V2.e eVar = (V2.e) interfaceC3163l.e(g.d());
        Object[] objArr = {eVar, dVar, bVar, disposeBehavior};
        interfaceC3163l.f(-568225417);
        boolean zR = false;
        for (int i9 = 0; i9 < 4; i9++) {
            zR |= interfaceC3163l.R(objArr[i9]);
        }
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = eVar.a(screens, key, dVar, disposeBehavior, bVar);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        V2.b bVar2 = (V2.b) I0.b.b(new Object[0], (j) objG, key, new b(screens, key, dVar, disposeBehavior, bVar), interfaceC3163l, ((i8 << 3) & 896) | 72, 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return bVar2;
    }
}
