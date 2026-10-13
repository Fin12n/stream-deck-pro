package p195w4;

import K4.h;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f37112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f37113c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f37113c = eVar;
        this.f37112b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i8 = message.what;
        if (i8 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i8);
            return;
        }
        e eVar = this.f37113c;
        int iG = eVar.g(this.f37112b);
        if (eVar.j(iG)) {
            this.f37113c.o(this.f37112b, iG);
        }
    }
}
