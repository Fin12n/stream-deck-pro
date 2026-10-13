package p056g1;

import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f23461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2350n f23462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23463c;

    public M(F f8, C2350n c2350n, List<Q.a> list) {
        this.f23461a = f8;
        this.f23462b = c2350n;
        this.f23463c = list;
    }

    public static final void e(M m8, StringBuilder sb, F f8, int i8) {
        String strF = m8.f(f8);
        if (strF.length() > 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                sb.append("..");
            }
            sb.append(strF);
            t.f(sb, "append(value)");
            sb.append('\n');
            t.f(sb, "append('\\n')");
            i8++;
        }
        List listF = f8.F();
        int size = listF.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(m8, sb, (F) listF.get(i10), i8);
        }
    }

    public final void a() {
        if (c(this.f23461a)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }

    public final boolean b(F f8) {
        Object obj;
        F fM0 = f8.m0();
        Object obj2 = null;
        F.e eVarV = fM0 != null ? fM0.V() : null;
        if (f8.f() || (f8.n0() != Integer.MAX_VALUE && fM0 != null && fM0.f())) {
            if (f8.c0()) {
                List list = this.f23463c;
                int size = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i8);
                    Q.a aVar = (Q.a) obj;
                    if (t.c(aVar.a(), f8) && !aVar.c()) {
                        break;
                    }
                    i8++;
                }
                if (obj != null) {
                    return true;
                }
            }
            if (f8.c0()) {
                return this.f23462b.d(f8) || f8.V() == F.e.LookaheadMeasuring || (fM0 != null && fM0.c0()) || ((fM0 != null && fM0.X()) || eVarV == F.e.Measuring);
            }
            if (f8.U()) {
                return this.f23462b.d(f8) || fM0 == null || fM0.c0() || fM0.U() || eVarV == F.e.Measuring || eVarV == F.e.LayingOut;
            }
        }
        if (t.c(f8.L0(), Boolean.TRUE)) {
            if (f8.X()) {
                List list2 = this.f23463c;
                int size2 = list2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    Object obj3 = list2.get(i9);
                    Q.a aVar2 = (Q.a) obj3;
                    if (t.c(aVar2.a(), f8) && aVar2.c()) {
                        obj2 = obj3;
                        break;
                    }
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (f8.X()) {
                return this.f23462b.e(f8, true) || (fM0 != null && fM0.X()) || eVarV == F.e.LookaheadMeasuring || (fM0 != null && fM0.c0() && t.c(f8.Z(), f8));
            }
            if (f8.W() && !this.f23462b.e(f8, true) && fM0 != null && !fM0.X() && !fM0.W() && eVarV != F.e.LookaheadMeasuring && eVarV != F.e.LookaheadLayingOut && (!fM0.U() || !t.c(f8.Z(), f8))) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(F f8) {
        if (!b(f8)) {
            return false;
        }
        List listF = f8.F();
        int size = listF.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!c((F) listF.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        t.f(sb, "append(value)");
        sb.append('\n');
        t.f(sb, "append('\\n')");
        e(this, sb, this.f23461a, 0);
        return sb.toString();
    }

    public final String f(F f8) {
        StringBuilder sb = new StringBuilder();
        sb.append(f8);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(f8.V());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!f8.f()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + f8.e0() + ']');
        if (!b(f8)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }
}
