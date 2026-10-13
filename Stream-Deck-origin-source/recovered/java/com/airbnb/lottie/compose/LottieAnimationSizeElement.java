package com.airbnb.lottie.compose;

import kotlin.jvm.internal.t;
import p040e3.f;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class LottieAnimationSizeElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16295c;

    public LottieAnimationSizeElement(int i8, int i9) {
        this.f16294b = i8;
        this.f16295c = i9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) obj;
        return this.f16294b == lottieAnimationSizeElement.f16294b && this.f16295c == lottieAnimationSizeElement.f16295c;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (Integer.hashCode(this.f16294b) * 31) + Integer.hashCode(this.f16295c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public f k() {
        return new f(this.f16294b, this.f16295c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(f node) {
        t.g(node, "node");
        node.e2(this.f16294b);
        node.d2(this.f16295c);
    }

    public String toString() {
        return "LottieAnimationSizeElement(width=" + this.f16294b + ", height=" + this.f16295c + ")";
    }
}
