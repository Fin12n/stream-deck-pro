package p200x1;

import java.util.Locale;
import kotlin.jvm.internal.t;
import p184v1.d;
import p184v1.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Locale a(d dVar) {
        f fVarA = dVar.a();
        t.e(fVarA, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((p184v1.a) fVarA).b();
    }
}
