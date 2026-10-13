package p009b;

import Q6.k;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.t;
import p090k.zI.jULK;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f15551a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15552b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static x f15553c;

    public static /* synthetic */ void b(ActivityC1747j activityC1747j, H h8, H h9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            h8 = H.a.b(H.f15483e, 0, 0, null, 4, null);
        }
        if ((i8 & 2) != 0) {
            h9 = H.a.b(H.f15483e, f15551a, f15552b, null, 4, null);
        }
        a(activityC1747j, h8, h9);
    }

    public static final void a(ActivityC1747j activityC1747j, H statusBarStyle, H navigationBarStyle) {
        t.g(activityC1747j, "<this>");
        t.g(statusBarStyle, "statusBarStyle");
        t.g(navigationBarStyle, "navigationBarStyle");
        View decorView = activityC1747j.getWindow().getDecorView();
        t.f(decorView, bGZGhbtQmA.KWNyQPaWFokUpJ);
        k kVarA = statusBarStyle.a();
        Resources resources = decorView.getResources();
        String str = jULK.posRRI;
        t.f(resources, str);
        boolean zBooleanValue = ((Boolean) kVarA.invoke(resources)).booleanValue();
        k kVarA2 = navigationBarStyle.a();
        Resources resources2 = decorView.getResources();
        t.f(resources2, str);
        boolean zBooleanValue2 = ((Boolean) kVarA2.invoke(resources2)).booleanValue();
        x uVar = f15553c;
        if (uVar == null) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                uVar = new v();
            } else {
                uVar = i8 >= 29 ? new u() : new t();
            }
        }
        x xVar = uVar;
        Window window = activityC1747j.getWindow();
        t.f(window, "window");
        xVar.a(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = activityC1747j.getWindow();
        t.f(window2, "window");
        xVar.b(window2);
    }
}
