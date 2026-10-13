package p143q0;

import Z0.d;
import android.view.KeyEvent;

/* JADX INFO: renamed from: q0.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2821v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2819t f31945a = new a();

    /* JADX INFO: renamed from: q0.v$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2819t {
        @Override // p143q0.InterfaceC2819t
        public r a(KeyEvent keyEvent) {
            r rVar = null;
            if (d.f(keyEvent) && d.d(keyEvent)) {
                long jA = d.a(keyEvent);
                A a8 = A.f31366a;
                if (Z0.a.p(jA, a8.i())) {
                    rVar = r.SELECT_LINE_LEFT;
                } else if (Z0.a.p(jA, a8.j())) {
                    rVar = r.SELECT_LINE_RIGHT;
                } else if (Z0.a.p(jA, a8.k())) {
                    rVar = r.SELECT_HOME;
                } else if (Z0.a.p(jA, a8.h())) {
                    rVar = r.SELECT_END;
                }
            } else if (d.d(keyEvent)) {
                long jA2 = d.a(keyEvent);
                A a9 = A.f31366a;
                if (Z0.a.p(jA2, a9.i())) {
                    rVar = r.LINE_LEFT;
                } else if (Z0.a.p(jA2, a9.j())) {
                    rVar = r.LINE_RIGHT;
                } else if (Z0.a.p(jA2, a9.k())) {
                    rVar = r.HOME;
                } else if (Z0.a.p(jA2, a9.h())) {
                    rVar = r.END;
                }
            }
            return rVar == null ? AbstractC2820u.b().a(keyEvent) : rVar;
        }
    }

    public static final InterfaceC2819t a() {
        return f31945a;
    }
}
