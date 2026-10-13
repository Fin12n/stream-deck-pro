package p191w0;

import D6.z;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class X implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f35782a;

    public X(Map<Object, Float> map) {
        this.f35782a = map;
    }

    @Override // p191w0.D
    public float a() {
        Float fY0 = z.y0(this.f35782a.values());
        if (fY0 != null) {
            return fY0.floatValue();
        }
        return Float.NaN;
    }

    @Override // p191w0.D
    public Object b(float f8, boolean z8) {
        Object next;
        Iterator it = this.f35782a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f9 = z8 ? fFloatValue - f8 : f8 - fFloatValue;
                if (f9 < 0.0f) {
                    f9 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f10 = z8 ? fFloatValue2 - f8 : f8 - fFloatValue2;
                    if (f10 < 0.0f) {
                        f10 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f9, f10) > 0) {
                        next = next2;
                        f9 = f10;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // p191w0.D
    public Object c(float f8) {
        Object next;
        Iterator it = this.f35782a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f8 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(f8 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // p191w0.D
    public float d(Object obj) {
        Float f8 = (Float) this.f35782a.get(obj);
        if (f8 != null) {
            return f8.floatValue();
        }
        return Float.NaN;
    }

    @Override // p191w0.D
    public boolean e(Object obj) {
        return this.f35782a.containsKey(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X) {
            return t.c(this.f35782a, ((X) obj).f35782a);
        }
        return false;
    }

    @Override // p191w0.D
    public float f() {
        Float fW0 = z.w0(this.f35782a.values());
        if (fW0 != null) {
            return fW0.floatValue();
        }
        return Float.NaN;
    }

    public int hashCode() {
        return this.f35782a.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.f35782a + ')';
    }
}
