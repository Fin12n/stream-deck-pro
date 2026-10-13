package p168t1;

import A1.d;
import Q6.k;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f34012a = new P();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadLocal f34013b = new ThreadLocal();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f34014a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(1);
            this.f34014a = dVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(B.a aVar) {
            return '\'' + aVar.c() + "' " + aVar.b(this.f34014a);
        }
    }

    public final Typeface a(Typeface typeface, B.d dVar, Context context) {
        if (typeface == null) {
            return null;
        }
        if (dVar.a().isEmpty()) {
            return typeface;
        }
        Paint paint = (Paint) f34013b.get();
        if (paint == null) {
            paint = new Paint();
            f34013b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(dVar, context));
        return paint.getTypeface();
    }

    public final String b(B.d dVar, Context context) {
        return C1.a.d(dVar.a(), null, null, null, 0, null, new a(A1.a.a(context)), 31, null);
    }
}
