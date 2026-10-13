package p205x6;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p189v6.a;
import p189v6.b;
import p221z6.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f37430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f37431i;

    public m() {
        this(0, 0, null, 7, null);
    }

    @Override // p221z6.d
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public p213y6.a c(p213y6.a instance) {
        t.g(instance, "instance");
        p213y6.a aVar = (p213y6.a) super.c(instance);
        aVar.J();
        aVar.r();
        return aVar;
    }

    @Override // p221z6.d
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void j(p213y6.a instance) {
        t.g(instance, "instance");
        this.f37431i.a(instance.h());
        super.j(instance);
        instance.I();
    }

    @Override // p221z6.d
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public p213y6.a t() {
        return new p213y6.a(this.f37431i.b(this.f37430h), null, this, null);
    }

    @Override // p221z6.d
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void A(p213y6.a instance) {
        t.g(instance, "instance");
        super.A(instance);
        if (instance.h().limit() != this.f37430h) {
            StringBuilder sb = new StringBuilder();
            sb.append("Buffer size mismatch. Expected: ");
            sb.append(this.f37430h);
            sb.append(", actual: ");
            sb.append(instance.h().limit());
            throw new IllegalStateException(sb.toString().toString());
        }
        if (instance == p213y6.a.f38436j.a()) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        if (instance == a.f37418g.a()) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (instance.E() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (instance.C() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
        if (instance.D() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }

    public /* synthetic */ m(int i8, int i9, a aVar, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? 4096 : i8, (i10 & 2) != 0 ? 1000 : i9, (i10 & 4) != 0 ? b.f35173a : aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i8, int i9, a allocator) {
        super(i9);
        t.g(allocator, "allocator");
        this.f37430h = i8;
        this.f37431i = allocator;
    }
}
