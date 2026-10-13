package p143q0;

import C6.G;
import P0.f;
import Q6.k;
import androidx.compose.ui.focus.c;
import kotlin.jvm.internal.t;
import p065h1.H0;
import p176u1.C3035t;

/* JADX INFO: renamed from: q0.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2822w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H0 f31946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2823x f31947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f31948c;

    public C2822w(H0 h8) {
        this.f31946a = h8;
    }

    public void a(int i8) {
        C3035t.a aVar = C3035t.f34463b;
        if (C3035t.l(i8, aVar.d())) {
            b().i(c.f14597b.e());
            return;
        }
        if (C3035t.l(i8, aVar.f())) {
            b().i(c.f14597b.f());
            return;
        }
        if (!C3035t.l(i8, aVar.b())) {
            if (C3035t.l(i8, aVar.c()) ? true : C3035t.l(i8, aVar.g()) ? true : C3035t.l(i8, aVar.h()) ? true : C3035t.l(i8, aVar.a())) {
                return;
            }
            C3035t.l(i8, aVar.e());
        } else {
            H0 h8 = this.f31946a;
            if (h8 != null) {
                h8.c();
            }
        }
    }

    public final f b() {
        f fVar = this.f31948c;
        if (fVar != null) {
            return fVar;
        }
        t.t("focusManager");
        return null;
    }

    public final C2823x c() {
        C2823x c2823x = this.f31947b;
        if (c2823x != null) {
            return c2823x;
        }
        t.t("keyboardActions");
        return null;
    }

    public final void d(int i8) {
        k kVarG;
        C3035t.a aVar = C3035t.f34463b;
        G g8 = null;
        if (C3035t.l(i8, aVar.b())) {
            kVarG = c().b();
        } else if (C3035t.l(i8, aVar.c())) {
            kVarG = c().c();
        } else if (C3035t.l(i8, aVar.d())) {
            kVarG = c().d();
        } else if (C3035t.l(i8, aVar.f())) {
            kVarG = c().e();
        } else if (C3035t.l(i8, aVar.g())) {
            kVarG = c().f();
        } else if (C3035t.l(i8, aVar.h())) {
            kVarG = c().g();
        } else {
            if (!(C3035t.l(i8, aVar.a()) ? true : C3035t.l(i8, aVar.e()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            kVarG = null;
        }
        if (kVarG != null) {
            kVarG.invoke(this);
            g8 = G.f1419a;
        }
        if (g8 == null) {
            a(i8);
        }
    }

    public final void e(f fVar) {
        this.f31948c = fVar;
    }

    public final void f(C2823x c2823x) {
        this.f31947b = c2823x;
    }
}
