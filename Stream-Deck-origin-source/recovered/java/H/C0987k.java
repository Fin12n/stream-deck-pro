package H;

import java.util.List;

/* JADX INFO: renamed from: H.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0987k extends c1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0994n0 f3101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A.J f3106f;

    /* JADX INFO: renamed from: H.k$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends c1.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC0994n0 f3107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f3108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f3110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f3111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public A.J f3112f;

        @Override // H.c1.f.a
        public c1.f a() {
            String str = "";
            if (this.f3107a == null) {
                str = " surface";
            }
            if (this.f3108b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f3110d == null) {
                str = str + " mirrorMode";
            }
            if (this.f3111e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f3112f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C0987k(this.f3107a, this.f3108b, this.f3109c, this.f3110d.intValue(), this.f3111e.intValue(), this.f3112f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // H.c1.f.a
        public c1.f.a b(A.J j8) {
            if (j8 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f3112f = j8;
            return this;
        }

        @Override // H.c1.f.a
        public c1.f.a c(int i8) {
            this.f3110d = Integer.valueOf(i8);
            return this;
        }

        @Override // H.c1.f.a
        public c1.f.a d(String str) {
            this.f3109c = str;
            return this;
        }

        @Override // H.c1.f.a
        public c1.f.a e(List list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f3108b = list;
            return this;
        }

        @Override // H.c1.f.a
        public c1.f.a f(int i8) {
            this.f3111e = Integer.valueOf(i8);
            return this;
        }

        public c1.f.a g(AbstractC0994n0 abstractC0994n0) {
            if (abstractC0994n0 == null) {
                throw new NullPointerException("Null surface");
            }
            this.f3107a = abstractC0994n0;
            return this;
        }
    }

    @Override // H.c1.f
    public A.J b() {
        return this.f3106f;
    }

    @Override // H.c1.f
    public int c() {
        return this.f3104d;
    }

    @Override // H.c1.f
    public String d() {
        return this.f3103c;
    }

    @Override // H.c1.f
    public List e() {
        return this.f3102b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c1.f) {
            c1.f fVar = (c1.f) obj;
            if (this.f3101a.equals(fVar.f()) && this.f3102b.equals(fVar.e()) && ((str = this.f3103c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f3104d == fVar.c() && this.f3105e == fVar.g() && this.f3106f.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // H.c1.f
    public AbstractC0994n0 f() {
        return this.f3101a;
    }

    @Override // H.c1.f
    public int g() {
        return this.f3105e;
    }

    public int hashCode() {
        int iHashCode = (((this.f3101a.hashCode() ^ 1000003) * 1000003) ^ this.f3102b.hashCode()) * 1000003;
        String str = this.f3103c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3104d) * 1000003) ^ this.f3105e) * 1000003) ^ this.f3106f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f3101a + ", sharedSurfaces=" + this.f3102b + ", physicalCameraId=" + this.f3103c + ", mirrorMode=" + this.f3104d + ", surfaceGroupId=" + this.f3105e + ", dynamicRange=" + this.f3106f + "}";
    }

    public C0987k(AbstractC0994n0 abstractC0994n0, List list, String str, int i8, int i9, A.J j8) {
        this.f3101a = abstractC0994n0;
        this.f3102b = list;
        this.f3103c = str;
        this.f3104d = i8;
        this.f3105e = i9;
        this.f3106f = j8;
    }
}
