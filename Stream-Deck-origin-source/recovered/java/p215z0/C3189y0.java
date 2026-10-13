package p215z0;

import C6.C0920i;
import D6.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: z0.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3189y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38957a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3189y0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a(int i8) {
        if (!this.f38957a.isEmpty()) {
            if (((Number) this.f38957a.get(0)).intValue() == i8) {
                return;
            }
            List list = this.f38957a;
            if (((Number) list.get(list.size() - 1)).intValue() == i8) {
                return;
            }
        }
        int size = this.f38957a.size();
        this.f38957a.add(Integer.valueOf(i8));
        while (size > 0) {
            int i9 = ((size + 1) >>> 1) - 1;
            int iIntValue = ((Number) this.f38957a.get(i9)).intValue();
            if (i8 <= iIntValue) {
                break;
            }
            this.f38957a.set(size, Integer.valueOf(iIntValue));
            size = i9;
        }
        this.f38957a.set(size, Integer.valueOf(i8));
    }

    public final boolean b() {
        return !this.f38957a.isEmpty();
    }

    public final int c() {
        return ((Number) z.i0(this.f38957a)).intValue();
    }

    public final int d() {
        int iIntValue;
        if (!(this.f38957a.size() > 0)) {
            AbstractC3169o.v("Set is empty");
            throw new C0920i();
        }
        int iIntValue2 = ((Number) this.f38957a.get(0)).intValue();
        while (!this.f38957a.isEmpty() && ((Number) this.f38957a.get(0)).intValue() == iIntValue2) {
            List list = this.f38957a;
            list.set(0, z.t0(list));
            List list2 = this.f38957a;
            list2.remove(list2.size() - 1);
            int size = this.f38957a.size();
            int size2 = this.f38957a.size() >>> 1;
            int i8 = 0;
            while (i8 < size2) {
                int iIntValue3 = ((Number) this.f38957a.get(i8)).intValue();
                int i9 = (i8 + 1) * 2;
                int i10 = i9 - 1;
                int iIntValue4 = ((Number) this.f38957a.get(i10)).intValue();
                if (i9 < size && (iIntValue = ((Number) this.f38957a.get(i9)).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    this.f38957a.set(i8, Integer.valueOf(iIntValue));
                    this.f38957a.set(i9, Integer.valueOf(iIntValue3));
                    i8 = i9;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    this.f38957a.set(i8, Integer.valueOf(iIntValue4));
                    this.f38957a.set(i10, Integer.valueOf(iIntValue3));
                    i8 = i10;
                }
            }
        }
        return iIntValue2;
    }

    public C3189y0(List<Integer> list) {
        this.f38957a = list;
    }

    public /* synthetic */ C3189y0(List list, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? new ArrayList() : list);
    }
}
