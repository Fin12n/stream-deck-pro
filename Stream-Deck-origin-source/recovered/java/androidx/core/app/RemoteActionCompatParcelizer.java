package androidx.core.app;

import G2.a;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f15046a = (IconCompat) aVar.v(remoteActionCompat.f15046a, 1);
        remoteActionCompat.f15047b = aVar.l(remoteActionCompat.f15047b, 2);
        remoteActionCompat.f15048c = aVar.l(remoteActionCompat.f15048c, 3);
        remoteActionCompat.f15049d = (PendingIntent) aVar.r(remoteActionCompat.f15049d, 4);
        remoteActionCompat.f15050e = aVar.h(remoteActionCompat.f15050e, 5);
        remoteActionCompat.f15051f = aVar.h(remoteActionCompat.f15051f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f15046a, 1);
        aVar.D(remoteActionCompat.f15047b, 2);
        aVar.D(remoteActionCompat.f15048c, 3);
        aVar.H(remoteActionCompat.f15049d, 4);
        aVar.z(remoteActionCompat.f15050e, 5);
        aVar.z(remoteActionCompat.f15051f, 6);
    }
}
