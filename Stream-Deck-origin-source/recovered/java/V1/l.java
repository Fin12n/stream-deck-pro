package V1;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f10459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10460b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10461c = -1;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final a f10462A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final a f10463B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final a f10464C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final a f10465D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final a f10466E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final a f10467F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final a f10468G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final a f10469H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final a f10470I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final a f10471J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final a f10472K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final a f10473L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final a f10474M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final a f10475N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final a f10476O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final a f10477P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final a f10478Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final a f10479R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final a f10480S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final a f10481T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final a f10482U;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f10483d = new a(1, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f10484e = new a(2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f10485f = new a(4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f10486g = new a(8, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f10487h = new a(16, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f10488i = new a(32, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f10489j = new a(64, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f10490k = new a(128, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f10491l = new a(256, (CharSequence) null, o.b.class);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f10492m = new a(512, (CharSequence) null, o.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f10493n = new a(1024, (CharSequence) null, o.c.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f10494o = new a(2048, (CharSequence) null, o.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f10495p = new a(4096, null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f10496q = new a(8192, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f10497r = new a(16384, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f10498s = new a(32768, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f10499t = new a(65536, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f10500u = new a(131072, (CharSequence) null, o.g.class);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f10501v = new a(262144, null);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f10502w = new a(524288, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f10503x = new a(1048576, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f10504y = new a(2097152, (CharSequence) null, o.h.class);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f10505z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f10506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class f10508c;

        static {
            int i8 = Build.VERSION.SDK_INT;
            f10505z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f10462A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, o.e.class);
            f10463B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f10464C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f10465D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f10466E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f10467F = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f10468G = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f10469H = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f10470I = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f10471J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f10472K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, o.f.class);
            f10473L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, o.d.class);
            f10474M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
            f10475N = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
            f10476O = new a(i8 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f10477P = new a(i8 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f10478Q = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f10479R = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f10480S = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f10481T = new a(i8 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f10482U = new a(i8 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i8, CharSequence charSequence) {
            this(null, i8, charSequence, null, null);
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f10506a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f10506a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f10506a;
            if (obj2 == null) {
                return aVar.f10506a == null;
            }
            return obj2.equals(aVar.f10506a);
        }

        public int hashCode() {
            Object obj = this.f10506a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strH = l.h(this.f10507b);
            if (strH.equals("ACTION_UNKNOWN") && b() != null) {
                strH = b().toString();
            }
            sb.append(strH);
            return sb.toString();
        }

        public a(int i8, CharSequence charSequence, o oVar) {
            this(null, i8, charSequence, oVar, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i8, CharSequence charSequence, Class cls) {
            this(null, i8, charSequence, null, cls);
        }

        public a(Object obj, int i8, CharSequence charSequence, o oVar, Class cls) {
            this.f10507b = i8;
            if (obj == null) {
                this.f10506a = new AccessibilityNodeInfo.AccessibilityAction(i8, charSequence);
            } else {
                this.f10506a = obj;
            }
            this.f10508c = cls;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static Object a(int i8, float f8, float f9, float f10) {
            return new AccessibilityNodeInfo.RangeInfo(i8, f8, f9, f10);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public static f a(boolean z8, int i8, int i9, int i10, int i11, boolean z9, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z8).setColumnIndex(i8).setRowIndex(i9).setColumnSpan(i10).setRowSpan(i11).setSelected(z9).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static l b(AccessibilityNodeInfo accessibilityNodeInfo, int i8, int i9) {
            return l.I0(accessibilityNodeInfo.getChild(i8, i9));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static l f(AccessibilityNodeInfo accessibilityNodeInfo, int i8) {
            return l.I0(accessibilityNodeInfo.getParent(i8));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
            accessibilityNodeInfo.setTextSelectable(z8);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z8);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j8) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j8));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z8) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z8);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f10509a;

        public e(Object obj) {
            this.f10509a = obj;
        }

        public static e a(int i8, int i9, boolean z8, int i10) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i8, i9, z8, i10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f10510a;

        public f(Object obj) {
            this.f10510a = obj;
        }

        public static f a(int i8, int i9, int i10, int i11, boolean z8, boolean z9) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i8, i9, i10, i11, z8, z9));
        }
    }

    @Deprecated
    public l(Object obj) {
        this.f10459a = (AccessibilityNodeInfo) obj;
    }

    public static l H0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new l(accessibilityNodeInfo);
    }

    public static l I0(Object obj) {
        if (obj != null) {
            return new l(obj);
        }
        return null;
    }

    public static l R() {
        return H0(AccessibilityNodeInfo.obtain());
    }

    public static String h(int i8) {
        if (i8 == 1) {
            return "ACTION_FOCUS";
        }
        if (i8 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i8) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return HRHLwtyqJWz.bTljfhh;
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i8) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i8) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return RaiWHuj.MciWfpTtEfzfOG;
                            default:
                                switch (i8) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] n(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public final boolean A() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void A0(View view) {
        this.f10459a.setTraversalAfter(view);
    }

    public boolean B() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.f10459a) : i(64);
    }

    public void B0(View view, int i8) {
        this.f10459a.setTraversalAfter(view, i8);
    }

    public boolean C() {
        return this.f10459a.isCheckable();
    }

    public void C0(View view) {
        this.f10459a.setTraversalBefore(view);
    }

    public boolean D() {
        return this.f10459a.isChecked();
    }

    public void D0(View view, int i8) {
        this.f10459a.setTraversalBefore(view, i8);
    }

    public boolean E() {
        return this.f10459a.isClickable();
    }

    public void E0(String str) {
        this.f10459a.setViewIdResourceName(str);
    }

    public boolean F() {
        return this.f10459a.isContextClickable();
    }

    public void F0(boolean z8) {
        this.f10459a.setVisibleToUser(z8);
    }

    public boolean G() {
        return this.f10459a.isEnabled();
    }

    public AccessibilityNodeInfo G0() {
        return this.f10459a;
    }

    public boolean H() {
        return this.f10459a.isFocusable();
    }

    public boolean I() {
        return this.f10459a.isFocused();
    }

    public boolean J() {
        return i(67108864);
    }

    public boolean K() {
        return this.f10459a.isImportantForAccessibility();
    }

    public boolean L() {
        return this.f10459a.isLongClickable();
    }

    public boolean M() {
        return this.f10459a.isPassword();
    }

    public boolean N() {
        return this.f10459a.isScrollable();
    }

    public boolean O() {
        return this.f10459a.isSelected();
    }

    public boolean P() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.f10459a) : i(8388608);
    }

    public boolean Q() {
        return this.f10459a.isVisibleToUser();
    }

    public boolean S(int i8, Bundle bundle) {
        return this.f10459a.performAction(i8, bundle);
    }

    public void T(boolean z8) {
        this.f10459a.setAccessibilityFocused(z8);
    }

    public void U(Rect rect) {
        this.f10459a.setBoundsInScreen(rect);
    }

    public void V(boolean z8) {
        this.f10459a.setCheckable(z8);
    }

    public void W(boolean z8) {
        this.f10459a.setChecked(z8);
    }

    public void X(CharSequence charSequence) {
        this.f10459a.setClassName(charSequence);
    }

    public void Y(boolean z8) {
        this.f10459a.setClickable(z8);
    }

    public void Z(Object obj) {
        this.f10459a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f10509a);
    }

    public void a(int i8) {
        this.f10459a.addAction(i8);
    }

    public void a0(Object obj) {
        this.f10459a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f10510a);
    }

    public void b(a aVar) {
        this.f10459a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f10506a);
    }

    public void b0(CharSequence charSequence) {
        this.f10459a.setContentDescription(charSequence);
    }

    public void c(View view) {
        this.f10459a.addChild(view);
    }

    public void c0(boolean z8) {
        this.f10459a.setContentInvalid(z8);
    }

    public void d(View view, int i8) {
        this.f10459a.addChild(view, i8);
    }

    public void d0(boolean z8) {
        this.f10459a.setEditable(z8);
    }

    public void e(CharSequence charSequence, View view) {
    }

    public void e0(boolean z8) {
        this.f10459a.setEnabled(z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10459a;
        if (accessibilityNodeInfo == null) {
            if (lVar.f10459a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(lVar.f10459a)) {
            return false;
        }
        return this.f10461c == lVar.f10461c && this.f10460b == lVar.f10460b;
    }

    public final List f(String str) {
        ArrayList<Integer> integerArrayList = this.f10459a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f10459a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void f0(CharSequence charSequence) {
        this.f10459a.setError(charSequence);
    }

    public List g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f10459a.getActionList();
        if (actionList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new a(actionList.get(i8)));
        }
        return arrayList;
    }

    public void g0(boolean z8) {
        this.f10459a.setFocusable(z8);
    }

    public void h0(boolean z8) {
        this.f10459a.setFocused(z8);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10459a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final boolean i(int i8) {
        Bundle bundleR = r();
        return bundleR != null && (bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i8) == i8;
    }

    public void i0(boolean z8) {
        this.f10459a.setHeading(z8);
    }

    public void j(Rect rect) {
        this.f10459a.getBoundsInParent(rect);
    }

    public void j0(boolean z8) {
        this.f10459a.setImportantForAccessibility(z8);
    }

    public void k(Rect rect) {
        this.f10459a.getBoundsInScreen(rect);
    }

    public void k0(boolean z8) {
        this.f10459a.setLongClickable(z8);
    }

    public void l(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f10459a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f10459a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void l0(int i8) {
        this.f10459a.setMovementGranularities(i8);
    }

    public CharSequence m() {
        return this.f10459a.getClassName();
    }

    public void m0(CharSequence charSequence) {
        this.f10459a.setPackageName(charSequence);
    }

    public void n0(CharSequence charSequence) {
        this.f10459a.setPaneTitle(charSequence);
    }

    public CharSequence o() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f10459a) : this.f10459a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void o0(View view) {
        this.f10460b = -1;
        this.f10459a.setParent(view);
    }

    public CharSequence p() {
        return this.f10459a.getContentDescription();
    }

    public void p0(View view, int i8) {
        this.f10460b = i8;
        this.f10459a.setParent(view, i8);
    }

    public CharSequence q() {
        return this.f10459a.getError();
    }

    public void q0(boolean z8) {
        this.f10459a.setPassword(z8);
    }

    public Bundle r() {
        return this.f10459a.getExtras();
    }

    public void r0(g gVar) {
        this.f10459a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f10511a);
    }

    public int s() {
        return this.f10459a.getMaxTextLength();
    }

    public void s0(CharSequence charSequence) {
        this.f10459a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public int t() {
        return this.f10459a.getMovementGranularities();
    }

    public void t0(boolean z8) {
        this.f10459a.setScreenReaderFocusable(z8);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb.append("; boundsInParent: " + rect);
        k(rect);
        sb.append("; boundsInScreen: " + rect);
        l(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(u());
        sb.append("; className: ");
        sb.append(m());
        sb.append("; text: ");
        sb.append(w());
        sb.append("; error: ");
        sb.append(q());
        sb.append("; maxTextLength: ");
        sb.append(s());
        sb.append("; stateDescription: ");
        sb.append(v());
        sb.append("; contentDescription: ");
        sb.append(p());
        sb.append("; tooltipText: ");
        sb.append(x());
        sb.append("; viewIdResName: ");
        sb.append(z());
        sb.append("; uniqueId: ");
        sb.append(y());
        sb.append("; checkable: ");
        sb.append(C());
        sb.append("; checked: ");
        sb.append(D());
        sb.append("; focusable: ");
        sb.append(H());
        sb.append("; focused: ");
        sb.append(I());
        sb.append("; selected: ");
        sb.append(O());
        sb.append("; clickable: ");
        sb.append(E());
        sb.append("; longClickable: ");
        sb.append(L());
        sb.append("; contextClickable: ");
        sb.append(F());
        sb.append("; enabled: ");
        sb.append(G());
        sb.append("; password: ");
        sb.append(M());
        sb.append("; scrollable: " + N());
        sb.append("; containerTitle: ");
        sb.append(o());
        sb.append("; granularScrollingSupported: ");
        sb.append(J());
        sb.append("; importantForAccessibility: ");
        sb.append(K());
        sb.append("; visible: ");
        sb.append(Q());
        sb.append("; isTextSelectable: ");
        sb.append(P());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(B());
        sb.append("; [");
        List listG = g();
        for (int i8 = 0; i8 < listG.size(); i8++) {
            a aVar = (a) listG.get(i8);
            String strH = h(aVar.a());
            if (strH.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                strH = aVar.b().toString();
            }
            sb.append(strH);
            if (i8 != listG.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        return this.f10459a.getPackageName();
    }

    public void u0(boolean z8) {
        this.f10459a.setScrollable(z8);
    }

    public CharSequence v() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.f10459a) : this.f10459a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void v0(boolean z8) {
        this.f10459a.setSelected(z8);
    }

    public CharSequence w() {
        if (!A()) {
            return this.f10459a.getText();
        }
        List listF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f10459a.getText(), 0, this.f10459a.getText().length()));
        for (int i8 = 0; i8 < listF.size(); i8++) {
            spannableString.setSpan(new V1.a(((Integer) listF4.get(i8)).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listF.get(i8)).intValue(), ((Integer) listF2.get(i8)).intValue(), ((Integer) listF3.get(i8)).intValue());
        }
        return spannableString;
    }

    public void w0(View view, int i8) {
        this.f10461c = i8;
        this.f10459a.setSource(view, i8);
    }

    public CharSequence x() {
        return this.f10459a.getTooltipText();
    }

    public void x0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.f10459a, charSequence);
        } else {
            this.f10459a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public String y() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.f10459a) : this.f10459a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void y0(CharSequence charSequence) {
        this.f10459a.setText(charSequence);
    }

    public String z() {
        return this.f10459a.getViewIdResourceName();
    }

    public void z0(int i8, int i9) {
        this.f10459a.setTextSelection(i8, i9);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f10511a;

        public g(Object obj) {
            this.f10511a = obj;
        }

        public static g a(int i8, float f8, float f9, float f10) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i8, f8, f9, f10));
        }

        public g(int i8, float f8, float f9, float f10) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f10511a = b.a(i8, f8, f9, f10);
            } else {
                this.f10511a = AccessibilityNodeInfo.RangeInfo.obtain(i8, f8, f9, f10);
            }
        }
    }

    public l(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f10459a = accessibilityNodeInfo;
    }
}
