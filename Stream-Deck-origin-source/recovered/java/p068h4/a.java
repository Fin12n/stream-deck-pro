package p068h4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f24431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f24432b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterable f24433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f24434b;

        @Override // h4.f.a
        public f a() {
            String str = "";
            if (this.f24433a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f24433a, this.f24434b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // h4.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f24433a = iterable;
            return this;
        }

        @Override // h4.f.a
        public f.a c(byte[] bArr) {
            this.f24434b = bArr;
            return this;
        }
    }

    @Override // p068h4.f
    public Iterable b() {
        return this.f24431a;
    }

    @Override // p068h4.f
    public byte[] c() {
        return this.f24432b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f24431a.equals(fVar.b())) {
                if (Arrays.equals(this.f24432b, fVar instanceof a ? ((a) fVar).f24432b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f24431a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24432b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f24431a + ", extras=" + Arrays.toString(this.f24432b) + "}";
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f24431a = iterable;
        this.f24432b = bArr;
    }
}
