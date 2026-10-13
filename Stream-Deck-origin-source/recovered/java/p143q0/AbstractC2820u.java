package p143q0;

import I0.mIk.efuWFSeiT;
import Q6.k;
import Z0.d;
import android.view.KeyEvent;
import kotlin.jvm.internal.D;

/* JADX INFO: renamed from: q0.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2820u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2819t f31941a = new c(a(new D() { // from class: q0.u.b
        @Override // kotlin.jvm.internal.D, X6.k
        public Object get(Object obj) {
            return Boolean.valueOf(d.e(((Z0.b) obj).f()));
        }

        {
            String str = efuWFSeiT.EcvBbkd;
        }
    }));

    /* JADX INFO: renamed from: q0.u$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2819t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f31942a;

        public a(k kVar) {
            this.f31942a = kVar;
        }

        @Override // p143q0.InterfaceC2819t
        public r a(KeyEvent keyEvent) {
            if (((Boolean) this.f31942a.invoke(Z0.b.a(keyEvent))).booleanValue() && d.f(keyEvent)) {
                if (Z0.a.p(d.a(keyEvent), A.f31366a.x())) {
                    return r.REDO;
                }
                return null;
            }
            if (((Boolean) this.f31942a.invoke(Z0.b.a(keyEvent))).booleanValue()) {
                long jA = d.a(keyEvent);
                A a8 = A.f31366a;
                if (Z0.a.p(jA, a8.d()) ? true : Z0.a.p(jA, a8.n())) {
                    return r.COPY;
                }
                if (Z0.a.p(jA, a8.u())) {
                    return r.PASTE;
                }
                if (Z0.a.p(jA, a8.v())) {
                    return r.CUT;
                }
                if (Z0.a.p(jA, a8.a())) {
                    return r.SELECT_ALL;
                }
                if (Z0.a.p(jA, a8.w())) {
                    return r.REDO;
                }
                if (Z0.a.p(jA, a8.x())) {
                    return r.UNDO;
                }
                return null;
            }
            if (d.e(keyEvent)) {
                return null;
            }
            if (d.f(keyEvent)) {
                long jA2 = d.a(keyEvent);
                A a9 = A.f31366a;
                if (Z0.a.p(jA2, a9.i())) {
                    return r.f31892B;
                }
                if (Z0.a.p(jA2, a9.j())) {
                    return r.SELECT_RIGHT_CHAR;
                }
                if (Z0.a.p(jA2, a9.k())) {
                    return r.SELECT_UP;
                }
                if (Z0.a.p(jA2, a9.h())) {
                    return r.SELECT_DOWN;
                }
                if (Z0.a.p(jA2, a9.r())) {
                    return r.SELECT_PAGE_UP;
                }
                if (Z0.a.p(jA2, a9.q())) {
                    return r.f31897G;
                }
                if (Z0.a.p(jA2, a9.p())) {
                    return r.SELECT_LINE_START;
                }
                if (Z0.a.p(jA2, a9.o())) {
                    return r.SELECT_LINE_END;
                }
                if (Z0.a.p(jA2, a9.n())) {
                    return r.PASTE;
                }
                return null;
            }
            long jA3 = d.a(keyEvent);
            A a10 = A.f31366a;
            if (Z0.a.p(jA3, a10.i())) {
                return r.LEFT_CHAR;
            }
            if (Z0.a.p(jA3, a10.j())) {
                return r.RIGHT_CHAR;
            }
            if (Z0.a.p(jA3, a10.k())) {
                return r.UP;
            }
            if (Z0.a.p(jA3, a10.h())) {
                return r.DOWN;
            }
            if (Z0.a.p(jA3, a10.r())) {
                return r.PAGE_UP;
            }
            if (Z0.a.p(jA3, a10.q())) {
                return r.PAGE_DOWN;
            }
            if (Z0.a.p(jA3, a10.p())) {
                return r.LINE_START;
            }
            if (Z0.a.p(jA3, a10.o())) {
                return r.f31920i;
            }
            if (Z0.a.p(jA3, a10.l())) {
                return r.NEW_LINE;
            }
            if (Z0.a.p(jA3, a10.c())) {
                return r.DELETE_PREV_CHAR;
            }
            if (Z0.a.p(jA3, a10.g())) {
                return r.DELETE_NEXT_CHAR;
            }
            if (Z0.a.p(jA3, a10.s())) {
                return r.PASTE;
            }
            if (Z0.a.p(jA3, a10.f())) {
                return r.CUT;
            }
            if (Z0.a.p(jA3, a10.e())) {
                return r.COPY;
            }
            if (Z0.a.p(jA3, a10.t())) {
                return r.TAB;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: q0.u$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements InterfaceC2819t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2819t f31944a;

        public c(InterfaceC2819t interfaceC2819t) {
            this.f31944a = interfaceC2819t;
        }

        @Override // p143q0.InterfaceC2819t
        public r a(KeyEvent keyEvent) {
            r rVar = null;
            if (d.f(keyEvent) && d.e(keyEvent)) {
                long jA = d.a(keyEvent);
                A a8 = A.f31366a;
                if (Z0.a.p(jA, a8.i())) {
                    rVar = r.SELECT_LEFT_WORD;
                } else if (Z0.a.p(jA, a8.j())) {
                    rVar = r.SELECT_RIGHT_WORD;
                } else if (Z0.a.p(jA, a8.k())) {
                    rVar = r.SELECT_PREV_PARAGRAPH;
                } else if (Z0.a.p(jA, a8.h())) {
                    rVar = r.SELECT_NEXT_PARAGRAPH;
                }
            } else if (d.e(keyEvent)) {
                long jA2 = d.a(keyEvent);
                A a9 = A.f31366a;
                if (Z0.a.p(jA2, a9.i())) {
                    rVar = r.LEFT_WORD;
                } else if (Z0.a.p(jA2, a9.j())) {
                    rVar = r.RIGHT_WORD;
                } else if (Z0.a.p(jA2, a9.k())) {
                    rVar = r.PREV_PARAGRAPH;
                } else if (Z0.a.p(jA2, a9.h())) {
                    rVar = r.NEXT_PARAGRAPH;
                } else if (Z0.a.p(jA2, a9.m())) {
                    rVar = r.DELETE_PREV_CHAR;
                } else if (Z0.a.p(jA2, a9.g())) {
                    rVar = r.DELETE_NEXT_WORD;
                } else if (Z0.a.p(jA2, a9.c())) {
                    rVar = r.DELETE_PREV_WORD;
                } else if (Z0.a.p(jA2, a9.b())) {
                    rVar = r.DESELECT;
                }
            } else if (d.f(keyEvent)) {
                long jA3 = d.a(keyEvent);
                A a10 = A.f31366a;
                if (Z0.a.p(jA3, a10.p())) {
                    rVar = r.SELECT_LINE_LEFT;
                } else if (Z0.a.p(jA3, a10.o())) {
                    rVar = r.SELECT_LINE_RIGHT;
                }
            } else if (d.d(keyEvent)) {
                long jA4 = d.a(keyEvent);
                A a11 = A.f31366a;
                if (Z0.a.p(jA4, a11.c())) {
                    rVar = r.DELETE_FROM_LINE_START;
                } else if (Z0.a.p(jA4, a11.g())) {
                    rVar = r.DELETE_TO_LINE_END;
                }
            }
            return rVar == null ? this.f31944a.a(keyEvent) : rVar;
        }
    }

    public static final InterfaceC2819t a(k kVar) {
        return new a(kVar);
    }

    public static final InterfaceC2819t b() {
        return f31941a;
    }
}
