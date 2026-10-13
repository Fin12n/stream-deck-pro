package p197w6;

import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class c extends MalformedInputException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String message) {
        super(0);
        t.g(message, "message");
        this.f37136a = message;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public String getMessage() {
        return this.f37136a;
    }
}
