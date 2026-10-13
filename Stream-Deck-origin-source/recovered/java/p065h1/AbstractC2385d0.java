package p065h1;

import C6.G;
import C6.InterfaceC0919h;
import I0.g;
import I0.i;
import L0.l;
import Q6.k;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.g1;
import p217z2.d;
import p217z2.f;

/* JADX INFO: renamed from: h1.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2385d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class[] f24271a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: h1.d0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f24272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f24273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f24274c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z8, d dVar, String str) {
            super(0);
            this.f24272a = z8;
            this.f24273b = dVar;
            this.f24274c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m217invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m217invoke() {
            if (this.f24272a) {
                this.f24273b.j(this.f24274c);
            }
        }
    }

    /* JADX INFO: renamed from: h1.d0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f24275a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(AbstractC2385d0.f(obj));
        }
    }

    public static final C2381b0 b(View view, f fVar) {
        Object parent = view.getParent();
        t.e(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(l.f4860H);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, fVar);
    }

    public static final C2381b0 c(String str, f fVar) {
        boolean z8;
        String str2 = g.class.getSimpleName() + ':' + str;
        d dVarL = fVar.l();
        Bundle bundleB = dVarL.b(str2);
        final g gVarA = i.a(bundleB != null ? h(bundleB) : null, b.f24275a);
        try {
            dVarL.h(str2, new d.c() { // from class: h1.c0
                @Override // z2.d.c
                public final Bundle a() {
                    return AbstractC2385d0.d(gVarA);
                }
            });
            z8 = true;
        } catch (IllegalArgumentException unused) {
            z8 = false;
        }
        return new C2381b0(gVarA, new a(z8, dVarL, str2));
    }

    public static final Bundle d(g gVar) {
        return g(gVar.b());
    }

    public static final boolean f(Object obj) {
        if (obj instanceof J0.u) {
            J0.u uVar = (J0.u) obj;
            if (uVar.d() != g1.k() && uVar.d() != g1.r() && uVar.d() != g1.o()) {
                return false;
            }
            Object value = uVar.getValue();
            if (value == null) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof InterfaceC0919h) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class cls : f24271a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final Bundle g(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    public static final Map h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            t.e(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
