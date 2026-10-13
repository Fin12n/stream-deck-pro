package o7;

import D6.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f30960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f30961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f30962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f30963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f30964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f30965g;

    public a(String serialName) {
        t.g(serialName, "serialName");
        this.f30959a = serialName;
        this.f30960b = r.n();
        this.f30961c = new ArrayList();
        this.f30962d = new HashSet();
        this.f30963e = new ArrayList();
        this.f30964f = new ArrayList();
        this.f30965g = new ArrayList();
    }

    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            list = r.n();
        }
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        aVar.a(str, fVar, list, z8);
    }

    public final void a(String elementName, f descriptor, List annotations, boolean z8) {
        t.g(elementName, "elementName");
        t.g(descriptor, "descriptor");
        t.g(annotations, "annotations");
        if (this.f30962d.add(elementName)) {
            this.f30961c.add(elementName);
            this.f30963e.add(descriptor);
            this.f30964f.add(annotations);
            this.f30965g.add(Boolean.valueOf(z8));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f30959a).toString());
    }

    public final List c() {
        return this.f30960b;
    }

    public final List d() {
        return this.f30964f;
    }

    public final List e() {
        return this.f30963e;
    }

    public final List f() {
        return this.f30961c;
    }

    public final List g() {
        return this.f30965g;
    }

    public final void h(List list) {
        t.g(list, "<set-?>");
        this.f30960b = list;
    }
}
