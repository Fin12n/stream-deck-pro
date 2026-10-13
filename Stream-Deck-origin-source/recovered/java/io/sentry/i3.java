package io.sentry;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i3 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i3 f27177b = new i3("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.util.q f27178a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i3 a(W0 w8, ILogger iLogger) {
            return new i3(w8.G());
        }
    }

    public i3(final String str) {
        Objects.requireNonNull(str, "value is required");
        this.f27178a = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.h3
            @Override // io.sentry.util.q.a
            public final Object a() {
                return i3.a(str);
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i3.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f27178a.a()).equals(((i3) obj).f27178a.a());
    }

    public int hashCode() {
        return ((String) this.f27178a.a()).hashCode();
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.c((String) this.f27178a.a());
    }

    public String toString() {
        return (String) this.f27178a.a();
    }

    public i3() {
        this.f27178a = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.g3
            @Override // io.sentry.util.q.a
            public final Object a() {
                return W2.b();
            }
        });
    }

    public static /* synthetic */ String a(String str) {
        return str;
    }
}
