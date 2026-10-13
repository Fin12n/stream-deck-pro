package p192w1;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p128o1.B;
import p128o1.C2739d;
import p128o1.I;
import p128o1.q;
import p136p1.j;
import p168t1.AbstractC3009n;
import p168t1.C;
import p168t1.U;
import p168t1.y;
import p168t1.z;
import p200x1.e;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f36726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f36727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f36728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC3009n.b f36729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A1.d f36730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f36731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f36732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f36733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f36734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f36735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f36736l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.q {
        public a() {
            super(4);
        }

        public final Typeface b(AbstractC3009n abstractC3009n, C c8, int i8, int i9) {
            q1 q1VarB = d.this.f().b(abstractC3009n, c8, i8, i9);
            if (q1VarB instanceof U.b) {
                Object value = q1VarB.getValue();
                t.e(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) value;
            }
            r rVar = new r(q1VarB, d.this.f36734j);
            d.this.f36734j = rVar;
            return rVar.a();
        }

        @Override // Q6.q
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            return b((AbstractC3009n) obj, (C) obj2, ((y) obj3).i(), ((z) obj4).m());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Collection, java.util.List, java.util.List<o1.d$b>] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public d(String str, I i8, List<C2739d.b> list, List<C2739d.b> list2, AbstractC3009n.b bVar, A1.d dVar) {
        this.f36725a = str;
        this.f36726b = i8;
        this.f36727c = list;
        this.f36728d = list2;
        this.f36729e = bVar;
        this.f36730f = dVar;
        g gVar = new g(1, dVar.getDensity());
        this.f36731g = gVar;
        this.f36735k = !e.c(i8) ? false : ((Boolean) l.f36747a.a().getValue()).booleanValue();
        this.f36736l = e.d(i8.B(), i8.u());
        a aVar = new a();
        e.e(gVar, i8.E());
        B bA = e.a(gVar, i8.M(), aVar, dVar, !list.isEmpty());
        if (bA != null) {
            int size = list.size() + 1;
            list = new ArrayList<>(size);
            int i9 = 0;
            while (i9 < size) {
                list.add(i9 == 0 ? new C2739d.b(bA, 0, this.f36725a.length()) : (C2739d.b) this.f36727c.get(i9 - 1));
                i9++;
            }
        }
        CharSequence charSequenceA = c.a(this.f36725a, this.f36731g.getTextSize(), this.f36726b, list, this.f36728d, this.f36730f, aVar, this.f36735k);
        this.f36732h = charSequenceA;
        this.f36733i = new j(charSequenceA, this.f36731g, this.f36736l);
    }

    @Override // p128o1.q
    public boolean a() {
        r rVar = this.f36734j;
        if (rVar != null ? rVar.b() : false) {
            return true;
        }
        return !this.f36735k && e.c(this.f36726b) && ((Boolean) l.f36747a.a().getValue()).booleanValue();
    }

    @Override // p128o1.q
    public float c() {
        return this.f36733i.c();
    }

    public final CharSequence e() {
        return this.f36732h;
    }

    public final AbstractC3009n.b f() {
        return this.f36729e;
    }

    public final j g() {
        return this.f36733i;
    }

    @Override // p128o1.q
    public float h() {
        return this.f36733i.b();
    }

    public final I i() {
        return this.f36726b;
    }

    public final int j() {
        return this.f36736l;
    }

    public final g k() {
        return this.f36731g;
    }
}
