package p050f4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.c f21899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.b f21900b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o.c f21901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o.b f21902b;

        @Override // f4.o.a
        public o a() {
            return new i(this.f21901a, this.f21902b);
        }

        @Override // f4.o.a
        public o.a b(o.b bVar) {
            this.f21902b = bVar;
            return this;
        }

        @Override // f4.o.a
        public o.a c(o.c cVar) {
            this.f21901a = cVar;
            return this;
        }
    }

    @Override // p050f4.o
    public o.b b() {
        return this.f21900b;
    }

    @Override // p050f4.o
    public o.c c() {
        return this.f21899a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f21899a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f21900b;
                if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f21899a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f21900b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f21899a + ", mobileSubtype=" + this.f21900b + "}";
    }

    public i(o.c cVar, o.b bVar) {
        this.f21899a = cVar;
        this.f21900b = bVar;
    }
}
