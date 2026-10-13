package p032d4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f19814c;

    public a(Integer num, Object obj, d dVar) {
        this.f19812a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f19813b = obj;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f19814c = dVar;
    }

    @Override // p032d4.c
    public Integer a() {
        return this.f19812a;
    }

    @Override // p032d4.c
    public Object b() {
        return this.f19813b;
    }

    @Override // p032d4.c
    public d c() {
        return this.f19814c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f19812a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f19813b.equals(cVar.b()) && this.f19814c.equals(cVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f19812a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f19813b.hashCode()) * 1000003) ^ this.f19814c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f19812a + ", payload=" + this.f19813b + ", priority=" + this.f19814c + "}";
    }
}
