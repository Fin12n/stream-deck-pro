package p045f;

import C6.o;
import C6.v;
import D6.C0934n;
import D6.L;
import D6.M;
import D6.z;
import W6.n;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p045f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21235a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final Intent a(String[] input) {
            t.g(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            t.f(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        public a() {
        }
    }

    @Override // p045f.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        t.g(context, "context");
        t.g(input, "input");
        return f21235a.a(input);
    }

    @Override // p045f.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p045f.a.C0498a b(Context context, String[] input) {
        t.g(context, "context");
        t.g(input, "input");
        if (input.length == 0) {
            return new p045f.a.C0498a(M.g());
        }
        for (String str : input) {
            if (I1.a.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.d(L.d(input.length), 16));
        for (String str2 : input) {
            o oVarA = v.a(str2, Boolean.TRUE);
            linkedHashMap.put(oVarA.c(), oVarA.d());
        }
        return new p045f.a.C0498a(linkedHashMap);
    }

    @Override // p045f.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i8, Intent intent) {
        if (i8 != -1) {
            return M.g();
        }
        if (intent == null) {
            return M.g();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return M.g();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i9 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i9 == 0));
        }
        return M.t(z.X0(C0934n.L(stringArrayExtra), arrayList));
    }
}
