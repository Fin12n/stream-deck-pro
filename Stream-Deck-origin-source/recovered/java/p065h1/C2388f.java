package p065h1;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.t;
import p128o1.C2739d;

/* JADX INFO: renamed from: h1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2388f implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f24282a;

    public C2388f(ClipboardManager clipboardManager) {
        this.f24282a = clipboardManager;
    }

    @Override // p065h1.U
    public boolean a() {
        ClipDescription primaryClipDescription = this.f24282a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // p065h1.U
    public void b(C2739d c2739d) {
        this.f24282a.setPrimaryClip(ClipData.newPlainText("plain text", AbstractC2390g.b(c2739d)));
    }

    @Override // p065h1.U
    public C2739d getText() {
        ClipData primaryClip = this.f24282a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return AbstractC2390g.a(itemAt != null ? itemAt.getText() : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2388f(Context context) {
        Object systemService = context.getSystemService("clipboard");
        t.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
