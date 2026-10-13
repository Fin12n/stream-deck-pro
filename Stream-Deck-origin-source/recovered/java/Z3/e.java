package Z3;

import A2.k;
import C6.G;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p193w2.j;
import p193w2.r;
import p193w2.u;
import p193w2.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Z3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f12881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f12882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f12883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f12884d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f12885a;

        public a(u uVar) {
            this.f12885a = uVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            Cursor cursorC = p209y2.b.c(e.this.f12881a, this.f12885a, false, null);
            try {
                return cursorC.moveToFirst() ? Integer.valueOf(cursorC.getInt(0)) : 0;
            } finally {
                cursorC.close();
                this.f12885a.v();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f12887a;

        public b(List list) {
            this.f12887a = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public G call() {
            StringBuilder sbB = p209y2.d.b();
            sbB.append("DELETE FROM stored_events WHERE insert_id IN (");
            p209y2.d.a(sbB, this.f12887a.size());
            sbB.append(")");
            k kVarF = e.this.f12881a.f(sbB.toString());
            Iterator it = this.f12887a.iterator();
            int i8 = 1;
            while (it.hasNext()) {
                kVarF.N(i8, (String) it.next());
                i8++;
            }
            e.this.f12881a.e();
            try {
                kVarF.U();
                e.this.f12881a.B();
                return G.f1419a;
            } finally {
                e.this.f12881a.i();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c extends j {
        public c(r rVar) {
            super(rVar);
        }

        @Override // p193w2.x
        public String e() {
            return "INSERT OR REPLACE INTO `stored_events` (`insert_id`,`event_name`,`properties_json`,`timestamp_ms`) VALUES (?,?,?,?)";
        }

        @Override // p193w2.j
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(k kVar, Z3.f fVar) {
            kVar.N(1, fVar.b());
            kVar.N(2, fVar.a());
            kVar.N(3, fVar.c());
            kVar.v0(4, fVar.d());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d extends x {
        public d(r rVar) {
            super(rVar);
        }

        @Override // p193w2.x
        public String e() {
            return "DELETE FROM stored_events";
        }
    }

    /* JADX INFO: renamed from: Z3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0321e extends x {
        public C0321e(r rVar) {
            super(rVar);
        }

        @Override // p193w2.x
        public String e() {
            return "DELETE FROM stored_events WHERE insert_id IN (\n            SELECT insert_id FROM stored_events ORDER BY timestamp_ms ASC LIMIT ?\n        )";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class f implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Z3.f f12892a;

        public f(Z3.f fVar) {
            this.f12892a = fVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public G call() {
            e.this.f12881a.e();
            try {
                e.this.f12882b.j(this.f12892a);
                e.this.f12881a.B();
                return G.f1419a;
            } finally {
                e.this.f12881a.i();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class g implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f12894a;

        public g(int i8) {
            this.f12894a = i8;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public G call() {
            k kVarB = e.this.f12884d.b();
            kVarB.v0(1, this.f12894a);
            try {
                e.this.f12881a.e();
                try {
                    kVarB.U();
                    e.this.f12881a.B();
                    G g8 = G.f1419a;
                    e.this.f12881a.i();
                    e.this.f12884d.h(kVarB);
                    return g8;
                } catch (Throwable th) {
                    e.this.f12881a.i();
                    throw th;
                }
            } catch (Throwable th2) {
                e.this.f12884d.h(kVarB);
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class h implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f12896a;

        public h(u uVar) {
            this.f12896a = uVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorC = p209y2.b.c(e.this.f12881a, this.f12896a, false, null);
            try {
                int iD = p209y2.a.d(cursorC, "insert_id");
                int iD2 = p209y2.a.d(cursorC, "event_name");
                int iD3 = p209y2.a.d(cursorC, "properties_json");
                int iD4 = p209y2.a.d(cursorC, "timestamp_ms");
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    arrayList.add(new Z3.f(cursorC.getString(iD), cursorC.getString(iD2), cursorC.getString(iD3), cursorC.getLong(iD4)));
                }
                cursorC.close();
                this.f12896a.v();
                return arrayList;
            } catch (Throwable th) {
                cursorC.close();
                this.f12896a.v();
                throw th;
            }
        }
    }

    public e(r rVar) {
        this.f12881a = rVar;
        this.f12882b = new c(rVar);
        this.f12883c = new d(rVar);
        this.f12884d = new C0321e(rVar);
    }

    public static List i() {
        return Collections.EMPTY_LIST;
    }

    @Override // Z3.d
    public Object a(int i8, G6.d dVar) {
        u uVarJ = u.j("SELECT * FROM stored_events ORDER BY timestamp_ms ASC LIMIT ?", 1);
        uVarJ.v0(1, i8);
        return p193w2.f.a(this.f12881a, false, p209y2.b.a(), new h(uVarJ), dVar);
    }

    @Override // Z3.d
    public Object b(int i8, G6.d dVar) {
        return p193w2.f.b(this.f12881a, true, new g(i8), dVar);
    }

    @Override // Z3.d
    public Object c(List list, G6.d dVar) {
        return p193w2.f.b(this.f12881a, true, new b(list), dVar);
    }

    @Override // Z3.d
    public Object d(G6.d dVar) {
        u uVarJ = u.j("SELECT COUNT(*) FROM stored_events", 0);
        return p193w2.f.a(this.f12881a, false, p209y2.b.a(), new a(uVarJ), dVar);
    }

    @Override // Z3.d
    public Object e(Z3.f fVar, G6.d dVar) {
        return p193w2.f.b(this.f12881a, true, new f(fVar), dVar);
    }
}
