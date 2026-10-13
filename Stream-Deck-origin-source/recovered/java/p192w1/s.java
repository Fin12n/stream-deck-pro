package p192w1;

import android.text.style.URLSpan;
import java.util.WeakHashMap;
import p128o1.L;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f36755a = new WeakHashMap();

    public final URLSpan a(L l8) {
        WeakHashMap weakHashMap = this.f36755a;
        Object uRLSpan = weakHashMap.get(l8);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(l8.a());
            weakHashMap.put(l8, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }
}
