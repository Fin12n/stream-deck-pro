package M4;

/* JADX INFO: renamed from: M4.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1070y extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f5590d;

    @Override // M4.D
    public final D a(boolean z8) {
        this.f5588b = true;
        this.f5590d = (byte) (1 | this.f5590d);
        return this;
    }

    @Override // M4.D
    public final D b(int i8) {
        this.f5589c = 1;
        this.f5590d = (byte) (this.f5590d | 2);
        return this;
    }

    @Override // M4.D
    public final E c() {
        String str;
        if (this.f5590d == 3 && (str = this.f5587a) != null) {
            return new A(str, this.f5588b, this.f5589c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5587a == null) {
            sb.append(" libraryName");
        }
        if ((this.f5590d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f5590d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final D d(String str) {
        this.f5587a = "common";
        return this;
    }
}
