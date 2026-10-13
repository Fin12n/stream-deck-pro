package G4;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f2763b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f2764a = null;

    public static b a(Context context) {
        return f2763b.b(context);
    }

    public final synchronized b b(Context context) {
        try {
            if (this.f2764a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f2764a = new b(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2764a;
    }
}
