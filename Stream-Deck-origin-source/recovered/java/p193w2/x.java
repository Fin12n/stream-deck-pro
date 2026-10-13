package p193w2;

import A2.k;
import C6.j;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f36913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f36914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f36915c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return x.this.d();
        }
    }

    public x(r database) {
        t.g(database, "database");
        this.f36913a = database;
        this.f36914b = new AtomicBoolean(false);
        this.f36915c = C6.k.b(new a());
    }

    public k b() {
        c();
        return g(this.f36914b.compareAndSet(false, true));
    }

    public void c() {
        this.f36913a.c();
    }

    public final k d() {
        return this.f36913a.f(e());
    }

    public abstract String e();

    public final k f() {
        return (k) this.f36915c.getValue();
    }

    public final k g(boolean z8) {
        return z8 ? f() : d();
    }

    public void h(k statement) {
        t.g(statement, "statement");
        if (statement == f()) {
            this.f36914b.set(false);
        }
    }
}
