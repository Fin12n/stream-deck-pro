package p215z0;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3163l f38648a;

    public /* synthetic */ R0(InterfaceC3163l interfaceC3163l) {
        this.f38648a = interfaceC3163l;
    }

    public static final /* synthetic */ R0 a(InterfaceC3163l interfaceC3163l) {
        return new R0(interfaceC3163l);
    }

    public static boolean c(InterfaceC3163l interfaceC3163l, Object obj) {
        return (obj instanceof R0) && t.c(interfaceC3163l, ((R0) obj).f());
    }

    public static int d(InterfaceC3163l interfaceC3163l) {
        return interfaceC3163l.hashCode();
    }

    public static String e(InterfaceC3163l interfaceC3163l) {
        return "SkippableUpdater(composer=" + interfaceC3163l + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f38648a, obj);
    }

    public final /* synthetic */ InterfaceC3163l f() {
        return this.f38648a;
    }

    public int hashCode() {
        return d(this.f38648a);
    }

    public String toString() {
        return e(this.f38648a);
    }

    public static InterfaceC3163l b(InterfaceC3163l interfaceC3163l) {
        return interfaceC3163l;
    }
}
