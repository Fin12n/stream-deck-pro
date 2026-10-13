package p070h6;

import D6.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import p052f6.A;
import p052f6.m;
import p205x6.k;
import p205x6.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f24539a;

    static {
        a aVar = a.SHA384;
        g gVar = g.ECDSA;
        m.a aVar2 = m.f22079c;
        b bVar = new b(aVar, gVar, aVar2.b());
        a aVar3 = a.SHA256;
        b bVar2 = new b(aVar3, gVar, aVar2.a());
        a aVar4 = a.f24483k;
        g gVar2 = g.RSA;
        f24539a = r.q(bVar, bVar2, new b(aVar4, gVar2, aVar2.f()), new b(aVar, gVar2, aVar2.e()), new b(aVar3, gVar2, aVar2.d()), new b(a.SHA1, gVar2, aVar2.c()));
    }

    public static final b a(byte b8, byte b9, String str) throws A {
        a aVarA = a.f24476d.a(b8);
        g gVarA = g.f24530b.a(b9);
        if (gVarA == null) {
            return null;
        }
        return new b(aVarA, gVarA, str != null ? new m(str) : null);
    }

    public static /* synthetic */ b b(byte b8, byte b9, String str, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str = null;
        }
        return a(b8, b9, str);
    }

    public static final b c(b.a aVar, byte b8, byte b9) {
        Object next;
        t.g(aVar, "<this>");
        if (b9 == g.ANON.b()) {
            throw new IllegalStateException("Anonymous signature not allowed.");
        }
        Iterator it = f24539a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            b bVar = (b) next;
            if (bVar.a().b() == b8 && bVar.d().b() == b9) {
                break;
            }
        }
        b bVar2 = (b) next;
        return bVar2 == null ? b(b8, b9, null, 4, null) : bVar2;
    }

    public static final List d() {
        return f24539a;
    }

    public static final List e(k kVar) throws A {
        t.g(kVar, "<this>");
        int iE = q.e(kVar) & 65535;
        ArrayList arrayList = new ArrayList();
        while (kVar.o1() > 0) {
            b bVarF = f(kVar);
            if (bVarF != null) {
                arrayList.add(bVarF);
            }
        }
        if (((int) kVar.o1()) == iE) {
            return arrayList;
        }
        throw new A("Invalid hash and sign packet size: expected " + iE + ", actual " + arrayList.size(), null, 2, null);
    }

    public static final b f(k kVar) {
        t.g(kVar, "<this>");
        return c(b.f24489e, kVar.readByte(), kVar.readByte());
    }
}
