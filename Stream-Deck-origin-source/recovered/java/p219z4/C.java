package p219z4;

import android.content.Intent;
import p211y4.InterfaceC3106g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f39088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3106g f39089b;

    public C(Intent intent, InterfaceC3106g interfaceC3106g, int i8) {
        this.f39088a = intent;
        this.f39089b = interfaceC3106g;
    }

    @Override // p219z4.D
    public final void a() {
        Intent intent = this.f39088a;
        if (intent != null) {
            this.f39089b.startActivityForResult(intent, 2);
        }
    }
}
