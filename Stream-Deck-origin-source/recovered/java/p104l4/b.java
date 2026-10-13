package p104l4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Object a(int i8, Object obj, a aVar, c cVar) {
        Object objApply;
        if (i8 < 1) {
            return aVar.apply(obj);
        }
        do {
            objApply = aVar.apply(obj);
            obj = cVar.a(obj, objApply);
            if (obj == null) {
                break;
            }
            i8--;
        } while (i8 >= 1);
        return objApply;
    }
}
