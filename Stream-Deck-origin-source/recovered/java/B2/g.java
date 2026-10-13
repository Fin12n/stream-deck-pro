package B2;

import A2.i;
import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f953a;

    public g(SQLiteProgram delegate) {
        t.g(delegate, "delegate");
        this.f953a = delegate;
    }

    @Override // A2.i
    public void E0(int i8, byte[] value) {
        t.g(value, "value");
        this.f953a.bindBlob(i8, value);
    }

    @Override // A2.i
    public void N(int i8, String value) {
        t.g(value, "value");
        this.f953a.bindString(i8, value);
    }

    @Override // A2.i
    public void c0(int i8, double d8) {
        this.f953a.bindDouble(i8, d8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f953a.close();
    }

    @Override // A2.i
    public void l1(int i8) {
        this.f953a.bindNull(i8);
    }

    @Override // A2.i
    public void v0(int i8, long j8) {
        this.f953a.bindLong(i8, j8);
    }
}
