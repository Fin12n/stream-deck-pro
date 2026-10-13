package X6;

import D6.C0934n;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements ParameterizedType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f12058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f12059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f12060c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12061a = new a();

        public a() {
            super(1, r.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type p8) {
            t.g(p8, "p0");
            return r.g(p8);
        }
    }

    public q(Class<?> rawType, Type type, List<? extends Type> typeArguments) {
        t.g(rawType, "rawType");
        t.g(typeArguments, "typeArguments");
        this.f12058a = rawType;
        this.f12059b = type;
        this.f12060c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return t.c(this.f12058a, parameterizedType.getRawType()) && t.c(this.f12059b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f12060c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f12059b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f12058a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() throws IOException {
        StringBuilder sb = new StringBuilder();
        Type type = this.f12059b;
        if (type != null) {
            sb.append(r.g(type));
            sb.append("$");
            sb.append(this.f12058a.getSimpleName());
        } else {
            sb.append(r.g(this.f12058a));
        }
        Type[] typeArr = this.f12060c;
        if (!(typeArr.length == 0)) {
            C0934n.b0(typeArr, sb, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : a.f12061a);
        }
        String string = sb.toString();
        t.f(string, "toString(...)");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.f12058a.hashCode();
        Type type = this.f12059b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
