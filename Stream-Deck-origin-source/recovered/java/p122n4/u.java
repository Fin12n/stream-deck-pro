package p122n4;

import B6.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import java.util.concurrent.Executor;
import p077i4.b;
import p131o4.InterfaceC2752d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class u implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f30625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f30626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f30627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f30628d;

    public u(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f30625a = aVar;
        this.f30626b = aVar2;
        this.f30627c = aVar3;
        this.f30628d = aVar4;
    }

    public static u a(a aVar, a aVar2, a aVar3, a aVar4) {
        return new u(aVar, aVar2, aVar3, aVar4);
    }

    public static WorkInitializer c(Executor executor, InterfaceC2752d interfaceC2752d, v vVar, p139p4.b bVar) {
        return new WorkInitializer(executor, interfaceC2752d, vVar, bVar);
    }

    @Override // B6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public WorkInitializer get() {
        return c((Executor) this.f30625a.get(), (InterfaceC2752d) this.f30626b.get(), (v) this.f30627c.get(), (p139p4.b) this.f30628d.get());
    }
}
