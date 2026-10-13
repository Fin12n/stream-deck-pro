package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable, Iterable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f16442a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f16443b = new ArrayList();

    public boolean a() {
        return this.f16443b.isEmpty();
    }

    public Collection<a> b() {
        return this.f16443b;
    }

    public int c() {
        return this.f16443b.size();
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f16443b.iterator();
    }

    public String toString() {
        return "MetricBatch: [" + this.f16443b + "]";
    }

    public void a(a aVar) {
        this.f16443b.add(aVar);
    }
}
