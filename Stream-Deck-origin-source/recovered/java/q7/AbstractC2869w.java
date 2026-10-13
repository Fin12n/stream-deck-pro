package q7;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: q7.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2869w extends AbstractC2867v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2869w(p116m7.b element) {
        super(element, null);
        kotlin.jvm.internal.t.g(element, "element");
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator d(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        return collection.iterator();
    }

    @Override // q7.AbstractC2826a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        return collection.size();
    }
}
