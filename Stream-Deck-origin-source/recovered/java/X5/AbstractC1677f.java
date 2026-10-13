package X5;

import R0.pkXL.Oitvkwcwn;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X5.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1677f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f11843a = D6.r.q("***, dd MMM YYYY hh:mm:ss zzz", "****, dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d hh:mm:ss YYYY", "***, dd-MMM-YYYY hh:mm:ss zzz", "***, dd-MMM-YYYY hh-mm-ss zzz", "***, dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh:mm:ss zzz", "*** dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh-mm-ss zzz", "***,dd-MMM-YYYY hh:mm:ss zzz", Oitvkwcwn.uXKreMtutXAuyQ);

    public static final p141p6.c a(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        String string = Z6.w.W0(str).toString();
        Iterator it = f11843a.iterator();
        while (it.hasNext()) {
            try {
                return new p141p6.e((String) it.next()).b(str);
            } catch (p141p6.f unused) {
            }
        }
        throw new IllegalStateException(("Failed to parse date: " + string).toString());
    }
}
