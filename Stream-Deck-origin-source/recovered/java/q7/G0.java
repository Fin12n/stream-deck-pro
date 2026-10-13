package q7;

import D6.C0933m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2625c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G0 extends AbstractC2867v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X6.d f32027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o7.f f32028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(X6.d kClass, p116m7.b eSerializer) {
        super(eSerializer, null);
        kotlin.jvm.internal.t.g(kClass, "kClass");
        kotlin.jvm.internal.t.g(eSerializer, "eSerializer");
        this.f32027b = kClass;
        this.f32028c = new C2832d(eSerializer.getDescriptor());
    }

    @Override // q7.AbstractC2867v, p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return this.f32028c;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i8) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        arrayList.ensureCapacity(i8);
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator d(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return AbstractC2625c.a(objArr);
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int e(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return objArr.length;
    }

    @Override // q7.AbstractC2867v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList arrayList, int i8, Object obj) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        arrayList.add(i8, obj);
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return new ArrayList(C0933m.c(objArr));
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object[] l(ArrayList arrayList) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        return AbstractC2868v0.p(arrayList, this.f32027b);
    }
}
