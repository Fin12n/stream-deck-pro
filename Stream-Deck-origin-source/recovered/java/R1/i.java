package R1;

import C6.j;
import C6.k;
import android.R;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9481a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f9482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f9483b;

        /* JADX INFO: renamed from: R1.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0262a extends u implements Function0 {
            public C0262a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ViewGroup invoke() {
                View viewInflate = View.inflate(a.this.b(), c.f9461a, null);
                if (viewInflate != null) {
                    return (ViewGroup) viewInflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }

        public a(Activity activity) {
            t.g(activity, "activity");
            this.f9482a = activity;
            this.f9483b = k.b(new C0262a());
        }

        public void a() {
            View rootView = ((ViewGroup) this.f9482a.findViewById(R.id.content)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView(c());
            }
        }

        public final Activity b() {
            return this.f9482a;
        }

        public final ViewGroup c() {
            return (ViewGroup) this.f9483b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SplashScreenView f9485c;

        @Override // R1.i.a
        public void a() {
        }

        public final void d(SplashScreenView splashScreenView) {
            t.g(splashScreenView, "<set-?>");
            this.f9485c = splashScreenView;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(activity);
            t.g(activity, cFAYKUlMj.HVgqcjBnq);
        }
    }

    public i(Activity ctx) {
        t.g(ctx, "ctx");
        a bVar = Build.VERSION.SDK_INT >= 31 ? new b(ctx) : new a(ctx);
        bVar.a();
        this.f9481a = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(SplashScreenView platformView, Activity ctx) {
        this(ctx);
        t.g(platformView, "platformView");
        t.g(ctx, "ctx");
        ((b) this.f9481a).d(platformView);
    }
}
