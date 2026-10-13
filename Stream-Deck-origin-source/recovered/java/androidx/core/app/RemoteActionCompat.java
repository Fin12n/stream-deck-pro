package androidx.core.app;

import G2.c;
import T1.f;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompat implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IconCompat f15046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f15047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f15048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PendingIntent f15049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15051f;

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        this.f15046a = (IconCompat) f.g(iconCompat);
        this.f15047b = (CharSequence) f.g(charSequence);
        this.f15048c = (CharSequence) f.g(charSequence2);
        this.f15049d = (PendingIntent) f.g(pendingIntent);
        this.f15050e = true;
        this.f15051f = true;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat) {
        f.g(remoteActionCompat);
        this.f15046a = remoteActionCompat.f15046a;
        this.f15047b = remoteActionCompat.f15047b;
        this.f15048c = remoteActionCompat.f15048c;
        this.f15049d = remoteActionCompat.f15049d;
        this.f15050e = remoteActionCompat.f15050e;
        this.f15051f = remoteActionCompat.f15051f;
    }
}
