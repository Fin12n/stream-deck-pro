package defpackage;

import com.elgato.streamdeck.vsd2.KnownHost;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C0326a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f12991b;

        static {
            int[] iArr = new int[KnownHost.Device.KeypadOrientationOption.values().length];
            try {
                iArr[KnownHost.Device.KeypadOrientationOption.DYNAMIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KnownHost.Device.KeypadOrientationOption.FIXED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12990a = iArr;
            int[] iArr2 = new int[KnownHost.Device.Appearance.values().length];
            try {
                iArr2[KnownHost.Device.Appearance.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[KnownHost.Device.Appearance.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[KnownHost.Device.Appearance.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f12991b = iArr2;
        }
    }

    public static final String a(Throwable th) throws IllegalAccessException {
        Field field;
        Method method;
        Object objInvoke;
        t.g(th, "<this>");
        while (th != null) {
            Field[] declaredFields = th.getClass().getDeclaredFields();
            t.f(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i9];
                if (t.c(field.getName(), "errorCode") || t.c(field.getName(), "code")) {
                    break;
                }
                i9++;
            }
            if (field != null) {
                field.setAccessible(true);
                Object obj = field.get(th);
                if (obj != null) {
                    return obj.toString();
                }
            }
            Method[] methods = th.getClass().getMethods();
            t.f(methods, "getMethods(...)");
            int length2 = methods.length;
            while (true) {
                if (i8 >= length2) {
                    method = null;
                    break;
                }
                method = methods[i8];
                if (t.c(method.getName(), "getErrorCode") || t.c(method.getName(), "errorCode")) {
                    break;
                }
                i8++;
            }
            if (method != null && (objInvoke = method.invoke(th, null)) != null) {
                return objInvoke.toString();
            }
            th = th.getCause();
        }
        return null;
    }

    public static final String b(Throwable th) {
        t.g(th, "<this>");
        return th.getClass().getSimpleName();
    }

    public static final String c(KnownHost.Device device) {
        t.g(device, "<this>");
        if (device.getIsCustomLayout()) {
            return "Custom";
        }
        if (device.getKeypadColumns() == 8 && device.getKeypadRows() == 4) {
            return "XL";
        }
        if (device.getKeypadColumns() == 5 && device.getKeypadRows() == 3) {
            return "Classic";
        }
        return (device.getKeypadColumns() == 3 && device.getKeypadRows() == 2) ? "Mini" : "-1";
    }

    public static final String d(KnownHost.Device.Appearance appearance) {
        t.g(appearance, "<this>");
        int i8 = C0326a.f12991b[appearance.ordinal()];
        if (i8 == 1) {
            return "Light";
        }
        if (i8 != 2) {
            return i8 != 3 ? "-1" : "System";
        }
        return "Dark";
    }

    public static final String e(KnownHost.Device.KeypadOrientationOption keypadOrientationOption) {
        t.g(keypadOrientationOption, "<this>");
        int i8 = C0326a.f12990a[keypadOrientationOption.ordinal()];
        if (i8 != 1) {
            return i8 != 2 ? "-1" : "None";
        }
        return "Dynamic";
    }
}
