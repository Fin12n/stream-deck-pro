package p045f;

import I1.a;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    @Override // p045f.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String input) {
        t.g(context, "context");
        t.g(input, "input");
        return d.f21235a.a(new String[]{input});
    }

    @Override // p045f.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a.C0498a b(Context context, String input) {
        t.g(context, "context");
        t.g(input, "input");
        if (a.a(context, input) == 0) {
            return new a.C0498a(Boolean.TRUE);
        }
        return null;
    }

    @Override // p045f.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean c(int i8, Intent intent) {
        if (intent == null || i8 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z8 = false;
        if (intArrayExtra != null) {
            for (int i9 : intArrayExtra) {
                if (i9 == 0) {
                    z8 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z8);
    }
}
