package p154r3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final void a(Context context, String url) {
        t.g(context, "<this>");
        t.g(url, "url");
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
    }
}
