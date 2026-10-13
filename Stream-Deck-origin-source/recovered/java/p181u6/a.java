package p181u6;

import X6.d;
import X6.m;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f34504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f34505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f34506c;

    public a(d type, Type reifiedType, m mVar) {
        t.g(type, "type");
        t.g(reifiedType, "reifiedType");
        this.f34504a = type;
        this.f34505b = reifiedType;
        this.f34506c = mVar;
    }

    public final m a() {
        return this.f34506c;
    }

    public final d b() {
        return this.f34504a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.c(this.f34504a, aVar.f34504a) && t.c(this.f34505b, aVar.f34505b) && t.c(this.f34506c, aVar.f34506c);
    }

    public int hashCode() {
        int iHashCode = ((this.f34504a.hashCode() * 31) + this.f34505b.hashCode()) * 31;
        m mVar = this.f34506c;
        return iHashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    public String toString() {
        return "TypeInfo(type=" + this.f34504a + ", reifiedType=" + this.f34505b + ", kotlinType=" + this.f34506c + ')';
    }

    public /* synthetic */ a(d dVar, Type type, m mVar, int i8, AbstractC2633k abstractC2633k) {
        this(dVar, type, (i8 & 4) != 0 ? null : mVar);
    }
}
