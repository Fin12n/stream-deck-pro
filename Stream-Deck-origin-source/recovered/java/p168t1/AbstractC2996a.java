package p168t1;

import C6.InterfaceC0916e;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: t1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2996a implements InterfaceC3008m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B.d f34029b;

    /* JADX INFO: renamed from: t1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface InterfaceC0759a {
    }

    @InterfaceC0916e
    public /* synthetic */ AbstractC2996a(int i8, InterfaceC0759a interfaceC0759a, AbstractC2633k abstractC2633k) {
        this(i8, interfaceC0759a);
    }

    @Override // p168t1.InterfaceC3008m
    public final int a() {
        return this.f34028a;
    }

    public final InterfaceC0759a d() {
        return null;
    }

    public /* synthetic */ AbstractC2996a(int i8, InterfaceC0759a interfaceC0759a, B.d dVar, AbstractC2633k abstractC2633k) {
        this(i8, interfaceC0759a, dVar);
    }

    public AbstractC2996a(int i8, InterfaceC0759a interfaceC0759a, B.d dVar) {
        this.f34028a = i8;
        this.f34029b = dVar;
    }

    public AbstractC2996a(int i8, InterfaceC0759a interfaceC0759a) {
        this(i8, interfaceC0759a, new B.d(new B.a[0]), null);
    }
}
