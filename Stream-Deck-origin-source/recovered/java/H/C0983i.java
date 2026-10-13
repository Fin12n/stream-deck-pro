package H;

/* JADX INFO: renamed from: H.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0983i extends InterfaceC0984i0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f3048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3049c;

    public C0983i(String str, Class cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f3047a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f3048b = cls;
        this.f3049c = obj;
    }

    @Override // H.InterfaceC0984i0.a
    public String c() {
        return this.f3047a;
    }

    @Override // H.InterfaceC0984i0.a
    public Object d() {
        return this.f3049c;
    }

    @Override // H.InterfaceC0984i0.a
    public Class e() {
        return this.f3048b;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0984i0.a) {
            InterfaceC0984i0.a aVar = (InterfaceC0984i0.a) obj;
            if (this.f3047a.equals(aVar.c()) && this.f3048b.equals(aVar.e()) && ((obj2 = this.f3049c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f3047a.hashCode() ^ 1000003) * 1000003) ^ this.f3048b.hashCode()) * 1000003;
        Object obj = this.f3049c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f3047a + ", valueClass=" + this.f3048b + ", token=" + this.f3049c + "}";
    }
}
