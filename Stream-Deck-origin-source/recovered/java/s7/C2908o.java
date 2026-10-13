package s7;

/* JADX INFO: renamed from: s7.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2908o extends C2907n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2908o(InterfaceC2914v writer, boolean z8) {
        super(writer);
        kotlin.jvm.internal.t.g(writer, "writer");
        this.f33300c = z8;
    }

    @Override // s7.C2907n
    public void n(String value) {
        kotlin.jvm.internal.t.g(value, "value");
        if (this.f33300c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
