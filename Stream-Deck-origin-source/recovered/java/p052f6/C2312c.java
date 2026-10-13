package p052f6;

import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.t;
import p070h6.b;

/* JADX INFO: renamed from: f6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2312c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f22041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f22042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f22043c;

    public C2312c(byte[] types, b[] hashAndSign, Set<X500Principal> authorities) {
        t.g(types, "types");
        t.g(hashAndSign, "hashAndSign");
        t.g(authorities, "authorities");
        this.f22041a = types;
        this.f22042b = hashAndSign;
        this.f22043c = authorities;
    }

    public final Set a() {
        return this.f22043c;
    }

    public final b[] b() {
        return this.f22042b;
    }

    public final byte[] c() {
        return this.f22041a;
    }
}
