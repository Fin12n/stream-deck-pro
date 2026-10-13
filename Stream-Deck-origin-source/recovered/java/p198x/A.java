package p198x;

import A.AbstractC0890p0;
import H.Z0;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TorchFlashRequiredFor3aUpdateQuirk f37139a;

    public A(Z0 z8) {
        this.f37139a = (TorchFlashRequiredFor3aUpdateQuirk) z8.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public boolean a() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f37139a;
        boolean z8 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.g();
        AbstractC0890p0.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z8);
        return z8;
    }
}
