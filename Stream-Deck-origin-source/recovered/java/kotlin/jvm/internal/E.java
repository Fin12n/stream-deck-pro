package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E extends AbstractC2628f implements X6.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28774a;

    public E() {
        this.f28774a = false;
    }

    @Override // kotlin.jvm.internal.AbstractC2628f
    public X6.c compute() {
        return this.f28774a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof E) {
            E e8 = (E) obj;
            return getOwner().equals(e8.getOwner()) && getName().equals(e8.getName()) && getSignature().equals(e8.getSignature()) && t.c(getBoundReceiver(), e8.getBoundReceiver());
        }
        if (obj instanceof X6.l) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.AbstractC2628f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public X6.l getReflected() {
        if (this.f28774a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (X6.l) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        X6.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public E(Object obj) {
        super(obj);
        this.f28774a = false;
    }

    public E(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f28774a = (i8 & 2) == 2;
    }
}
