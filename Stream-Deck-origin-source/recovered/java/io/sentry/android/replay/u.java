package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import io.sentry.L2;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f26873g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26879f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a(int i8) {
            int i9 = i8 % 16;
            return i9 <= 8 ? i8 - i9 : i8 + (16 - i9);
        }

        public final u b(Context context, L2 sessionReplay) {
            Rect rect;
            kotlin.jvm.internal.t.g(context, "context");
            kotlin.jvm.internal.t.g(sessionReplay, "sessionReplay");
            Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.t.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowManager windowManager = (WindowManager) systemService;
            if (Build.VERSION.SDK_INT >= 30) {
                rect = windowManager.getCurrentWindowMetrics().getBounds();
            } else {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            kotlin.jvm.internal.t.f(rect, "if (VERSION.SDK_INT >= V…enBounds.y)\n            }");
            C6.o oVarA = C6.v.a(Integer.valueOf(a(S6.c.d((rect.height() / context.getResources().getDisplayMetrics().density) * sessionReplay.h().sizeScale))), Integer.valueOf(a(S6.c.d((rect.width() / context.getResources().getDisplayMetrics().density) * sessionReplay.h().sizeScale))));
            int iIntValue = ((Number) oVarA.a()).intValue();
            int iIntValue2 = ((Number) oVarA.b()).intValue();
            return new u(iIntValue2, iIntValue, iIntValue2 / rect.width(), iIntValue / rect.height(), sessionReplay.d(), sessionReplay.h().bitRate);
        }

        public a() {
        }
    }

    public u(int i8, int i9, float f8, float f9, int i10, int i11) {
        this.f26874a = i8;
        this.f26875b = i9;
        this.f26876c = f8;
        this.f26877d = f9;
        this.f26878e = i10;
        this.f26879f = i11;
    }

    public final int a() {
        return this.f26879f;
    }

    public final int b() {
        return this.f26878e;
    }

    public final int c() {
        return this.f26875b;
    }

    public final int d() {
        return this.f26874a;
    }

    public final float e() {
        return this.f26876c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f26874a == uVar.f26874a && this.f26875b == uVar.f26875b && Float.compare(this.f26876c, uVar.f26876c) == 0 && Float.compare(this.f26877d, uVar.f26877d) == 0 && this.f26878e == uVar.f26878e && this.f26879f == uVar.f26879f;
    }

    public final float f() {
        return this.f26877d;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f26874a) * 31) + Integer.hashCode(this.f26875b)) * 31) + Float.hashCode(this.f26876c)) * 31) + Float.hashCode(this.f26877d)) * 31) + Integer.hashCode(this.f26878e)) * 31) + Integer.hashCode(this.f26879f);
    }

    public String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.f26874a + ", recordingHeight=" + this.f26875b + ", scaleFactorX=" + this.f26876c + ", scaleFactorY=" + this.f26877d + ", frameRate=" + this.f26878e + ", bitRate=" + this.f26879f + ')';
    }

    public u(float f8, float f9) {
        this(0, 0, f8, f9, 0, 0);
    }
}
