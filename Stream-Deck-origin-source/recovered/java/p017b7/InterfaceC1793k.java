package p017b7;

import Q6.k;

/* JADX INFO: renamed from: b7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1793k extends L0 {

    /* JADX INFO: renamed from: b7.k$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC1793k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f15965a;

        public a(k kVar) {
            this.f15965a = kVar;
        }

        @Override // p017b7.InterfaceC1793k
        public void a(Throwable th) {
            this.f15965a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + N.a(this.f15965a) + '@' + N.b(this) + ']';
        }
    }

    void a(Throwable th);
}
