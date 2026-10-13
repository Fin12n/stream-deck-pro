package p056g1;

import C6.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import p038e1.InterfaceC2244o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23491a;

        static {
            int[] iArr = new int[F.e.values().length];
            try {
                iArr[F.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F.e.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F.e.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[F.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[F.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f23491a = iArr;
        }
    }

    public static final List a(InterfaceC2244o interfaceC2244o) {
        t.e(interfaceC2244o, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        F fH1 = ((S) interfaceC2244o).h1();
        boolean zB = b(fH1);
        List listK = fH1.K();
        ArrayList arrayList = new ArrayList(listK.size());
        int size = listK.size();
        for (int i8 = 0; i8 < size; i8++) {
            F f8 = (F) listK.get(i8);
            arrayList.add(zB ? f8.D() : f8.E());
        }
        return arrayList;
    }

    public static final boolean b(F f8) {
        int i8 = a.f23491a[f8.V().ordinal()];
        if (i8 == 1 || i8 == 2) {
            return true;
        }
        if (i8 == 3 || i8 == 4) {
            return false;
        }
        if (i8 != 5) {
            throw new m();
        }
        F fM0 = f8.m0();
        if (fM0 != null) {
            return b(fM0);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}
