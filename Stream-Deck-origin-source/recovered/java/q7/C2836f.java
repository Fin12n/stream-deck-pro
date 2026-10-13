package q7;

import io.jentz.winter.js.HRHLwtyqJWz;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: q7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2836f extends AbstractC2869w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.f f32100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2836f(p116m7.b element) {
        super(element);
        kotlin.jvm.internal.t.g(element, "element");
        this.f32100b = new C2834e(element.getDescriptor());
    }

    @Override // q7.AbstractC2867v, p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return this.f32100b;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i8) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        arrayList.ensureCapacity(i8);
    }

    @Override // q7.AbstractC2867v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList arrayList, int i8, Object obj) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        arrayList.add(i8, obj);
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public List l(ArrayList arrayList) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        return arrayList;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(List list) {
        kotlin.jvm.internal.t.g(list, HRHLwtyqJWz.PuDySXDvqGWai);
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }
}
