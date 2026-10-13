package com.amazon.a.b;

import T0.Vl.PCRzgdeK;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f16841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f16842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f16843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f16844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f16845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f16846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f16847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f16848h = "Quit";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f16849i = "Help";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f16850j = "Update";

    private e() {
    }

    static {
        String[] strArr = {f16848h, f16849i};
        com.amazon.a.a.i.c.a aVar = com.amazon.a.a.i.c.a.DEFAULT;
        com.amazon.a.a.i.c.a aVar2 = com.amazon.a.a.i.c.a.HELP;
        f16841a = new com.amazon.a.a.i.c(new String[]{"Amazon Appstore required"}, PCRzgdeK.eavvROqxZr, strArr, new com.amazon.a.a.i.c.a[]{aVar, aVar2}, true, true, 1, 1);
        f16842b = new com.amazon.a.a.i.c("Amazon Appstore connection failure", "An error occurred connecting to Amazon Appstore. Please try opening this app again", f16848h, true, false);
        f16843c = new com.amazon.a.a.i.c(new String[]{"New Appstore version required", "Amazon Appstore Update Required"}, "Amazon Appstore is out of date.  Please visit the Amazon website to install the latest version of the Appstore. ", new String[]{f16848h, f16849i}, new com.amazon.a.a.i.c.a[]{aVar, aVar2}, true, true, 1, 2);
        f16844d = new com.amazon.a.a.i.c("Internet connection required", "An internet connection is required to open this app. Please connect to the internet and reopen this app.", f16848h, true, false);
        f16845e = new com.amazon.a.a.i.c(new String[]{"Connection error"}, "An unknown error occurred connecting to Amazon Appstore.", new String[]{f16848h, f16849i}, new com.amazon.a.a.i.c.a[]{aVar, aVar2}, true, true, 1, 3);
        f16846f = new com.amazon.a.a.i.c("Internal error", "An internal error occurred, please try opening this app again", f16848h, true, false);
        f16847g = new com.amazon.a.a.i.c("App update required", toqHM.OrrtLZ, new String[]{f16848h, f16850j}, new com.amazon.a.a.i.c.a[]{aVar, com.amazon.a.a.i.c.a.DEEPLINK}, true, false, 0);
    }
}
