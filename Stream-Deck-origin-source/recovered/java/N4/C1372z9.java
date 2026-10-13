package N4;

/* JADX INFO: renamed from: N4.z9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1372z9 extends E9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f7435d;

    @Override // N4.E9
    public final E9 a(boolean z8) {
        this.f7433b = true;
        this.f7435d = (byte) (1 | this.f7435d);
        return this;
    }

    @Override // N4.E9
    public final E9 b(int i8) {
        this.f7434c = 1;
        this.f7435d = (byte) (this.f7435d | 2);
        return this;
    }

    @Override // N4.E9
    public final F9 c() {
        String str;
        if (this.f7435d == 3 && (str = this.f7432a) != null) {
            return new B9(str, this.f7433b, this.f7434c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f7432a == null) {
            sb.append(" libraryName");
        }
        if ((this.f7435d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f7435d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final E9 d(String str) {
        this.f7432a = str;
        return this;
    }
}
