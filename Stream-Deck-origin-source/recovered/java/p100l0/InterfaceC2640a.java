package p100l0;

import A1.d;
import A1.h;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: l0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2640a {

    /* JADX INFO: renamed from: l0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0632a implements InterfaceC2640a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f28965a;

        public /* synthetic */ C0632a(float f8, AbstractC2633k abstractC2633k) {
            this(f8);
        }

        @Override // p100l0.InterfaceC2640a
        public List a(d dVar, int i8, int i9) {
            return AbstractC2647h.c(i8, Math.max((i8 + i9) / (dVar.V0(this.f28965a) + i9), 1), i9);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0632a) && h.t(this.f28965a, ((C0632a) obj).f28965a);
        }

        public int hashCode() {
            return h.u(this.f28965a);
        }

        public C0632a(float f8) {
            this.f28965a = f8;
            if (h.j(f8, h.m(0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided min size " + ((Object) h.v(f8)) + " should be larger than zero.").toString());
        }
    }

    List a(d dVar, int i8, int i9);
}
