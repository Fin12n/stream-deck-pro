package p198x;

import H.Z0;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p166t.S1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureSessionOnClosedNotCalledQuirk f37146a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(S1 s8);
    }

    public h(Z0 z8) {
        this.f37146a = (CaptureSessionOnClosedNotCalledQuirk) z8.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    public final void a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            S1 s8 = (S1) it.next();
            s8.l().s(s8);
        }
    }

    public final void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            S1 s8 = (S1) it.next();
            s8.l().t(s8);
        }
    }

    public void c(S1 s8, List list, List list2, a aVar) {
        S1 s9;
        S1 s10;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext() && (s10 = (S1) it.next()) != s8) {
                linkedHashSet.add(s10);
            }
            b(linkedHashSet);
        }
        aVar.a(s8);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext() && (s9 = (S1) it2.next()) != s8) {
                linkedHashSet2.add(s9);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f37146a != null;
    }
}
