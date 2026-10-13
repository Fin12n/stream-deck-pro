package s7;

import D6.C0930j;

/* JADX INFO: renamed from: s7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2903j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0930j f33286a = new C0930j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33287b;

    public final void a(char[] array) {
        kotlin.jvm.internal.t.g(array, "array");
        synchronized (this) {
            try {
                if (this.f33287b + array.length < AbstractC2899f.f33281a) {
                    this.f33287b += array.length;
                    this.f33286a.addLast(array);
                }
                C6.G g8 = C6.G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final char[] b(int i8) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f33286a.L();
            if (cArr != null) {
                this.f33287b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i8] : cArr;
    }
}
