package W6;

import D6.J;
import io.jentz.winter.js.HRHLwtyqJWz;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class j implements Iterable, R6.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11515d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11518c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j a(long j8, long j9, long j10) {
            return new j(j8, j9, j10);
        }

        public a() {
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) obj).isEmpty()) {
            return true;
        }
        j jVar = (j) obj;
        return this.f11516a == jVar.f11516a && this.f11517b == jVar.f11517b && this.f11518c == jVar.f11518c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j8 = 31;
        long j9 = this.f11516a;
        long j10 = this.f11517b;
        long j11 = j8 * (((j9 ^ (j9 >>> 32)) * j8) + (j10 ^ (j10 >>> 32)));
        long j12 = this.f11518c;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    public boolean isEmpty() {
        long j8 = this.f11518c;
        long j9 = this.f11516a;
        long j10 = this.f11517b;
        if (j8 > 0) {
            return j9 > j10;
        }
        return j9 < j10;
    }

    public final long s() {
        return this.f11516a;
    }

    public final long t() {
        return this.f11517b;
    }

    public String toString() {
        StringBuilder sb;
        long j8;
        if (this.f11518c > 0) {
            sb = new StringBuilder();
            sb.append(this.f11516a);
            sb.append("..");
            sb.append(this.f11517b);
            sb.append(" step ");
            j8 = this.f11518c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f11516a);
            sb.append(" downTo ");
            sb.append(this.f11517b);
            sb.append(" step ");
            j8 = -this.f11518c;
        }
        sb.append(j8);
        return sb.toString();
    }

    public final long u() {
        return this.f11518c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public J iterator() {
        return new k(this.f11516a, this.f11517b, this.f11518c);
    }

    public j(long j8, long j9, long j10) {
        if (j10 != 0) {
            if (j10 != Long.MIN_VALUE) {
                this.f11516a = j8;
                this.f11517b = K6.c.d(j8, j9, j10);
                this.f11518c = j10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException(HRHLwtyqJWz.pRjgzolrU);
    }
}
