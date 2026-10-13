package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.W2;
import io.sentry.X0;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f27472b = new u("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.util.q f27473a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(W0 w8, ILogger iLogger) {
            return new u(w8.G());
        }
    }

    public u() {
        this((UUID) null);
    }

    public static /* synthetic */ String a(u uVar, UUID uuid) {
        uVar.getClass();
        return uVar.d(io.sentry.util.H.c(uuid));
    }

    public final String d(String str) {
        return io.sentry.util.B.e(str).replace("-", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f27473a.a()).equals(((u) obj).f27473a.a());
    }

    public int hashCode() {
        return ((String) this.f27473a.a()).hashCode();
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.c(toString());
    }

    public String toString() {
        return (String) this.f27473a.a();
    }

    public u(final UUID uuid) {
        if (uuid != null) {
            this.f27473a = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.protocol.q
                @Override // io.sentry.util.q.a
                public final Object a() {
                    return u.a(this.f27467a, uuid);
                }
            });
        } else {
            this.f27473a = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.protocol.r
                @Override // io.sentry.util.q.a
                public final Object a() {
                    return W2.a();
                }
            });
        }
    }

    public u(String str) {
        final String strE = io.sentry.util.B.e(str);
        if (strE.length() != 32 && strE.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
        }
        if (strE.length() == 36) {
            this.f27473a = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.protocol.s
                @Override // io.sentry.util.q.a
                public final Object a() {
                    return this.f27469a.d(strE);
                }
            });
        } else {
            this.f27473a = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.protocol.t
                @Override // io.sentry.util.q.a
                public final Object a() {
                    return u.b(strE);
                }
            });
        }
    }

    public static /* synthetic */ String b(String str) {
        return str;
    }
}
