package B2;

import A2.k;
import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h extends g implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement delegate) {
        super(delegate);
        t.g(delegate, "delegate");
        this.f954b = delegate;
    }

    @Override // A2.k
    public int U() {
        return this.f954b.executeUpdateDelete();
    }

    @Override // A2.k
    public long V1() {
        return this.f954b.executeInsert();
    }
}
