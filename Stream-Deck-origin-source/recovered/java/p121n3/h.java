package p121n3;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f30562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30563b;

    public void a(float f8) {
        float f9 = this.f30562a + f8;
        this.f30562a = f9;
        int i8 = this.f30563b + 1;
        this.f30563b = i8;
        if (i8 == Integer.MAX_VALUE) {
            this.f30562a = f9 / 2.0f;
            this.f30563b = i8 / 2;
        }
    }
}
