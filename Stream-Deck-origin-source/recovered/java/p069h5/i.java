package p069h5;

import p042e5.c;
import p042e5.d;
import p042e5.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24472a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24473b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f24474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f24475d;

    public i(f fVar) {
        this.f24475d = fVar;
    }

    public final void a() {
        if (this.f24472a) {
            throw new c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f24472a = true;
    }

    public void b(d dVar, boolean z8) {
        this.f24472a = false;
        this.f24474c = dVar;
        this.f24473b = z8;
    }

    @Override // p042e5.h
    public h c(String str) {
        a();
        this.f24475d.f(this.f24474c, str, this.f24473b);
        return this;
    }

    @Override // p042e5.h
    public h d(boolean z8) {
        a();
        this.f24475d.k(this.f24474c, z8, this.f24473b);
        return this;
    }
}
