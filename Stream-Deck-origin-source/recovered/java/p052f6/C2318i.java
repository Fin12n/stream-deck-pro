package p052f6;

import java.security.PrivateKey;
import java.security.PublicKey;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: f6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2318i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKey f22072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublicKey f22073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PrivateKey f22074c;

    public C2318i(PublicKey serverPublic, PublicKey clientPublic, PrivateKey clientPrivate) {
        t.g(serverPublic, "serverPublic");
        t.g(clientPublic, "clientPublic");
        t.g(clientPrivate, "clientPrivate");
        this.f22072a = serverPublic;
        this.f22073b = clientPublic;
        this.f22074c = clientPrivate;
    }

    public final PrivateKey a() {
        return this.f22074c;
    }

    public final PublicKey b() {
        return this.f22073b;
    }

    public final PublicKey c() {
        return this.f22072a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2318i)) {
            return false;
        }
        C2318i c2318i = (C2318i) obj;
        return t.c(this.f22072a, c2318i.f22072a) && t.c(this.f22073b, c2318i.f22073b) && t.c(this.f22074c, c2318i.f22074c);
    }

    public int hashCode() {
        return (((this.f22072a.hashCode() * 31) + this.f22073b.hashCode()) * 31) + this.f22074c.hashCode();
    }

    public String toString() {
        return "EncryptionInfo(serverPublic=" + this.f22072a + ", clientPublic=" + this.f22073b + ", clientPrivate=" + this.f22074c + ')';
    }
}
