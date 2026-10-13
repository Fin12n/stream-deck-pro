package p076i3;

import java.util.Arrays;
import java.util.List;
import p004a3.C1705k;
import p004a3.J;
import p022c3.c;
import p022c3.d;
import p085j3.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24696c;

    public q(String str, List<c> list, boolean z8) {
        this.f24694a = str;
        this.f24695b = list;
        this.f24696c = z8;
    }

    @Override // p076i3.c
    public c a(J j8, C1705k c1705k, b bVar) {
        return new d(j8, bVar, this, c1705k);
    }

    public List b() {
        return this.f24695b;
    }

    public String c() {
        return this.f24694a;
    }

    public boolean d() {
        return this.f24696c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f24694a + "' Shapes: " + Arrays.toString(this.f24695b.toArray()) + '}';
    }
}
