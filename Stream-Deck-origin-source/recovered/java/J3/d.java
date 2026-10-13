package J3;

import R0.C1598l0;
import p191w0.C3072m;
import p191w0.C3074n;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public enum d {
    ACCENT,
    DANGER,
    f4150c,
    f4151d,
    STANDARD_ON_FORM,
    QUIET;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ J6.a f4155h = J6.b.a(a());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4156a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.ACCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.DANGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f4150c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f4151d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.STANDARD_ON_FORM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.QUIET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f4156a = iArr;
        }
    }

    public final C3072m b(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163l2;
        C3072m c3072mB;
        interfaceC3163l.f(811296858);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(811296858, i8, -1, "com.elgato.streamdeck.ui.components.ButtonVariant.<get-colors> (Button.kt:45)");
        }
        switch (a.f4156a[ordinal()]) {
            case 1:
                interfaceC3163l2 = interfaceC3163l;
                interfaceC3163l2.f(-1072888437);
                C3074n c3074n = C3074n.f36246a;
                Z z8 = Z.f35786a;
                int i9 = Z.f35787b;
                c3072mB = c3074n.b(z8.a(interfaceC3163l2, i9).B(), z8.a(interfaceC3163l2, i9).r(), 0L, 0L, interfaceC3163l2, C3074n.f36260o << 12, 12);
                interfaceC3163l2.N();
                break;
            case 2:
                interfaceC3163l2 = interfaceC3163l;
                interfaceC3163l2.f(-1072888236);
                C3074n c3074n2 = C3074n.f36246a;
                Z z9 = Z.f35786a;
                int i10 = Z.f35787b;
                c3072mB = c3074n2.b(z9.a(interfaceC3163l2, i10).j(), z9.a(interfaceC3163l2, i10).p(), 0L, 0L, interfaceC3163l2, C3074n.f36260o << 12, 12);
                interfaceC3163l2.N();
                break;
            case 3:
                interfaceC3163l2 = interfaceC3163l;
                interfaceC3163l2.f(-1072888037);
                C3074n c3074n3 = C3074n.f36246a;
                Z z10 = Z.f35786a;
                int i11 = Z.f35787b;
                c3072mB = c3074n3.b(z10.a(interfaceC3163l2, i11).F(), z10.a(interfaceC3163l2, i11).v(), 0L, 0L, interfaceC3163l2, C3074n.f36260o << 12, 12);
                interfaceC3163l2.N();
                break;
            case 4:
                interfaceC3163l2 = interfaceC3163l;
                interfaceC3163l2.f(-1072887814);
                C3074n c3074n4 = C3074n.f36246a;
                Z z11 = Z.f35786a;
                int i12 = Z.f35787b;
                c3072mB = c3074n4.b(z11.a(interfaceC3163l2, i12).C(), z11.a(interfaceC3163l2, i12).s(), 0L, 0L, interfaceC3163l2, C3074n.f36260o << 12, 12);
                interfaceC3163l2.N();
                break;
            case 5:
                interfaceC3163l2 = interfaceC3163l;
                interfaceC3163l2.f(-1072887585);
                C3074n c3074n5 = C3074n.f36246a;
                Z z12 = Z.f35786a;
                int i13 = Z.f35787b;
                c3072mB = c3074n5.b(m.e(z12.a(interfaceC3163l2, i13), interfaceC3163l2, 0), z12.a(interfaceC3163l2, i13).v(), 0L, 0L, interfaceC3163l2, C3074n.f36260o << 12, 12);
                interfaceC3163l2.N();
                break;
            case 6:
                interfaceC3163l.f(-1072887377);
                interfaceC3163l2 = interfaceC3163l;
                c3072mB = C3074n.f36246a.b(C1598l0.f9405b.d(), Z.f35786a.a(interfaceC3163l, Z.f35787b).o(), 0L, 0L, interfaceC3163l2, (C3074n.f36260o << 12) | 6, 12);
                interfaceC3163l2.N();
                break;
            default:
                interfaceC3163l.f(-1072890389);
                interfaceC3163l.N();
                throw new C6.m();
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l2.N();
        return c3072mB;
    }
}
