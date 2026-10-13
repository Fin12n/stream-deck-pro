package p141p6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f31333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f31334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f31335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f31336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f31337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f31338f;

    public final c a() {
        Integer num = this.f31333a;
        t.d(num);
        int iIntValue = num.intValue();
        Integer num2 = this.f31334b;
        t.d(num2);
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f31335c;
        t.d(num3);
        int iIntValue3 = num3.intValue();
        Integer num4 = this.f31336d;
        t.d(num4);
        int iIntValue4 = num4.intValue();
        g gVarB = b();
        Integer num5 = this.f31338f;
        t.d(num5);
        return a.a(iIntValue, iIntValue2, iIntValue3, iIntValue4, gVarB, num5.intValue());
    }

    public final g b() {
        g gVar = this.f31337e;
        if (gVar != null) {
            return gVar;
        }
        t.t("month");
        return null;
    }

    public final void c(Integer num) {
        this.f31336d = num;
    }

    public final void d(Integer num) {
        this.f31335c = num;
    }

    public final void e(Integer num) {
        this.f31334b = num;
    }

    public final void f(g gVar) {
        t.g(gVar, "<set-?>");
        this.f31337e = gVar;
    }

    public final void g(Integer num) {
        this.f31333a = num;
    }

    public final void h(Integer num) {
        this.f31338f = num;
    }
}
