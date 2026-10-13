package X5;

import java.util.Locale;
import p090k.zI.jULK;

/* JADX INFO: renamed from: X5.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1681j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11851c;

    public C1681j(String name, String value, boolean z8) {
        kotlin.jvm.internal.t.g(name, "name");
        kotlin.jvm.internal.t.g(value, "value");
        this.f11849a = name;
        this.f11850b = value;
        this.f11851c = z8;
    }

    public final String a() {
        return this.f11849a;
    }

    public final String b() {
        return this.f11850b;
    }

    public final String c() {
        return this.f11849a;
    }

    public final String d() {
        return this.f11850b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1681j)) {
            return false;
        }
        C1681j c1681j = (C1681j) obj;
        return Z6.v.v(c1681j.f11849a, this.f11849a, true) && Z6.v.v(c1681j.f11850b, this.f11850b, true);
    }

    public int hashCode() {
        String str = this.f11849a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.t.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f11850b.toLowerCase(locale);
        kotlin.jvm.internal.t.f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode();
    }

    public String toString() {
        return "HeaderValueParam(name=" + this.f11849a + ", value=" + this.f11850b + ", escapeValue=" + this.f11851c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1681j(String str, String value) {
        this(str, value, false);
        kotlin.jvm.internal.t.g(str, jULK.nGDjvvCihOl);
        kotlin.jvm.internal.t.g(value, "value");
    }
}
