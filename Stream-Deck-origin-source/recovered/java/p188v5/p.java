package p188v5;

import N4.AbstractBinderC1218m;
import N4.C1170i;
import N4.C1194k;
import N4.C1242o;
import N4.C1371z8;
import N4.N9;
import N4.Y6;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.List;
import p140p5.l;
import p156r5.b;
import p196w5.a;
import p204x5.c;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f35169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1170i f35170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N9 f35171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1194k f35172e;

    public p(Context context, b bVar, N9 n9) {
        C1170i c1170i = new C1170i();
        this.f35170c = c1170i;
        this.f35169b = context;
        c1170i.f7133a = bVar.a();
        this.f35171d = n9;
    }

    @Override // p188v5.l
    public final List a(a aVar) throws p105l5.a {
        C1371z8[] c1371z8ArrT;
        if (this.f35172e == null) {
            j();
        }
        C1194k c1194k = this.f35172e;
        if (c1194k == null) {
            throw new p105l5.a("Error initializing the legacy barcode scanner.", 14);
        }
        C1194k c1194k2 = (C1194k) AbstractC3207p.k(c1194k);
        C1242o c1242o = new C1242o(aVar.j(), aVar.f(), 0, 0L, p204x5.b.a(aVar.i()));
        try {
            int iE = aVar.e();
            if (iE == -1) {
                c1371z8ArrT = c1194k2.T(H4.b.P(aVar.b()), c1242o);
            } else if (iE == 17) {
                c1371z8ArrT = c1194k2.S(H4.b.P(aVar.c()), c1242o);
            } else if (iE == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) AbstractC3207p.k(aVar.h());
                c1242o.f7240a = planeArr[0].getRowStride();
                c1371z8ArrT = c1194k2.S(H4.b.P(planeArr[0].getBuffer()), c1242o);
            } else {
                if (iE != 842094169) {
                    throw new p105l5.a("Unsupported image format: " + aVar.e(), 3);
                }
                c1371z8ArrT = c1194k2.S(H4.b.P(c.d().c(aVar, false)), c1242o);
            }
            ArrayList arrayList = new ArrayList();
            for (C1371z8 c1371z8 : c1371z8ArrT) {
                arrayList.add(new p172t5.a(new o(c1371z8), aVar.d()));
            }
            return arrayList;
        } catch (RemoteException e8) {
            throw new p105l5.a("Failed to detect with legacy barcode detector", 13, e8);
        }
    }

    @Override // p188v5.l
    public final boolean j() throws p105l5.a {
        if (this.f35172e != null) {
            return false;
        }
        try {
            C1194k c1194kL = AbstractBinderC1218m.a(DynamiteModule.d(this.f35169b, DynamiteModule.f17912b, "com.google.android.gms.vision.dynamite").c("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).L(H4.b.P(this.f35169b), this.f35170c);
            this.f35172e = c1194kL;
            if (c1194kL == null && !this.f35168a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                l.c(this.f35169b, "barcode");
                this.f35168a = true;
                b.e(this.f35171d, Y6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new p105l5.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            b.e(this.f35171d, Y6.NO_ERROR);
            return false;
        } catch (RemoteException e8) {
            throw new p105l5.a("Failed to create legacy barcode detector.", 13, e8);
        } catch (DynamiteModule.a e9) {
            throw new p105l5.a("Failed to load deprecated vision dynamite module.", 13, e9);
        }
    }

    @Override // p188v5.l
    public final void zzb() {
        C1194k c1194k = this.f35172e;
        if (c1194k != null) {
            try {
                c1194k.k();
            } catch (RemoteException e8) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e8);
            }
            this.f35172e = null;
        }
    }
}
