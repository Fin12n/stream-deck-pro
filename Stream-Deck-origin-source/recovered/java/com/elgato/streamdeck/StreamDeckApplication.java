package com.elgato.streamdeck;

import A5.c;
import A5.q;
import C6.G;
import C6.r;
import F5.g;
import G6.d;
import I6.l;
import Q6.k;
import Q6.o;
import X3.m;
import Y3.f;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.AbstractC1727j;
import androidx.lifecycle.AbstractC1734q;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.pairip.StartupLauncher;
import io.sentry.util.thread.KaI.gGXbKSNWRRHNE;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class StreamDeckApplication extends Application {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {
        public a() {
            super(1);
        }

        public final void b(c.a openGraph) throws q {
            t.g(openGraph, "$this$openGraph");
            StreamDeckApplication streamDeckApplication = StreamDeckApplication.this;
            openGraph.m(new g(new A5.a(StreamDeckApplication.class, false, null, null), streamDeckApplication));
            openGraph.m(new g(new A5.a(Context.class, false, null, null), streamDeckApplication));
            if (!c.a.f(openGraph, new A5.a(Application.class, false, null, null), false, 2, null)) {
                openGraph.m(new g(new A5.a(Application.class, false, null, null), streamDeckApplication));
            }
            ProcessLifecycleOwner.b bVar = ProcessLifecycleOwner.f15256i;
            openGraph.m(new g(new A5.a(AbstractC1726i.class, false, A5.b.d(), null), bVar.a().w()));
            openGraph.m(new g(new A5.a(AbstractC1727j.class, false, A5.b.d(), null), AbstractC1734q.a(bVar.a())));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws q {
            b((c.a) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p005a4.c f17662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f17664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ StreamDeckApplication f17665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Y3.c f17666f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p005a4.c cVar, String str, m mVar, StreamDeckApplication streamDeckApplication, Y3.c cVar2, d dVar) {
            super(2, dVar);
            this.f17662b = cVar;
            this.f17663c = str;
            this.f17664d = mVar;
            this.f17665e = streamDeckApplication;
            this.f17666f = cVar2;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new b(this.f17662b, this.f17663c, this.f17664d, this.f17665e, this.f17666f, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
        
            if (r2.i(r18) == r1) goto L20;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f17661a;
            if (i8 == 0) {
                r.b(obj);
                p005a4.c cVar = this.f17662b;
                p005a4.b bVar = new p005a4.b(this.f17663c, "production", 0.0d, false, false, false, 60, null);
                m mVar = this.f17664d;
                p005a4.g gVar = new p005a4.g(this.f17665e);
                this.f17661a = 1;
                if (cVar.c(bVar, mVar, gVar, this) != objF) {
                }
                return objF;
            }
            if (i8 == 1) {
                r.b(obj);
            } else if (i8 == 2) {
                r.b(obj);
                Y3.c cVar2 = this.f17666f;
                this.f17661a = 3;
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
            Y3.c cVar3 = this.f17666f;
            StreamDeckApplication streamDeckApplication = this.f17665e;
            Y3.d dVar = new Y3.d("streamdeck-mobile-android", "Elgato Stream Deck Mobile", null, new f("https://edm-producer-prod.elgato.com/sdmandroid/track", "34c2608c-858c-4f71-8ec2-08e06676314c", "08a5fe04-fd27-4088-8918-36fe79353568", 0L, 8, null), 0, 0L, false, false, 116, null);
            m mVar2 = this.f17664d;
            this.f17661a = 2;
            if (cVar3.o(streamDeckApplication, dVar, mVar2, this) != objF) {
                Y3.c cVar4 = this.f17666f;
                this.f17661a = 3;
            }
            return objF;
        }
    }

    static {
        StartupLauncher.launch();
    }

    public final String a(String str) {
        try {
            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), 128);
            t.f(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                return bundle.getString(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @Override // android.app.Application
    public void onCreate() throws IllegalAccessException, InvocationTargetException {
        gGXbKSNWRRHNE.LnzoCicJspMFbdp.invoke(null, this);
    }
}
