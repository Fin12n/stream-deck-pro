package p037e0;

import D6.C0938s;
import D6.I;
import W6.i;
import W6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2222s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f20309a;

        public a(AbstractC2221q abstractC2221q, float f8, float f9) {
            i iVarV = n.v(0, abstractC2221q.b());
            ArrayList arrayList = new ArrayList(C0938s.y(iVarV, 10));
            Iterator it = iVarV.iterator();
            while (it.hasNext()) {
                arrayList.add(new H(f8, f9, abstractC2221q.a(((I) it).nextInt())));
            }
            this.f20309a = arrayList;
        }

        @Override // p037e0.InterfaceC2222s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public H get(int i8) {
            return (H) this.f20309a.get(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2222s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H f20310a;

        public b(float f8, float f9) {
            this.f20310a = new H(f8, f9, 0.0f, 4, null);
        }

        @Override // p037e0.InterfaceC2222s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public H get(int i8) {
            return this.f20310a;
        }
    }

    public static final long b(p0 p0Var, long j8) {
        return n.m(j8 - ((long) p0Var.e()), 0L, p0Var.f());
    }

    public static final InterfaceC2222s c(AbstractC2221q abstractC2221q, float f8, float f9) {
        return abstractC2221q != null ? new a(abstractC2221q, f8, f9) : new b(f8, f9);
    }

    public static final AbstractC2221q d(m0 m0Var, long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        return m0Var.c(j8 * 1000000, abstractC2221q, abstractC2221q2, abstractC2221q3);
    }
}
