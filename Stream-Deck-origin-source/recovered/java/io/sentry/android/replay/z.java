package io.sentry.android.replay;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f26969a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C6.j f26970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C6.j f26971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f26972d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26973a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Class invoke() {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable th) {
                Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26974a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class clsB = z.f26969a.b();
            if (clsB == null) {
                return null;
            }
            try {
                Field declaredField = clsB.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e8) {
                Log.d("WindowSpy", "Unexpected exception retrieving " + clsB + "#mWindow on API " + Build.VERSION.SDK_INT, e8);
                return null;
            }
        }
    }

    static {
        C6.l lVar = C6.l.NONE;
        f26970b = C6.k.a(lVar, a.f26973a);
        f26971c = C6.k.a(lVar, b.f26974a);
        f26972d = 8;
    }

    public final Class b() {
        return (Class) f26970b.getValue();
    }

    public final Field c() {
        return (Field) f26971c.getValue();
    }

    public final Window d(View maybeDecorView) throws IllegalAccessException {
        Field fieldC;
        kotlin.jvm.internal.t.g(maybeDecorView, "maybeDecorView");
        Class clsB = b();
        if (clsB == null || !clsB.isInstance(maybeDecorView) || (fieldC = f26969a.c()) == null) {
            return null;
        }
        Object obj = fieldC.get(maybeDecorView);
        kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
