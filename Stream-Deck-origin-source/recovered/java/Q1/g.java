package Q1;

import L1.j;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b[] f9140b;

        @Deprecated
        public a(int i8, b[] bVarArr) {
            this.f9139a = i8;
            this.f9140b = bVarArr;
        }

        public static a a(int i8, b[] bVarArr) {
            return new a(i8, bVarArr);
        }

        public b[] b() {
            return this.f9140b;
        }

        public int c() {
            return this.f9139a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f9141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f9144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9145e;

        @Deprecated
        public b(Uri uri, int i8, int i9, boolean z8, int i10) {
            this.f9141a = (Uri) T1.f.g(uri);
            this.f9142b = i8;
            this.f9143c = i9;
            this.f9144d = z8;
            this.f9145e = i10;
        }

        public static b a(Uri uri, int i8, int i9, boolean z8, int i10) {
            return new b(uri, i8, i9, z8, i10);
        }

        public int b() {
            return this.f9145e;
        }

        public int c() {
            return this.f9142b;
        }

        public Uri d() {
            return this.f9141a;
        }

        public int e() {
            return this.f9143c;
        }

        public boolean f() {
            return this.f9144d;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return j.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i8, boolean z8, int i9, Handler handler, c cVar) {
        Q1.a aVar = new Q1.a(cVar, handler);
        return z8 ? f.e(context, eVar, aVar, i8, i9) : f.d(context, eVar, i8, null, aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public void a(int i8) {
        }

        public void b(Typeface typeface) {
        }
    }
}
