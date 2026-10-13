package io.sentry.android.replay;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f26945a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C6.j f26946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C6.j f26947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C6.j f26948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26949e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26950a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Field invoke() throws NoSuchFieldException {
            Class clsC = w.f26945a.c();
            if (clsC == null) {
                return null;
            }
            Field declaredField = clsC.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26951a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Class invoke() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable th) {
                Log.w("WindowManagerSpy", th);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26952a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Method method;
            Class clsC = w.f26945a.c();
            if (clsC == null || (method = clsC.getMethod("getInstance", null)) == null) {
                return null;
            }
            return method.invoke(null, null);
        }
    }

    static {
        C6.l lVar = C6.l.NONE;
        f26946b = C6.k.a(lVar, b.f26951a);
        f26947c = C6.k.a(lVar, c.f26952a);
        f26948d = C6.k.a(lVar, a.f26950a);
        f26949e = 8;
    }

    public final Field b() {
        return (Field) f26948d.getValue();
    }

    public final Class c() {
        return (Class) f26946b.getValue();
    }

    public final Object d() {
        return f26947c.getValue();
    }

    public final void e(Q6.k swap) {
        Field fieldB;
        kotlin.jvm.internal.t.g(swap, "swap");
        try {
            Object objD = d();
            if (objD == null || (fieldB = f26945a.b()) == null) {
                return;
            }
            Object obj = fieldB.get(objD);
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            fieldB.set(objD, swap.invoke((ArrayList) obj));
        } catch (Throwable th) {
            Log.w("WindowManagerSpy", th);
        }
    }
}
