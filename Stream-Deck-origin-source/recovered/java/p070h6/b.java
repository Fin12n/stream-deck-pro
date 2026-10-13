package p070h6;

import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p052f6.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f24489e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p070h6.a f24490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f24491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f24492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24493d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public b(p070h6.a hash, g sign, m mVar) {
        t.g(hash, "hash");
        t.g(sign, "sign");
        this.f24490a = hash;
        this.f24491b = sign;
        this.f24492c = mVar;
        this.f24493d = hash.name() + "with" + sign.name();
    }

    public final p070h6.a a() {
        return this.f24490a;
    }

    public final String b() {
        return this.f24493d;
    }

    public final m c() {
        return this.f24492c;
    }

    public final g d() {
        return this.f24491b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24490a == bVar.f24490a && this.f24491b == bVar.f24491b && t.c(this.f24492c, bVar.f24492c);
    }

    public int hashCode() {
        int iHashCode = ((this.f24490a.hashCode() * 31) + this.f24491b.hashCode()) * 31;
        m mVar = this.f24492c;
        return iHashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    public String toString() {
        return ajyWhveMDgQ.WgHcPLxGLoNzHQ + this.f24490a + ", sign=" + this.f24491b + ", oid=" + this.f24492c + ')';
    }

    public /* synthetic */ b(p070h6.a aVar, g gVar, m mVar, int i8, AbstractC2633k abstractC2633k) {
        this(aVar, gVar, (i8 & 4) != 0 ? null : mVar);
    }
}
