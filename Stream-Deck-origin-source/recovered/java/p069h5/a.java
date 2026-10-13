package p069h5;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d.a f24447b = d.a.DEFAULT;

    /* JADX INFO: renamed from: h5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0562a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d.a f24449b;

        public C0562a(int i8, d.a aVar) {
            this.f24448a = i8;
            this.f24449b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f24448a == dVar.tag() && this.f24449b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f24448a) + (this.f24449b.hashCode() ^ 2041407134);
        }

        @Override // p069h5.d
        public d.a intEncoding() {
            return this.f24449b;
        }

        @Override // p069h5.d
        public int tag() {
            return this.f24448a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f24448a + "intEncoding=" + this.f24449b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0562a(this.f24446a, this.f24447b);
    }

    public a c(int i8) {
        this.f24446a = i8;
        return this;
    }
}
