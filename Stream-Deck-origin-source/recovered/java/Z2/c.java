package Z2;

import io.jentz.winter.js.HRHLwtyqJWz;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f12849a;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public c(m messageStringFormatter) {
        t.g(messageStringFormatter, "messageStringFormatter");
        this.f12849a = messageStringFormatter;
    }

    @Override // Z2.h
    public void b(p pVar, String message, String tag, Throwable th) {
        t.g(pVar, HRHLwtyqJWz.zQMowutCuuLZQd);
        t.g(message, "message");
        t.g(tag, "tag");
        System.out.println((Object) this.f12849a.c(pVar, q.a(tag), l.a(message)));
        if (th != null) {
            th.printStackTrace();
        }
    }

    public /* synthetic */ c(m mVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? d.f12850a : mVar);
    }
}
