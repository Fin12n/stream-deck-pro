package p195w4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37080a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f37081b = new LinkedBlockingQueue();

    public IBinder a(long j8, TimeUnit timeUnit) throws TimeoutException {
        AbstractC3207p.j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f37080a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f37080a = true;
        IBinder iBinder = (IBinder) this.f37081b.poll(j8, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f37081b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
