package p017b7;

import Q6.k;

/* JADX INFO: renamed from: b7.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1809s0 {

    /* JADX INFO: renamed from: b7.s0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC1809s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f15981a;

        public a(k kVar) {
            this.f15981a = kVar;
        }

        @Override // p017b7.InterfaceC1809s0
        public void a(Throwable th) {
            this.f15981a.invoke(th);
        }

        public String toString() {
            return "InternalCompletionHandler.UserSupplied[" + N.a(this.f15981a) + '@' + N.b(this) + ']';
        }
    }

    void a(Throwable th);
}
