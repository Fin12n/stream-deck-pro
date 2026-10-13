package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.d;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.room.c f15405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f15406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f15407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.room.c.AbstractC0386c f15409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.room.b f15410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.room.a f15411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f15412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ServiceConnection f15413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f15414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f15415l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends androidx.room.c.AbstractC0386c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0386c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.c.AbstractC0386c
        public void c(Set tables) {
            t.g(tables, "tables");
            if (d.this.j().get()) {
                return;
            }
            try {
                androidx.room.b bVarH = d.this.h();
                if (bVarH != null) {
                    bVarH.M(d.this.c(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot broadcast invalidation", e8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends androidx.room.a.AbstractBinderC0383a {
        public b() {
        }

        public static final void d(d this$0, String[] tables) {
            t.g(this$0, "this$0");
            t.g(tables, "$tables");
            this$0.e().k((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.a
        public void m(final String[] tables) {
            t.g(tables, "tables");
            Executor executorD = d.this.d();
            final d dVar = d.this;
            executorD.execute(new Runnable() { // from class: w2.p
                @Override // java.lang.Runnable
                public final void run() {
                    d.b.d(dVar, tables);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            t.g(name, "name");
            t.g(service, "service");
            d.this.m(androidx.room.b.a.a(service));
            d.this.d().execute(d.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            t.g(name, "name");
            d.this.d().execute(d.this.g());
            d.this.m(null);
        }
    }

    public d(Context context, String name, Intent serviceIntent, androidx.room.c invalidationTracker, Executor executor) {
        t.g(context, "context");
        t.g(name, "name");
        t.g(serviceIntent, "serviceIntent");
        t.g(invalidationTracker, "invalidationTracker");
        t.g(executor, "executor");
        this.f15404a = name;
        this.f15405b = invalidationTracker;
        this.f15406c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f15407d = applicationContext;
        this.f15411h = new b();
        this.f15412i = new AtomicBoolean(false);
        c cVar = new c();
        this.f15413j = cVar;
        this.f15414k = new Runnable() { // from class: w2.n
            @Override // java.lang.Runnable
            public final void run() {
                d.n(this.f36831a);
            }
        };
        this.f15415l = new Runnable() { // from class: w2.o
            @Override // java.lang.Runnable
            public final void run() {
                d.k(this.f36832a);
            }
        };
        l(new a((String[]) invalidationTracker.i().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    public static final void k(d this$0) {
        t.g(this$0, "this$0");
        this$0.f15405b.n(this$0.f());
    }

    public static final void n(d this$0) {
        t.g(this$0, "this$0");
        try {
            androidx.room.b bVar = this$0.f15410g;
            if (bVar != null) {
                this$0.f15408e = bVar.r(this$0.f15411h, this$0.f15404a);
                this$0.f15405b.c(this$0.f());
            }
        } catch (RemoteException e8) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e8);
        }
    }

    public final int c() {
        return this.f15408e;
    }

    public final Executor d() {
        return this.f15406c;
    }

    public final androidx.room.c e() {
        return this.f15405b;
    }

    public final androidx.room.c.AbstractC0386c f() {
        androidx.room.c.AbstractC0386c abstractC0386c = this.f15409f;
        if (abstractC0386c != null) {
            return abstractC0386c;
        }
        t.t("observer");
        return null;
    }

    public final Runnable g() {
        return this.f15415l;
    }

    public final androidx.room.b h() {
        return this.f15410g;
    }

    public final Runnable i() {
        return this.f15414k;
    }

    public final AtomicBoolean j() {
        return this.f15412i;
    }

    public final void l(androidx.room.c.AbstractC0386c abstractC0386c) {
        t.g(abstractC0386c, "<set-?>");
        this.f15409f = abstractC0386c;
    }

    public final void m(androidx.room.b bVar) {
        this.f15410g = bVar;
    }
}
