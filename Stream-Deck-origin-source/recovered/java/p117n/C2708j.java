package p117n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p054g.c;
import p054g.d;
import p054g.e;

/* JADX INFO: renamed from: n.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2708j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f30395b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2708j f30396c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f30397a;

    /* JADX INFO: renamed from: n.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f30398a = {e.f22434R, e.f22432P, e.f22436a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f30399b = {e.f22450o, e.f22418B, e.f22455t, e.f22451p, e.f22452q, e.f22454s, e.f22453r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f30400c = {e.f22431O, e.f22433Q, e.f22446k, e.f22427K, e.f22428L, e.f22429M, e.f22430N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f30401d = {e.f22458w, e.f22444i, e.f22457v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f30402e = {e.f22426J, e.f22435S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f30403f = {e.f22438c, e.f22442g, e.f22439d, e.f22443h};

        @Override // n.O.c
        public Drawable a(O o8, Context context, int i8) {
            if (i8 == e.f22445j) {
                return new LayerDrawable(new Drawable[]{o8.i(context, e.f22444i), o8.i(context, e.f22446k)});
            }
            if (i8 == e.f22460y) {
                return l(o8, context, d.f22414i);
            }
            if (i8 == e.f22459x) {
                return l(o8, context, d.f22415j);
            }
            if (i8 == e.f22461z) {
                return l(o8, context, d.f22416k);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
        @Override // n.O.c
        public boolean b(Context context, int i8, Drawable drawable) {
            int i9;
            boolean z8;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = C2708j.f30395b;
            if (!f(this.f30398a, i8)) {
                if (f(this.f30400c, i8)) {
                    i9 = p054g.a.f22393w;
                } else {
                    if (f(this.f30401d, i8)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i8 == e.f22456u) {
                            iRound = Math.round(40.8f);
                            i9 = 16842800;
                            mode = mode;
                        } else if (i8 != e.f22447l) {
                            i9 = 0;
                            z8 = false;
                            iRound = -1;
                        }
                        z8 = true;
                    }
                    mode = mode;
                    iRound = -1;
                    i9 = 16842801;
                    z8 = true;
                }
                if (z8) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C2708j.e(T.c(context, i9), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i9 = p054g.a.f22395y;
            z8 = true;
            iRound = -1;
            if (z8) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(C2708j.e(T.c(context, i9), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // n.O.c
        public PorterDuff.Mode c(int i8) {
            if (i8 == e.f22424H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // n.O.c
        public ColorStateList d(Context context, int i8) {
            if (i8 == e.f22448m) {
                return p072i.a.a(context, c.f22402e);
            }
            if (i8 == e.f22425I) {
                return p072i.a.a(context, c.f22405h);
            }
            if (i8 == e.f22424H) {
                return k(context);
            }
            if (i8 == e.f22441f) {
                return j(context);
            }
            if (i8 == e.f22437b) {
                return g(context);
            }
            if (i8 == e.f22440e) {
                return i(context);
            }
            if (i8 == e.f22420D || i8 == e.f22421E) {
                return p072i.a.a(context, c.f22404g);
            }
            if (f(this.f30399b, i8)) {
                return T.e(context, p054g.a.f22395y);
            }
            if (f(this.f30402e, i8)) {
                return p072i.a.a(context, c.f22401d);
            }
            if (f(this.f30403f, i8)) {
                return p072i.a.a(context, c.f22400c);
            }
            if (i8 == e.f22417A) {
                return p072i.a.a(context, c.f22403f);
            }
            return null;
        }

        @Override // n.O.c
        public boolean e(Context context, int i8, Drawable drawable) {
            if (i8 == e.f22419C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), T.c(context, p054g.a.f22395y), C2708j.f30395b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), T.c(context, p054g.a.f22395y), C2708j.f30395b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), T.c(context, p054g.a.f22393w), C2708j.f30395b);
                return true;
            }
            if (i8 != e.f22460y && i8 != e.f22459x && i8 != e.f22461z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), T.b(context, p054g.a.f22395y), C2708j.f30395b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), T.c(context, p054g.a.f22393w), C2708j.f30395b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), T.c(context, p054g.a.f22393w), C2708j.f30395b);
            return true;
        }

        public final boolean f(int[] iArr, int i8) {
            for (int i9 : iArr) {
                if (i9 == i8) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i8) {
            int iC = T.c(context, p054g.a.f22394x);
            return new ColorStateList(new int[][]{T.f30321b, T.f30324e, T.f30322c, T.f30328i}, new int[]{T.b(context, p054g.a.f22392v), L1.c.c(iC, i8), L1.c.c(iC, i8), i8});
        }

        public final ColorStateList i(Context context) {
            return h(context, T.c(context, p054g.a.f22391u));
        }

        public final ColorStateList j(Context context) {
            return h(context, T.c(context, p054g.a.f22392v));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = T.e(context, p054g.a.f22396z);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = T.f30321b;
                iArr2[0] = T.b(context, p054g.a.f22396z);
                iArr[1] = T.f30325f;
                iArr2[1] = T.c(context, p054g.a.f22393w);
                iArr[2] = T.f30328i;
                iArr2[2] = T.c(context, p054g.a.f22396z);
            } else {
                int[] iArr3 = T.f30321b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = T.f30325f;
                iArr2[1] = T.c(context, p054g.a.f22393w);
                iArr[2] = T.f30328i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(O o8, Context context, int i8) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i8);
            Drawable drawableI = o8.i(context, e.f22422F);
            Drawable drawableI2 = o8.i(context, e.f22423G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i8, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C2708j.f30395b;
            }
            drawableMutate.setColorFilter(C2708j.e(i8, mode));
        }
    }

    public static synchronized C2708j b() {
        try {
            if (f30396c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f30396c;
    }

    public static synchronized PorterDuffColorFilter e(int i8, PorterDuff.Mode mode) {
        return O.k(i8, mode);
    }

    public static synchronized void h() {
        if (f30396c == null) {
            C2708j c2708j = new C2708j();
            f30396c = c2708j;
            c2708j.f30397a = O.g();
            f30396c.f30397a.t(new a());
        }
    }

    public static void i(Drawable drawable, V v8, int[] iArr) {
        O.v(drawable, v8, iArr);
    }

    public synchronized Drawable c(Context context, int i8) {
        return this.f30397a.i(context, i8);
    }

    public synchronized Drawable d(Context context, int i8, boolean z8) {
        return this.f30397a.j(context, i8, z8);
    }

    public synchronized ColorStateList f(Context context, int i8) {
        return this.f30397a.l(context, i8);
    }

    public synchronized void g(Context context) {
        this.f30397a.r(context);
    }
}
