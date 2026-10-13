package io.ktor.websocket;

import D6.z;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25736b;

    public s(String name, List<String> parameters) {
        kotlin.jvm.internal.t.g(name, "name");
        kotlin.jvm.internal.t.g(parameters, "parameters");
        this.f25735a = name;
        this.f25736b = parameters;
    }

    public final String a() {
        if (this.f25736b.isEmpty()) {
            return "";
        }
        return ", " + z.r0(this.f25736b, com.amazon.a.a.o.b.f.f16777a, null, null, 0, null, null, 62, null);
    }

    public String toString() {
        return this.f25735a + ' ' + a();
    }
}
