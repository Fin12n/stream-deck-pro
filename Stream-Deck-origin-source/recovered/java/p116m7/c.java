package p116m7;

import D6.C0937q;
import Z.JTT.ryTuoS;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30126a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List<String> missingFields, String str, Throwable th) {
        super(str, th);
        t.g(missingFields, "missingFields");
        this.f30126a = missingFields;
    }

    public final List a() {
        return this.f30126a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(List<String> missingFields, String serialName) {
        String str;
        t.g(missingFields, "missingFields");
        t.g(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + missingFields.get(0) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = ryTuoS.ciXcXnlH + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String missingField, String serialName) {
        this(C0937q.e(missingField), "Field '" + missingField + "' is required for type with serial name '" + serialName + "', but it was missing", null);
        t.g(missingField, "missingField");
        t.g(serialName, "serialName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String missingField) {
        this(C0937q.e(missingField), "Field '" + missingField + "' is required, but it was missing", null);
        t.g(missingField, "missingField");
    }
}
