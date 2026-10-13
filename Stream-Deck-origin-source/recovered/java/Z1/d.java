package Z1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12845a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        Uri a();

        Uri b();

        void c();

        Object d();

        ClipDescription getDescription();
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f12845a = new a(uri, clipDescription, uri2);
    }

    public static d f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(new a(obj));
    }

    public Uri a() {
        return this.f12845a.a();
    }

    public ClipDescription b() {
        return this.f12845a.getDescription();
    }

    public Uri c() {
        return this.f12845a.b();
    }

    public void d() {
        this.f12845a.c();
    }

    public Object e() {
        return this.f12845a.d();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputContentInfo f12846a;

        public a(Object obj) {
            this.f12846a = (InputContentInfo) obj;
        }

        @Override // Z1.d.b
        public Uri a() {
            return this.f12846a.getContentUri();
        }

        @Override // Z1.d.b
        public Uri b() {
            return this.f12846a.getLinkUri();
        }

        @Override // Z1.d.b
        public void c() {
            this.f12846a.requestPermission();
        }

        @Override // Z1.d.b
        public Object d() {
            return this.f12846a;
        }

        @Override // Z1.d.b
        public ClipDescription getDescription() {
            return this.f12846a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f12846a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public d(b bVar) {
        this.f12845a = bVar;
    }
}
