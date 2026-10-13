package p031d3;

import java.util.List;
import p130o3.b;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class o extends g {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f19792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f19793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p058g3.b f19794f;

        public a(b bVar, c cVar, p058g3.b bVar2) {
            this.f19792d = bVar;
            this.f19793e = cVar;
            this.f19794f = bVar2;
        }

        @Override // p130o3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p058g3.b a(b bVar) {
            this.f19792d.h(bVar.f(), bVar.a(), ((p058g3.b) bVar.g()).f23684a, ((p058g3.b) bVar.b()).f23684a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f19793e.a(this.f19792d);
            p058g3.b bVar2 = (p058g3.b) (bVar.c() == 1.0f ? bVar.b() : bVar.g());
            this.f19794f.a(str, bVar2.f23685b, bVar2.f23686c, bVar2.f23687d, bVar2.f23688e, bVar2.f23689f, bVar2.f23690g, bVar2.f23691h, bVar2.f23692i, bVar2.f23693j, bVar2.f23694k, bVar2.f23695l, bVar2.f23696m);
            return this.f19794f;
        }
    }

    public o(List<p130o3.a> list) {
        super(list);
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public p058g3.b i(p130o3.a aVar, float f8) {
        Object obj;
        c cVar = this.f19749e;
        if (cVar == null) {
            return (f8 != 1.0f || (obj = aVar.f30873c) == null) ? (p058g3.b) aVar.f30872b : (p058g3.b) obj;
        }
        float f9 = aVar.f30877g;
        Float f10 = aVar.f30878h;
        float fFloatValue = f10 == null ? Float.MAX_VALUE : f10.floatValue();
        Object obj2 = aVar.f30872b;
        p058g3.b bVar = (p058g3.b) obj2;
        Object obj3 = aVar.f30873c;
        return (p058g3.b) cVar.b(f9, fFloatValue, bVar, obj3 == null ? (p058g3.b) obj2 : (p058g3.b) obj3, f8, d(), f());
    }

    public void r(c cVar) {
        super.o(new a(new b(), cVar, new p058g3.b()));
    }
}
