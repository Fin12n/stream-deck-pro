package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p032d4.h;
import p043e6.dT.GIGvBf;
import p068h4.e;
import p068h4.i;
import p113m4.d;
import p122n4.v;
import p131o4.InterfaceC2752d;
import p139p4.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class DefaultScheduler implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f17835f = Logger.getLogger(TransportRuntime.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f17836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f17837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f17838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2752d f17839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f17840e;

    public DefaultScheduler(Executor executor, e eVar, v vVar, InterfaceC2752d interfaceC2752d, b bVar) {
        this.f17837b = executor;
        this.f17838c = eVar;
        this.f17836a = vVar;
        this.f17839d = interfaceC2752d;
        this.f17840e = bVar;
    }

    public static /* synthetic */ Object b(DefaultScheduler defaultScheduler, com.google.android.datatransport.runtime.e eVar, com.google.android.datatransport.runtime.d dVar) {
        defaultScheduler.f17839d.z1(eVar, dVar);
        defaultScheduler.f17836a.a(eVar, 1);
        return null;
    }

    @Override // p113m4.d
    public void a(final com.google.android.datatransport.runtime.e eVar, final com.google.android.datatransport.runtime.d dVar, final h hVar) {
        this.f17837b.execute(new Runnable() { // from class: m4.a
            @Override // java.lang.Runnable
            public final void run() {
                DefaultScheduler.c(this.f30051a, eVar, hVar, dVar);
            }
        });
    }

    public static /* synthetic */ void c(final DefaultScheduler defaultScheduler, final com.google.android.datatransport.runtime.e eVar, h hVar, com.google.android.datatransport.runtime.d dVar) {
        defaultScheduler.getClass();
        try {
            i iVarD = defaultScheduler.f17838c.d(eVar.b());
            if (iVarD == null) {
                String str = String.format("Transport backend '%s' is not registered", eVar.b());
                f17835f.warning(str);
                hVar.a(new IllegalArgumentException(str));
            } else {
                final com.google.android.datatransport.runtime.d dVarB = iVarD.b(dVar);
                defaultScheduler.f17840e.b(new b.a() { // from class: m4.b
                    @Override // p4.b.a
                    public final Object a() {
                        return DefaultScheduler.b(this.f30055a, eVar, dVarB);
                    }
                });
                hVar.a(null);
            }
        } catch (Exception e8) {
            f17835f.warning(GIGvBf.nFBu + e8.getMessage());
            hVar.a(e8);
        }
    }
}
