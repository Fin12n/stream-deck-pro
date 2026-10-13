package p022c3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p004a3.J;
import p031d3.a;
import p076i3.n;
import p076i3.o;
import p085j3.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class q implements s, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f16187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f16189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f16190d;

    public q(J j8, b bVar, n nVar) {
        this.f16187a = j8;
        this.f16188b = nVar.c();
        a aVarA = nVar.b().a();
        this.f16189c = aVarA;
        bVar.i(aVarA);
        aVarA.a(this);
    }

    public static int c(int i8, int i9) {
        int i10 = i8 / i9;
        return ((i8 ^ i9) >= 0 || i9 * i10 == i8) ? i10 : i10 - 1;
    }

    public static int e(int i8, int i9) {
        return i8 - (c(i8, i9) * i9);
    }

    @Override // d3.a.b
    public void a() {
        this.f16187a.invalidateSelf();
    }

    public a g() {
        return this.f16189c;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    @Override // p022c3.s
    public o h(o oVar) {
        boolean z8;
        List listA = oVar.a();
        if (listA.size() > 2) {
            float fFloatValue = ((Float) this.f16189c.h()).floatValue();
            if (fFloatValue != 0.0f) {
                o oVarI = i(oVar);
                oVarI.f(oVar.b().x, oVar.b().y);
                List listA2 = oVarI.a();
                boolean zD = oVar.d();
                int i8 = 0;
                int i9 = 0;
                while (i8 < listA.size()) {
                    p058g3.a aVar = (p058g3.a) listA.get(i8);
                    p058g3.a aVar2 = (p058g3.a) listA.get(e(i8 - 1, listA.size()));
                    p058g3.a aVar3 = (p058g3.a) listA.get(e(i8 - 2, listA.size()));
                    PointF pointFC = (i8 != 0 || zD) ? aVar2.c() : oVar.b();
                    PointF pointFB = (i8 != 0 || zD) ? aVar2.b() : pointFC;
                    PointF pointFA = aVar.a();
                    PointF pointFC2 = aVar3.c();
                    PointF pointFC3 = aVar.c();
                    if (oVar.d()) {
                        z8 = false;
                    } else {
                        z8 = true;
                        if (i8 != 0 && i8 != listA.size() - 1) {
                            z8 = false;
                        }
                    }
                    if (pointFB.equals(pointFC) && pointFA.equals(pointFC) && !z8) {
                        float f8 = pointFC.x;
                        float f9 = f8 - pointFC2.x;
                        float f10 = pointFC.y;
                        float f11 = f10 - pointFC2.y;
                        float f12 = pointFC3.x - f8;
                        float f13 = pointFC3.y - f10;
                        float fHypot = (float) Math.hypot(f9, f11);
                        float fHypot2 = (float) Math.hypot(f12, f13);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f14 = pointFC.x;
                        float f15 = ((pointFC2.x - f14) * fMin) + f14;
                        float f16 = pointFC.y;
                        float f17 = ((pointFC2.y - f16) * fMin) + f16;
                        float f18 = ((pointFC3.x - f14) * fMin2) + f14;
                        float f19 = ((pointFC3.y - f16) * fMin2) + f16;
                        float f20 = f15 - ((f15 - f14) * 0.5519f);
                        float f21 = f17 - ((f17 - f16) * 0.5519f);
                        float f22 = f18 - ((f18 - f14) * 0.5519f);
                        float f23 = f19 - ((f19 - f16) * 0.5519f);
                        p058g3.a aVar4 = (p058g3.a) listA2.get(e(i9 - 1, listA2.size()));
                        p058g3.a aVar5 = (p058g3.a) listA2.get(i9);
                        aVar4.e(f15, f17);
                        aVar4.f(f15, f17);
                        if (i8 == 0) {
                            oVarI.f(f15, f17);
                        }
                        aVar5.d(f20, f21);
                        p058g3.a aVar6 = (p058g3.a) listA2.get(i9 + 1);
                        aVar5.e(f22, f23);
                        aVar5.f(f18, f19);
                        aVar6.d(f18, f19);
                        i9 += 2;
                    } else {
                        p058g3.a aVar7 = (p058g3.a) listA2.get(e(i9 - 1, listA2.size()));
                        p058g3.a aVar8 = (p058g3.a) listA2.get(i9);
                        aVar7.e(aVar2.b().x, aVar2.b().y);
                        aVar7.f(aVar2.c().x, aVar2.c().y);
                        aVar8.d(aVar.a().x, aVar.a().y);
                        i9++;
                    }
                    i8++;
                    listA = listA;
                }
                return oVarI;
            }
        }
        return oVar;
    }

    public final o i(o oVar) {
        List listA = oVar.a();
        boolean zD = oVar.d();
        int size = listA.size() - 1;
        int i8 = 0;
        while (size >= 0) {
            p058g3.a aVar = (p058g3.a) listA.get(size);
            p058g3.a aVar2 = (p058g3.a) listA.get(e(size - 1, listA.size()));
            PointF pointFC = (size != 0 || zD) ? aVar2.c() : oVar.b();
            i8 = (((size != 0 || zD) ? aVar2.b() : pointFC).equals(pointFC) && aVar.a().equals(pointFC) && !(!oVar.d() && (size == 0 || size == listA.size() - 1))) ? i8 + 2 : i8 + 1;
            size--;
        }
        o oVar2 = this.f16190d;
        if (oVar2 == null || oVar2.a().size() != i8) {
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                arrayList.add(new p058g3.a());
            }
            this.f16190d = new o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f16190d.e(zD);
        return this.f16190d;
    }

    @Override // p022c3.c
    public void b(List list, List list2) {
    }
}
