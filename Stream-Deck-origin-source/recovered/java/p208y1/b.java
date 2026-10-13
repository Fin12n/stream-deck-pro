package p208y1;

import Q0.l;
import R0.P0;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p192w1.h;
import p215z0.InterfaceC3164l0;
import p215z0.g1;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P0 f38232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3164l0 f38234c = l1.e(l.c(l.f9103b.a()), null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1 f38235d = g1.d(new a());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Shader invoke() {
            if (b.this.b() == l.f9103b.a() || l.k(b.this.b())) {
                return null;
            }
            return b.this.a().b(b.this.b());
        }
    }

    public b(P0 p8, float f8) {
        this.f38232a = p8;
        this.f38233b = f8;
    }

    public final P0 a() {
        return this.f38232a;
    }

    public final long b() {
        return ((l) this.f38234c.getValue()).m();
    }

    public final void c(long j8) {
        this.f38234c.setValue(l.c(j8));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        h.a(textPaint, this.f38233b);
        textPaint.setShader((Shader) this.f38235d.getValue());
    }
}
