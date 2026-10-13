package L;

import A.AbstractC0890p0;
import H.AbstractC0994n0;
import H.C0980g0;
import H.c1;
import android.media.MediaCodec;
import android.util.Range;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4770a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public final boolean a(C0980g0.a aVar) {
        Set setL = aVar.l();
        t.f(setL, "getSurfaces(...)");
        Set<AbstractC0994n0> set = setL;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (AbstractC0994n0 abstractC0994n0 : set) {
            t.d(abstractC0994n0);
            if (d(abstractC0994n0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            AbstractC0994n0 abstractC0994n0F = ((c1.f) it.next()).f();
            t.f(abstractC0994n0F, "getSurface(...)");
            if (d(abstractC0994n0F)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Range range) {
        return ((Number) range.getUpper()).intValue() >= 120 && t.c(range.getLower(), range.getUpper());
    }

    public final boolean d(AbstractC0994n0 abstractC0994n0) {
        return t.c(abstractC0994n0.g(), MediaCodec.class);
    }

    public final void e(Collection outputConfigs, C0980g0.a repeatingConfigBuilder) {
        Range rangeK;
        t.g(outputConfigs, "outputConfigs");
        t.g(repeatingConfigBuilder, "repeatingConfigBuilder");
        if (outputConfigs.size() != 2 || !b(outputConfigs) || a(repeatingConfigBuilder) || (rangeK = repeatingConfigBuilder.k()) == null) {
            return;
        }
        if (!c(rangeK)) {
            rangeK = null;
        }
        if (rangeK != null) {
            repeatingConfigBuilder.o(f(rangeK));
        }
    }

    public final Range f(Range range) {
        Range range2 = new Range(30, range.getUpper());
        AbstractC0890p0.a("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
        return range2;
    }
}
