package N4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class L0 implements Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P0 f6339b;

    public L0(int i8, P0 p8) {
        this.f6338a = i8;
        this.f6339b = p8;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return Q0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return false;
        }
        Q0 q8 = (Q0) obj;
        return this.f6338a == q8.zza() && this.f6339b.equals(q8.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f6338a ^ 14552422) + (this.f6339b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f6338a + "intEncoding=" + this.f6339b + ')';
    }

    @Override // N4.Q0
    public final int zza() {
        return this.f6338a;
    }

    @Override // N4.Q0
    public final P0 zzb() {
        return this.f6339b;
    }
}
