package Z3;

import A2.k;
import C6.G;
import android.database.Cursor;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p193w2.j;
import p193w2.r;
import p193w2.u;
import p193w2.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Z3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f12868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f12869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f12870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f12871d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends j {
        public a(r rVar) {
            super(rVar);
        }

        @Override // p193w2.x
        public String e() {
            return "INSERT OR REPLACE INTO `session_state` (`state_key`,`state_value`) VALUES (?,?)";
        }

        @Override // p193w2.j
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(k kVar, Z3.c cVar) {
            kVar.N(1, cVar.a());
            kVar.N(2, cVar.b());
        }
    }

    /* JADX INFO: renamed from: Z3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0320b extends x {
        public C0320b(r rVar) {
            super(rVar);
        }

        @Override // p193w2.x
        public String e() {
            return "DELETE FROM session_state WHERE state_key = ?";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c extends x {
        public c(r rVar) {
            super(rVar);
        }

        @Override // p193w2.x
        public String e() {
            return "DELETE FROM session_state";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Z3.c f12875a;

        public d(Z3.c cVar) {
            this.f12875a = cVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public G call() {
            b.this.f12868a.e();
            try {
                b.this.f12869b.j(this.f12875a);
                b.this.f12868a.B();
                return G.f1419a;
            } finally {
                b.this.f12868a.i();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class e implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f12877a;

        public e(u uVar) {
            this.f12877a = uVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            String string = null;
            Cursor cursorC = p209y2.b.c(b.this.f12868a, this.f12877a, false, null);
            try {
                if (cursorC.moveToFirst() && !cursorC.isNull(0)) {
                    string = cursorC.getString(0);
                }
                return string;
            } finally {
                cursorC.close();
                this.f12877a.v();
            }
        }
    }

    public b(r rVar) {
        this.f12868a = rVar;
        this.f12869b = new a(rVar);
        this.f12870c = new C0320b(rVar);
        this.f12871d = new c(rVar);
    }

    public static List e() {
        return Collections.EMPTY_LIST;
    }

    @Override // Z3.a
    public Object a(String str, G6.d dVar) {
        u uVarJ = u.j("SELECT state_value FROM session_state WHERE state_key = ?", 1);
        uVarJ.N(1, str);
        return p193w2.f.a(this.f12868a, false, p209y2.b.a(), new e(uVarJ), dVar);
    }

    @Override // Z3.a
    public Object b(Z3.c cVar, G6.d dVar) {
        return p193w2.f.b(this.f12868a, true, new d(cVar), dVar);
    }
}
