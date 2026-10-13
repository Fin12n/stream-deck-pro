package p085j3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p004a3.C1705k;
import p004a3.J;
import p004a3.N;
import p004a3.X;
import p010b0.m;
import p031d3.o;
import p067h3.k;
import p076i3.q;
import p121n3.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class i extends p085j3.b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final StringBuilder f28253D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final RectF f28254E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Matrix f28255F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Paint f28256G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Paint f28257H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Map f28258I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final m f28259J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final List f28260K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final o f28261L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final J f28262M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C1705k f28263N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public p031d3.a f28264O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public p031d3.a f28265P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public p031d3.a f28266Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public p031d3.a f28267R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public p031d3.a f28268S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public p031d3.a f28269T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public p031d3.a f28270U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public p031d3.a f28271V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public p031d3.a f28272W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public p031d3.a f28273X;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends Paint {
        public a(int i8) {
            super(i8);
            setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends Paint {
        public b(int i8) {
            super(i8);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28276a;

        static {
            int[] iArr = new int[g3.b.a.values().length];
            f28276a = iArr;
            try {
                iArr[g3.b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28276a[g3.b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28276a[g3.b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(J j8, e eVar) {
        p067h3.b bVar;
        p067h3.b bVar2;
        p067h3.a aVar;
        p067h3.a aVar2;
        super(j8, eVar);
        this.f28253D = new StringBuilder(2);
        this.f28254E = new RectF();
        this.f28255F = new Matrix();
        this.f28256G = new a(1);
        this.f28257H = new b(1);
        this.f28258I = new HashMap();
        this.f28259J = new m();
        this.f28260K = new ArrayList();
        this.f28262M = j8;
        this.f28263N = eVar.c();
        o oVarA = eVar.t().a();
        this.f28261L = oVarA;
        oVarA.a(this);
        i(oVarA);
        k kVarU = eVar.u();
        if (kVarU != null && (aVar2 = kVarU.f24416a) != null) {
            p031d3.a aVarA = aVar2.a();
            this.f28264O = aVarA;
            aVarA.a(this);
            i(this.f28264O);
        }
        if (kVarU != null && (aVar = kVarU.f24417b) != null) {
            p031d3.a aVarA2 = aVar.a();
            this.f28266Q = aVarA2;
            aVarA2.a(this);
            i(this.f28266Q);
        }
        if (kVarU != null && (bVar2 = kVarU.f24418c) != null) {
            p031d3.a aVarA3 = bVar2.a();
            this.f28268S = aVarA3;
            aVarA3.a(this);
            i(this.f28268S);
        }
        if (kVarU == null || (bVar = kVarU.f24419d) == null) {
            return;
        }
        p031d3.a aVarA4 = bVar.a();
        this.f28270U = aVarA4;
        aVarA4.a(this);
        i(this.f28270U);
    }

    public final String P(String str, int i8) {
        int iCodePointAt = str.codePointAt(i8);
        int iCharCount = Character.charCount(iCodePointAt) + i8;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!d0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j8 = iCodePointAt;
        if (this.f28259J.d(j8)) {
            return (String) this.f28259J.e(j8);
        }
        this.f28253D.setLength(0);
        while (i8 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i8);
            this.f28253D.appendCodePoint(iCodePointAt3);
            i8 += Character.charCount(iCodePointAt3);
        }
        String string = this.f28253D.toString();
        this.f28259J.i(j8, string);
        return string;
    }

    public final void Q(p058g3.b bVar, int i8) {
        p031d3.a aVar = this.f28265P;
        if (aVar != null) {
            this.f28256G.setColor(((Integer) aVar.h()).intValue());
        } else {
            p031d3.a aVar2 = this.f28264O;
            if (aVar2 != null) {
                this.f28256G.setColor(((Integer) aVar2.h()).intValue());
            } else {
                this.f28256G.setColor(bVar.f23691h);
            }
        }
        p031d3.a aVar3 = this.f28267R;
        if (aVar3 != null) {
            this.f28257H.setColor(((Integer) aVar3.h()).intValue());
        } else {
            p031d3.a aVar4 = this.f28266Q;
            if (aVar4 != null) {
                this.f28257H.setColor(((Integer) aVar4.h()).intValue());
            } else {
                this.f28257H.setColor(bVar.f23692i);
            }
        }
        int iIntValue = ((((this.f28185x.h() == null ? 100 : ((Integer) this.f28185x.h().h()).intValue()) * 255) / 100) * i8) / 255;
        this.f28256G.setAlpha(iIntValue);
        this.f28257H.setAlpha(iIntValue);
        p031d3.a aVar5 = this.f28269T;
        if (aVar5 != null) {
            this.f28257H.setStrokeWidth(((Float) aVar5.h()).floatValue());
            return;
        }
        p031d3.a aVar6 = this.f28268S;
        if (aVar6 != null) {
            this.f28257H.setStrokeWidth(((Float) aVar6.h()).floatValue());
        } else {
            this.f28257H.setStrokeWidth(bVar.f23693j * j.e());
        }
    }

    public final void R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final void S(p058g3.d dVar, float f8, p058g3.b bVar, Canvas canvas) {
        List listA0 = a0(dVar);
        for (int i8 = 0; i8 < listA0.size(); i8++) {
            Path pathW = ((p022c3.d) listA0.get(i8)).w();
            pathW.computeBounds(this.f28254E, false);
            this.f28255F.reset();
            this.f28255F.preTranslate(0.0f, (-bVar.f23690g) * j.e());
            this.f28255F.preScale(f8, f8);
            pathW.transform(this.f28255F);
            if (bVar.f23694k) {
                V(pathW, this.f28256G, canvas);
                V(pathW, this.f28257H, canvas);
            } else {
                V(pathW, this.f28257H, canvas);
                V(pathW, this.f28256G, canvas);
            }
        }
    }

    public final void T(String str, p058g3.b bVar, Canvas canvas) {
        if (bVar.f23694k) {
            R(str, this.f28256G, canvas);
            R(str, this.f28257H, canvas);
        } else {
            R(str, this.f28257H, canvas);
            R(str, this.f28256G, canvas);
        }
    }

    public final void U(String str, p058g3.b bVar, Canvas canvas, float f8) {
        int length = 0;
        while (length < str.length()) {
            String strP = P(str, length);
            length += strP.length();
            T(strP, bVar, canvas);
            canvas.translate(this.f28256G.measureText(strP) + f8, 0.0f);
        }
    }

    public final void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void W(String str, p058g3.b bVar, p058g3.c cVar, Canvas canvas, float f8, float f9, float f10) {
        for (int i8 = 0; i8 < str.length(); i8++) {
            p058g3.d dVar = (p058g3.d) this.f28263N.c().f(p058g3.d.c(str.charAt(i8), cVar.a(), cVar.c()));
            if (dVar != null) {
                S(dVar, f9, bVar, canvas);
                canvas.translate((((float) dVar.b()) * f9 * j.e()) + f10, 0.0f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca A[SYNTHETIC] */
    public final void X(p058g3.b bVar, p058g3.c cVar, Canvas canvas) {
        float fFloatValue;
        float fE;
        List listB0;
        int size;
        int i8;
        int i9;
        PointF pointF;
        float f8;
        List listF0;
        int i10;
        d dVar;
        Typeface typefaceC0 = c0(cVar);
        if (typefaceC0 != null) {
            String strC = bVar.f23684a;
            X xA0 = this.f28262M.a0();
            if (xA0 != null) {
                strC = xA0.c(getName(), strC);
            }
            this.f28256G.setTypeface(typefaceC0);
            p031d3.a aVar = this.f28272W;
            float fFloatValue2 = aVar != null ? ((Float) aVar.h()).floatValue() : bVar.f23686c;
            this.f28256G.setTextSize(j.e() * fFloatValue2);
            this.f28257H.setTypeface(this.f28256G.getTypeface());
            this.f28257H.setTextSize(this.f28256G.getTextSize());
            float f9 = bVar.f23688e / 10.0f;
            p031d3.a aVar2 = this.f28271V;
            if (aVar2 != null) {
                fFloatValue = ((Float) aVar2.h()).floatValue();
            } else {
                p031d3.a aVar3 = this.f28270U;
                if (aVar3 != null) {
                    fFloatValue = ((Float) aVar3.h()).floatValue();
                }
                fE = ((f9 * j.e()) * fFloatValue2) / 100.0f;
                listB0 = b0(strC);
                size = listB0.size();
                i8 = 0;
                i9 = -1;
                while (i8 < size) {
                    String str = (String) listB0.get(i8);
                    pointF = bVar.f23696m;
                    if (pointF == null) {
                        f8 = 0.0f;
                    } else {
                        f8 = pointF.x;
                    }
                    p058g3.c cVar2 = cVar;
                    listF0 = f0(str, f8, cVar2, 0.0f, fE, false);
                    for (i10 = 0; i10 < listF0.size(); i10++) {
                        dVar = (d) listF0.get(i10);
                        i9++;
                        canvas.save();
                        if (e0(canvas, bVar, i9, dVar.f28278b)) {
                            U(dVar.f28277a, bVar, canvas, fE);
                        }
                        canvas.restore();
                    }
                    i8++;
                    cVar = cVar2;
                }
            }
            f9 += fFloatValue;
            fE = ((f9 * j.e()) * fFloatValue2) / 100.0f;
            listB0 = b0(strC);
            size = listB0.size();
            i8 = 0;
            i9 = -1;
            while (i8 < size) {
                String str2 = (String) listB0.get(i8);
                pointF = bVar.f23696m;
                if (pointF == null) {
                    f8 = 0.0f;
                } else {
                    f8 = pointF.x;
                }
                p058g3.c cVar3 = cVar;
                listF0 = f0(str2, f8, cVar3, 0.0f, fE, false);
                while (i10 < listF0.size()) {
                    dVar = (d) listF0.get(i10);
                    i9++;
                    canvas.save();
                    if (e0(canvas, bVar, i9, dVar.f28278b)) {
                        U(dVar.f28277a, bVar, canvas, fE);
                    }
                    canvas.restore();
                }
                i8++;
                cVar = cVar3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    public final void Y(p058g3.b bVar, Matrix matrix, p058g3.c cVar, Canvas canvas) {
        float fFloatValue;
        float f8;
        int i8;
        int i9;
        PointF pointF;
        float f9;
        List listF0;
        int i10;
        d dVar;
        float f10;
        float f11;
        i iVar = this;
        p058g3.b bVar2 = bVar;
        p031d3.a aVar = iVar.f28272W;
        float fFloatValue2 = (aVar != null ? ((Float) aVar.h()).floatValue() : bVar2.f23686c) / 100.0f;
        float fG = j.g(matrix);
        List listB0 = iVar.b0(bVar2.f23684a);
        int size = listB0.size();
        float f12 = bVar2.f23688e / 10.0f;
        p031d3.a aVar2 = iVar.f28271V;
        if (aVar2 == null) {
            p031d3.a aVar3 = iVar.f28270U;
            if (aVar3 != null) {
                fFloatValue = ((Float) aVar3.h()).floatValue();
            }
            f8 = f12;
            i8 = -1;
            i9 = 0;
            while (i9 < size) {
                String str = (String) listB0.get(i9);
                pointF = bVar2.f23696m;
                if (pointF == null) {
                    f9 = 0.0f;
                } else {
                    f9 = pointF.x;
                }
                listF0 = iVar.f0(str, f9, cVar, fFloatValue2, f8, true);
                i10 = 0;
                while (i10 < listF0.size()) {
                    dVar = (d) listF0.get(i10);
                    i8++;
                    canvas.save();
                    if (iVar.e0(canvas, bVar2, i8, dVar.f28278b)) {
                        float f13 = fFloatValue2;
                        p058g3.b bVar3 = bVar2;
                        f10 = f8;
                        f11 = fG;
                        iVar.W(dVar.f28277a, bVar3, cVar, canvas, f11, f13, f10);
                        fFloatValue2 = f13;
                    } else {
                        f10 = f8;
                        f11 = fG;
                    }
                    canvas.restore();
                    i10++;
                    iVar = this;
                    fG = f11;
                    f8 = f10;
                    bVar2 = bVar;
                }
                i9++;
                iVar = this;
                f8 = f8;
                bVar2 = bVar;
            }
        }
        fFloatValue = ((Float) aVar2.h()).floatValue();
        f12 += fFloatValue;
        f8 = f12;
        i8 = -1;
        i9 = 0;
        while (i9 < size) {
            String str2 = (String) listB0.get(i9);
            pointF = bVar2.f23696m;
            if (pointF == null) {
                f9 = 0.0f;
            } else {
                f9 = pointF.x;
            }
            listF0 = iVar.f0(str2, f9, cVar, fFloatValue2, f8, true);
            i10 = 0;
            while (i10 < listF0.size()) {
                dVar = (d) listF0.get(i10);
                i8++;
                canvas.save();
                if (iVar.e0(canvas, bVar2, i8, dVar.f28278b)) {
                    float f14 = fFloatValue2;
                    p058g3.b bVar4 = bVar2;
                    f10 = f8;
                    f11 = fG;
                    iVar.W(dVar.f28277a, bVar4, cVar, canvas, f11, f14, f10);
                    fFloatValue2 = f14;
                } else {
                    f10 = f8;
                    f11 = fG;
                }
                canvas.restore();
                i10++;
                iVar = this;
                fG = f11;
                f8 = f10;
                bVar2 = bVar;
            }
            i9++;
            iVar = this;
            f8 = f8;
            bVar2 = bVar;
        }
    }

    public final d Z(int i8) {
        for (int size = this.f28260K.size(); size < i8; size++) {
            this.f28260K.add(new d(null));
        }
        return (d) this.f28260K.get(i8 - 1);
    }

    public final List a0(p058g3.d dVar) {
        if (this.f28258I.containsKey(dVar)) {
            return (List) this.f28258I.get(dVar);
        }
        List listA = dVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new p022c3.d(this.f28262M, this, (q) listA.get(i8), this.f28263N));
        }
        this.f28258I.put(dVar, arrayList);
        return arrayList;
    }

    public final List b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // p085j3.b, p058g3.f
    public void c(Object obj, p130o3.c cVar) {
        super.c(obj, cVar);
        if (obj == N.f13147a) {
            p031d3.a aVar = this.f28265P;
            if (aVar != null) {
                H(aVar);
            }
            if (cVar == null) {
                this.f28265P = null;
                return;
            }
            p031d3.q qVar = new p031d3.q(cVar);
            this.f28265P = qVar;
            qVar.a(this);
            i(this.f28265P);
            return;
        }
        if (obj == N.f13148b) {
            p031d3.a aVar2 = this.f28267R;
            if (aVar2 != null) {
                H(aVar2);
            }
            if (cVar == null) {
                this.f28267R = null;
                return;
            }
            p031d3.q qVar2 = new p031d3.q(cVar);
            this.f28267R = qVar2;
            qVar2.a(this);
            i(this.f28267R);
            return;
        }
        if (obj == N.f13165s) {
            p031d3.a aVar3 = this.f28269T;
            if (aVar3 != null) {
                H(aVar3);
            }
            if (cVar == null) {
                this.f28269T = null;
                return;
            }
            p031d3.q qVar3 = new p031d3.q(cVar);
            this.f28269T = qVar3;
            qVar3.a(this);
            i(this.f28269T);
            return;
        }
        if (obj == N.f13166t) {
            p031d3.a aVar4 = this.f28271V;
            if (aVar4 != null) {
                H(aVar4);
            }
            if (cVar == null) {
                this.f28271V = null;
                return;
            }
            p031d3.q qVar4 = new p031d3.q(cVar);
            this.f28271V = qVar4;
            qVar4.a(this);
            i(this.f28271V);
            return;
        }
        if (obj == N.f13136F) {
            p031d3.a aVar5 = this.f28272W;
            if (aVar5 != null) {
                H(aVar5);
            }
            if (cVar == null) {
                this.f28272W = null;
                return;
            }
            p031d3.q qVar5 = new p031d3.q(cVar);
            this.f28272W = qVar5;
            qVar5.a(this);
            i(this.f28272W);
            return;
        }
        if (obj != N.f13143M) {
            if (obj == N.f13145O) {
                this.f28261L.r(cVar);
                return;
            }
            return;
        }
        p031d3.a aVar6 = this.f28273X;
        if (aVar6 != null) {
            H(aVar6);
        }
        if (cVar == null) {
            this.f28273X = null;
            return;
        }
        p031d3.q qVar6 = new p031d3.q(cVar);
        this.f28273X = qVar6;
        qVar6.a(this);
        i(this.f28273X);
    }

    public final Typeface c0(p058g3.c cVar) {
        Typeface typeface;
        p031d3.a aVar = this.f28273X;
        if (aVar != null && (typeface = (Typeface) aVar.h()) != null) {
            return typeface;
        }
        Typeface typefaceB0 = this.f28262M.b0(cVar);
        return typefaceB0 != null ? typefaceB0 : cVar.d();
    }

    @Override // p085j3.b, p022c3.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        super.d(rectF, matrix, z8);
        rectF.set(0.0f, 0.0f, this.f28263N.b().width(), this.f28263N.b().height());
    }

    public final boolean d0(int i8) {
        return Character.getType(i8) == 16 || Character.getType(i8) == 27 || Character.getType(i8) == 6 || Character.getType(i8) == 28 || Character.getType(i8) == 8 || Character.getType(i8) == 19;
    }

    public final boolean e0(Canvas canvas, p058g3.b bVar, int i8, float f8) {
        PointF pointF = bVar.f23695l;
        PointF pointF2 = bVar.f23696m;
        float fE = j.e();
        float f9 = (i8 * bVar.f23689f * fE) + (pointF == null ? 0.0f : (bVar.f23689f * fE) + pointF.y);
        if (this.f28262M.H() && pointF2 != null && pointF != null && f9 >= pointF.y + pointF2.y + bVar.f23686c) {
            return false;
        }
        float f10 = pointF == null ? 0.0f : pointF.x;
        float f11 = pointF2 != null ? pointF2.x : 0.0f;
        int i9 = c.f28276a[bVar.f23687d.ordinal()];
        if (i9 == 1) {
            canvas.translate(f10, f9);
        } else if (i9 == 2) {
            canvas.translate((f10 + f11) - f8, f9);
        } else if (i9 == 3) {
            canvas.translate((f10 + (f11 / 2.0f)) - (f8 / 2.0f), f9);
        }
        return true;
    }

    public final List f0(String str, float f8, p058g3.c cVar, float f9, float f10, boolean z8) {
        float fMeasureText;
        int i8 = 0;
        int i9 = 0;
        boolean z9 = false;
        int i10 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (z8) {
                p058g3.d dVar = (p058g3.d) this.f28263N.c().f(p058g3.d.c(cCharAt, cVar.a(), cVar.c()));
                if (dVar != null) {
                    fMeasureText = ((float) dVar.b()) * f9 * j.e();
                }
            } else {
                fMeasureText = this.f28256G.measureText(str.substring(i11, i11 + 1));
            }
            float f14 = fMeasureText + f10;
            if (cCharAt == ' ') {
                z9 = true;
                f13 = f14;
            } else if (z9) {
                z9 = false;
                i10 = i11;
                f12 = f14;
            } else {
                f12 += f14;
            }
            f11 += f14;
            if (f8 > 0.0f && f11 >= f8 && cCharAt != ' ') {
                i8++;
                d dVarZ = Z(i8);
                if (i10 == i9) {
                    String strSubstring = str.substring(i9, i11);
                    String strTrim = strSubstring.trim();
                    dVarZ.c(strTrim, (f11 - f14) - ((strTrim.length() - strSubstring.length()) * f13));
                    i9 = i11;
                    i10 = i9;
                    f11 = f14;
                    f12 = f11;
                } else {
                    String strSubstring2 = str.substring(i9, i10 - 1);
                    String strTrim2 = strSubstring2.trim();
                    dVarZ.c(strTrim2, ((f11 - f12) - ((strSubstring2.length() - strTrim2.length()) * f13)) - f13);
                    f11 = f12;
                    i9 = i10;
                }
            }
        }
        if (f11 > 0.0f) {
            i8++;
            Z(i8).c(str.substring(i9), f11);
        }
        return this.f28260K.subList(0, i8);
    }

    @Override // p085j3.b
    public void t(Canvas canvas, Matrix matrix, int i8) {
        p058g3.b bVar = (p058g3.b) this.f28261L.h();
        p058g3.c cVar = (p058g3.c) this.f28263N.g().get(bVar.f23685b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Q(bVar, i8);
        if (this.f28262M.T0()) {
            Y(bVar, matrix, cVar, canvas);
        } else {
            X(bVar, cVar, canvas);
        }
        canvas.restore();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f28278b;

        public d() {
            this.f28277a = "";
            this.f28278b = 0.0f;
        }

        public void c(String str, float f8) {
            this.f28277a = str;
            this.f28278b = f8;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}
