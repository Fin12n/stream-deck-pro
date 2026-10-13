package r7;

import io.jentz.winter.js.HRHLwtyqJWz;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC2633k;
import s7.b0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@p116m7.i(with = x.class)
public final class w extends j implements Map<String, j>, R6.a {
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f32595a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final p116m7.b serializer() {
            return x.f32597a;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32596a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            kotlin.jvm.internal.t.g(entry, "<name for destructuring parameter 0>");
            String str = (String) entry.getKey();
            j jVar = (j) entry.getValue();
            StringBuilder sb = new StringBuilder();
            b0.c(sb, str);
            sb.append(':');
            sb.append(jVar);
            String string = sb.toString();
            kotlin.jvm.internal.t.f(string, "toString(...)");
            return string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Map<String, ? extends j> content) {
        super(null);
        kotlin.jvm.internal.t.g(content, "content");
        this.f32595a = content;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public j remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(String key) {
        kotlin.jvm.internal.t.g(key, "key");
        return this.f32595a.containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ j compute(String str, BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ j computeIfAbsent(String str, Function<? super String, ? extends j> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ j computeIfPresent(String str, BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return c((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof j) {
            return m((j) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, j>> entrySet() {
        return s();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return kotlin.jvm.internal.t.c(this.f32595a, obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j get(Object obj) {
        if (obj instanceof String) {
            return o((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f32595a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f32595a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return t();
    }

    public boolean m(j value) {
        kotlin.jvm.internal.t.g(value, "value");
        return this.f32595a.containsValue(value);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ j merge(String str, j jVar, BiFunction<? super j, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public j o(String key) {
        kotlin.jvm.internal.t.g(key, "key");
        return (j) this.f32595a.get(key);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ j put(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends j> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ j putIfAbsent(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ j replace(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set s() {
        return this.f32595a.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return u();
    }

    public Set t() {
        return this.f32595a.keySet();
    }

    public int u() {
        return this.f32595a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<j> values() {
        return y();
    }

    public Collection y() {
        return this.f32595a.values();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, j jVar, j jVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return D6.z.r0(this.f32595a.entrySet(), com.amazon.a.a.o.b.f.f16777a, "{", HRHLwtyqJWz.ujGz, 0, null, b.f32596a, 24, null);
    }
}
