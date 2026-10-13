package p211y4;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import p195w4.d;
import p219z4.AbstractC3206o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3101b f38291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f38292b;

    public /* synthetic */ D(C3101b c3101b, d dVar, C c8) {
        this.f38291a = c3101b;
        this.f38292b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof D)) {
            D d8 = (D) obj;
            if (AbstractC3206o.a(this.f38291a, d8.f38291a) && AbstractC3206o.a(this.f38292b, d8.f38292b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3206o.b(this.f38291a, this.f38292b);
    }

    public final String toString() {
        return AbstractC3206o.c(this).a(SubscriberAttributeKt.JSON_NAME_KEY, this.f38291a).a("feature", this.f38292b).toString();
    }
}
