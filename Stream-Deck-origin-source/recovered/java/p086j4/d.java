package p086j4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f28305c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f28307b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28308a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f28309b = new ArrayList();

        public d a() {
            return new d(this.f28308a, Collections.unmodifiableList(this.f28309b));
        }

        public a b(List list) {
            this.f28309b = list;
            return this;
        }

        public a c(String str) {
            this.f28308a = str;
            return this;
        }
    }

    public d(String str, List list) {
        this.f28306a = str;
        this.f28307b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f28307b;
    }

    public String b() {
        return this.f28306a;
    }
}
