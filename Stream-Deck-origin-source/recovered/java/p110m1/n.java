package p110m1;

import L0.i;
import Q6.k;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicInteger f29551a = new AtomicInteger(0);

    public static final i a(i iVar, k kVar) {
        return iVar.j(new ClearAndSetSemanticsElement(kVar));
    }

    public static final int b() {
        return f29551a.addAndGet(1);
    }

    public static final i c(i iVar, boolean z8, k kVar) {
        return iVar.j(new AppendedSemanticsElement(z8, kVar));
    }

    public static /* synthetic */ i d(i iVar, boolean z8, k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return c(iVar, z8, kVar);
    }
}
