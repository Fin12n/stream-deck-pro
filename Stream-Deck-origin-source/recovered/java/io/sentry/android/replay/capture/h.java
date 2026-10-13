package io.sentry.android.replay.capture;

import C6.G;
import D6.r;
import D6.z;
import Q6.o;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import io.sentry.AbstractC2519l;
import io.sentry.C2491e;
import io.sentry.C2517k1;
import io.sentry.H;
import io.sentry.InterfaceC2549q1;
import io.sentry.J2;
import io.sentry.K2;
import io.sentry.V;
import io.sentry.X;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26766a = a.f26767a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f26767a = new a();

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0596a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Date f26768a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f26769b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0596a(Date date, List list) {
                super(1);
                this.f26768a = date;
                this.f26769b = list;
            }

            public final void b(io.sentry.rrweb.b event) {
                t.g(event, "event");
                if (event.e() >= this.f26768a.getTime()) {
                    this.f26769b.add(event);
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((io.sentry.rrweb.b) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return F6.a.a(Long.valueOf(((io.sentry.rrweb.b) obj).e()), Long.valueOf(((io.sentry.rrweb.b) obj2).e()));
            }
        }

        public static final void d(J crumbs, V scope) {
            t.g(crumbs, "$crumbs");
            t.g(scope, "scope");
            crumbs.f28779a = new ArrayList(scope.r());
        }

        public static /* synthetic */ void f(a aVar, Deque deque, long j8, Q6.k kVar, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                kVar = null;
            }
            aVar.e(deque, j8, kVar);
        }

        public final c b(J2 j8, File file, io.sentry.protocol.u uVar, Date date, int i8, int i9, int i10, int i11, int i12, long j9, K2.b bVar, String str, List list, Deque deque) {
            io.sentry.rrweb.b bVarA;
            Date dateD = AbstractC2519l.d(date.getTime() + j9);
            t.f(dateD, "getDateTime(segmentTimestamp.time + videoDuration)");
            K2 k8 = new K2();
            k8.V(uVar);
            k8.i0(uVar);
            k8.l0(i8);
            k8.m0(dateD);
            k8.j0(date);
            k8.k0(bVar);
            k8.r0(file);
            ArrayList arrayList = new ArrayList();
            io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
            gVar.f(date.getTime());
            gVar.l(i9);
            gVar.n(i10);
            arrayList.add(gVar);
            io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
            jVar.f(date.getTime());
            jVar.C(i8);
            jVar.w(j9);
            jVar.x(i11);
            jVar.D(file.length());
            jVar.y(i12);
            jVar.z(i9);
            jVar.G(i10);
            jVar.A(0);
            jVar.E(0);
            arrayList.add(jVar);
            LinkedList linkedList = new LinkedList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2491e c2491e = (C2491e) it.next();
                if (c2491e.w().getTime() + 100 >= date.getTime() && c2491e.w().getTime() < dateD.getTime() && (bVarA = j8.getReplayController().y().a(c2491e)) != null) {
                    arrayList.add(bVarA);
                    Object obj = null;
                    io.sentry.rrweb.a aVar = bVarA instanceof io.sentry.rrweb.a ? (io.sentry.rrweb.a) bVarA : null;
                    if (t.c(aVar != null ? aVar.n() : null, "navigation")) {
                        io.sentry.rrweb.a aVar2 = (io.sentry.rrweb.a) bVarA;
                        Map data = aVar2.o();
                        if (data != null) {
                            t.f(data, "data");
                            Object obj2 = data.get("to");
                            if (obj2 != null) {
                                obj = obj2;
                            }
                        }
                        if (obj instanceof String) {
                            Map mapO = aVar2.o();
                            t.d(mapO);
                            Object obj3 = mapO.get("to");
                            t.e(obj3, "null cannot be cast to non-null type kotlin.String");
                            linkedList.add((String) obj3);
                        }
                    }
                }
            }
            if (str != null && !t.c(z.k0(linkedList), str)) {
                linkedList.addFirst(str);
            }
            e(deque, dateD.getTime(), new C0596a(date, arrayList));
            if (i8 == 0) {
                arrayList.add(new io.sentry.rrweb.h(j8));
            }
            C2517k1 c2517k1 = new C2517k1();
            c2517k1.c(Integer.valueOf(i8));
            c2517k1.b(z.J0(arrayList, new b()));
            k8.q0(linkedList);
            return new c.a(k8, c2517k1);
        }

        public final c c(X x8, J2 options, long j8, Date currentSegmentTimestamp, io.sentry.protocol.u replayId, int i8, int i9, int i10, K2.b replayType, io.sentry.android.replay.h hVar, int i11, int i12, String str, List list, Deque events) {
            io.sentry.android.replay.b bVarZ;
            List list2;
            t.g(options, "options");
            t.g(currentSegmentTimestamp, "currentSegmentTimestamp");
            t.g(replayId, "replayId");
            t.g(replayType, "replayType");
            t.g(events, "events");
            if (hVar == null || (bVarZ = io.sentry.android.replay.h.z(hVar, Math.min(j8, 300000L), currentSegmentTimestamp.getTime(), i8, i9, i10, i11, i12, null, 128, null)) == null) {
                return c.b.f26772a;
            }
            File fileA = bVarZ.a();
            int iB = bVarZ.b();
            long jC = bVarZ.c();
            if (list == null) {
                final J j9 = new J();
                j9.f28779a = r.n();
                if (x8 != null) {
                    x8.u(new InterfaceC2549q1() { // from class: io.sentry.android.replay.capture.g
                        @Override // io.sentry.InterfaceC2549q1
                        public final void a(V v8) {
                            h.a.d(j9, v8);
                        }
                    });
                }
                list2 = (List) j9.f28779a;
            } else {
                list2 = list;
            }
            return b(options, fileA, replayId, currentSegmentTimestamp, i8, i9, i10, iB, i11, jC, replayType, str, list2, events);
        }

        public final void e(Deque events, long j8, Q6.k kVar) {
            t.g(events, "events");
            Iterator it = events.iterator();
            t.f(it, "events.iterator()");
            while (it.hasNext()) {
                io.sentry.rrweb.b event = (io.sentry.rrweb.b) it.next();
                if (event.e() < j8) {
                    if (kVar != null) {
                        t.f(event, "event");
                        kVar.invoke(event);
                    }
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public static /* synthetic */ void a(h hVar, io.sentry.android.replay.u uVar, int i8, io.sentry.protocol.u uVar2, K2.b bVar, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i9 & 2) != 0) {
                i8 = 0;
            }
            if ((i9 & 4) != 0) {
                uVar2 = new io.sentry.protocol.u();
            }
            if ((i9 & 8) != 0) {
                bVar = null;
            }
            hVar.d(uVar, i8, uVar2, bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class c {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final K2 f26770a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C2517k1 f26771b;

            public static /* synthetic */ void b(a aVar, X x8, H h8, int i8, Object obj) {
                if ((i8 & 2) != 0) {
                    h8 = new H();
                }
                aVar.a(x8, h8);
            }

            public final void a(X x8, H hint) {
                t.g(hint, "hint");
                if (x8 != null) {
                    K2 k8 = this.f26770a;
                    hint.l(this.f26771b);
                    G g8 = G.f1419a;
                    x8.x(k8, hint);
                }
            }

            public final K2 c() {
                return this.f26770a;
            }

            public final void d(int i8) {
                this.f26770a.l0(i8);
                List<io.sentry.rrweb.b> listA = this.f26771b.a();
                if (listA != null) {
                    for (io.sentry.rrweb.b bVar : listA) {
                        if (bVar instanceof io.sentry.rrweb.j) {
                            ((io.sentry.rrweb.j) bVar).C(i8);
                        }
                    }
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return t.c(this.f26770a, aVar.f26770a) && t.c(this.f26771b, aVar.f26771b);
            }

            public int hashCode() {
                return (this.f26770a.hashCode() * 31) + this.f26771b.hashCode();
            }

            public String toString() {
                return "Created(replay=" + this.f26770a + ", recording=" + this.f26771b + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(K2 k8, C2517k1 recording) {
                super(null);
                t.g(k8, ZWZaxQrCHfNe.HTOgtfLor);
                t.g(recording, "recording");
                this.f26770a = k8;
                this.f26771b = recording;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f26772a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public c() {
        }
    }

    void b(MotionEvent motionEvent);

    void c(io.sentry.android.replay.u uVar);

    void d(io.sentry.android.replay.u uVar, int i8, io.sentry.protocol.u uVar2, K2.b bVar);

    io.sentry.protocol.u e();

    h f();

    void g(Bitmap bitmap, o oVar);

    void h();

    void i();

    void j(Date date);

    void k(boolean z8, Q6.k kVar);

    void l(int i8);

    int m();

    void stop();
}
