package B2;

import C6.j;
import C6.k;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements A2.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f924h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A2.h.a f927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f931g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public B2.c f932a;

        public b(B2.c cVar) {
            this.f932a = cVar;
        }

        public final B2.c a() {
            return this.f932a;
        }

        public final void b(B2.c cVar) {
            this.f932a = cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0023c f933h = new C0023c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final A2.h.a f936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C2.a f939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f940g;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f941a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Throwable f942b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                t.g(callbackName, "callbackName");
                t.g(cause, "cause");
                this.f941a = callbackName;
                this.f942b = cause;
            }

            public final b a() {
                return this.f941a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f942b;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: B2.d$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0023c {
            public /* synthetic */ C0023c(AbstractC2633k abstractC2633k) {
                this();
            }

            public final B2.c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                t.g(refHolder, "refHolder");
                t.g(sqLiteDatabase, "sqLiteDatabase");
                B2.c cVarA = refHolder.a();
                if (cVarA != null && cVarA.j(sqLiteDatabase)) {
                    return cVarA;
                }
                B2.c cVar = new B2.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }

            public C0023c() {
            }
        }

        /* JADX INFO: renamed from: B2.d$c$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C0024d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f949a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f949a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final A2.h.a callback, boolean z8) {
            String string;
            super(context, str, null, callback.f483a, new DatabaseErrorHandler() { // from class: B2.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.c(callback, dbRef, sQLiteDatabase);
                }
            });
            t.g(context, "context");
            t.g(dbRef, "dbRef");
            t.g(callback, "callback");
            this.f934a = context;
            this.f935b = dbRef;
            this.f936c = callback;
            this.f937d = z8;
            if (str == null) {
                string = UUID.randomUUID().toString();
                t.f(string, "randomUUID().toString()");
            } else {
                string = str;
            }
            this.f939f = new C2.a(string, context.getCacheDir(), false);
        }

        public static final void c(A2.h.a callback, b dbRef, SQLiteDatabase dbObj) {
            t.g(callback, "$callback");
            t.g(dbRef, "$dbRef");
            C0023c c0023c = f933h;
            t.f(dbObj, "dbObj");
            callback.c(c0023c.a(dbRef, dbObj));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C2.a.c(this.f939f, false, 1, null);
                super.close();
                this.f935b.b(null);
                this.f940g = false;
            } finally {
                this.f939f.d();
            }
        }

        public final A2.g j(boolean z8) {
            A2.g gVarO;
            try {
                this.f939f.b((this.f940g || getDatabaseName() == null) ? false : true);
                this.f938e = false;
                SQLiteDatabase sQLiteDatabaseV = v(z8);
                if (this.f938e) {
                    close();
                    gVarO = j(z8);
                } else {
                    gVarO = o(sQLiteDatabaseV);
                }
                return gVarO;
            } finally {
                this.f939f.d();
            }
        }

        public final B2.c o(SQLiteDatabase sqLiteDatabase) {
            t.g(sqLiteDatabase, "sqLiteDatabase");
            return f933h.a(this.f935b, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db) {
            t.g(db, "db");
            if (!this.f938e && this.f936c.f483a != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                this.f936c.b(o(db));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            t.g(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f936c.d(o(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db, int i8, int i9) {
            t.g(db, "db");
            this.f938e = true;
            try {
                this.f936c.e(o(db), i8, i9);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db) {
            t.g(db, "db");
            if (!this.f938e) {
                try {
                    this.f936c.f(o(db));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f940g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i8, int i9) {
            t.g(sqLiteDatabase, "sqLiteDatabase");
            this.f938e = true;
            try {
                this.f936c.g(o(sqLiteDatabase), i8, i9);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }

        public final SQLiteDatabase t(boolean z8) {
            if (z8) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                t.f(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            t.f(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final SQLiteDatabase v(boolean z8) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z9 = this.f940g;
            if (databaseName != null && !z9 && (parentFile = this.f934a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return t(z8);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return t(z8);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i8 = C0024d.f949a[aVar.a().ordinal()];
                        if (i8 == 1 || i8 == 2 || i8 == 3 || i8 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f937d) {
                        throw th;
                    }
                    this.f934a.deleteDatabase(databaseName);
                    try {
                        return t(z8);
                    } catch (a e8) {
                        throw e8.getCause();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: B2.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0025d extends u implements Function0 {
        public C0025d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (d.this.f926b == null || !d.this.f928d) {
                cVar = new c(d.this.f925a, d.this.f926b, new b(null), d.this.f927c, d.this.f929e);
            } else {
                cVar = new c(d.this.f925a, new File(A2.d.a(d.this.f925a), d.this.f926b).getAbsolutePath(), new b(null), d.this.f927c, d.this.f929e);
            }
            A2.b.f(cVar, d.this.f931g);
            return cVar;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, A2.h.a callback) {
        this(context, str, callback, false, false, 24, null);
        t.g(context, "context");
        t.g(callback, "callback");
    }

    @Override // A2.h
    public A2.g B0() {
        return y().j(false);
    }

    @Override // A2.h
    public A2.g M0() {
        return y().j(true);
    }

    @Override // A2.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f930f.isInitialized()) {
            y().close();
        }
    }

    @Override // A2.h
    public String getDatabaseName() {
        return this.f926b;
    }

    @Override // A2.h
    public void setWriteAheadLoggingEnabled(boolean z8) {
        if (this.f930f.isInitialized()) {
            A2.b.f(y(), z8);
        }
        this.f931g = z8;
    }

    public final c y() {
        return (c) this.f930f.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, A2.h.a callback, boolean z8) {
        this(context, str, callback, z8, false, 16, null);
        t.g(context, "context");
        t.g(callback, "callback");
    }

    public d(Context context, String str, A2.h.a callback, boolean z8, boolean z9) {
        t.g(context, "context");
        t.g(callback, "callback");
        this.f925a = context;
        this.f926b = str;
        this.f927c = callback;
        this.f928d = z8;
        this.f929e = z9;
        this.f930f = k.b(new C0025d());
    }

    public /* synthetic */ d(Context context, String str, A2.h.a aVar, boolean z8, boolean z9, int i8, AbstractC2633k abstractC2633k) {
        this(context, str, aVar, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? false : z9);
    }
}
