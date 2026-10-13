package A;

import D6.C0934n;
import D6.C0938s;
import H.g1;
import V.ocy.SVzBK;
import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC2633k;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V0 f18a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range f20c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f21d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f22e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f23f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f24g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public T1.a f26i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Executor f27j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28a;

        static {
            int[] iArr = new int[E.b.values().length];
            try {
                iArr[E.b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[E.b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[E.b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[E.b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D0(List<? extends T0> useCases) {
        this(useCases, null, null, null, null, null, 62, null);
        kotlin.jvm.internal.t.g(useCases, "useCases");
    }

    public static final void b(Set set) {
    }

    public final List c() {
        return this.f19b;
    }

    public final T1.a d() {
        return this.f26i;
    }

    public final Executor e() {
        return this.f27j;
    }

    public final Range f() {
        return this.f20c;
    }

    public final List g() {
        return this.f22e;
    }

    public final Set h() {
        return this.f21d;
    }

    public int i() {
        return this.f25h;
    }

    public final String j(T0 t8) {
        if (t8 instanceof C0903w0) {
            return "Preview";
        }
        if (t8 instanceof C0864c0) {
            return "ImageCapture";
        }
        if (t8 instanceof S) {
            return "ImageAnalysis";
        }
        return L.f.d0(t8) ? "VideoCapture" : "UseCase";
    }

    public final List k() {
        return this.f23f;
    }

    public final V0 l() {
        return this.f18a;
    }

    public boolean m() {
        return this.f24g;
    }

    public final void o() {
        if (this.f21d.isEmpty() && this.f22e.isEmpty()) {
            return;
        }
        q();
        if (D6.z.c0(this.f22e).size() != this.f22e.size()) {
            throw new IllegalArgumentException(("Duplicate values in preferredFeatures(" + this.f22e + ')').toString());
        }
        Set setN0 = D6.z.n0(this.f21d, this.f22e);
        if (!setN0.isEmpty()) {
            throw new IllegalArgumentException(("requiredFeatures and preferredFeatures have duplicate values: " + setN0).toString());
        }
        for (T0 t8 : this.f23f) {
            if (D.c.f1671c.b(t8) == D.c.UNDEFINED) {
                throw new IllegalArgumentException((t8 + " is not supported with feature group").toString());
            }
            n(t8);
        }
        if (!this.f19b.isEmpty()) {
            throw new IllegalArgumentException("Effects aren't supported with feature group yet");
        }
    }

    public final void p() {
        if (kotlin.jvm.internal.t.c(this.f20c, g1.f3033a)) {
            return;
        }
        Iterator it = this.f23f.iterator();
        while (it.hasNext()) {
            if (((T0) it.next()).e().c0()) {
                throw new IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
            }
        }
    }

    public final void q() {
        Set set = this.f21d;
        ArrayList arrayList = new ArrayList(C0938s.y(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((C.b) it.next()).c());
        }
        for (E.b bVar : D6.z.c0(arrayList)) {
            Set set2 = this.f21d;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set2) {
                if (((C.b) obj).c() == bVar) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() > 1) {
                throw new IllegalArgumentException(("requiredFeatures has conflicting feature values: " + arrayList2).toString());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D0(List<? extends T0> useCases, V0 v8) {
        this(useCases, v8, null, null, null, null, 60, null);
        kotlin.jvm.internal.t.g(useCases, "useCases");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D0(List<? extends T0> list, V0 v8, List<? extends AbstractC0885n> effects) {
        this(list, v8, effects, null, null, null, 56, null);
        kotlin.jvm.internal.t.g(list, SVzBK.HymV);
        kotlin.jvm.internal.t.g(effects, "effects");
    }

    public final void n(T0 t8) {
        String str;
        String str2;
        String str3;
        String strJ = j(t8);
        E.b bVarA = D.c.f1671c.a(t8);
        if (bVarA == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("A ");
        kotlin.jvm.internal.t.d(bVarA);
        sb.append(bVarA.name());
        sb.append(" value is set to ");
        sb.append(strJ);
        sb.append(" despite using feature groups. Do not use APIs like ");
        sb.append(strJ);
        sb.append(".Builder.");
        int[] iArr = a.f28a;
        int i8 = iArr[bVarA.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 == 4) {
                        str = "setOutputFormat";
                    } else {
                        throw new C6.m();
                    }
                } else {
                    str = L.f.d0(t8) ? hJroAgFztiMK.FTkLaCUBlTf : "setPreviewStabilizationEnabled";
                }
            } else {
                str = "setTargetFrameRateRange";
            }
        } else {
            str = "setDynamicRange";
        }
        sb.append(str);
        sb.append(" while using feature groups. If ");
        int i9 = iArr[bVarA.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        str2 = "JPEG_R output format";
                    } else {
                        throw new C6.m();
                    }
                } else {
                    str2 = "stabilization";
                }
            } else {
                str2 = "60 FPS";
            }
        } else {
            str2 = "HDR";
        }
        sb.append(str2);
        sb.append(" is required, instead set ");
        int i10 = iArr[bVarA.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new C6.m();
                    }
                    str3 = "GroupableFeature.IMAGE_ULTRA_HDR";
                } else {
                    str3 = "GroupableFeature.PREVIEW_STABILIZATION";
                }
            } else {
                str3 = "GroupableFeature.FPS_60";
            }
        } else {
            str3 = "GroupableFeature.HDR_HLG10";
        }
        sb.append(str3);
        sb.append(" as either a required or preferred feature.");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D0(List<? extends T0> useCases, V0 v8, List<? extends AbstractC0885n> effects, Range<Integer> frameRateRange) {
        this(useCases, v8, effects, frameRateRange, null, null, 48, null);
        kotlin.jvm.internal.t.g(useCases, "useCases");
        kotlin.jvm.internal.t.g(effects, "effects");
        kotlin.jvm.internal.t.g(frameRateRange, "frameRateRange");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D0(List<? extends T0> useCases, V0 v8, List<? extends AbstractC0885n> effects, Range<Integer> frameRateRange, Set<? extends C.b> requiredFeatureGroup) {
        this(useCases, v8, effects, frameRateRange, requiredFeatureGroup, null, 32, null);
        kotlin.jvm.internal.t.g(useCases, "useCases");
        kotlin.jvm.internal.t.g(effects, "effects");
        kotlin.jvm.internal.t.g(frameRateRange, "frameRateRange");
        kotlin.jvm.internal.t.g(requiredFeatureGroup, "requiredFeatureGroup");
    }

    public D0(List<? extends T0> useCases, V0 v8, List<? extends AbstractC0885n> effects, Range<Integer> frameRateRange, Set<? extends C.b> requiredFeatureGroup, List<? extends C.b> preferredFeatureGroup) {
        kotlin.jvm.internal.t.g(useCases, "useCases");
        kotlin.jvm.internal.t.g(effects, "effects");
        kotlin.jvm.internal.t.g(frameRateRange, "frameRateRange");
        kotlin.jvm.internal.t.g(requiredFeatureGroup, "requiredFeatureGroup");
        kotlin.jvm.internal.t.g(preferredFeatureGroup, "preferredFeatureGroup");
        this.f18a = v8;
        this.f19b = effects;
        this.f20c = frameRateRange;
        this.f21d = requiredFeatureGroup;
        this.f22e = preferredFeatureGroup;
        this.f23f = D6.z.c0(useCases);
        this.f26i = new T1.a() { // from class: A.C0
            @Override // T1.a
            public final void accept(Object obj) {
                D0.b((Set) obj);
            }
        };
        ScheduledExecutorService scheduledExecutorServiceD = J.a.d();
        kotlin.jvm.internal.t.f(scheduledExecutorServiceD, "mainThreadExecutor(...)");
        this.f27j = scheduledExecutorServiceD;
        p();
        o();
    }

    public /* synthetic */ D0(List list, V0 v8, List list2, Range range, Set set, List list3, int i8, AbstractC2633k abstractC2633k) {
        this(list, (i8 & 2) != 0 ? null : v8, (i8 & 4) != 0 ? D6.r.n() : list2, (i8 & 8) != 0 ? g1.f3033a : range, (i8 & 16) != 0 ? D6.T.d() : set, (i8 & 32) != 0 ? D6.r.n() : list3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D0(T0... useCases) {
        this(C0934n.r0(useCases), null, null, null, null, null, 62, null);
        kotlin.jvm.internal.t.g(useCases, "useCases");
    }
}
