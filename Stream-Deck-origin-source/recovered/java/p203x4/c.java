package p203x4;

import android.text.TextUtils;
import java.util.ArrayList;
import p010b0.C1748a;
import p195w4.b;
import p211y4.C3101b;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class c extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1748a f37383a;

    public c(C1748a c1748a) {
        this.f37383a = c1748a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z8 = true;
        for (C3101b c3101b : this.f37383a.keySet()) {
            b bVar = (b) AbstractC3207p.k((b) this.f37383a.get(c3101b));
            z8 &= !bVar.e();
            arrayList.add(c3101b.b() + ": " + String.valueOf(bVar));
        }
        StringBuilder sb = new StringBuilder();
        if (z8) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
