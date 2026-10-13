package s7;

import java.util.Iterator;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F implements Iterator, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.c f33176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f33177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p116m7.a f33178c;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f33177b.E();
    }

    @Override // java.util.Iterator
    public Object next() {
        return new X(this.f33176a, e0.OBJ, this.f33177b, this.f33178c.getDescriptor(), null).A(this.f33178c);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public F(r7.c json, W w8, p116m7.a deserializer) {
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(w8, QhsKALGiniuQ.aMuLG);
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        this.f33176a = json;
        this.f33177b = w8;
        this.f33178c = deserializer;
    }
}
