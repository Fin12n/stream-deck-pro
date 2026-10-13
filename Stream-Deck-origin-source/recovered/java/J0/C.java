package J0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C extends D implements Iterator, R6.a {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Map.Entry, R6.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f3921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f3922b;

        public a() {
            Map.Entry entryE = C.this.e();
            kotlin.jvm.internal.t.d(entryE);
            this.f3921a = entryE.getKey();
            Map.Entry entryE2 = C.this.e();
            kotlin.jvm.internal.t.d(entryE2);
            this.f3922b = entryE2.getValue();
        }

        public void a(Object obj) {
            this.f3922b = obj;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f3921a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f3922b;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            C c8 = C.this;
            if (c8.f().d() != c8.f3926c) {
                throw new ConcurrentModificationException();
            }
            Object value = getValue();
            c8.f().put(getKey(), obj);
            a(obj);
            return value;
        }
    }

    public C(x xVar, Iterator<? extends Map.Entry<Object, Object>> it) {
        super(xVar, it);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        d();
        if (e() != null) {
            return new a();
        }
        throw new IllegalStateException();
    }
}
