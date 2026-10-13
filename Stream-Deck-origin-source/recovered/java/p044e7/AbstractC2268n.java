package p044e7;

import Q6.k;
import Q6.o;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: e7.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2268n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f21041a = b.f21044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f21042b = a.f21043a;

    /* JADX INFO: renamed from: e7.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21043a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(t.c(obj, obj2));
        }
    }

    public static final InterfaceC2260f a(InterfaceC2260f interfaceC2260f) {
        return interfaceC2260f instanceof M ? interfaceC2260f : c(interfaceC2260f, f21041a, f21042b);
    }

    public static final InterfaceC2260f b(InterfaceC2260f interfaceC2260f, k kVar) {
        return c(interfaceC2260f, kVar, f21042b);
    }

    public static final InterfaceC2260f c(InterfaceC2260f interfaceC2260f, k kVar, o oVar) {
        if (interfaceC2260f instanceof C2259e) {
            C2259e c2259e = (C2259e) interfaceC2260f;
            if (c2259e.f20984b == kVar && c2259e.f20985c == oVar) {
                return interfaceC2260f;
            }
        }
        return new C2259e(interfaceC2260f, kVar, oVar);
    }

    /* JADX INFO: renamed from: e7.n$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21044a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
