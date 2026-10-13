package I2;

import android.util.Log;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3729a = new a();

    @Override // I2.g
    public void a(String tag, String message) {
        t.g(tag, "tag");
        t.g(message, "message");
        Log.d(tag, message);
    }
}
