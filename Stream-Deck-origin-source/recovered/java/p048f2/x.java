package p048f2;

import G6.g;
import Q6.o;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1812u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f21788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1812u f21789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final E f21790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g f21791d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o transform, InterfaceC1812u ack, E e8, g callerContext) {
            super(null);
            t.g(transform, "transform");
            t.g(ack, "ack");
            t.g(callerContext, "callerContext");
            this.f21788a = transform;
            this.f21789b = ack;
            this.f21790c = e8;
            this.f21791d = callerContext;
        }

        public final InterfaceC1812u a() {
            return this.f21789b;
        }

        public final g b() {
            return this.f21791d;
        }

        public E c() {
            return this.f21790c;
        }

        public final o d() {
            return this.f21788a;
        }
    }

    public /* synthetic */ x(AbstractC2633k abstractC2633k) {
        this();
    }

    public x() {
    }
}
