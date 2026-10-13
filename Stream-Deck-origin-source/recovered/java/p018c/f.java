package p018c;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3182v;
import p215z0.B0;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f16017a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f16018b = AbstractC3182v.d(null, a.f16019a, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16019a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p036e.f invoke() {
            return null;
        }
    }

    public final p036e.f a(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1418020823);
        p036e.f fVar = (p036e.f) interfaceC3163l.e(f16018b);
        if (fVar == null) {
            Object baseContext = (Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof p036e.f) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            fVar = (p036e.f) baseContext;
        }
        interfaceC3163l.N();
        return fVar;
    }
}
