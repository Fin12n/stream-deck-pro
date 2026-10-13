package q7;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: q7.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2829b0 extends AbstractC2869w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.f f32087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2829b0(p116m7.b eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.t.g(eSerializer, "eSerializer");
        this.f32087b = new C2827a0(eSerializer.getDescriptor());
    }

    @Override // q7.AbstractC2867v, p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return this.f32087b;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet a() {
        return new LinkedHashSet();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.t.g(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashSet linkedHashSet, int i8) {
        kotlin.jvm.internal.t.g(linkedHashSet, "<this>");
    }

    @Override // q7.AbstractC2867v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(LinkedHashSet linkedHashSet, int i8, Object obj) {
        kotlin.jvm.internal.t.g(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet k(Set set) {
        kotlin.jvm.internal.t.g(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set l(LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.t.g(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
