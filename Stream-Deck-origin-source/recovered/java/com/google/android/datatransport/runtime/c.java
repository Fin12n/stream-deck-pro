package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.persistence.i;
import p059g4.g;
import p059g4.o;
import p113m4.h;
import p122n4.r;
import p122n4.u;
import p131o4.C2754f;
import p131o4.C2755g;
import p131o4.C2756h;
import p131o4.C2757i;
import p131o4.InterfaceC2752d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B6.a f17821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B6.a f17822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B6.a f17823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B6.a f17824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B6.a f17825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public B6.a f17826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B6.a f17827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public B6.a f17828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public B6.a f17829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public B6.a f17830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public B6.a f17831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B6.a f17832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public B6.a f17833m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f17834a;

        public b() {
        }

        @Override // com.google.android.datatransport.runtime.f.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f17834a = (Context) p077i4.e.b(context);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.f.a
        public f build() {
            p077i4.e.a(this.f17834a, Context.class);
            return new c(this.f17834a);
        }
    }

    public static f.a j() {
        return new b();
    }

    @Override // com.google.android.datatransport.runtime.f
    public InterfaceC2752d b() {
        return (InterfaceC2752d) this.f17827g.get();
    }

    @Override // com.google.android.datatransport.runtime.f
    public TransportRuntime c() {
        return (TransportRuntime) this.f17833m.get();
    }

    public final void o(Context context) {
        this.f17821a = p077i4.a.a(g.a());
        p077i4.b bVarA = p077i4.c.a(context);
        this.f17822b = bVarA;
        com.google.android.datatransport.runtime.backends.a aVarA = com.google.android.datatransport.runtime.backends.a.a(bVarA, p147q4.c.a(), p147q4.d.a());
        this.f17823c = aVarA;
        this.f17824d = p077i4.a.a(com.google.android.datatransport.runtime.backends.b.a(this.f17822b, aVarA));
        this.f17825e = i.a(this.f17822b, C2754f.a(), C2756h.a());
        this.f17826f = p077i4.a.a(C2755g.a(this.f17822b));
        this.f17827g = p077i4.a.a(com.google.android.datatransport.runtime.scheduling.persistence.c.a(p147q4.c.a(), p147q4.d.a(), C2757i.a(), this.f17825e, this.f17826f));
        p113m4.f fVarB = p113m4.f.b(p147q4.c.a());
        this.f17828h = fVarB;
        h hVarA = h.a(this.f17822b, this.f17827g, fVarB, p147q4.d.a());
        this.f17829i = hVarA;
        B6.a aVar = this.f17821a;
        B6.a aVar2 = this.f17824d;
        B6.a aVar3 = this.f17827g;
        this.f17830j = p113m4.c.a(aVar, aVar2, hVarA, aVar3, aVar3);
        B6.a aVar4 = this.f17822b;
        B6.a aVar5 = this.f17824d;
        B6.a aVar6 = this.f17827g;
        this.f17831k = r.a(aVar4, aVar5, aVar6, this.f17829i, this.f17821a, aVar6, p147q4.c.a(), p147q4.d.a(), this.f17827g);
        B6.a aVar7 = this.f17821a;
        B6.a aVar8 = this.f17827g;
        this.f17832l = u.a(aVar7, aVar8, this.f17829i, aVar8);
        this.f17833m = p077i4.a.a(o.a(p147q4.c.a(), p147q4.d.a(), this.f17830j, this.f17831k, this.f17832l));
    }

    public c(Context context) {
        o(context);
    }
}
