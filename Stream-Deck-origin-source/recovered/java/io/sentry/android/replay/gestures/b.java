package io.sentry.android.replay.gestures;

import D6.C0937q;
import D6.C0938s;
import android.view.MotionEvent;
import io.sentry.android.replay.u;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.transport.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26805e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26806f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f26807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f26808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26810d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public b(p dateProvider) {
        t.g(dateProvider, "dateProvider");
        this.f26807a = dateProvider;
        this.f26808b = new LinkedHashMap(10);
    }

    public final List a(MotionEvent event, u recorderConfig) {
        t.g(event, "event");
        t.g(recorderConfig, "recorderConfig");
        int actionMasked = event.getActionMasked();
        int i8 = 10;
        int i9 = 0;
        List list = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long currentTimeMillis = this.f26807a.getCurrentTimeMillis();
                    long j8 = this.f26810d;
                    if (j8 != 0 && j8 + ((long) 50) > currentTimeMillis) {
                        return null;
                    }
                    this.f26810d = currentTimeMillis;
                    Set<Integer> setKeySet = this.f26808b.keySet();
                    t.f(setKeySet, "currentPositions.keys");
                    for (Integer pId : setKeySet) {
                        t.f(pId, "pId");
                        int iFindPointerIndex = event.findPointerIndex(pId.intValue());
                        if (iFindPointerIndex != -1) {
                            if (this.f26809c == 0) {
                                this.f26809c = currentTimeMillis;
                            }
                            Object obj = this.f26808b.get(pId);
                            t.d(obj);
                            f.b bVar = new f.b();
                            bVar.i(event.getX(iFindPointerIndex) * recorderConfig.e());
                            bVar.j(event.getY(iFindPointerIndex) * recorderConfig.f());
                            bVar.f(i9);
                            bVar.g(currentTimeMillis - this.f26809c);
                            ((Collection) obj).add(bVar);
                        }
                        list = list;
                        i9 = 0;
                    }
                    List list2 = list;
                    long j9 = currentTimeMillis - this.f26809c;
                    if (j9 <= 500) {
                        return list2;
                    }
                    ArrayList arrayList = new ArrayList(this.f26808b.size());
                    Iterator it = this.f26808b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        int iIntValue = ((Number) entry.getKey()).intValue();
                        ArrayList<f.b> arrayList2 = (ArrayList) entry.getValue();
                        if (!arrayList2.isEmpty()) {
                            f fVar = new f();
                            fVar.f(currentTimeMillis);
                            ArrayList arrayList3 = new ArrayList(C0938s.y(arrayList2, i8));
                            for (f.b bVar2 : arrayList2) {
                                bVar2.g(bVar2.e() - j9);
                                arrayList3.add(bVar2);
                                it = it;
                            }
                            fVar.n(arrayList3);
                            fVar.m(iIntValue);
                            arrayList.add(fVar);
                            Object obj2 = this.f26808b.get(Integer.valueOf(iIntValue));
                            t.d(obj2);
                            ((ArrayList) obj2).clear();
                            it = it;
                            i8 = 10;
                        }
                    }
                    this.f26809c = 0L;
                    return arrayList;
                }
                if (actionMasked == 3) {
                    this.f26808b.clear();
                    e eVar = new e();
                    eVar.f(this.f26807a.getCurrentTimeMillis());
                    eVar.u(event.getX() * recorderConfig.e());
                    eVar.v(event.getY() * recorderConfig.f());
                    eVar.q(0);
                    eVar.s(0);
                    eVar.r(e.b.TouchCancel);
                    return C0937q.e(eVar);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int iFindPointerIndex2 = event.findPointerIndex(pointerId);
            if (iFindPointerIndex2 == -1) {
                return null;
            }
            this.f26808b.remove(Integer.valueOf(pointerId));
            e eVar2 = new e();
            eVar2.f(this.f26807a.getCurrentTimeMillis());
            eVar2.u(event.getX(iFindPointerIndex2) * recorderConfig.e());
            eVar2.v(event.getY(iFindPointerIndex2) * recorderConfig.f());
            eVar2.q(0);
            eVar2.s(pointerId);
            eVar2.r(e.b.TouchEnd);
            return C0937q.e(eVar2);
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int iFindPointerIndex3 = event.findPointerIndex(pointerId2);
        if (iFindPointerIndex3 == -1) {
            return null;
        }
        this.f26808b.put(Integer.valueOf(pointerId2), new ArrayList(10));
        e eVar3 = new e();
        eVar3.f(this.f26807a.getCurrentTimeMillis());
        eVar3.u(event.getX(iFindPointerIndex3) * recorderConfig.e());
        eVar3.v(event.getY(iFindPointerIndex3) * recorderConfig.f());
        eVar3.q(0);
        eVar3.s(pointerId2);
        eVar3.r(e.b.TouchStart);
        return C0937q.e(eVar3);
    }
}
