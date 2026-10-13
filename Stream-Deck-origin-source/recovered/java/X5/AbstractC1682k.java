package X5;

import R0.pkXL.Oitvkwcwn;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: renamed from: X5.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1682k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11852c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11854b;

    /* JADX INFO: renamed from: X5.k$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public AbstractC1682k(String str, List<C1681j> parameters) {
        kotlin.jvm.internal.t.g(str, kDsnNkYbBsI.LPtYsQdc);
        kotlin.jvm.internal.t.g(parameters, "parameters");
        this.f11853a = str;
        this.f11854b = parameters;
    }

    public final String a() {
        return this.f11853a;
    }

    public final List b() {
        return this.f11854b;
    }

    public final String c(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        int iP = D6.r.p(this.f11854b);
        if (iP < 0) {
            return null;
        }
        int i8 = 0;
        while (true) {
            C1681j c1681j = (C1681j) this.f11854b.get(i8);
            if (Z6.v.v(c1681j.c(), name, true)) {
                return c1681j.d();
            }
            if (i8 == iP) {
                return null;
            }
            i8++;
        }
    }

    public String toString() {
        if (this.f11854b.isEmpty()) {
            return this.f11853a;
        }
        int length = this.f11853a.length();
        int i8 = 0;
        int length2 = 0;
        for (C1681j c1681j : this.f11854b) {
            length2 += c1681j.c().length() + c1681j.d().length() + 3;
        }
        StringBuilder sb = new StringBuilder(length + length2);
        sb.append(this.f11853a);
        int iP = D6.r.p(this.f11854b);
        if (iP >= 0) {
            while (true) {
                C1681j c1681j2 = (C1681j) this.f11854b.get(i8);
                sb.append(Oitvkwcwn.UCaWmgPMCMQXK);
                sb.append(c1681j2.c());
                sb.append(com.amazon.a.a.o.b.f.f16778b);
                String strD = c1681j2.d();
                if (AbstractC1683l.c(strD)) {
                    sb.append(AbstractC1683l.d(strD));
                } else {
                    sb.append(strD);
                }
                if (i8 == iP) {
                    break;
                }
                i8++;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "{\n            val size =…   }.toString()\n        }");
        return string;
    }

    public /* synthetic */ AbstractC1682k(String str, List list, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? D6.r.n() : list);
    }
}
