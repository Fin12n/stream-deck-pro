package p211y4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class I extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f38303b;

    public I(H h8) {
        this.f38303b = h8;
    }

    public final void a(Context context) {
        this.f38302a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f38302a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f38302a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("OwpwGd17u60mNMa9", new Object[]{this, context, intent});
    }
}
