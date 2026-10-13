package p038e1;

import L0.i;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f20426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2247s f20427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20428c;

    public M(i iVar, InterfaceC2247s interfaceC2247s, Object obj) {
        this.f20426a = iVar;
        this.f20427b = interfaceC2247s;
        this.f20428c = obj;
    }

    public final i a() {
        return this.f20426a;
    }

    public String toString() {
        return "ModifierInfo(" + this.f20426a + ", " + this.f20427b + ", " + this.f20428c + ')';
    }

    public /* synthetic */ M(i iVar, InterfaceC2247s interfaceC2247s, Object obj, int i8, AbstractC2633k abstractC2633k) {
        this(iVar, interfaceC2247s, (i8 & 4) != 0 ? null : obj);
    }
}
