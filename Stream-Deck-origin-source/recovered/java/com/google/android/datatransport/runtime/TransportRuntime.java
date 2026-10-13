package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import java.util.Collections;
import java.util.Set;
import p032d4.g;
import p032d4.h;
import p059g4.j;
import p059g4.k;
import p059g4.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class TransportRuntime implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile f f17785e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p147q4.a f17786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p147q4.a f17787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p113m4.d f17788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uploader f17789d;

    public TransportRuntime(p147q4.a aVar, p147q4.a aVar2, p113m4.d dVar, Uploader uploader, WorkInitializer workInitializer) {
        this.f17786a = aVar;
        this.f17787b = aVar2;
        this.f17788c = dVar;
        this.f17789d = uploader;
        workInitializer.c();
    }

    public static TransportRuntime c() {
        f fVar = f17785e;
        if (fVar != null) {
            return fVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(p059g4.c cVar) {
        return cVar instanceof p059g4.d ? Collections.unmodifiableSet(((p059g4.d) cVar).a()) : Collections.singleton(p032d4.b.b("proto"));
    }

    public static void f(Context context) {
        if (f17785e == null) {
            synchronized (TransportRuntime.class) {
                try {
                    if (f17785e == null) {
                        f17785e = c.j().a(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p059g4.n
    public void a(j jVar, h hVar) {
        this.f17788c.a(jVar.f().f(jVar.c().c()), b(jVar), hVar);
    }

    public final d b(j jVar) {
        return d.a().i(this.f17786a.a()).k(this.f17787b.a()).j(jVar.g()).h(new p059g4.e(jVar.b(), jVar.d())).g(jVar.c().a()).d();
    }

    public Uploader e() {
        return this.f17789d;
    }

    public g g(p059g4.c cVar) {
        return new k(d(cVar), e.a().b(cVar.getName()).c(cVar.getExtras()).a(), this);
    }
}
