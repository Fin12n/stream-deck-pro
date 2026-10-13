package V4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends a implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // V4.f
    public final void E(String str, Bundle bundle, h hVar) {
        Parcel parcelP = P();
        parcelP.writeString(str);
        c.c(parcelP, bundle);
        c.d(parcelP, hVar);
        Q(2, parcelP);
    }
}
