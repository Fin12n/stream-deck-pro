package B2;

import A2.j;
import A2.k;
import Q6.q;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements A2.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f919b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f920c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f921d = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f922a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f923a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar) {
            super(4);
            this.f923a = jVar;
        }

        @Override // Q6.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor i(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f923a;
            t.d(sQLiteQuery);
            jVar.b(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase delegate) {
        t.g(delegate, "delegate");
        this.f922a = delegate;
    }

    public static final Cursor o(q tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        t.g(tmp0, "$tmp0");
        return (Cursor) tmp0.i(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor t(j query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        t.g(query, "$query");
        t.d(sQLiteQuery);
        query.b(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // A2.g
    public void B() {
        this.f922a.beginTransaction();
    }

    @Override // A2.g
    public List F() {
        return this.f922a.getAttachedDbs();
    }

    @Override // A2.g
    public boolean F1() {
        return A2.b.d(this.f922a);
    }

    @Override // A2.g
    public void K(int i8) {
        this.f922a.setVersion(i8);
    }

    @Override // A2.g
    public void L(String sql) {
        t.g(sql, "sql");
        this.f922a.execSQL(sql);
    }

    @Override // A2.g
    public Cursor N1(j query) {
        t.g(query, "query");
        final b bVar = new b(query);
        Cursor cursorRawQueryWithFactory = this.f922a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: B2.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.o(bVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.c(), f921d, null);
        t.f(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // A2.g
    public Cursor P0(String query) {
        t.g(query, "query");
        return N1(new A2.a(query));
    }

    @Override // A2.g
    public k V(String sql) {
        t.g(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f922a.compileStatement(sql);
        t.f(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new h(sQLiteStatementCompileStatement);
    }

    @Override // A2.g
    public void W0() {
        this.f922a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f922a.close();
    }

    @Override // A2.g
    public Cursor e0(final j query, CancellationSignal cancellationSignal) {
        t.g(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f922a;
        String strC = query.c();
        String[] strArr = f921d;
        t.d(cancellationSignal);
        return A2.b.e(sQLiteDatabase, strC, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: B2.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.t(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // A2.g
    public boolean isOpen() {
        return this.f922a.isOpen();
    }

    public final boolean j(SQLiteDatabase sqLiteDatabase) {
        t.g(sqLiteDatabase, "sqLiteDatabase");
        return t.c(this.f922a, sqLiteDatabase);
    }

    @Override // A2.g
    public String w() {
        return this.f922a.getPath();
    }

    @Override // A2.g
    public boolean w1() {
        return this.f922a.inTransaction();
    }

    @Override // A2.g
    public void x0() {
        this.f922a.setTransactionSuccessful();
    }

    @Override // A2.g
    public void z0() {
        this.f922a.beginTransactionNonExclusive();
    }
}
