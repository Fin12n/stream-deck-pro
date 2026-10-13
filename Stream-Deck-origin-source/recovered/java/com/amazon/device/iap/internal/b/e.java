package com.amazon.device.iap.internal.b;

import com.amazon.a.a.o.f;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f17145b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f17146a = new ConcurrentSkipListSet();

    public boolean a(String str) {
        if (f.a(str)) {
            return false;
        }
        return this.f17146a.remove(str);
    }

    public void b(String str) {
        if (f.a(str)) {
            return;
        }
        this.f17146a.add(str);
    }

    public static e a() {
        return f17145b;
    }
}
