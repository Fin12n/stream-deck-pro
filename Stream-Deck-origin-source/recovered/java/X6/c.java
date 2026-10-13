package X6;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface c extends b {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    m getReturnType();

    List getTypeParameters();

    p getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();
}
