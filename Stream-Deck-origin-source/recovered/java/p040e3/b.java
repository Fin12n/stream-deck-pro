package p040e3;

import G6.d;
import p004a3.C1705k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface b extends h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static /* synthetic */ Object a(b bVar, C1705k c1705k, int i8, int i9, boolean z8, float f8, j jVar, float f9, boolean z9, i iVar, boolean z10, boolean z11, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            int iN = (i10 & 2) != 0 ? bVar.n() : i8;
            int i11 = (i10 & 4) != 0 ? bVar.i() : i9;
            boolean zG = (i10 & 8) != 0 ? bVar.g() : z8;
            float fJ = (i10 & 16) != 0 ? bVar.j() : f8;
            j jVarU = (i10 & 32) != 0 ? bVar.u() : jVar;
            return bVar.m(c1705k, iN, i11, zG, fJ, jVarU, (i10 & 64) != 0 ? d.c(c1705k, jVarU, fJ) : f9, (i10 & 128) != 0 ? false : z9, (i10 & 256) != 0 ? i.Immediately : iVar, (i10 & 512) != 0 ? false : z10, (i10 & 1024) != 0 ? false : z11, dVar);
        }

        public static /* synthetic */ Object b(b bVar, C1705k c1705k, float f8, int i8, boolean z8, d dVar, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i9 & 1) != 0) {
                c1705k = bVar.t();
            }
            if ((i9 & 2) != 0) {
                f8 = bVar.l();
            }
            if ((i9 & 4) != 0) {
                i8 = bVar.n();
            }
            if ((i9 & 8) != 0) {
                z8 = !(f8 == bVar.l());
            }
            return bVar.r(c1705k, f8, i8, z8, dVar);
        }
    }

    Object m(C1705k c1705k, int i8, int i9, boolean z8, float f8, j jVar, float f9, boolean z9, i iVar, boolean z10, boolean z11, d dVar);

    Object r(C1705k c1705k, float f8, int i8, boolean z8, d dVar);
}
