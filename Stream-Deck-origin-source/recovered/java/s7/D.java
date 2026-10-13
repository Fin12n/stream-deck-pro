package s7;

import C6.C0920i;
import M6.eLZq.eGwOBWCdOTaKus;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D implements Iterator, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.c f33170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f33171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p116m7.a f33172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33174e;

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f33174e) {
            return false;
        }
        if (this.f33171b.H() != 9) {
            if (this.f33171b.E() || this.f33174e) {
                return true;
            }
            AbstractC2894a.z(this.f33171b, (byte) 9, false, 2, null);
            throw new C0920i();
        }
        this.f33174e = true;
        this.f33171b.k((byte) 9);
        if (this.f33171b.E()) {
            if (this.f33171b.H() == 8) {
                AbstractC2894a.x(this.f33171b, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null);
                throw new C0920i();
            }
            this.f33171b.v();
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f33173d) {
            this.f33173d = false;
        } else {
            this.f33171b.l(',');
        }
        return new X(this.f33170a, e0.OBJ, this.f33171b, this.f33172c.getDescriptor(), null).A(this.f33172c);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public D(r7.c cVar, W lexer, p116m7.a deserializer) {
        kotlin.jvm.internal.t.g(cVar, eGwOBWCdOTaKus.qsQiNHDkVsWdg);
        kotlin.jvm.internal.t.g(lexer, "lexer");
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        this.f33170a = cVar;
        this.f33171b = lexer;
        this.f33172c = deserializer;
        this.f33173d = true;
    }
}
