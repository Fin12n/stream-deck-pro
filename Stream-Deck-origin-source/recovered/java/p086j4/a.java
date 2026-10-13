package p086j4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p059g4.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f28279e = new C0614a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f28280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f28281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f28282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28283d;

    /* JADX INFO: renamed from: j4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0614a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f28284a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f28285b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f28286c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f28287d = "";

        public C0614a a(d dVar) {
            this.f28285b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f28284a, Collections.unmodifiableList(this.f28285b), this.f28286c, this.f28287d);
        }

        public C0614a c(String str) {
            this.f28287d = str;
            return this;
        }

        public C0614a d(b bVar) {
            this.f28286c = bVar;
            return this;
        }

        public C0614a e(f fVar) {
            this.f28284a = fVar;
            return this;
        }
    }

    public a(f fVar, List list, b bVar, String str) {
        this.f28280a = fVar;
        this.f28281b = list;
        this.f28282c = bVar;
        this.f28283d = str;
    }

    public static C0614a e() {
        return new C0614a();
    }

    public String a() {
        return this.f28283d;
    }

    public b b() {
        return this.f28282c;
    }

    public List c() {
        return this.f28281b;
    }

    public f d() {
        return this.f28280a;
    }

    public byte[] f() {
        return h.a(this);
    }
}
