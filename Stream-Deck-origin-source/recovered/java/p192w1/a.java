package p192w1;

import A1.d;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import kotlin.jvm.internal.t;
import p128o1.B;
import p128o1.C2739d;
import p128o1.K;
import p128o1.L;
import p168t1.AbstractC3001f;
import p168t1.AbstractC3009n;
import p168t1.C;
import p168t1.E;
import p168t1.y;
import p168t1.z;
import p200x1.f;
import p216z1.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(SpannableString spannableString, B b8, int i8, int i9, d dVar, AbstractC3009n.b bVar) {
        p200x1.d.k(spannableString, b8.g(), i8, i9);
        p200x1.d.o(spannableString, b8.k(), dVar, i8, i9);
        if (b8.n() != null || b8.l() != null) {
            C cN = b8.n();
            if (cN == null) {
                cN = C.f33980b.c();
            }
            y yVarL = b8.l();
            spannableString.setSpan(new StyleSpan(AbstractC3001f.c(cN, yVarL != null ? yVarL.i() : y.f34112b.b())), i8, i9, 33);
        }
        if (b8.i() != null) {
            if (b8.i() instanceof E) {
                spannableString.setSpan(new TypefaceSpan(((E) b8.i()).s()), i8, i9, 33);
            } else {
                AbstractC3009n abstractC3009nI = b8.i();
                z zVarM = b8.m();
                Object value = AbstractC3009n.b.a(bVar, abstractC3009nI, null, 0, zVarM != null ? zVarM.m() : z.f34116b.a(), 6, null).getValue();
                t.e(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(i.f36742a.a((Typeface) value), i8, i9, 33);
            }
        }
        if (b8.s() != null) {
            k kVarS = b8.s();
            k.a aVar = k.f39019b;
            if (kVarS.d(aVar.d())) {
                spannableString.setSpan(new UnderlineSpan(), i8, i9, 33);
            }
            if (b8.s().d(aVar.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i8, i9, 33);
            }
        }
        if (b8.u() != null) {
            spannableString.setSpan(new ScaleXSpan(b8.u().b()), i8, i9, 33);
        }
        p200x1.d.s(spannableString, b8.p(), i8, i9);
        p200x1.d.h(spannableString, b8.d(), i8, i9);
    }

    public static final SpannableString b(C2739d c2739d, d dVar, AbstractC3009n.b bVar, s sVar) {
        SpannableString spannableString = new SpannableString(c2739d.i());
        List listG = c2739d.g();
        if (listG != null) {
            int size = listG.size();
            for (int i8 = 0; i8 < size; i8++) {
                C2739d.b bVar2 = (C2739d.b) listG.get(i8);
                a(spannableString, B.b((B) bVar2.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), bVar2.b(), bVar2.c(), dVar, bVar);
            }
        }
        List listJ = c2739d.j(0, c2739d.length());
        int size2 = listJ.size();
        for (int i9 = 0; i9 < size2; i9++) {
            C2739d.b bVar3 = (C2739d.b) listJ.get(i9);
            spannableString.setSpan(f.a((K) bVar3.a()), bVar3.b(), bVar3.c(), 33);
        }
        List listK = c2739d.k(0, c2739d.length());
        int size3 = listK.size();
        for (int i10 = 0; i10 < size3; i10++) {
            C2739d.b bVar4 = (C2739d.b) listK.get(i10);
            spannableString.setSpan(sVar.a((L) bVar4.a()), bVar4.b(), bVar4.c(), 33);
        }
        return spannableString;
    }
}
