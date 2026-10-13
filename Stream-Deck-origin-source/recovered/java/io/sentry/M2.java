package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class M2 implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25951b;

    public M2(String str, String str2) {
        this.f25950a = str;
        this.f25951b = str2;
    }

    public final P1 a(P1 p8) {
        if (p8.C().g() == null) {
            p8.C().s(new io.sentry.protocol.w());
        }
        io.sentry.protocol.w wVarG = p8.C().g();
        if (wVarG != null && wVarG.d() == null && wVarG.e() == null) {
            wVarG.f(this.f25951b);
            wVarG.h(this.f25950a);
        }
        return p8;
    }

    @Override // io.sentry.C
    public C2557s2 c(C2557s2 c2557s2, H h8) {
        return (C2557s2) a(c2557s2);
    }

    @Override // io.sentry.C
    public io.sentry.protocol.B j(io.sentry.protocol.B b8, H h8) {
        return (io.sentry.protocol.B) a(b8);
    }

    public M2() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
