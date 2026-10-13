package H;

import A.AbstractC0890p0;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: H.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0986j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f3057a = Collections.unmodifiableSet(EnumSet.of(EnumC1006u.PASSIVE_FOCUSED, EnumC1006u.PASSIVE_NOT_FOCUSED, EnumC1006u.LOCKED_FOCUSED, EnumC1006u.LOCKED_NOT_FOCUSED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f3058b = Collections.unmodifiableSet(EnumSet.of(EnumC1010w.CONVERGED, EnumC1010w.UNKNOWN));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f3059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f3060d;

    static {
        EnumC1002s enumC1002s = EnumC1002s.CONVERGED;
        EnumC1002s enumC1002s2 = EnumC1002s.FLASH_REQUIRED;
        EnumC1002s enumC1002s3 = EnumC1002s.UNKNOWN;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC1002s, enumC1002s2, enumC1002s3));
        f3059c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC1002s2);
        enumSetCopyOf.remove(enumC1002s3);
        f3060d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public static boolean a(InterfaceC1014y interfaceC1014y, boolean z8) {
        boolean z9 = interfaceC1014y.g() == EnumC1004t.OFF || f3057a.contains(interfaceC1014y.k());
        boolean z10 = interfaceC1014y.j() == r.OFF;
        boolean z11 = !z8 ? !(z10 || f3059c.contains(interfaceC1014y.h())) : !(z10 || f3060d.contains(interfaceC1014y.h()));
        boolean z12 = interfaceC1014y.f() == EnumC1008v.OFF || f3058b.contains(interfaceC1014y.e());
        AbstractC0890p0.a("ConvergenceUtils", "checkCaptureResult, AE=" + interfaceC1014y.h() + " AF =" + interfaceC1014y.k() + " AWB=" + interfaceC1014y.e());
        return z9 && z11 && z12;
    }
}
