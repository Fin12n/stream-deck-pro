package A;

import H.InterfaceC0978f0;
import H.InterfaceC0982h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC0978f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f77a;

        public a(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f77a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // H.InterfaceC0978f0
        public List a() {
            return this.f77a;
        }
    }

    public static InterfaceC0978f0 a(InterfaceC0982h0... interfaceC0982h0Arr) {
        return new a(Arrays.asList(interfaceC0982h0Arr));
    }

    public static InterfaceC0978f0 b() {
        return a(new InterfaceC0982h0.a());
    }
}
