package p219z4;

import A4.a;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p043e6.dT.GIGvBf;
import p195w4.d;

/* JADX INFO: renamed from: z4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C3197f extends a {
    public static final Parcelable.Creator<C3197f> CREATOR = new d0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Scope[] f39185o = new Scope[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d[] f39186p = new d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f39191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Scope[] f39192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f39193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Account f39194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d[] f39195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d[] f39196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f39197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f39198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f39199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f39200n;

    public final String a() {
        return this.f39200n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        d0.a(this, parcel, i8);
    }

    public C3197f(int i8, int i9, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z8, int i11, boolean z9, String str2) {
        Account accountD;
        scopeArr = scopeArr == null ? f39185o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? f39186p : dVarArr;
        dVarArr2 = dVarArr2 == null ? f39186p : dVarArr2;
        this.f39187a = i8;
        this.f39188b = i9;
        this.f39189c = i10;
        String str3 = GIGvBf.VdnyeAfAI;
        if (str3.equals(str)) {
            this.f39190d = str3;
        } else {
            this.f39190d = str;
        }
        if (i8 < 2) {
            if (iBinder != null) {
                accountD = AbstractBinderC3192a.d(InterfaceC3201j.a.c(iBinder));
            } else {
                accountD = null;
            }
            this.f39194h = accountD;
        } else {
            this.f39191e = iBinder;
            this.f39194h = account;
        }
        this.f39192f = scopeArr;
        this.f39193g = bundle;
        this.f39195i = dVarArr;
        this.f39196j = dVarArr2;
        this.f39197k = z8;
        this.f39198l = i11;
        this.f39199m = z9;
        this.f39200n = str2;
    }
}
