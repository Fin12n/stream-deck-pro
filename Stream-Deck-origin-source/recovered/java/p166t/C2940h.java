package p166t;

import A.AbstractC0890p0;
import H.EnumC1002s;
import H.EnumC1004t;
import H.EnumC1006u;
import H.EnumC1008v;
import H.EnumC1010w;
import H.EnumC1012x;
import H.InterfaceC1014y;
import H.m1;
import H.r;
import I.h;
import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;

/* JADX INFO: renamed from: t.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2940h implements InterfaceC1014y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f33725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptureResult f33726b;

    public C2940h(m1 m1Var, CaptureResult captureResult) {
        this.f33725a = m1Var;
        this.f33726b = captureResult;
    }

    @Override // H.InterfaceC1014y
    public long a() {
        Long l8 = (Long) this.f33726b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l8 == null) {
            return -1L;
        }
        return l8.longValue();
    }

    @Override // H.InterfaceC1014y
    public m1 b() {
        return this.f33725a;
    }

    @Override // H.InterfaceC1014y
    public EnumC1012x c() {
        Integer num = (Integer) this.f33726b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC1012x.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return EnumC1012x.NONE;
        }
        if (iIntValue == 2) {
            return EnumC1012x.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return EnumC1012x.FIRED;
        }
        AbstractC0890p0.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC1012x.UNKNOWN;
    }

    @Override // H.InterfaceC1014y
    public void d(h.b bVar) {
        super.d(bVar);
        try {
            Integer num = (Integer) this.f33726b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC0890p0.l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l8 = (Long) this.f33726b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l8 != null) {
            bVar.f(l8.longValue());
        }
        Float f8 = (Float) this.f33726b.get(CaptureResult.LENS_APERTURE);
        if (f8 != null) {
            bVar.l(f8.floatValue());
        }
        Integer numValueOf = (Integer) this.f33726b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) this.f33726b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            bVar.k(numValueOf.intValue());
        }
        Float f9 = (Float) this.f33726b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f9 != null) {
            bVar.h(f9.floatValue());
        }
        Integer num3 = (Integer) this.f33726b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            h.c cVar = h.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = h.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // H.InterfaceC1014y
    public EnumC1010w e() {
        Integer num = (Integer) this.f33726b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC1010w.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC1010w.INACTIVE;
        }
        if (iIntValue == 1) {
            return EnumC1010w.METERING;
        }
        if (iIntValue == 2) {
            return EnumC1010w.CONVERGED;
        }
        if (iIntValue == 3) {
            return EnumC1010w.LOCKED;
        }
        AbstractC0890p0.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC1010w.UNKNOWN;
    }

    @Override // H.InterfaceC1014y
    public EnumC1008v f() {
        Integer num = (Integer) this.f33726b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return EnumC1008v.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC1008v.OFF;
            case 1:
                return EnumC1008v.AUTO;
            case 2:
                return EnumC1008v.INCANDESCENT;
            case 3:
                return EnumC1008v.FLUORESCENT;
            case 4:
                return EnumC1008v.WARM_FLUORESCENT;
            case 5:
                return EnumC1008v.DAYLIGHT;
            case 6:
                return EnumC1008v.CLOUDY_DAYLIGHT;
            case 7:
                return EnumC1008v.TWILIGHT;
            case 8:
                return EnumC1008v.SHADE;
            default:
                return EnumC1008v.UNKNOWN;
        }
    }

    @Override // H.InterfaceC1014y
    public EnumC1004t g() {
        Integer num = (Integer) this.f33726b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC1004t.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return EnumC1004t.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return EnumC1004t.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                AbstractC0890p0.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC1004t.UNKNOWN;
            }
        }
        return EnumC1004t.OFF;
    }

    @Override // H.InterfaceC1014y
    public EnumC1002s h() {
        Integer num = (Integer) this.f33726b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC1002s.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC1002s.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC1002s.CONVERGED;
            }
            if (iIntValue == 3) {
                return EnumC1002s.LOCKED;
            }
            if (iIntValue == 4) {
                return EnumC1002s.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                AbstractC0890p0.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC1002s.UNKNOWN;
            }
        }
        return EnumC1002s.SEARCHING;
    }

    @Override // H.InterfaceC1014y
    public CaptureResult i() {
        return this.f33726b;
    }

    @Override // H.InterfaceC1014y
    public r j() {
        Integer num = (Integer) this.f33726b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return r.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return r.OFF;
        }
        if (iIntValue == 1) {
            return r.ON;
        }
        if (iIntValue == 2) {
            return r.ON_AUTO_FLASH;
        }
        if (iIntValue == 3) {
            return r.f3180e;
        }
        if (iIntValue != 4) {
            return iIntValue != 5 ? r.UNKNOWN : r.ON_EXTERNAL_FLASH;
        }
        return r.ON_AUTO_FLASH_REDEYE;
    }

    @Override // H.InterfaceC1014y
    public EnumC1006u k() {
        Integer num = (Integer) this.f33726b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC1006u.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC1006u.INACTIVE;
            case 1:
            case 3:
                return EnumC1006u.SCANNING;
            case 2:
                return EnumC1006u.PASSIVE_FOCUSED;
            case 4:
                return EnumC1006u.LOCKED_FOCUSED;
            case 5:
                return EnumC1006u.LOCKED_NOT_FOCUSED;
            case 6:
                return EnumC1006u.PASSIVE_NOT_FOCUSED;
            default:
                AbstractC0890p0.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return EnumC1006u.UNKNOWN;
        }
    }

    public C2940h(CaptureResult captureResult) {
        this(m1.b(), captureResult);
    }
}
