package p040e3;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p004a3.C1705k;
import p017b7.J;
import p121n3.j;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: e3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0474a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f20546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f20547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f20548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C1705k f20549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f20550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f20551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f20552h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ j f20553i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ i f20554j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f20555k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f20556l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0474a(boolean z8, boolean z9, b bVar, C1705k c1705k, int i8, boolean z10, float f8, j jVar, i iVar, boolean z11, InterfaceC3164l0 interfaceC3164l0, d dVar) {
            super(2, dVar);
            this.f20546b = z8;
            this.f20547c = z9;
            this.f20548d = bVar;
            this.f20549e = c1705k;
            this.f20550f = i8;
            this.f20551g = z10;
            this.f20552h = f8;
            this.f20553i = jVar;
            this.f20554j = iVar;
            this.f20555k = z11;
            this.f20556l = interfaceC3164l0;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new C0474a(this.f20546b, this.f20547c, this.f20548d, this.f20549e, this.f20550f, this.f20551g, this.f20552h, this.f20553i, this.f20554j, this.f20555k, this.f20556l, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((C0474a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        
            if (e3.b.a.a(r0, r2, 0, r3, r4, r5, r6, r7, false, r9, false, r11, r16, 514, null) == r15) goto L25;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f20545a;
            if (i8 != 0) {
                if (i8 == 1) {
                    r.b(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
            r.b(obj);
            if (this.f20546b && !a.d(this.f20556l) && this.f20547c) {
                b bVar = this.f20548d;
                this.f20545a = 1;
                if (d.e(bVar, this) != objF) {
                }
            }
            return objF;
            a.e(this.f20556l, this.f20546b);
            if (!this.f20546b) {
                return G.f1419a;
            }
            b bVar2 = this.f20548d;
            C1705k c1705k = this.f20549e;
            int i9 = this.f20550f;
            boolean z8 = this.f20551g;
            float f8 = this.f20552h;
            j jVar = this.f20553i;
            float fL = bVar2.l();
            i iVar = this.f20554j;
            boolean z9 = this.f20555k;
            this.f20545a = 2;
        }
    }

    public static final h c(C1705k c1705k, boolean z8, boolean z9, boolean z10, j jVar, float f8, int i8, i iVar, boolean z11, boolean z12, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        interfaceC3163l.f(683659508);
        boolean z13 = (i10 & 2) != 0 ? true : z8;
        boolean z14 = (i10 & 4) != 0 ? true : z9;
        boolean z15 = (i10 & 8) != 0 ? false : z10;
        j jVar2 = (i10 & 16) != 0 ? null : jVar;
        float f9 = (i10 & 32) != 0 ? 1.0f : f8;
        int i11 = (i10 & 64) != 0 ? 1 : i8;
        i iVar2 = (i10 & 128) != 0 ? i.Immediately : iVar;
        boolean z16 = (i10 & 256) != 0 ? false : z11;
        boolean z17 = (i10 & 512) != 0 ? false : z12;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(683659508, i9, -1, "com.airbnb.lottie.compose.animateLottieCompositionAsState (animateLottieCompositionAsState.kt:54)");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException(("Iterations must be a positive number (" + i11 + ").").toString());
        }
        if (Float.isInfinite(f9) || Float.isNaN(f9)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f9 + ".").toString());
        }
        b bVarD = d.d(interfaceC3163l, 0);
        interfaceC3163l.f(-180606964);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = l1.e(Boolean.valueOf(z13), null, 2, null);
            interfaceC3163l.H(objG);
        }
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        interfaceC3163l.N();
        interfaceC3163l.f(-180606834);
        if (!z16) {
            f9 /= j.f((Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g()));
        }
        float f10 = f9;
        interfaceC3163l.N();
        K.f(new Object[]{c1705k, Boolean.valueOf(z13), jVar2, Float.valueOf(f10), Integer.valueOf(i11)}, new C0474a(z13, z14, bVarD, c1705k, i11, z15, f10, jVar2, iVar2, z17, interfaceC3164l0, null), interfaceC3163l, 72);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return bVarD;
    }

    public static final boolean d(InterfaceC3164l0 interfaceC3164l0) {
        return ((Boolean) interfaceC3164l0.getValue()).booleanValue();
    }

    public static final void e(InterfaceC3164l0 interfaceC3164l0, boolean z8) {
        interfaceC3164l0.setValue(Boolean.valueOf(z8));
    }
}
