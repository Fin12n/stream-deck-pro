package p075i2;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f24581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f24584e = d.a();

    public int a(int i8) {
        return i8 + this.f24581b.getInt(i8);
    }

    public int b(int i8) {
        if (i8 < this.f24583d) {
            return this.f24581b.getShort(this.f24582c + i8);
        }
        return 0;
    }

    public void c(int i8, ByteBuffer byteBuffer) {
        this.f24581b = byteBuffer;
        if (byteBuffer == null) {
            this.f24580a = 0;
            this.f24582c = 0;
            this.f24583d = 0;
        } else {
            this.f24580a = i8;
            int i9 = i8 - byteBuffer.getInt(i8);
            this.f24582c = i9;
            this.f24583d = this.f24581b.getShort(i9);
        }
    }

    public int d(int i8) {
        int i9 = i8 + this.f24580a;
        return i9 + this.f24581b.getInt(i9) + 4;
    }

    public int e(int i8) {
        int i9 = i8 + this.f24580a;
        return this.f24581b.getInt(i9 + this.f24581b.getInt(i9));
    }
}
