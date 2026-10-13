package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p138p3.C2761a;
import p138p3.C2771f;
import p138p3.C2773h;
import p138p3.C2774i;
import p138p3.C2781p;
import p138p3.C2782q;
import p138p3.InterfaceC2763b;
import p138p3.InterfaceC2765c;
import p138p3.InterfaceC2769e;
import p138p3.InterfaceC2772g;
import p138p3.InterfaceC2775j;
import p138p3.InterfaceC2777l;
import p138p3.InterfaceC2778m;
import p138p3.InterfaceC2779n;
import p138p3.InterfaceC2780o;
import p138p3.x0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0415a {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile e f17347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f17348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile InterfaceC2780o f17349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f17350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f17351e;

        public /* synthetic */ b(Context context, x0 x0Var) {
            this.f17348b = context;
        }

        public a a() {
            if (this.f17348b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f17349c == null) {
                if (this.f17350d || this.f17351e) {
                    return new com.android.billingclient.api.b(null, this.f17348b, null, null);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f17347a == null || !this.f17347a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return this.f17349c != null ? new com.android.billingclient.api.b(null, this.f17347a, this.f17348b, this.f17349c, null, null, null) : new com.android.billingclient.api.b(null, this.f17347a, this.f17348b, null, null, null);
        }

        public b b() {
            e.a aVarC = e.c();
            aVarC.b();
            c(aVarC.a());
            return this;
        }

        public b c(e eVar) {
            this.f17347a = eVar;
            return this;
        }

        public b d(InterfaceC2780o interfaceC2780o) {
            this.f17349c = interfaceC2780o;
            return this;
        }
    }

    public static b h(Context context) {
        return new b(context, null);
    }

    public abstract void a(C2761a c2761a, InterfaceC2763b interfaceC2763b);

    public abstract void b(C2771f c2771f, InterfaceC2772g interfaceC2772g);

    public abstract void c();

    public abstract void d(C2773h c2773h, InterfaceC2769e interfaceC2769e);

    public abstract d e(String str);

    public abstract boolean f();

    public abstract d g(Activity activity, c cVar);

    public abstract void i(g gVar, InterfaceC2777l interfaceC2777l);

    public abstract void j(C2781p c2781p, InterfaceC2778m interfaceC2778m);

    public abstract void k(C2782q c2782q, InterfaceC2779n interfaceC2779n);

    public abstract d l(Activity activity, C2774i c2774i, InterfaceC2775j interfaceC2775j);

    public abstract void m(InterfaceC2765c interfaceC2765c);
}
