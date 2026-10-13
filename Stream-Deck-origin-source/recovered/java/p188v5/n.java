package p188v5;

import N4.AbstractC1183j0;
import N4.Ca;
import N4.Ea;
import N4.Fa;
import N4.La;
import N4.N9;
import N4.Y6;
import N4.sa;
import N4.ua;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p140p5.l;
import p156r5.b;
import p196w5.a;
import p204x5.d;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC1183j0 f35159h = AbstractC1183j0.D("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f35163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f35164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N9 f35165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Ca f35166g;

    public n(Context context, b bVar, N9 n9) {
        this.f35163d = context;
        this.f35164e = bVar;
        this.f35165f = n9;
    }

    public static boolean b(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // p188v5.l
    public final List a(a aVar) throws p105l5.a {
        if (this.f35166g == null) {
            j();
        }
        Ca ca = (Ca) AbstractC3207p.k(this.f35166g);
        if (!this.f35160a) {
            try {
                ca.T();
                this.f35160a = true;
            } catch (RemoteException e8) {
                throw new p105l5.a("Failed to init barcode scanner.", 13, e8);
            }
        }
        int iJ = aVar.j();
        if (aVar.e() == 35) {
            iJ = ((Image.Plane[]) AbstractC3207p.k(aVar.h()))[0].getRowStride();
        }
        try {
            List listS = ca.S(d.b().a(aVar), new La(aVar.e(), iJ, aVar.f(), p204x5.b.a(aVar.i()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                arrayList.add(new p172t5.a(new m((sa) it.next()), aVar.d()));
            }
            return arrayList;
        } catch (RemoteException e9) {
            throw new p105l5.a("Failed to run barcode scanner.", 13, e9);
        }
    }

    public final Ca c(DynamiteModule.b bVar, String str, String str2) {
        boolean z8;
        Fa faA = Ea.a(DynamiteModule.d(this.f35163d, bVar, str).c(str2));
        b bVar2 = this.f35164e;
        H4.a aVarP = H4.b.P(this.f35163d);
        int iA = bVar2.a();
        if (bVar2.d()) {
            z8 = true;
        } else {
            this.f35164e.b();
            z8 = false;
        }
        return faA.J(aVarP, new ua(iA, z8));
    }

    @Override // p188v5.l
    public final boolean j() throws p105l5.a {
        if (this.f35166g != null) {
            return this.f35161b;
        }
        if (b(this.f35163d)) {
            this.f35161b = true;
            try {
                this.f35166g = c(DynamiteModule.f17913c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e8) {
                throw new p105l5.a("Failed to create thick barcode scanner.", 13, e8);
            } catch (DynamiteModule.a e9) {
                throw new p105l5.a("Failed to load the bundled barcode module.", 13, e9);
            }
        } else {
            this.f35161b = false;
            if (!l.a(this.f35163d, f35159h)) {
                if (!this.f35162c) {
                    l.d(this.f35163d, AbstractC1183j0.D("barcode", "tflite_dynamite"));
                    this.f35162c = true;
                }
                b.e(this.f35165f, Y6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new p105l5.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f35166g = c(DynamiteModule.f17912b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.a e10) {
                b.e(this.f35165f, Y6.OPTIONAL_MODULE_INIT_ERROR);
                throw new p105l5.a("Failed to create thin barcode scanner.", 13, e10);
            }
        }
        b.e(this.f35165f, Y6.NO_ERROR);
        return this.f35161b;
    }

    @Override // p188v5.l
    public final void zzb() {
        Ca ca = this.f35166g;
        if (ca != null) {
            try {
                ca.l();
            } catch (RemoteException e8) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e8);
            }
            this.f35166g = null;
            this.f35160a = false;
        }
    }
}
