package Q1;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9122f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f9117a = (String) T1.f.g(str);
        this.f9118b = (String) T1.f.g(str2);
        this.f9119c = (String) T1.f.g(str3);
        this.f9120d = (List) T1.f.g(list);
        this.f9121e = 0;
        this.f9122f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f9120d;
    }

    public int c() {
        return this.f9121e;
    }

    public String d() {
        return this.f9122f;
    }

    public String e() {
        return this.f9117a;
    }

    public String f() {
        return this.f9118b;
    }

    public String g() {
        return this.f9119c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f9117a + ", mProviderPackage: " + this.f9118b + ", mQuery: " + this.f9119c + ", mCertificates:");
        for (int i8 = 0; i8 < this.f9120d.size(); i8++) {
            sb.append(" [");
            List list = (List) this.f9120d.get(i8);
            for (int i9 = 0; i9 < list.size(); i9++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i9), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f9121e);
        return sb.toString();
    }

    public e(String str, String str2, String str3, int i8) {
        this.f9117a = (String) T1.f.g(str);
        this.f9118b = (String) T1.f.g(str2);
        this.f9119c = (String) T1.f.g(str3);
        this.f9120d = null;
        T1.f.a(i8 != 0);
        this.f9121e = i8;
        this.f9122f = a(str, str2, str3);
    }
}
