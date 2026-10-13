package p131o4;

import com.google.android.datatransport.runtime.d;
import com.google.android.datatransport.runtime.e;

/* JADX INFO: renamed from: o4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2750b extends AbstractC2758j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f30920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f30921c;

    public C2750b(long j8, e eVar, d dVar) {
        this.f30919a = j8;
        if (eVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f30920b = eVar;
        if (dVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f30921c = dVar;
    }

    @Override // p131o4.AbstractC2758j
    public d b() {
        return this.f30921c;
    }

    @Override // p131o4.AbstractC2758j
    public long c() {
        return this.f30919a;
    }

    @Override // p131o4.AbstractC2758j
    public e d() {
        return this.f30920b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2758j) {
            AbstractC2758j abstractC2758j = (AbstractC2758j) obj;
            if (this.f30919a == abstractC2758j.c() && this.f30920b.equals(abstractC2758j.d()) && this.f30921c.equals(abstractC2758j.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f30919a;
        return ((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f30920b.hashCode()) * 1000003) ^ this.f30921c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f30919a + ", transportContext=" + this.f30920b + ", event=" + this.f30921c + "}";
    }
}
