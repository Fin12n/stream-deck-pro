package p022c3;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p004a3.J;
import p004a3.N;
import p031d3.a;
import p031d3.m;
import p058g3.e;
import p076i3.t;
import p085j3.b;
import p121n3.i;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class r implements m, a.b, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f16194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f16195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16196f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16191a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f16197g = new b();

    public r(J j8, b bVar, p076i3.r rVar) {
        this.f16192b = rVar.b();
        this.f16193c = rVar.d();
        this.f16194d = j8;
        m mVarA = rVar.c().a();
        this.f16195e = mVarA;
        bVar.i(mVarA);
        mVarA.a(this);
    }

    private void e() {
        this.f16196f = false;
        this.f16194d.invalidateSelf();
    }

    @Override // d3.a.b
    public void a() {
        e();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // p022c3.c
    public void b(List list, List list2) {
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < list.size(); i8++) {
            c cVar = (c) list.get(i8);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f16197g.a(uVar);
                    uVar.c(this);
                } else if (!(cVar instanceof s)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((s) cVar);
                }
            } else if (!(cVar instanceof s)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((s) cVar);
            }
        }
        this.f16195e.r(arrayList);
    }

    @Override // p058g3.f
    public void c(Object obj, c cVar) {
        if (obj == N.f13146P) {
            this.f16195e.o(cVar);
        }
    }

    @Override // p058g3.f
    public void g(e eVar, int i8, List list, e eVar2) {
        i.k(eVar, i8, list, eVar2, this);
    }

    @Override // p022c3.c
    public String getName() {
        return this.f16192b;
    }

    @Override // p022c3.m
    public Path w() {
        if (this.f16196f && !this.f16195e.k()) {
            return this.f16191a;
        }
        this.f16191a.reset();
        if (this.f16193c) {
            this.f16196f = true;
            return this.f16191a;
        }
        Path path = (Path) this.f16195e.h();
        if (path == null) {
            return this.f16191a;
        }
        this.f16191a.set(path);
        this.f16191a.setFillType(Path.FillType.EVEN_ODD);
        this.f16197g.b(this.f16191a);
        this.f16196f = true;
        return this.f16191a;
    }
}
