package p136p1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f31047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31048b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f31049c;

    public f(z zVar) {
        this.f31047a = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final float a(int i8, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        int i9 = 1;
        if (z8) {
            int iA = h.a(this.f31047a.h(), i8, z8);
            int iU = this.f31047a.u(iA);
            int iO = this.f31047a.o(iA);
            if (i8 == iU || i8 == iO) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        int i10 = i8 * 4;
        if (!z10) {
            i9 = z11 ? 2 : 3;
        } else if (z11) {
            i9 = 0;
        }
        int i11 = i10 + i9;
        if (this.f31048b == i11) {
            return this.f31049c;
        }
        float fZ = z10 ? this.f31047a.z(i8, z8) : this.f31047a.B(i8, z8);
        if (z9) {
            this.f31048b = i11;
            this.f31049c = fZ;
        }
        return fZ;
    }

    public final float b(int i8) {
        return a(i8, false, false, true);
    }

    public final float c(int i8) {
        return a(i8, true, true, true);
    }

    public final float d(int i8) {
        return a(i8, false, false, false);
    }

    public final float e(int i8) {
        return a(i8, true, true, false);
    }
}
