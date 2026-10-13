package s7;

/* JADX INFO: renamed from: s7.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2909p extends C2907n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2909p(InterfaceC2914v writer, boolean z8) {
        super(writer);
        kotlin.jvm.internal.t.g(writer, "writer");
        this.f33301c = z8;
    }

    @Override // s7.C2907n
    public void e(byte b8) {
        boolean z8 = this.f33301c;
        String strJ = C6.w.j(C6.w.b(b8));
        if (z8) {
            n(strJ);
        } else {
            k(strJ);
        }
    }

    @Override // s7.C2907n
    public void i(int i8) {
        boolean z8 = this.f33301c;
        String unsignedString = Integer.toUnsignedString(C6.y.b(i8));
        if (z8) {
            n(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    @Override // s7.C2907n
    public void j(long j8) {
        boolean z8 = this.f33301c;
        String unsignedString = Long.toUnsignedString(C6.A.b(j8));
        if (z8) {
            n(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    @Override // s7.C2907n
    public void l(short s8) {
        boolean z8 = this.f33301c;
        String strE = C6.D.e(C6.D.b(s8));
        if (z8) {
            n(strE);
        } else {
            k(strE);
        }
    }
}
