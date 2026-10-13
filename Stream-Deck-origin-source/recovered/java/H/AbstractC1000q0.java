package H;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: H.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1000q0 {

    /* JADX INFO: renamed from: H.q0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f3174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F1.c.a f3175b;

        public a(boolean z8, F1.c.a aVar) {
            this.f3174a = z8;
            this.f3175b = aVar;
        }

        @Override // K.c
        public void b(Throwable th) {
            if (th instanceof TimeoutException) {
                this.f3175b.f(th);
            } else {
                this.f3175b.c(Collections.EMPTY_LIST);
            }
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            T1.f.g(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f3174a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f3175b.c(arrayList);
        }
    }

    public static /* synthetic */ Object a(final Y4.a aVar, Executor executor, boolean z8, Collection collection, F1.c.a aVar2) {
        aVar2.a(new Runnable() { // from class: H.p0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.cancel(true);
            }
        }, executor);
        K.n.j(aVar, new a(z8, aVar2), executor);
        return "surfaceList[" + collection + "]";
    }

    public static void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC0994n0) it.next()).e();
        }
    }

    public static void d(List list) throws AbstractC0994n0.a {
        if (list.isEmpty()) {
            return;
        }
        int i8 = 0;
        do {
            try {
                ((AbstractC0994n0) list.get(i8)).l();
                i8++;
            } catch (AbstractC0994n0.a e8) {
                for (int i9 = i8 - 1; i9 >= 0; i9--) {
                    ((AbstractC0994n0) list.get(i9)).e();
                }
                throw e8;
            }
        } while (i8 < list.size());
    }

    public static Y4.a e(final Collection collection, final boolean z8, long j8, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(K.n.s(((AbstractC0994n0) it.next()).j()));
        }
        final Y4.a aVarQ = K.n.q(j8, scheduledExecutorService, K.n.w(arrayList));
        return F1.c.a(new F1.c.InterfaceC0112c() { // from class: H.o0
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar) {
                return AbstractC1000q0.a(aVarQ, executor, z8, collection, aVar);
            }
        });
    }
}
