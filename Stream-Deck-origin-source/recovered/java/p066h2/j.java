package p066h2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.f;
import io.jentz.winter.js.HRHLwtyqJWz;
import p075i2.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f24405d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f24407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f24408c = 0;

    public j(f fVar, int i8) {
        this.f24407b = fVar;
        this.f24406a = i8;
    }

    public void a(Canvas canvas, float f8, float f9, Paint paint) {
        Typeface typefaceG = this.f24407b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f24407b.c(), this.f24406a * 2, 2, f8, f9, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i8) {
        return g().h(i8);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f24408c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final a g() {
        ThreadLocal threadLocal = f24405d;
        a aVar = (a) threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        this.f24407b.d().j(aVar, this.f24406a);
        return aVar;
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f24408c & 4) > 0;
    }

    public void l(boolean z8) {
        int iD = d();
        if (z8) {
            this.f24408c = iD | 4;
        } else {
            this.f24408c = iD;
        }
    }

    public void m(boolean z8) {
        int i8 = this.f24408c & 4;
        this.f24408c = z8 ? i8 | 2 : i8 | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(HRHLwtyqJWz.ZTuXF);
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i8 = 0; i8 < iC; i8++) {
            sb.append(Integer.toHexString(b(i8)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
