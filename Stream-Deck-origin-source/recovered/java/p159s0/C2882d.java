package p159s0;

import Q0.f;
import p011b1.C1766n;
import p011b1.z;
import p065h1.R0;

/* JADX INFO: renamed from: s0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2882d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0 f32767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f32769c;

    public C2882d(R0 r8) {
        this.f32767a = r8;
    }

    public final int a() {
        return this.f32768b;
    }

    public final boolean b(z zVar, z zVar2) {
        return ((double) f.m(f.s(zVar2.i(), zVar.i()))) < 100.0d;
    }

    public final boolean c(z zVar, z zVar2) {
        return zVar2.p() - zVar.p() < this.f32767a.a();
    }

    public final void d(C1766n c1766n) {
        z zVar = this.f32769c;
        z zVar2 = (z) c1766n.c().get(0);
        if (zVar != null && c(zVar, zVar2) && b(zVar, zVar2)) {
            this.f32768b++;
        } else {
            this.f32768b = 1;
        }
        this.f32769c = zVar2;
    }
}
