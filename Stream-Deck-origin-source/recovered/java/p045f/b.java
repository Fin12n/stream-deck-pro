package p045f;

import D6.r;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b extends p045f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21230a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final List a(Intent intent) {
            t.g(intent, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return r.n();
            }
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i8 = 0; i8 < itemCount; i8++) {
                    Uri uri = clipData.getItemAt(i8).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }

        public a() {
        }
    }

    @Override // p045f.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String input) {
        t.g(context, "context");
        t.g(input, "input");
        Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        t.f(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
        return intentPutExtra;
    }

    @Override // p045f.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final p045f.a.C0498a b(Context context, String input) {
        t.g(context, "context");
        t.g(input, "input");
        return null;
    }

    @Override // p045f.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final List c(int i8, Intent intent) {
        List listA;
        if (i8 != -1) {
            intent = null;
        }
        return (intent == null || (listA = f21230a.a(intent)) == null) ? r.n() : listA;
    }
}
