package H;

import A.AbstractC0890p0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class X0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W0 f2917b = W0.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X0 f2918c = new X0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P0 f2919a = P0.h(f2917b);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements R0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T1.a f2920a;

        public a(T1.a aVar) {
            this.f2920a = aVar;
        }

        @Override // H.R0.a
        public void a(Object obj) {
            this.f2920a.accept(obj);
        }

        @Override // H.R0.a
        public void onError(Throwable th) {
            AbstractC0890p0.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
        }
    }

    public static X0 b() {
        return f2918c;
    }

    public W0 a() {
        try {
            return (W0) this.f2919a.a().get();
        } catch (InterruptedException | ExecutionException e8) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e8);
        }
    }

    public void c(Executor executor, T1.a aVar) {
        this.f2919a.b(executor, new a(aVar));
    }

    public void d(W0 w8) {
        this.f2919a.g(w8);
    }
}
