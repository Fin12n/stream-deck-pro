package L0;

import java.util.concurrent.atomic.AtomicReference;
import p017b7.InterfaceC1815v0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1815v0 f4904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f4905b;

        public a(InterfaceC1815v0 interfaceC1815v0, Object obj) {
            this.f4904a = interfaceC1815v0;
            this.f4905b = obj;
        }

        public final Object a() {
            return this.f4905b;
        }
    }

    public static AtomicReference a() {
        return b(new AtomicReference(null));
    }

    public static final Object c(AtomicReference atomicReference) {
        a aVar = (a) atomicReference.get();
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public static AtomicReference b(AtomicReference atomicReference) {
        return atomicReference;
    }
}
