package androidx.lifecycle;

import I0.mIk.efuWFSeiT;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15216f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Class[] f15217g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f15218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f15219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f15220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f15221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z2.d.c f15222e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final F a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new F();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.t.f(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new F(map);
            }
            ClassLoader classLoader = F.class.getClassLoader();
            kotlin.jvm.internal.t.d(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = parcelableArrayList.get(i8);
                kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i8));
            }
            return new F(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : F.f15217g) {
                kotlin.jvm.internal.t.d(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    public F(Map<String, ? extends Object> initialState) {
        kotlin.jvm.internal.t.g(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f15218a = linkedHashMap;
        this.f15219b = new LinkedHashMap();
        this.f15220c = new LinkedHashMap();
        this.f15221d = new LinkedHashMap();
        this.f15222e = new z2.d.c() { // from class: androidx.lifecycle.E
            @Override // z2.d.c
            public final Bundle a() {
                return F.d(this.f15215a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    public final z2.d.c c() {
        return this.f15222e;
    }

    public final void e(String key, Object obj) {
        kotlin.jvm.internal.t.g(key, "key");
        if (!f15216f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            kotlin.jvm.internal.t.d(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f15220c.get(key);
        x xVar = obj2 instanceof x ? (x) obj2 : null;
        if (xVar != null) {
            xVar.m(obj);
        } else {
            this.f15218a.put(key, obj);
        }
        p044e7.x xVar2 = (p044e7.x) this.f15221d.get(key);
        if (xVar2 == null) {
            return;
        }
        xVar2.setValue(obj);
    }

    public static final Bundle d(F f8) {
        kotlin.jvm.internal.t.g(f8, efuWFSeiT.PFZdRoRD);
        for (Map.Entry entry : D6.M.v(f8.f15219b).entrySet()) {
            f8.e((String) entry.getKey(), ((z2.d.c) entry.getValue()).a());
        }
        Set<String> setKeySet = f8.f15218a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(f8.f15218a.get(str));
        }
        return P1.c.a(C6.v.a("keys", arrayList), C6.v.a("values", arrayList2));
    }

    public F() {
        this.f15218a = new LinkedHashMap();
        this.f15219b = new LinkedHashMap();
        this.f15220c = new LinkedHashMap();
        this.f15221d = new LinkedHashMap();
        this.f15222e = new z2.d.c() { // from class: androidx.lifecycle.E
            @Override // z2.d.c
            public final Bundle a() {
                return F.d(this.f15215a);
            }
        };
    }
}
