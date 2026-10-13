package io.sentry.transport;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27656a;

        public b(int i8) {
            super();
            this.f27656a = i8;
        }

        @Override // io.sentry.transport.C
        public int c() {
            return this.f27656a;
        }

        @Override // io.sentry.transport.C
        public boolean d() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27657a = new c();

        public c() {
            super();
        }

        @Override // io.sentry.transport.C
        public int c() {
            return -1;
        }

        @Override // io.sentry.transport.C
        public boolean d() {
            return true;
        }
    }

    public static C a() {
        return b(-1);
    }

    public static C b(int i8) {
        return new b(i8);
    }

    public static C e() {
        return c.f27657a;
    }

    public abstract int c();

    public abstract boolean d();

    public C() {
    }
}
