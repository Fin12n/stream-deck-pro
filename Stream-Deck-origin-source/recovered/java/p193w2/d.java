package p193w2;

import A2.e;
import A2.f;
import A2.g;
import A2.h;
import A2.j;
import C6.G;
import D6.r;
import Q6.k;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p201x2.vAk.hJroAgFztiMK;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f36775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p193w2.c f36776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f36777c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements A2.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p193w2.c f36778a;

        /* JADX INFO: renamed from: w2.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0817a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0817a f36779a = new C0817a();

            public C0817a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final List invoke(A2.g obj) {
                t.g(obj, "obj");
                return obj.F();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f36780a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.f36780a = str;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A2.g db) {
                t.g(db, "db");
                db.L(this.f36780a);
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class c extends C2639q implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f36781a = new c();

            public c() {
                super(1, A2.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(A2.g p8) {
                t.g(p8, "p0");
                return Boolean.valueOf(p8.w1());
            }
        }

        /* JADX INFO: renamed from: w2.d$a$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0818d extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0818d f36782a = new C0818d();

            public C0818d() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(A2.g gVar) {
                t.g(gVar, RaiWHuj.fhWvlyBfXxwred);
                return Boolean.valueOf(gVar.F1());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class e extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f36783a = new e();

            public e() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(A2.g obj) {
                t.g(obj, "obj");
                return obj.w();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class f extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f36784a = new f();

            public f() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A2.g gVar) {
                t.g(gVar, hJroAgFztiMK.iKvjT);
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class g extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f36785a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(int i8) {
                super(1);
                this.f36785a = i8;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A2.g db) {
                t.g(db, "db");
                db.K(this.f36785a);
                return null;
            }
        }

        public a(p193w2.c autoCloser) {
            t.g(autoCloser, "autoCloser");
            this.f36778a = autoCloser;
        }

        @Override // A2.g
        public void B() {
            try {
                this.f36778a.j().B();
            } catch (Throwable th) {
                this.f36778a.e();
                throw th;
            }
        }

        @Override // A2.g
        public List F() {
            return (List) this.f36778a.g(C0817a.f36779a);
        }

        @Override // A2.g
        public boolean F1() {
            return ((Boolean) this.f36778a.g(C0818d.f36782a)).booleanValue();
        }

        @Override // A2.g
        public void K(int i8) {
            this.f36778a.g(new g(i8));
        }

        @Override // A2.g
        public void L(String sql) {
            t.g(sql, "sql");
            this.f36778a.g(new b(sql));
        }

        @Override // A2.g
        public Cursor N1(j query) {
            t.g(query, "query");
            try {
                return new c(this.f36778a.j().N1(query), this.f36778a);
            } catch (Throwable th) {
                this.f36778a.e();
                throw th;
            }
        }

        @Override // A2.g
        public Cursor P0(String query) {
            t.g(query, "query");
            try {
                return new c(this.f36778a.j().P0(query), this.f36778a);
            } catch (Throwable th) {
                this.f36778a.e();
                throw th;
            }
        }

        @Override // A2.g
        public A2.k V(String sql) {
            t.g(sql, "sql");
            return new b(sql, this.f36778a);
        }

        @Override // A2.g
        public void W0() {
            if (this.f36778a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                A2.g gVarH = this.f36778a.h();
                t.d(gVarH);
                gVarH.W0();
            } finally {
                this.f36778a.e();
            }
        }

        public final void b() {
            this.f36778a.g(f.f36784a);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f36778a.d();
        }

        @Override // A2.g
        public Cursor e0(j query, CancellationSignal cancellationSignal) {
            t.g(query, "query");
            try {
                return new c(this.f36778a.j().e0(query, cancellationSignal), this.f36778a);
            } catch (Throwable th) {
                this.f36778a.e();
                throw th;
            }
        }

        @Override // A2.g
        public boolean isOpen() {
            A2.g gVarH = this.f36778a.h();
            if (gVarH == null) {
                return false;
            }
            return gVarH.isOpen();
        }

        @Override // A2.g
        public String w() {
            return (String) this.f36778a.g(e.f36783a);
        }

        @Override // A2.g
        public boolean w1() {
            if (this.f36778a.h() == null) {
                return false;
            }
            return ((Boolean) this.f36778a.g(c.f36781a)).booleanValue();
        }

        @Override // A2.g
        public void x0() {
            G g8;
            A2.g gVarH = this.f36778a.h();
            if (gVarH != null) {
                gVarH.x0();
                g8 = G.f1419a;
            } else {
                g8 = null;
            }
            if (g8 == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // A2.g
        public void z0() {
            try {
                this.f36778a.j().z0();
            } catch (Throwable th) {
                this.f36778a.e();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements Cursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cursor f36793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p193w2.c f36794b;

        public c(Cursor delegate, p193w2.c autoCloser) {
            t.g(delegate, "delegate");
            t.g(autoCloser, "autoCloser");
            this.f36793a = delegate;
            this.f36794b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f36793a.close();
            this.f36794b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i8, CharArrayBuffer charArrayBuffer) {
            this.f36793a.copyStringToBuffer(i8, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f36793a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i8) {
            return this.f36793a.getBlob(i8);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f36793a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f36793a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f36793a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i8) {
            return this.f36793a.getColumnName(i8);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f36793a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f36793a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i8) {
            return this.f36793a.getDouble(i8);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f36793a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i8) {
            return this.f36793a.getFloat(i8);
        }

        @Override // android.database.Cursor
        public int getInt(int i8) {
            return this.f36793a.getInt(i8);
        }

        @Override // android.database.Cursor
        public long getLong(int i8) {
            return this.f36793a.getLong(i8);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return A2.c.a(this.f36793a);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return f.a(this.f36793a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f36793a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i8) {
            return this.f36793a.getShort(i8);
        }

        @Override // android.database.Cursor
        public String getString(int i8) {
            return this.f36793a.getString(i8);
        }

        @Override // android.database.Cursor
        public int getType(int i8) {
            return this.f36793a.getType(i8);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f36793a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f36793a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f36793a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f36793a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f36793a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f36793a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i8) {
            return this.f36793a.isNull(i8);
        }

        @Override // android.database.Cursor
        public boolean move(int i8) {
            return this.f36793a.move(i8);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f36793a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f36793a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f36793a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i8) {
            return this.f36793a.moveToPosition(i8);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f36793a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f36793a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f36793a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f36793a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f36793a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            t.g(extras, "extras");
            e.a(this.f36793a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f36793a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            t.g(cr, "cr");
            t.g(uris, "uris");
            f.b(this.f36793a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f36793a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f36793a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public d(h delegate, p193w2.c autoCloser) {
        t.g(delegate, "delegate");
        t.g(autoCloser, "autoCloser");
        this.f36775a = delegate;
        this.f36776b = autoCloser;
        autoCloser.k(b());
        this.f36777c = new a(autoCloser);
    }

    @Override // A2.h
    public g B0() {
        this.f36777c.b();
        return this.f36777c;
    }

    @Override // A2.h
    public g M0() {
        this.f36777c.b();
        return this.f36777c;
    }

    @Override // p193w2.i
    public h b() {
        return this.f36775a;
    }

    @Override // A2.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36777c.close();
    }

    @Override // A2.h
    public String getDatabaseName() {
        return this.f36775a.getDatabaseName();
    }

    @Override // A2.h
    public void setWriteAheadLoggingEnabled(boolean z8) {
        this.f36775a.setWriteAheadLoggingEnabled(z8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements A2.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p193w2.c f36787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f36788c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f36789a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Long invoke(A2.k obj) {
                t.g(obj, "obj");
                return Long.valueOf(obj.V1());
            }
        }

        /* JADX INFO: renamed from: w2.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0819b extends u implements k {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f36791b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0819b(k kVar) {
                super(1);
                this.f36791b = kVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g db) {
                t.g(db, "db");
                A2.k kVarV = db.V(b.this.f36786a);
                b.this.j(kVarV);
                return this.f36791b.invoke(kVarV);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f36792a = new c();

            public c() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(A2.k obj) {
                t.g(obj, "obj");
                return Integer.valueOf(obj.U());
            }
        }

        public b(String sql, p193w2.c autoCloser) {
            t.g(sql, "sql");
            t.g(autoCloser, "autoCloser");
            this.f36786a = sql;
            this.f36787b = autoCloser;
            this.f36788c = new ArrayList();
        }

        @Override // A2.i
        public void E0(int i8, byte[] value) {
            t.g(value, "value");
            t(i8, value);
        }

        @Override // A2.i
        public void N(int i8, String value) {
            t.g(value, "value");
            t(i8, value);
        }

        @Override // A2.k
        public int U() {
            return ((Number) o(c.f36792a)).intValue();
        }

        @Override // A2.k
        public long V1() {
            return ((Number) o(a.f36789a)).longValue();
        }

        @Override // A2.i
        public void c0(int i8, double d8) {
            t(i8, Double.valueOf(d8));
        }

        public final void j(A2.k kVar) {
            Iterator it = this.f36788c.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                it.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    r.x();
                }
                Object obj = this.f36788c.get(i8);
                if (obj == null) {
                    kVar.l1(i9);
                } else if (obj instanceof Long) {
                    kVar.v0(i9, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.c0(i9, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.N(i9, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.E0(i9, (byte[]) obj);
                }
                i8 = i9;
            }
        }

        @Override // A2.i
        public void l1(int i8) {
            t(i8, null);
        }

        public final Object o(k kVar) {
            return this.f36787b.g(new C0819b(kVar));
        }

        public final void t(int i8, Object obj) {
            int size;
            int i9 = i8 - 1;
            if (i9 >= this.f36788c.size() && (size = this.f36788c.size()) <= i9) {
                while (true) {
                    this.f36788c.add(null);
                    if (size == i9) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f36788c.set(i9, obj);
        }

        @Override // A2.i
        public void v0(int i8, long j8) {
            t(i8, Long.valueOf(j8));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
