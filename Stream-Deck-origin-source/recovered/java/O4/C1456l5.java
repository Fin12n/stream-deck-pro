package O4;

/* JADX INFO: renamed from: O4.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1456l5 extends AbstractC1497r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f8326d;

    @Override // O4.AbstractC1497r5
    public final AbstractC1497r5 a(boolean z8) {
        this.f8324b = true;
        this.f8326d = (byte) (1 | this.f8326d);
        return this;
    }

    @Override // O4.AbstractC1497r5
    public final AbstractC1497r5 b(int i8) {
        this.f8325c = 1;
        this.f8326d = (byte) (this.f8326d | 2);
        return this;
    }

    @Override // O4.AbstractC1497r5
    public final AbstractC1504s5 c() {
        String str;
        if (this.f8326d == 3 && (str = this.f8323a) != null) {
            return new C1477o5(str, this.f8324b, this.f8325c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f8323a == null) {
            sb.append(" libraryName");
        }
        if ((this.f8326d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f8326d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final AbstractC1497r5 d(String str) {
        this.f8323a = "vision-common";
        return this;
    }
}
