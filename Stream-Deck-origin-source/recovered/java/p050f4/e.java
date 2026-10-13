package p050f4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.b f21866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p050f4.a f21867b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k.b f21868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p050f4.a f21869b;

        @Override // f4.k.a
        public k a() {
            return new e(this.f21868a, this.f21869b);
        }

        @Override // f4.k.a
        public k.a b(p050f4.a aVar) {
            this.f21869b = aVar;
            return this;
        }

        @Override // f4.k.a
        public k.a c(k.b bVar) {
            this.f21868a = bVar;
            return this;
        }
    }

    @Override // p050f4.k
    public p050f4.a b() {
        return this.f21867b;
    }

    @Override // p050f4.k
    public k.b c() {
        return this.f21866a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f21866a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                p050f4.a aVar = this.f21867b;
                if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f21866a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        p050f4.a aVar = this.f21867b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f21866a + ", androidClientInfo=" + this.f21867b + "}";
    }

    public e(k.b bVar, p050f4.a aVar) {
        this.f21866a = bVar;
        this.f21867b = aVar;
    }
}
