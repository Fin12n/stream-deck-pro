package p042e5;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20774b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f20776b = null;

        public b(String str) {
            this.f20775a = str;
        }

        public d a() {
            return new d(this.f20775a, this.f20776b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f20776b)));
        }

        public b b(Annotation annotation) {
            if (this.f20776b == null) {
                this.f20776b = new HashMap();
            }
            this.f20776b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static d d(String str) {
        return new d(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f20773a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f20774b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f20773a.equals(dVar.f20773a) && this.f20774b.equals(dVar.f20774b);
    }

    public int hashCode() {
        return (this.f20773a.hashCode() * 31) + this.f20774b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f20773a + ", properties=" + this.f20774b.values() + "}";
    }

    public d(String str, Map map) {
        this.f20773a = str;
        this.f20774b = map;
    }
}
