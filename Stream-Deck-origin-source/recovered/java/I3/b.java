package I3;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3772a = new b();

    public final String a(C3.b bVar, boolean z8) {
        String strB;
        if (bVar == null || (strB = bVar.b()) == null) {
            strB = "add";
        }
        return "faceplate_button(" + strB + (z8 ? "_selected" : "") + ")";
    }
}
