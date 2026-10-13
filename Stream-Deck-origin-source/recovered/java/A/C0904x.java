package A;

/* JADX INFO: renamed from: A.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C0904x extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f340a;

    public C0904x(int i8) {
        this.f340a = i8;
    }

    public C0904x(int i8, String str) {
        super(str);
        this.f340a = i8;
    }

    public C0904x(int i8, String str, Throwable th) {
        super(str, th);
        this.f340a = i8;
    }

    public C0904x(int i8, Throwable th) {
        super(th);
        this.f340a = i8;
    }
}
