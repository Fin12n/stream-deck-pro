package p219z4;

import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: z4.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3206o {

    /* JADX INFO: renamed from: z4.o$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f39242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f39243b;

        public /* synthetic */ a(Object obj, S s8) {
            AbstractC3207p.k(obj);
            this.f39243b = obj;
            this.f39242a = new ArrayList();
        }

        public a a(String str, Object obj) {
            AbstractC3207p.k(str);
            this.f39242a.add(str + f.f16778b + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f39243b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f39242a.size();
            for (int i8 = 0; i8 < size; i8++) {
                sb.append((String) this.f39242a.get(i8));
                if (i8 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
