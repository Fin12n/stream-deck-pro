package p059g4;

import com.google.android.datatransport.runtime.e;
import p032d4.b;
import p032d4.c;
import p032d4.f;
import p032d4.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f23765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p032d4.e f23766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f23767e;

    public m(e eVar, String str, b bVar, p032d4.e eVar2, n nVar) {
        this.f23763a = eVar;
        this.f23764b = str;
        this.f23765c = bVar;
        this.f23766d = eVar2;
        this.f23767e = nVar;
    }

    @Override // p032d4.f
    public void a(c cVar) {
        c(cVar, new h() { // from class: g4.l
            @Override // p032d4.h
            public final void a(Exception exc) {
                m.b(exc);
            }
        });
    }

    public void c(c cVar, h hVar) {
        this.f23767e.a(j.a().e(this.f23763a).c(cVar).f(this.f23764b).d(this.f23766d).b(this.f23765c).a(), hVar);
    }

    public static /* synthetic */ void b(Exception exc) {
    }
}
