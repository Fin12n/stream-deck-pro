package p046f0;

import L0.i;
import P0.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p056g1.p0;
import p110m1.k;
import p110m1.x;

/* JADX INFO: renamed from: f0.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2295x extends i.c implements p0, j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f21516n = new k();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21517o;

    /* JADX INFO: renamed from: f0.x$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(androidx.compose.ui.focus.i.a(C2295x.this));
        }
    }

    @Override // p056g1.p0
    public void Q(x xVar) {
        p110m1.u.O(xVar, this.f21517o);
        p110m1.u.F(xVar, null, new a(), 1, null);
    }

    public final void d2(boolean z8) {
        this.f21517o = z8;
    }
}
