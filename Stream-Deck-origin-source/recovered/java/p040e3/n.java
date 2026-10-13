package p040e3;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.google.mlkit.common.internal.ckI.WqXA;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import p004a3.J;
import p130o3.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f20709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f20710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f20711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f20712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f20713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f20714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f20715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f20716j;

    public n(List<p> intProperties, List<p> pointFProperties, List<p> floatProperties, List<p> list, List<p> colorFilterProperties, List<p> intArrayProperties, List<p> typefaceProperties, List<p> bitmapProperties, List<p> charSequenceProperties, List<p> pathProperties) {
        t.g(intProperties, "intProperties");
        t.g(pointFProperties, "pointFProperties");
        t.g(floatProperties, "floatProperties");
        t.g(list, WqXA.CmMUVHoMzy);
        t.g(colorFilterProperties, "colorFilterProperties");
        t.g(intArrayProperties, "intArrayProperties");
        t.g(typefaceProperties, "typefaceProperties");
        t.g(bitmapProperties, "bitmapProperties");
        t.g(charSequenceProperties, "charSequenceProperties");
        t.g(pathProperties, "pathProperties");
        this.f20707a = intProperties;
        this.f20708b = pointFProperties;
        this.f20709c = floatProperties;
        this.f20710d = list;
        this.f20711e = colorFilterProperties;
        this.f20712f = intArrayProperties;
        this.f20713g = typefaceProperties;
        this.f20714h = bitmapProperties;
        this.f20715i = charSequenceProperties;
        this.f20716j = pathProperties;
    }

    public final void a(J drawable) {
        t.g(drawable, "drawable");
        for (p pVar : this.f20707a) {
            drawable.q(pVar.b(), pVar.c(), o.b(pVar.a()));
        }
        for (p pVar2 : this.f20708b) {
            drawable.q(pVar2.b(), pVar2.c(), o.b(pVar2.a()));
        }
        for (p pVar3 : this.f20709c) {
            drawable.q(pVar3.b(), pVar3.c(), o.b(pVar3.a()));
        }
        for (p pVar4 : this.f20710d) {
            drawable.q(pVar4.b(), pVar4.c(), o.b(pVar4.a()));
        }
        for (p pVar5 : this.f20711e) {
            drawable.q(pVar5.b(), pVar5.c(), o.b(pVar5.a()));
        }
        for (p pVar6 : this.f20712f) {
            drawable.q(pVar6.b(), pVar6.c(), o.b(pVar6.a()));
        }
        for (p pVar7 : this.f20713g) {
            drawable.q(pVar7.b(), pVar7.c(), o.b(pVar7.a()));
        }
        for (p pVar8 : this.f20714h) {
            drawable.q(pVar8.b(), pVar8.c(), o.b(pVar8.a()));
        }
        for (p pVar9 : this.f20715i) {
            drawable.q(pVar9.b(), pVar9.c(), o.b(pVar9.a()));
        }
        for (p pVar10 : this.f20716j) {
            drawable.q(pVar10.b(), pVar10.c(), o.b(pVar10.a()));
        }
    }

    public final void b(J drawable) {
        t.g(drawable, "drawable");
        for (p pVar : this.f20707a) {
            drawable.q(pVar.b(), pVar.c(), null);
        }
        for (p pVar2 : this.f20708b) {
            drawable.q(pVar2.b(), pVar2.c(), null);
        }
        for (p pVar3 : this.f20709c) {
            drawable.q(pVar3.b(), pVar3.c(), null);
        }
        for (p pVar4 : this.f20710d) {
            drawable.q(pVar4.b(), pVar4.c(), null);
        }
        for (p pVar5 : this.f20711e) {
            drawable.q(pVar5.b(), pVar5.c(), null);
        }
        for (p pVar6 : this.f20712f) {
            drawable.q(pVar6.b(), pVar6.c(), null);
        }
        for (p pVar7 : this.f20713g) {
            drawable.q(pVar7.b(), pVar7.c(), null);
        }
        for (p pVar8 : this.f20714h) {
            drawable.q(pVar8.b(), pVar8.c(), null);
        }
        for (p pVar9 : this.f20715i) {
            drawable.q(pVar9.b(), pVar9.c(), null);
        }
        for (p pVar10 : this.f20716j) {
            drawable.q(pVar10.b(), pVar10.c(), null);
        }
    }

    public n(List<? extends p> properties) {
        t.g(properties, "properties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : properties) {
            if (((p) obj).c() instanceof Integer) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : properties) {
            if (((p) obj2).c() instanceof PointF) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : properties) {
            if (((p) obj3).c() instanceof Float) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : properties) {
            if (((p) obj4).c() instanceof d) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : properties) {
            if (((p) obj5).c() instanceof ColorFilter) {
                arrayList5.add(obj5);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : properties) {
            if (((p) obj6).c() instanceof Object[]) {
                arrayList6.add(obj6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : properties) {
            if (((p) obj7).c() instanceof Typeface) {
                arrayList7.add(obj7);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj8 : properties) {
            if (((p) obj8).c() instanceof Bitmap) {
                arrayList8.add(obj8);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj9 : properties) {
            if (((p) obj9).c() instanceof CharSequence) {
                arrayList9.add(obj9);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj10 : properties) {
            if (((p) obj10).c() instanceof Path) {
                arrayList10.add(obj10);
            }
        }
        this(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10);
    }
}
