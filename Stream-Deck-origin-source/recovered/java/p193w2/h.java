package p193w2;

import C6.InterfaceC0916e;
import D6.r;
import M6.eLZq.eGwOBWCdOTaKus;
import android.content.Context;
import android.content.Intent;
import androidx.room.MultiInstanceInvalidationService;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.t;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A2.h.c f36807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r.e f36808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f36809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r.d f36811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f36812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f36813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Intent f36814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f36815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f36816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f36817m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f36818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f36819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable f36820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r.f f36821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f36822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f36823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f36824t;

    public h(Context context, String str, A2.h.c sqliteOpenHelperFactory, r.e migrationContainer, List<? extends r.b> list, boolean z8, r.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z9, boolean z10, Set<Integer> set, String str2, File file, Callable<InputStream> callable, r.f fVar, List<? extends Object> typeConverters, List<Object> autoMigrationSpecs) {
        t.g(context, "context");
        t.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        t.g(migrationContainer, "migrationContainer");
        t.g(journalMode, "journalMode");
        t.g(queryExecutor, "queryExecutor");
        t.g(transactionExecutor, "transactionExecutor");
        t.g(typeConverters, "typeConverters");
        t.g(autoMigrationSpecs, "autoMigrationSpecs");
        this.f36805a = context;
        this.f36806b = str;
        this.f36807c = sqliteOpenHelperFactory;
        this.f36808d = migrationContainer;
        this.f36809e = list;
        this.f36810f = z8;
        this.f36811g = journalMode;
        this.f36812h = queryExecutor;
        this.f36813i = transactionExecutor;
        this.f36814j = intent;
        this.f36815k = z9;
        this.f36816l = z10;
        this.f36817m = set;
        this.f36818n = str2;
        this.f36819o = file;
        this.f36820p = callable;
        this.f36821q = fVar;
        this.f36822r = typeConverters;
        this.f36823s = autoMigrationSpecs;
        this.f36824t = intent != null;
    }

    public boolean a(int i8, int i9) {
        Set set;
        return (i8 <= i9 || !this.f36816l) && this.f36815k && ((set = this.f36817m) == null || !set.contains(Integer.valueOf(i8)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public h(Context context, String str, A2.h.c sqliteOpenHelperFactory, r.e migrationContainer, List<? extends r.b> list, boolean z8, r.d journalMode, Executor queryExecutor, boolean z9, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, journalMode, queryExecutor, queryExecutor, (Intent) null, z9, false, set, (String) null, (File) null, (Callable<InputStream>) null, (r.f) null, (List<? extends Object>) r.n(), (List<Object>) r.n());
        t.g(context, "context");
        t.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        t.g(migrationContainer, "migrationContainer");
        t.g(journalMode, "journalMode");
        t.g(queryExecutor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public h(Context context, String str, A2.h.c sqliteOpenHelperFactory, r.e migrationContainer, List<? extends r.b> list, boolean z8, r.d dVar, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, dVar, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, (String) null, (File) null, (Callable<InputStream>) null, (r.f) null, (List<? extends Object>) r.n(), (List<Object>) r.n());
        t.g(context, "context");
        t.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        t.g(migrationContainer, "migrationContainer");
        t.g(dVar, yOZfxp.AubpqCdK);
        t.g(queryExecutor, "queryExecutor");
        t.g(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public h(Context context, String str, A2.h.c sqliteOpenHelperFactory, r.e migrationContainer, List<? extends r.b> list, boolean z8, r.d journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set, String str2, File file) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, journalMode, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, str2, file, (Callable<InputStream>) null, (r.f) null, (List<? extends Object>) r.n(), (List<Object>) r.n());
        t.g(context, "context");
        t.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        t.g(migrationContainer, "migrationContainer");
        t.g(journalMode, "journalMode");
        t.g(queryExecutor, "queryExecutor");
        t.g(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public h(Context context, String str, A2.h.c sqliteOpenHelperFactory, r.e migrationContainer, List<? extends r.b> list, boolean z8, r.d dVar, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set, String str2, File file, Callable<InputStream> callable) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, dVar, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, str2, file, callable, (r.f) null, (List<? extends Object>) r.n(), (List<Object>) r.n());
        t.g(context, "context");
        t.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        t.g(migrationContainer, "migrationContainer");
        t.g(dVar, toqHM.YquYeRHIpi);
        t.g(queryExecutor, "queryExecutor");
        t.g(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public h(Context context, String str, A2.h.c sqliteOpenHelperFactory, r.e migrationContainer, List<? extends r.b> list, boolean z8, r.d journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set, String str2, File file, Callable<InputStream> callable, r.f fVar) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, journalMode, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, str2, file, callable, fVar, (List<? extends Object>) r.n(), (List<Object>) r.n());
        t.g(context, "context");
        t.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        t.g(migrationContainer, "migrationContainer");
        t.g(journalMode, "journalMode");
        t.g(queryExecutor, "queryExecutor");
        t.g(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public h(Context context, String str, A2.h.c cVar, r.e migrationContainer, List<? extends r.b> list, boolean z8, r.d journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set, String str2, File file, Callable<InputStream> callable, r.f fVar, List<? extends Object> typeConverters) {
        this(context, str, cVar, migrationContainer, list, z8, journalMode, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, str2, file, callable, fVar, typeConverters, (List<Object>) r.n());
        t.g(context, "context");
        t.g(cVar, eGwOBWCdOTaKus.bCvEyXoJo);
        t.g(migrationContainer, "migrationContainer");
        t.g(journalMode, "journalMode");
        t.g(queryExecutor, "queryExecutor");
        t.g(transactionExecutor, "transactionExecutor");
        t.g(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public h(Context context, String str, A2.h.c sqliteOpenHelperFactory, r.e migrationContainer, List<? extends r.b> list, boolean z8, r.d journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set, String str2, File file, Callable<InputStream> callable, r.f fVar, List<? extends Object> typeConverters, List<Object> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, journalMode, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, str2, file, callable, (r.f) null, typeConverters, autoMigrationSpecs);
        t.g(context, "context");
        t.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        t.g(migrationContainer, "migrationContainer");
        t.g(journalMode, "journalMode");
        t.g(queryExecutor, "queryExecutor");
        t.g(transactionExecutor, "transactionExecutor");
        t.g(typeConverters, "typeConverters");
        t.g(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
