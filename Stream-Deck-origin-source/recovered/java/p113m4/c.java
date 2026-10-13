package p113m4;

import B6.a;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import java.util.concurrent.Executor;
import p068h4.e;
import p077i4.b;
import p122n4.v;
import p131o4.InterfaceC2752d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f30058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f30059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f30060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f30061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f30062e;

    public c(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f30058a = aVar;
        this.f30059b = aVar2;
        this.f30060c = aVar3;
        this.f30061d = aVar4;
        this.f30062e = aVar5;
    }

    public static c a(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new c(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static DefaultScheduler c(Executor executor, e eVar, v vVar, InterfaceC2752d interfaceC2752d, p139p4.b bVar) {
        return new DefaultScheduler(executor, eVar, vVar, interfaceC2752d, bVar);
    }

    @Override // B6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DefaultScheduler get() {
        return c((Executor) this.f30058a.get(), (e) this.f30059b.get(), (v) this.f30060c.get(), (InterfaceC2752d) this.f30061d.get(), (p139p4.b) this.f30062e.get());
    }
}
