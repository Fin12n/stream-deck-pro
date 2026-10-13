package M3;

import C6.G;
import com.elgato.vsd2.Messages;
import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final Object a(k kVar, Messages.ClientMessage.a aVar, G6.d dVar) {
        GeneratedMessageLite generatedMessageLiteBuild = aVar.build();
        kotlin.jvm.internal.t.f(generatedMessageLiteBuild, "build(...)");
        Object objK1 = kVar.k1((Messages.ClientMessage) generatedMessageLiteBuild, dVar);
        return objK1 == H6.c.f() ? objK1 : G.f1419a;
    }
}
