package P6;

import X6.d;
import kotlin.jvm.internal.InterfaceC2630h;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final Class a(d dVar) {
        t.g(dVar, "<this>");
        Class clsH = ((InterfaceC2630h) dVar).h();
        t.e(clsH, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsH;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class b(d dVar) {
        t.g(dVar, "<this>");
        Class clsH = ((InterfaceC2630h) dVar).h();
        if (!clsH.isPrimitive()) {
            t.e(clsH, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsH;
        }
        String name = clsH.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsH = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsH = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsH = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsH = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsH = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsH = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsH = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsH = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsH = Short.class;
                }
                break;
        }
        t.e(clsH, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsH;
    }

    public static final d c(Class cls) {
        t.g(cls, "<this>");
        return K.b(cls);
    }
}
