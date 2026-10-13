package p122n4;

import B6.a;
import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import java.util.concurrent.Executor;
import p068h4.e;
import p077i4.b;
import p131o4.InterfaceC2751c;
import p131o4.InterfaceC2752d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f30614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f30615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f30616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f30617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f30618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f30619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f30620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f30621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f30622i;

    public r(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9) {
        this.f30614a = aVar;
        this.f30615b = aVar2;
        this.f30616c = aVar3;
        this.f30617d = aVar4;
        this.f30618e = aVar5;
        this.f30619f = aVar6;
        this.f30620g = aVar7;
        this.f30621h = aVar8;
        this.f30622i = aVar9;
    }

    public static r a(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9) {
        return new r(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static Uploader c(Context context, e eVar, InterfaceC2752d interfaceC2752d, v vVar, Executor executor, p139p4.b bVar, p147q4.a aVar, p147q4.a aVar2, InterfaceC2751c interfaceC2751c) {
        return new Uploader(context, eVar, interfaceC2752d, vVar, executor, bVar, aVar, aVar2, interfaceC2751c);
    }

    @Override // B6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Uploader get() {
        return c((Context) this.f30614a.get(), (e) this.f30615b.get(), (InterfaceC2752d) this.f30616c.get(), (v) this.f30617d.get(), (Executor) this.f30618e.get(), (p139p4.b) this.f30619f.get(), (p147q4.a) this.f30620g.get(), (p147q4.a) this.f30621h.get(), (InterfaceC2751c) this.f30622i.get());
    }
}
