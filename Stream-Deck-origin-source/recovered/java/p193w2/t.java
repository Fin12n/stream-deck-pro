package p193w2;

import A2.g;
import A2.h;
import android.database.Cursor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class t extends h.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f36882g = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f36883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f36884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36886f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final boolean a(g db) throws IllegalAccessException, IOException, InvocationTargetException {
            kotlin.jvm.internal.t.g(db, "db");
            Cursor cursorP0 = db.P0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z8 = false;
                if (cursorP0.moveToFirst() && cursorP0.getInt(0) == 0) {
                    z8 = true;
                }
                N6.a.a(cursorP0, null);
                return z8;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    N6.a.a(cursorP0, th);
                    throw th2;
                }
            }
        }

        public final boolean b(g db) throws IllegalAccessException, IOException, InvocationTargetException {
            kotlin.jvm.internal.t.g(db, "db");
            Cursor cursorP0 = db.P0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z8 = false;
                if (cursorP0.moveToFirst() && cursorP0.getInt(0) != 0) {
                    z8 = true;
                }
                N6.a.a(cursorP0, null);
                return z8;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    N6.a.a(cursorP0, th);
                    throw th2;
                }
            }
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36887a;

        public b(int i8) {
            this.f36887a = i8;
        }

        public abstract void a(g gVar);

        public abstract void b(g gVar);

        public abstract void c(g gVar);

        public abstract void d(g gVar);

        public void e(g db) {
            kotlin.jvm.internal.t.g(db, "db");
        }

        public void f(g db) {
            kotlin.jvm.internal.t.g(db, "db");
        }

        public c g(g db) {
            kotlin.jvm.internal.t.g(db, "db");
            h(db);
            return new c(true, null);
        }

        public void h(g db) {
            kotlin.jvm.internal.t.g(db, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f36888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f36889b;

        public c(boolean z8, String str) {
            this.f36888a = z8;
            this.f36889b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.f36887a);
        kotlin.jvm.internal.t.g(configuration, "configuration");
        kotlin.jvm.internal.t.g(delegate, "delegate");
        kotlin.jvm.internal.t.g(identityHash, "identityHash");
        kotlin.jvm.internal.t.g(legacyHash, "legacyHash");
        this.f36883c = configuration;
        this.f36884d = delegate;
        this.f36885e = identityHash;
        this.f36886f = legacyHash;
    }

    @Override // A2.h.a
    public void b(g db) {
        kotlin.jvm.internal.t.g(db, "db");
        super.b(db);
    }

    @Override // A2.h.a
    public void d(g db) throws IllegalAccessException, IOException, InvocationTargetException {
        kotlin.jvm.internal.t.g(db, "db");
        boolean zA = f36882g.a(db);
        this.f36884d.a(db);
        if (!zA) {
            c cVarG = this.f36884d.g(db);
            if (!cVarG.f36888a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.f36889b);
            }
        }
        j(db);
        this.f36884d.c(db);
    }

    @Override // A2.h.a
    public void e(g db, int i8, int i9) {
        kotlin.jvm.internal.t.g(db, "db");
        g(db, i8, i9);
    }

    @Override // A2.h.a
    public void f(g db) throws IllegalAccessException, IOException, InvocationTargetException {
        kotlin.jvm.internal.t.g(db, "db");
        super.f(db);
        h(db);
        this.f36884d.d(db);
        this.f36883c = null;
    }

    @Override // A2.h.a
    public void g(g db, int i8, int i9) {
        List listD;
        kotlin.jvm.internal.t.g(db, "db");
        h hVar = this.f36883c;
        if (hVar == null || (listD = hVar.f36808d.d(i8, i9)) == null) {
            h hVar2 = this.f36883c;
            if (hVar2 != null && !hVar2.a(i8, i9)) {
                this.f36884d.b(db);
                this.f36884d.a(db);
                return;
            }
            throw new IllegalStateException("A migration from " + i8 + " to " + i9 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f36884d.f(db);
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            ((p201x2.a) it.next()).a(db);
        }
        c cVarG = this.f36884d.g(db);
        if (cVarG.f36888a) {
            this.f36884d.e(db);
            j(db);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + cVarG.f36889b);
        }
    }

    public final void h(g gVar) throws IllegalAccessException, IOException, InvocationTargetException {
        if (!f36882g.b(gVar)) {
            c cVarG = this.f36884d.g(gVar);
            if (cVarG.f36888a) {
                this.f36884d.e(gVar);
                j(gVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.f36889b);
            }
        }
        Cursor cursorN1 = gVar.N1(new A2.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorN1.moveToFirst() ? cursorN1.getString(0) : null;
            N6.a.a(cursorN1, null);
            if (kotlin.jvm.internal.t.c(this.f36885e, string) || kotlin.jvm.internal.t.c(this.f36886f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f36885e + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                N6.a.a(cursorN1, th);
                throw th2;
            }
        }
    }

    public final void i(g gVar) {
        gVar.L("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void j(g gVar) {
        i(gVar);
        gVar.L(s.a(this.f36885e));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(h configuration, b delegate, String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        kotlin.jvm.internal.t.g(configuration, "configuration");
        kotlin.jvm.internal.t.g(delegate, "delegate");
        kotlin.jvm.internal.t.g(legacyHash, "legacyHash");
    }
}
