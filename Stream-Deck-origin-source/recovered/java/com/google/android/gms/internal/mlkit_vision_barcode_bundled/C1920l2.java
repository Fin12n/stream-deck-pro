package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1920l2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18593a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f18595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1940p2 f18596d;

    public /* synthetic */ C1920l2(AbstractC1940p2 abstractC1940p2, AbstractC1915k2 abstractC1915k2) {
        this.f18596d = abstractC1940p2;
    }

    public final Iterator b() {
        if (this.f18595c == null) {
            this.f18595c = this.f18596d.f18619c.entrySet().iterator();
        }
        return this.f18595c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i8 = this.f18593a + 1;
        AbstractC1940p2 abstractC1940p2 = this.f18596d;
        if (i8 >= abstractC1940p2.f18618b) {
            return !abstractC1940p2.f18619c.isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f18594b = true;
        int i8 = this.f18593a + 1;
        this.f18593a = i8;
        AbstractC1940p2 abstractC1940p2 = this.f18596d;
        return i8 < abstractC1940p2.f18618b ? (C1910j2) abstractC1940p2.f18617a[i8] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f18594b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f18594b = false;
        this.f18596d.o();
        int i8 = this.f18593a;
        AbstractC1940p2 abstractC1940p2 = this.f18596d;
        if (i8 >= abstractC1940p2.f18618b) {
            b().remove();
        } else {
            this.f18593a = i8 - 1;
            abstractC1940p2.m(i8);
        }
    }
}
