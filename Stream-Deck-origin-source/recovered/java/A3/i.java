package A3;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f592a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f593b = o7.i.a(com.amazon.a.a.o.b.f16740o, o7.e.i.f30979a);

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h deserialize(p7.e decoder) {
        t.g(decoder, "decoder");
        String strS = decoder.s();
        int iHashCode = strS.hashCode();
        if (iHashCode != -1636482787) {
            if (iHashCode != -1319484683) {
                if (iHashCode == 318720611 && strS.equals("CONSUMABLE")) {
                    return h.CONSUMABLE;
                }
            } else if (strS.equals("ENTITLED")) {
                return h.ENTITLED;
            }
        } else if (strS.equals("SUBSCRIPTION")) {
            return h.SUBSCRIPTION;
        }
        throw new IllegalArgumentException("Unknown subscription period");
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, h value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        throw new UnsupportedOperationException("Serialization not supported");
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f593b;
    }
}
