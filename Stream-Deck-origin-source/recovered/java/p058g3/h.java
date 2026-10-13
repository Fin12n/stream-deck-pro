package p058g3;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23719c;

    public h(String str, float f8, float f9) {
        this.f23717a = str;
        this.f23719c = f9;
        this.f23718b = f8;
    }

    public boolean a(String str) {
        if (this.f23717a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f23717a.endsWith("\r")) {
            String str2 = this.f23717a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
