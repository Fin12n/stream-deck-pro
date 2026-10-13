package A2;

import Z6.v;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface h extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0002a f482b = new C0002a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f483a;

        /* JADX INFO: renamed from: A2.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0002a {
            public /* synthetic */ C0002a(AbstractC2633k abstractC2633k) {
                this();
            }

            public C0002a() {
            }
        }

        public a(int i8) {
            this.f483a = i8;
        }

        public void b(g db) {
            t.g(db, "db");
        }

        public void c(g db) {
            t.g(db, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String strW = db.w();
                if (strW != null) {
                    a(strW);
                    return;
                }
                return;
            }
            List listF = null;
            try {
                try {
                    listF = db.F();
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                }
                if (listF != null) {
                    return;
                }
            } finally {
                if (listF != null) {
                    Iterator it = listF.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        t.f(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String strW2 = db.w();
                    if (strW2 != null) {
                        a(strW2);
                    }
                }
            }
        }

        public abstract void d(g gVar);

        public void e(g db, int i8, int i9) {
            t.g(db, "db");
            throw new SQLiteException("Can't downgrade database from version " + i8 + " to " + i9);
        }

        public void f(g db) {
            t.g(db, "db");
        }

        public abstract void g(g gVar, int i8, int i9);

        public final void a(String str) {
            if (v.v(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i8 = 0;
            boolean z8 = false;
            while (i8 <= length) {
                boolean z9 = t.h(str.charAt(!z8 ? i8 : length), 32) <= 0;
                if (z8) {
                    if (!z9) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z9) {
                    i8++;
                } else {
                    z8 = true;
                }
            }
            if (str.subSequence(i8, length + 1).toString().length() == 0) {
                return;
            }
            String str2 = SZCvugJaXc.ceRcUIgoDmAVCqQ;
            Log.w(str2, "deleting the database file: " + str);
            try {
                A2.b.c(new File(str));
            } catch (Exception e8) {
                Log.w(str2, "delete failed: ", e8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        h a(b bVar);
    }

    g B0();

    g M0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z8);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0003b f484f = new C0003b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f489e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f490a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f491b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public a f492c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f493d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f494e;

            public a(Context context) {
                t.g(context, "context");
                this.f490a = context;
            }

            public a b(a callback) {
                t.g(callback, "callback");
                this.f492c = callback;
                return this;
            }

            public a c(String str) {
                this.f491b = str;
                return this;
            }

            public b a() {
                String str;
                a aVar = this.f492c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f493d && ((str = this.f491b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException(OjEsfyJYzbPn.upguP);
                }
                return new b(this.f490a, this.f491b, aVar, this.f493d, this.f494e);
            }
        }

        /* JADX INFO: renamed from: A2.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0003b {
            public /* synthetic */ C0003b(AbstractC2633k abstractC2633k) {
                this();
            }

            public final a a(Context context) {
                t.g(context, "context");
                return new a(context);
            }

            public C0003b() {
            }
        }

        public b(Context context, String str, a callback, boolean z8, boolean z9) {
            t.g(context, "context");
            t.g(callback, "callback");
            this.f485a = context;
            this.f486b = str;
            this.f487c = callback;
            this.f488d = z8;
            this.f489e = z9;
        }

        public static final a a(Context context) {
            return f484f.a(context);
        }

        public /* synthetic */ b(Context context, String str, a aVar, boolean z8, boolean z9, int i8, AbstractC2633k abstractC2633k) {
            this(context, str, aVar, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? false : z9);
        }
    }
}
