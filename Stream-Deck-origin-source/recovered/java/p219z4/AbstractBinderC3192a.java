package p219z4;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;

/* JADX INFO: renamed from: z4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3192a extends InterfaceC3201j.a {
    public static Account d(InterfaceC3201j interfaceC3201j) {
        if (interfaceC3201j == null) {
            return null;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return interfaceC3201j.zzb();
        } catch (RemoteException unused) {
            Log.w(cFAYKUlMj.OCEfdHuzv, "Remote account accessor probably died");
            return null;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }
}
