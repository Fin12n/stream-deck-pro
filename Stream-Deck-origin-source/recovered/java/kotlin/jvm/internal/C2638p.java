package kotlin.jvm.internal;

import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: renamed from: kotlin.jvm.internal.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2638p extends AbstractC2628f implements InterfaceC2637o, X6.h {
    private final int arity;
    private final int flags;

    public C2638p(int i8) {
        this(i8, AbstractC2628f.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC2628f
    public X6.c computeReflected() {
        return K.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2638p) {
            C2638p c2638p = (C2638p) obj;
            return getName().equals(c2638p.getName()) && getSignature().equals(c2638p.getSignature()) && this.flags == c2638p.flags && this.arity == c2638p.arity && t.c(getBoundReceiver(), c2638p.getBoundReceiver()) && t.c(getOwner(), c2638p.getOwner());
        }
        if (obj instanceof X6.h) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC2637o
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // X6.h
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // X6.h
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // X6.h
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // X6.h
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // X6.h
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public C2638p(int i8, Object obj) {
        this(i8, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC2628f
    public X6.h getReflected() {
        return (X6.h) super.getReflected();
    }

    public C2638p(int i8, Object obj, Class cls, String str, String str2, int i9) {
        super(obj, cls, str, str2, (i9 & 1) == 1);
        this.arity = i8;
        this.flags = i9 >> 1;
    }

    public String toString() {
        X6.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if (QhsKALGiniuQ.KGvLMIpyxQ.equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
