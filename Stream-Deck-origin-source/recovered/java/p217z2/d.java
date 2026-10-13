package p217z2;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1730m;
import androidx.lifecycle.InterfaceC1733p;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f39063g = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f39066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p217z2.b.C0856b f39068e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p134p.b f39064a = new p134p.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39069f = true;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(f fVar);
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
    public interface c {
        Bundle a();
    }

    public static final void d(d this$0, InterfaceC1733p interfaceC1733p, AbstractC1726i.a event) {
        t.g(this$0, "this$0");
        t.g(interfaceC1733p, "<anonymous parameter 0>");
        t.g(event, "event");
        if (event == AbstractC1726i.a.ON_START) {
            this$0.f39069f = true;
        } else if (event == AbstractC1726i.a.ON_STOP) {
            this$0.f39069f = false;
        }
    }

    public final Bundle b(String key) {
        t.g(key, "key");
        if (!this.f39067d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f39066c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f39066c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f39066c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f39066c = null;
        return bundle2;
    }

    public final c c(String key) {
        t.g(key, "key");
        for (Map.Entry components : this.f39064a) {
            t.f(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (t.c(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(AbstractC1726i lifecycle) {
        t.g(lifecycle, "lifecycle");
        if (this.f39065b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC1730m() { // from class: z2.c
            @Override // androidx.lifecycle.InterfaceC1730m
            public final void j(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar) {
                d.d(this.f39062a, interfaceC1733p, aVar);
            }
        });
        this.f39065b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f39065b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f39067d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f39066c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f39067d = true;
    }

    public final void h(String key, c provider) {
        t.g(key, "key");
        t.g(provider, "provider");
        if (((c) this.f39064a.u(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class clazz) {
        t.g(clazz, "clazz");
        if (!this.f39069f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        p217z2.b.C0856b c0856b = this.f39068e;
        if (c0856b == null) {
            c0856b = new p217z2.b.C0856b(this);
        }
        this.f39068e = c0856b;
        try {
            clazz.getDeclaredConstructor(null);
            p217z2.b.C0856b c0856b2 = this.f39068e;
            if (c0856b2 != null) {
                String name = clazz.getName();
                t.f(name, "clazz.name");
                c0856b2.b(name);
            }
        } catch (NoSuchMethodException e8) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
        }
    }

    public final void j(String key) {
        t.g(key, "key");
        this.f39064a.y(key);
    }

    public final void g(Bundle bundle) {
        t.g(bundle, uYOhHhTXuF.UGAdwNKgMo);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f39066c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        p.b.d dVarO = this.f39064a.o();
        t.f(dVarO, "this.components.iteratorWithAdditions()");
        while (dVarO.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarO.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
