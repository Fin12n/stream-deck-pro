package p065h1;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import io.jentz.winter.js.HRHLwtyqJWz;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: h1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2386e implements InterfaceC2382c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24277b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24278c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f24279a;

    /* JADX INFO: renamed from: h1.e$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public C2386e(Context context) {
        Object systemService = context.getSystemService("accessibility");
        t.e(systemService, HRHLwtyqJWz.fXvJwJgpUs);
        this.f24279a = (AccessibilityManager) systemService;
    }
}
