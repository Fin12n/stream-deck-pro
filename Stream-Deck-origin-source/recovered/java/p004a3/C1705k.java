package p004a3;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p010b0.D;
import p010b0.m;
import p058g3.h;
import p085j3.e;
import p121n3.d;
import p121n3.i;
import p121n3.j;

/* JADX INFO: renamed from: a3.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1705k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f13271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f13272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f13274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f13275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public D f13276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f13277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f13278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f13279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f13280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f13281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f13282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13283o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f13269a = new S();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f13270b = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13284p = 0;

    public void a(String str) {
        d.c(str);
        this.f13270b.add(str);
    }

    public Rect b() {
        return this.f13279k;
    }

    public D c() {
        return this.f13276h;
    }

    public float d() {
        return (long) ((e() / this.f13282n) * 1000.0f);
    }

    public float e() {
        return this.f13281m - this.f13280l;
    }

    public float f() {
        return this.f13281m;
    }

    public Map g() {
        return this.f13274f;
    }

    public float h(float f8) {
        return i.i(this.f13280l, this.f13281m, f8);
    }

    public float i() {
        return this.f13282n;
    }

    public Map j() {
        float fE = j.e();
        if (fE != this.f13273e) {
            for (Map.Entry entry : this.f13272d.entrySet()) {
                this.f13272d.put((String) entry.getKey(), ((K) entry.getValue()).a(this.f13273e / fE));
            }
        }
        this.f13273e = fE;
        return this.f13272d;
    }

    public List k() {
        return this.f13278j;
    }

    public h l(String str) {
        int size = this.f13275g.size();
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = (h) this.f13275g.get(i8);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f13284p;
    }

    public S n() {
        return this.f13269a;
    }

    public List o(String str) {
        return (List) this.f13271c.get(str);
    }

    public float p() {
        return this.f13280l;
    }

    public boolean q() {
        return this.f13283o;
    }

    public boolean r() {
        return !this.f13272d.isEmpty();
    }

    public void s(int i8) {
        this.f13284p += i8;
    }

    public void t(Rect rect, float f8, float f9, float f10, List list, m mVar, Map map, Map map2, float f11, D d8, Map map3, List list2) {
        this.f13279k = rect;
        this.f13280l = f8;
        this.f13281m = f9;
        this.f13282n = f10;
        this.f13278j = list;
        this.f13277i = mVar;
        this.f13271c = map;
        this.f13272d = map2;
        this.f13273e = f11;
        this.f13276h = d8;
        this.f13274f = map3;
        this.f13275g = list2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f13278j.iterator();
        while (it.hasNext()) {
            sb.append(((e) it.next()).z("\t"));
        }
        return sb.toString();
    }

    public e u(long j8) {
        return (e) this.f13277i.e(j8);
    }

    public void v(boolean z8) {
        this.f13283o = z8;
    }

    public void w(boolean z8) {
        this.f13269a.b(z8);
    }
}
