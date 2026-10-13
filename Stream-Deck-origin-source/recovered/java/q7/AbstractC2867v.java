package q7;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: q7.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2867v extends AbstractC2826a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p116m7.b f32157a;

    public /* synthetic */ AbstractC2867v(p116m7.b bVar, AbstractC2633k abstractC2633k) {
        this(bVar);
    }

    @Override // q7.AbstractC2826a
    public final void g(p7.c decoder, Object obj, int i8, int i9) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        if (i9 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i10 = 0; i10 < i9; i10++) {
            h(decoder, i8 + i10, obj, false);
        }
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public abstract o7.f getDescriptor();

    @Override // q7.AbstractC2826a
    public void h(p7.c decoder, int i8, Object obj, boolean z8) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        n(obj, i8, p7.c.a.c(decoder, getDescriptor(), i8, this.f32157a, null, 8, null));
    }

    public abstract void n(Object obj, int i8, Object obj2);

    @Override // p116m7.k
    public void serialize(p7.f encoder, Object obj) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        int iE = e(obj);
        o7.f descriptor = getDescriptor();
        p7.d dVarE = encoder.E(descriptor, iE);
        Iterator itD = d(obj);
        for (int i8 = 0; i8 < iE; i8++) {
            dVarE.i(getDescriptor(), i8, this.f32157a, itD.next());
        }
        dVarE.c(descriptor);
    }

    public AbstractC2867v(p116m7.b bVar) {
        super(null);
        this.f32157a = bVar;
    }
}
