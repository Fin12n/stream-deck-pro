package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p068h4.e;
import p068h4.f;
import p068h4.g;
import p068h4.i;
import p086j4.c;
import p122n4.v;
import p131o4.AbstractC2758j;
import p131o4.InterfaceC2751c;
import p131o4.InterfaceC2752d;
import p139p4.b;
import p147q4.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class Uploader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f17842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2752d f17843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f17844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f17845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f17846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f17847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f17848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC2751c f17849i;

    public Uploader(Context context, e eVar, InterfaceC2752d interfaceC2752d, v vVar, Executor executor, b bVar, a aVar, a aVar2, InterfaceC2751c interfaceC2751c) {
        this.f17841a = context;
        this.f17842b = eVar;
        this.f17843c = interfaceC2752d;
        this.f17844d = vVar;
        this.f17845e = executor;
        this.f17846f = bVar;
        this.f17847g = aVar;
        this.f17848h = aVar2;
        this.f17849i = interfaceC2751c;
    }

    public static /* synthetic */ Object b(Uploader uploader, Iterable iterable, com.google.android.datatransport.runtime.e eVar, long j8) {
        uploader.f17843c.Q1(iterable);
        uploader.f17843c.d0(eVar, uploader.f17847g.a() + j8);
        return null;
    }

    public static /* synthetic */ Object c(Uploader uploader) {
        uploader.f17849i.c();
        return null;
    }

    public static /* synthetic */ Object e(Uploader uploader, Iterable iterable) {
        uploader.f17843c.E(iterable);
        return null;
    }

    public static /* synthetic */ Object f(Uploader uploader, com.google.android.datatransport.runtime.e eVar, int i8) {
        uploader.f17844d.a(eVar, i8 + 1);
        return null;
    }

    public static /* synthetic */ Object g(Uploader uploader, com.google.android.datatransport.runtime.e eVar, long j8) {
        uploader.f17843c.d0(eVar, uploader.f17847g.a() + j8);
        return null;
    }

    public static /* synthetic */ Object h(Uploader uploader, Map map) {
        uploader.getClass();
        for (Map.Entry entry : map.entrySet()) {
            uploader.f17849i.j(((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final Uploader uploader, final com.google.android.datatransport.runtime.e eVar, final int i8, Runnable runnable) {
        uploader.getClass();
        try {
            b bVar = uploader.f17846f;
            final InterfaceC2752d interfaceC2752d = uploader.f17843c;
            Objects.requireNonNull(interfaceC2752d);
            bVar.b(new b.a() { // from class: n4.i
                @Override // p4.b.a
                public final Object a() {
                    return Integer.valueOf(interfaceC2752d.C());
                }
            });
            if (uploader.k()) {
                uploader.l(eVar, i8);
            } else {
                uploader.f17846f.b(new b.a() { // from class: n4.j
                    @Override // p4.b.a
                    public final Object a() {
                        return Uploader.f(this.f30595a, eVar, i8);
                    }
                });
            }
        } catch (p139p4.a unused) {
            uploader.f17844d.a(eVar, i8 + 1);
        } finally {
            runnable.run();
        }
    }

    public d j(i iVar) {
        b bVar = this.f17846f;
        final InterfaceC2751c interfaceC2751c = this.f17849i;
        Objects.requireNonNull(interfaceC2751c);
        return iVar.b(d.a().i(this.f17847g.a()).k(this.f17848h.a()).j("GDT_CLIENT_METRICS").h(new p059g4.e(p032d4.b.b("proto"), ((p086j4.a) bVar.b(new b.a() { // from class: n4.h
            @Override // p4.b.a
            public final Object a() {
                return interfaceC2751c.o();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f17841a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public g l(final com.google.android.datatransport.runtime.e eVar, int i8) {
        g gVarA;
        i iVarD = this.f17842b.d(eVar.b());
        g gVarE = g.e(0L);
        final long j8 = 0;
        while (((Boolean) this.f17846f.b(new b.a() { // from class: n4.k
            @Override // p4.b.a
            public final Object a() {
                return Boolean.valueOf(this.f30598a.f17843c.L1(eVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f17846f.b(new b.a() { // from class: n4.l
                @Override // p4.b.a
                public final Object a() {
                    return this.f30600a.f17843c.W(eVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (iVarD == null) {
                p095k4.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", eVar);
                gVarA = g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC2758j) it.next()).b());
                }
                if (eVar.e()) {
                    arrayList.add(j(iVarD));
                }
                gVarA = iVarD.a(f.a().b(arrayList).c(eVar.c()).a());
            }
            gVarE = gVarA;
            if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                final com.google.android.datatransport.runtime.e eVar2 = eVar;
                this.f17846f.b(new b.a() { // from class: n4.m
                    @Override // p4.b.a
                    public final Object a() {
                        return Uploader.b(this.f30602a, iterable, eVar2, j8);
                    }
                });
                this.f17844d.b(eVar2, i8 + 1, true);
                return gVarE;
            }
            com.google.android.datatransport.runtime.e eVar3 = eVar;
            this.f17846f.b(new b.a() { // from class: n4.n
                @Override // p4.b.a
                public final Object a() {
                    return Uploader.e(this.f30606a, iterable);
                }
            });
            if (gVarE.c() == g.a.OK) {
                long jMax = Math.max(j8, gVarE.b());
                if (eVar3.e()) {
                    this.f17846f.b(new b.a() { // from class: n4.o
                        @Override // p4.b.a
                        public final Object a() {
                            return Uploader.c(this.f30608a);
                        }
                    });
                }
                j8 = jMax;
            } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strJ = ((AbstractC2758j) it2.next()).b().j();
                    if (map.containsKey(strJ)) {
                        map.put(strJ, Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    } else {
                        map.put(strJ, 1);
                    }
                }
                this.f17846f.b(new b.a() { // from class: n4.p
                    @Override // p4.b.a
                    public final Object a() {
                        return Uploader.h(this.f30609a, map);
                    }
                });
            }
            eVar = eVar3;
        }
        final com.google.android.datatransport.runtime.e eVar4 = eVar;
        this.f17846f.b(new b.a() { // from class: n4.q
            @Override // p4.b.a
            public final Object a() {
                return Uploader.g(this.f30611a, eVar4, j8);
            }
        });
        return gVarE;
    }

    public void m(final com.google.android.datatransport.runtime.e eVar, final int i8, final Runnable runnable) {
        this.f17845e.execute(new Runnable() { // from class: n4.g
            @Override // java.lang.Runnable
            public final void run() {
                Uploader.i(this.f30589a, eVar, i8, runnable);
            }
        });
    }
}
