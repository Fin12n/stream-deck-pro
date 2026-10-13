package J3;

import C6.G;
import R0.InterfaceC1621x0;
import R0.J;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2235f;
import p046f0.D;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L0.i f4255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3.b f4256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2235f f4258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f4259e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f4260f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L0.i iVar, C3.b bVar, Q6.k kVar, InterfaceC2235f interfaceC2235f, int i8, int i9) {
            super(2);
            this.f4255a = iVar;
            this.f4256b = bVar;
            this.f4257c = kVar;
            this.f4258d = interfaceC2235f;
            this.f4259e = i8;
            this.f4260f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            k.a(this.f4255a, this.f4256b, this.f4257c, this.f4258d, interfaceC3163l, F0.a(this.f4259e | 1), this.f4260f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4261a;

        static {
            int[] iArr = new int[C3.b.a.values().length];
            try {
                iArr[C3.b.a.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3.b.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3.b.a.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4261a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:75:0x0109  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    /* JADX WARN: Code duplicated, block: B:81:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void a(L0.i iVar, C3.b faceplate, Q6.k imageResource, InterfaceC2235f interfaceC2235f, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        L0.i iVar2;
        int i10;
        InterfaceC2235f interfaceC2235f2;
        L0.i iVar3;
        InterfaceC2235f interfaceC2235fA;
        L0.i iVar4;
        InterfaceC3163l interfaceC3163l2;
        L0.i iVar5;
        InterfaceC2235f interfaceC2235f3;
        boolean z8;
        Object objG;
        C3.b.e eVar;
        InterfaceC1621x0 interfaceC1621x0;
        InterfaceC3163l interfaceC3163l3;
        P0 p0V;
        t.g(faceplate, "faceplate");
        t.g(imageResource, "imageResource");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(234874810);
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = i8 | 6;
            iVar2 = iVar;
        } else if ((i8 & 14) == 0) {
            iVar2 = iVar;
            i10 = (interfaceC3163lP.R(iVar2) ? 4 : 2) | i8;
        } else {
            iVar2 = iVar;
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.R(faceplate) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            i10 |= interfaceC3163lP.l(imageResource) ? 256 : 128;
        }
        int i12 = i9 & 8;
        if (i12 == 0) {
            if ((i8 & 7168) == 0) {
                interfaceC2235f2 = interfaceC2235f;
                i10 |= interfaceC3163lP.R(interfaceC2235f2) ? 2048 : 1024;
            }
            if ((i10 & 5851) == 1170 || !interfaceC3163lP.s()) {
                if (i11 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    interfaceC2235fA = InterfaceC2235f.f20468a.a();
                } else {
                    interfaceC2235fA = interfaceC2235f2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(234874810, i10, -1, "com.elgato.streamdeck.ui.components.FaceplateImage (FaceplateImage.kt:23)");
                }
                if (faceplate instanceof C3.b.e) {
                    interfaceC3163lP.f(-1524767575);
                    interfaceC3163lP.f(-1524767566);
                    z8 = (i10 & 112) == 32;
                    objG = interfaceC3163lP.g();
                    if (z8 || objG == InterfaceC3163l.f38803a.a()) {
                        eVar = (C3.b.e) faceplate;
                        if (eVar.f().exists()) {
                            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(eVar.f().getAbsolutePath());
                            t.f(bitmapDecodeFile, "decodeFile(...)");
                            objG = J.c(bitmapDecodeFile);
                        } else {
                            objG = null;
                        }
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC1621x0 = (InterfaceC1621x0) objG;
                    interfaceC3163lP.N();
                    if (interfaceC1621x0 != null) {
                        interfaceC3163lP.f(-1524767325);
                        iVar4 = iVar3;
                        D.c(interfaceC1621x0, null, iVar4, b(faceplate), interfaceC2235fA, 0.0f, null, 0, interfaceC3163lP, ((i10 << 6) & 896) | 56 | (57344 & (i10 << 3)), 224);
                        interfaceC3163l3 = interfaceC3163lP;
                        interfaceC3163l3.N();
                    } else {
                        L0.i iVar6 = iVar3;
                        interfaceC3163lP.f(-1524767069);
                        p191w0.P0.b("No image", iVar6, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163lP, ((i10 << 3) & 112) | 6, 0, 131068);
                        iVar4 = iVar6;
                        interfaceC3163l3 = interfaceC3163lP;
                        interfaceC3163l3.N();
                    }
                    interfaceC3163l3.N();
                    interfaceC2235fA = interfaceC2235fA;
                    interfaceC3163l2 = interfaceC3163l3;
                } else {
                    iVar4 = iVar3;
                    interfaceC3163lP.f(-1524766993);
                    D.a(p101l1.c.d(((Number) imageResource.invoke(faceplate)).intValue(), interfaceC3163lP, 0), null, iVar4, b(faceplate), interfaceC2235fA, 0.0f, null, interfaceC3163lP, ((i10 << 6) & 896) | 56 | (57344 & (i10 << 3)), 96);
                    interfaceC3163l2 = interfaceC3163lP;
                    interfaceC3163l2.N();
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar5 = iVar4;
                interfaceC2235f3 = interfaceC2235fA;
            } else {
                interfaceC3163lP.z();
                iVar5 = iVar2;
                interfaceC2235f3 = interfaceC2235f2;
                interfaceC3163l2 = interfaceC3163lP;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new a(iVar5, faceplate, imageResource, interfaceC2235f3, i8, i9));
            }
        }
        i10 |= 3072;
        interfaceC2235f2 = interfaceC2235f;
        if ((i10 & 5851) == 1170) {
            if (i11 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i12 != 0) {
                interfaceC2235fA = InterfaceC2235f.f20468a.a();
            } else {
                interfaceC2235fA = interfaceC2235f2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(234874810, i10, -1, "com.elgato.streamdeck.ui.components.FaceplateImage (FaceplateImage.kt:23)");
            }
            if (faceplate instanceof C3.b.e) {
                interfaceC3163lP.f(-1524767575);
                interfaceC3163lP.f(-1524767566);
                if ((i10 & 112) == 32) {
                }
                objG = interfaceC3163lP.g();
                if (z8) {
                    eVar = (C3.b.e) faceplate;
                    if (eVar.f().exists()) {
                        Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(eVar.f().getAbsolutePath());
                        t.f(bitmapDecodeFile2, "decodeFile(...)");
                        objG = J.c(bitmapDecodeFile2);
                    } else {
                        objG = null;
                    }
                    interfaceC3163lP.H(objG);
                } else {
                    eVar = (C3.b.e) faceplate;
                    if (eVar.f().exists()) {
                        Bitmap bitmapDecodeFile3 = BitmapFactory.decodeFile(eVar.f().getAbsolutePath());
                        t.f(bitmapDecodeFile3, "decodeFile(...)");
                        objG = J.c(bitmapDecodeFile3);
                    } else {
                        objG = null;
                    }
                    interfaceC3163lP.H(objG);
                }
                interfaceC1621x0 = (InterfaceC1621x0) objG;
                interfaceC3163lP.N();
                if (interfaceC1621x0 != null) {
                    interfaceC3163lP.f(-1524767325);
                    iVar4 = iVar3;
                    D.c(interfaceC1621x0, null, iVar4, b(faceplate), interfaceC2235fA, 0.0f, null, 0, interfaceC3163lP, ((i10 << 6) & 896) | 56 | (57344 & (i10 << 3)), 224);
                    interfaceC3163l3 = interfaceC3163lP;
                    interfaceC3163l3.N();
                } else {
                    L0.i iVar7 = iVar3;
                    interfaceC3163lP.f(-1524767069);
                    p191w0.P0.b("No image", iVar7, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163lP, ((i10 << 3) & 112) | 6, 0, 131068);
                    iVar4 = iVar7;
                    interfaceC3163l3 = interfaceC3163lP;
                    interfaceC3163l3.N();
                }
                interfaceC3163l3.N();
                interfaceC2235fA = interfaceC2235fA;
                interfaceC3163l2 = interfaceC3163l3;
            } else {
                iVar4 = iVar3;
                interfaceC3163lP.f(-1524766993);
                D.a(p101l1.c.d(((Number) imageResource.invoke(faceplate)).intValue(), interfaceC3163lP, 0), null, iVar4, b(faceplate), interfaceC2235fA, 0.0f, null, interfaceC3163lP, ((i10 << 6) & 896) | 56 | (57344 & (i10 << 3)), 96);
                interfaceC3163l2 = interfaceC3163lP;
                interfaceC3163l2.N();
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar5 = iVar4;
            interfaceC2235f3 = interfaceC2235fA;
        } else {
            if (i11 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i12 != 0) {
                interfaceC2235fA = InterfaceC2235f.f20468a.a();
            } else {
                interfaceC2235fA = interfaceC2235f2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(234874810, i10, -1, "com.elgato.streamdeck.ui.components.FaceplateImage (FaceplateImage.kt:23)");
            }
            if (faceplate instanceof C3.b.e) {
                interfaceC3163lP.f(-1524767575);
                interfaceC3163lP.f(-1524767566);
                if ((i10 & 112) == 32) {
                }
                objG = interfaceC3163lP.g();
                if (z8) {
                    eVar = (C3.b.e) faceplate;
                    if (eVar.f().exists()) {
                        Bitmap bitmapDecodeFile4 = BitmapFactory.decodeFile(eVar.f().getAbsolutePath());
                        t.f(bitmapDecodeFile4, "decodeFile(...)");
                        objG = J.c(bitmapDecodeFile4);
                    } else {
                        objG = null;
                    }
                    interfaceC3163lP.H(objG);
                } else {
                    eVar = (C3.b.e) faceplate;
                    if (eVar.f().exists()) {
                        Bitmap bitmapDecodeFile5 = BitmapFactory.decodeFile(eVar.f().getAbsolutePath());
                        t.f(bitmapDecodeFile5, "decodeFile(...)");
                        objG = J.c(bitmapDecodeFile5);
                    } else {
                        objG = null;
                    }
                    interfaceC3163lP.H(objG);
                }
                interfaceC1621x0 = (InterfaceC1621x0) objG;
                interfaceC3163lP.N();
                if (interfaceC1621x0 != null) {
                    interfaceC3163lP.f(-1524767325);
                    iVar4 = iVar3;
                    D.c(interfaceC1621x0, null, iVar4, b(faceplate), interfaceC2235fA, 0.0f, null, 0, interfaceC3163lP, ((i10 << 6) & 896) | 56 | (57344 & (i10 << 3)), 224);
                    interfaceC3163l3 = interfaceC3163lP;
                    interfaceC3163l3.N();
                } else {
                    L0.i iVar8 = iVar3;
                    interfaceC3163lP.f(-1524767069);
                    p191w0.P0.b("No image", iVar8, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163lP, ((i10 << 3) & 112) | 6, 0, 131068);
                    iVar4 = iVar8;
                    interfaceC3163l3 = interfaceC3163lP;
                    interfaceC3163l3.N();
                }
                interfaceC3163l3.N();
                interfaceC2235fA = interfaceC2235fA;
                interfaceC3163l2 = interfaceC3163l3;
            } else {
                iVar4 = iVar3;
                interfaceC3163lP.f(-1524766993);
                D.a(p101l1.c.d(((Number) imageResource.invoke(faceplate)).intValue(), interfaceC3163lP, 0), null, iVar4, b(faceplate), interfaceC2235fA, 0.0f, null, interfaceC3163lP, ((i10 << 6) & 896) | 56 | (57344 & (i10 << 3)), 96);
                interfaceC3163l2 = interfaceC3163lP;
                interfaceC3163l2.N();
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar5 = iVar4;
            interfaceC2235f3 = interfaceC2235fA;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new a(iVar5, faceplate, imageResource, interfaceC2235f3, i8, i9));
        }
    }

    public static final L0.c b(C3.b bVar) {
        int i8 = b.f4261a[bVar.c().ordinal()];
        if (i8 == 1) {
            return L0.c.f4806a.e();
        }
        if (i8 == 2) {
            return L0.c.f4806a.k();
        }
        if (i8 == 3) {
            return L0.c.f4806a.b();
        }
        throw new C6.m();
    }
}
