package p191w0;

import A1.h;
import A1.i;
import androidx.compose.material3.MinimumInteractiveModifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3182v;
import p215z0.B0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f35661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f35662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f35663c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35664a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static {
        B0 b0E = AbstractC3182v.e(a.f35664a);
        f35661a = b0E;
        f35662b = b0E;
        float f8 = 48;
        f35663c = i.b(h.m(f8), h.m(f8));
    }

    public static final B0 b() {
        return f35661a;
    }

    public static final L0.i c(L0.i iVar) {
        return iVar.j(MinimumInteractiveModifier.f14559b);
    }
}
