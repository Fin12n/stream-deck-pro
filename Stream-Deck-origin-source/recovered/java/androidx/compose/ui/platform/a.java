package androidx.compose.ui.platform;

import kotlin.jvm.internal.t;
import p065h1.InterfaceC2380b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements InterfaceC2380b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f14890b = new int[2];

    public final int[] c(int i8, int i9) {
        if (i8 < 0 || i9 < 0 || i8 == i9) {
            return null;
        }
        int[] iArr = this.f14890b;
        iArr[0] = i8;
        iArr[1] = i9;
        return iArr;
    }

    public final String d() {
        String str = this.f14889a;
        if (str != null) {
            return str;
        }
        t.t("text");
        return null;
    }

    public void e(String str) {
        f(str);
    }

    public final void f(String str) {
        this.f14889a = str;
    }
}
