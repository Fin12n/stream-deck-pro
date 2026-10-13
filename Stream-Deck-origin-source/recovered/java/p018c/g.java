package p018c;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p009b.F;
import p009b.J;
import p215z0.AbstractC3182v;
import p215z0.B0;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f16020a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f16021b = AbstractC3182v.d(null, a.f16023a, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16022c = 0;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16023a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F invoke() {
            return null;
        }
    }

    public final F a(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-2068013981);
        F fA = (F) interfaceC3163l.e(f16021b);
        interfaceC3163l.f(1680121597);
        if (fA == null) {
            fA = J.a((View) interfaceC3163l.e(AndroidCompositionLocals_androidKt.j()));
        }
        interfaceC3163l.N();
        if (fA == null) {
            Object baseContext = (Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof F) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            fA = (F) baseContext;
        }
        interfaceC3163l.N();
        return fA;
    }
}
