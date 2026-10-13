package p140p5;

import S4.m;
import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.Executor;
import p024c5.C1826c;
import p024c5.f;
import p024c5.n;
import p219z4.AbstractC3207p;

/* JADX INFO: renamed from: p5.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2799i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f31257b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2799i f31258c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f31259a;

    public static C2799i c() {
        C2799i c2799i;
        synchronized (f31257b) {
            AbstractC3207p.n(f31258c != null, "MlKitContext has not been initialized");
            c2799i = (C2799i) AbstractC3207p.k(f31258c);
        }
        return c2799i;
    }

    public static C2799i d(Context context) {
        C2799i c2799iE;
        synchronized (f31257b) {
            c2799iE = e(context, m.f9747a);
        }
        return c2799iE;
    }

    public static C2799i e(Context context, Executor executor) {
        C2799i c2799i;
        synchronized (f31257b) {
            AbstractC3207p.n(f31258c == null, "MlKitContext is already initialized");
            C2799i c2799i2 = new C2799i();
            f31258c = c2799i2;
            Context contextF = f(context);
            n nVarC = n.e(executor).b(f.b(contextF, MlKitComponentDiscoveryService.class).a()).a(C1826c.l(contextF, Context.class, new Class[0])).a(C1826c.l(c2799i2, C2799i.class, new Class[0])).c();
            c2799i2.f31259a = nVarC;
            nVarC.h(true);
            c2799i = f31258c;
        }
        return c2799i;
    }

    public static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public Object a(Class cls) {
        AbstractC3207p.n(f31258c == this, "MlKitContext has been deleted");
        AbstractC3207p.k(this.f31259a);
        return this.f31259a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
