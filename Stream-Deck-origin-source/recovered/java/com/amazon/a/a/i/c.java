package com.amazon.a.a.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f16465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a[] f16466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f16467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f16468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f16469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f16470i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        DEFAULT,
        HELP,
        DEEPLINK
    }

    public c(String str, String str2, String str3, boolean z8) {
        this(str, str2, str3, z8, false);
    }

    public String a() {
        return this.f16465d[this.f16469h];
    }

    public String[] b() {
        return this.f16465d;
    }

    public a[] c() {
        return this.f16466e;
    }

    public String d() {
        return this.f16464c;
    }

    public String e() {
        return this.f16463b;
    }

    public String f() {
        return this.f16462a;
    }

    public int g() {
        return this.f16470i;
    }

    public boolean h() {
        return this.f16467f;
    }

    public boolean i() {
        return this.f16468g;
    }

    public String toString() {
        return "PromptContent: [ title:" + this.f16462a + ", message: " + this.f16464c + ", label: " + this.f16465d[0] + ", visible: " + this.f16467f + ", shouldShowFixup: " + this.f16468g + "]";
    }

    public c(String str, String str2, String str3, boolean z8, boolean z9) {
        this(str, str2, new String[]{str3}, new a[]{a.DEFAULT}, z8, z9, 0);
    }

    public c(String str, String str2, String[] strArr, a[] aVarArr, boolean z8, boolean z9, int i8) {
        this(new String[]{str}, str2, strArr, aVarArr, z8, z9, i8);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z8, boolean z9, int i8) {
        this(strArr, str, strArr2, aVarArr, z8, z9, i8, -1);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z8, boolean z9, int i8, int i9) {
        String str2 = strArr[0];
        this.f16462a = str2;
        if (strArr.length > 1) {
            this.f16463b = strArr[1];
        } else {
            this.f16463b = str2;
        }
        this.f16464c = str;
        this.f16465d = strArr2;
        this.f16466e = aVarArr;
        this.f16467f = z8;
        this.f16468g = z9;
        this.f16469h = i8;
        this.f16470i = i9;
    }
}
