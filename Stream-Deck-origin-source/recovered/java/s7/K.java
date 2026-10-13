package s7;

import java.util.Iterator;
import r7.EnumC2878b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Y6.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f33189a;

        public a(Iterator it) {
            this.f33189a = it;
        }

        @Override // Y6.g
        public Iterator iterator() {
            return this.f33189a;
        }
    }

    public static final Y6.g a(r7.c json, InterfaceC2913u reader, p116m7.a deserializer, EnumC2878b format) {
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(reader, "reader");
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        kotlin.jvm.internal.t.g(format, "format");
        return Y6.l.d(new a(E.a(format, json, new W(reader, new char[16384]), deserializer)));
    }

    public static final void b(r7.c json, InterfaceC2914v writer, p116m7.k serializer, Object obj) {
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(writer, "writer");
        kotlin.jvm.internal.t.g(serializer, "serializer");
        new Y(writer, json, e0.OBJ, new r7.n[e0.b().size()]).n(serializer, obj);
    }
}
