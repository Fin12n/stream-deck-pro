package p219z4;

import A4.a;
import A4.c;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class I extends a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f39095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f39097d;

    public I(int i8, Account account, int i9, GoogleSignInAccount googleSignInAccount) {
        this.f39094a = i8;
        this.f39095b = account;
        this.f39096c = i9;
        this.f39097d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f39094a;
        int iA = c.a(parcel);
        c.j(parcel, 1, i9);
        c.m(parcel, 2, this.f39095b, i8, false);
        c.j(parcel, 3, this.f39096c);
        c.m(parcel, 4, this.f39097d, i8, false);
        c.b(parcel, iA);
    }

    public I(Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i8, googleSignInAccount);
    }
}
