package K5;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.ktor.websocket.a f4716a = new io.ktor.websocket.a(io.ktor.websocket.a.EnumC0581a.INTERNAL_ERROR, "Client failure");

    public static final boolean c(io.ktor.websocket.a aVar) {
        io.ktor.websocket.a.EnumC0581a enumC0581aA = io.ktor.websocket.a.EnumC0581a.f25580b.a(aVar.a());
        return enumC0581aA == null || enumC0581aA == io.ktor.websocket.a.EnumC0581a.CLOSED_ABNORMALLY;
    }
}
