package io.sentry.clientreport;

import io.sentry.AbstractC2519l;
import io.sentry.C2550q2;
import io.sentry.EnumC2515k;
import io.sentry.EnumC2592y2;
import io.sentry.EnumC2596z2;
import io.sentry.J2;
import io.sentry.W1;
import io.sentry.protocol.B;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f27052a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f27053b;

    public e(J2 j8) {
        this.f27053b = j8;
    }

    @Override // io.sentry.clientreport.h
    public void a(f fVar, EnumC2515k enumC2515k) {
        c(fVar, enumC2515k, 1L);
    }

    @Override // io.sentry.clientreport.h
    public void b(f fVar, W1 w8) {
        if (w8 == null) {
            return;
        }
        try {
            Iterator it = w8.c().iterator();
            while (it.hasNext()) {
                e(fVar, (C2550q2) it.next());
            }
        } catch (Throwable th) {
            this.f27053b.getLogger().a(EnumC2596z2.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void c(f fVar, EnumC2515k enumC2515k, long j8) {
        try {
            g(fVar.getReason(), enumC2515k.getCategory(), Long.valueOf(j8));
        } catch (Throwable th) {
            this.f27053b.getLogger().a(EnumC2596z2.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public W1 d(W1 w8) {
        c cVarH = h();
        if (cVarH == null) {
            return w8;
        }
        try {
            this.f27053b.getLogger().c(EnumC2596z2.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator it = w8.c().iterator();
            while (it.hasNext()) {
                arrayList.add((C2550q2) it.next());
            }
            arrayList.add(C2550q2.u(this.f27053b.getSerializer(), cVarH));
            return new W1(w8.b(), arrayList);
        } catch (Throwable th) {
            this.f27053b.getLogger().a(EnumC2596z2.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return w8;
        }
    }

    @Override // io.sentry.clientreport.h
    public void e(f fVar, C2550q2 c2550q2) {
        B bC;
        if (c2550q2 == null) {
            return;
        }
        try {
            EnumC2592y2 enumC2592y2B = c2550q2.B().b();
            if (EnumC2592y2.ClientReport.equals(enumC2592y2B)) {
                try {
                    i(c2550q2.z(this.f27053b.getSerializer()));
                } catch (Exception unused) {
                    this.f27053b.getLogger().c(EnumC2596z2.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                EnumC2515k enumC2515kF = f(enumC2592y2B);
                if (enumC2515kF.equals(EnumC2515k.Transaction) && (bC = c2550q2.C(this.f27053b.getSerializer())) != null) {
                    g(fVar.getReason(), EnumC2515k.Span.getCategory(), Long.valueOf(((long) bC.o0().size()) + 1));
                }
                g(fVar.getReason(), enumC2515kF.getCategory(), 1L);
            }
        } catch (Throwable th) {
            this.f27053b.getLogger().a(EnumC2596z2.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    public final EnumC2515k f(EnumC2592y2 enumC2592y2) {
        if (EnumC2592y2.Event.equals(enumC2592y2)) {
            return EnumC2515k.Error;
        }
        if (EnumC2592y2.Session.equals(enumC2592y2)) {
            return EnumC2515k.Session;
        }
        if (EnumC2592y2.Transaction.equals(enumC2592y2)) {
            return EnumC2515k.Transaction;
        }
        if (EnumC2592y2.UserFeedback.equals(enumC2592y2)) {
            return EnumC2515k.UserReport;
        }
        if (EnumC2592y2.Profile.equals(enumC2592y2)) {
            return EnumC2515k.Profile;
        }
        if (EnumC2592y2.Attachment.equals(enumC2592y2)) {
            return EnumC2515k.Attachment;
        }
        if (EnumC2592y2.CheckIn.equals(enumC2592y2)) {
            return EnumC2515k.Monitor;
        }
        return EnumC2592y2.ReplayVideo.equals(enumC2592y2) ? EnumC2515k.Replay : EnumC2515k.Default;
    }

    public final void g(String str, String str2, Long l8) {
        this.f27052a.b(new d(str, str2), l8);
    }

    public c h() {
        Date dateC = AbstractC2519l.c();
        List listA = this.f27052a.a();
        if (listA.isEmpty()) {
            return null;
        }
        return new c(dateC, listA);
    }

    public final void i(c cVar) {
        if (cVar == null) {
            return;
        }
        for (g gVar : cVar.a()) {
            g(gVar.c(), gVar.a(), gVar.b());
        }
    }
}
