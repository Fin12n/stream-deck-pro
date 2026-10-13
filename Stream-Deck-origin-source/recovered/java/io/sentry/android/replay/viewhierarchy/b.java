package io.sentry.android.replay.viewhierarchy;

import C6.o;
import Q6.k;
import Z6.w;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import io.sentry.J2;
import io.sentry.android.replay.e;
import io.sentry.android.replay.util.m;
import io.sentry.android.replay.util.n;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f26927m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f26928n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f26935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f26938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f26939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f26940l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final b a(View view, b bVar, int i8, J2 options) {
            Drawable drawable;
            t.g(view, "view");
            t.g(options, "options");
            o oVarE = n.e(view);
            boolean zBooleanValue = ((Boolean) oVarE.a()).booleanValue();
            Rect rect = (Rect) oVarE.b();
            boolean z8 = zBooleanValue && e(view, options);
            if (!(view instanceof TextView)) {
                if (!(view instanceof ImageView)) {
                    return new C0600b(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (bVar != null ? bVar.a() : 0.0f) + view.getElevation(), i8, bVar, z8, false, zBooleanValue, rect);
                }
                if (bVar != null) {
                    bVar.g(true);
                }
                ImageView imageView = (ImageView) view;
                return new c(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), (bVar != null ? bVar.a() : 0.0f) + imageView.getElevation(), i8, bVar, z8 && (drawable = imageView.getDrawable()) != null && n.d(drawable), true, zBooleanValue, rect);
            }
            if (bVar != null) {
                bVar.g(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            io.sentry.android.replay.util.a aVar = layout != null ? new io.sentry.android.replay.util.a(layout) : null;
            int iG = n.g(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int iB = n.b(textView);
            float x8 = textView.getX();
            float y8 = textView.getY();
            int width = textView.getWidth();
            float fA = 0.0f;
            int height = textView.getHeight();
            if (bVar != null) {
                fA = bVar.a();
            }
            return new d(aVar, Integer.valueOf(iG), totalPaddingLeft, iB, x8, y8, width, height, fA + textView.getElevation(), i8, bVar, z8, true, zBooleanValue, rect);
        }

        public final boolean b(Class cls, Set set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        public final boolean c(View view, J2 j8) {
            String strF = j8.getSessionReplay().f();
            if (strF == null) {
                return false;
            }
            return t.c(view.getClass().getName(), strF);
        }

        public final boolean d(ViewParent viewParent, J2 j8) {
            String strN = j8.getSessionReplay().n();
            if (strN == null) {
                return false;
            }
            return t.c(viewParent.getClass().getName(), strN);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0028  */
        /* JADX WARN: Code duplicated, block: B:16:0x0037  */
        /* JADX WARN: Code duplicated, block: B:18:0x003f  */
        /* JADX WARN: Code duplicated, block: B:19:0x0042  */
        /* JADX WARN: Code duplicated, block: B:21:0x0045  */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        /* JADX WARN: Code duplicated, block: B:29:0x0068  */
        /* JADX WARN: Code duplicated, block: B:31:0x006e  */
        /* JADX WARN: Code duplicated, block: B:35:0x0083 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x009b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x009c  */
        public final boolean e(View view, J2 j8) {
            Object tag;
            String str;
            Class<?> cls;
            Set setM;
            ViewParent parent;
            String lowerCase;
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                t.f(lowerCase2, "toLowerCase(...)");
                if (lowerCase2 == null || !w.M(lowerCase2, "sentry-unmask", false, 2, null)) {
                    if (!t.c(view.getTag(e.f26796a), "unmask")) {
                        tag = view.getTag();
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            t.f(lowerCase, "toLowerCase(...)");
                            if (lowerCase != null || !w.M(lowerCase, "sentry-mask", false, 2, null)) {
                                if (!t.c(view.getTag(e.f26796a), "mask")) {
                                    if (!c(view, j8) && view.getParent() != null) {
                                        parent = view.getParent();
                                        t.f(parent, "this.parent");
                                        if (d(parent, j8)) {
                                            return false;
                                        }
                                    }
                                    cls = view.getClass();
                                    setM = j8.getSessionReplay().m();
                                    t.f(setM, "options.sessionReplay.unmaskViewClasses");
                                    if (b(cls, setM)) {
                                        return false;
                                    }
                                    Class<?> cls2 = view.getClass();
                                    Set setE = j8.getSessionReplay().e();
                                    t.f(setE, "options.sessionReplay.maskViewClasses");
                                    return b(cls2, setE);
                                }
                            }
                        } else if (!t.c(view.getTag(e.f26796a), "mask")) {
                            if (!c(view, j8)) {
                                parent = view.getParent();
                                t.f(parent, "this.parent");
                                if (d(parent, j8)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            setM = j8.getSessionReplay().m();
                            t.f(setM, "options.sessionReplay.unmaskViewClasses");
                            if (b(cls, setM)) {
                                return false;
                            }
                            Class<?> cls3 = view.getClass();
                            Set setE2 = j8.getSessionReplay().e();
                            t.f(setE2, "options.sessionReplay.maskViewClasses");
                            return b(cls3, setE2);
                        }
                        return true;
                    }
                }
            } else if (!t.c(view.getTag(e.f26796a), "unmask")) {
                tag = view.getTag();
                if (tag instanceof String) {
                    str = (String) tag;
                } else {
                    str = null;
                }
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    t.f(lowerCase, "toLowerCase(...)");
                    if (lowerCase != null) {
                        if (!t.c(view.getTag(e.f26796a), "mask")) {
                            if (!c(view, j8)) {
                                parent = view.getParent();
                                t.f(parent, "this.parent");
                                if (d(parent, j8)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            setM = j8.getSessionReplay().m();
                            t.f(setM, "options.sessionReplay.unmaskViewClasses");
                            if (b(cls, setM)) {
                                return false;
                            }
                            Class<?> cls4 = view.getClass();
                            Set setE3 = j8.getSessionReplay().e();
                            t.f(setE3, "options.sessionReplay.maskViewClasses");
                            return b(cls4, setE3);
                        }
                    } else if (!t.c(view.getTag(e.f26796a), "mask")) {
                        if (!c(view, j8)) {
                            parent = view.getParent();
                            t.f(parent, "this.parent");
                            if (d(parent, j8)) {
                                return false;
                            }
                        }
                        cls = view.getClass();
                        setM = j8.getSessionReplay().m();
                        t.f(setM, "options.sessionReplay.unmaskViewClasses");
                        if (b(cls, setM)) {
                            return false;
                        }
                        Class<?> cls5 = view.getClass();
                        Set setE4 = j8.getSessionReplay().e();
                        t.f(setE4, "options.sessionReplay.maskViewClasses");
                        return b(cls5, setE4);
                    }
                } else if (!t.c(view.getTag(e.f26796a), "mask")) {
                    if (!c(view, j8)) {
                        parent = view.getParent();
                        t.f(parent, "this.parent");
                        if (d(parent, j8)) {
                            return false;
                        }
                    }
                    cls = view.getClass();
                    setM = j8.getSessionReplay().m();
                    t.f(setM, "options.sessionReplay.unmaskViewClasses");
                    if (b(cls, setM)) {
                        return false;
                    }
                    Class<?> cls6 = view.getClass();
                    Set setE5 = j8.getSessionReplay().e();
                    t.f(setE5, "options.sessionReplay.maskViewClasses");
                    return b(cls6, setE5);
                }
                return true;
            }
            return false;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0600b extends b {
        public /* synthetic */ C0600b(float f8, float f9, int i8, int i9, float f10, int i10, b bVar, boolean z8, boolean z9, boolean z10, Rect rect, int i11, AbstractC2633k abstractC2633k) {
            this(f8, f9, i8, i9, f10, i10, (i11 & 64) != 0 ? null : bVar, (i11 & 128) != 0 ? false : z8, (i11 & 256) != 0 ? false : z9, (i11 & 512) != 0 ? false : z10, (i11 & 1024) != 0 ? null : rect);
        }

        public C0600b(float f8, float f9, int i8, int i9, float f10, int i10, b bVar, boolean z8, boolean z9, boolean z10, Rect rect) {
            super(f8, f9, i8, i9, f10, i10, bVar, z8, z9, z10, rect, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends b {
        public /* synthetic */ c(float f8, float f9, int i8, int i9, float f10, int i10, b bVar, boolean z8, boolean z9, boolean z10, Rect rect, int i11, AbstractC2633k abstractC2633k) {
            this(f8, f9, i8, i9, f10, i10, (i11 & 64) != 0 ? null : bVar, (i11 & 128) != 0 ? false : z8, (i11 & 256) != 0 ? false : z9, (i11 & 512) != 0 ? false : z10, (i11 & 1024) != 0 ? null : rect);
        }

        public c(float f8, float f9, int i8, int i9, float f10, int i10, b bVar, boolean z8, boolean z9, boolean z10, Rect rect) {
            super(f8, f9, i8, i9, f10, i10, bVar, z8, z9, z10, rect, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final m f26941o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Integer f26942p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f26943q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f26944r;

        public /* synthetic */ d(m mVar, Integer num, int i8, int i9, float f8, float f9, int i10, int i11, float f10, int i12, b bVar, boolean z8, boolean z9, boolean z10, Rect rect, int i13, AbstractC2633k abstractC2633k) {
            this((i13 & 1) != 0 ? null : mVar, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? 0 : i8, (i13 & 8) != 0 ? 0 : i9, f8, f9, i10, i11, f10, i12, (i13 & 1024) != 0 ? null : bVar, (i13 & 2048) != 0 ? false : z8, (i13 & 4096) != 0 ? false : z9, (i13 & 8192) != 0 ? false : z10, (i13 & 16384) != 0 ? null : rect);
        }

        public final Integer i() {
            return this.f26942p;
        }

        public final m j() {
            return this.f26941o;
        }

        public final int k() {
            return this.f26943q;
        }

        public final int l() {
            return this.f26944r;
        }

        public d(m mVar, Integer num, int i8, int i9, float f8, float f9, int i10, int i11, float f10, int i12, b bVar, boolean z8, boolean z9, boolean z10, Rect rect) {
            super(f8, f9, i10, i11, f10, i12, bVar, z8, z9, z10, rect, null);
            this.f26941o = mVar;
            this.f26942p = num;
            this.f26943q = i8;
            this.f26944r = i9;
        }
    }

    public /* synthetic */ b(float f8, float f9, int i8, int i9, float f10, int i10, b bVar, boolean z8, boolean z9, boolean z10, Rect rect, AbstractC2633k abstractC2633k) {
        this(f8, f9, i8, i9, f10, i10, bVar, z8, z9, z10, rect);
    }

    public final float a() {
        return this.f26933e;
    }

    public final int b() {
        return this.f26932d;
    }

    public final boolean c() {
        return this.f26936h;
    }

    public final Rect d() {
        return this.f26939k;
    }

    public final int e() {
        return this.f26931c;
    }

    public final void f(List list) {
        this.f26940l = list;
    }

    public final void g(boolean z8) {
        for (b bVar = this.f26935g; bVar != null; bVar = bVar.f26935g) {
            bVar.f26937i = z8;
        }
    }

    public final void h(k callback) {
        List list;
        t.g(callback, "callback");
        if (!((Boolean) callback.invoke(this)).booleanValue() || (list = this.f26940l) == null) {
            return;
        }
        t.d(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).h(callback);
        }
    }

    public b(float f8, float f9, int i8, int i9, float f10, int i10, b bVar, boolean z8, boolean z9, boolean z10, Rect rect) {
        this.f26929a = f8;
        this.f26930b = f9;
        this.f26931c = i8;
        this.f26932d = i9;
        this.f26933e = f10;
        this.f26934f = i10;
        this.f26935g = bVar;
        this.f26936h = z8;
        this.f26937i = z9;
        this.f26938j = z10;
        this.f26939k = rect;
    }

    public /* synthetic */ b(float f8, float f9, int i8, int i9, float f10, int i10, b bVar, boolean z8, boolean z9, boolean z10, Rect rect, int i11, AbstractC2633k abstractC2633k) {
        this(f8, f9, i8, i9, f10, i10, (i11 & 64) != 0 ? null : bVar, (i11 & 128) != 0 ? false : z8, (i11 & 256) != 0 ? false : z9, (i11 & 512) != 0 ? false : z10, (i11 & 1024) != 0 ? null : rect, null);
    }
}
