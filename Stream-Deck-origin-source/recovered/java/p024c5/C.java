package p024c5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p078i5.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C extends AbstractC1824a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f16214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f16215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f16216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f16217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f16218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f16219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f16220g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f16221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f16222b;

        public a(Set<Class<?>> set, b bVar) {
            this.f16221a = set;
            this.f16222b = bVar;
        }
    }

    public C(C1826c c1826c, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (p pVar : c1826c.c()) {
            if (pVar.d()) {
                if (pVar.f()) {
                    hashSet4.add(pVar.b());
                } else {
                    hashSet.add(pVar.b());
                }
            } else if (pVar.c()) {
                hashSet3.add(pVar.b());
            } else if (pVar.f()) {
                hashSet5.add(pVar.b());
            } else {
                hashSet2.add(pVar.b());
            }
        }
        if (!c1826c.f().isEmpty()) {
            hashSet.add(b.class);
        }
        this.f16214a = Collections.unmodifiableSet(hashSet);
        this.f16215b = Collections.unmodifiableSet(hashSet2);
        this.f16216c = Collections.unmodifiableSet(hashSet3);
        this.f16217d = Collections.unmodifiableSet(hashSet4);
        this.f16218e = Collections.unmodifiableSet(hashSet5);
        this.f16219f = c1826c.f();
        this.f16220g = dVar;
    }

    @Override // p024c5.AbstractC1824a, p024c5.d
    public Object a(Class cls) {
        if (!this.f16214a.contains(cls)) {
            throw new r(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f16220g.a(cls);
        return !cls.equals(b.class) ? objA : new a(this.f16219f, (b) objA);
    }

    @Override // p024c5.d
    public p087j5.b b(Class cls) {
        if (this.f16215b.contains(cls)) {
            return this.f16220g.b(cls);
        }
        throw new r(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // p024c5.d
    public p087j5.b c(Class cls) {
        if (this.f16218e.contains(cls)) {
            return this.f16220g.c(cls);
        }
        throw new r(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // p024c5.AbstractC1824a, p024c5.d
    public Set d(Class cls) {
        if (this.f16217d.contains(cls)) {
            return this.f16220g.d(cls);
        }
        throw new r(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }
}
