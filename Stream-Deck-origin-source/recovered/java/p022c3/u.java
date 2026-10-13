package p022c3;

import java.util.ArrayList;
import java.util.List;
import p031d3.a;
import p076i3.t;
import p085j3.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class u implements c, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f16205c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t.a f16206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f16207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f16208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f16209g;

    public u(b bVar, t tVar) {
        this.f16203a = tVar.c();
        this.f16204b = tVar.g();
        this.f16206d = tVar.f();
        a aVarA = tVar.e().a();
        this.f16207e = aVarA;
        a aVarA2 = tVar.b().a();
        this.f16208f = aVarA2;
        a aVarA3 = tVar.d().a();
        this.f16209g = aVarA3;
        bVar.i(aVarA);
        bVar.i(aVarA2);
        bVar.i(aVarA3);
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
    }

    @Override // d3.a.b
    public void a() {
        for (int i8 = 0; i8 < this.f16205c.size(); i8++) {
            ((a.b) this.f16205c.get(i8)).a();
        }
    }

    public void c(a.b bVar) {
        this.f16205c.add(bVar);
    }

    public a e() {
        return this.f16208f;
    }

    public a g() {
        return this.f16209g;
    }

    public a i() {
        return this.f16207e;
    }

    public t.a j() {
        return this.f16206d;
    }

    public boolean k() {
        return this.f16204b;
    }

    @Override // p022c3.c
    public void b(List list, List list2) {
    }
}
