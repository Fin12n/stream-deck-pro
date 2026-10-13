package r7;

import Z.JTT.ryTuoS;
import java.io.InputStream;
import s7.C2915w;
import s7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B {
    public static /* synthetic */ Y6.g b(c cVar, InputStream inputStream, p116m7.a aVar, EnumC2878b enumC2878b, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            enumC2878b = EnumC2878b.AUTO_DETECT;
        }
        return a(cVar, inputStream, aVar, enumC2878b);
    }

    public static final Y6.g a(c cVar, InputStream stream, p116m7.a deserializer, EnumC2878b format) {
        kotlin.jvm.internal.t.g(cVar, ryTuoS.nnjViv);
        kotlin.jvm.internal.t.g(stream, "stream");
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        kotlin.jvm.internal.t.g(format, "format");
        return K.a(cVar, new C2915w(stream), deserializer, format);
    }
}
