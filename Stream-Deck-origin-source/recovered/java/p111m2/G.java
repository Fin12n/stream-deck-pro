package p111m2;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1726i;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p120n2.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f29661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f29662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f29663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f29673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f29675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f29676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f29677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f29678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f29679s;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ComponentCallbacksC2681f f29681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f29682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f29683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f29684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f29685f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f29686g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public AbstractC1726i.b f29687h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public AbstractC1726i.b f29688i;

        public a() {
        }

        public a(int i8, ComponentCallbacksC2681f componentCallbacksC2681f) {
            this.f29680a = i8;
            this.f29681b = componentCallbacksC2681f;
            this.f29682c = false;
            AbstractC1726i.b bVar = AbstractC1726i.b.RESUMED;
            this.f29687h = bVar;
            this.f29688i = bVar;
        }

        public a(int i8, ComponentCallbacksC2681f componentCallbacksC2681f, boolean z8) {
            this.f29680a = i8;
            this.f29681b = componentCallbacksC2681f;
            this.f29682c = z8;
            AbstractC1726i.b bVar = AbstractC1726i.b.RESUMED;
            this.f29687h = bVar;
            this.f29688i = bVar;
        }
    }

    @Deprecated
    public G() {
        this.f29663c = new ArrayList();
        this.f29670j = true;
        this.f29678r = false;
        this.f29661a = null;
        this.f29662b = null;
    }

    public G b(int i8, ComponentCallbacksC2681f componentCallbacksC2681f, String str) {
        k(i8, componentCallbacksC2681f, str, 1);
        return this;
    }

    public G c(ViewGroup viewGroup, ComponentCallbacksC2681f componentCallbacksC2681f, String str) {
        componentCallbacksC2681f.f29845H = viewGroup;
        return b(viewGroup.getId(), componentCallbacksC2681f, str);
    }

    public G d(ComponentCallbacksC2681f componentCallbacksC2681f, String str) {
        k(0, componentCallbacksC2681f, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.f29663c.add(aVar);
        aVar.f29683d = this.f29664d;
        aVar.f29684e = this.f29665e;
        aVar.f29685f = this.f29666f;
        aVar.f29686g = this.f29667g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public G j() {
        if (this.f29669i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f29670j = false;
        return this;
    }

    public G l(ComponentCallbacksC2681f componentCallbacksC2681f) {
        e(new a(3, componentCallbacksC2681f));
        return this;
    }

    public G m(boolean z8) {
        this.f29678r = z8;
        return this;
    }

    public void k(int i8, ComponentCallbacksC2681f componentCallbacksC2681f, String str, int i9) {
        String str2 = componentCallbacksC2681f.f29857c0;
        if (str2 != null) {
            c.f(componentCallbacksC2681f, str2);
        }
        Class<?> cls = componentCallbacksC2681f.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC2681f.f29890z;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC2681f + ": was " + componentCallbacksC2681f.f29890z + " now " + str);
            }
            componentCallbacksC2681f.f29890z = str;
        }
        if (i8 != 0) {
            if (i8 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC2681f + " with tag " + str + " to container view with no id");
            }
            int i10 = componentCallbacksC2681f.f29888x;
            if (i10 != 0 && i10 != i8) {
                throw new IllegalStateException(HRHLwtyqJWz.QPqW + componentCallbacksC2681f + ": was " + componentCallbacksC2681f.f29888x + " now " + i8);
            }
            componentCallbacksC2681f.f29888x = i8;
            componentCallbacksC2681f.f29889y = i8;
        }
        e(new a(i9, componentCallbacksC2681f));
    }

    public G(p pVar, ClassLoader classLoader) {
        this.f29663c = new ArrayList();
        this.f29670j = true;
        this.f29678r = false;
        this.f29661a = pVar;
        this.f29662b = classLoader;
    }
}
