package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC1999c;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.gms.internal.play_billing.C2;
import com.google.android.gms.internal.play_billing.J2;
import java.util.concurrent.Callable;
import p138p3.I;
import p138p3.InterfaceC2765c;
import p138p3.V;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17460a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17461b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2765c f17462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f17463d;

    public /* synthetic */ h(b bVar, InterfaceC2765c interfaceC2765c, I i8) {
        this.f17463d = bVar;
        this.f17462c = interfaceC2765c;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0213  */
    /* JADX WARN: Code duplicated, block: B:129:0x023f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0244  */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x0213, please report this as an issue */
    public final /* synthetic */ Object a() {
        Bundle bundle;
        int i8;
        int i9;
        String strSubstring;
        int i10;
        synchronized (this.f17460a) {
            try {
                if (!this.f17461b) {
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                    }
                    int i11 = 3;
                    try {
                        String packageName = this.f17463d.f17358e.getPackageName();
                        i10 = 3;
                        int i12 = 22;
                        while (true) {
                            if (i12 < 3) {
                                i12 = 0;
                                break;
                            }
                            if (bundle == null) {
                                try {
                                    i10 = this.f17463d.f17360g.i(i12, packageName, "subs");
                                } catch (Exception e8) {
                                    e = e8;
                                    i11 = i10;
                                    B.k("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                    if (e instanceof DeadObjectException) {
                                        i9 = 101;
                                    } else if (e instanceof RemoteException) {
                                        i9 = 100;
                                    } else {
                                        if (e instanceof SecurityException) {
                                            i9 = 102;
                                        } else {
                                            i8 = 42;
                                        }
                                        if (i8 == 42) {
                                            strSubstring = e.getClass().getSimpleName() + ": " + AbstractC1999c.b(e.getMessage());
                                            if (strSubstring.length() > 70) {
                                                strSubstring = strSubstring.substring(0, 70);
                                            }
                                        } else {
                                            strSubstring = null;
                                        }
                                        this.f17463d.f17354a = 0;
                                        this.f17463d.f17360g = null;
                                        i10 = i11;
                                    }
                                    i8 = i9;
                                    if (i8 == 42) {
                                        strSubstring = e.getClass().getSimpleName() + ": " + AbstractC1999c.b(e.getMessage());
                                        if (strSubstring.length() > 70) {
                                            strSubstring = strSubstring.substring(0, 70);
                                        }
                                    } else {
                                        strSubstring = null;
                                    }
                                    this.f17463d.f17354a = 0;
                                    this.f17463d.f17360g = null;
                                    i10 = i11;
                                }
                            } else {
                                i10 = this.f17463d.f17360g.I(i12, packageName, "subs", bundle);
                            }
                            if (i10 == 0) {
                                B.i("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                break;
                            }
                            i12--;
                        }
                        boolean z8 = true;
                        this.f17463d.f17363j = i12 >= 5;
                        this.f17463d.f17362i = i12 >= 3;
                        if (i12 < 3) {
                            B.i("BillingClient", "In-app billing API does not support subscription on this device.");
                            i8 = 9;
                        } else {
                            i8 = 1;
                        }
                        for (int i13 = 22; i13 >= 3; i13--) {
                            i10 = bundle == null ? this.f17463d.f17360g.i(i13, packageName, "inapp") : this.f17463d.f17360g.I(i13, packageName, "inapp", bundle);
                            if (i10 == 0) {
                                this.f17463d.f17364k = i13;
                                B.i("BillingClient", "mHighestLevelSupportedForInApp: " + this.f17463d.f17364k);
                                break;
                            }
                        }
                        b bVar = this.f17463d;
                        bVar.f17378y = bVar.f17364k >= 22;
                        b bVar2 = this.f17463d;
                        bVar2.f17377x = bVar2.f17364k >= 21;
                        b bVar3 = this.f17463d;
                        bVar3.f17376w = bVar3.f17364k >= 20;
                        b bVar4 = this.f17463d;
                        bVar4.f17375v = bVar4.f17364k >= 19;
                        b bVar5 = this.f17463d;
                        bVar5.f17374u = bVar5.f17364k >= 18;
                        b bVar6 = this.f17463d;
                        bVar6.f17373t = bVar6.f17364k >= 17;
                        b bVar7 = this.f17463d;
                        bVar7.f17372s = bVar7.f17364k >= 16;
                        b bVar8 = this.f17463d;
                        bVar8.f17371r = bVar8.f17364k >= 15;
                        b bVar9 = this.f17463d;
                        bVar9.f17370q = bVar9.f17364k >= 14;
                        b bVar10 = this.f17463d;
                        bVar10.f17369p = bVar10.f17364k >= 12;
                        b bVar11 = this.f17463d;
                        bVar11.f17368o = bVar11.f17364k >= 10;
                        b bVar12 = this.f17463d;
                        bVar12.f17367n = bVar12.f17364k >= 9;
                        b bVar13 = this.f17463d;
                        bVar13.f17366m = bVar13.f17364k >= 8;
                        b bVar14 = this.f17463d;
                        if (bVar14.f17364k < 6) {
                            z8 = false;
                        }
                        bVar14.f17365l = z8;
                        if (this.f17463d.f17364k < 3) {
                            B.j("BillingClient", "In-app billing API version 3 is not supported on this device.");
                            i8 = 36;
                        }
                        if (i10 == 0) {
                            this.f17463d.f17354a = 2;
                            if (this.f17463d.f17357d != null) {
                                this.f17463d.f17357d.g(this.f17463d.f17377x);
                            }
                        } else {
                            this.f17463d.f17354a = 0;
                            this.f17463d.f17360g = null;
                        }
                        strSubstring = null;
                    } catch (Exception e9) {
                        e = e9;
                    }
                    if (i10 == 0) {
                        this.f17463d.Y(V.c(6));
                        d(j.f17484l);
                    } else {
                        b bVar15 = this.f17463d;
                        d dVar = j.f17473a;
                        bVar15.X(V.b(i8, 6, dVar, strSubstring));
                        d(dVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public final /* synthetic */ void b() {
        this.f17463d.f17354a = 0;
        this.f17463d.f17360g = null;
        d dVar = j.f17486n;
        this.f17463d.X(V.a(24, 6, dVar));
        d(dVar);
    }

    public final void c() {
        synchronized (this.f17460a) {
            this.f17462c = null;
            this.f17461b = true;
        }
    }

    public final void d(d dVar) {
        synchronized (this.f17460a) {
            try {
                InterfaceC2765c interfaceC2765c = this.f17462c;
                if (interfaceC2765c != null) {
                    interfaceC2765c.onBillingSetupFinished(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        B.i("BillingClient", "Billing service connected.");
        this.f17463d.f17360g = J2.c(iBinder);
        Callable callable = new Callable() { // from class: p3.F
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f31175a.a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: p3.H
            @Override // java.lang.Runnable
            public final void run() {
                this.f31176a.b();
            }
        };
        b bVar = this.f17463d;
        if (bVar.W(callable, 30000L, runnable, bVar.R()) == null) {
            b bVar2 = this.f17463d;
            d dVarT = bVar2.T();
            bVar2.X(V.a(25, 6, dVarT));
            d(dVarT);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        B.j("BillingClient", "Billing service disconnected.");
        this.f17463d.f17359f.a(C2.C());
        this.f17463d.f17360g = null;
        this.f17463d.f17354a = 0;
        synchronized (this.f17460a) {
            try {
                InterfaceC2765c interfaceC2765c = this.f17462c;
                if (interfaceC2765c != null) {
                    interfaceC2765c.onBillingServiceDisconnected();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
