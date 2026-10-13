package p195w4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import p111m2.DialogInterfaceOnCancelListenerC2680e;
import p111m2.y;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class m extends DialogInterfaceOnCancelListenerC2680e {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Dialog f37108E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f37109F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public Dialog f37110G0;

    public static m O1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        Dialog dialog2 = (Dialog) AbstractC3207p.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        mVar.f37108E0 = dialog2;
        if (onCancelListener != null) {
            mVar.f37109F0 = onCancelListener;
        }
        return mVar;
    }

    @Override // p111m2.DialogInterfaceOnCancelListenerC2680e
    public Dialog H1(Bundle bundle) {
        Dialog dialog = this.f37108E0;
        if (dialog != null) {
            return dialog;
        }
        L1(false);
        if (this.f37110G0 == null) {
            this.f37110G0 = new AlertDialog.Builder((Context) AbstractC3207p.k(t())).create();
        }
        return this.f37110G0;
    }

    @Override // p111m2.DialogInterfaceOnCancelListenerC2680e
    public void N1(y yVar, String str) {
        super.N1(yVar, str);
    }

    @Override // p111m2.DialogInterfaceOnCancelListenerC2680e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f37109F0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
