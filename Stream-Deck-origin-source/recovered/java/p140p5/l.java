package p140p5;

import C4.b;
import C4.c;
import M4.AbstractC1052f;
import M4.AbstractC1055i;
import M4.C1054h;
import S4.InterfaceC1635f;
import S4.n;
import T0.Vl.PCRzgdeK;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import com.google.android.gms.dynamite.DynamiteModule;
import io.jentz.winter.js.HRHLwtyqJWz;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p116m7.kKPq.toqHM;
import p181u6.GfRt.QhsKALGiniuQ;
import p195w4.d;
import p195w4.f;
import p203x4.h;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final AbstractC1055i f31265A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final AbstractC1055i f31266B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d[] f31267a = new d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f31268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f31269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f31270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f31271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f31272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f31273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f31274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f31275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f31276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f31277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f31278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f31279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f31280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f31281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f31282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f31283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f31284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f31285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f31286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f31287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f31288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f31289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f31290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f31291y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d f31292z;

    static {
        d dVar = new d("vision.barcode", 1L);
        f31268b = dVar;
        d dVar2 = new d("vision.custom.ica", 1L);
        f31269c = dVar2;
        d dVar3 = new d("vision.face", 1L);
        f31270d = dVar3;
        d dVar4 = new d("vision.ica", 1L);
        f31271e = dVar4;
        d dVar5 = new d(PCRzgdeK.PbizJEsPCKhPoR, 1L);
        f31272f = dVar5;
        f31273g = new d("mlkit.ocr.chinese", 1L);
        f31274h = new d("mlkit.ocr.common", 1L);
        f31275i = new d("mlkit.ocr.devanagari", 1L);
        f31276j = new d("mlkit.ocr.japanese", 1L);
        f31277k = new d("mlkit.ocr.korean", 1L);
        d dVar6 = new d("mlkit.langid", 1L);
        f31278l = dVar6;
        d dVar7 = new d("mlkit.nlclassifier", 1L);
        f31279m = dVar7;
        d dVar8 = new d("tflite_dynamite", 1L);
        f31280n = dVar8;
        d dVar9 = new d("mlkit.barcode.ui", 1L);
        f31281o = dVar9;
        d dVar10 = new d("mlkit.smartreply", 1L);
        f31282p = dVar10;
        f31283q = new d("mlkit.image.caption", 1L);
        f31284r = new d("mlkit.docscan.detect", 1L);
        f31285s = new d("mlkit.docscan.crop", 1L);
        f31286t = new d(HRHLwtyqJWz.CKmqLSxRn, 1L);
        f31287u = new d("mlkit.docscan.ui", 1L);
        f31288v = new d(QhsKALGiniuQ.mxKjLBoaQgcVZHj, 1L);
        f31289w = new d("mlkit.docscan.shadow", 1L);
        f31290x = new d("mlkit.quality.aesthetic", 1L);
        f31291y = new d("mlkit.quality.technical", 1L);
        f31292z = new d("mlkit.segmentation.subject", 1L);
        C1054h c1054h = new C1054h();
        c1054h.a("barcode", dVar);
        c1054h.a("custom_ica", dVar2);
        c1054h.a("face", dVar3);
        c1054h.a("ica", dVar4);
        c1054h.a("ocr", dVar5);
        c1054h.a("langid", dVar6);
        c1054h.a(toqHM.XjFTPAAk, dVar7);
        c1054h.a("tflite_dynamite", dVar8);
        c1054h.a("barcode_ui", dVar9);
        c1054h.a("smart_reply", dVar10);
        f31265A = c1054h.b();
        C1054h c1054h2 = new C1054h();
        c1054h2.a("com.google.android.gms.vision.barcode", dVar);
        c1054h2.a("com.google.android.gms.vision.custom.ica", dVar2);
        c1054h2.a("com.google.android.gms.vision.face", dVar3);
        c1054h2.a("com.google.android.gms.vision.ica", dVar4);
        c1054h2.a("com.google.android.gms.vision.ocr", dVar5);
        c1054h2.a("com.google.android.gms.mlkit.langid", dVar6);
        c1054h2.a("com.google.android.gms.mlkit.nlclassifier", dVar7);
        c1054h2.a("com.google.android.gms.tflite_dynamite", dVar8);
        c1054h2.a("com.google.android.gms.mlkit_smartreply", dVar10);
        f31266B = c1054h2.b();
    }

    public static boolean a(Context context, List list) throws Throwable {
        if (f.f().a(context) >= 221500000) {
            return b(context, f(f31266B, list));
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.d(context, DynamiteModule.f17912b, (String) it.next());
            }
            return true;
        } catch (DynamiteModule.a unused) {
            return false;
        }
    }

    public static boolean b(Context context, final d[] dVarArr) {
        try {
            return ((b) n.a(c.a(context).b(new h() { // from class: p5.C
                @Override // p203x4.h
                public final d[] b() {
                    d[] dVarArr2 = l.f31267a;
                    return dVarArr;
                }
            }).d(new InterfaceC1635f() { // from class: p5.D
                @Override // S4.InterfaceC1635f
                public final void d(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).a();
        } catch (InterruptedException | ExecutionException e8) {
            Log.e("OptionalModuleUtils", uYOhHhTXuF.ZrAsPaF, e8);
            return false;
        }
    }

    public static void c(Context context, String str) {
        d(context, AbstractC1052f.D(str));
    }

    public static void e(Context context, final d[] dVarArr) {
        c.a(context).a(C4.f.d().a(new h() { // from class: p5.A
            @Override // p203x4.h
            public final d[] b() {
                d[] dVarArr2 = l.f31267a;
                return dVarArr;
            }
        }).b()).d(new InterfaceC1635f() { // from class: p5.B
            @Override // S4.InterfaceC1635f
            public final void d(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    public static d[] f(Map map, List list) {
        d[] dVarArr = new d[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            dVarArr[i8] = (d) AbstractC3207p.k((d) map.get(list.get(i8)));
        }
        return dVarArr;
    }

    public static void d(Context context, List list) {
        if (f.f().a(context) >= 221500000) {
            e(context, f(f31265A, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction(SZCvugJaXc.uNGJTfqOsAlE);
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(PCRzgdeK.Iyu, list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }
}
