package O4;

/* JADX INFO: renamed from: O4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1401e implements InterfaceC1436j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC1429i f8185b;

    public C1401e(int i8, EnumC1429i enumC1429i) {
        this.f8184a = i8;
        this.f8185b = enumC1429i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC1436j.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1436j)) {
            return false;
        }
        InterfaceC1436j interfaceC1436j = (InterfaceC1436j) obj;
        return this.f8184a == interfaceC1436j.zza() && this.f8185b.equals(interfaceC1436j.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f8184a ^ 14552422) + (this.f8185b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f8184a + "intEncoding=" + this.f8185b + ')';
    }

    @Override // O4.InterfaceC1436j
    public final int zza() {
        return this.f8184a;
    }

    @Override // O4.InterfaceC1436j
    public final EnumC1429i zzb() {
        return this.f8185b;
    }
}
