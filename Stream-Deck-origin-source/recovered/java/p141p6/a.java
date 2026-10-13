package p141p6;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f31321a = TimeZone.getTimeZone("GMT");

    public static final c a(int i8, int i9, int i10, int i11, g month, int i12) {
        t.g(month, "month");
        Calendar calendar = Calendar.getInstance(f31321a, Locale.ROOT);
        t.d(calendar);
        calendar.set(1, i12);
        calendar.set(2, month.ordinal());
        calendar.set(5, i11);
        calendar.set(11, i10);
        calendar.set(12, i9);
        calendar.set(13, i8);
        calendar.set(14, 0);
        return e(calendar, null);
    }

    public static final c b(Long l8) {
        Calendar calendar = Calendar.getInstance(f31321a, Locale.ROOT);
        t.d(calendar);
        return e(calendar, l8);
    }

    public static /* synthetic */ c c(Long l8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l8 = null;
        }
        return b(l8);
    }

    public static final long d() {
        return System.currentTimeMillis();
    }

    public static final c e(Calendar calendar, Long l8) {
        t.g(calendar, "<this>");
        if (l8 != null) {
            calendar.setTimeInMillis(l8.longValue());
        }
        int i8 = calendar.get(15) + calendar.get(16);
        return new c(calendar.get(13), calendar.get(12), calendar.get(11), h.f31356b.a((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), g.f31341b.a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + ((long) i8));
    }
}
