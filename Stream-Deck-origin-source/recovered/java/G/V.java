package G;

import A.InterfaceC0870f0;
import H.m1;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class V implements androidx.camera.core.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f2513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.camera.core.d.a[] f2514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0870f0 f2515f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements androidx.camera.core.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f2516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f2518c;

        public a(int i8, int i9, ByteBuffer byteBuffer) {
            this.f2516a = i8;
            this.f2517b = i9;
            this.f2518c = byteBuffer;
        }

        @Override // androidx.camera.core.d.a
        public int a() {
            return this.f2516a;
        }

        @Override // androidx.camera.core.d.a
        public int b() {
            return this.f2517b;
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer l() {
            return this.f2518c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements InterfaceC0870f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f2519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Matrix f2521c;

        public b(long j8, int i8, Matrix matrix) {
            this.f2519a = j8;
            this.f2520b = i8;
            this.f2521c = matrix;
        }

        @Override // A.InterfaceC0870f0
        public long a() {
            return this.f2519a;
        }

        @Override // A.InterfaceC0870f0
        public m1 b() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // A.InterfaceC0870f0
        public void d(I.h.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // A.InterfaceC0870f0
        public int e() {
            return this.f2520b;
        }
    }

    public V(Q.B b8) {
        this((Bitmap) b8.c(), b8.b(), b8.f(), b8.g(), b8.a().a());
    }

    public static InterfaceC0870f0 c(long j8, int i8, Matrix matrix) {
        return new b(j8, i8, matrix);
    }

    public static androidx.camera.core.d.a j(ByteBuffer byteBuffer, int i8, int i9) {
        return new a(i8, i9, byteBuffer);
    }

    @Override // androidx.camera.core.d
    public androidx.camera.core.d.a[] D() {
        androidx.camera.core.d.a[] aVarArr;
        synchronized (this.f2510a) {
            b();
            androidx.camera.core.d.a[] aVarArr2 = this.f2514e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    public final void b() {
        synchronized (this.f2510a) {
            T1.f.j(this.f2514e != null, "The image is closed.");
        }
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f2510a) {
            b();
            this.f2514e = null;
        }
    }

    @Override // androidx.camera.core.d
    public void d1(Rect rect) {
        synchronized (this.f2510a) {
            try {
                b();
                if (rect != null) {
                    this.f2513d.set(rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.d
    public InterfaceC0870f0 e1() {
        InterfaceC0870f0 interfaceC0870f0;
        synchronized (this.f2510a) {
            b();
            interfaceC0870f0 = this.f2515f;
        }
        return interfaceC0870f0;
    }

    @Override // androidx.camera.core.d
    public int f() {
        int i8;
        synchronized (this.f2510a) {
            b();
            i8 = this.f2512c;
        }
        return i8;
    }

    @Override // androidx.camera.core.d
    public int g() {
        int i8;
        synchronized (this.f2510a) {
            b();
            i8 = this.f2511b;
        }
        return i8;
    }

    @Override // androidx.camera.core.d
    public int getFormat() {
        synchronized (this.f2510a) {
            b();
        }
        return 1;
    }

    @Override // androidx.camera.core.d
    public Image x1() {
        synchronized (this.f2510a) {
            b();
        }
        return null;
    }

    public V(Bitmap bitmap, Rect rect, int i8, Matrix matrix, long j8) {
        this(P.b.d(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i8, matrix, j8);
    }

    public V(ByteBuffer byteBuffer, int i8, int i9, int i10, Rect rect, int i11, Matrix matrix, long j8) {
        this.f2510a = new Object();
        this.f2511b = i9;
        this.f2512c = i10;
        this.f2513d = rect;
        this.f2515f = c(j8, i11, matrix);
        byteBuffer.rewind();
        this.f2514e = new androidx.camera.core.d.a[]{j(byteBuffer, i9 * i8, i8)};
    }
}
