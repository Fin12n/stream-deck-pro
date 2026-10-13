package V3;

import C6.o;
import D6.M;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String attributeName, int i8) {
            super(null);
            t.g(attributeName, "attributeName");
            this.f10684a = attributeName;
            this.f10685b = i8;
        }

        public final String a() {
            return this.f10684a;
        }

        public final int b() {
            return this.f10685b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.c(this.f10684a, bVar.f10684a) && this.f10685b == bVar.f10685b;
        }

        public int hashCode() {
            return (this.f10684a.hashCode() * 31) + Integer.hashCode(this.f10685b);
        }

        public String toString() {
            return "IncrementSessionAttribute(attributeName=" + this.f10684a + ", byValue=" + this.f10685b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f10687b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String screenName, Map<String, String> map) {
            super(null);
            t.g(screenName, "screenName");
            this.f10686a = screenName;
            this.f10687b = map;
        }

        public final Map a() {
            return this.f10687b;
        }

        public final String b() {
            return this.f10686a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return t.c(this.f10686a, cVar.f10686a) && t.c(this.f10687b, cVar.f10687b);
        }

        public int hashCode() {
            int iHashCode = this.f10686a.hashCode() * 31;
            Map map = this.f10687b;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Screen(screenName=" + this.f10686a + ", eventInfo=" + this.f10687b + ")";
        }

        public /* synthetic */ c(String str, Map map, int i8, AbstractC2633k abstractC2633k) {
            this(str, (Map<String, String>) ((i8 & 2) != 0 ? null : map));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(String name, o... data) {
            this(name, (Map<String, String>) M.w(data));
            t.g(name, "name");
            t.g(data, "data");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f10689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String userAttribute, Object value) {
            super(null);
            t.g(userAttribute, "userAttribute");
            t.g(value, "value");
            this.f10688a = userAttribute;
            this.f10689b = value;
        }

        public final String a() {
            return this.f10688a;
        }

        public final Object b() {
            return this.f10689b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return t.c(this.f10688a, dVar.f10688a) && t.c(this.f10689b, dVar.f10689b);
        }

        public int hashCode() {
            return (this.f10688a.hashCode() * 31) + this.f10689b.hashCode();
        }

        public String toString() {
            return "SetUserAttribute(userAttribute=" + this.f10688a + ", value=" + this.f10689b + ")";
        }
    }

    public /* synthetic */ h(AbstractC2633k abstractC2633k) {
        this();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V3.a f10682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f10683c;

        public /* synthetic */ a(String str, V3.a aVar, Map map, int i8, AbstractC2633k abstractC2633k) {
            this(str, (i8 & 2) != 0 ? V3.a.Other : aVar, (Map<String, String>) ((i8 & 4) != 0 ? null : map));
        }

        public final Map a() {
            return this.f10683c;
        }

        public final String b() {
            return this.f10681a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.c(this.f10681a, aVar.f10681a) && this.f10682b == aVar.f10682b && t.c(this.f10683c, aVar.f10683c);
        }

        public int hashCode() {
            int iHashCode = ((this.f10681a.hashCode() * 31) + this.f10682b.hashCode()) * 31;
            Map map = this.f10683c;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Event(name=" + this.f10681a + ", type=" + this.f10682b + ", eventInfo=" + this.f10683c + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, V3.a type, Map<String, String> map) {
            super(null);
            t.g(name, "name");
            t.g(type, "type");
            this.f10681a = name;
            this.f10682b = type;
            this.f10683c = map;
        }

        public /* synthetic */ a(String str, o[] oVarArr, V3.a aVar, int i8, AbstractC2633k abstractC2633k) {
            this(str, oVarArr, (i8 & 4) != 0 ? V3.a.Other : aVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String name, o[] data, V3.a type) {
            this(name, type, (Map<String, String>) M.w(data));
            t.g(name, "name");
            t.g(data, "data");
            t.g(type, "type");
        }
    }

    public h() {
    }
}
