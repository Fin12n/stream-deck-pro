package O4;

import java.io.IOException;

/* JADX INFO: renamed from: O4.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1478p implements p042e5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8382a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8383b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p042e5.d f8384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1450l f8385d;

    public C1478p(C1450l c1450l) {
        this.f8385d = c1450l;
    }

    private final void b() {
        if (this.f8382a) {
            throw new p042e5.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f8382a = true;
    }

    public final void a(p042e5.d dVar, boolean z8) {
        this.f8382a = false;
        this.f8384c = dVar;
        this.f8383b = z8;
    }

    @Override // p042e5.h
    public final p042e5.h c(String str) throws IOException {
        b();
        this.f8385d.e(this.f8384c, str, this.f8383b);
        return this;
    }

    @Override // p042e5.h
    public final p042e5.h d(boolean z8) throws IOException {
        b();
        this.f8385d.f(this.f8384c, z8 ? 1 : 0, this.f8383b);
        return this;
    }
}
