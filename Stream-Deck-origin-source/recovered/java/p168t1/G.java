package p168t1;

import Q6.k;
import android.graphics.Typeface;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f34003a = L.a();

    public U a(S s8, H h8, k kVar, k kVar2) {
        Typeface typefaceA;
        AbstractC3009n abstractC3009nC = s8.c();
        if (abstractC3009nC == null ? true : abstractC3009nC instanceof C3004i) {
            typefaceA = this.f34003a.b(s8.f(), s8.d());
        } else {
            if (!(abstractC3009nC instanceof E)) {
                if (!(abstractC3009nC instanceof F)) {
                    return null;
                }
                ((F) s8.c()).s();
                t.e(null, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
                s8.f();
                s8.d();
                s8.e();
                throw null;
            }
            typefaceA = this.f34003a.a((E) s8.c(), s8.f(), s8.d());
        }
        return new U.b(typefaceA, false, 2, null);
    }
}
