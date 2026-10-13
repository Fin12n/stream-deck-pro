package K3;

import C6.G;
import Q6.k;
import Q6.o;
import R0.AbstractC1602n0;
import R0.C1598l0;
import U1.W;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f4617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f4618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f4619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f4620d;

        /* JADX INFO: renamed from: K3.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0171a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f4621a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Window f4622b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f4623c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ View f4624d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f4625e;

            public C0171a(boolean z8, Window window, int i8, View view, boolean z9) {
                this.f4621a = z8;
                this.f4622b = window;
                this.f4623c = i8;
                this.f4624d = view;
                this.f4625e = z9;
            }

            @Override // p215z0.H
            public void d() {
                if (this.f4621a) {
                    this.f4622b.setStatusBarColor(this.f4623c);
                    W.a(this.f4622b, this.f4624d).c(this.f4625e);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, long j8, boolean z8, boolean z9) {
            super(1);
            this.f4617a = view;
            this.f4618b = j8;
            this.f4619c = z8;
            this.f4620d = z9;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I DisposableEffect) {
            t.g(DisposableEffect, "$this$DisposableEffect");
            Context context = this.f4617a.getContext();
            t.e(context, "null cannot be cast to non-null type android.app.Activity");
            Window window = ((Activity) context).getWindow();
            int statusBarColor = window.getStatusBarColor();
            boolean zA = W.a(window, this.f4617a).a();
            window.setStatusBarColor(AbstractC1602n0.j(this.f4618b));
            W.a(window, this.f4617a).c(this.f4619c);
            return new C0171a(this.f4620d, window, statusBarColor, this.f4617a, zA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f4626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f4627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f4628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f4629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f4630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f4631f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, boolean z8, View view, boolean z9, int i8, int i9) {
            super(2);
            this.f4626a = j8;
            this.f4627b = z8;
            this.f4628c = view;
            this.f4629d = z9;
            this.f4630e = i8;
            this.f4631f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            e.a(this.f4626a, this.f4627b, this.f4628c, this.f4629d, interfaceC3163l, F0.a(this.f4630e | 1), this.f4631f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(long j8, boolean z8, View view, boolean z9, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        long j9;
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        View view2;
        View view3;
        boolean z12;
        View view4;
        boolean z13;
        P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1309939002);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
            j9 = j8;
        } else {
            j9 = j8;
            if ((i8 & 14) == 0) {
                i10 = (interfaceC3163lP.j(j9) ? 4 : 2) | i8;
            } else {
                i10 = i8;
            }
        }
        if ((i9 & 2) == 0) {
            if ((i8 & 112) == 0) {
                z10 = z8;
                i10 |= interfaceC3163lP.c(z10) ? 32 : 16;
            }
            i11 = i9 & 4;
            if (i11 != 0) {
                i10 |= 128;
            }
            i12 = i9 & 8;
            if (i12 != 0) {
                if ((i8 & 7168) == 0) {
                    z11 = z9;
                    if (interfaceC3163lP.c(z11)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i10 |= i13;
                }
                if (i11 != 4 && (i10 & 5851) == 1170 && interfaceC3163lP.s()) {
                    interfaceC3163lP.z();
                    view4 = view;
                    z13 = z11;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                        if (i11 != 0) {
                            view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                            i10 &= -897;
                        } else {
                            view2 = view;
                        }
                        if (i12 != 0) {
                            view3 = view2;
                            z12 = true;
                        } else {
                            view3 = view2;
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1309939002, i10, -1, "com.elgato.streamdeck.ui.helper.SetStatusBarColor (SetStatusBarColor.kt:22)");
                        }
                        if (!view3.isInEditMode()) {
                            K.c(view3, Boolean.valueOf(z10), C1598l0.g(j9), new a(view3, j9, z10, z12), interfaceC3163lP, (i10 & 112) | 8 | ((i10 << 6) & 896));
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        view4 = view3;
                        z13 = z12;
                    } else {
                        interfaceC3163lP.z();
                        if (i11 != 0) {
                            i10 &= -897;
                        }
                        view3 = view;
                    }
                    z12 = z11;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1309939002, i10, -1, "com.elgato.streamdeck.ui.helper.SetStatusBarColor (SetStatusBarColor.kt:22)");
                    }
                    if (!view3.isInEditMode()) {
                        K.c(view3, Boolean.valueOf(z10), C1598l0.g(j9), new a(view3, j9, z10, z12), interfaceC3163lP, (i10 & 112) | 8 | ((i10 << 6) & 896));
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    view4 = view3;
                    z13 = z12;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new b(j8, z8, view4, z13, i8, i9));
                }
            }
            i10 |= 3072;
            z11 = z9;
            if (i11 != 4) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i11 != 0) {
                        view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                        i10 &= -897;
                    } else {
                        view2 = view;
                    }
                    if (i12 != 0) {
                        view3 = view2;
                        z12 = true;
                    } else {
                        view3 = view2;
                        z12 = z11;
                    }
                } else {
                    if (i11 != 0) {
                        view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                        i10 &= -897;
                    } else {
                        view2 = view;
                    }
                    if (i12 != 0) {
                        view3 = view2;
                        z12 = true;
                    } else {
                        view3 = view2;
                        z12 = z11;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1309939002, i10, -1, "com.elgato.streamdeck.ui.helper.SetStatusBarColor (SetStatusBarColor.kt:22)");
                }
                if (!view3.isInEditMode()) {
                    K.c(view3, Boolean.valueOf(z10), C1598l0.g(j9), new a(view3, j9, z10, z12), interfaceC3163lP, (i10 & 112) | 8 | ((i10 << 6) & 896));
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                view4 = view3;
                z13 = z12;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i11 != 0) {
                        view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                        i10 &= -897;
                    } else {
                        view2 = view;
                    }
                    if (i12 != 0) {
                        view3 = view2;
                        z12 = true;
                    } else {
                        view3 = view2;
                        z12 = z11;
                    }
                } else {
                    if (i11 != 0) {
                        view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                        i10 &= -897;
                    } else {
                        view2 = view;
                    }
                    if (i12 != 0) {
                        view3 = view2;
                        z12 = true;
                    } else {
                        view3 = view2;
                        z12 = z11;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1309939002, i10, -1, "com.elgato.streamdeck.ui.helper.SetStatusBarColor (SetStatusBarColor.kt:22)");
                }
                if (!view3.isInEditMode()) {
                    K.c(view3, Boolean.valueOf(z10), C1598l0.g(j9), new a(view3, j9, z10, z12), interfaceC3163lP, (i10 & 112) | 8 | ((i10 << 6) & 896));
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                view4 = view3;
                z13 = z12;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new b(j8, z8, view4, z13, i8, i9));
            }
        }
        i10 |= 48;
        z10 = z8;
        i11 = i9 & 4;
        if (i11 != 0) {
            i10 |= 128;
        }
        i12 = i9 & 8;
        if (i12 != 0) {
            if ((i8 & 7168) == 0) {
                z11 = z9;
                if (interfaceC3163lP.c(z11)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i10 |= i13;
            }
            if (i11 != 4) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i11 != 0) {
                        view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                        i10 &= -897;
                    } else {
                        view2 = view;
                    }
                    if (i12 != 0) {
                        view3 = view2;
                        z12 = true;
                    } else {
                        view3 = view2;
                        z12 = z11;
                    }
                } else {
                    if (i11 != 0) {
                        view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                        i10 &= -897;
                    } else {
                        view2 = view;
                    }
                    if (i12 != 0) {
                        view3 = view2;
                        z12 = true;
                    } else {
                        view3 = view2;
                        z12 = z11;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1309939002, i10, -1, "com.elgato.streamdeck.ui.helper.SetStatusBarColor (SetStatusBarColor.kt:22)");
                }
                if (!view3.isInEditMode()) {
                    K.c(view3, Boolean.valueOf(z10), C1598l0.g(j9), new a(view3, j9, z10, z12), interfaceC3163lP, (i10 & 112) | 8 | ((i10 << 6) & 896));
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                view4 = view3;
                z13 = z12;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i11 != 0) {
                        view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                        i10 &= -897;
                    } else {
                        view2 = view;
                    }
                    if (i12 != 0) {
                        view3 = view2;
                        z12 = true;
                    } else {
                        view3 = view2;
                        z12 = z11;
                    }
                } else {
                    if (i11 != 0) {
                        view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                        i10 &= -897;
                    } else {
                        view2 = view;
                    }
                    if (i12 != 0) {
                        view3 = view2;
                        z12 = true;
                    } else {
                        view3 = view2;
                        z12 = z11;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1309939002, i10, -1, "com.elgato.streamdeck.ui.helper.SetStatusBarColor (SetStatusBarColor.kt:22)");
                }
                if (!view3.isInEditMode()) {
                    K.c(view3, Boolean.valueOf(z10), C1598l0.g(j9), new a(view3, j9, z10, z12), interfaceC3163lP, (i10 & 112) | 8 | ((i10 << 6) & 896));
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                view4 = view3;
                z13 = z12;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new b(j8, z8, view4, z13, i8, i9));
            }
        }
        i10 |= 3072;
        z11 = z9;
        if (i11 != 4) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i11 != 0) {
                    view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                    i10 &= -897;
                } else {
                    view2 = view;
                }
                if (i12 != 0) {
                    view3 = view2;
                    z12 = true;
                } else {
                    view3 = view2;
                    z12 = z11;
                }
            } else {
                if (i11 != 0) {
                    view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                    i10 &= -897;
                } else {
                    view2 = view;
                }
                if (i12 != 0) {
                    view3 = view2;
                    z12 = true;
                } else {
                    view3 = view2;
                    z12 = z11;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1309939002, i10, -1, "com.elgato.streamdeck.ui.helper.SetStatusBarColor (SetStatusBarColor.kt:22)");
            }
            if (!view3.isInEditMode()) {
                K.c(view3, Boolean.valueOf(z10), C1598l0.g(j9), new a(view3, j9, z10, z12), interfaceC3163lP, (i10 & 112) | 8 | ((i10 << 6) & 896));
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            view4 = view3;
            z13 = z12;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i11 != 0) {
                    view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                    i10 &= -897;
                } else {
                    view2 = view;
                }
                if (i12 != 0) {
                    view3 = view2;
                    z12 = true;
                } else {
                    view3 = view2;
                    z12 = z11;
                }
            } else {
                if (i11 != 0) {
                    view2 = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                    i10 &= -897;
                } else {
                    view2 = view;
                }
                if (i12 != 0) {
                    view3 = view2;
                    z12 = true;
                } else {
                    view3 = view2;
                    z12 = z11;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1309939002, i10, -1, "com.elgato.streamdeck.ui.helper.SetStatusBarColor (SetStatusBarColor.kt:22)");
            }
            if (!view3.isInEditMode()) {
                K.c(view3, Boolean.valueOf(z10), C1598l0.g(j9), new a(view3, j9, z10, z12), interfaceC3163lP, (i10 & 112) | 8 | ((i10 << 6) & 896));
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            view4 = view3;
            z13 = z12;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(j8, z8, view4, z13, i8, i9));
        }
    }
}
