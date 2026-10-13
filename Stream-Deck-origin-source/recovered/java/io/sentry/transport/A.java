package io.sentry.transport;

import com.revenuecat.purchases.common.Constants;
import io.sentry.C2550q2;
import io.sentry.EnumC2515k;
import io.sentry.EnumC2596z2;
import io.sentry.H;
import io.sentry.InterfaceC2480b0;
import io.sentry.J2;
import io.sentry.W1;
import io.sentry.util.C2569a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f27648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f27649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f27650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f27651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Timer f27652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2569a f27653f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            A.this.r0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void t(A a8);
    }

    public A(p pVar, J2 j8) {
        this.f27650c = new ConcurrentHashMap();
        this.f27651d = new CopyOnWriteArrayList();
        this.f27652e = null;
        this.f27653f = new C2569a();
        this.f27648a = pVar;
        this.f27649b = j8;
    }

    public static /* synthetic */ void j(A a8, io.sentry.hints.f fVar) {
        a8.getClass();
        fVar.b();
        a8.f27649b.getLogger().c(EnumC2596z2.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
    }

    public boolean A(EnumC2515k enumC2515k) {
        Date date;
        Date date2 = new Date(this.f27648a.getCurrentTimeMillis());
        Date date3 = (Date) this.f27650c.get(EnumC2515k.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC2515k.Unknown.equals(enumC2515k) || (date = (Date) this.f27650c.get(enumC2515k)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public void A0(b bVar) {
        this.f27651d.remove(bVar);
    }

    public void H0(String str, String str2, int i8) {
        if (str == null) {
            if (i8 == 429) {
                v(EnumC2515k.All, new Date(this.f27648a.getCurrentTimeMillis() + w0(str2)));
                return;
            }
            return;
        }
        for (String str3 : str.split(com.amazon.a.a.o.b.f.f16777a, -1)) {
            String[] strArrSplit = str3.replace(" ", "").split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1);
            if (strArrSplit.length > 0) {
                long jW0 = w0(strArrSplit[0]);
                if (strArrSplit.length > 1) {
                    String str4 = strArrSplit[1];
                    Date date = new Date(this.f27648a.getCurrentTimeMillis() + jW0);
                    if (str4 == null || str4.isEmpty()) {
                        v(EnumC2515k.All, date);
                    } else {
                        for (String str5 : str4.split(";", -1)) {
                            EnumC2515k enumC2515kValueOf = EnumC2515k.Unknown;
                            try {
                                String strB = io.sentry.util.B.b(str5);
                                if (strB != null) {
                                    enumC2515kValueOf = EnumC2515k.valueOf(strB);
                                } else {
                                    this.f27649b.getLogger().c(EnumC2596z2.ERROR, "Couldn't capitalize: %s", str5);
                                }
                            } catch (IllegalArgumentException e8) {
                                this.f27649b.getLogger().a(EnumC2596z2.INFO, e8, "Unknown category: %s", str5);
                            }
                            if (!EnumC2515k.Unknown.equals(enumC2515kValueOf)) {
                                v(enumC2515kValueOf, date);
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean Y() {
        Date date = new Date(this.f27648a.getCurrentTimeMillis());
        Iterator it = this.f27650c.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = (Date) this.f27650c.get((EnumC2515k) it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27653f.a();
        try {
            Timer timer = this.f27652e;
            if (timer != null) {
                timer.cancel();
                this.f27652e = null;
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            this.f27651d.clear();
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final boolean i0(String str) {
        return A(z(str));
    }

    public final void j0(H h8, final boolean z8) {
        io.sentry.util.m.k(h8, io.sentry.hints.p.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.x
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.p) obj).b(false);
            }
        });
        io.sentry.util.m.k(h8, io.sentry.hints.k.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.y
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.k) obj).c(z8);
            }
        });
        io.sentry.util.m.k(h8, io.sentry.hints.f.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.z
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                A.j(this.f27702a, (io.sentry.hints.f) obj);
            }
        });
    }

    public final void r0() {
        Iterator it = this.f27651d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).t(this);
        }
    }

    public void t(b bVar) {
        this.f27651d.add(bVar);
    }

    public final void v(EnumC2515k enumC2515k, Date date) {
        Date date2 = (Date) this.f27650c.get(enumC2515k);
        if (date2 == null || date.after(date2)) {
            this.f27650c.put(enumC2515k, date);
            r0();
            InterfaceC2480b0 interfaceC2480b0A = this.f27653f.a();
            try {
                if (this.f27652e == null) {
                    this.f27652e = new Timer(true);
                }
                this.f27652e.schedule(new a(), date);
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
            } catch (Throwable th) {
                if (interfaceC2480b0A != null) {
                    try {
                        interfaceC2480b0A.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public final long w0(String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            return 60000L;
        }
    }

    public W1 y(W1 w8, H h8) {
        ArrayList arrayList = null;
        for (C2550q2 c2550q2 : w8.c()) {
            if (i0(c2550q2.B().b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c2550q2);
                this.f27649b.getClientReportRecorder().e(io.sentry.clientreport.f.RATELIMIT_BACKOFF, c2550q2);
            }
        }
        if (arrayList == null) {
            return w8;
        }
        this.f27649b.getLogger().c(EnumC2596z2.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (C2550q2 c2550q3 : w8.c()) {
            if (!arrayList.contains(c2550q3)) {
                arrayList2.add(c2550q3);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new W1(w8.b(), arrayList2);
        }
        this.f27649b.getLogger().c(EnumC2596z2.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
        j0(h8, false);
        return null;
    }

    public final EnumC2515k z(String str) {
        str.getClass();
        switch (str) {
            case "attachment":
                return EnumC2515k.Attachment;
            case "replay_video":
                return EnumC2515k.Replay;
            case "profile":
                return EnumC2515k.Profile;
            case "event":
                return EnumC2515k.Error;
            case "check_in":
                return EnumC2515k.Monitor;
            case "session":
                return EnumC2515k.Session;
            case "transaction":
                return EnumC2515k.Transaction;
            default:
                return EnumC2515k.Unknown;
        }
    }

    public A(J2 j8) {
        this(n.a(), j8);
    }
}
