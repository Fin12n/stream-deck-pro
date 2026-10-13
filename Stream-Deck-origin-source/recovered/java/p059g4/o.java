package p059g4;

import B6.a;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import p077i4.b;
import p113m4.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f23768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f23769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f23770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f23771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f23772e;

    public o(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f23768a = aVar;
        this.f23769b = aVar2;
        this.f23770c = aVar3;
        this.f23771d = aVar4;
        this.f23772e = aVar5;
    }

    public static o a(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new o(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static TransportRuntime c(p147q4.a aVar, p147q4.a aVar2, d dVar, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(aVar, aVar2, dVar, uploader, workInitializer);
    }

    @Override // B6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public TransportRuntime get() {
        return c((p147q4.a) this.f23768a.get(), (p147q4.a) this.f23769b.get(), (d) this.f23770c.get(), (Uploader) this.f23771d.get(), (WorkInitializer) this.f23772e.get());
    }
}
