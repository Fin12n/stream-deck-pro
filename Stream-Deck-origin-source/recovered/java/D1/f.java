package D1;

import C6.G;
import I0.g;
import Q6.k;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p056g1.h0;
import p065h1.AbstractC2378a;
import p065h1.V0;
import p215z0.AbstractC3173q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends D1.c implements V0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final View f1808A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p002a1.b f1809B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final g f1810C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f1811D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final String f1812E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public g.a f1813F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public k f1814G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public k f1815H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public k f1816I;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            f.this.f1808A.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m46invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m46invoke() {
            f.this.getReleaseBlock().invoke(f.this.f1808A);
            f.this.y();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m47invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m47invoke() {
            f.this.getResetBlock().invoke(f.this.f1808A);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m48invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m48invoke() {
            f.this.getUpdateBlock().invoke(f.this.f1808A);
        }
    }

    public /* synthetic */ f(Context context, AbstractC3173q abstractC3173q, View view, p002a1.b bVar, g gVar, int i8, h0 h0Var, int i9, AbstractC2633k abstractC2633k) {
        this(context, (i9 & 2) != 0 ? null : abstractC3173q, view, (i9 & 8) != 0 ? new p002a1.b() : bVar, gVar, i8, h0Var);
    }

    private final void setSavableRegistryEntry(g.a aVar) {
        g.a aVar2 = this.f1813F;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f1813F = aVar;
    }

    public final p002a1.b getDispatcher() {
        return this.f1809B;
    }

    public final k getReleaseBlock() {
        return this.f1816I;
    }

    public final k getResetBlock() {
        return this.f1815H;
    }

    @Override // p065h1.V0
    public /* bridge */ /* synthetic */ AbstractC2378a getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final k getUpdateBlock() {
        return this.f1814G;
    }

    public final void setReleaseBlock(k kVar) {
        this.f1816I = kVar;
        setRelease(new b());
    }

    public final void setResetBlock(k kVar) {
        this.f1815H = kVar;
        setReset(new c());
    }

    public final void setUpdateBlock(k kVar) {
        this.f1814G = kVar;
        setUpdate(new d());
    }

    public final void x() {
        g gVar = this.f1810C;
        if (gVar != null) {
            setSavableRegistryEntry(gVar.d(this.f1812E, new a()));
        }
    }

    public final void y() {
        setSavableRegistryEntry(null);
    }

    public f(Context context, AbstractC3173q abstractC3173q, View view, p002a1.b bVar, g gVar, int i8, h0 h0Var) {
        super(context, abstractC3173q, i8, bVar, view, h0Var);
        this.f1808A = view;
        this.f1809B = bVar;
        this.f1810C = gVar;
        this.f1811D = i8;
        setClipChildren(false);
        String strValueOf = String.valueOf(i8);
        this.f1812E = strValueOf;
        Object objC = gVar != null ? gVar.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        x();
        this.f1814G = e.e();
        this.f1815H = e.e();
        this.f1816I = e.e();
    }

    public /* synthetic */ f(Context context, k kVar, AbstractC3173q abstractC3173q, g gVar, int i8, h0 h0Var, int i9, AbstractC2633k abstractC2633k) {
        this(context, kVar, (i9 & 4) != 0 ? null : abstractC3173q, gVar, i8, h0Var);
    }

    @Override // p065h1.V0
    public View getViewRoot() {
        return this;
    }

    public f(Context context, k kVar, AbstractC3173q abstractC3173q, g gVar, int i8, h0 h0Var) {
        this(context, abstractC3173q, (View) kVar.invoke(context), null, gVar, i8, h0Var, 8, null);
    }
}
