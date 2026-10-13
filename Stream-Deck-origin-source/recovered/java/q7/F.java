package q7;

import D6.C0934n;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f32021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o7.f f32022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C6.j f32023c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f32025b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f32025b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o7.f invoke() {
            o7.f fVar = F.this.f32022b;
            return fVar == null ? F.this.c(this.f32025b) : fVar;
        }
    }

    public F(String serialName, Enum<Object>[] values) {
        kotlin.jvm.internal.t.g(serialName, "serialName");
        kotlin.jvm.internal.t.g(values, "values");
        this.f32021a = values;
        this.f32023c = C6.k.b(new a(serialName));
    }

    public final o7.f c(String str) {
        E e8 = new E(str, this.f32021a.length);
        for (Enum r8 : this.f32021a) {
            C2874y0.m(e8, r8.name(), false, 2, null);
        }
        return e8;
    }

    @Override // p116m7.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        int iY = decoder.y(getDescriptor());
        if (iY >= 0) {
            Enum[] enumArr = this.f32021a;
            if (iY < enumArr.length) {
                return enumArr[iY];
            }
        }
        throw new p116m7.j(iY + " is not among valid " + getDescriptor().a() + " enum values, values size is " + this.f32021a.length);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return (o7.f) this.f32023c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f fVar, Enum value) {
        kotlin.jvm.internal.t.g(fVar, SZCvugJaXc.fMJwBIPhAYzZe);
        kotlin.jvm.internal.t.g(value, "value");
        int iY = C0934n.Y(this.f32021a, value);
        if (iY != -1) {
            fVar.o(getDescriptor(), iY);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().a());
        sb.append(", must be one of ");
        String string = Arrays.toString(this.f32021a);
        kotlin.jvm.internal.t.f(string, "toString(...)");
        sb.append(string);
        throw new p116m7.j(sb.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(String serialName, Enum<Object>[] values, o7.f descriptor) {
        this(serialName, values);
        kotlin.jvm.internal.t.g(serialName, "serialName");
        kotlin.jvm.internal.t.g(values, "values");
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        this.f32022b = descriptor;
    }
}
