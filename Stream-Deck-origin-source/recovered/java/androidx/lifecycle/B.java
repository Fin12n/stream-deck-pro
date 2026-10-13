package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class B implements InterfaceC1730m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1719b.a f15181b;

    public B(Object obj) {
        this.f15180a = obj;
        this.f15181b = C1719b.f15274c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1730m
    public void j(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar) {
        this.f15181b.a(interfaceC1733p, aVar, this.f15180a);
    }
}
