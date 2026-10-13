package U1;

import Z.JTT.ryTuoS;
import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: renamed from: U1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1642d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f10121a;

    /* JADX INFO: renamed from: U1.d$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        void a(Uri uri);

        void b(int i8);

        C1642d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: U1.d$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo f10129a;

        public e(ContentInfo contentInfo) {
            this.f10129a = C1641c.a(T1.f.g(contentInfo));
        }

        @Override // U1.C1642d.f
        public ClipData a() {
            return this.f10129a.getClip();
        }

        @Override // U1.C1642d.f
        public Uri b() {
            return this.f10129a.getLinkUri();
        }

        @Override // U1.C1642d.f
        public int c() {
            return this.f10129a.getFlags();
        }

        @Override // U1.C1642d.f
        public ContentInfo d() {
            return this.f10129a;
        }

        @Override // U1.C1642d.f
        public Bundle getExtras() {
            return this.f10129a.getExtras();
        }

        @Override // U1.C1642d.f
        public int getSource() {
            return this.f10129a.getSource();
        }

        public String toString() {
            return ryTuoS.ehExfXiWVXocUI + this.f10129a + "}";
        }
    }

    /* JADX INFO: renamed from: U1.d$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface f {
        ClipData a();

        Uri b();

        int c();

        ContentInfo d();

        Bundle getExtras();

        int getSource();
    }

    /* JADX INFO: renamed from: U1.d$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClipData f10130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f10133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f10134e;

        public g(C0284d c0284d) {
            this.f10130a = (ClipData) T1.f.g(c0284d.f10124a);
            this.f10131b = T1.f.c(c0284d.f10125b, 0, 5, "source");
            this.f10132c = T1.f.f(c0284d.f10126c, 1);
            this.f10133d = c0284d.f10127d;
            this.f10134e = c0284d.f10128e;
        }

        @Override // U1.C1642d.f
        public ClipData a() {
            return this.f10130a;
        }

        @Override // U1.C1642d.f
        public Uri b() {
            return this.f10133d;
        }

        @Override // U1.C1642d.f
        public int c() {
            return this.f10132c;
        }

        @Override // U1.C1642d.f
        public ContentInfo d() {
            return null;
        }

        @Override // U1.C1642d.f
        public Bundle getExtras() {
            return this.f10134e;
        }

        @Override // U1.C1642d.f
        public int getSource() {
            return this.f10131b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f10130a.getDescription());
            sb.append(", source=");
            sb.append(C1642d.g(this.f10131b));
            sb.append(", flags=");
            sb.append(C1642d.a(this.f10132c));
            if (this.f10133d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f10133d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f10134e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public C1642d(f fVar) {
        this.f10121a = fVar;
    }

    public static String a(int i8) {
        return (i8 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i8);
    }

    public static String g(int i8) {
        if (i8 == 0) {
            return "SOURCE_APP";
        }
        if (i8 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i8 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i8 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i8 != 4) {
            return i8 != 5 ? String.valueOf(i8) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static C1642d i(ContentInfo contentInfo) {
        return new C1642d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f10121a.a();
    }

    public Bundle c() {
        return this.f10121a.getExtras();
    }

    public int d() {
        return this.f10121a.c();
    }

    public Uri e() {
        return this.f10121a.b();
    }

    public int f() {
        return this.f10121a.getSource();
    }

    public ContentInfo h() {
        ContentInfo contentInfoD = this.f10121a.d();
        Objects.requireNonNull(contentInfoD);
        C1641c.a(contentInfoD);
        return contentInfoD;
    }

    public String toString() {
        return this.f10121a.toString();
    }

    /* JADX INFO: renamed from: U1.d$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f10123a;

        public b(ClipData clipData, int i8) {
            this.f10123a = AbstractC1643e.a(clipData, i8);
        }

        @Override // U1.C1642d.c
        public void a(Uri uri) {
            this.f10123a.setLinkUri(uri);
        }

        @Override // U1.C1642d.c
        public void b(int i8) {
            this.f10123a.setFlags(i8);
        }

        @Override // U1.C1642d.c
        public C1642d build() {
            return new C1642d(new e(this.f10123a.build()));
        }

        @Override // U1.C1642d.c
        public void setExtras(Bundle bundle) {
            this.f10123a.setExtras(bundle);
        }

        public b(C1642d c1642d) {
            AbstractC1645g.a();
            this.f10123a = AbstractC1644f.a(c1642d.h());
        }
    }

    /* JADX INFO: renamed from: U1.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0284d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClipData f10124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Uri f10127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f10128e;

        public C0284d(ClipData clipData, int i8) {
            this.f10124a = clipData;
            this.f10125b = i8;
        }

        @Override // U1.C1642d.c
        public void a(Uri uri) {
            this.f10127d = uri;
        }

        @Override // U1.C1642d.c
        public void b(int i8) {
            this.f10126c = i8;
        }

        @Override // U1.C1642d.c
        public C1642d build() {
            return new C1642d(new g(this));
        }

        @Override // U1.C1642d.c
        public void setExtras(Bundle bundle) {
            this.f10128e = bundle;
        }

        public C0284d(C1642d c1642d) {
            this.f10124a = c1642d.b();
            this.f10125b = c1642d.f();
            this.f10126c = c1642d.d();
            this.f10127d = c1642d.e();
            this.f10128e = c1642d.c();
        }
    }

    /* JADX INFO: renamed from: U1.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f10122a;

        public a(C1642d c1642d) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f10122a = new b(c1642d);
            } else {
                this.f10122a = new C0284d(c1642d);
            }
        }

        public C1642d a() {
            return this.f10122a.build();
        }

        public a b(Bundle bundle) {
            this.f10122a.setExtras(bundle);
            return this;
        }

        public a c(int i8) {
            this.f10122a.b(i8);
            return this;
        }

        public a d(Uri uri) {
            this.f10122a.a(uri);
            return this;
        }

        public a(ClipData clipData, int i8) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f10122a = new b(clipData, i8);
            } else {
                this.f10122a = new C0284d(clipData, i8);
            }
        }
    }
}
