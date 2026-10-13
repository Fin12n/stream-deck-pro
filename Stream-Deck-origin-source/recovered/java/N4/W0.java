package N4;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W0 implements p042e5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6606a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6607b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p042e5.d f6608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S0 f6609d;

    public W0(S0 s8) {
        this.f6609d = s8;
    }

    public final void a(p042e5.d dVar, boolean z8) {
        this.f6606a = false;
        this.f6608c = dVar;
        this.f6607b = z8;
    }

    public final void b() {
        if (this.f6606a) {
            throw new p042e5.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6606a = true;
    }

    @Override // p042e5.h
    public final p042e5.h c(String str) throws IOException {
        b();
        this.f6609d.e(this.f6608c, str, this.f6607b);
        return this;
    }

    @Override // p042e5.h
    public final p042e5.h d(boolean z8) throws IOException {
        b();
        this.f6609d.f(this.f6608c, z8 ? 1 : 0, this.f6607b);
        return this;
    }
}
