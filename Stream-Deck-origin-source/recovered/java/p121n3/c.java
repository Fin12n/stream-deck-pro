package p121n3;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import p004a3.AbstractC1699e;
import p004a3.M;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f30541a = new HashSet();

    @Override // p004a3.M
    public void a(String str, Throwable th) {
        if (AbstractC1699e.f13224a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // p004a3.M
    public void b(String str) {
        e(str, null);
    }

    @Override // p004a3.M
    public void c(String str, Throwable th) {
        Set set = f30541a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    @Override // p004a3.M
    public void d(String str) {
        c(str, null);
    }

    public void e(String str, Throwable th) {
        if (AbstractC1699e.f13224a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
