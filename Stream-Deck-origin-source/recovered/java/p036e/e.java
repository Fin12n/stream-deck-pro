package p036e;

import D6.iIQ.BmWxZhjGfw;
import Y6.l;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1730m;
import androidx.lifecycle.InterfaceC1733p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f19969h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19970a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f19971b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f19972c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f19973d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Map f19974e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f19975f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f19976g = new Bundle();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p036e.b f19977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p045f.a f19978b;

        public a(p036e.b callback, p045f.a contract) {
            t.g(callback, "callback");
            t.g(contract, "contract");
            this.f19977a = callback;
            this.f19978b = contract;
        }

        public final p036e.b a() {
            return this.f19977a;
        }

        public final p045f.a b() {
            return this.f19978b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC1726i f19979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f19980b;

        public final void a(InterfaceC1730m observer) {
            t.g(observer, "observer");
            this.f19979a.a(observer);
            this.f19980b.add(observer);
        }

        public final void b() {
            Iterator it = this.f19980b.iterator();
            while (it.hasNext()) {
                this.f19979a.d((InterfaceC1730m) it.next());
            }
            this.f19980b.clear();
        }

        public c(AbstractC1726i abstractC1726i) {
            t.g(abstractC1726i, BmWxZhjGfw.UTbPiOkEDwMNb);
            this.f19979a = abstractC1726i;
            this.f19980b = new ArrayList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f19981a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(U6.c.f10243a.f(2147418112) + 65536);
        }
    }

    /* JADX INFO: renamed from: e.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0464e extends p036e.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f19983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p045f.a f19984c;

        public C0464e(String str, p045f.a aVar) {
            this.f19983b = str;
            this.f19984c = aVar;
        }

        @Override // p036e.c
        public void b(Object obj, H1.b bVar) throws Exception {
            Object obj2 = e.this.f19971b.get(this.f19983b);
            p045f.a aVar = this.f19984c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                e.this.f19973d.add(this.f19983b);
                try {
                    e.this.i(iIntValue, this.f19984c, obj, bVar);
                    return;
                } catch (Exception e8) {
                    e.this.f19973d.remove(this.f19983b);
                    throw e8;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p036e.c
        public void c() {
            e.this.p(this.f19983b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends p036e.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f19986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p045f.a f19987c;

        public f(String str, p045f.a aVar) {
            this.f19986b = str;
            this.f19987c = aVar;
        }

        @Override // p036e.c
        public void c() {
            e.this.p(this.f19986b);
        }

        @Override // p036e.c
        public void b(Object obj, H1.b bVar) throws Exception {
            Object obj2 = e.this.f19971b.get(this.f19986b);
            p045f.a aVar = this.f19987c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                e.this.f19973d.add(this.f19986b);
                try {
                    e.this.i(iIntValue, this.f19987c, obj, bVar);
                    return;
                } catch (Exception e8) {
                    e.this.f19973d.remove(this.f19986b);
                    throw e8;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + QhsKALGiniuQ.GCdxhXQ).toString());
        }
    }

    public static final void n(e this$0, String key, p036e.b callback, p045f.a contract, InterfaceC1733p interfaceC1733p, AbstractC1726i.a event) {
        t.g(this$0, "this$0");
        t.g(key, "$key");
        t.g(callback, "$callback");
        t.g(contract, "$contract");
        t.g(interfaceC1733p, "<anonymous parameter 0>");
        t.g(event, "event");
        if (AbstractC1726i.a.ON_START != event) {
            if (AbstractC1726i.a.ON_STOP == event) {
                this$0.f19974e.remove(key);
                return;
            } else {
                if (AbstractC1726i.a.ON_DESTROY == event) {
                    this$0.p(key);
                    return;
                }
                return;
            }
        }
        this$0.f19974e.put(key, new a(callback, contract));
        if (this$0.f19975f.containsKey(key)) {
            Object obj = this$0.f19975f.get(key);
            this$0.f19975f.remove(key);
            callback.a(obj);
        }
        p036e.a aVar = (p036e.a) P1.b.a(this$0.f19976g, key, p036e.a.class);
        if (aVar != null) {
            this$0.f19976g.remove(key);
            callback.a(contract.c(aVar.b(), aVar.a()));
        }
    }

    public final void d(int i8, String str) {
        this.f19970a.put(Integer.valueOf(i8), str);
        this.f19971b.put(str, Integer.valueOf(i8));
    }

    public final boolean e(int i8, int i9, Intent intent) {
        String str = (String) this.f19970a.get(Integer.valueOf(i8));
        if (str == null) {
            return false;
        }
        g(str, i9, intent, (a) this.f19974e.get(str));
        return true;
    }

    public final boolean f(int i8, Object obj) {
        String str = (String) this.f19970a.get(Integer.valueOf(i8));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f19974e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f19976g.remove(str);
            this.f19975f.put(str, obj);
            return true;
        }
        p036e.b bVarA = aVar.a();
        t.e(bVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f19973d.remove(str)) {
            return true;
        }
        bVarA.a(obj);
        return true;
    }

    public final void g(String str, int i8, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f19973d.contains(str)) {
            this.f19975f.remove(str);
            this.f19976g.putParcelable(str, new p036e.a(i8, intent));
        } else {
            aVar.a().a(aVar.b().c(i8, intent));
            this.f19973d.remove(str);
        }
    }

    public final int h() {
        for (Number number : l.g(d.f19981a)) {
            if (!this.f19970a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public abstract void i(int i8, p045f.a aVar, Object obj, H1.b bVar);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f19973d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f19976g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            String str = stringArrayList.get(i8);
            if (this.f19971b.containsKey(str)) {
                Integer num = (Integer) this.f19971b.remove(str);
                if (!this.f19976g.containsKey(str)) {
                    P.d(this.f19970a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i8);
            t.f(num2, "rcs[i]");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i8);
            t.f(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(Bundle outState) {
        t.g(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f19971b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f19971b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f19973d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f19976g));
    }

    public final p036e.c l(final String key, InterfaceC1733p lifecycleOwner, final p045f.a contract, final p036e.b callback) {
        t.g(key, "key");
        t.g(lifecycleOwner, "lifecycleOwner");
        t.g(contract, "contract");
        t.g(callback, "callback");
        AbstractC1726i abstractC1726iW = lifecycleOwner.w();
        if (abstractC1726iW.b().b(AbstractC1726i.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + abstractC1726iW.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = (c) this.f19972c.get(key);
        if (cVar == null) {
            cVar = new c(abstractC1726iW);
        }
        cVar.a(new InterfaceC1730m() { // from class: e.d
            @Override // androidx.lifecycle.InterfaceC1730m
            public final void j(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar) {
                e.n(this.f19965a, key, callback, contract, interfaceC1733p, aVar);
            }
        });
        this.f19972c.put(key, cVar);
        return new C0464e(key, contract);
    }

    public final p036e.c m(String key, p045f.a contract, p036e.b callback) {
        t.g(key, "key");
        t.g(contract, "contract");
        t.g(callback, "callback");
        o(key);
        this.f19974e.put(key, new a(callback, contract));
        if (this.f19975f.containsKey(key)) {
            Object obj = this.f19975f.get(key);
            this.f19975f.remove(key);
            callback.a(obj);
        }
        p036e.a aVar = (p036e.a) P1.b.a(this.f19976g, key, p036e.a.class);
        if (aVar != null) {
            this.f19976g.remove(key);
            callback.a(contract.c(aVar.b(), aVar.a()));
        }
        return new f(key, contract);
    }

    public final void o(String str) {
        if (((Integer) this.f19971b.get(str)) != null) {
            return;
        }
        d(h(), str);
    }

    public final void p(String key) {
        Integer num;
        t.g(key, "key");
        if (!this.f19973d.contains(key) && (num = (Integer) this.f19971b.remove(key)) != null) {
            this.f19970a.remove(num);
        }
        this.f19974e.remove(key);
        if (this.f19975f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f19975f.get(key));
            this.f19975f.remove(key);
        }
        if (this.f19976g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((p036e.a) P1.b.a(this.f19976g, key, p036e.a.class)));
            this.f19976g.remove(key);
        }
        c cVar = (c) this.f19972c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f19972c.remove(key);
        }
    }
}
