package A1;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final d a(Context context) {
        B1.a aVarB;
        float f8 = context.getResources().getConfiguration().fontScale;
        if (m.a() || (aVarB = B1.b.f907a.b(f8)) == null) {
            aVarB = new u(f8);
        }
        return new g(context.getResources().getDisplayMetrics().density, f8, aVarB);
    }
}
