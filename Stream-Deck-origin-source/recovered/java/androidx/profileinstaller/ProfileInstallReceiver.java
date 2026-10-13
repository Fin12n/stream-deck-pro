package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements c.InterfaceC0382c {
        public a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0382c
        public void a(int i8, Object obj) {
            c.f15354b.a(i8, obj);
        }

        @Override // androidx.profileinstaller.c.InterfaceC0382c
        public void b(int i8, Object obj) {
            c.f15354b.b(i8, obj);
            ProfileInstallReceiver.this.setResultCode(i8);
        }
    }

    public static void a(c.InterfaceC0382c interfaceC0382c) {
        Process.sendSignal(Process.myPid(), 10);
        interfaceC0382c.b(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        VMRunner.invoke("YE5qoMYTxaQEnnqI", new Object[]{this, context, intent});
    }
}
