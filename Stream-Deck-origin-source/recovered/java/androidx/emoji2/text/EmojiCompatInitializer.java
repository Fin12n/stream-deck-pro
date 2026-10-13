package androidx.emoji2.text;

import P1.k;
import android.content.Context;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements D2.b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1726i f15098a;

        public a(AbstractC1726i abstractC1726i) {
            this.f15098a = abstractC1726i;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC1733p interfaceC1733p) {
            EmojiCompatInitializer.this.e();
            this.f15098a.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends androidx.emoji2.text.c.AbstractC0371c {
        public b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c implements androidx.emoji2.text.c.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f15100a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a extends androidx.emoji2.text.c.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.emoji2.text.c.i f15101a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreadPoolExecutor f15102b;

            public a(androidx.emoji2.text.c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f15101a = iVar;
                this.f15102b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th) {
                try {
                    this.f15101a.a(th);
                } finally {
                    this.f15102b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.c.i
            public void b(f fVar) {
                try {
                    this.f15101a.b(fVar);
                } finally {
                    this.f15102b.shutdown();
                }
            }
        }

        public c(Context context) {
            this.f15100a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.h
        public void a(final androidx.emoji2.text.c.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = p066h2.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: h2.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24388a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        public void c(androidx.emoji2.text.c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                e eVarA = androidx.emoji2.text.a.a(this.f15100a);
                if (eVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                eVarA.c(threadPoolExecutor);
                eVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                k.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.k()) {
                    androidx.emoji2.text.c.c().n();
                }
            } finally {
                k.b();
            }
        }
    }

    @Override // D2.b
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // D2.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        androidx.emoji2.text.c.j(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    public void d(Context context) {
        AbstractC1726i abstractC1726iW = ((InterfaceC1733p) D2.a.e(context).f(ProcessLifecycleInitializer.class)).w();
        abstractC1726iW.a(new a(abstractC1726iW));
    }

    public void e() {
        p066h2.b.c().postDelayed(new d(), 500L);
    }
}
