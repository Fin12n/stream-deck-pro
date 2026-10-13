package p192w1;

import Q0.m;
import R0.AbstractC1582d0;
import R0.AbstractC1584e0;
import R0.InterfaceC1586f0;
import R0.P0;
import R0.R0;
import R0.U0;
import T0.g;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;
import p128o1.C2744i;
import p128o1.o;
import p216z1.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(C2744i c2744i, InterfaceC1586f0 interfaceC1586f0, AbstractC1582d0 abstractC1582d0, float f8, R0 r8, k kVar, g gVar, int i8) {
        interfaceC1586f0.k();
        if (c2744i.w().size() <= 1 || (abstractC1582d0 instanceof U0)) {
            b(c2744i, interfaceC1586f0, abstractC1582d0, f8, r8, kVar, gVar, i8);
        } else if (abstractC1582d0 instanceof P0) {
            List listW = c2744i.w();
            int size = listW.size();
            float fMax = 0.0f;
            float f9 = 0.0f;
            for (int i9 = 0; i9 < size; i9++) {
                o oVar = (o) listW.get(i9);
                f9 += oVar.e().f();
                fMax = Math.max(fMax, oVar.e().g());
            }
            Shader shaderB = ((P0) abstractC1582d0).b(m.a(fMax, f9));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            List listW2 = c2744i.w();
            int size2 = listW2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                o oVar2 = (o) listW2.get(i10);
                oVar2.e().v(interfaceC1586f0, AbstractC1584e0.a(shaderB), f8, r8, kVar, gVar, i8);
                interfaceC1586f0.d(0.0f, oVar2.e().f());
                matrix.setTranslate(0.0f, -oVar2.e().f());
                shaderB.setLocalMatrix(matrix);
            }
        }
        interfaceC1586f0.x();
    }

    public static final void b(C2744i c2744i, InterfaceC1586f0 interfaceC1586f0, AbstractC1582d0 abstractC1582d0, float f8, R0 r8, k kVar, g gVar, int i8) {
        List listW = c2744i.w();
        int size = listW.size();
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) listW.get(i9);
            oVar.e().v(interfaceC1586f0, abstractC1582d0, f8, r8, kVar, gVar, i8);
            interfaceC1586f0.d(0.0f, oVar.e().f());
        }
    }
}
