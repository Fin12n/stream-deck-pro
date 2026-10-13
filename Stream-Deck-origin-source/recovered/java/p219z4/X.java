package p219z4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class X implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3194c f39118b;

    public X(AbstractC3194c abstractC3194c, int i8) {
        this.f39118b = abstractC3194c;
        this.f39117a = i8;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC3194c abstractC3194c = this.f39118b;
        if (iBinder == null) {
            AbstractC3194c.b0(abstractC3194c, 16);
            return;
        }
        synchronized (abstractC3194c.f39144n) {
            try {
                AbstractC3194c abstractC3194c2 = this.f39118b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC3194c2.f39145o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3203l)) ? new P(iBinder) : (InterfaceC3203l) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f39118b.c0(0, null, this.f39117a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f39118b.f39144n) {
            this.f39118b.f39145o = null;
        }
        AbstractC3194c abstractC3194c = this.f39118b;
        int i8 = this.f39117a;
        Handler handler = abstractC3194c.f39142l;
        handler.sendMessage(handler.obtainMessage(6, i8, 1));
    }
}
