package V3;

import D6.C0934n;
import D6.iIQ.BmWxZhjGfw;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10690a;

    public i(List<? extends j> list) {
        t.g(list, BmWxZhjGfw.gUX);
        this.f10690a = list;
    }

    public final List a() {
        return this.f10690a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && t.c(this.f10690a, ((i) obj).f10690a);
    }

    public int hashCode() {
        return this.f10690a.hashCode();
    }

    public String toString() {
        return "TrackableEvent(serviceEvents=" + this.f10690a + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(j... events) {
        this((List<? extends j>) C0934n.r0(events));
        t.g(events, "events");
    }
}
