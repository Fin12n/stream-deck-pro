package androidx.compose.ui.platform;

import A1.v;
import C6.G;
import D6.C0934n;
import D6.C0941v;
import D6.J;
import D6.M;
import D6.z;
import R0.M0;
import U1.C1639a;
import U1.I;
import android.R;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.g;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1733p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p010b0.C1748a;
import p010b0.C1749b;
import p010b0.D;
import p056g1.AbstractC2347k;
import p056g1.C2355t;
import p056g1.F;
import p056g1.Z;
import p056g1.h0;
import p065h1.AbstractC2413s;
import p065h1.AbstractC2423x;
import p065h1.C2384d;
import p065h1.C2415t;
import p065h1.C2419v;
import p065h1.C2421w;
import p065h1.C2425y;
import p065h1.C2427z;
import p065h1.E0;
import p065h1.F0;
import p065h1.InterfaceC2380b;
import p110m1.w;
import p128o1.C2739d;
import p128o1.E;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g extends C1639a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final d f14915e0 = new d(null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f14916f0 = 8;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int[] f14917g0 = {L0.l.f4865a, L0.l.f4866b, L0.l.f4877m, L0.l.f4888x, L0.l.f4853A, L0.l.f4854B, L0.l.f4855C, L0.l.f4856D, L0.l.f4857E, L0.l.f4858F, L0.l.f4867c, L0.l.f4868d, L0.l.f4869e, L0.l.f4870f, L0.l.f4871g, L0.l.f4872h, L0.l.f4873i, L0.l.f4874j, L0.l.f4875k, L0.l.f4876l, L0.l.f4878n, L0.l.f4879o, L0.l.f4880p, L0.l.f4881q, L0.l.f4882r, L0.l.f4883s, L0.l.f4884t, L0.l.f4885u, L0.l.f4886v, L0.l.f4887w, L0.l.f4889y, L0.l.f4890z};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f14918A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p092k1.c f14919B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1748a f14920C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C1749b f14921D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0365g f14922E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Map f14923F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C1749b f14924G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public HashMap f14925H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public HashMap f14926I;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final String f14927V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final String f14928W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final p192w1.s f14929X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Map f14930Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public i f14931Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f14932a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Runnable f14933b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final List f14934c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AndroidComposeView f14935d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Q6.k f14936d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14937e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Q6.k f14938f = new o();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f14939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AccessibilityManager.AccessibilityStateChangeListener f14941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AccessibilityManager.TouchExplorationStateChangeListener f14942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f14943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f14944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f14945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public V1.m f14946n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14947o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityNodeInfo f14948p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14949q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap f14950r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f14951s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public D f14952t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public D f14953u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14954v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f14955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1749b f14956x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p035d7.g f14957y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14958z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager = g.this.f14939g;
            g gVar = g.this;
            accessibilityManager.addAccessibilityStateChangeListener(gVar.f14941i);
            accessibilityManager.addTouchExplorationStateChangeListener(gVar.f14942j);
            if (g.this.e0()) {
                return;
            }
            g gVar2 = g.this;
            gVar2.k1(gVar2.f0(view));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            g.this.f14945m.removeCallbacks(g.this.f14933b0);
            AccessibilityManager accessibilityManager = g.this.f14939g;
            g gVar = g.this;
            accessibilityManager.removeAccessibilityStateChangeListener(gVar.f14941i);
            accessibilityManager.removeTouchExplorationStateChangeListener(gVar.f14942j);
            g.this.k1(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14960a = new b();

        public static final void a(V1.l lVar, p110m1.o oVar) {
            p110m1.a aVar;
            if (!AbstractC2423x.p(oVar) || (aVar = (p110m1.a) p110m1.l.a(oVar.v(), p110m1.j.f29521a.u())) == null) {
                return;
            }
            lVar.b(new V1.l.a(R.id.accessibilityActionSetProgress, aVar.b()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14961a = new c();

        public static final void a(V1.l lVar, p110m1.o oVar) {
            if (AbstractC2423x.p(oVar)) {
                p110m1.k kVarV = oVar.v();
                p110m1.j jVar = p110m1.j.f29521a;
                p110m1.a aVar = (p110m1.a) p110m1.l.a(kVarV, jVar.p());
                if (aVar != null) {
                    lVar.b(new V1.l.a(R.id.accessibilityActionPageUp, aVar.b()));
                }
                p110m1.a aVar2 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.m());
                if (aVar2 != null) {
                    lVar.b(new V1.l.a(R.id.accessibilityActionPageDown, aVar2.b()));
                }
                p110m1.a aVar3 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.n());
                if (aVar3 != null) {
                    lVar.b(new V1.l.a(R.id.accessibilityActionPageLeft, aVar3.b()));
                }
                p110m1.a aVar4 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.o());
                if (aVar4 != null) {
                    lVar.b(new V1.l.a(R.id.accessibilityActionPageRight, aVar4.b()));
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {
        public /* synthetic */ d(AbstractC2633k abstractC2633k) {
            this();
        }

        public d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class e extends AccessibilityNodeProvider {
        public e() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            g.this.M(i8, accessibilityNodeInfo, str, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i8) {
            AccessibilityNodeInfo accessibilityNodeInfoX = g.this.X(i8);
            if (g.this.f14949q && i8 == g.this.f14947o) {
                g.this.f14948p = accessibilityNodeInfoX;
            }
            return accessibilityNodeInfoX;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i8) {
            return createAccessibilityNodeInfo(g.this.f14947o);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i8, int i9, Bundle bundle) {
            return g.this.N0(i8, i9, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f14963a = new f();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p110m1.o oVar, p110m1.o oVar2) {
            Q0.h hVarJ = oVar.j();
            Q0.h hVarJ2 = oVar2.j();
            int iCompare = Float.compare(hVarJ.i(), hVarJ2.i());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(hVarJ.l(), hVarJ2.l());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(hVarJ.e(), hVarJ2.e());
            return iCompare3 != 0 ? iCompare3 : Float.compare(hVarJ.j(), hVarJ2.j());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0365g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p110m1.o f14964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f14966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f14967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f14968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f14969f;

        public C0365g(p110m1.o oVar, int i8, int i9, int i10, int i11, long j8) {
            this.f14964a = oVar;
            this.f14965b = i8;
            this.f14966c = i9;
            this.f14967d = i10;
            this.f14968e = i11;
            this.f14969f = j8;
        }

        public final int a() {
            return this.f14965b;
        }

        public final int b() {
            return this.f14967d;
        }

        public final int c() {
            return this.f14966c;
        }

        public final p110m1.o d() {
            return this.f14964a;
        }

        public final int e() {
            return this.f14968e;
        }

        public final long f() {
            return this.f14969f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f14970a = new h();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p110m1.o oVar, p110m1.o oVar2) {
            Q0.h hVarJ = oVar.j();
            Q0.h hVarJ2 = oVar2.j();
            int iCompare = Float.compare(hVarJ2.j(), hVarJ.j());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(hVarJ.l(), hVarJ2.l());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(hVarJ.e(), hVarJ2.e());
            return iCompare3 != 0 ? iCompare3 : Float.compare(hVarJ2.i(), hVarJ.i());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p110m1.o f14971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p110m1.k f14972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f14973c = new LinkedHashSet();

        public i(p110m1.o oVar, Map<Integer, F0> map) {
            this.f14971a = oVar;
            this.f14972b = oVar.v();
            List listS = oVar.s();
            int size = listS.size();
            for (int i8 = 0; i8 < size; i8++) {
                p110m1.o oVar2 = (p110m1.o) listS.get(i8);
                if (map.containsKey(Integer.valueOf(oVar2.n()))) {
                    this.f14973c.add(Integer.valueOf(oVar2.n()));
                }
            }
        }

        public final Set a() {
            return this.f14973c;
        }

        public final p110m1.o b() {
            return this.f14971a;
        }

        public final p110m1.k c() {
            return this.f14972b;
        }

        public final boolean d() {
            return this.f14972b.o(p110m1.r.f29573a.r());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f14974a = new j();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C6.o oVar, C6.o oVar2) {
            int iCompare = Float.compare(((Q0.h) oVar.c()).l(), ((Q0.h) oVar2.c()).l());
            return iCompare != 0 ? iCompare : Float.compare(((Q0.h) oVar.c()).e(), ((Q0.h) oVar2.c()).e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum k {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f14978a = new l();

        public static final void e(g gVar, LongSparseArray longSparseArray) {
            f14978a.b(gVar, longSparseArray);
        }

        public final void b(g gVar, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            F0 f8;
            p110m1.o oVarB;
            p110m1.a aVar;
            Q6.k kVar;
            J jA = T1.c.a(longSparseArray);
            while (jA.hasNext()) {
                long jNextLong = jA.nextLong();
                ViewTranslationResponse viewTranslationResponseA = C2415t.a(longSparseArray.get(jNextLong));
                if (viewTranslationResponseA != null && (value = viewTranslationResponseA.getValue("android:text")) != null && (text = value.getText()) != null && (f8 = (F0) gVar.g0().get(Integer.valueOf((int) jNextLong))) != null && (oVarB = f8.b()) != null && (aVar = (p110m1.a) p110m1.l.a(oVarB.v(), p110m1.j.f29521a.x())) != null && (kVar = (Q6.k) aVar.a()) != null) {
                }
            }
        }

        public final void c(g gVar, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
            p110m1.o oVarB;
            for (long j8 : jArr) {
                F0 f8 = (F0) gVar.g0().get(Integer.valueOf((int) j8));
                if (f8 != null && (oVarB = f8.b()) != null) {
                    AbstractC2413s.a();
                    ViewTranslationRequest.Builder builderA = p065h1.r.a(gVar.s0().getAutofillId(), oVarB.n());
                    String strX = AbstractC2423x.x(oVarB);
                    if (strX != null) {
                        builderA.setValue("android:text", TranslationRequestValue.forText(new C2739d(strX, null, null, 6, null)));
                        consumer.accept(builderA.build());
                    }
                }
            }
        }

        public final void d(final g gVar, final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (kotlin.jvm.internal.t.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(gVar, longSparseArray);
            } else {
                gVar.s0().post(new Runnable() { // from class: h1.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.l.e(gVar, longSparseArray);
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14979a;

        static {
            int[] iArr = new int[p119n1.a.values().length];
            try {
                iArr[p119n1.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p119n1.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p119n1.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14979a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f14980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14983d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14985f;

        public n(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f14983d = obj;
            this.f14985f |= Integer.MIN_VALUE;
            return g.this.O(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends u implements Q6.k {
        public o() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(g.this.s0().getParent().requestSendAccessibilityEvent(g.this.s0(), accessibilityEvent));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E0 f14987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f14988b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(E0 e8, g gVar) {
            super(0);
            this.f14987a = e8;
            this.f14988b = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m88invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m88invoke() {
            p110m1.o oVarB;
            F fP;
            p110m1.i iVarA = this.f14987a.a();
            p110m1.i iVarE = this.f14987a.e();
            Float fB = this.f14987a.b();
            Float fC = this.f14987a.c();
            float fFloatValue = (iVarA == null || fB == null) ? 0.0f : ((Number) iVarA.c().invoke()).floatValue() - fB.floatValue();
            float fFloatValue2 = (iVarE == null || fC == null) ? 0.0f : ((Number) iVarE.c().invoke()).floatValue() - fC.floatValue();
            if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                int iX0 = this.f14988b.X0(this.f14987a.d());
                F0 f8 = (F0) this.f14988b.g0().get(Integer.valueOf(this.f14988b.f14947o));
                if (f8 != null) {
                    g gVar = this.f14988b;
                    try {
                        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f14948p;
                        if (accessibilityNodeInfo != null) {
                            accessibilityNodeInfo.setBoundsInScreen(gVar.N(f8));
                            G g8 = G.f1419a;
                        }
                    } catch (IllegalStateException unused) {
                        G g9 = G.f1419a;
                    }
                }
                this.f14988b.s0().invalidate();
                F0 f9 = (F0) this.f14988b.g0().get(Integer.valueOf(iX0));
                if (f9 != null && (oVarB = f9.b()) != null && (fP = oVarB.p()) != null) {
                    g gVar2 = this.f14988b;
                    if (iVarA != null) {
                        gVar2.f14950r.put(Integer.valueOf(iX0), iVarA);
                    }
                    if (iVarE != null) {
                        gVar2.f14951s.put(Integer.valueOf(iX0), iVarE);
                    }
                    gVar2.F0(fP);
                }
            }
            if (iVarA != null) {
                this.f14987a.g((Float) iVarA.c().invoke());
            }
            if (iVarE != null) {
                this.f14987a.h((Float) iVarE.c().invoke());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends u implements Q6.k {
        public q() {
            super(1);
        }

        public final void b(E0 e8) {
            g.this.V0(e8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((E0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f14990a = new r();

        public r() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(F f8) {
            p110m1.k kVarG = f8.G();
            boolean z8 = false;
            if (kVarG != null && kVarG.E()) {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class s extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f14991a = new s();

        public s() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(F f8) {
            return Boolean.valueOf(f8.j0().r(Z.a(8)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class t extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f14992a = new t();

        public t() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(p110m1.o oVar, p110m1.o oVar2) {
            p110m1.k kVarM = oVar.m();
            p110m1.r rVar = p110m1.r.f29573a;
            w wVarD = rVar.D();
            C2427z c2427z = C2427z.f24382a;
            return Integer.valueOf(Float.compare(((Number) kVarM.y(wVarD, c2427z)).floatValue(), ((Number) oVar2.m().y(rVar.D(), c2427z)).floatValue()));
        }
    }

    public g(AndroidComposeView androidComposeView) {
        this.f14935d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.t.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f14939g = accessibilityManager;
        this.f14941i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: h1.n
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z8) {
                g.a0(this.f24312a, z8);
            }
        };
        this.f14942j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: h1.o
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z8) {
                g.x1(this.f24314a, z8);
            }
        };
        this.f14943k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f14944l = k.SHOW_ORIGINAL;
        this.f14945m = new Handler(Looper.getMainLooper());
        this.f14946n = new V1.m(new e());
        this.f14947o = Integer.MIN_VALUE;
        this.f14950r = new HashMap();
        this.f14951s = new HashMap();
        this.f14952t = new D(0, 1, null);
        this.f14953u = new D(0, 1, null);
        this.f14954v = -1;
        this.f14956x = new C1749b(0, 1, null);
        this.f14957y = p035d7.j.b(1, null, null, 6, null);
        this.f14958z = true;
        this.f14920C = new C1748a();
        this.f14921D = new C1749b(0, 1, null);
        this.f14923F = M.g();
        this.f14924G = new C1749b(0, 1, null);
        this.f14925H = new HashMap();
        this.f14926I = new HashMap();
        this.f14927V = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f14928W = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f14929X = new p192w1.s();
        this.f14930Y = new LinkedHashMap();
        this.f14931Z = new i(androidComposeView.getSemanticsOwner().a(), M.g());
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.f14933b0 = new Runnable() { // from class: h1.p
            @Override // java.lang.Runnable
            public final void run() {
                g.W0(this.f24315a);
            }
        };
        this.f14934c0 = new ArrayList();
        this.f14936d0 = new q();
    }

    public static final boolean O0(p110m1.i iVar, float f8) {
        if (f8 >= 0.0f || ((Number) iVar.c().invoke()).floatValue() <= 0.0f) {
            return f8 > 0.0f && ((Number) iVar.c().invoke()).floatValue() < ((Number) iVar.a().invoke()).floatValue();
        }
        return true;
    }

    public static final float P0(float f8, float f9) {
        if (Math.signum(f8) == Math.signum(f9)) {
            return Math.abs(f8) < Math.abs(f9) ? f8 : f9;
        }
        return 0.0f;
    }

    public static final boolean R0(p110m1.i iVar) {
        if (((Number) iVar.c().invoke()).floatValue() <= 0.0f || iVar.b()) {
            return ((Number) iVar.c().invoke()).floatValue() < ((Number) iVar.a().invoke()).floatValue() && iVar.b();
        }
        return true;
    }

    public static final boolean S0(p110m1.i iVar) {
        if (((Number) iVar.c().invoke()).floatValue() >= ((Number) iVar.a().invoke()).floatValue() || iVar.b()) {
            return ((Number) iVar.c().invoke()).floatValue() > 0.0f && iVar.b();
        }
        return true;
    }

    public static final void W0(g gVar) {
        h0.m(gVar.f14935d, false, 1, null);
        gVar.T();
        gVar.f14932a0 = false;
    }

    public static final void a0(g gVar, boolean z8) {
        gVar.f14943k = z8 ? gVar.f14939g.getEnabledAccessibilityServiceList(-1) : D6.r.n();
    }

    public static /* synthetic */ boolean d1(g gVar, int i8, int i9, Integer num, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        return gVar.c1(i8, i9, num, list);
    }

    public static final int s1(Q6.o oVar, Object obj, Object obj2) {
        return ((Number) oVar.invoke(obj, obj2)).intValue();
    }

    public static final boolean t1(ArrayList arrayList, p110m1.o oVar) {
        float fL = oVar.j().l();
        float fE = oVar.j().e();
        boolean z8 = fL >= fE;
        int iP = D6.r.p(arrayList);
        if (iP >= 0) {
            int i8 = 0;
            while (true) {
                Q0.h hVar = (Q0.h) ((C6.o) arrayList.get(i8)).c();
                boolean z9 = hVar.l() >= hVar.e();
                if (!z8 && !z9 && Math.max(fL, hVar.l()) < Math.min(fE, hVar.e())) {
                    arrayList.set(i8, new C6.o(hVar.o(0.0f, fL, Float.POSITIVE_INFINITY, fE), ((C6.o) arrayList.get(i8)).d()));
                    ((List) ((C6.o) arrayList.get(i8)).d()).add(oVar);
                    return true;
                }
                if (i8 != iP) {
                    i8++;
                }
            }
        }
        return false;
    }

    public static final void x1(g gVar, boolean z8) {
        gVar.f14943k = gVar.f14939g.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean z0() {
        return A0() || B0();
    }

    public final boolean A0() {
        if (this.f14940h) {
            return true;
        }
        return this.f14939g.isEnabled() && !this.f14943k.isEmpty();
    }

    public final void A1(p110m1.o oVar) {
        if (B0()) {
            E1(oVar);
            P(oVar.n(), w1(oVar));
            List listS = oVar.s();
            int size = listS.size();
            for (int i8 = 0; i8 < size; i8++) {
                A1((p110m1.o) listS.get(i8));
            }
        }
    }

    public final boolean B0() {
        if (AbstractC2423x.v()) {
            return false;
        }
        return this.f14919B != null || this.f14918A;
    }

    public final void B1(p110m1.o oVar) {
        if (B0()) {
            Q(oVar.n());
            List listS = oVar.s();
            int size = listS.size();
            for (int i8 = 0; i8 < size; i8++) {
                B1((p110m1.o) listS.get(i8));
            }
        }
    }

    public final boolean C0(p110m1.o oVar) {
        return oVar.v().E() || (oVar.z() && (AbstractC2423x.w(oVar) != null || n0(oVar) != null || m0(oVar) != null || l0(oVar)));
    }

    public final void C1(int i8) {
        int i9 = this.f14937e;
        if (i9 == i8) {
            return;
        }
        this.f14937e = i8;
        d1(this, i8, 128, null, null, 12, null);
        d1(this, i9, 256, null, null, 12, null);
    }

    public final boolean D0() {
        if (this.f14940h) {
            return true;
        }
        return this.f14939g.isEnabled() && this.f14939g.isTouchExplorationEnabled();
    }

    public final void D1() {
        p110m1.k kVarC;
        C1749b c1749b = new C1749b(0, 1, null);
        Iterator it = this.f14924G.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            F0 f8 = (F0) g0().get(Integer.valueOf(iIntValue));
            p110m1.o oVarB = f8 != null ? f8.b() : null;
            if (oVarB == null || !AbstractC2423x.y(oVarB)) {
                c1749b.add(Integer.valueOf(iIntValue));
                i iVar = (i) this.f14930Y.get(Integer.valueOf(iIntValue));
                e1(iIntValue, 32, (iVar == null || (kVarC = iVar.c()) == null) ? null : (String) p110m1.l.a(kVarC, p110m1.r.f29573a.r()));
            }
        }
        this.f14924G.y(c1749b);
        this.f14930Y.clear();
        for (Map.Entry entry : g0().entrySet()) {
            if (AbstractC2423x.y(((F0) entry.getValue()).b()) && this.f14924G.add(entry.getKey())) {
                e1(((Number) entry.getKey()).intValue(), 16, (String) ((F0) entry.getValue()).b().v().u(p110m1.r.f29573a.r()));
            }
            this.f14930Y.put(entry.getKey(), new i(((F0) entry.getValue()).b(), g0()));
        }
        this.f14931Z = new i(this.f14935d.getSemanticsOwner().a(), g0());
    }

    public final void E0() {
        p092k1.c cVar = this.f14919B;
        if (cVar != null && Build.VERSION.SDK_INT >= 29) {
            if (!this.f14920C.isEmpty()) {
                List listR0 = z.R0(this.f14920C.values());
                ArrayList arrayList = new ArrayList(listR0.size());
                int size = listR0.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList.add(((p092k1.e) listR0.get(i8)).f());
                }
                cVar.d(arrayList);
                this.f14920C.clear();
            }
            if (this.f14921D.isEmpty()) {
                return;
            }
            List listR1 = z.R0(this.f14921D);
            ArrayList arrayList2 = new ArrayList(listR1.size());
            int size2 = listR1.size();
            for (int i9 = 0; i9 < size2; i9++) {
                arrayList2.add(Long.valueOf(((Number) listR1.get(i9)).intValue()));
            }
            cVar.e(z.S0(arrayList2));
            this.f14921D.clear();
        }
    }

    public final void E1(p110m1.o oVar) {
        p110m1.a aVar;
        Q6.k kVar;
        Q6.k kVar2;
        p110m1.k kVarV = oVar.v();
        Boolean bool = (Boolean) p110m1.l.a(kVarV, p110m1.r.f29573a.o());
        if (this.f14944l == k.SHOW_ORIGINAL && kotlin.jvm.internal.t.c(bool, Boolean.TRUE)) {
            p110m1.a aVar2 = (p110m1.a) p110m1.l.a(kVarV, p110m1.j.f29521a.y());
            if (aVar2 == null || (kVar2 = (Q6.k) aVar2.a()) == null) {
                return;
            }
            return;
        }
        if (this.f14944l != k.SHOW_TRANSLATED || !kotlin.jvm.internal.t.c(bool, Boolean.FALSE) || (aVar = (p110m1.a) p110m1.l.a(kVarV, p110m1.j.f29521a.y())) == null || (kVar = (Q6.k) aVar.a()) == null) {
            return;
        }
    }

    public final void F0(F f8) {
        if (this.f14956x.add(f8)) {
            this.f14957y.m(G.f1419a);
        }
    }

    public final void G0() {
        this.f14944l = k.SHOW_ORIGINAL;
        V();
    }

    public final void H0(long[] jArr, int[] iArr, Consumer consumer) {
        l.f14978a.c(this, jArr, iArr, consumer);
    }

    public final void I0() {
        this.f14944l = k.SHOW_ORIGINAL;
        t0();
    }

    public final void J0(F f8) {
        this.f14958z = true;
        if (z0()) {
            F0(f8);
        }
    }

    public final void K0() {
        this.f14958z = true;
        if (!z0() || this.f14932a0) {
            return;
        }
        this.f14932a0 = true;
        this.f14945m.post(this.f14933b0);
    }

    public final void L0() {
        this.f14944l = k.SHOW_TRANSLATED;
        q1();
    }

    public final void M(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        p110m1.o oVarB;
        F0 f8 = (F0) g0().get(Integer.valueOf(i8));
        if (f8 == null || (oVarB = f8.b()) == null) {
            return;
        }
        String strO0 = o0(oVarB);
        if (kotlin.jvm.internal.t.c(str, this.f14927V)) {
            Integer num = (Integer) this.f14925H.get(Integer.valueOf(i8));
            if (num != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.t.c(str, this.f14928W)) {
            Integer num2 = (Integer) this.f14926I.get(Integer.valueOf(i8));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        if (!oVarB.v().o(p110m1.j.f29521a.h()) || bundle == null || !kotlin.jvm.internal.t.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            p110m1.k kVarV = oVarB.v();
            p110m1.r rVar = p110m1.r.f29573a;
            if (!kVarV.o(rVar.y()) || bundle == null || !kotlin.jvm.internal.t.c(str, "androidx.compose.ui.semantics.testTag")) {
                if (kotlin.jvm.internal.t.c(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, oVarB.n());
                    return;
                }
                return;
            } else {
                String str2 = (String) p110m1.l.a(oVarB.v(), rVar.y());
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i9 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i10 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i10 > 0 && i9 >= 0) {
            if (i9 < (strO0 != null ? strO0.length() : Integer.MAX_VALUE)) {
                E eR0 = r0(oVarB.v());
                if (eR0 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = i9 + i11;
                    if (i12 >= eR0.l().j().length()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(v1(oVarB, eR0.d(i12)));
                    }
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final void M0(LongSparseArray longSparseArray) {
        l.f14978a.d(this, longSparseArray);
    }

    public final Rect N(F0 f8) {
        Rect rectA = f8.a();
        long jO = this.f14935d.o(Q0.g.a(rectA.left, rectA.top));
        long jO2 = this.f14935d.o(Q0.g.a(rectA.right, rectA.bottom));
        return new Rect((int) Math.floor(Q0.f.o(jO)), (int) Math.floor(Q0.f.p(jO)), (int) Math.ceil(Q0.f.o(jO2)), (int) Math.ceil(Q0.f.p(jO2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01b7 -> B:96:0x01b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:96:0x01b8
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean N0(int r18, int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 1702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.g.N0(int, int, android.os.Bundle):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:34:0x008b, B:36:0x0091, B:38:0x009a, B:39:0x00ab, B:41:0x00b2, B:42:0x00bb, B:20:0x0051), top: B:53:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:34:0x008b, B:36:0x0091, B:38:0x009a, B:39:0x00ab, B:41:0x00b2, B:42:0x00bb, B:20:0x0051), top: B:53:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0091 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:34:0x008b, B:36:0x0091, B:38:0x009a, B:39:0x00ab, B:41:0x00b2, B:42:0x00bb, B:20:0x0051), top: B:53:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009a A[Catch: all -> 0x003a, LOOP:0: B:37:0x0098->B:38:0x009a, LOOP_END, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:34:0x008b, B:36:0x0091, B:38:0x009a, B:39:0x00ab, B:41:0x00b2, B:42:0x00bb, B:20:0x0051), top: B:53:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:34:0x008b, B:36:0x0091, B:38:0x009a, B:39:0x00ab, B:41:0x00b2, B:42:0x00bb, B:20:0x0051), top: B:53:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
    
        if (p017b7.U.a(100, r0) == r1) goto L44;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d8 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(G6.d dVar) {
        n nVar;
        g gVar;
        C1749b c1749b;
        p035d7.i it;
        C1749b c1749b2;
        int size;
        int i8;
        Object objA;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i9 = nVar.f14985f;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                nVar.f14985f = i9 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        Object obj = nVar.f14983d;
        Object objF = H6.c.f();
        int i10 = nVar.f14985f;
        try {
            if (i10 == 0) {
                C6.r.b(obj);
                try {
                    c1749b = new C1749b(0, 1, null);
                    it = this.f14957y.iterator();
                    gVar = this;
                    nVar.f14980a = gVar;
                    nVar.f14981b = c1749b;
                    nVar.f14982c = it;
                    nVar.f14985f = 1;
                    objA = it.a(nVar);
                    if (objA == objF) {
                        c1749b2 = c1749b;
                        obj = objA;
                        if (!((Boolean) obj).booleanValue()) {
                            gVar.f14956x.clear();
                            return G.f1419a;
                        }
                        it.next();
                        if (gVar.B0()) {
                            gVar.E0();
                        }
                        if (gVar.A0()) {
                            size = gVar.f14956x.size();
                            for (i8 = 0; i8 < size; i8++) {
                                F f8 = (F) gVar.f14956x.G(i8);
                                gVar.h1(f8, c1749b2);
                                gVar.i1(f8);
                            }
                            c1749b2.clear();
                            if (!gVar.f14932a0) {
                                gVar.f14932a0 = true;
                                gVar.f14945m.post(gVar.f14933b0);
                            }
                        }
                        gVar.f14956x.clear();
                        gVar.f14950r.clear();
                        gVar.f14951s.clear();
                        nVar.f14980a = gVar;
                        nVar.f14981b = c1749b2;
                        nVar.f14982c = it;
                        nVar.f14985f = 2;
                    }
                    return objF;
                } catch (Throwable th) {
                    th = th;
                    gVar = this;
                    gVar.f14956x.clear();
                    throw th;
                }
            }
            if (i10 == 1) {
                it = (p035d7.i) nVar.f14982c;
                c1749b2 = (C1749b) nVar.f14981b;
                gVar = (g) nVar.f14980a;
                C6.r.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    gVar.f14956x.clear();
                    return G.f1419a;
                }
                it.next();
                if (gVar.B0()) {
                    gVar.E0();
                }
                if (gVar.A0()) {
                    size = gVar.f14956x.size();
                    while (i8 < size) {
                        F f9 = (F) gVar.f14956x.G(i8);
                        gVar.h1(f9, c1749b2);
                        gVar.i1(f9);
                    }
                    c1749b2.clear();
                    if (!gVar.f14932a0) {
                        gVar.f14932a0 = true;
                        gVar.f14945m.post(gVar.f14933b0);
                    }
                }
                gVar.f14956x.clear();
                gVar.f14950r.clear();
                gVar.f14951s.clear();
                nVar.f14980a = gVar;
                nVar.f14981b = c1749b2;
                nVar.f14982c = it;
                nVar.f14985f = 2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (p035d7.i) nVar.f14982c;
                c1749b2 = (C1749b) nVar.f14981b;
                gVar = (g) nVar.f14980a;
                C6.r.b(obj);
            }
            c1749b = c1749b2;
            nVar.f14980a = gVar;
            nVar.f14981b = c1749b;
            nVar.f14982c = it;
            nVar.f14985f = 1;
            objA = it.a(nVar);
            if (objA == objF) {
                c1749b2 = c1749b;
                obj = objA;
                if (!((Boolean) obj).booleanValue()) {
                    gVar.f14956x.clear();
                    return G.f1419a;
                }
                it.next();
                if (gVar.B0()) {
                    gVar.E0();
                }
                if (gVar.A0()) {
                    size = gVar.f14956x.size();
                    while (i8 < size) {
                        F f10 = (F) gVar.f14956x.G(i8);
                        gVar.h1(f10, c1749b2);
                        gVar.i1(f10);
                    }
                    c1749b2.clear();
                    if (!gVar.f14932a0) {
                        gVar.f14932a0 = true;
                        gVar.f14945m.post(gVar.f14933b0);
                    }
                }
                gVar.f14956x.clear();
                gVar.f14950r.clear();
                gVar.f14951s.clear();
                nVar.f14980a = gVar;
                nVar.f14981b = c1749b2;
                nVar.f14982c = it;
                nVar.f14985f = 2;
            }
            return objF;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void P(int i8, p092k1.e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f14921D.contains(Integer.valueOf(i8))) {
            this.f14921D.remove(Integer.valueOf(i8));
        } else {
            this.f14920C.put(Integer.valueOf(i8), eVar);
        }
    }

    public final void Q(int i8) {
        if (this.f14920C.containsKey(Integer.valueOf(i8))) {
            this.f14920C.remove(Integer.valueOf(i8));
        } else {
            this.f14921D.add(Integer.valueOf(i8));
        }
    }

    public final void Q0(int i8, V1.l lVar, p110m1.o oVar) {
        boolean zBooleanValue;
        lVar.X("android.view.View");
        p110m1.k kVarV = oVar.v();
        p110m1.r rVar = p110m1.r.f29573a;
        p110m1.h hVar = (p110m1.h) p110m1.l.a(kVarV, rVar.u());
        if (hVar != null) {
            hVar.n();
            if (oVar.w() || oVar.s().isEmpty()) {
                m1.h.a aVar = p110m1.h.f29507b;
                if (p110m1.h.k(hVar.n(), aVar.g())) {
                    lVar.s0(this.f14935d.getContext().getResources().getString(L0.m.f4900j));
                } else if (p110m1.h.k(hVar.n(), aVar.f())) {
                    lVar.s0(this.f14935d.getContext().getResources().getString(L0.m.f4899i));
                } else {
                    String strE = AbstractC2423x.E(hVar.n());
                    if (!p110m1.h.k(hVar.n(), aVar.d()) || oVar.z() || oVar.v().E()) {
                        lVar.X(strE);
                    }
                }
            }
            G g8 = G.f1419a;
        }
        if (oVar.v().o(p110m1.j.f29521a.w())) {
            lVar.X("android.widget.EditText");
        }
        if (oVar.m().o(rVar.z())) {
            lVar.X("android.widget.TextView");
        }
        lVar.m0(this.f14935d.getContext().getPackageName());
        lVar.j0(AbstractC2423x.A(oVar));
        List listS = oVar.s();
        int size = listS.size();
        for (int i9 = 0; i9 < size; i9++) {
            p110m1.o oVar2 = (p110m1.o) listS.get(i9);
            if (g0().containsKey(Integer.valueOf(oVar2.n()))) {
                D1.c cVar = this.f14935d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(oVar2.p());
                if (cVar != null) {
                    lVar.c(cVar);
                } else if (oVar2.n() != -1) {
                    lVar.d(this.f14935d, oVar2.n());
                }
            }
        }
        if (i8 == this.f14947o) {
            lVar.T(true);
            lVar.b(V1.l.a.f10490k);
        } else {
            lVar.T(false);
            lVar.b(V1.l.a.f10489j);
        }
        o1(oVar, lVar);
        l1(oVar, lVar);
        n1(oVar, lVar);
        m1(oVar, lVar);
        p110m1.k kVarV2 = oVar.v();
        p110m1.r rVar2 = p110m1.r.f29573a;
        p119n1.a aVar2 = (p119n1.a) p110m1.l.a(kVarV2, rVar2.C());
        if (aVar2 != null) {
            if (aVar2 == p119n1.a.On) {
                lVar.W(true);
            } else if (aVar2 == p119n1.a.Off) {
                lVar.W(false);
            }
            G g9 = G.f1419a;
        }
        Boolean bool = (Boolean) p110m1.l.a(oVar.v(), rVar2.w());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (hVar == null ? false : p110m1.h.k(hVar.n(), p110m1.h.f29507b.g())) {
                lVar.v0(zBooleanValue2);
            } else {
                lVar.W(zBooleanValue2);
            }
            G g10 = G.f1419a;
        }
        if (!oVar.v().E() || oVar.s().isEmpty()) {
            lVar.b0(AbstractC2423x.w(oVar));
        }
        String str = (String) p110m1.l.a(oVar.v(), rVar2.y());
        if (str != null) {
            p110m1.o oVarQ = oVar;
            while (true) {
                if (oVarQ == null) {
                    zBooleanValue = false;
                    break;
                }
                p110m1.k kVarV3 = oVarQ.v();
                p110m1.s sVar = p110m1.s.f29608a;
                if (kVarV3.o(sVar.a())) {
                    zBooleanValue = ((Boolean) oVarQ.v().u(sVar.a())).booleanValue();
                    break;
                }
                oVarQ = oVarQ.q();
            }
            if (zBooleanValue) {
                lVar.E0(str);
            }
        }
        p110m1.k kVarV4 = oVar.v();
        p110m1.r rVar3 = p110m1.r.f29573a;
        if (((G) p110m1.l.a(kVarV4, rVar3.h())) != null) {
            lVar.i0(true);
            G g11 = G.f1419a;
        }
        lVar.q0(oVar.m().o(rVar3.s()));
        p110m1.k kVarV5 = oVar.v();
        p110m1.j jVar = p110m1.j.f29521a;
        lVar.d0(kVarV5.o(jVar.w()));
        lVar.e0(AbstractC2423x.p(oVar));
        lVar.g0(oVar.v().o(rVar3.g()));
        if (lVar.H()) {
            lVar.h0(((Boolean) oVar.v().u(rVar3.g())).booleanValue());
            if (lVar.I()) {
                lVar.a(2);
            } else {
                lVar.a(1);
            }
        }
        lVar.F0(AbstractC2423x.B(oVar));
        p063h.s.a(p110m1.l.a(oVar.v(), rVar3.q()));
        lVar.Y(false);
        p110m1.a aVar3 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.j());
        if (aVar3 != null) {
            boolean zC = kotlin.jvm.internal.t.c(p110m1.l.a(oVar.v(), rVar3.w()), Boolean.TRUE);
            lVar.Y(!zC);
            if (AbstractC2423x.p(oVar) && !zC) {
                lVar.b(new V1.l.a(16, aVar3.b()));
            }
            G g12 = G.f1419a;
        }
        lVar.k0(false);
        p110m1.a aVar4 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.l());
        if (aVar4 != null) {
            lVar.k0(true);
            if (AbstractC2423x.p(oVar)) {
                lVar.b(new V1.l.a(32, aVar4.b()));
            }
            G g13 = G.f1419a;
        }
        p110m1.a aVar5 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.c());
        if (aVar5 != null) {
            lVar.b(new V1.l.a(16384, aVar5.b()));
            G g14 = G.f1419a;
        }
        if (AbstractC2423x.p(oVar)) {
            p110m1.a aVar6 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.w());
            if (aVar6 != null) {
                lVar.b(new V1.l.a(2097152, aVar6.b()));
                G g15 = G.f1419a;
            }
            p110m1.a aVar7 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.k());
            if (aVar7 != null) {
                lVar.b(new V1.l.a(R.id.accessibilityActionImeEnter, aVar7.b()));
                G g16 = G.f1419a;
            }
            p110m1.a aVar8 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.e());
            if (aVar8 != null) {
                lVar.b(new V1.l.a(65536, aVar8.b()));
                G g17 = G.f1419a;
            }
            p110m1.a aVar9 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.q());
            if (aVar9 != null) {
                if (lVar.I() && this.f14935d.getClipboardManager().a()) {
                    lVar.b(new V1.l.a(32768, aVar9.b()));
                }
                G g18 = G.f1419a;
            }
        }
        String strO0 = o0(oVar);
        if (!(strO0 == null || strO0.length() == 0)) {
            lVar.z0(d0(oVar), c0(oVar));
            p110m1.a aVar10 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.v());
            lVar.b(new V1.l.a(131072, aVar10 != null ? aVar10.b() : null));
            lVar.a(256);
            lVar.a(512);
            lVar.l0(11);
            List list = (List) p110m1.l.a(oVar.v(), rVar3.c());
            if ((list == null || list.isEmpty()) && oVar.v().o(jVar.h()) && !AbstractC2423x.q(oVar)) {
                lVar.l0(lVar.t() | 20);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList();
        arrayList.add("androidx.compose.ui.semantics.id");
        CharSequence charSequenceW = lVar.w();
        if (!(charSequenceW == null || charSequenceW.length() == 0) && oVar.v().o(jVar.h())) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (oVar.v().o(rVar3.y())) {
            arrayList.add("androidx.compose.ui.semantics.testTag");
        }
        C2384d.f24270a.a(lVar.G0(), arrayList);
        p110m1.g gVar = (p110m1.g) p110m1.l.a(oVar.v(), rVar3.t());
        if (gVar != null) {
            if (oVar.v().o(jVar.u())) {
                lVar.X("android.widget.SeekBar");
            } else {
                lVar.X("android.widget.ProgressBar");
            }
            if (gVar != p110m1.g.f29502d.a()) {
                lVar.r0(V1.l.g.a(1, ((Number) gVar.c().c()).floatValue(), ((Number) gVar.c().o()).floatValue(), gVar.b()));
            }
            if (oVar.v().o(jVar.u()) && AbstractC2423x.p(oVar)) {
                if (gVar.b() < W6.n.c(((Number) gVar.c().o()).floatValue(), ((Number) gVar.c().c()).floatValue())) {
                    lVar.b(V1.l.a.f10495p);
                }
                if (gVar.b() > W6.n.f(((Number) gVar.c().c()).floatValue(), ((Number) gVar.c().o()).floatValue())) {
                    lVar.b(V1.l.a.f10496q);
                }
            }
        }
        b.a(lVar, oVar);
        p074i1.a.d(oVar, lVar);
        p074i1.a.e(oVar, lVar);
        p110m1.i iVar = (p110m1.i) p110m1.l.a(oVar.v(), rVar3.i());
        p110m1.a aVar11 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.s());
        if (iVar != null && aVar11 != null) {
            if (!p074i1.a.b(oVar)) {
                lVar.X("android.widget.HorizontalScrollView");
            }
            if (((Number) iVar.a().invoke()).floatValue() > 0.0f) {
                lVar.u0(true);
            }
            if (AbstractC2423x.p(oVar)) {
                if (S0(iVar)) {
                    lVar.b(V1.l.a.f10495p);
                    lVar.b(!(oVar.o().getLayoutDirection() == A1.t.Rtl) ? V1.l.a.f10466E : V1.l.a.f10464C);
                }
                if (R0(iVar)) {
                    lVar.b(V1.l.a.f10496q);
                    lVar.b(!(oVar.o().getLayoutDirection() == A1.t.Rtl) ? V1.l.a.f10464C : V1.l.a.f10466E);
                }
            }
        }
        p110m1.i iVar2 = (p110m1.i) p110m1.l.a(oVar.v(), rVar3.E());
        if (iVar2 != null && aVar11 != null) {
            if (!p074i1.a.b(oVar)) {
                lVar.X("android.widget.ScrollView");
            }
            if (((Number) iVar2.a().invoke()).floatValue() > 0.0f) {
                lVar.u0(true);
            }
            if (AbstractC2423x.p(oVar)) {
                if (S0(iVar2)) {
                    lVar.b(V1.l.a.f10495p);
                    lVar.b(V1.l.a.f10465D);
                }
                if (R0(iVar2)) {
                    lVar.b(V1.l.a.f10496q);
                    lVar.b(V1.l.a.f10463B);
                }
            }
        }
        if (i10 >= 29) {
            c.a(lVar, oVar);
        }
        lVar.n0((CharSequence) p110m1.l.a(oVar.v(), rVar3.r()));
        if (AbstractC2423x.p(oVar)) {
            p110m1.a aVar12 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.g());
            if (aVar12 != null) {
                lVar.b(new V1.l.a(262144, aVar12.b()));
                G g19 = G.f1419a;
            }
            p110m1.a aVar13 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.b());
            if (aVar13 != null) {
                lVar.b(new V1.l.a(524288, aVar13.b()));
                G g20 = G.f1419a;
            }
            p110m1.a aVar14 = (p110m1.a) p110m1.l.a(oVar.v(), jVar.f());
            if (aVar14 != null) {
                lVar.b(new V1.l.a(1048576, aVar14.b()));
                G g21 = G.f1419a;
            }
            if (oVar.v().o(jVar.d())) {
                List list2 = (List) oVar.v().u(jVar.d());
                int size2 = list2.size();
                int[] iArr = f14917g0;
                if (size2 >= iArr.length) {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
                D d8 = new D(0, 1, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (this.f14953u.e(i8)) {
                    Map map = (Map) this.f14953u.f(i8);
                    List listS0 = C0934n.s0(iArr);
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list2.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        p110m1.e eVar = (p110m1.e) list2.get(i11);
                        kotlin.jvm.internal.t.d(map);
                        if (map.containsKey(eVar.b())) {
                            Integer num = (Integer) map.get(eVar.b());
                            kotlin.jvm.internal.t.d(num);
                            d8.i(num.intValue(), eVar.b());
                            linkedHashMap.put(eVar.b(), num);
                            listS0.remove(num);
                            lVar.b(new V1.l.a(num.intValue(), eVar.b()));
                        } else {
                            arrayList2.add(eVar);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        p110m1.e eVar2 = (p110m1.e) arrayList2.get(i12);
                        int iIntValue = ((Number) listS0.get(i12)).intValue();
                        d8.i(iIntValue, eVar2.b());
                        linkedHashMap.put(eVar2.b(), Integer.valueOf(iIntValue));
                        lVar.b(new V1.l.a(iIntValue, eVar2.b()));
                    }
                } else {
                    int size5 = list2.size();
                    for (int i13 = 0; i13 < size5; i13++) {
                        p110m1.e eVar3 = (p110m1.e) list2.get(i13);
                        int i14 = f14917g0[i13];
                        d8.i(i14, eVar3.b());
                        linkedHashMap.put(eVar3.b(), Integer.valueOf(i14));
                        lVar.b(new V1.l.a(i14, eVar3.b()));
                    }
                }
                this.f14952t.i(i8, d8);
                this.f14953u.i(i8, linkedHashMap);
            }
        }
        lVar.t0(C0(oVar));
        Integer num2 = (Integer) this.f14925H.get(Integer.valueOf(i8));
        if (num2 != null) {
            View viewD = AbstractC2423x.D(this.f14935d.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (viewD != null) {
                lVar.C0(viewD);
            } else {
                lVar.D0(this.f14935d, num2.intValue());
            }
            M(i8, lVar.G0(), this.f14927V, null);
            G g22 = G.f1419a;
        }
        Integer num3 = (Integer) this.f14926I.get(Integer.valueOf(i8));
        if (num3 != null) {
            View viewD2 = AbstractC2423x.D(this.f14935d.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (viewD2 != null) {
                lVar.A0(viewD2);
                M(i8, lVar.G0(), this.f14928W, null);
            }
            G g23 = G.f1419a;
        }
    }

    public final boolean R(boolean z8, int i8, long j8) {
        if (kotlin.jvm.internal.t.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return S(g0().values(), z8, i8, j8);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public final boolean S(Collection collection, boolean z8, int i8, long j8) {
        w wVarI;
        p110m1.i iVar;
        boolean z9;
        if (Q0.f.l(j8, Q0.f.f9082b.b()) || !Q0.f.r(j8)) {
            return false;
        }
        if (z8) {
            wVarI = p110m1.r.f29573a.E();
        } else {
            if (z8) {
                throw new C6.m();
            }
            wVarI = p110m1.r.f29573a.i();
        }
        Collection<F0> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        for (F0 f8 : collection2) {
            if (M0.b(f8.a()).b(j8) && (iVar = (p110m1.i) p110m1.l.a(f8.b().m(), wVarI)) != null) {
                int i9 = iVar.b() ? -i8 : i8;
                if (i8 == 0 && iVar.b()) {
                    i9 = -1;
                }
                if (i9 >= 0 ? ((Number) iVar.c().invoke()).floatValue() >= ((Number) iVar.a().invoke()).floatValue() : ((Number) iVar.c().invoke()).floatValue() <= 0.0f) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            } else {
                z9 = false;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public final void T() {
        if (A0()) {
            Y0(this.f14935d.getSemanticsOwner().a(), this.f14931Z);
        }
        if (B0()) {
            Z0(this.f14935d.getSemanticsOwner().a(), this.f14931Z);
        }
        g1(g0());
        D1();
    }

    public final boolean T0(int i8, List list) {
        boolean z8;
        E0 e0R = AbstractC2423x.r(list, i8);
        if (e0R != null) {
            z8 = false;
        } else {
            E0 e8 = new E0(i8, this.f14934c0, null, null, null, null);
            z8 = true;
            e0R = e8;
        }
        this.f14934c0.add(e0R);
        return z8;
    }

    public final boolean U(int i8) {
        if (!x0(i8)) {
            return false;
        }
        this.f14947o = Integer.MIN_VALUE;
        this.f14948p = null;
        this.f14935d.invalidate();
        d1(this, i8, 65536, null, null, 12, null);
        return true;
    }

    public final boolean U0(int i8) {
        if (!D0() || x0(i8)) {
            return false;
        }
        int i9 = this.f14947o;
        if (i9 != Integer.MIN_VALUE) {
            d1(this, i9, 65536, null, null, 12, null);
        }
        this.f14947o = i8;
        this.f14935d.invalidate();
        d1(this, i8, 32768, null, null, 12, null);
        return true;
    }

    public final void V() {
        p110m1.a aVar;
        Function0 function0;
        Iterator it = g0().values().iterator();
        while (it.hasNext()) {
            p110m1.k kVarV = ((F0) it.next()).b().v();
            if (p110m1.l.a(kVarV, p110m1.r.f29573a.o()) != null && (aVar = (p110m1.a) p110m1.l.a(kVarV, p110m1.j.f29521a.a())) != null && (function0 = (Function0) aVar.a()) != null) {
            }
        }
    }

    public final void V0(E0 e8) {
        if (e8.L()) {
            this.f14935d.getSnapshotObserver().i(e8, this.f14936d0, new p(e8, this));
        }
    }

    public final AccessibilityEvent W(int i8, int i9) {
        F0 f8;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i9);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.f14935d.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.f14935d, i8);
        if (A0() && (f8 = (F0) g0().get(Integer.valueOf(i8))) != null) {
            accessibilityEventObtain.setPassword(f8.b().m().o(p110m1.r.f29573a.s()));
        }
        return accessibilityEventObtain;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfo X(int i8) {
        InterfaceC1733p interfaceC1733pA;
        AbstractC1726i abstractC1726iW;
        AndroidComposeView.c viewTreeOwners = this.f14935d.getViewTreeOwners();
        if (((viewTreeOwners == null || (interfaceC1733pA = viewTreeOwners.a()) == null || (abstractC1726iW = interfaceC1733pA.w()) == null) ? null : abstractC1726iW.b()) == AbstractC1726i.b.DESTROYED) {
            return null;
        }
        V1.l lVarR = V1.l.R();
        F0 f8 = (F0) g0().get(Integer.valueOf(i8));
        if (f8 == null) {
            return null;
        }
        p110m1.o oVarB = f8.b();
        if (i8 == -1) {
            ViewParent viewParentQ = I.q(this.f14935d);
            lVarR.o0(viewParentQ instanceof View ? (View) viewParentQ : null);
        } else {
            p110m1.o oVarQ = oVarB.q();
            Integer numValueOf = oVarQ != null ? Integer.valueOf(oVarQ.n()) : null;
            if (numValueOf == null) {
                throw new IllegalStateException(("semanticsNode " + i8 + " has null parent").toString());
            }
            int iIntValue = numValueOf.intValue();
            lVarR.p0(this.f14935d, iIntValue != this.f14935d.getSemanticsOwner().a().n() ? iIntValue : -1);
        }
        lVarR.w0(this.f14935d, i8);
        lVarR.U(N(f8));
        Q0(i8, lVarR, oVarB);
        return lVarR.G0();
    }

    public final int X0(int i8) {
        if (i8 == this.f14935d.getSemanticsOwner().a().n()) {
            return -1;
        }
        return i8;
    }

    public final AccessibilityEvent Y(int i8, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventW = W(i8, 8192);
        if (num != null) {
            accessibilityEventW.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventW.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventW.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventW.getText().add(charSequence);
        }
        return accessibilityEventW;
    }

    public final void Y0(p110m1.o oVar, i iVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listS = oVar.s();
        int size = listS.size();
        for (int i8 = 0; i8 < size; i8++) {
            p110m1.o oVar2 = (p110m1.o) listS.get(i8);
            if (g0().containsKey(Integer.valueOf(oVar2.n()))) {
                if (!iVar.a().contains(Integer.valueOf(oVar2.n()))) {
                    F0(oVar.p());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(oVar2.n()));
            }
        }
        Iterator it = iVar.a().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                F0(oVar.p());
                return;
            }
        }
        List listS2 = oVar.s();
        int size2 = listS2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            p110m1.o oVar3 = (p110m1.o) listS2.get(i9);
            if (g0().containsKey(Integer.valueOf(oVar3.n()))) {
                Object obj = this.f14930Y.get(Integer.valueOf(oVar3.n()));
                kotlin.jvm.internal.t.d(obj);
                Y0(oVar3, (i) obj);
            }
        }
    }

    public final boolean Z(MotionEvent motionEvent) {
        if (!D0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iV0 = v0(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.f14935d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            C1(iV0);
            if (iV0 == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.f14937e == Integer.MIN_VALUE) {
            return this.f14935d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        C1(Integer.MIN_VALUE);
        return true;
    }

    public final void Z0(p110m1.o oVar, i iVar) {
        List listS = oVar.s();
        int size = listS.size();
        for (int i8 = 0; i8 < size; i8++) {
            p110m1.o oVar2 = (p110m1.o) listS.get(i8);
            if (g0().containsKey(Integer.valueOf(oVar2.n())) && !iVar.a().contains(Integer.valueOf(oVar2.n()))) {
                A1(oVar2);
            }
        }
        for (Map.Entry entry : this.f14930Y.entrySet()) {
            if (!g0().containsKey(entry.getKey())) {
                Q(((Number) entry.getKey()).intValue());
            }
        }
        List listS2 = oVar.s();
        int size2 = listS2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            p110m1.o oVar3 = (p110m1.o) listS2.get(i9);
            if (g0().containsKey(Integer.valueOf(oVar3.n())) && this.f14930Y.containsKey(Integer.valueOf(oVar3.n()))) {
                Object obj = this.f14930Y.get(Integer.valueOf(oVar3.n()));
                kotlin.jvm.internal.t.d(obj);
                Z0(oVar3, (i) obj);
            }
        }
    }

    public final void a1(int i8, String str) {
        p092k1.c cVar = this.f14919B;
        if (cVar != null && Build.VERSION.SDK_INT >= 29) {
            AutofillId autofillIdA = cVar.a(i8);
            if (autofillIdA == null) {
                throw new IllegalStateException("Invalid content capture ID");
            }
            cVar.c(autofillIdA, str);
        }
    }

    @Override // U1.C1639a
    public V1.m b(View view) {
        return this.f14946n;
    }

    public final void b0(p110m1.o oVar, ArrayList arrayList, Map map) {
        boolean z8 = oVar.o().getLayoutDirection() == A1.t.Rtl;
        boolean zBooleanValue = ((Boolean) oVar.m().y(p110m1.r.f29573a.p(), C2425y.f24381a)).booleanValue();
        if ((zBooleanValue || C0(oVar)) && g0().keySet().contains(Integer.valueOf(oVar.n()))) {
            arrayList.add(oVar);
        }
        if (zBooleanValue) {
            map.put(Integer.valueOf(oVar.n()), u1(z8, z.U0(oVar.k())));
            return;
        }
        List listK = oVar.k();
        int size = listK.size();
        for (int i8 = 0; i8 < size; i8++) {
            b0((p110m1.o) listK.get(i8), arrayList, map);
        }
    }

    public final boolean b1(AccessibilityEvent accessibilityEvent) {
        if (!A0()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f14949q = true;
        }
        try {
            return ((Boolean) this.f14938f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f14949q = false;
        }
    }

    public final int c0(p110m1.o oVar) {
        p110m1.k kVarV = oVar.v();
        p110m1.r rVar = p110m1.r.f29573a;
        return (kVarV.o(rVar.c()) || !oVar.v().o(rVar.A())) ? this.f14954v : p128o1.G.i(((p128o1.G) oVar.v().u(rVar.A())).r());
    }

    public final boolean c1(int i8, int i9, Integer num, List list) {
        if (i8 == Integer.MIN_VALUE || !z0()) {
            return false;
        }
        AccessibilityEvent accessibilityEventW = W(i8, i9);
        if (num != null) {
            accessibilityEventW.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventW.setContentDescription(C1.a.d(list, com.amazon.a.a.o.b.f.f16777a, null, null, 0, null, null, 62, null));
        }
        return b1(accessibilityEventW);
    }

    public final int d0(p110m1.o oVar) {
        p110m1.k kVarV = oVar.v();
        p110m1.r rVar = p110m1.r.f29573a;
        return (kVarV.o(rVar.c()) || !oVar.v().o(rVar.A())) ? this.f14954v : p128o1.G.n(((p128o1.G) oVar.v().u(rVar.A())).r());
    }

    public final boolean e0() {
        return this.f14918A;
    }

    public final void e1(int i8, int i9, String str) {
        AccessibilityEvent accessibilityEventW = W(X0(i8), 32);
        accessibilityEventW.setContentChangeTypes(i9);
        if (str != null) {
            accessibilityEventW.getText().add(str);
        }
        b1(accessibilityEventW);
    }

    public final p092k1.c f0(View view) {
        p092k1.d.c(view, 1);
        return p092k1.d.b(view);
    }

    public final void f1(int i8) {
        C0365g c0365g = this.f14922E;
        if (c0365g != null) {
            if (i8 != c0365g.d().n()) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0365g.f() <= 1000) {
                AccessibilityEvent accessibilityEventW = W(X0(c0365g.d().n()), 131072);
                accessibilityEventW.setFromIndex(c0365g.b());
                accessibilityEventW.setToIndex(c0365g.e());
                accessibilityEventW.setAction(c0365g.a());
                accessibilityEventW.setMovementGranularity(c0365g.c());
                accessibilityEventW.getText().add(o0(c0365g.d()));
                b1(accessibilityEventW);
            }
        }
        this.f14922E = null;
    }

    public final Map g0() {
        if (this.f14958z) {
            this.f14958z = false;
            this.f14923F = AbstractC2423x.t(this.f14935d.getSemanticsOwner());
            if (A0()) {
                p1();
            }
        }
        return this.f14923F;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0394  */
    /* JADX WARN: Code duplicated, block: B:132:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:137:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:143:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:180:0x059d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    public final void g1(Map map) {
        boolean zC;
        Integer num;
        Integer num2;
        Integer num3;
        int i8;
        String strI;
        int i9;
        int i10;
        boolean z8;
        boolean z9;
        AccessibilityEvent accessibilityEventY;
        boolean zK;
        ?? r8;
        g gVar = this;
        Integer num4 = 64;
        int i11 = 0;
        Integer num5 = 0;
        ArrayList arrayList = new ArrayList(gVar.f14934c0);
        gVar.f14934c0.clear();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            i iVar = (i) gVar.f14930Y.get(Integer.valueOf(iIntValue));
            F0 f8 = (F0) map.get(Integer.valueOf(iIntValue));
            p110m1.o oVarB = f8 != null ? f8.b() : null;
            if (oVarB == null) {
                throw new IllegalStateException("no value for specified key");
            }
            if (iVar == null) {
                Iterator it2 = oVarB.v().iterator();
                while (it2.hasNext()) {
                    Object key = ((Map.Entry) it2.next()).getKey();
                    p110m1.r rVar = p110m1.r.f29573a;
                    if (kotlin.jvm.internal.t.c(key, rVar.z())) {
                        List list = (List) p110m1.l.a(oVarB.v(), rVar.z());
                        gVar.a1(oVarB.n(), String.valueOf(list != null ? (C2739d) z.k0(list) : null));
                    }
                }
            } else {
                int i12 = i11;
                for (Map.Entry entry : oVarB.v()) {
                    Object key2 = entry.getKey();
                    p110m1.r rVar2 = p110m1.r.f29573a;
                    if (((kotlin.jvm.internal.t.c(key2, rVar2.i()) || kotlin.jvm.internal.t.c(entry.getKey(), rVar2.E())) ? gVar.T0(iIntValue, arrayList) : i11) == 0 && kotlin.jvm.internal.t.c(entry.getValue(), p110m1.l.a(iVar.c(), (w) entry.getKey()))) {
                        num = num4;
                        num2 = num5;
                        i8 = i12;
                        i8 = i12;
                        num5 = num2;
                    } else {
                        w wVar = (w) entry.getKey();
                        if (kotlin.jvm.internal.t.c(wVar, rVar2.z())) {
                            List list2 = (List) p110m1.l.a(iVar.c(), rVar2.z());
                            C2739d c2739d = list2 != null ? (C2739d) z.k0(list2) : null;
                            List list3 = (List) p110m1.l.a(oVarB.v(), rVar2.z());
                            C2739d c2739d2 = list3 != null ? (C2739d) z.k0(list3) : null;
                            if (!kotlin.jvm.internal.t.c(c2739d, c2739d2)) {
                                gVar.a1(oVarB.n(), String.valueOf(c2739d2));
                            }
                        } else if (kotlin.jvm.internal.t.c(wVar, rVar2.r())) {
                            Object value = entry.getValue();
                            kotlin.jvm.internal.t.e(value, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) value;
                            if (iVar.d()) {
                                gVar.e1(iIntValue, 8, str);
                            }
                        } else {
                            if (kotlin.jvm.internal.t.c(wVar, rVar2.x()) ? true : kotlin.jvm.internal.t.c(wVar, rVar2.C())) {
                                d1(gVar, gVar.X0(iIntValue), 2048, num4, null, 8, null);
                                num = num4;
                                num2 = num5;
                                d1(gVar, gVar.X0(iIntValue), 2048, num2, null, 8, null);
                                i8 = i12;
                            } else {
                                num = num4;
                                if (kotlin.jvm.internal.t.c(wVar, rVar2.t())) {
                                    d1(gVar, gVar.X0(iIntValue), 2048, num, null, 8, null);
                                    num2 = num5;
                                    d1(gVar, gVar.X0(iIntValue), 2048, num2, null, 8, null);
                                    i8 = i12;
                                } else {
                                    num2 = num5;
                                    if (kotlin.jvm.internal.t.c(wVar, rVar2.w())) {
                                        p110m1.h hVar = (p110m1.h) p110m1.l.a(oVarB.m(), rVar2.u());
                                        int iG = p110m1.h.f29507b.g();
                                        if (hVar == null) {
                                            r8 = i11;
                                        } else {
                                            zK = p110m1.h.k(hVar.n(), iG);
                                        }
                                        if (r8 != 0) {
                                            r8 = zK;
                                            if (kotlin.jvm.internal.t.c(p110m1.l.a(oVarB.m(), rVar2.w()), Boolean.TRUE)) {
                                                AccessibilityEvent accessibilityEventW = gVar.W(gVar.X0(iIntValue), 4);
                                                p110m1.o oVarA = oVarB.a();
                                                List list4 = (List) p110m1.l.a(oVarA.m(), rVar2.c());
                                                String strD = list4 != null ? C1.a.d(list4, com.amazon.a.a.o.b.f.f16777a, null, null, 0, null, null, 62, null) : null;
                                                List list5 = (List) p110m1.l.a(oVarA.m(), rVar2.z());
                                                String strD2 = list5 != null ? C1.a.d(list5, com.amazon.a.a.o.b.f.f16777a, null, null, 0, null, null, 62, null) : null;
                                                if (strD != null) {
                                                    accessibilityEventW.setContentDescription(strD);
                                                }
                                                if (strD2 != null) {
                                                    accessibilityEventW.getText().add(strD2);
                                                }
                                                gVar.b1(accessibilityEventW);
                                                i8 = i12;
                                            } else {
                                                d1(gVar, gVar.X0(iIntValue), 2048, num2, null, 8, null);
                                                i8 = i12;
                                            }
                                        } else {
                                            r8 = zK;
                                            d1(gVar, gVar.X0(iIntValue), 2048, num, null, 8, null);
                                            num2 = num2;
                                            d1(gVar, gVar.X0(iIntValue), 2048, num2, null, 8, null);
                                            i8 = i12;
                                        }
                                    } else if (kotlin.jvm.internal.t.c(wVar, rVar2.c())) {
                                        int iX0 = gVar.X0(iIntValue);
                                        Object value2 = entry.getValue();
                                        kotlin.jvm.internal.t.e(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                        gVar.c1(iX0, 2048, 4, (List) value2);
                                        i8 = i12;
                                    } else {
                                        if (!kotlin.jvm.internal.t.c(wVar, rVar2.e())) {
                                            num3 = num2;
                                            if (kotlin.jvm.internal.t.c(wVar, rVar2.A())) {
                                                C2739d c2739dQ0 = gVar.q0(oVarB.v());
                                                if (c2739dQ0 == null || (strI = c2739dQ0.i()) == null) {
                                                    strI = "";
                                                }
                                                long jR = ((p128o1.G) oVarB.v().u(rVar2.A())).r();
                                                gVar.b1(gVar.Y(gVar.X0(iIntValue), Integer.valueOf(p128o1.G.n(jR)), Integer.valueOf(p128o1.G.i(jR)), Integer.valueOf(strI.length()), gVar.z1(strI, 100000)));
                                                gVar.f1(oVarB.n());
                                            } else if (kotlin.jvm.internal.t.c(wVar, rVar2.i()) ? true : kotlin.jvm.internal.t.c(wVar, rVar2.E())) {
                                                gVar.F0(oVarB.p());
                                                E0 e0R = AbstractC2423x.r(gVar.f14934c0, iIntValue);
                                                kotlin.jvm.internal.t.d(e0R);
                                                e0R.f((p110m1.i) p110m1.l.a(oVarB.v(), rVar2.i()));
                                                e0R.i((p110m1.i) p110m1.l.a(oVarB.v(), rVar2.E()));
                                                gVar.V0(e0R);
                                            } else if (kotlin.jvm.internal.t.c(wVar, rVar2.g())) {
                                                Object value3 = entry.getValue();
                                                kotlin.jvm.internal.t.e(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                                if (((Boolean) value3).booleanValue()) {
                                                    gVar.b1(gVar.W(gVar.X0(oVarB.n()), 8));
                                                }
                                                num2 = num3;
                                                d1(gVar, gVar.X0(oVarB.n()), 2048, num2, null, 8, null);
                                                i8 = i12;
                                            } else {
                                                num2 = num3;
                                                p110m1.j jVar = p110m1.j.f29521a;
                                                if (kotlin.jvm.internal.t.c(wVar, jVar.d())) {
                                                    List list6 = (List) oVarB.v().u(jVar.d());
                                                    List list7 = (List) p110m1.l.a(iVar.c(), jVar.d());
                                                    if (list7 != null) {
                                                        ?? linkedHashSet = new LinkedHashSet();
                                                        int size = list6.size();
                                                        for (int i13 = 0; i13 < size; i13++) {
                                                            linkedHashSet.add(((p110m1.e) list6.get(i13)).b());
                                                        }
                                                        ?? linkedHashSet2 = new LinkedHashSet();
                                                        int size2 = list7.size();
                                                        for (int i14 = 0; i14 < size2; i14++) {
                                                            linkedHashSet2.add(((p110m1.e) list7.get(i14)).b());
                                                        }
                                                        if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                            i8 = 0;
                                                        } else {
                                                            i8 = 1;
                                                        }
                                                    } else if (!list6.isEmpty()) {
                                                        i8 = i12;
                                                        num5 = num2;
                                                        i8 = 1;
                                                    }
                                                } else {
                                                    if (entry.getValue() instanceof p110m1.a) {
                                                        Object value4 = entry.getValue();
                                                        kotlin.jvm.internal.t.e(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                        if (AbstractC2423x.o((p110m1.a) value4, p110m1.l.a(iVar.c(), (w) entry.getKey()))) {
                                                            i8 = 0;
                                                        }
                                                    }
                                                    i8 = 1;
                                                }
                                            }
                                        } else if (oVarB.v().o(p110m1.j.f29521a.w())) {
                                            C2739d c2739dQ1 = gVar.q0(iVar.c());
                                            if (c2739dQ1 == null) {
                                                c2739dQ1 = "";
                                            }
                                            C2739d c2739dQ2 = gVar.q0(oVarB.v());
                                            if (c2739dQ2 == null) {
                                                c2739dQ2 = "";
                                            }
                                            CharSequence charSequenceZ1 = gVar.z1(c2739dQ2, 100000);
                                            int length = c2739dQ1.length();
                                            int length2 = c2739dQ2.length();
                                            int iG2 = W6.n.g(length, length2);
                                            while (true) {
                                                if (i11 >= iG2) {
                                                    num3 = num2;
                                                    break;
                                                }
                                                num3 = num2;
                                                if (c2739dQ1.charAt(i11) != c2739dQ2.charAt(i11)) {
                                                    break;
                                                }
                                                i11++;
                                                num2 = num3;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                if (i15 >= iG2 - i11) {
                                                    i9 = i15;
                                                    break;
                                                }
                                                i9 = i15;
                                                if (c2739dQ1.charAt((length - 1) - i15) != c2739dQ2.charAt((length2 - 1) - i9)) {
                                                    break;
                                                } else {
                                                    i15 = i9 + 1;
                                                }
                                            }
                                            int i16 = (length - i9) - i11;
                                            int i17 = (length2 - i9) - i11;
                                            p110m1.k kVarV = iVar.b().v();
                                            p110m1.j jVar2 = p110m1.j.f29521a;
                                            if (kVarV.o(jVar2.w())) {
                                                p110m1.k kVarM = iVar.b().m();
                                                p110m1.r rVar3 = p110m1.r.f29573a;
                                                i10 = length2;
                                                if (!kVarM.o(rVar3.s()) && oVarB.m().o(rVar3.s())) {
                                                    z8 = true;
                                                }
                                                if (iVar.b().v().o(jVar2.w())) {
                                                    p110m1.k kVarM2 = iVar.b().m();
                                                    p110m1.r rVar4 = p110m1.r.f29573a;
                                                    z9 = (kVarM2.o(rVar4.s()) || oVarB.m().o(rVar4.s())) ? false : true;
                                                }
                                                if (!z8 || z9) {
                                                    accessibilityEventY = gVar.Y(gVar.X0(iIntValue), num3, num3, Integer.valueOf(i10), charSequenceZ1);
                                                } else {
                                                    accessibilityEventY = gVar.W(gVar.X0(iIntValue), 16);
                                                    accessibilityEventY.setFromIndex(i11);
                                                    accessibilityEventY.setRemovedCount(i16);
                                                    accessibilityEventY.setAddedCount(i17);
                                                    accessibilityEventY.setBeforeText(c2739dQ1);
                                                    accessibilityEventY.getText().add(charSequenceZ1);
                                                }
                                                accessibilityEventY.setClassName("android.widget.EditText");
                                                gVar.b1(accessibilityEventY);
                                                if (z8 || z9) {
                                                    long jR2 = ((p128o1.G) oVarB.v().u(p110m1.r.f29573a.A())).r();
                                                    accessibilityEventY.setFromIndex(p128o1.G.n(jR2));
                                                    accessibilityEventY.setToIndex(p128o1.G.i(jR2));
                                                    gVar.b1(accessibilityEventY);
                                                }
                                            } else {
                                                i10 = length2;
                                            }
                                            z8 = false;
                                            if (iVar.b().v().o(jVar2.w())) {
                                                p110m1.k kVarM3 = iVar.b().m();
                                                p110m1.r rVar5 = p110m1.r.f29573a;
                                                if (kVarM3.o(rVar5.s())) {
                                                }
                                            }
                                            if (z8) {
                                                accessibilityEventY = gVar.Y(gVar.X0(iIntValue), num3, num3, Integer.valueOf(i10), charSequenceZ1);
                                            } else {
                                                accessibilityEventY = gVar.Y(gVar.X0(iIntValue), num3, num3, Integer.valueOf(i10), charSequenceZ1);
                                            }
                                            accessibilityEventY.setClassName("android.widget.EditText");
                                            gVar.b1(accessibilityEventY);
                                            if (z8) {
                                                long jR3 = ((p128o1.G) oVarB.v().u(p110m1.r.f29573a.A())).r();
                                                accessibilityEventY.setFromIndex(p128o1.G.n(jR3));
                                                accessibilityEventY.setToIndex(p128o1.G.i(jR3));
                                                gVar.b1(accessibilityEventY);
                                            } else {
                                                long jR4 = ((p128o1.G) oVarB.v().u(p110m1.r.f29573a.A())).r();
                                                accessibilityEventY.setFromIndex(p128o1.G.n(jR4));
                                                accessibilityEventY.setToIndex(p128o1.G.i(jR4));
                                                gVar.b1(accessibilityEventY);
                                            }
                                        } else {
                                            num3 = num2;
                                            d1(gVar, gVar.X0(iIntValue), 2048, 2, null, 8, null);
                                        }
                                        num2 = num3;
                                        i8 = i12;
                                    }
                                }
                            }
                            i8 = i12;
                            num5 = num2;
                        }
                        num = num4;
                        num2 = num5;
                        i8 = i12;
                        i8 = i12;
                        num5 = num2;
                    }
                    num4 = num;
                    i11 = 0;
                    i12 = i8;
                }
                Integer num6 = num4;
                Integer num7 = num5;
                ?? r17 = i12;
                if (i12 == 0) {
                    zC = AbstractC2423x.C(oVarB, iVar.c());
                }
                if (r17 != 0) {
                    r17 = zC;
                    d1(gVar, gVar.X0(iIntValue), 2048, num7, null, 8, null);
                }
                r17 = zC;
                i11 = 0;
                gVar = this;
                num5 = num7;
                num4 = num6;
            }
        }
    }

    public final String h0() {
        return this.f14928W;
    }

    public final void h1(F f8, C1749b c1749b) {
        p110m1.k kVarG;
        F fS;
        if (f8.I0() && !this.f14935d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(f8)) {
            int size = this.f14956x.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (AbstractC2423x.z((F) this.f14956x.G(i8), f8)) {
                    return;
                }
            }
            if (!f8.j0().r(Z.a(8))) {
                f8 = AbstractC2423x.s(f8, s.f14991a);
            }
            if (f8 == null || (kVarG = f8.G()) == null) {
                return;
            }
            if (!kVarG.E() && (fS = AbstractC2423x.s(f8, r.f14990a)) != null) {
                f8 = fS;
            }
            int iO0 = f8.o0();
            if (c1749b.add(Integer.valueOf(iO0))) {
                d1(this, X0(iO0), 2048, 1, null, 8, null);
            }
        }
    }

    public final String i0() {
        return this.f14927V;
    }

    public final void i1(F f8) {
        if (f8.I0() && !this.f14935d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(f8)) {
            int iO0 = f8.o0();
            p110m1.i iVar = (p110m1.i) this.f14950r.get(Integer.valueOf(iO0));
            p110m1.i iVar2 = (p110m1.i) this.f14951s.get(Integer.valueOf(iO0));
            if (iVar == null && iVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventW = W(iO0, 4096);
            if (iVar != null) {
                accessibilityEventW.setScrollX((int) ((Number) iVar.c().invoke()).floatValue());
                accessibilityEventW.setMaxScrollX((int) ((Number) iVar.a().invoke()).floatValue());
            }
            if (iVar2 != null) {
                accessibilityEventW.setScrollY((int) ((Number) iVar2.c().invoke()).floatValue());
                accessibilityEventW.setMaxScrollY((int) ((Number) iVar2.a().invoke()).floatValue());
            }
            b1(accessibilityEventW);
        }
    }

    public final HashMap j0() {
        return this.f14926I;
    }

    public final boolean j1(p110m1.o oVar, int i8, int i9, boolean z8) {
        String strO0;
        p110m1.k kVarV = oVar.v();
        p110m1.j jVar = p110m1.j.f29521a;
        if (kVarV.o(jVar.v()) && AbstractC2423x.p(oVar)) {
            Q6.p pVar = (Q6.p) ((p110m1.a) oVar.v().u(jVar.v())).a();
            if (pVar != null) {
                return ((Boolean) pVar.invoke(Integer.valueOf(i8), Integer.valueOf(i9), Boolean.valueOf(z8))).booleanValue();
            }
            return false;
        }
        if ((i8 == i9 && i9 == this.f14954v) || (strO0 = o0(oVar)) == null) {
            return false;
        }
        if (i8 < 0 || i8 != i9 || i9 > strO0.length()) {
            i8 = -1;
        }
        this.f14954v = i8;
        boolean z9 = strO0.length() > 0;
        b1(Y(X0(oVar.n()), z9 ? Integer.valueOf(this.f14954v) : null, z9 ? Integer.valueOf(this.f14954v) : null, z9 ? Integer.valueOf(strO0.length()) : null, strO0));
        f1(oVar.n());
        return true;
    }

    public final HashMap k0() {
        return this.f14925H;
    }

    public final void k1(p092k1.c cVar) {
        this.f14919B = cVar;
    }

    public final boolean l0(p110m1.o oVar) {
        p110m1.k kVarV = oVar.v();
        p110m1.r rVar = p110m1.r.f29573a;
        p119n1.a aVar = (p119n1.a) p110m1.l.a(kVarV, rVar.C());
        p110m1.h hVar = (p110m1.h) p110m1.l.a(oVar.v(), rVar.u());
        boolean z8 = aVar != null;
        if (((Boolean) p110m1.l.a(oVar.v(), rVar.w())) != null) {
            if (!(hVar != null ? p110m1.h.k(hVar.n(), p110m1.h.f29507b.g()) : false)) {
                return true;
            }
        }
        return z8;
    }

    public final void l1(p110m1.o oVar, V1.l lVar) {
        p110m1.k kVarV = oVar.v();
        p110m1.r rVar = p110m1.r.f29573a;
        if (kVarV.o(rVar.f())) {
            lVar.c0(true);
            lVar.f0((CharSequence) p110m1.l.a(oVar.v(), rVar.f()));
        }
    }

    public final String m0(p110m1.o oVar) {
        p110m1.k kVarV = oVar.v();
        p110m1.r rVar = p110m1.r.f29573a;
        Object objA = p110m1.l.a(kVarV, rVar.x());
        p119n1.a aVar = (p119n1.a) p110m1.l.a(oVar.v(), rVar.C());
        p110m1.h hVar = (p110m1.h) p110m1.l.a(oVar.v(), rVar.u());
        int iK = 0;
        if (aVar != null) {
            int i8 = m.f14979a[aVar.ordinal()];
            if (i8 == 1) {
                if ((hVar == null ? false : p110m1.h.k(hVar.n(), p110m1.h.f29507b.f())) && objA == null) {
                    objA = this.f14935d.getContext().getResources().getString(L0.m.f4897g);
                }
            } else if (i8 == 2) {
                if ((hVar == null ? false : p110m1.h.k(hVar.n(), p110m1.h.f29507b.f())) && objA == null) {
                    objA = this.f14935d.getContext().getResources().getString(L0.m.f4896f);
                }
            } else if (i8 == 3 && objA == null) {
                objA = this.f14935d.getContext().getResources().getString(L0.m.f4894d);
            }
        }
        Boolean bool = (Boolean) p110m1.l.a(oVar.v(), rVar.w());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(hVar == null ? false : p110m1.h.k(hVar.n(), p110m1.h.f29507b.g())) && objA == null) {
                objA = zBooleanValue ? this.f14935d.getContext().getResources().getString(L0.m.f4898h) : this.f14935d.getContext().getResources().getString(L0.m.f4895e);
            }
        }
        p110m1.g gVar = (p110m1.g) p110m1.l.a(oVar.v(), rVar.t());
        if (gVar != null) {
            if (gVar != p110m1.g.f29502d.a()) {
                if (objA == null) {
                    W6.e eVarC = gVar.c();
                    float fJ = W6.n.j(((((Number) eVarC.o()).floatValue() - ((Number) eVarC.c()).floatValue()) > 0.0f ? 1 : ((((Number) eVarC.o()).floatValue() - ((Number) eVarC.c()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (gVar.b() - ((Number) eVarC.c()).floatValue()) / (((Number) eVarC.o()).floatValue() - ((Number) eVarC.c()).floatValue()), 0.0f, 1.0f);
                    if (!(fJ == 0.0f)) {
                        iK = (fJ == 1.0f ? 1 : 0) != 0 ? 100 : W6.n.k(S6.c.d(fJ * 100), 1, 99);
                    }
                    objA = this.f14935d.getContext().getResources().getString(L0.m.f4901k, Integer.valueOf(iK));
                }
            } else if (objA == null) {
                objA = this.f14935d.getContext().getResources().getString(L0.m.f4893c);
            }
        }
        return (String) objA;
    }

    public final void m1(p110m1.o oVar, V1.l lVar) {
        lVar.V(l0(oVar));
    }

    public final SpannableString n0(p110m1.o oVar) {
        C2739d c2739d;
        AbstractC3009n.b fontFamilyResolver = this.f14935d.getFontFamilyResolver();
        C2739d c2739dQ0 = q0(oVar.v());
        SpannableString spannableStringB = null;
        SpannableString spannableString = (SpannableString) z1(c2739dQ0 != null ? p192w1.a.b(c2739dQ0, this.f14935d.getDensity(), fontFamilyResolver, this.f14929X) : null, 100000);
        List list = (List) p110m1.l.a(oVar.v(), p110m1.r.f29573a.z());
        if (list != null && (c2739d = (C2739d) z.k0(list)) != null) {
            spannableStringB = p192w1.a.b(c2739d, this.f14935d.getDensity(), fontFamilyResolver, this.f14929X);
        }
        return spannableString == null ? (SpannableString) z1(spannableStringB, 100000) : spannableString;
    }

    public final void n1(p110m1.o oVar, V1.l lVar) {
        lVar.x0(m0(oVar));
    }

    public final String o0(p110m1.o oVar) {
        C2739d c2739d;
        if (oVar == null) {
            return null;
        }
        p110m1.k kVarV = oVar.v();
        p110m1.r rVar = p110m1.r.f29573a;
        if (kVarV.o(rVar.c())) {
            return C1.a.d((List) oVar.v().u(rVar.c()), com.amazon.a.a.o.b.f.f16777a, null, null, 0, null, null, 62, null);
        }
        if (oVar.v().o(p110m1.j.f29521a.w())) {
            C2739d c2739dQ0 = q0(oVar.v());
            if (c2739dQ0 != null) {
                return c2739dQ0.i();
            }
            return null;
        }
        List list = (List) p110m1.l.a(oVar.v(), rVar.z());
        if (list == null || (c2739d = (C2739d) z.k0(list)) == null) {
            return null;
        }
        return c2739d.i();
    }

    public final void o1(p110m1.o oVar, V1.l lVar) {
        lVar.y0(n0(oVar));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1733p interfaceC1733p) {
        w0(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC1733p interfaceC1733p) {
        w0(false);
    }

    public final InterfaceC2380b p0(p110m1.o oVar, int i8) {
        String strO0;
        E eR0;
        if (oVar == null || (strO0 = o0(oVar)) == null || strO0.length() == 0) {
            return null;
        }
        if (i8 == 1) {
            androidx.compose.ui.platform.b bVarA = androidx.compose.ui.platform.b.f14891d.a(this.f14935d.getContext().getResources().getConfiguration().locale);
            bVarA.e(strO0);
            return bVarA;
        }
        if (i8 == 2) {
            androidx.compose.ui.platform.f fVarA = androidx.compose.ui.platform.f.f14911d.a(this.f14935d.getContext().getResources().getConfiguration().locale);
            fVarA.e(strO0);
            return fVarA;
        }
        if (i8 != 4) {
            if (i8 == 8) {
                androidx.compose.ui.platform.e eVarA = androidx.compose.ui.platform.e.f14909c.a();
                eVarA.e(strO0);
                return eVarA;
            }
            if (i8 != 16) {
                return null;
            }
        }
        if (!oVar.v().o(p110m1.j.f29521a.h()) || (eR0 = r0(oVar.v())) == null) {
            return null;
        }
        if (i8 == 4) {
            androidx.compose.ui.platform.c cVarA = androidx.compose.ui.platform.c.f14895d.a();
            cVarA.j(strO0, eR0);
            return cVarA;
        }
        androidx.compose.ui.platform.d dVarA = androidx.compose.ui.platform.d.f14901f.a();
        dVarA.j(strO0, eR0, oVar);
        return dVarA;
    }

    public final void p1() {
        this.f14925H.clear();
        this.f14926I.clear();
        F0 f8 = (F0) g0().get(-1);
        p110m1.o oVarB = f8 != null ? f8.b() : null;
        kotlin.jvm.internal.t.d(oVarB);
        int i8 = 1;
        List listU1 = u1(oVarB.o().getLayoutDirection() == A1.t.Rtl, D6.r.t(oVarB));
        int iP = D6.r.p(listU1);
        if (1 > iP) {
            return;
        }
        while (true) {
            int iN = ((p110m1.o) listU1.get(i8 - 1)).n();
            int iN2 = ((p110m1.o) listU1.get(i8)).n();
            this.f14925H.put(Integer.valueOf(iN), Integer.valueOf(iN2));
            this.f14926I.put(Integer.valueOf(iN2), Integer.valueOf(iN));
            if (i8 == iP) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final C2739d q0(p110m1.k kVar) {
        return (C2739d) p110m1.l.a(kVar, p110m1.r.f29573a.e());
    }

    public final void q1() {
        p110m1.a aVar;
        Q6.k kVar;
        Iterator it = g0().values().iterator();
        while (it.hasNext()) {
            p110m1.k kVarV = ((F0) it.next()).b().v();
            if (kotlin.jvm.internal.t.c(p110m1.l.a(kVarV, p110m1.r.f29573a.o()), Boolean.FALSE) && (aVar = (p110m1.a) p110m1.l.a(kVarV, p110m1.j.f29521a.y())) != null && (kVar = (Q6.k) aVar.a()) != null) {
            }
        }
    }

    public final E r0(p110m1.k kVar) {
        Q6.k kVar2;
        ArrayList arrayList = new ArrayList();
        p110m1.a aVar = (p110m1.a) p110m1.l.a(kVar, p110m1.j.f29521a.h());
        if (aVar == null || (kVar2 = (Q6.k) aVar.a()) == null || !((Boolean) kVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (E) arrayList.get(0);
    }

    public final List r1(boolean z8, ArrayList arrayList, Map map) {
        ArrayList arrayList2 = new ArrayList();
        int iP = D6.r.p(arrayList);
        int size = 0;
        if (iP >= 0) {
            int i8 = 0;
            while (true) {
                p110m1.o oVar = (p110m1.o) arrayList.get(i8);
                if (i8 == 0 || !t1(arrayList2, oVar)) {
                    arrayList2.add(new C6.o(oVar.j(), D6.r.t(oVar)));
                }
                if (i8 == iP) {
                    break;
                }
                i8++;
            }
        }
        C0941v.C(arrayList2, j.f14974a);
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            C6.o oVar2 = (C6.o) arrayList2.get(i9);
            C0941v.C((List) oVar2.d(), new C2421w(new C2419v(z8 ? h.f14970a : f.f14963a, F.f23314W.b())));
            arrayList3.addAll((Collection) oVar2.d());
        }
        final t tVar = t.f14992a;
        C0941v.C(arrayList3, new Comparator() { // from class: h1.q
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.s1(tVar, obj, obj2);
            }
        });
        while (size <= D6.r.p(arrayList3)) {
            List list = (List) map.get(Integer.valueOf(((p110m1.o) arrayList3.get(size)).n()));
            if (list != null) {
                if (C0((p110m1.o) arrayList3.get(size))) {
                    size++;
                } else {
                    arrayList3.remove(size);
                }
                arrayList3.addAll(size, list);
                size += list.size();
            } else {
                size++;
            }
        }
        return arrayList3;
    }

    public final AndroidComposeView s0() {
        return this.f14935d;
    }

    public final void t0() {
        p110m1.a aVar;
        Q6.k kVar;
        Iterator it = g0().values().iterator();
        while (it.hasNext()) {
            p110m1.k kVarV = ((F0) it.next()).b().v();
            if (kotlin.jvm.internal.t.c(p110m1.l.a(kVarV, p110m1.r.f29573a.o()), Boolean.TRUE) && (aVar = (p110m1.a) p110m1.l.a(kVarV, p110m1.j.f29521a.y())) != null && (kVar = (Q6.k) aVar.a()) != null) {
            }
        }
    }

    public final List u1(boolean z8, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            b0((p110m1.o) list.get(i8), arrayList, linkedHashMap);
        }
        return r1(z8, arrayList, linkedHashMap);
    }

    public final int v0(float f8, float f9) {
        androidx.compose.ui.node.a aVarJ0;
        h0.m(this.f14935d, false, 1, null);
        C2355t c2355t = new C2355t();
        F.y0(this.f14935d.getRoot(), Q0.g.a(f8, f9), c2355t, false, false, 12, null);
        L0.i.c cVar = (L0.i.c) z.u0(c2355t);
        F fK = cVar != null ? AbstractC2347k.k(cVar) : null;
        if (fK != null && (aVarJ0 = fK.j0()) != null && aVarJ0.r(Z.a(8)) && AbstractC2423x.B(p110m1.p.a(fK, false)) && this.f14935d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(fK) == null) {
            return X0(fK.o0());
        }
        return Integer.MIN_VALUE;
    }

    public final RectF v1(p110m1.o oVar, Q0.h hVar) {
        if (oVar == null) {
            return null;
        }
        Q0.h hVarT = hVar.t(oVar.r());
        Q0.h hVarI = oVar.i();
        Q0.h hVarP = hVarT.r(hVarI) ? hVarT.p(hVarI) : null;
        if (hVarP == null) {
            return null;
        }
        long jO = this.f14935d.o(Q0.g.a(hVarP.i(), hVarP.l()));
        long jO2 = this.f14935d.o(Q0.g.a(hVarP.j(), hVarP.e()));
        return new RectF(Q0.f.o(jO), Q0.f.p(jO), Q0.f.o(jO2), Q0.f.p(jO2));
    }

    public final void w0(boolean z8) {
        if (z8) {
            A1(this.f14935d.getSemanticsOwner().a());
        } else {
            B1(this.f14935d.getSemanticsOwner().a());
        }
        E0();
    }

    public final p092k1.e w1(p110m1.o oVar) {
        p092k1.a aVarA;
        AutofillId autofillIdA;
        String strE;
        p092k1.c cVar = this.f14919B;
        if (cVar == null || Build.VERSION.SDK_INT < 29 || (aVarA = p092k1.d.a(this.f14935d)) == null) {
            return null;
        }
        p110m1.o oVarQ = oVar.q();
        if (oVarQ != null) {
            autofillIdA = cVar.a(oVarQ.n());
            if (autofillIdA == null) {
                return null;
            }
        } else {
            autofillIdA = aVarA.a();
        }
        p092k1.e eVarB = cVar.b(autofillIdA, oVar.n());
        if (eVarB == null) {
            return null;
        }
        p110m1.k kVarV = oVar.v();
        p110m1.r rVar = p110m1.r.f29573a;
        if (kVarV.o(rVar.s())) {
            return null;
        }
        List list = (List) p110m1.l.a(kVarV, rVar.z());
        if (list != null) {
            eVarB.a("android.widget.TextView");
            eVarB.d(C1.a.d(list, "\n", null, null, 0, null, null, 62, null));
        }
        C2739d c2739d = (C2739d) p110m1.l.a(kVarV, rVar.e());
        if (c2739d != null) {
            eVarB.a("android.widget.EditText");
            eVarB.d(c2739d);
        }
        List list2 = (List) p110m1.l.a(kVarV, rVar.c());
        if (list2 != null) {
            eVarB.b(C1.a.d(list2, "\n", null, null, 0, null, null, 62, null));
        }
        p110m1.h hVar = (p110m1.h) p110m1.l.a(kVarV, rVar.u());
        if (hVar != null && (strE = AbstractC2423x.E(hVar.n())) != null) {
            eVarB.a(strE);
        }
        E eR0 = r0(kVarV);
        if (eR0 != null) {
            p128o1.D dL = eR0.l();
            eVarB.e(v.h(dL.i().l()) * dL.b().getDensity() * dL.b().x0(), 0, 0, 0);
        }
        Q0.h hVarH = oVar.h();
        eVarB.c((int) hVarH.i(), (int) hVarH.l(), 0, 0, (int) hVarH.n(), (int) hVarH.h());
        return eVarB;
    }

    public final boolean x0(int i8) {
        return this.f14947o == i8;
    }

    public final boolean y0(p110m1.o oVar) {
        p110m1.k kVarV = oVar.v();
        p110m1.r rVar = p110m1.r.f29573a;
        return !kVarV.o(rVar.c()) && oVar.v().o(rVar.e());
    }

    public final boolean y1(p110m1.o oVar, int i8, boolean z8, boolean z9) {
        int iD0;
        int i9;
        int iN = oVar.n();
        Integer num = this.f14955w;
        if (num == null || iN != num.intValue()) {
            this.f14954v = -1;
            this.f14955w = Integer.valueOf(oVar.n());
        }
        String strO0 = o0(oVar);
        boolean z10 = false;
        if (strO0 != null && strO0.length() != 0) {
            InterfaceC2380b interfaceC2380bP0 = p0(oVar, i8);
            if (interfaceC2380bP0 == null) {
                return false;
            }
            int iC0 = c0(oVar);
            if (iC0 == -1) {
                iC0 = z8 ? 0 : strO0.length();
            }
            int[] iArrA = z8 ? interfaceC2380bP0.a(iC0) : interfaceC2380bP0.b(iC0);
            if (iArrA == null) {
                return false;
            }
            int i10 = iArrA[0];
            z10 = true;
            int i11 = iArrA[1];
            if (z9 && y0(oVar)) {
                iD0 = d0(oVar);
                if (iD0 == -1) {
                    iD0 = z8 ? i10 : i11;
                }
                i9 = z8 ? i11 : i10;
            } else {
                iD0 = z8 ? i11 : i10;
                i9 = iD0;
            }
            this.f14922E = new C0365g(oVar, z8 ? 256 : 512, i8, i10, i11, SystemClock.uptimeMillis());
            j1(oVar, iD0, i9, true);
        }
        return z10;
    }

    public final CharSequence z1(CharSequence charSequence, int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i8) {
            return charSequence;
        }
        int i9 = i8 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i9)) && Character.isLowSurrogate(charSequence.charAt(i8))) {
            i8 = i9;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i8);
        kotlin.jvm.internal.t.e(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }
}
