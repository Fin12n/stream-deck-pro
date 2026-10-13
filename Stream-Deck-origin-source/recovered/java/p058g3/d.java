package p058g3;

import java.util.List;
import p076i3.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f23707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f23708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f23709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f23711f;

    public d(List<q> list, char c8, double d8, double d9, String str, String str2) {
        this.f23706a = list;
        this.f23707b = c8;
        this.f23708c = d8;
        this.f23709d = d9;
        this.f23710e = str;
        this.f23711f = str2;
    }

    public static int c(char c8, String str, String str2) {
        return (((c8 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List a() {
        return this.f23706a;
    }

    public double b() {
        return this.f23709d;
    }

    public int hashCode() {
        return c(this.f23707b, this.f23711f, this.f23710e);
    }
}
