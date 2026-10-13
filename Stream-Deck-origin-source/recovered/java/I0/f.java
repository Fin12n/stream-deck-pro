package I0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3712a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return new e(null, 1, null);
        }
    }

    public static final d a(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(15454635);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(15454635, i8, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:59)");
        }
        e eVar = (e) b.b(new Object[0], e.f3690d.a(), null, a.f3712a, interfaceC3163l, 3080, 4);
        eVar.i((g) interfaceC3163l.e(i.b()));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return eVar;
    }
}
