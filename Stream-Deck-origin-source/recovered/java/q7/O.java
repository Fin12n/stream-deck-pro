package q7;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O extends AbstractC2869w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.f f32045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(p116m7.b eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.t.g(eSerializer, "eSerializer");
        this.f32045b = new N(eSerializer.getDescriptor());
    }

    @Override // q7.AbstractC2867v, p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return this.f32045b;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashSet a() {
        return new HashSet();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashSet hashSet) {
        kotlin.jvm.internal.t.g(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashSet hashSet, int i8) {
        kotlin.jvm.internal.t.g(hashSet, "<this>");
    }

    @Override // q7.AbstractC2867v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(HashSet hashSet, int i8, Object obj) {
        kotlin.jvm.internal.t.g(hashSet, "<this>");
        hashSet.add(obj);
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public HashSet k(Set set) {
        kotlin.jvm.internal.t.g(set, "<this>");
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set l(HashSet hashSet) {
        kotlin.jvm.internal.t.g(hashSet, "<this>");
        return hashSet;
    }
}
