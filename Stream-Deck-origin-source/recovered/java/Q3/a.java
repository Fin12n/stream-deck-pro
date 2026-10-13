package Q3;

import com.elgato.vsd2.Messages;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9193f;

    public a(int i8, String str, String str2, String str3, Object obj, boolean z8) {
        this.f9188a = i8;
        this.f9189b = str;
        this.f9190c = str2;
        this.f9191d = str3;
        this.f9192e = obj;
        this.f9193f = z8;
    }

    public static /* synthetic */ a c(a aVar, int i8, String str, String str2, String str3, Object obj, boolean z8, int i9, Object obj2) {
        if ((i9 & 1) != 0) {
            i8 = aVar.f9188a;
        }
        if ((i9 & 2) != 0) {
            str = aVar.f9189b;
        }
        if ((i9 & 4) != 0) {
            str2 = aVar.f9190c;
        }
        if ((i9 & 8) != 0) {
            str3 = aVar.f9191d;
        }
        if ((i9 & 16) != 0) {
            obj = aVar.f9192e;
        }
        if ((i9 & 32) != 0) {
            z8 = aVar.f9193f;
        }
        Object obj3 = obj;
        boolean z9 = z8;
        return aVar.b(i8, str, str2, str3, obj3, z9);
    }

    public final a a() {
        return c(this, 0, null, null, null, null, false, 49, null);
    }

    public final a b(int i8, String str, String str2, String str3, Object obj, boolean z8) {
        return new a(i8, str, str2, str3, obj, z8);
    }

    public final String d() {
        return this.f9191d;
    }

    public final Object e() {
        return this.f9192e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9188a == aVar.f9188a && t.c(this.f9189b, aVar.f9189b) && t.c(this.f9190c, aVar.f9190c) && t.c(this.f9191d, aVar.f9191d) && t.c(this.f9192e, aVar.f9192e) && this.f9193f == aVar.f9193f;
    }

    public final int f() {
        return this.f9188a;
    }

    public final String g() {
        return this.f9190c;
    }

    public final String h() {
        return this.f9189b;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f9188a) * 31;
        String str = this.f9189b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9190c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9191d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.f9192e;
        return ((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + Boolean.hashCode(this.f9193f);
    }

    public final boolean i() {
        return this.f9193f;
    }

    public final a j(Messages.Action action) {
        t.g(action, "action");
        String title = action.getTitle();
        t.d(title);
        String str = title.length() > 0 ? title : null;
        String name = action.getName();
        t.d(name);
        String str2 = name.length() > 0 ? name : null;
        String category = action.getCategory();
        t.d(category);
        return c(this, 0, str, str2, category.length() > 0 ? category : null, null, false, 49, null);
    }

    public String toString() {
        return "Key(index=" + this.f9188a + ", title=" + this.f9189b + ", name=" + this.f9190c + ", category=" + this.f9191d + ", image=" + this.f9192e + ", isLocked=" + this.f9193f + ")";
    }

    public /* synthetic */ a(int i8, String str, String str2, String str3, Object obj, boolean z8, int i9, AbstractC2633k abstractC2633k) {
        this(i8, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? null : str2, (i9 & 8) != 0 ? null : str3, (i9 & 16) != 0 ? null : obj, (i9 & 32) != 0 ? true : z8);
    }
}
