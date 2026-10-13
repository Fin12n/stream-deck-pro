package p195w4;

import F4.g;
import H1.j;
import K4.f;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import p111m2.ActivityC2686k;
import p187v4.a;
import p187v4.b;
import p211y4.H;
import p211y4.I;
import p211y4.InterfaceC3106g;
import p219z4.A;
import p219z4.AbstractC3207p;
import p219z4.D;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37096c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f37094e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f37095f = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f37093d = f.f37097a;

    public static e m() {
        return f37095f;
    }

    @Override // p195w4.f
    public Intent b(Context context, int i8, String str) {
        return super.b(context, i8, str);
    }

    @Override // p195w4.f
    public PendingIntent c(Context context, int i8, int i9) {
        return super.c(context, i8, i9);
    }

    @Override // p195w4.f
    public final String e(int i8) {
        return super.e(i8);
    }

    @Override // p195w4.f
    public int g(Context context) {
        return super.g(context);
    }

    @Override // p195w4.f
    public int h(Context context, int i8) {
        return super.h(context, i8);
    }

    @Override // p195w4.f
    public final boolean j(int i8) {
        return super.j(i8);
    }

    public Dialog k(Activity activity, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i8, D.b(activity, b(activity, i8, "d"), i9), onCancelListener, null);
    }

    public PendingIntent l(Context context, b bVar) {
        return bVar.d() ? bVar.c() : c(context, bVar.a(), 0);
    }

    public boolean n(Activity activity, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogK = k(activity, i8, i9, onCancelListener);
        if (dialogK == null) {
            return false;
        }
        s(activity, dialogK, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i8) {
        t(context, i8, null, d(context, i8, 0, "n"));
    }

    public final Dialog p(Context context, int i8, D d8, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i8 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(A.c(context, i8));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strB = A.b(context, i8);
        DialogInterface.OnClickListener onClickListener2 = d8;
        if (strB != null) {
            if (d8 == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strB, onClickListener2);
        }
        String strF = A.f(context, i8);
        if (strF != null) {
            builder2.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i8)), new IllegalArgumentException());
        return builder2.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(A.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        s(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final I r(Context context, H h8) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        I i8 = new I(h8);
        f.h(context, i8, intentFilter);
        i8.a(context);
        if (i(context, "com.google.android.gms")) {
            return i8;
        }
        h8.a();
        i8.b();
        return null;
    }

    public final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC2686k) {
                m.O1(dialog, onCancelListener).N1(((ActivityC2686k) activity).f0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void t(Context context, int i8, String str, PendingIntent pendingIntent) {
        int i9;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i8), null), new IllegalArgumentException());
        if (i8 == 18) {
            u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i8 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = A.e(context, i8);
        String strD = A.d(context, i8);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC3207p.k(context.getSystemService("notification"));
        j.i iVarU = new j.i(context).F(true).l(true).w(strE).U(new j.g().o(strD));
        if (F4.e.b(context)) {
            AbstractC3207p.m(g.c());
            iVarU.Q(context.getApplicationInfo().icon).K(2);
            if (F4.e.c(context)) {
                iVarU.a(a.f35109a, resources.getString(b.f35124o), pendingIntent);
            } else {
                iVarU.u(pendingIntent);
            }
        } else {
            iVarU.Q(R.drawable.stat_sys_warning).W(resources.getString(b.f35117h)).b0(System.currentTimeMillis()).u(pendingIntent).v(strD);
        }
        if (g.f()) {
            AbstractC3207p.m(g.f());
            synchronized (f37094e) {
                str2 = this.f37096c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(b.f35116g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            iVarU.p(str2);
        }
        Notification notificationG = iVarU.g();
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            j.f37103b.set(false);
            i9 = 10436;
        } else {
            i9 = 39789;
        }
        notificationManager.notify(i9, notificationG);
    }

    public final void u(Context context) {
        new o(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, InterfaceC3106g interfaceC3106g, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogP = p(activity, i8, D.c(interfaceC3106g, b(activity, i8, "d"), 2), onCancelListener, null);
        if (dialogP == null) {
            return false;
        }
        s(activity, dialogP, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, b bVar, int i8) {
        PendingIntent pendingIntentL;
        if (G4.a.a(context) || (pendingIntentL = l(context, bVar)) == null) {
            return false;
        }
        t(context, bVar.a(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentL, i8, true), K4.g.f4637a | 134217728));
        return true;
    }
}
