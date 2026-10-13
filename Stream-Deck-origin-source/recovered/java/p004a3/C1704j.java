package p004a3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p058g3.e;
import p063h.s;
import p117n.C2715q;
import p121n3.j;

/* JADX INFO: renamed from: a3.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1704j extends C2715q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f13238q = "j";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final L f13239r = new L() { // from class: a3.g
        @Override // p004a3.L
        public final void onResult(Object obj) {
            C1704j.d((Throwable) obj);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L f13240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L f13241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L f13242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J f13244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f13250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f13251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Q f13252p;

    /* JADX INFO: renamed from: a3.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0330a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f13253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f13255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f13257e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13258f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13259g;

        /* JADX INFO: renamed from: a3.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class C0330a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public /* synthetic */ a(Parcel parcel, AbstractC1703i abstractC1703i) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeString(this.f13253a);
            parcel.writeFloat(this.f13255c);
            parcel.writeInt(this.f13256d ? 1 : 0);
            parcel.writeString(this.f13257e);
            parcel.writeInt(this.f13258f);
            parcel.writeInt(this.f13259g);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public a(Parcel parcel) {
            super(parcel);
            this.f13253a = parcel.readString();
            this.f13255c = parcel.readFloat();
            this.f13256d = parcel.readInt() == 1;
            this.f13257e = parcel.readString();
            this.f13258f = parcel.readInt();
            this.f13259g = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: a3.j$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* JADX INFO: renamed from: a3.j$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c implements L {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f13267a;

        public c(C1704j c1704j) {
            this.f13267a = new WeakReference(c1704j);
        }

        @Override // p004a3.L
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            C1704j c1704j = (C1704j) this.f13267a.get();
            if (c1704j == null) {
                return;
            }
            if (c1704j.f13243g != 0) {
                c1704j.setImageResource(c1704j.f13243g);
            }
            (c1704j.f13242f == null ? C1704j.f13239r : c1704j.f13242f).onResult(th);
        }
    }

    /* JADX INFO: renamed from: a3.j$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d implements L {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f13268a;

        public d(C1704j c1704j) {
            this.f13268a = new WeakReference(c1704j);
        }

        @Override // p004a3.L
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(C1705k c1705k) {
            C1704j c1704j = (C1704j) this.f13268a.get();
            if (c1704j == null) {
                return;
            }
            c1704j.setComposition(c1705k);
        }
    }

    public C1704j(Context context) {
        super(context);
        this.f13240d = new d(this);
        this.f13241e = new c(this);
        this.f13243g = 0;
        this.f13244h = new J();
        this.f13247k = false;
        this.f13248l = false;
        this.f13249m = true;
        this.f13250n = new HashSet();
        this.f13251o = new HashSet();
        o(null, T.f13187a);
    }

    public static /* synthetic */ O c(C1704j c1704j, String str) {
        return c1704j.f13249m ? AbstractC1712s.l(c1704j.getContext(), str) : AbstractC1712s.m(c1704j.getContext(), str, null);
    }

    public static /* synthetic */ void d(Throwable th) {
        if (!j.k(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        p121n3.d.d("Unable to load composition.", th);
    }

    public static /* synthetic */ O e(C1704j c1704j, int i8) {
        return c1704j.f13249m ? AbstractC1712s.u(c1704j.getContext(), i8) : AbstractC1712s.v(c1704j.getContext(), i8, null);
    }

    private void setCompositionTask(Q q8) {
        O oE = q8.e();
        J j8 = this.f13244h;
        if (oE != null && j8 == getDrawable() && j8.J() == oE.b()) {
            return;
        }
        this.f13250n.add(b.SET_ANIMATION);
        k();
        j();
        this.f13252p = q8.d(this.f13240d).c(this.f13241e);
    }

    public EnumC1695a getAsyncUpdates() {
        return this.f13244h.E();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f13244h.F();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f13244h.H();
    }

    public boolean getClipToCompositionBounds() {
        return this.f13244h.I();
    }

    public C1705k getComposition() {
        Drawable drawable = getDrawable();
        J j8 = this.f13244h;
        if (drawable == j8) {
            return j8.J();
        }
        return null;
    }

    public long getDuration() {
        C1705k composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f13244h.M();
    }

    public String getImageAssetsFolder() {
        return this.f13244h.O();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f13244h.Q();
    }

    public float getMaxFrame() {
        return this.f13244h.S();
    }

    public float getMinFrame() {
        return this.f13244h.T();
    }

    public S getPerformanceTracker() {
        return this.f13244h.U();
    }

    public float getProgress() {
        return this.f13244h.V();
    }

    public V getRenderMode() {
        return this.f13244h.W();
    }

    public int getRepeatCount() {
        return this.f13244h.X();
    }

    public int getRepeatMode() {
        return this.f13244h.Y();
    }

    public float getSpeed() {
        return this.f13244h.Z();
    }

    public void i(e eVar, Object obj, p130o3.c cVar) {
        this.f13244h.q(eVar, obj, cVar);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof J) && ((J) drawable).W() == V.SOFTWARE) {
            this.f13244h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        J j8 = this.f13244h;
        if (drawable2 == j8) {
            super.invalidateDrawable(j8);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j() {
        Q q8 = this.f13252p;
        if (q8 != null) {
            q8.k(this.f13240d);
            this.f13252p.j(this.f13241e);
        }
    }

    public final void k() {
        this.f13244h.t();
    }

    public void l(boolean z8) {
        this.f13244h.z(z8);
    }

    public final Q m(final String str) {
        if (isInEditMode()) {
            return new Q(new Callable() { // from class: a3.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C1704j.c(this.f13234a, str);
                }
            }, true);
        }
        return this.f13249m ? AbstractC1712s.j(getContext(), str) : AbstractC1712s.k(getContext(), str, null);
    }

    public final Q n(final int i8) {
        if (isInEditMode()) {
            return new Q(new Callable() { // from class: a3.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C1704j.e(this.f13236a, i8);
                }
            }, true);
        }
        return this.f13249m ? AbstractC1712s.s(getContext(), i8) : AbstractC1712s.t(getContext(), i8, null);
    }

    public final void o(AttributeSet attributeSet, int i8) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, U.f13188a, i8, 0);
        this.f13249m = typedArrayObtainStyledAttributes.getBoolean(U.f13191d, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(U.f13203p);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(U.f13198k);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(U.f13208u);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(U.f13203p, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(U.f13198k);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(U.f13208u)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(U.f13197j, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(U.f13190c, false)) {
            this.f13248l = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(U.f13201n, false)) {
            this.f13244h.L0(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(U.f13206s)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(U.f13206s, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(U.f13205r)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(U.f13205r, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(U.f13207t)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(U.f13207t, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(U.f13193f)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(U.f13193f, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(U.f13192e)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(U.f13192e, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(U.f13195h)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(U.f13195h));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(U.f13200m));
        v(typedArrayObtainStyledAttributes.getFloat(U.f13202o, 0.0f), typedArrayObtainStyledAttributes.hasValue(U.f13202o));
        l(typedArrayObtainStyledAttributes.getBoolean(U.f13196i, false));
        if (typedArrayObtainStyledAttributes.hasValue(U.f13194g)) {
            i(new e("**"), N.f13141K, new p130o3.c(new W(p072i.a.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(U.f13194g, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(U.f13204q)) {
            int i9 = U.f13204q;
            V v8 = V.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i9, v8.ordinal());
            if (iOrdinal >= V.values().length) {
                iOrdinal = v8.ordinal();
            }
            setRenderMode(V.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(U.f13189b)) {
            int i10 = U.f13189b;
            EnumC1695a enumC1695a = EnumC1695a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i10, enumC1695a.ordinal());
            if (iOrdinal2 >= V.values().length) {
                iOrdinal2 = enumC1695a.ordinal();
            }
            setAsyncUpdates(EnumC1695a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(U.f13199l, false));
        if (typedArrayObtainStyledAttributes.hasValue(U.f13209v)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(U.f13209v, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f13244h.P0(Boolean.valueOf(j.f(getContext()) != 0.0f));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f13248l) {
            return;
        }
        this.f13244h.h0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i8;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.f13245i = aVar.f13253a;
        Set set = this.f13250n;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f13245i)) {
            setAnimation(this.f13245i);
        }
        this.f13246j = aVar.f13254b;
        if (!this.f13250n.contains(bVar) && (i8 = this.f13246j) != 0) {
            setAnimation(i8);
        }
        if (!this.f13250n.contains(b.SET_PROGRESS)) {
            v(aVar.f13255c, false);
        }
        if (!this.f13250n.contains(b.PLAY_OPTION) && aVar.f13256d) {
            r();
        }
        if (!this.f13250n.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(aVar.f13257e);
        }
        if (!this.f13250n.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(aVar.f13258f);
        }
        if (this.f13250n.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(aVar.f13259g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f13253a = this.f13245i;
        aVar.f13254b = this.f13246j;
        aVar.f13255c = this.f13244h.V();
        aVar.f13256d = this.f13244h.e0();
        aVar.f13257e = this.f13244h.O();
        aVar.f13258f = this.f13244h.Y();
        aVar.f13259g = this.f13244h.X();
        return aVar;
    }

    public boolean p() {
        return this.f13244h.d0();
    }

    public void q() {
        this.f13248l = false;
        this.f13244h.g0();
    }

    public void r() {
        this.f13250n.add(b.PLAY_OPTION);
        this.f13244h.h0();
    }

    public void s(InputStream inputStream, String str) {
        setCompositionTask(AbstractC1712s.n(inputStream, str));
    }

    public void setAnimation(int i8) {
        this.f13246j = i8;
        this.f13245i = null;
        setCompositionTask(n(i8));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        t(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f13249m ? AbstractC1712s.w(getContext(), str) : AbstractC1712s.x(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z8) {
        this.f13244h.m0(z8);
    }

    public void setAsyncUpdates(EnumC1695a enumC1695a) {
        this.f13244h.n0(enumC1695a);
    }

    public void setCacheComposition(boolean z8) {
        this.f13249m = z8;
    }

    public void setClipTextToBoundingBox(boolean z8) {
        this.f13244h.o0(z8);
    }

    public void setClipToCompositionBounds(boolean z8) {
        this.f13244h.p0(z8);
    }

    public void setComposition(C1705k c1705k) {
        if (AbstractC1699e.f13224a) {
            Log.v(f13238q, "Set Composition \n" + c1705k);
        }
        this.f13244h.setCallback(this);
        this.f13247k = true;
        boolean zQ0 = this.f13244h.q0(c1705k);
        if (this.f13248l) {
            this.f13244h.h0();
        }
        this.f13247k = false;
        if (getDrawable() != this.f13244h || zQ0) {
            if (!zQ0) {
                u();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f13251o.iterator();
            if (it.hasNext()) {
                s.a(it.next());
                throw null;
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f13244h.r0(str);
    }

    public void setFailureListener(L l8) {
        this.f13242f = l8;
    }

    public void setFallbackResource(int i8) {
        this.f13243g = i8;
    }

    public void setFontAssetDelegate(C1696b c1696b) {
        this.f13244h.s0(c1696b);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f13244h.t0(map);
    }

    public void setFrame(int i8) {
        this.f13244h.u0(i8);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z8) {
        this.f13244h.v0(z8);
    }

    public void setImageAssetDelegate(InterfaceC1697c interfaceC1697c) {
        this.f13244h.w0(interfaceC1697c);
    }

    public void setImageAssetsFolder(String str) {
        this.f13244h.x0(str);
    }

    @Override // p117n.C2715q, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f13246j = 0;
        this.f13245i = null;
        j();
        super.setImageBitmap(bitmap);
    }

    @Override // p117n.C2715q, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f13246j = 0;
        this.f13245i = null;
        j();
        super.setImageDrawable(drawable);
    }

    @Override // p117n.C2715q, android.widget.ImageView
    public void setImageResource(int i8) {
        this.f13246j = 0;
        this.f13245i = null;
        j();
        super.setImageResource(i8);
    }

    public void setMaintainOriginalImageBounds(boolean z8) {
        this.f13244h.y0(z8);
    }

    public void setMaxFrame(int i8) {
        this.f13244h.z0(i8);
    }

    public void setMaxProgress(float f8) {
        this.f13244h.B0(f8);
    }

    public void setMinAndMaxFrame(String str) {
        this.f13244h.D0(str);
    }

    public void setMinFrame(int i8) {
        this.f13244h.E0(i8);
    }

    public void setMinProgress(float f8) {
        this.f13244h.G0(f8);
    }

    public void setOutlineMasksAndMattes(boolean z8) {
        this.f13244h.H0(z8);
    }

    public void setPerformanceTrackingEnabled(boolean z8) {
        this.f13244h.I0(z8);
    }

    public void setProgress(float f8) {
        v(f8, true);
    }

    public void setRenderMode(V v8) {
        this.f13244h.K0(v8);
    }

    public void setRepeatCount(int i8) {
        this.f13250n.add(b.SET_REPEAT_COUNT);
        this.f13244h.L0(i8);
    }

    public void setRepeatMode(int i8) {
        this.f13250n.add(b.SET_REPEAT_MODE);
        this.f13244h.M0(i8);
    }

    public void setSafeMode(boolean z8) {
        this.f13244h.N0(z8);
    }

    public void setSpeed(float f8) {
        this.f13244h.O0(f8);
    }

    public void setTextDelegate(X x8) {
        this.f13244h.Q0(x8);
    }

    public void setUseCompositionFrameRate(boolean z8) {
        this.f13244h.R0(z8);
    }

    public void t(String str, String str2) {
        s(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public final void u() {
        boolean zP = p();
        setImageDrawable(null);
        setImageDrawable(this.f13244h);
        if (zP) {
            this.f13244h.k0();
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        J j8;
        if (!this.f13247k && drawable == (j8 = this.f13244h) && j8.d0()) {
            q();
        } else if (!this.f13247k && (drawable instanceof J)) {
            J j9 = (J) drawable;
            if (j9.d0()) {
                j9.g0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public final void v(float f8, boolean z8) {
        if (z8) {
            this.f13250n.add(b.SET_PROGRESS);
        }
        this.f13244h.J0(f8);
    }

    public void setMaxFrame(String str) {
        this.f13244h.A0(str);
    }

    public void setMinFrame(String str) {
        this.f13244h.F0(str);
    }

    public void setAnimation(String str) {
        this.f13245i = str;
        this.f13246j = 0;
        setCompositionTask(m(str));
    }

    public C1704j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13240d = new d(this);
        this.f13241e = new c(this);
        this.f13243g = 0;
        this.f13244h = new J();
        this.f13247k = false;
        this.f13248l = false;
        this.f13249m = true;
        this.f13250n = new HashSet();
        this.f13251o = new HashSet();
        o(attributeSet, T.f13187a);
    }

    public C1704j(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f13240d = new d(this);
        this.f13241e = new c(this);
        this.f13243g = 0;
        this.f13244h = new J();
        this.f13247k = false;
        this.f13248l = false;
        this.f13249m = true;
        this.f13250n = new HashSet();
        this.f13251o = new HashSet();
        o(attributeSet, i8);
    }
}
