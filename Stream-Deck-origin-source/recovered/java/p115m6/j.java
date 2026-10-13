package p115m6;

import R0.pkXL.Oitvkwcwn;
import Z6.v;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30083b;

    public final String a() {
        return this.f30082a;
    }

    public boolean equals(Object obj) {
        String str;
        j jVar = obj instanceof j ? (j) obj : null;
        return (jVar == null || (str = jVar.f30082a) == null || !v.v(str, this.f30082a, true)) ? false : true;
    }

    public int hashCode() {
        return this.f30083b;
    }

    public String toString() {
        return this.f30082a;
    }

    public j(String content) {
        t.g(content, "content");
        this.f30082a = content;
        String lowerCase = content.toLowerCase(Locale.ROOT);
        t.f(lowerCase, Oitvkwcwn.SuQhHsKQPrtIpze);
        this.f30083b = lowerCase.hashCode();
    }
}
