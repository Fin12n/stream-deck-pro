package androidx.compose.ui.input.pointer;

import Q6.o;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class SuspendPointerInputElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f14733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f14734e;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, o oVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : obj, (i8 & 2) != 0 ? null : obj2, (i8 & 4) != 0 ? null : objArr, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!t.c(this.f14731b, suspendPointerInputElement.f14731b) || !t.c(this.f14732c, suspendPointerInputElement.f14732c)) {
            return false;
        }
        Object[] objArr = this.f14733d;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f14733d;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f14733d != null) {
            return false;
        }
        return true;
    }

    @Override // p056g1.U
    public int hashCode() {
        Object obj = this.f14731b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f14732c;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f14733d;
        return iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public p011b1.U k() {
        return new p011b1.U(this.f14734e);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(p011b1.U u8) {
        u8.i2(this.f14734e);
    }

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, o oVar) {
        this.f14731b = obj;
        this.f14732c = obj2;
        this.f14733d = objArr;
        this.f14734e = oVar;
    }
}
