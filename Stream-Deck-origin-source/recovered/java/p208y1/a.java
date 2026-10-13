package p208y1;

import R0.I0;
import R0.P;
import R0.V0;
import R0.W0;
import T0.g;
import T0.j;
import T0.k;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f38231a;

    public a(g gVar) {
        this.f38231a = gVar;
    }

    public final Paint.Cap a(int i8) {
        V0.a aVar = V0.f9341a;
        if (V0.e(i8, aVar.a())) {
            return Paint.Cap.BUTT;
        }
        if (V0.e(i8, aVar.b())) {
            return Paint.Cap.ROUND;
        }
        return V0.e(i8, aVar.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public final Paint.Join b(int i8) {
        W0.a aVar = W0.f9346a;
        if (W0.e(i8, aVar.b())) {
            return Paint.Join.MITER;
        }
        if (W0.e(i8, aVar.c())) {
            return Paint.Join.ROUND;
        }
        return W0.e(i8, aVar.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = this.f38231a;
            if (t.c(gVar, j.f9812a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (gVar instanceof k) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((k) this.f38231a).f());
                textPaint.setStrokeMiter(((k) this.f38231a).d());
                textPaint.setStrokeJoin(b(((k) this.f38231a).c()));
                textPaint.setStrokeCap(a(((k) this.f38231a).b()));
                I0 i0E = ((k) this.f38231a).e();
                textPaint.setPathEffect(i0E != null ? P.a(i0E) : null);
            }
        }
    }
}
