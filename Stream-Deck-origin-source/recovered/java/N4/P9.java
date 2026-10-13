package N4;

import S4.InterfaceC1635f;
import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p219z4.AbstractC3210t;
import p219z4.C3205n;
import p219z4.C3209s;
import p219z4.C3212v;
import p219z4.InterfaceC3211u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class P9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3211u f6532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f6533b = new AtomicLong(-1);

    public P9(Context context, String str) {
        this.f6532a = AbstractC3210t.b(context, C3212v.a().b("mlkit:vision").a());
    }

    public static P9 a(Context context) {
        return new P9(context, "mlkit:vision");
    }

    public final /* synthetic */ void b(long j8, Exception exc) {
        this.f6533b.set(j8);
    }

    public final synchronized void c(int i8, int i9, long j8, long j9) {
        AtomicLong atomicLong = this.f6533b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f6533b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f6532a.c(new C3209s(0, Arrays.asList(new C3205n(i8, i9, 0, j8, j9, null, null, 0, -1)))).d(new InterfaceC1635f() { // from class: N4.O9
            @Override // S4.InterfaceC1635f
            public final void d(Exception exc) {
                this.f6522a.b(jElapsedRealtime, exc);
            }
        });
    }
}
