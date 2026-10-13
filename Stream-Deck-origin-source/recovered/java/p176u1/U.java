package p176u1;

import Z1.a;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.c;
import java.util.concurrent.Executor;
import p128o1.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class U {
    public static final Executor d(final Choreographer choreographer) {
        return new Executor() { // from class: u1.S
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                U.e(choreographer, runnable);
            }
        };
    }

    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: u1.T
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j8) {
                U.f(runnable, j8);
            }
        });
    }

    public static final void f(Runnable runnable, long j8) {
        runnable.run();
    }

    public static final boolean g(int i8, int i9) {
        return (i8 & i9) == i9;
    }

    public static final void h(EditorInfo editorInfo, C3036u c3036u, M m8) {
        String strA;
        int iD = c3036u.d();
        C3035t.a aVar = C3035t.f34463b;
        int i8 = 6;
        if (C3035t.l(iD, aVar.a())) {
            if (!c3036u.g()) {
                i8 = 0;
            }
        } else if (C3035t.l(iD, aVar.e())) {
            i8 = 1;
        } else if (C3035t.l(iD, aVar.c())) {
            i8 = 2;
        } else if (C3035t.l(iD, aVar.d())) {
            i8 = 5;
        } else if (C3035t.l(iD, aVar.f())) {
            i8 = 7;
        } else if (C3035t.l(iD, aVar.g())) {
            i8 = 3;
        } else if (C3035t.l(iD, aVar.h())) {
            i8 = 4;
        } else if (!C3035t.l(iD, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i8;
        G gF = c3036u.f();
        if (gF != null && (strA = gF.a()) != null) {
            editorInfo.privateImeOptions = strA;
        }
        int iE = c3036u.e();
        A.a aVar2 = A.f34339a;
        if (A.k(iE, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (A.k(iE, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (A.k(iE, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (A.k(iE, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (A.k(iE, aVar2.i())) {
            editorInfo.inputType = 17;
        } else if (A.k(iE, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (A.k(iE, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (A.k(iE, aVar2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!A.k(iE, aVar2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!c3036u.g() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (C3035t.l(c3036u.d(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int iC = c3036u.c();
            z.a aVar3 = z.f34485a;
            if (z.f(iC, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (z.f(iC, aVar3.d())) {
                editorInfo.inputType |= 8192;
            } else if (z.f(iC, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (c3036u.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = G.n(m8.g());
        editorInfo.initialSelEnd = G.i(m8.g());
        a.e(editorInfo, m8.h());
        editorInfo.imeOptions |= 33554432;
    }

    public static final void i(EditorInfo editorInfo) {
        if (c.k()) {
            c.c().x(editorInfo);
        }
    }
}
