package p091k0;

import A1.h;
import D6.M;
import D6.r;
import I0.j;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p038e1.I;
import p055g0.B;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f28580a = h.m(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f28581b = new s(null, 0, false, 0.0f, new a(), 0.0f, false, r.n(), 0, 0, 0, false, B.Vertical, 0, 0);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f28585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28586b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8, int i9) {
            super(0);
            this.f28585a = i8;
            this.f28586b = i9;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return new y(this.f28585a, this.f28586b);
        }
    }

    public static final y c(int i8, int i9, InterfaceC3163l interfaceC3163l, int i10, int i11) {
        interfaceC3163l.f(1470655220);
        if ((i11 & 1) != 0) {
            i8 = 0;
        }
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1470655220, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:77)");
        }
        Object[] objArr = new Object[0];
        j jVarA = y.f28533B.a();
        interfaceC3163l.f(-1648357620);
        boolean zI = interfaceC3163l.i(i8) | interfaceC3163l.i(i9);
        Object objG = interfaceC3163l.g();
        if (zI || objG == InterfaceC3163l.f38803a.a()) {
            objG = new b(i8, i9);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        y yVar = (y) I0.b.b(objArr, jVarA, null, (Function0) objG, interfaceC3163l, 72, 4);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return yVar;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f28584c = M.g();

        @Override // p038e1.I
        public Map c() {
            return this.f28584c;
        }

        @Override // p038e1.I
        public int f() {
            return this.f28583b;
        }

        @Override // p038e1.I
        public int g() {
            return this.f28582a;
        }

        @Override // p038e1.I
        public void d() {
        }
    }
}
