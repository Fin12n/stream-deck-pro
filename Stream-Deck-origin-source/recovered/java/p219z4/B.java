package p219z4;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f39085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f39086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39087c;

    public B(Intent intent, Activity activity, int i8) {
        this.f39085a = intent;
        this.f39086b = activity;
        this.f39087c = i8;
    }

    @Override // p219z4.D
    public final void a() {
        Intent intent = this.f39085a;
        if (intent != null) {
            this.f39086b.startActivityForResult(intent, this.f39087c);
        }
    }
}
