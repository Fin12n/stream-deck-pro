package r7;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@p116m7.i(with = v.class)
public final class u extends y {
    public static final u INSTANCE = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f32590a = "null";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C6.j f32591b = C6.k.a(C6.l.PUBLICATION, a.f32592a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32592a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p116m7.b invoke() {
            return v.f32593a;
        }
    }

    public u() {
        super(null);
    }

    @Override // r7.y
    public String c() {
        return f32590a;
    }

    @Override // r7.y
    public boolean m() {
        return false;
    }

    public final /* synthetic */ p116m7.b o() {
        return (p116m7.b) f32591b.getValue();
    }

    public final p116m7.b serializer() {
        return o();
    }
}
