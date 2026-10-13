package V0;

import D6.C0933m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10406a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f10407b = new float[64];

    public final j a(String str) {
        int i8;
        char cCharAt;
        int i9;
        this.f10406a.clear();
        int length = str.length();
        int i10 = 0;
        while (i10 < length && t.h(str.charAt(i10), 32) <= 0) {
            i10++;
        }
        while (length > i10 && t.h(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i11 = 0;
        while (i10 < length) {
            while (true) {
                i8 = i10 + 1;
                cCharAt = str.charAt(i10);
                int i12 = cCharAt | ' ';
                if ((i12 - 97) * (i12 - 122) <= 0 && i12 != 101) {
                    break;
                }
                if (i8 >= length) {
                    cCharAt = 0;
                    break;
                }
                i10 = i8;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i11 = 0;
                    while (true) {
                        if (i8 >= length || t.h(str.charAt(i8), 32) > 0) {
                            long jA = b.a(str, i8, length);
                            i9 = (int) (jA >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA & 4294967295L));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.f10407b;
                                int i13 = i11 + 1;
                                fArr[i11] = fIntBitsToFloat;
                                if (i13 >= fArr.length) {
                                    float[] fArr2 = new float[i13 * 2];
                                    this.f10407b = fArr2;
                                    C0933m.f(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i11 = i13;
                            }
                            while (i9 < length && str.charAt(i9) == ',') {
                                i9++;
                            }
                            if (i9 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i8 = i9;
                        } else {
                            i8++;
                        }
                    }
                    i8 = i9;
                }
                i.a(cCharAt, this.f10406a, this.f10407b, i11);
            }
            i10 = i8;
        }
        return this;
    }

    public final List b() {
        return this.f10406a;
    }
}
