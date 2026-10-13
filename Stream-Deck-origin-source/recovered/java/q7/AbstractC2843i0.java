package q7;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: q7.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2843i0 extends AbstractC2826a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p116m7.b f32117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p116m7.b f32118b;

    public /* synthetic */ AbstractC2843i0(p116m7.b bVar, p116m7.b bVar2, AbstractC2633k abstractC2633k) {
        this(bVar, bVar2);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public abstract o7.f getDescriptor();

    public final p116m7.b m() {
        return this.f32117a;
    }

    public final p116m7.b n() {
        return this.f32118b;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(p7.c decoder, Map builder, int i8, int i9) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        if (i9 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        W6.g gVarT = W6.n.t(W6.n.v(0, i9 * 2), 2);
        int iS = gVarT.s();
        int iT = gVarT.t();
        int iU = gVarT.u();
        if ((iU <= 0 || iS > iT) && (iU >= 0 || iT > iS)) {
            return;
        }
        while (true) {
            h(decoder, i8 + iS, builder, false);
            if (iS == iT) {
                return;
            } else {
                iS += iU;
            }
        }
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(p7.c decoder, int i8, Map builder, boolean z8) {
        int iE;
        kotlin.jvm.internal.t.g(decoder, "decoder");
        kotlin.jvm.internal.t.g(builder, "builder");
        Object objC = p7.c.a.c(decoder, getDescriptor(), i8, this.f32117a, null, 8, null);
        if (z8) {
            iE = decoder.E(getDescriptor());
            if (iE != i8 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i8 + ", returned index for value: " + iE).toString());
            }
        } else {
            iE = i8 + 1;
        }
        int i9 = iE;
        builder.put(objC, (!builder.containsKey(objC) || (this.f32118b.getDescriptor().e() instanceof o7.e)) ? p7.c.a.c(decoder, getDescriptor(), i9, this.f32118b, null, 8, null) : decoder.u(getDescriptor(), i9, this.f32118b, D6.M.h(builder, objC)));
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, Object obj) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        int iE = e(obj);
        o7.f descriptor = getDescriptor();
        p7.d dVarE = encoder.E(descriptor, iE);
        Iterator itD = d(obj);
        int i8 = 0;
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i9 = i8 + 1;
            dVarE.i(getDescriptor(), i8, m(), key);
            i8 += 2;
            dVarE.i(getDescriptor(), i9, n(), value);
        }
        dVarE.c(descriptor);
    }

    public AbstractC2843i0(p116m7.b bVar, p116m7.b bVar2) {
        super(null);
        this.f32117a = bVar;
        this.f32118b = bVar2;
    }
}
