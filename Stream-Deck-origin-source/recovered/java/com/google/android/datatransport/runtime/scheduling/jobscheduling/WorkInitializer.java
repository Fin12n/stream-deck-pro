package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p122n4.v;
import p131o4.InterfaceC2752d;
import p139p4.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class WorkInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f17850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2752d f17851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f17852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f17853d;

    public WorkInitializer(Executor executor, InterfaceC2752d interfaceC2752d, v vVar, b bVar) {
        this.f17850a = executor;
        this.f17851b = interfaceC2752d;
        this.f17852c = vVar;
        this.f17853d = bVar;
    }

    public static /* synthetic */ Object a(WorkInitializer workInitializer) {
        Iterator it = workInitializer.f17851b.l0().iterator();
        while (it.hasNext()) {
            workInitializer.f17852c.a((e) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f17850a.execute(new Runnable() { // from class: n4.s
            @Override // java.lang.Runnable
            public final void run() {
                WorkInitializer workInitializer = this.f30623a;
                workInitializer.f17853d.b(new b.a() { // from class: n4.t
                    @Override // p4.b.a
                    public final Object a() {
                        return WorkInitializer.a(workInitializer);
                    }
                });
            }
        });
    }
}
