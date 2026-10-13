package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f25471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f25472b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f25473c = new a();

        public a() {
            super(i.a(), i.b(), null);
        }

        @Override // io.ktor.utils.io.internal.h
        public boolean a() {
            return true;
        }

        public String toString() {
            return "IDLE(empty)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f25474c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c initial) {
            super(initial.f25471a, initial.f25472b, null);
            t.g(initial, "initial");
            this.f25474c = initial;
        }

        @Override // io.ktor.utils.io.internal.h
        public boolean a() {
            return true;
        }

        public final c h() {
            return this.f25474c;
        }

        @Override // io.ktor.utils.io.internal.h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public d d() {
            return this.f25474c.i();
        }

        @Override // io.ktor.utils.io.internal.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public g e() {
            return this.f25474c.k();
        }

        public String toString() {
            return "IDLE(with buffer)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ByteBuffer f25475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ByteBuffer f25476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f25477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final d f25478f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final g f25479g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e f25480h;

        public /* synthetic */ c(ByteBuffer byteBuffer, int i8, int i9, AbstractC2633k abstractC2633k) {
            this(byteBuffer, (i9 & 2) != 0 ? 8 : i8);
        }

        @Override // io.ktor.utils.io.internal.h
        public boolean a() {
            throw new IllegalStateException("Not available for initial state");
        }

        @Override // io.ktor.utils.io.internal.h
        public ByteBuffer b() {
            return this.f25476d;
        }

        @Override // io.ktor.utils.io.internal.h
        public ByteBuffer c() {
            return this.f25475c;
        }

        public final b h() {
            return this.f25477e;
        }

        public final d i() {
            return this.f25478f;
        }

        public final e j() {
            return this.f25480h;
        }

        public final g k() {
            return this.f25479g;
        }

        @Override // io.ktor.utils.io.internal.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public d d() {
            return this.f25478f;
        }

        @Override // io.ktor.utils.io.internal.h
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public g e() {
            return this.f25479g;
        }

        public String toString() {
            return "Initial";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ByteBuffer backingBuffer, int i8) {
            super(backingBuffer, new j(backingBuffer.capacity() - i8), null);
            t.g(backingBuffer, "backingBuffer");
            if (backingBuffer.position() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (backingBuffer.limit() != backingBuffer.capacity()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ByteBuffer byteBufferDuplicate = backingBuffer.duplicate();
            t.f(byteBufferDuplicate, "backingBuffer.duplicate()");
            this.f25475c = byteBufferDuplicate;
            ByteBuffer byteBufferDuplicate2 = backingBuffer.duplicate();
            t.f(byteBufferDuplicate2, "backingBuffer.duplicate()");
            this.f25476d = byteBufferDuplicate2;
            this.f25477e = new b(this);
            this.f25478f = new d(this);
            this.f25479g = new g(this);
            this.f25480h = new e(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f25481c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c initial) {
            super(initial.f25471a, initial.f25472b, null);
            t.g(initial, "initial");
            this.f25481c = initial;
        }

        @Override // io.ktor.utils.io.internal.h
        public ByteBuffer b() {
            return this.f25481c.b();
        }

        @Override // io.ktor.utils.io.internal.h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public e e() {
            return this.f25481c.j();
        }

        @Override // io.ktor.utils.io.internal.h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b f() {
            return this.f25481c.h();
        }

        public String toString() {
            return "Reading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f25482c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c initial) {
            super(initial.f25471a, initial.f25472b, null);
            t.g(initial, "initial");
            this.f25482c = initial;
        }

        @Override // io.ktor.utils.io.internal.h
        public ByteBuffer b() {
            return this.f25482c.b();
        }

        @Override // io.ktor.utils.io.internal.h
        public ByteBuffer c() {
            return this.f25482c.c();
        }

        @Override // io.ktor.utils.io.internal.h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public g f() {
            return this.f25482c.k();
        }

        @Override // io.ktor.utils.io.internal.h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public d g() {
            return this.f25482c.i();
        }

        public String toString() {
            return "Reading+Writing";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f25483c = new f();

        public f() {
            super(i.a(), i.b(), null);
        }

        public String toString() {
            return "Terminated";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f25484c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c initial) {
            super(initial.f25471a, initial.f25472b, null);
            t.g(initial, "initial");
            this.f25484c = initial;
        }

        @Override // io.ktor.utils.io.internal.h
        public ByteBuffer c() {
            return this.f25484c.c();
        }

        @Override // io.ktor.utils.io.internal.h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public e d() {
            return this.f25484c.j();
        }

        @Override // io.ktor.utils.io.internal.h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b g() {
            return this.f25484c.h();
        }

        public String toString() {
            return "Writing";
        }
    }

    public /* synthetic */ h(ByteBuffer byteBuffer, j jVar, AbstractC2633k abstractC2633k) {
        this(byteBuffer, jVar);
    }

    public boolean a() {
        return false;
    }

    public ByteBuffer b() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    public ByteBuffer c() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    public h d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    public h e() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    public h f() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    public h g() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }

    public h(ByteBuffer byteBuffer, j jVar) {
        this.f25471a = byteBuffer;
        this.f25472b = jVar;
    }
}
