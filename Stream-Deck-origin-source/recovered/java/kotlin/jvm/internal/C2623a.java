package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2623a implements InterfaceC2637o, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f28793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28798g;

    public C2623a(int i8, Class cls, String str, String str2, int i9) {
        this(i8, AbstractC2628f.NO_RECEIVER, cls, str, str2, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2623a)) {
            return false;
        }
        C2623a c2623a = (C2623a) obj;
        return this.f28796e == c2623a.f28796e && this.f28797f == c2623a.f28797f && this.f28798g == c2623a.f28798g && t.c(this.f28792a, c2623a.f28792a) && t.c(this.f28793b, c2623a.f28793b) && this.f28794c.equals(c2623a.f28794c) && this.f28795d.equals(c2623a.f28795d);
    }

    @Override // kotlin.jvm.internal.InterfaceC2637o
    public int getArity() {
        return this.f28797f;
    }

    public int hashCode() {
        Object obj = this.f28792a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f28793b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f28794c.hashCode()) * 31) + this.f28795d.hashCode()) * 31) + (this.f28796e ? 1231 : 1237)) * 31) + this.f28797f) * 31) + this.f28798g;
    }

    public String toString() {
        return K.g(this);
    }

    public C2623a(int i8, Object obj, Class cls, String str, String str2, int i9) {
        this.f28792a = obj;
        this.f28793b = cls;
        this.f28794c = str;
        this.f28795d = str2;
        this.f28796e = (i9 & 1) == 1;
        this.f28797f = i8;
        this.f28798g = i9 >> 1;
    }
}
