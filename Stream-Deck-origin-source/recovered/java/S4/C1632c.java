package S4;

/* JADX INFO: renamed from: S4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1632c extends IllegalStateException {
    public C1632c(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(k kVar) {
        String strConcat;
        if (!kVar.k()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excH = kVar.h();
        if (excH != null) {
            strConcat = "failure";
        } else if (kVar.l()) {
            strConcat = "result ".concat(String.valueOf(kVar.i()));
        } else {
            strConcat = kVar.j() ? "cancellation" : "unknown issue";
        }
        return new C1632c("Complete with: ".concat(strConcat), excH);
    }
}
