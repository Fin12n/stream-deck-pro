package p058g3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f23712c = new e("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f23714b;

    public e(String... strArr) {
        this.f23713a = Arrays.asList(strArr);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f23713a.add(str);
        return eVar;
    }

    public final boolean b() {
        List list = this.f23713a;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    public boolean c(String str, int i8) {
        if (i8 >= this.f23713a.size()) {
            return false;
        }
        boolean z8 = i8 == this.f23713a.size() - 1;
        String str2 = (String) this.f23713a.get(i8);
        if (!str2.equals("**")) {
            return (z8 || (i8 == this.f23713a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z8 && ((String) this.f23713a.get(i8 + 1)).equals(str)) {
            return i8 == this.f23713a.size() + (-2) || (i8 == this.f23713a.size() + (-3) && b());
        }
        if (z8) {
            return true;
        }
        int i9 = i8 + 1;
        if (i9 < this.f23713a.size() - 1) {
            return false;
        }
        return ((String) this.f23713a.get(i9)).equals(str);
    }

    public f d() {
        return this.f23714b;
    }

    public int e(String str, int i8) {
        if (f(str)) {
            return 0;
        }
        if (((String) this.f23713a.get(i8)).equals("**")) {
            return (i8 != this.f23713a.size() - 1 && ((String) this.f23713a.get(i8 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f23713a.equals(eVar.f23713a)) {
                return false;
            }
            f fVar = this.f23714b;
            f fVar2 = eVar.f23714b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String str) {
        return "__container".equals(str);
    }

    public boolean g(String str, int i8) {
        if (f(str)) {
            return true;
        }
        if (i8 >= this.f23713a.size()) {
            return false;
        }
        return ((String) this.f23713a.get(i8)).equals(str) || ((String) this.f23713a.get(i8)).equals("**") || ((String) this.f23713a.get(i8)).equals("*");
    }

    public boolean h(String str, int i8) {
        return "__container".equals(str) || i8 < this.f23713a.size() - 1 || ((String) this.f23713a.get(i8)).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f23713a.hashCode() * 31;
        f fVar = this.f23714b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f23714b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f23713a);
        sb.append(",resolved=");
        sb.append(this.f23714b != null);
        sb.append('}');
        return sb.toString();
    }

    public e(e eVar) {
        this.f23713a = new ArrayList(eVar.f23713a);
        this.f23714b = eVar.f23714b;
    }
}
