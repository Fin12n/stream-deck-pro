package Q1;

import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.c f9107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f9108b;

    /* JADX INFO: renamed from: Q1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class RunnableC0255a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.c f9109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f9110b;

        public RunnableC0255a(g.c cVar, Typeface typeface) {
            this.f9109a = cVar;
            this.f9110b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9109a.b(this.f9110b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.c f9112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9113b;

        public b(g.c cVar, int i8) {
            this.f9112a = cVar;
            this.f9113b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9112a.a(this.f9113b);
        }
    }

    public a(g.c cVar, Handler handler) {
        this.f9107a = cVar;
        this.f9108b = handler;
    }

    public final void a(int i8) {
        this.f9108b.post(new b(this.f9107a, i8));
    }

    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f9137a);
        } else {
            a(eVar.f9138b);
        }
    }

    public final void c(Typeface typeface) {
        this.f9108b.post(new RunnableC0255a(this.f9107a, typeface));
    }
}
