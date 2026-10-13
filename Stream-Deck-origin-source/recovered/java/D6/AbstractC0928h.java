package D6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: D6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0928h extends AbstractC0921a implements Set, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1946a = new a(null);

    /* JADX INFO: renamed from: D6.h$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final boolean a(Set c8, Set other) {
            kotlin.jvm.internal.t.g(c8, "c");
            kotlin.jvm.internal.t.g(other, "other");
            if (c8.size() != other.size()) {
                return false;
            }
            return c8.containsAll(other);
        }

        public final int b(Collection c8) {
            kotlin.jvm.internal.t.g(c8, "c");
            Iterator it = c8.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }

        public a() {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f1946a.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f1946a.b(this);
    }
}
