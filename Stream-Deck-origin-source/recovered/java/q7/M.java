package q7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class M extends AbstractC2843i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o7.f f32040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(p116m7.b kSerializer, p116m7.b vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.t.g(kSerializer, "kSerializer");
        kotlin.jvm.internal.t.g(vSerializer, "vSerializer");
        this.f32040c = new L(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // q7.AbstractC2843i0, p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return this.f32040c;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap a() {
        return new HashMap();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashMap map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        return map.size() * 2;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashMap map, int i8) {
        kotlin.jvm.internal.t.g(map, "<this>");
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator d(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        return map.size();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public HashMap k(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap(map) : map2;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map l(HashMap map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        return map;
    }
}
